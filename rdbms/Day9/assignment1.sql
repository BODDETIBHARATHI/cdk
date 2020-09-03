DECLARE
 v_loc dept.loc%TYPE := &loc;
BEGIN
  delete from dept where loc = v_loc;
  dbms_output.put_line('Deleted ...');
END;
/
