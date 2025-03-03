CREATE TABLE users (
       id UUID PRIMARY KEY,
       number VARCHAR(50) NOT NULL UNIQUE,
       password VARCHAR(100) NOT NULL,
       role VARCHAR(100) NOT NULL,
       enabled BOOLEAN NOT NULL
);