package com.fsbay.manage.common.exception.user;

/**
 * 用户不存在异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:29:38
 * @version 1.0
 * @since JDK 1.8
 */
public class UserNotExistsException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserNotExistsException()
    {
        super("user.not.exists", null);
    }
}
