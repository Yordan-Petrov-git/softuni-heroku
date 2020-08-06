//package bg.softuni.hello.postgre.web;
//
//import bg.softuni.hello.postgre.model.Student;
//import bg.softuni.hello.postgre.repository.StudentRepository;
//import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class StudentController {
//
//  private StudentRepository studentRepository;
//
//  public StudentController(StudentRepository studentRepository) {
//    this.studentRepository = studentRepository;
//  }
//
//  @GetMapping("/students")
//  public List<Student> getAllStudents() {
//    return studentRepository.findAll();
//  }
//
//}
