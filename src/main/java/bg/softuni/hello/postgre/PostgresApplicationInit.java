//package bg.softuni.hello.postgre;
//
//import bg.softuni.hello.postgre.model.Student;
//import bg.softuni.hello.postgre.repository.StudentRepository;
//import java.util.List;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PostgresApplicationInit implements CommandLineRunner {
//
//  private final StudentRepository studentRepository;
//
//  public PostgresApplicationInit(StudentRepository studentRepository) {
//    this.studentRepository = studentRepository;
//  }
//
//  @Override
//  public void run(String... args) throws Exception {
//    if (studentRepository.count() == 0) {
//      Student student1 = new Student().setName("John");
//      Student student2 = new Student().setName("Anna");
//      Student student3 = new Student().setName("Peter");
//
//      studentRepository.saveAll(List.of(student1, student2, student3));
//    }
//  }
//}
