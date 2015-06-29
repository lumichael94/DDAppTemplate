CREATE KEYSPACE IF NOT EXISTS test WITH replication = {
  'class': 'SimpleStrategy',
  'replication_factor': '1'
};

USE test;

CREATE TABLE IF NOT EXISTS hello (
  greeting TEXT,
  name TEXT,
  PRIMARY KEY (greeting)
);

INSERT INTO hello (greeting, name) VALUES ('hello', 'world');
INSERT INTO hello (greeting, name) VALUES ('hola', 'mundo');
