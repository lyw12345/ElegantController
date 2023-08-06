package com.example.elegantcontroller.vo;

import com.example.elegantcontroller.enums.ResultVoEnum;
import lombok.Data;

@Data
public class ResultVo {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 返回对象
     */
    private Object data;

    /**
     * 手动设置返回vo
     *
     * @param code 状态码
     * @param msg 返回信息
     * @param data 返回数据对象
     */
    public ResultVo(Integer code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 只返回状态码和描述
     *
     * @param code 状态码
     * @param msg 返回信息
     */
    public ResultVo(Integer code, String msg){
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    /**
     * 请求成功
     *
     * @param data 返回数据对象
     */
    public ResultVo(Object data){
        this.code = ResultVoEnum.SUCCESS.getCode();
        this.msg = ResultVoEnum.SUCCESS.getMsg();
        this.data = data;
    }
}
