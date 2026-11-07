create  TABLE  authors(

    id  VARCHAR(26) PRIMARY KEY,
    first_name  VARCHAR (100) NOT  NULL,
    last_name  VARCHAR (100)  NOT  NULL,
    biography  TEXT , 
    birth_date  DATE ,
    nationality VARCHAR(100),
    email VARCHAR(255),

    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ

)