-- schema owner
CREATE USER postgres WITH password 'postgres';

-- schema user
CREATE USER postgres_ms WITH password 'postgres_ms';

-- create schema
CREATE SCHEMA testSc AUTHORIZATION postgres;

GRANT USAGE ON SCHEMA testSc TO postgres_ms;

ALTER DEFAULT PRIVILEGES FOR USER postgres IN SCHEMA testSc GRANT SELECT, INSERT, UPDATE, DELETE, TRUNCATE ON TABLES TO postgres_ms;
ALTER DEFAULT PRIVILEGES FOR USER postgres IN SCHEMA testSc GRANT USAGE ON SEQUENCES TO postgres_ms;
ALTER DEFAULT PRIVILEGES FOR USER postgres IN SCHEMA testSc GRANT EXECUTE ON FUNCTIONS TO postgres_ms;

alter user postgres_ms set search_path = 'testSc';