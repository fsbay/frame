package com.fsbay.manage.common.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import com.fsbay.manage.common.utils.spring.SpringUtils;

/**
 * 获取i18n资源文件
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:22:51
 * @version 1.0
 * @since JDK 1.8
 */
public class MessageUtils
{
    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     *
     * @param code 消息键
     * @param args 参数
     * @return 获取国际化翻译值
     */
    public static String message(String code, Object... args)
    {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
