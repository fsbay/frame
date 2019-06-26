package com.fsbay.manage.common.exception.user;

/**
 * 用户锁定异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:26:52
 * @version 1.0
 * @since JDK 1.8
 */
public class UserBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserBlockedException()
    {
        super("user.blocked", null);
    }
}
