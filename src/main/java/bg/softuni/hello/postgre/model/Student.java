//package bg.softuni.hello.postgre.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="students")
//public class Student {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private long id;
//
//  private String name;
//
//  public long getId() {
//    return id;
//  }
//
//  public Student setId(long id) {
//    this.id = id;
//    return this;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public Student setName(String name) {
//    this.name = name;
//    return this;
//  }
//
//  @Override
//  public String toString() {
//    return "Student{" +
//        "id=" + id +
//        ", name='" + name + '\'' +
//        '}';
//  }
//}
