USE QuanLySinhVien;

select * 
from student
where substring_index(StudentName," ",-1) like 'h%';

select * 
from class
where month(StartDate) = 12; 

select * 
from subject
where credit >=3 && credit <=5;

update student
set ClassId = 2
where StudentName = "Hung";

select StudentName, SubName, Mark
from student
join mark
on student.StudentId=mark.StudentId
join subject
on subject.SubId = mark.SubId
order by mark.Mark;
