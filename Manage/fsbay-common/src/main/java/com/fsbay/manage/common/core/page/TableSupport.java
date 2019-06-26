package com.fsbay.manage.common.core.page;

import com.fsbay.manage.common.constant.Constants;
import com.fsbay.manage.common.utils.ServletUtils;

/**
 * 表格数据处理
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午9:14:48
 * @version 1.0
 * @since JDK 1.8
 */
public class TableSupport
{
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }
}
