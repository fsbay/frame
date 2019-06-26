package com.fsbay.manage.common.enums;

/**
 * 用户会话
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:20:13
 * @version 1.0
 * @since JDK 1.8
 */
public enum OnlineStatus
{
    /** 用户状态 */
    on_line("在线"), off_line("离线");

    private final String info;

    private OnlineStatus(String info)
    {
        this.info = info;
    }

    public String getInfo()
    {
        return info;
    }
}
