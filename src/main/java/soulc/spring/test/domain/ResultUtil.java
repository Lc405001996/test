package soulc.spring.test.domain;

/**
 * @Author: soulc
 * @Data: Create in 21:18 ${DATA}
 */
public class ResultUtil {
    public static Result success(Object link, Object data){
        Result result = new Result(0, "返回正常");
        result.setData(data);
        result.setLink(link);
        return result;
    }

    public static Result error(){
        Result result = new Result(-1, "返回异常");
        return result;
    }
}
