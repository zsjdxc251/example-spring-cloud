package com.lesson.cloud.api.entity;



import lombok.Data;

/**
 * @author zhengshijun
 * @version created on 2019/6/26.
 */
@Data
public class ResultApi<T> {

	private final static String FAILURE = "-1";

	private Boolean success;

	private String code;

	private String msg;

	private T data;

	private Long timestamp;

	public ResultApi() {
		this.timestamp = System.currentTimeMillis();
	}

	private ResultApi(String errMsg, String errCode, boolean success, T data) {
		this.success = success;
		this.code = errCode;
		this.msg = errMsg;
		this.data = data;
		this.timestamp = System.currentTimeMillis();
	}

	public static <T> ResultApi<T> failure() {

		return new ResultApi<>(null, FAILURE, false, null);
	}

	public static <T> ResultApi<T> failure(String msg) {

		return new ResultApi<>(msg, FAILURE, false, null);
	}

	public static <T> ResultApi<T> failure(String code, String msg) {

		return new ResultApi<>(msg, code, false, null);
	}

	public static <T> ResultApi<T> success() {
		return new ResultApi<>(null, null, true, null);
	}

	public static <T> ResultApi<T> success(T result) {
		return new ResultApi<>(null, null, true, result);
	}

}
