package cn.fsbay.edu2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fsbay.edu2.entity.Demo;
import cn.fsbay.edu2.service.IUserService;

@RestController
@RequestMapping("/api/edu2")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/selectPlus")
    public Demo selectPlus() {
        Demo record = new Demo();
        record.setId(100000000);
        record.setName("张小花12");
        return userService.selectByIdPlus(record);
    }

   
}
