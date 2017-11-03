package soulc.spring.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soulc.spring.test.domain.Student;

/**
 * @Author: soulc
 * @Data: Create in 16:49 ${DATA}
 */
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
