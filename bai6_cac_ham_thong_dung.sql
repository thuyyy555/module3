select *
from subject
where credit in (
select max(credit)
from subject);

select *
from subject
join mark
on mark.SubId = subject.SubId
where mark in (
select max(mark)
from mark);

select mark.SubId, student.StudentId, student.StudentName, avg(mark.Mark)
from student
join mark
on mark.StudentId = student.StudentId
group by student.StudentId
order by mark.Mark desc;
