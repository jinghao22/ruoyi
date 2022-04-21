package com.jingyuan.nb.service.impl;


import com.jingyuan.nb.domain.NbMeter;
import com.jingyuan.nb.mapper.NbMeterMapper;
import com.jingyuan.nb.service.INbMeterService;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 智能表管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-16
 */
@Service
public class NbMeterServiceImpl implements INbMeterService
{
    @Autowired
    private NbMeterMapper nbMeterMapper;

    /**
     * 查询智能表管理
     * 
     * @param meterAddr 智能表管理主键
     * @return 智能表管理
     */
    @Override
    public NbMeter selectNbMeterByMeterAddr(String meterAddr)
    {
        return nbMeterMapper.selectNbMeterByMeterAddr(meterAddr);
    }

    /**
     * 查询智能表管理列表
     * 
     * @param nbMeter 智能表管理
     * @return 智能表管理
     */
    @Override
    public List<NbMeter> selectNbMeterList(NbMeter nbMeter)
    {
        return nbMeterMapper.selectNbMeterList(nbMeter);
    }

    /**
     * 新增智能表管理
     * 
     * @param nbMeter 智能表管理
     * @return 结果
     */
    @Override
    public int insertNbMeter(NbMeter nbMeter)
    {
        nbMeter.setCreateTime(DateUtils.getNowDate());
        return nbMeterMapper.insertNbMeter(nbMeter);
    }

    /**
     * 修改智能表管理
     * 
     * @param nbMeter 智能表管理
     * @return 结果
     */
    @Override
    public int updateNbMeter(NbMeter nbMeter)
    {
        nbMeter.setUpdateTime(DateUtils.getNowDate());
        return nbMeterMapper.updateNbMeter(nbMeter);
    }

    /**
     * 批量删除智能表管理
     * 
     * @param meterAddrs 需要删除的智能表管理主键
     * @return 结果
     */
    @Override
    public int deleteNbMeterByMeterAddrs(String meterAddrs)
    {
        return nbMeterMapper.deleteNbMeterByMeterAddrs(Convert.toStrArray(meterAddrs));
    }

    /**
     * 删除智能表管理信息
     * 
     * @param meterAddr 智能表管理主键
     * @return 结果
     */
    @Override
    public int deleteNbMeterByMeterAddr(String meterAddr)
    {
        return nbMeterMapper.deleteNbMeterByMeterAddr(meterAddr);
    }
}
