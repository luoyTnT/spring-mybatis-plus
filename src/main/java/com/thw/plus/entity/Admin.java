package com.thw.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author tanhaowen
 * @since 2022-01-04
 */
@Data
@TableName("test_admin")
public class Admin {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;


}
