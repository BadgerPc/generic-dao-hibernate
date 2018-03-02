-- Create table --

CREATE TABLE employee
(
  id bigserial NOT NULL,
  firstname character varying(50),
  lastname character varying(50),
  designation character varying(50),
  salary integer,
  CONSTRAINT employee_pk PRIMARY KEY (id)
);


-- Insert Data --- 

INSERT INTO employee(
            firstname, lastname, designation, salary)
    VALUES ('Employee1', 'Last1', 'Senior Developer', 1400);
INSERT INTO employee(
            firstname, lastname, designation, salary)
    VALUES ('Employee2', 'Last2', 'Developer', 1200);
    INSERT INTO employee(
            firstname, lastname, designation, salary)
    VALUES ('Employee3', 'Last3', 'Senior Developer', 1500);