CREATE TABLE account (
  account_id integer primary key,
  account_name varchar(30) not null
);
CREATE TABLE account_trans (
  account_trans_id integer primary_key,
  trans_date date not null,
  amount numeric(11,2) not null,
  debit_account_id integer not null references account,
  credit_account_id integer not null references account
);