package com.example.elegantcontroller.exception;

import com.example.elegantcontroller.vo.ResultVo;
import com.example.elegantcontroller.enums.ResultVoEnum;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;

@RestControllerAdvice //捕获springmvc异常
public class ControllerExceptionAdvice {

    //@ExceptionHandler注解中可以添加参数，参数是某个异常类的class，代表这个方法专门处理该类异常
    @ExceptionHandler(NumberFormatException.class)
    public ResultVo handleException(Exception e) {
        return new ResultVo(ResultVoEnum.FAILED.getCode(), e.getMessage());
    }

    //可以用来统一处理方法抛出的异常
    @ExceptionHandler({BindException.class, MethodArgumentNotValidException.class})
    public ResultVo exceptionHandler(Exception e) {
        return new ResultVo(ResultVoEnum.FAILED.getCode(), e.getMessage());
    }

    //就近原则
    //当异常发生时，Spring会选择最接近抛出异常的处理方法

    @ExceptionHandler()
    public ResultVo handleExeption2(Exception e) {
        return new ResultVo(ResultVoEnum.FAILED.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResultVo handleExeption3(Exception e) {
        return new ResultVo(ResultVoEnum.FAILED.getCode(), e.getMessage());
    }
}