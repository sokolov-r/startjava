CREATE TABLE Jaegers (
	id          SERIAL PRIMARY KEY,
	modelName   TEXT,
	mark        CHAR(1),
	height      INTEGER,
	weight      INTEGER,
	status      TEXT,
	origin      TEXT,
	launch      DATE,
	kaijuKill   INTEGER
);