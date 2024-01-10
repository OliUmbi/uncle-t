DROP TABLE IF EXISTS person;
CREATE TABLE person
(
    id       UUID         NOT NULL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    active   BOOLEAN      NOT NULL
);

DROP TABLE IF EXISTS text;
CREATE TABLE text
(
    id      UUID NOT NULL PRIMARY KEY,
    german  TEXT NOT NULL,
    english TEXT NOT NULL
);

DROP TABLE IF EXISTS image;
CREATE TABLE image
(
    id               UUID    NOT NULL PRIMARY KEY,
    description_text UUID    NOT NULL REFERENCES text (id),
    width            INTEGER NOT NULL,
    height           INTEGER NOT NULL
);

DROP TABLE IF EXISTS image_variation;
CREATE TABLE image_variation
(
    id           UUID         NOT NULL PRIMARY KEY,
    parent_image UUID         NOT NULL REFERENCES image (id),
    type_enum    VARCHAR(255) NOT NULL, -- jpg, png, avif
    size_enum    VARCHAR(255) NOT NULL  -- 320 = XS, 640 = S, 960 = M, 1280 = L, 1600 = XL
);

DROP TABLE IF EXISTS course;
CREATE TABLE course
(
    id               UUID         NOT NULL PRIMARY KEY,
    title_text       UUID         NOT NULL REFERENCES text (id),
    description_text UUID         NOT NULL REFERENCES text (id),
    date             DATE         NOT NULL,
    from             TIME         NOT NULL,
    to               TIME         NOT NULL,
    location         VARCHAR(255) NOT NULL,
    price            FLOAT        NOT NULL,
    slots_total      INTEGER      NOT NULL,
    slots_booked     INTEGER      NOT NULL,
    status_enum      VARCHAR(255) NOT NULL -- IN_PREPARATION, PUBLISHED, ARCHIVED
);

DROP TABLE IF EXISTS course_request;
CREATE TABLE course_request
(
    id            UUID         NOT NULL PRIMARY KEY,
    origin_course UUID         NOT NULL REFERENCES course (id),
    name          VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    phone         VARCHAR(255) NOT NULL,
    people        INTEGER      NOT NULL,
    note          VARCHAR(255) NULL,
    status_enum   VARCHAR(255) NOT NULL -- OPEN, HANDLED, ARCHIVED
);

DROP TABLE IF EXISTS catering_request;
CREATE TABLE catering_request
(
    id          UUID         NOT NULL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL,
    phone       VARCHAR(255) NOT NULL,
    people      INTEGER      NOT NULL,
    date        DATE         NOT NULL,
    from        TIME         NOT NULL,
    to          TIME         NOT NULL,
    location    VARCHAR(255) NOT NULL,
    note        VARCHAR(255) NULL,
    status_enum VARCHAR(255) NOT NULL -- OPEN, HANDLED, ARCHIVED
);

DROP TABLE IF EXISTS private_request;
CREATE TABLE private_request
(
    id          UUID         NOT NULL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL,
    phone       VARCHAR(255) NOT NULL,
    note        VARCHAR(255) NULL,
    status_enum VARCHAR(255) NOT NULL -- OPEN, HANDLED, ARCHIVED
);

DROP TABLE IF EXISTS review;
CREATE TABLE review
(
    id            UUID          NOT NULL PRIMARY KEY,
    name          VARCHAR(255)  NOT NULL,
    message       VARCHAR(4095) NOT NULL,
    date          DATE          NOT NULL,
    category_enum VARCHAR(255)  NOT NULL, -- PRIVATE, CATERING, COURSE
    status_enum   VARCHAR(255)  NOT NULL  -- OPEN, PUBLISHED, REMOVED
);
