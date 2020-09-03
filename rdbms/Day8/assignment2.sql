select ename,job from emp where job='CLERK';

select ename,job from emp where job in ('ANALYST','CLERK');

select ename from emp order by ename;

select distinct job from emp;

select e.ename,d.loc from dept d, emp e where d.deptno = e.deptno;

select dname from dept where deptno>20;

select * from emp where ename like '%R';

select e.ename,e.job,d.dname from emp e, dept d where e.deptno = d.deptno and e.ename like 'A%' or ename like 'B%';

select max(e1.sal) - min(e2.sal) from emp e1, emp e2 where e1.deptno=10 and e2.deptno=20;

select deptno,count(deptno) from emp group by deptno having count(deptno)=(select max(count(deptno)) from emp group by deptno);

select avg(e1.sal), avg(e2.sal) from emp e1, emp e2 where e1.deptno=30 and e2.deptno=20;

select ename,comm from emp where comm>(sal*0.05);

select * from emp where sal< (select avg(sal) from emp where deptno=20);

select e1.empno, e1.ename, e1.job, e1.mgr, e2.empno, e2.ename,e2.job from Emp e1, Emp e2 where e1.mgr = e2.empno;

select empno,ename from emp where empno not in (select distinct e1.mgr from emp e1,emp e2 where e1.mgr=e2.empno);

select mgr,count(mgr) from emp group by mgr having count(mgr)=(select max(count(mgr)) from emp group by mgr);

select e1.ename as "Earliest Person",e2.ename as "Latest Person" from emp e1,emp e2 where e1.hiredate = (select min(hiredate) from emp) and e2.hiredate = (select max(hiredate) from emp);

select * from emp where mgr = (select empno from emp where ename = 'BLAKE');

create table bonus(name varchar(20), job varchar(20), salary number(7));
insert into bonus value(select ename,job,sal from emp where job in ('ANALYST', 'MANAGER'));

insert into dept values(50,'EDUCATION','INDIA');

select distinct d.dname from dept d, emp e where d.deptno not in (select distinct deptno from emp);

select empno||ename||mgr from emp;

update emp set mgr=(select empno from emp where ename='BLAKE') where ename='CLARK';

insert into emp values (9999,'HENRY','TURNER',7782,TO_DATE('17/12/2015', 'DD/MM/YYYY'),1500,0,40);

SELECT * FROM emp WHERE to_char(hiredate, 'mon')='dec';

SELECT * FROM emp WHERE to_char(hiredate, 'yy')=80;
select * from emp where hiredate between '01-jan-80' and '31-dec-80';
