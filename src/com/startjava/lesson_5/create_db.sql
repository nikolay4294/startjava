CREATE DATABASE Jaegers;

CREATE TABLE jaeger (
	id SERIAL PRIMARY KEY, 
	modelName TEXT,                    									
	mark CHAR(6), 												
	height NUMERIC(4,2), 											
	weight NUMERIC(4,3), 											
	status TEXT, 												
	origin TEXT, 												
	launch INTEGER, 											
	kaijuKill INTEGER);