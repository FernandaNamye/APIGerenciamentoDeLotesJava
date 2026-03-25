CREATE DATABASE IF NOT EXISTS Gerenciamento_Lotes;
USE Gerenciamento_Lotes;

CREATE TABLE IF NOT EXISTS dados (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    lote INT,
    tipo VARCHAR(100),
    cor INT,
    nºmétrico FLOAT,
    operador VARCHAR(100),
    data_registro DATETIME DEFAULT CURRENT_TIMESTAMP
);