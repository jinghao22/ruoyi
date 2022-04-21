package com.jingyuan.nb.controller;

import com.jingyuan.nb.domain.NbMeter;
import com.jingyuan.nb.service.INbMeterService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 智能表管理Controller
 * 
 * @author ruoyi
 * @date 2022-04-16
 */
@Controller
@RequestMapping("/nb/test")
public class NbTestController extends BaseController
{
    private String prefix = "jingyuan/meter";

    @Autowired
    private INbMeterService nbMeterService;

    @GetMapping()
    public String meter()
    {
        return prefix + "/test";
    }

    /**
     * 查询智能表管理列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NbMeter nbMeter)
    {
        startPage();
        List<NbMeter> list = nbMeterService.selectNbMeterList(nbMeter);
        return getDataTable(list);
    }


}
