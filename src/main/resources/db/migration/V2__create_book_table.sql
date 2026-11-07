
CREATE TABLE books (
    id VARCHAR(26) PRIMARY KEY,

    title VARCHAR(200) NOT NULL,
    isbn VARCHAR(20) NOT NULL,
    description TEXT,
    publication_date DATE,
    language VARCHAR(50),
    pages INTEGER,
    genre VARCHAR(100),
    price NUMERIC(12, 2),

    author_id VARCHAR(26) NOT NULL,

    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,

    CONSTRAINT uq_books_isbn UNIQUE (isbn),

    CONSTRAINT fk_books_author
        FOREIGN KEY (author_id)
        REFERENCES authors(id),

    CONSTRAINT chk_books_pages
        CHECK (pages IS NULL OR pages > 0),

    CONSTRAINT chk_books_price
        CHECK (price IS NULL OR price >= 0)
);

CREATE INDEX idx_books_author_id
    ON books (author_id);
