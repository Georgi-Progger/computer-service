CREATE TABLE IF NOT EXISTS devices (
    device_id INT PRIMARY KEY,
    device_name VARCHAR(255),
    technical_specifications VARCHAR(255),
    system_and_application_software VARCHAR(255),
    location VARCHAR(255),
    responsible_user VARCHAR(255),
    accountable_person VARCHAR(255),
    inventory_number VARCHAR(255),
    last_inventory_date DATE
    );

CREATE TABLE IF NOT EXISTS department (
    department_id INT PRIMARY KEY,
    device_id INT,
    department_name VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(device_id)
    );

CREATE TABLE IF NOT EXISTS device_type (
    device_type_id INT PRIMARY KEY,
    device_id INT,
    device_type_name VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(device_id)
    );

CREATE TABLE IF NOT EXISTS network_properties (
    network_properties_id INT PRIMARY KEY,
    device_id INT,
    ip_address VARCHAR(255),
    mac_address VARCHAR(255),
    network_connection VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(device_id)
    );

CREATE TABLE IF NOT EXISTS repair_requests (
    request_id INT PRIMARY KEY,
    device_id INT,
    problem_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(device_id)
    );

CREATE TABLE IF NOT EXISTS software_installation_requests (
    software_installation_requestst_id INT PRIMARY KEY,
    device_id INT,
    required_software_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(device_id)
    );

CREATE TABLE IF NOT EXISTS acquisition_requests (
    acquisition_requests_id INT PRIMARY KEY,
    required_equipment_or_software_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS users (
    user_id INT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
    );

CREATE TABLE IF NOT EXISTS responsibility_persons (
    responsibility_persons_id INT PRIMARY KEY,
    person_name VARCHAR(255),
    position VARCHAR(255),
    department VARCHAR(255)
);
