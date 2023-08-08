package group4618.pozdnyakov.lesson5.exercise1.controller;

import group4618.pozdnyakov.lesson5.exercise1.model.Student;
import group4618.pozdnyakov.lesson5.exercise1.model.StudentGroupService;
import group4618.pozdnyakov.lesson5.exercise1.model.Teacher;

import java.util.List;

public class StudentGroupController {
    private StudentGroupService studentGroupService = new StudentGroupService();
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroupService.createStudentGroup(teacher,studentList);
    }
}
