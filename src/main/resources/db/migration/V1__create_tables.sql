CREATE TABLE IF NOT EXISTS devices (
    id INT PRIMARY KEY,
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
    id INT PRIMARY KEY,
    device_id INT,
    department_name VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(id)
);

CREATE TABLE IF NOT EXISTS device_type (
    id INT PRIMARY KEY,
    device_id INT,
    device_type_name VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(id)
);

CREATE TABLE IF NOT EXISTS network_properties (
    id INT PRIMARY KEY,
    device_id INT,
    ip_address VARCHAR(255),
    mac_address VARCHAR(255),
    network_connection VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(id)
);

CREATE TABLE IF NOT EXISTS repair_requests (
    id INT PRIMARY KEY,
    device_id INT,
    problem_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(id)
);

CREATE TABLE IF NOT EXISTS software_installation_requests (
    id INT PRIMARY KEY,
    device_id INT,
    required_software_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255),
    FOREIGN KEY (device_id) REFERENCES devices(id)
);

CREATE TABLE IF NOT EXISTS acquisition_requests (
    id INT PRIMARY KEY,
    required_equipment_or_software_description VARCHAR(255),
    request_submission_date DATE,
    request_status VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE IF NOT EXISTS responsibility_persons (
    id INT PRIMARY KEY,
    person_name VARCHAR(255),
    position VARCHAR(255),
    department VARCHAR(255)
);
