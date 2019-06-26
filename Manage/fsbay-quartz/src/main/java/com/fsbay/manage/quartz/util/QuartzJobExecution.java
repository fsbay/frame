package com.fsbay.manage.quartz.util;

import org.quartz.JobExecutionContext;

import com.fsbay.manage.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午10:46:39
 * @version 1.0
 * @since JDK 1.8
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
