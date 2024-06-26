import React, {useState,useEffect} from 'react'
import { listEmployees } from '../services/EmployeeService';
import {useNavigate} from 'react-router-dom'

const ListEmployeeComponent = () => {
 
    const [employees, setEmployees] = useState([]);

    const navigator = useNavigate();

    useEffect(() => {
      listEmployees().then((response) => {
          setEmployees(response.data);
      }).catch(error => {
           console.error(error)
      })
    }, [])

    function addNewEmployee(){
      navigator('/addemployee')
    }
    
    return (
      <div className='container'>
        <h2 className='text-center'>List of Employees</h2>
        <button className='btn btn-primary mb-2' onClick={addNewEmployee}>AddEmployee</button>
        <table className='table table-striped table-bordered'>
          <thead>
            <tr>
              <th>Employee Id</th>
              <th>Employee First Name</th>
              <th>Employee Last Name</th>
              <th>Employee Email Id</th>
            </tr>
          </thead>
          <tbody>
            {
              employees.map(employee =>
                <tr key={employee.id}>
                    <td>{employee.id}</td>
                    <td>{employee.firstName}</td>
                    <td>{employee.lastName}</td>
                    <td>{employee.email}</td>
                </tr>) 
            }
          </tbody>
        </table>
      </div>
    )
  
}


export default ListEmployeeComponent;