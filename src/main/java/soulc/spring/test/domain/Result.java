package soulc.spring.test.domain;

/**
 * @Author: soulc
 * @Data: Create in 17:49 ${DATA}
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T link;
    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getLink() {
        return link;
    }

    public void setLink(T link) {
        this.link = link;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
