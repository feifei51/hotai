package com.nf.service.impl;

import com.nf.Admin;
import com.nf.mapper.AdminMapper;
import com.nf.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;
    @Override
    public String login(Admin admin) {
        return null;
    }
}
