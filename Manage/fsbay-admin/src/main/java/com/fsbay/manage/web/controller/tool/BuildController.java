package com.fsbay.manage.web.controller.tool;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsbay.manage.common.core.controller.BaseController;

/**
 * build 表单构建
 *
 * @author dengzhineng
 * @mail zhineng.deng@163.com
 * @date: 2019年6月21日 下午8:44:21
 * @version 1.0
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/tool/build")
public class BuildController extends BaseController
{
    private String prefix = "tool/build";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/build";
    }
}
