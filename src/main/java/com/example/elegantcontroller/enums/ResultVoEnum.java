package com.example.elegantcontroller.enums;

import lombok.Getter;

@Getter
public enum ResultVoEnum {

    SUCCESS(1000,"请求成功"),
    FAILED(1001,"请求失败"),
    VALIDATE_ERROR(1002,"参数校验失败"),
    RESPONSE_PACK_ERROR(1003,"response返回包装失败");

    private final Integer code;

    private final String msg;

    ResultVoEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
