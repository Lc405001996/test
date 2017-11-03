package soulc.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soulc.spring.test.domain.Student;
import soulc.spring.test.repository.StudentRepo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: soulc
 * @Data: Create in 16:50 ${DATA}
 */
@Service
public class TestService {
    @Autowired
    private StudentRepo studentRepo;

    /**
     * 添加一个&修改一个
     * @param student
     * @return
     */
    public Student addAndUpdateOne(Student student){
        return studentRepo.save(student);
    }

    /**
     * 查询所有
     * @return
     */
    public List<Student> findAll(){
        return studentRepo.findAll();
    }

    /**
     * 查询所有，按Id排序
     * @return
     */
    public List<Student> findAllById(){
        List list = studentRepo.findAll();
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                return s1.getId().compareTo(s2.getId());
            }
        });
        return list;
    }
}
