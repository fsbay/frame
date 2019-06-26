package com.fsbay.manage.common.exception.user;

/**
 * 角色锁定异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:26:26
 * @version 1.0
 * @since JDK 1.8
 */
public class RoleBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public RoleBlockedException()
    {
        super("role.blocked", null);
    }
}
