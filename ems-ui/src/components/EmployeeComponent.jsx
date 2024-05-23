import React, { useState, useEffect } from 'react';
import {  useNavigate, useParams  } from 'react-router-dom';
import {createEmployee, listEmployees} from '../services/EmployeeService';


  export const EmployeeComponent = () => {

    const [firstName, setFirstName] = useState('')
    const [lastName, setLastName] = useState('')
    const [email, setEmail] = useState('')
    const [employee, setEmp] = useState([]);

    const navigator = useNavigate();

    function saveEmployee(e){
        e.preventDefault();

        const employee = {firstName, lastName, email };
        console.log(employee);

        createEmployee(employee)
            .then(()=>{
                return listEmployees();
            })
            .then((response) => {
                setEmp(response.data);
                console.log(response.data);
                navigator('/employees')
                
            })
            .catch((error) => {
            console.error(error);
            });
    }

    return (
        <div className='container'>
            <br /> <br />
            <div className='row'>
                <div className='card col-md-6 offset-md-3'>
                    <h2 className='text-center'>Add Employee</h2>
                    <div className='card-body'>
                        <form>
                            <div className='form-group mb-2'>
                                <label className='form-label'>First Name:</label>
                                <input
                                    type='text'
                                    placeholder='Enter Employee First Name'
                                    name='firstName'
                                    value={firstName}
                                    className ='form-control'
                                    onChange={(e) => setFirstName(e.target.value)}
                                >
                                </input>
                            </div>

                            <div className='form-group mb-2'>
                                <label className='form-label'>Last Name:</label>
                                <input
                                    type='text'
                                    placeholder='Enter Employee Last Name'
                                    name='lastName'
                                    value={lastName}
                                    className ='form-control'
                                    onChange={(e) => setLastName(e.target.value) }
                                >
                                </input>
                            </div>

                            <div className='form-group mb-2'>
                                <label className='form-label'>Email:</label>
                                <input
                                    type='text'
                                    placeholder='Enter Employee Email'
                                    name='email'
                                    value={email}
                                    className='form-control'
                                    onChange={(e) => setEmail(e.target.value)}
                                >
                                </input>
                            </div>
                            <button className='btn btn-success' onClick={saveEmployee}>Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    )
}

