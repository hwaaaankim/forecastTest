package com.dev.ForecastApiTestJar.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

	INDEX_NOT_FOUND(1001, "인덱스가 존재하지 않습니다."),
    BOARD_NOT_FOUND(1002, "게시글을 찾을 수 없습니다."),
    UNKNOWN_ERROR(1003, "토큰이 존재하지 않습니다."),
    WRONG_TYPE_TOKEN(1004, "변조된 토큰입니다."),
    EXPIRED_TOKEN(1005, "만료된 토큰입니다."),
    UNSUPPORTED_TOKEN(1006, "변조된 토큰입니다."),
    ACCESS_DENIED(1007, "권한이 없습니다."),
	METHOD_ERROR(1008, "잘못된 http method 입니다."),
	USERNAME_ERROR(1009, "잘못된 USERNAME 입니다."),
	PASSWORD_ERROR(1010, "잘못된 PASSWORD 입니다."),
	EXPIRED_ERROR(1011, "계정이 접속 불가능한 상태 입니다.");
	
	private final int code;
	private final String message;
}
