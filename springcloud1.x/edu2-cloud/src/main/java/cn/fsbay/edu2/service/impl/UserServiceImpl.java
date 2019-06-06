package cn.fsbay.edu2.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.fsbay.edu2.entity.Demo;
import cn.fsbay.edu2.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public Demo selectByIdPlus(Demo record) {
		logger.info("UserServiceImpl selectByIdPlus"+JSON.toJSONString(record));
		return record;
	}
   
}
