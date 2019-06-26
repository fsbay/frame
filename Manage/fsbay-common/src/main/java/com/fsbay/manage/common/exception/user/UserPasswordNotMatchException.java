package com.fsbay.manage.common.exception.user;

/**
 * 用户密码不正确或不符合规范异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:29:15
 * @version 1.0
 * @since JDK 1.8
 */
public class UserPasswordNotMatchException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
