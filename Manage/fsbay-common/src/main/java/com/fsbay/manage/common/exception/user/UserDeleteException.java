package com.fsbay.manage.common.exception.user;

/**
 * 用户账号已被删除
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:27:14
 * @version 1.0
 * @since JDK 1.8
 */
public class UserDeleteException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserDeleteException()
    {
        super("user.password.delete", null);
    }
}
