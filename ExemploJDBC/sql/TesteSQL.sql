DROP database if exists db;

CREATE database db;
USE db;

CREATE table UsuarioTabela (
	ID_Usuario int auto_increment PRIMARY KEY,
    Nome_Usuario varchar (30),
    Senha_Usuario varchar (30)
);

INSERT into UsuarioTabela (Nome_Usuario, Senha_Usuario) 
	VALUES 
    ("Rain", "AlienRomulus"),
    ("Gabriel", "Possato123");
    
SELECT * from UsuarioTabela;