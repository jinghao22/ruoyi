package com.jingyuan.nb.controller;

import com.jingyuan.nb.domain.NbTake;
import com.jingyuan.nb.service.INbTakeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 历史记录Controller
 * 
 * @author Jinghao
 * @date 2022-04-21
 */
@Controller
@RequestMapping("/jingyuan/take")
public class NbTakeController extends BaseController
{
    private String prefix = "jingyuan/take";

    @Autowired
    private INbTakeService nbTakeService;

    @GetMapping()
    public String take()
    {
        return prefix + "/take";
    }

    /**
     * 查询历史记录列表
     */
    @RequiresPermissions("jingyuan:take:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NbTake nbTake)
    {
        startPage();
        List<NbTake> list = nbTakeService.selectNbTakeList(nbTake);
        return getDataTable(list);
    }

    /**
     * 导出历史记录列表
     */
    @RequiresPermissions("jingyuan:take:export")
    @Log(title = "历史记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NbTake nbTake)
    {
        List<NbTake> list = nbTakeService.selectNbTakeList(nbTake);
        ExcelUtil<NbTake> util = new ExcelUtil<NbTake>(NbTake.class);
        return util.exportExcel(list, "历史记录数据");
    }

    /**
     * 新增历史记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存历史记录
     */
    @RequiresPermissions("jingyuan:take:add")
    @Log(title = "历史记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NbTake nbTake)
    {
        return toAjax(nbTakeService.insertNbTake(nbTake));
    }

    /**
     * 修改历史记录
     */
    @RequiresPermissions("jingyuan:take:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NbTake nbTake = nbTakeService.selectNbTakeById(id);
        mmap.put("nbTake", nbTake);
        return prefix + "/edit";
    }

    /**
     * 修改保存历史记录
     */
    @RequiresPermissions("jingyuan:take:edit")
    @Log(title = "历史记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NbTake nbTake)
    {
        return toAjax(nbTakeService.updateNbTake(nbTake));
    }

    /**
     * 删除历史记录
     */
    @RequiresPermissions("jingyuan:take:remove")
    @Log(title = "历史记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nbTakeService.deleteNbTakeByIds(ids));
    }
}
