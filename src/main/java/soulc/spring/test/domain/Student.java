package soulc.spring.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: soulc
 * @Data: Create in 16:33 ${DATA}
 */
@Entity
public class Student {

    @Id
    private Integer id;

    private String name;

    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
