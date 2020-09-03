create table person (personid number primary key, personname varchar(20),city varchar(10), state varchar(10), bdate date, aadharnumber number(12), pannumber varchar(10));

insert into person values(1,'bharathi','hyderabad','telangana',TO_DATE('02/09/1998', 'DD/MM/YYYY'),123654789012,'EUIWE1245');

insert into person values(2,'surya','hyderabad','telangana',TO_DATE('01/08/1989', 'DD/MM/YYYY'),789456133012,'EUIWE3467');

insert into person values(3,'ganesh','vizag','andhra',TO_DATE('17/12/1992', 'DD/MM/YYYY'),963025874102,'TRUY7845');

insert into person values(4,'manasa','bangalore','karnataka',TO_DATE('17/12/1994', 'DD/MM/YYYY'),457812369056,'WERF4589');

insert into person values(5,'abcd','bangalore','karnataka',TO_DATE('17/12/1994', 'DD/MM/YYYY'),457812369056,'WERF4589');

update person set city='chennai',state='tamilnadu',bdate=TO_DATE('17/12/1992', 'DD/MM/YYYY'), aadharnumber=987456321056, pannumber='TRUY7845' where personid=3;

update person set state='TELANGANA' where city='hyderabad';

delete from person where personid=5;

delete from person where city='hyderabad';
