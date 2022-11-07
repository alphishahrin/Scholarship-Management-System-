Create Database Scholarship
Use Scholarship

Create Table Student(
     StudentID int IDENTITY(1,1) PRIMARY KEY,
	 FirstName varchar (50) NOT NULL,
	 LastName varchar (50) NOT NULL,
	 Department varchar (25) NOT NULL,
	 Session varchar(10),
	 Year int NOT NULL CHECK(Year<5),
	 Semester int NULL CHECK(Semester<3),
	 Email varchar (50) NOT NULL UNIQUE,
	 AverageGrade float NOT NULL,
	 CompletedCredit float NOT NULL,
	 ExtracurricularActivities varchar(50),
	 Blog varchar(50),
	 Reference varchar (50),
	 Password varchar(20)
)

Select * from Student

Create Table Interest(
    StudentId int NOT NULL FOREIGN KEY REFERENCES Student(StudentID),
    TopicName varchar(50) Not null,
    Reason nvarchar (300)
)
Select * from Expertise

Create Table Expertise(
     StudentID int NOT NULL FOREIGN KEY REFERENCES Student(StudentID),
	 TopicName varchar(50),
	 CertificateName varchar(50) NOT NULL,
	 Institution varchar(70) NOT NULL,
)

Create Table CourseResult(
     StudentId int FOREIGN KEY REFERENCES Student(StudentID),
     CourseName varchar (50) NOT NULL,
     Grade float NOT NULL,
     Year int NOT NULL CHECK(Year<5),
	 Semester int NULL CHECK(Semester<3)
)

Create Table University(
UniID int IDENTITY(1001,1) PRIMARY KEY,
UniName varchar(50),
UniRating float,
Location varchar(50)
)

Select * from University

Create table Professor(
     ProfID int IDENTITY(1001,1) PRIMARY KEY,
	 FirstName varchar (50) NOT NULL,
	 Email varchar(50),
	 EducationalBackground varchar(200) NOT NULL,
	 NoOfStudents int,
	 Funding varchar(20),
	 password varchar(20),
	 Picture varbinary(max),
	 Department varchar(50),
	 UniID int foreign key references University(UniId))


Select * from Professor

insert into Professor(FirstName, EducationalBackground) values ('sge','sdg')

Create table Scholarship(
     ScholarshipID int IDENTITY(001, 2) PRIMARY KEY,
	 DegreeName varchar(100) NOT NULL,
	 University varchar(200) NOT NULL,
	 CountryName varchar(50) NOT NULL,
	 Subject varchar(100) NOT NULL,
	 PercentageOfScholarship float NOT NULL,
	 Session varchar(100) NOT NULL,
	 Seats int NOT NULL,
	 MinimumGPA varchar(50) NOT NULL,
	 OtherRequirements varchar(300),
	 LastDate date
) 
Select * from Scholarship

Create table Author(
     StudentID int Foreign KEY REFERENCES Student(StudentID),
	 ProfID int FOREIGN KEY REFERENCES Professor(ProfID)
)

Create table ResearchPaper(
     DOI int Primary Key,
	 Title varchar(200) NOT NULL,
	 ProfID int NOT NULL foreign key references Professor(ProfID),
	 PageNO int NOT NULL,
	 Volume varchar(10),
	 PublicationDate date NOT NULL,
	 Publisher varchar(50)
)

Select * from ResearchPaper

Create table StudentMessage(
     MessageId int Identity(1,1) Primary Key,
     StudentId int Foreign Key References Student(StudentID) NOT NULL,
	 TextMessage varchar(200) NOT NULL,
	 ProfId int Foreign Key References Professor(ProfID) NOT NULL
)
Alter Table ResearchPaper Add Citation int;


Create Table ProfessorExpertise(
     ProfID int 
	 TopicName varchar(50),
	 Interest varchar(50)
)


Create table StudentResearchPaper(
     DOI int Primary Key,
	 Title varchar(50) NOT NULL,
	 StudentID int FOREIGN KEY REFERENCES Student(StudentID),
	 PageNO int NOT NULL,
	 Volume varchar(10),
	 PublicationDate date NOT NULL,
	 Publisher varchar(50),  
	 Citation int
)
Insert into StudentResearchPaper values (1,'Javascript',1,560,'third','2020-03-13','ABCD',10),
                                        (2,'Web Development',2,250,'second','2021-2-15','Visymo',5),
										(3,'MachineLearning',3,300,'fourth','2021-3-23','faljfj',5),
										(4,'Mern Stack Development',5,150,'second','2018-09-20','Joykoli',3),
										(6,'Machine Design',5,220,'third','2019-09-23','Avash',11),
										(8,'Architecture',3,210,'fifth','2015-07-01','Adios',7),
										(10,'Architecture',1,210,'fifth','2015-07-01','Adios',7)


Select * from Expertise
Select * from Interest
Select * from Professor
Select * from ProfessorExpertise
Select * from ResearchPaper
Select * from Scholarship
Select * from Student
Select * from StudentResearchPaper
Select * from CourseResult
Select * from StudentMessage
Select * from University





Select Professor.FirstName, Professor.Department, ResearchPaper.DOI, ResearchPaper.Title, 
       ResearchPaper.PageNO, ResearchPaper.Volume, ResearchPaper.PublicationDate, ResearchPaper.Publisher
From Professor INNER JOIN ResearchPaper 
On Professor.ProfID = ResearchPaper.ProfID


Select Student.FirstName, Student.Department, Student.Email, StudentMessage.TextMessage
From Student JOIN StudentMessage
On Student.StudentID = StudentMessage.StudentId

Select Student.*, StudentMessage.*
From Student JOIN StudentMessage
On Student.StudentID = StudentMessage.StudentId

--Joining Student and Research Paper
Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.AverageGrade, StudentResearchPaper.*
From Student INNER JOIN StudentResearchPaper
On Student.StudentID = StudentResearchPaper.StudentID

--Selecting Student with Most Research Paper
Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.AverageGrade, StudentResearchPaper.*
From Student INNER JOIN StudentResearchPaper On Student.StudentID = StudentResearchPaper.StudentID
where StudentResearchPaper.StudentID In (SELECT StudentID FROM StudentResearchPaper
GROUP BY StudentID HAVING count(*) = 
(select top 1 count(*) from StudentResearchPaper
group by StudentID order by count(*) desc))


--Joining Professor and Research Paper
Select Professor.ProfID, Professor.FirstName, Professor.Email, Professor.Department, ResearchPaper.*
From Professor INNER JOIN ResearchPaper
On Professor.ProfID = ResearchPaper.ProfID 


--Selecting Professor with Most Research Paper
Select Professor.ProfID, Professor.FirstName, Professor.Email, Professor.Department, ResearchPaper.*
From Professor INNER JOIN ResearchPaper On Professor.ProfID = ResearchPaper.ProfID 
where ResearchPaper.ProfID In (SELECT ProfID FROM ResearchPaper
GROUP BY ProfID HAVING count(*) = 
(select top 1 count(*) from ResearchPaper
group by ProfID order by count(*) desc))


--Select Professor with Department wise highest Citation
Select s.ProfID, s.FirstName, s.Email, s.Department, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation 
FROM Professor  AS s INNER JOIN ResearchPaper AS ss
ON (s.ProfID = ss.ProfID) INNER JOIN (Select p.Department as temp, MAX(ps.Citation) as MaxGrade
FROM Professor  AS p INNER JOIN ResearchPaper AS ps
ON (p.ProfID = ps.ProfID) GROUP BY p.Department ) dd ON (dd.temp=s.Department and dd.MaxGrade=ss.Citation)



--Select Professor with Name wise highest Citation
Select s.ProfID, s.FirstName, s.Email, s.Department, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation 
FROM Professor  AS s INNER JOIN ResearchPaper AS ss
ON (s.ProfID = ss.ProfID) INNER JOIN (Select p.FirstName as temp, MAX(ps.Citation) as MaxGrade
FROM Professor  AS p INNER JOIN ResearchPaper AS ps
ON (p.ProfID = ps.ProfID) GROUP BY p.FirstName ) dd ON (dd.temp=s.FirstName and dd.MaxGrade=ss.Citation)




--Joining Student and CourseResult
Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.Email, Student.AverageGrade, CourseResult.CourseName, CourseResult.Grade, CourseResult.Year, CourseResult.Semester
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId 
Order By Student.Department

--Select student with Department wise highest grade
Select s.StudentID, s.FirstName, s.Department, s.Session, s.Email, s.AverageGrade, ss.CourseName, ss.Grade, ss.Year, ss.Semester 
FROM Student  AS s INNER JOIN CourseResult AS ss
ON (s.StudentID = ss.StudentId) INNER JOIN (Select p.Department as temp, MAX(ps.Grade) as MaxGrade
FROM Student  AS p INNER JOIN CourseResult AS ps
ON (p.StudentID = ps.StudentId) GROUP BY p.Department ) dd ON (dd.temp=s.Department and dd.MaxGrade=ss.Grade)



--Select student with Session wise highest grade
Select s.StudentID, s.FirstName, s.Department, s.Session, s.Email, s.AverageGrade, ss.CourseName, ss.Grade, ss.Year, ss.Semester 
FROM Student  AS s INNER JOIN CourseResult AS ss
ON (s.StudentID = ss.StudentId) INNER JOIN (Select p.Session as temp, MAX(ps.Grade) as MaxGrade
FROM Student  AS p INNER JOIN CourseResult AS ps
ON (p.StudentID = ps.StudentId) GROUP BY p.Session ) dd ON (dd.temp=s.Session and dd.MaxGrade=ss.Grade)
Order By RIGHT(s.Session, 2) ASC


--Select Student Who Has More Grade Than a Specific Name
Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.Email, Student.AverageGrade, CourseResult.CourseName, CourseResult.Grade, CourseResult.Year, CourseResult.Semester
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId
Where CourseResult.Grade >= ALL (Select CourseResult.Grade From Student INNER JOIN CourseResult
                            On Student.StudentID = CourseResult.StudentId where FirstName = 'Stacy')


--Select Student Who Has More Grade Than Average Of a Specific Name
Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.Email, Student.AverageGrade, CourseResult.CourseName, CourseResult.Grade, CourseResult.Year, CourseResult.Semester
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId
Where CourseResult.Grade >= ALL (Select Avg(CourseResult.Grade) From Student INNER JOIN CourseResult
                            On Student.StudentID = CourseResult.StudentId where FirstName = 'Stacy')


-- Select Student With Course Wise Highest Grade
SELECT s.StudentID, s.FirstName, s.Department, s.Session, s.Email, s.AverageGrade, cs.CourseName, cs.Grade, cs.Year, cs.Semester FROM Student  AS s INNER JOIN
(SELECT cs.* 
FROM CourseResult cs
INNER JOIN (SELECT Coursename , MAX(Grade) as MaxGrade
    FROM CourseResult
    GROUP BY Coursename ) cc
ON cs.CourseName = cc.CourseName
AND cs.Grade = cc.MaxGrade) as cs ON (s.StudentID = cs.StudentId)


--Average Grade CourseWise
Select CourseResult.CourseName, AVG(CourseResult.Grade), CourseResult.Year, CourseResult.Semester
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId
group by CourseResult.CourseName, CourseResult.Year, CourseResult.Semester

--Average Grade SessiontWise
Select Student.Session, AVG(CourseResult.Grade)
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId
group by Student.Session

--Average Grade DepartmentWise
Select Student.Department, AVG(CourseResult.Grade), CourseResult.Year, CourseResult.Semester
From Student INNER JOIN CourseResult
On Student.StudentID = CourseResult.StudentId
group by Student.Department, CourseResult.Year, CourseResult.Semester


Select * from Scholarship
--University wise Maximum percentage of Scholarship
Select t.* from Scholarship t inner join
(Select University, max(PercentageOfScholarship) as MaxPr
From Scholarship group by University) tm
On t.University = tm.University AND t.PercentageOfScholarship = tm.MaxPr

Select * from Scholarship
--Degree wise Maximum percentage of Scholarship
Select t.* from Scholarship t inner join
(Select DegreeName,  max(PercentageOfScholarship) as MaxPr
From Scholarship group by DegreeName) tm
On t.DegreeName = tm.DegreeName AND t.PercentageOfScholarship = tm.MaxPr
Order By DegreeName, Subject


Select * from Scholarship
--Degree wise Minimum CGPA of Scholarship
Select t.* from Scholarship t inner join
(Select DegreeName,  min(MinimumGPA) as Mincg
From Scholarship group by DegreeName) tm
On t.DegreeName = tm.DegreeName AND t.MinimumGPA = tm.Mincg
Order By DegreeName, Subject


Select Scholarship.* from Scholarship inner join
(Select DegreeName,  min(MinimumGPA) as Mincg
From Scholarship group by DegreeName) tm
On Scholarship.DegreeName = tm.DegreeName AND Scholarship.MinimumGPA = tm.Mincg
Order By DegreeName, Subject



Select * from Scholarship
--Degree wise Maximum Date of Scholarship
Select t.* from Scholarship t inner join
(Select DegreeName,  max(LastDate) as Maxdate
From Scholarship group by DegreeName) tm
On t.DegreeName = tm.DegreeName AND t.LastDate = tm.Maxdate
Order By DegreeName, Subject



Select s.FirstName, s.LastName, s.Department, ss.*
FROM Student  AS s INNER JOIN StudentResearchPaper AS ss
ON (s.StudentID = ss.StudentId) INNER JOIN (Select p.Department as temp, MAX(ps.Citation) as MaxCitation
FROM Student  AS p INNER JOIN StudentResearchPaper AS ps
ON (p.StudentID = ps.StudentId) GROUP BY p.Department ) dd ON (dd.temp=s.Department and dd.MaxCitation=ss.Citation)



Select Student.StudentID, Student.FirstName ,Student.Department, Student.Session, Student.Email, Student.AverageGrade , CourseResult.*
From Student JOIN CourseResult
On Student.StudentID = CourseResult.StudentId

