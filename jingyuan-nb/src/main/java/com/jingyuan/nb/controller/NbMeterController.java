package com.jingyuan.nb.controller;

import com.jingyuan.nb.domain.NbMeter;
import com.jingyuan.nb.service.INbMeterService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.OnlineStatus;
import com.ruoyi.common.utils.ShiroUtils;
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
@RequestMapping("/nb/meter")
public class NbMeterController extends BaseController
{
    private String prefix = "jingyuan/meter";

    @Autowired
    private INbMeterService nbMeterService;

    @RequiresPermissions("system:meter:view")
    @GetMapping()
    public String meter()
    {
        return prefix + "/meter";
    }

    /**
     * 查询智能表管理列表
     */
    @RequiresPermissions("system:meter:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NbMeter nbMeter)
    {
        startPage();
        List<NbMeter> list = nbMeterService.selectNbMeterList(nbMeter);
        return getDataTable(list);
    }

    /**
     * 导出智能表管理列表
     */
    @RequiresPermissions("system:meter:export")
    @Log(title = "智能表管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NbMeter nbMeter)
    {
        List<NbMeter> list = nbMeterService.selectNbMeterList(nbMeter);
        ExcelUtil<NbMeter> util = new ExcelUtil<NbMeter>(NbMeter.class);
        return util.exportExcel(list, "智能表管理数据");
    }

    /**
     * 新增智能表管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存智能表管理
     */
    @RequiresPermissions("system:meter:add")
    @Log(title = "智能表管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NbMeter nbMeter)
    {
        return toAjax(nbMeterService.insertNbMeter(nbMeter));
    }

    /**
     * 修改智能表管理
     */
    @RequiresPermissions("system:meter:edit")
    @GetMapping("/edit/{meterAddr}")
    public String edit(@PathVariable("meterAddr") String meterAddr, ModelMap mmap)
    {
        NbMeter nbMeter = nbMeterService.selectNbMeterByMeterAddr(meterAddr);
        mmap.put("nbMeter", nbMeter);
        return prefix + "/edit";
    }

    /**
     * 修改保存智能表管理
     */
    @RequiresPermissions("system:meter:edit")
    @Log(title = "智能表管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NbMeter nbMeter)
    {
        return toAjax(nbMeterService.updateNbMeter(nbMeter));
    }

    /**
     * 删除智能表管理
     */
    @RequiresPermissions("system:meter:remove")
    @Log(title = "智能表管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nbMeterService.deleteNbMeterByMeterAddrs(ids));
    }



    @PostMapping( "/addTest")
    @ResponseBody
    public AjaxResult addTest(NbMeter nbMeter){
        return AjaxResult.success(nbMeter);
    }

    @PostMapping("/postTest")
    @ResponseBody
    public AjaxResult batchForceLogout(NbMeter nbMeter)
    {
        System.out.println(nbMeter);
        return success("入库成功");
    }


    @GetMapping("/getTest/{meterAddr}")
    @ResponseBody
    public AjaxResult genCode(@PathVariable("meterAddr") String meterAddr)
    {
        System.out.println(meterAddr);
        return AjaxResult.success();
    }

    @GetMapping("/getTests")
    @ResponseBody
    public AjaxResult getTests(NbMeter nbMeter)
    {
        System.out.println(nbMeter.getMeterAddr() +"-----" +nbMeter.getGuestNo());
        return AjaxResult.success();
    }

}
