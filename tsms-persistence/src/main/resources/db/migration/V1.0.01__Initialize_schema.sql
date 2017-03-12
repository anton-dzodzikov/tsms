create sequence id_seq;

create table projects (
    id          integer primary key not null default nextval('id_seq'),
    name        varchar not null unique,
    description varchar
);

create table project_versions (
    id         integer primary key not null default nextval('id_seq'),
    name       varchar not null,
    project_id integer not null references projects(id)
);

create table suites (
    id          integer primary key not null default nextval('id_seq'),
    name        varchar not null,
    description varchar,
    project_id  integer not null references projects(id)
);

create table test_cases (
    id       integer primary key not null default nextval('id_seq'),
    name     varchar not null,
    suite_id integer not null references suites(id)
);

create table steps (
    id              integer primary key not null default nextval('id_seq'),
    "order"         integer not null,
    action          varchar not null,
    expected_result varchar not null,
    test_case_id    integer not null references test_cases(id)
);

create table suite_runs (
    id                 integer primary key not null default nextval('id_seq'),
    status             varchar not null,
    project_version_id integer not null references project_versions(id),
    suite_id           integer not null references suites(id)
);

create table test_case_runs (
    id           integer primary key not null default nextval('id_seq'),
    status       varchar not null,
    test_case_id integer not null references test_cases(id),
    suite_run_id integer not null references suite_runs(id)
);

create table step_runs (
    id               integer primary key not null default nextval('id_seq'),
    status           varchar not null,
    actual_result    varchar,
    step_id          integer not null references steps(id),
    test_case_run_id integer not null references test_case_runs(id)
);