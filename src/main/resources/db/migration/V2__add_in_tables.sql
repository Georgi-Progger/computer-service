INSERT INTO devices (id, device_name, technical_specifications, system_and_application_software, location, responsible_user, accountable_person, inventory_number, last_inventory_date) VALUES
(1, 'Laptop A', 'Specs A', 'Windows 10', 'Office 101', 'User A', 'Person A', 'INV001', '2023-01-10'),
(2, 'Printer B', 'Specs B', 'Driver v1.2', 'Office 102', 'User B', 'Person B', 'INV002', '2023-02-15'),
(3, 'Server C', 'Specs C', 'Ubuntu Server 20.04', 'Data Center 1', 'User C', 'Person C', 'INV003', '2023-03-20'),
(4, 'Workstation D', 'Specs D', 'Windows 10 Pro', 'Office 103', 'User D', 'Person D', 'INV004', '2023-04-25'),
(5, 'Tablet E', 'Specs E', 'iOS 14', 'Office 104', 'User E', 'Person E', 'INV005', '2023-05-30');


INSERT INTO department (id, device_id, department_name) VALUES
(1, 1, 'IT'),
(2, 2, 'Finance'),
(3, 3, 'Operations'),
(4, 4, 'HR'),
(5, 5, 'Marketing');


INSERT INTO device_type (id, device_id, device_type_name) VALUES
(1, 1, 'Laptop'),
(2, 2, 'Printer'),
(3, 3, 'Server'),
(4, 4, 'Desktop'),
(5, 5, 'Tablet');



INSERT INTO network_properties (id, device_id, ip_address, mac_address, network_connection) VALUES
(1, 1, '192.168.1.2', '00:1B:44:11:3A:B7', 'Wired'),
(2, 2, '192.168.1.3', '00:1B:44:11:3A:B8', 'Wireless'),
(3, 3, '192.168.1.4', '00:1B:44:11:3A:B9', 'Wired'),
(4, 4, '192.168.1.5', '00:1B:44:11:3A:BA', 'Wired'),
(5, 5, '192.168.1.6', '00:1B:44:11:3A:BB', 'Wireless');


INSERT INTO repair_requests (id, device_id, problem_description, request_submission_date, request_status) VALUES
(1, 1, 'Battery not charging', '2023-06-01', 'Open'),
(2, 2, 'Paper jam', '2023-06-05', 'Resolved'),
(3, 3, 'Hard drive failure', '2023-06-10', 'Open'),
(4, 4, 'OS not booting', '2023-06-15', 'In Progress'),
(5, 5, 'Screen cracked', '2023-06-20', 'Resolved');


INSERT INTO software_installation_requests (id, device_id, required_software_description, request_submission_date, request_status) VALUES
(1, 1, 'Microsoft Office Suite', '2023-07-01', 'Open'),
(2, 2, 'Adobe Acrobat Reader', '2023-07-06', 'Completed'),
(3, 3, 'MySQL Server', '2023-07-11', 'Open'),
(4, 4, 'Python 3.8', '2023-07-16', 'In Progress'),
(5, 5, 'Zoom', '2023-07-21', 'Completed');


INSERT INTO acquisition_requests (id, required_equipment_or_software_description, request_submission_date, request_status) VALUES
                                                                                                                               (1, 'New high-speed printer', '2023-08-01', 'Open'),
                                                                                                                               (2, '5 licenses of Adobe Photoshop', '2023-08-06', 'Pending Approval'),
                                                                                                                               (3, '10 TB NAS storage', '2023-08-11', 'Approved'),
                                                                                                                               (4, '5 new laptops for IT department', '2023-08-16', 'Denied'),
                                                                                                                               (5, 'Annual subscription of Office 365', '2023-08-21', 'Approved');


INSERT INTO users (id, first_name, last_name, email, department_id) VALUES
                                                                        (1, 'John', 'Doe', 'john.doe@example.com', 1),
                                                                        (2, 'Jane', 'Doe', 'jane.doe@example.com', 2),
                                                                        (3, 'Jim', 'Beam', 'jim.beam@example.com', 3),
                                                                        (4, 'Jack', 'Daniels', 'jack.daniels@example.com', 4),
                                                                        (5, 'Johnny', 'Walker', 'johnny.walker@example.com', 5);


INSERT INTO responsibility_persons (id, person_name, position, department) VALUES
                                                                               (1, 'Alice Smith', 'Manager', 'IT'),
                                                                               (2, 'Bob Johnson', 'Director', 'Finance'),
                                                                               (3, 'Carol Williams', 'Head', 'Operations'),
                                                                               (4, 'Dave Wilson', 'Coordinator', 'HR'),
                                                                               (5, 'Eve Brown', 'Lead', 'Marketing');


