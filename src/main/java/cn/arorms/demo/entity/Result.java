package cn.arorms.demo.entity;

/**
 * Result
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 * @since 0.0.1 2024-10-20
 */
public class Result {
    private int code;
    private String message;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Result success(String message) {
        return new Result(0, message);
    }

    public static Result error(String message) {
        return new Result(1, message);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
