package com.example.elegantcontroller.controller;

import com.example.elegantcontroller.common.Add;
import com.example.elegantcontroller.common.Delete;
import com.example.elegantcontroller.dto.UserDTO;
import com.example.elegantcontroller.service.UserService;
import com.example.elegantcontroller.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public ResultVo insert(@RequestBody @Validated({Add.class}) UserDTO userDTO){

        return new ResultVo("success");
    }

    @PostMapping("/delete")
    public void delete(@RequestBody @Validated({Delete.class}) UserDTO userDTO){
    }
}
