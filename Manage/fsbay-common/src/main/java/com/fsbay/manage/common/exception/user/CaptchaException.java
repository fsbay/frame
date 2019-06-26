package com.fsbay.manage.common.exception.user;

/**
 * 验证码错误异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:26:03
 * @version 1.0
 * @since JDK 1.8
 */
public class CaptchaException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
