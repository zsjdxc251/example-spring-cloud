package com.lesson.cloud.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengshijun
 * @version created on 2019/6/26.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private String username;

	private String password;

	private Integer age;

	private Byte gender;
}
