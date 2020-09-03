DECLARE
 CURSOR c_dept IS  select deptno, dname, loc from Dept;
 v_deptno dept.deptno%TYPE ;
 v_dname dept.dname%TYPE  ;
 v_loc dept.loc%TYPE ;
 v_ename emp.ename%TYPE;
 flag number(1);
 	 CURSOR c_emp IS select distinct ename from emp e where deptno=v_deptno;
begin
    dbms_output.put_line('Dept      Dname      loc'); 
	OPEN c_dept; 


	
	LOOP 
		FETCH c_dept INTO v_deptno, v_dname,v_loc;
			OPEN c_emp;
          flag:=0;
		EXIT WHEN c_dept%notfound; 
		dbms_output.put_line(v_deptno || '      ' ||v_dname || '      ' || v_loc); 
		LOOP 
		    FETCH c_emp INTO v_ename;
			If c_emp%found and flag=0 then 
		        dbms_output.put_line('Employees working in  '); 
		END IF;
			EXIT WHEN c_emp%notfound;
			          IF c_emp%found = true THEN 
					  			--dbms_output.put_line(c_emp);

                          	dbms_output.put_line(v_ename); 
							flag:=1;
					  ELSIF c_emp%rowcount = 0 THEN 
					       dbms_output.put_line('Employee not found'); 
                      END IF;
                 
		END LOOP;
		If c_emp%notfound and flag=0 then 
		        dbms_output.put_line('Employee not found'); 
		END IF;
		CLOSE c_emp;
		
	END LOOP; 
	CLOSE c_dept;
END;
/
