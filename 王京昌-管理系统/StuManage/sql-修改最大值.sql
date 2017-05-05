select max(sal) from emp;
update emp set sal=(select max(sal) from emp)/0.7 where empno in(select empno from emp where sal=(select max(sal) from emp)); 
savepoint a;
commit;
rollback
