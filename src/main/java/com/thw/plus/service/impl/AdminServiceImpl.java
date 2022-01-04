package com.thw.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thw.plus.entity.Admin;
import com.thw.plus.mapper.AdminMapper;
import com.thw.plus.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tanhaowen
 * @since 2022-01-04
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
