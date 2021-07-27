CREATE KEYSPACE Toy
WITH replication = {'class' : 'SimpleStrategy', 'replication_factor' : 3}
AND durable_writes = true;

use toy;

CREATE TABLE toy(
    id uuid,
    name text,
    price decimal,
    description text,
    PRIMARY KEY (id)
);