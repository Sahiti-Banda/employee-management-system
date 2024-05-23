import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:9094/employees';

const REST_API_BASE_URL_1 = 'http://localhost:9094/addemployee';

export const listEmployees =() => axios.get(REST_API_BASE_URL);

export const createEmployee=(employee) => axios.post(REST_API_BASE_URL_1, employee);