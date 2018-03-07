package net.spring.boot.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.spring.boot.config.CrudbootApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrudbootApplication.class)
public class CrudbootApplicationTests {


	@Test
    public void helloTest() {
		assertTrue(true);
	}
	/*private UserRepository userRepository;

    
    private StudentRepository studentRepository;

      
    
    @Test
    public void addUser() {
    	Users user = new Users("testuser", "testuser", "USER");

    	assertNull(user.getId());
    	userRepository.save(user);
    	assertNotNull(user.getId());
    }
    
	@Test
    public void addStudent() {
		Student student = new Student("Test", "Student", "IT", "test@test.com");
		
		studentRepository.save(student);
		Optional<Student> findStudent = studentRepository.findById(student.getId());
		assertTrue(findStudent.isPresent());
    }*/
    
}
