package com.nf.service.impl;

import com.nf.mapper.UserMapper;
import com.nf.service.IUserService;
import org.bouncycastle.crypto.tls.UserMappingType;

import javax.annotation.Resource;

public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;



}
