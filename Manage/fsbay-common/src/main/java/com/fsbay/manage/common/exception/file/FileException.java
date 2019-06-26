package com.fsbay.manage.common.exception.file;

import com.fsbay.manage.common.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:23:49
 * @version 1.0
 * @since JDK 1.8
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
