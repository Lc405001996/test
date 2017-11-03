package soulc.spring.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import soulc.spring.test.domain.Result;

/**
 * @Author: soulc
 * @Data: Create in 18:27 ${DATA}
 */
@ControllerAdvice
public class TestExcep {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        return new Result(100, e.getMessage());
    }
}
