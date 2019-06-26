package com.fsbay.manage.quartz.task;

import org.springframework.stereotype.Component;

/**
 * 定时任务调度测试
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午10:44:08
 * @version 1.0
 * @since JDK 1.8
 */
@Component("ryTask")
public class RyTask
{
    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {
        System.out.println("执行无参方法");
    }
}
