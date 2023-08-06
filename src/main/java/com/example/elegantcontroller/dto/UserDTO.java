package com.example.elegantcontroller.dto;

import com.example.elegantcontroller.common.Add;
import com.example.elegantcontroller.common.Delete;
import com.example.elegantcontroller.common.Update;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
    /**
     * @Null 限制只能为null
     * @NotNull 适用于任何类型,被注解的元素必须不能与NULL
     * @NotEmpty 适用于String Map或者数组不能为Null且长度必须大于0
     * @NotBlank 只作用于字符串类型，字符串不为空，并且trim()后不为空串
     * @AssertFalse 限制必须为false
     * @AssertTrue 限制必须为true
     * @DecimalMax(value) 限制必须为一个不大于指定值的数字
     * @DecimalMin(value) 限制必须为一个不小于指定值的数字
     * @Digits(integer,fraction) 限制必须为一个小数，且整数部分的位数不能超过integer，小数部分的位数不能超过fraction
     * @Future 限制必须是一个将来的日期
     * @Past 验证注解的元素值（日期类型）比当前时间早
     * @Max(value) 限制必须为一个不大于指定值的数字
     * @Min(value) 限制必须为一个不小于指定值的数字
     * @Pattern(value) 限制必须符合指定的正则表达式
     * @Size(max,min) 限制字符长度必须在min到max之间
     * @Email 验证注解的元素值是Email，也可以通过正则表达式和flag指定自定义的email格式
     *
     * groups 分组校验
     */


    @NotBlank(message = "id不能为空",groups = {Update.class, Delete.class})
    private String id;

    @NotBlank(message = "id不能为空",groups = {Add.class})
    private String name;

    @NotBlank(message = "id不能为空",groups = {Add.class})
    private String sex;

    @NotBlank(message = "id不能为空",groups = {Add.class})
    private Integer age;

}
