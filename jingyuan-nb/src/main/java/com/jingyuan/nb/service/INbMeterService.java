package com.jingyuan.nb.service;

import com.jingyuan.nb.domain.NbMeter;

import java.util.List;

/**
 * 智能表管理Service接口
 * 
 * @author ruoyi
 * @date 2022-04-16
 */
public interface INbMeterService 
{
    /**
     * 查询智能表管理
     * 
     * @param meterAddr 智能表管理主键
     * @return 智能表管理
     */
    public NbMeter selectNbMeterByMeterAddr(String meterAddr);

    /**
     * 查询智能表管理列表
     * 
     * @param nbMeter 智能表管理
     * @return 智能表管理集合
     */
    public List<NbMeter> selectNbMeterList(NbMeter nbMeter);

    /**
     * 新增智能表管理
     * 
     * @param nbMeter 智能表管理
     * @return 结果
     */
    public int insertNbMeter(NbMeter nbMeter);

    /**
     * 修改智能表管理
     * 
     * @param nbMeter 智能表管理
     * @return 结果
     */
    public int updateNbMeter(NbMeter nbMeter);

    /**
     * 批量删除智能表管理
     * 
     * @param meterAddrs 需要删除的智能表管理主键集合
     * @return 结果
     */
    public int deleteNbMeterByMeterAddrs(String meterAddrs);

    /**
     * 删除智能表管理信息
     * 
     * @param meterAddr 智能表管理主键
     * @return 结果
     */
    public int deleteNbMeterByMeterAddr(String meterAddr);
}
