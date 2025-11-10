# 71
/* Write a SQL query to list employee names and department names for employees with a salary greater than 2000 using INNER JOIN.


+-------+------------+
| ename | dname      |
+-------+------------+
*/
USE test; 

select e.ename, d.dname from emp e join dept d on e.deptno=d.deptno where e.sal > 2000;


# 72

/* Write a SQL query to retrieve all employees and their department locations, 
including those without departments, using LEFT JOIN.

+--------+----------+
| ename  | location |
+--------+----------+
*/
USE test; 

select e.ename, d.location from emp e left join dept d on e.deptno = d.deptno;

# 73

/* Write a SQL query to list all department numbers, department names and their 
employee counts, including departments with no employees, using RIGHT JOIN.

+--------+------------+-----------+
| deptno | dname      | emp_count |
+--------+------------+-----------+
*/
USE test; 

select d.deptno, d.dname, count(empno) as emp_count from emp e right join dept d on e.deptno=d.deptno group by d.deptno;

# 74

/* Write a SQL query to simulate a FULL OUTER JOIN to list all employees and 
departments, including unmatched rows.

+-------+--------+--------+------------+
| empno | ename  | deptno | dname      |
+-------+--------+--------+------------+
*/
USE test; 

select e.empno, e.ename, d.deptno, d.dname from emp e left join dept d on e.deptno=d.deptno 
union select e.empno, e.ename, d.deptno, d.dname from emp e right join dept d on e.deptno=d.deptno ;

# 75

/* Write a SQL query to find employees who are managers of other employees using 
a self-join.
    //print the name
+---------+
| manager |
+---------+
*/
USE test; 

# 76

/* Write a SQL query to generate all possible employee-department combinations 
using CROSS JOIN.

+--------+------------+
| ename  | dname      |
+--------+------------+
*/
USE test; 


# 77

/* Write a SQL query to list departments with employees earning more than 2500 
using EXISTS.

+--------+------------+
| deptno | dname      |
+--------+------------+
*/
USE test; 

# 78

/* Write a SQL query to find departments with number of employees earning less 
than 1000 using NOT EXISTS.

+------------+--------+
| dname      | deptno |
+------------+--------+
*/
USE test; 

# 79

/* Write a SQL query to find managers and the number of employees they manage in
departments located in 'New York', using the primary key and foreign key 
constraints.

+--------------+-----------+
| manager_name | emp_count |
+--------------+-----------+
*/
USE test; 

# 80

/* Write a SQL query to list all employees and departments, including those 
without matches, using a simulated FULL JOIN.


+-------+--------+--------+------------+----------+
| empno | ename  | deptno | dname      | location |
+-------+--------+--------+------------+----------+
*/
USE test; 

# 81

/* Write a SQL query to list employee names and department names where the 
department is in 'Chicago' using INNER JOIN.

+-------+-------+
| ename | dname |
+-------+-------+
*/
USE test; 

# 82

/* 
Retrieve Department-wise Total Salary and Number of Employees (Using GROUP BY and JOIN)

+------------+---------------+--------------+
| dname      | num_employees | total_salary |
+------------+---------------+--------------+

*/
USE test; 

# 83

/* Write a SQL query to list departments with no assigned employees using 
RIGHT JOIN.

+--------+---------+
| deptno | dname   |
+--------+---------+

*/
USE test; 

# 84

/* Write a SQL query to combine employee and department data with duplicates 
using UNION ALL.


+--------+------------+
| ename  | dname      |
+--------+------------+

*/
USE test; 

# 85

/* Write a SQL query to list employees and their managers’ names using a LEFT 
JOIN for employees without managers.

+----------+---------+
| employee | manager |
+----------+---------+

*/
USE test; 

# 86

/* Write a SQL query to retrieve average salaries per department using INNER 
JOIN and GROUP BY.

+--------+------------+-------------+
| deptno | dname      | avg_salary  |
+--------+------------+-------------+

*/
USE test; 

# 87 

/* Write a SQL query to find departments with more than 3 employees using 
INNER JOIN and HAVING.

+--------+----------+-----------+
| deptno | dname    | emp_count |
+--------+----------+-----------+

*/
USE test; 

# 88

/* Write a SQL query to list employees and departments where the employee’s 
hire date is after 1980 using INNER JOIN.

+--------+------------+------------+
| ename  | dname      | hiredate   |
+--------+------------+------------+
*/
USE test; 

# 89

/* 
Find Departments Without Employees (Using LEFT JOIN and NULL Check)

+------------+----------+
| Department | Location |
+------------+----------+


*/
USE test; 


# 90

/* Write a SQL query to list employee names and department names using an
implicit join, ordered by employee name.

+--------+------------+
| ename  | dname      |
+--------+------------+

*/
USE test; 

