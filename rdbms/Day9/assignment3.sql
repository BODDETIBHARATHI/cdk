CREATE OR REPLACE FUNCTION reporting(empcount number)
RETURN number 
IS 
   total number(2) := 0; 
BEGIN 
   SELECT count(*) into total 
   FROM emp 
   where mgr=empcount; 
    
   RETURN total; 
END; 
/ 



DECLARE
 v_mgr emp.mgr%TYPE := &mgr;
 mytotal number(4);
BEGIN
  mytotal := reporting(v_mgr);
  dbms_output.put_line(' Number of employees reporting to ' || v_mgr|| ' are '||mytotal );
END;
/
