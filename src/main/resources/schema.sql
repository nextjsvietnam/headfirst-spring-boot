CREATE TABLE IF NOT EXISTS users (
                                     id SERIAL PRIMARY KEY,
                                     username VARCHAR(50) NOT NULL UNIQUE,
                                     email VARCHAR(50) NOT NULL UNIQUE,
                                     password VARCHAR(50) NOT NULL,
                                     firstName VARCHAR(50) NOT NULL,
                                     lastName VARCHAR(50) NOT NULL
);
