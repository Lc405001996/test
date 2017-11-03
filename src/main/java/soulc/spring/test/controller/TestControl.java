package soulc.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import soulc.spring.test.domain.Result;
import soulc.spring.test.domain.ResultUtil;
import soulc.spring.test.domain.Student;
import soulc.spring.test.service.TestService;

import java.util.List;


/**
 * @Author: soulc
 * @Data: Create in 17:33 ${DATA}
 */
@RestController
public class TestControl {
    @Autowired
    private TestService testService;

    /**
     * 查询
     * @return
     */
    @GetMapping(value = "/")
    public Result<List> findAll(){
        Result result = new Result(0,"正常返回！");
        result.setData(testService.findAll());

        return result;
    }

    /**
     * 添加一个
     * @param student
     * @return
     */
    @PostMapping(value = "/addOne")
    public Result addOneStu(Student student){
        return ResultUtil.success("link",testService.addOneStu(student));
    }

    /**
     * 排序
     * @return
     */
    @GetMapping(value = "/findAllById")
    public Result findAllById(){
        return ResultUtil.success("link",testService.findAllById());
    }
}
