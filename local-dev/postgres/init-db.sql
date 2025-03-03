-- Create the database
CREATE DATABASE lucas;

-- Create the user
CREATE USER lucas WITH ENCRYPTED PASSWORD 'lucas';

-- Grant privileges on the database to the user
GRANT ALL PRIVILEGES ON DATABASE lucas TO lucas;