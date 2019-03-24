package com.esliceu.puncher.parser.model;


import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "CENTRE_EXPORT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ Teacher.class, Student.class, ScheduleStudents.class, ScheduleTeachers.class, Group.class, Classroom.class })
public class Center {

    @XmlElement(name="PROFESSORS")
    private List<Teachers> professors;

    @XmlElement(name="ALUMNES")
    private List<Students> alumnes;

    @XmlElement(name="HORARIP")
    private List<ScheduleTeachers> scheduleTeachers;

    @XmlElement(name="HORARIA")
    private List<ScheduleStudents> scheduleStudents;

    @XmlElement(name="CURSOS")
    private List<Courses> courses;

    @XmlElement(name = "SUBMATERIES")
    private List<Subjects> subjects;

    @XmlElement(name="AULES")
    private List<Classrooms> classrooms;


    public List<ScheduleTeachers> getScheduleTeachers() {
        return scheduleTeachers;
    }

    public void setScheduleTeachers(List<ScheduleTeachers> scheduleTeachers) {
        this.scheduleTeachers = scheduleTeachers;
    }


    public List<ScheduleStudents> getScheduleStudents() {
        return scheduleStudents;
    }

    public void setScheduleStudents(List<ScheduleStudents> scheduleStudents) {
        this.scheduleStudents = scheduleStudents;
    }

    public List<Students> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(List<Students> alumnes) {
        this.alumnes = alumnes;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public List<Teachers> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Teachers> professors) {
        this.professors = professors;
    }

    public List<Classrooms> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classrooms> classrooms) {
        this.classrooms = classrooms;
    }

    public List<Subjects> getSubjects() {return subjects;}

    public void setSubjects(List<Subjects> subjects) {this.subjects = subjects;}
}
