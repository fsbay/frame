package com.fsbay.manage.common.exception.user;

import com.fsbay.manage.common.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:27:36
 * @version 1.0
 * @since JDK 1.8
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
