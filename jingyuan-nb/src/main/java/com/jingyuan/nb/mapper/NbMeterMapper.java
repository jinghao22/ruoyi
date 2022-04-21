package com.jingyuan.nb.mapper;

import java.util.List;

import com.jingyuan.nb.domain.NbMeter;

/**
 * 智能表管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-16
 */
public interface NbMeterMapper 
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
     * 删除智能表管理
     * 
     * @param meterAddr 智能表管理主键
     * @return 结果
     */
    public int deleteNbMeterByMeterAddr(String meterAddr);

    /**
     * 批量删除智能表管理
     * 
     * @param meterAddrs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNbMeterByMeterAddrs(String[] meterAddrs);
}
