DECLARE
 v_deptno dept.deptno%TYPE :=&deptno;
 v_dname dept.dname%TYPE  := &dname;
 v_loc dept.loc%TYPE := &loc;
BEGIN
  update dept set dname = v_dname , loc = v_loc where deptno = v_deptno;
  dbms_output.put_line('Inserted ...');
END;
/
