package com.jingyuan.nb.service;

import com.jingyuan.nb.domain.NbTake;

import java.util.List;

/**
 * 历史记录Service接口
 * 
 * @author Jinghao
 * @date 2022-04-21
 */
public interface INbTakeService 
{
    /**
     * 查询历史记录
     * 
     * @param id 历史记录主键
     * @return 历史记录
     */
    public NbTake selectNbTakeById(Long id);

    /**
     * 查询历史记录列表
     * 
     * @param nbTake 历史记录
     * @return 历史记录集合
     */
    public List<NbTake> selectNbTakeList(NbTake nbTake);

    /**
     * 新增历史记录
     * 
     * @param nbTake 历史记录
     * @return 结果
     */
    public int insertNbTake(NbTake nbTake);

    /**
     * 修改历史记录
     * 
     * @param nbTake 历史记录
     * @return 结果
     */
    public int updateNbTake(NbTake nbTake);

    /**
     * 批量删除历史记录
     * 
     * @param ids 需要删除的历史记录主键集合
     * @return 结果
     */
    public int deleteNbTakeByIds(String ids);

    /**
     * 删除历史记录信息
     * 
     * @param id 历史记录主键
     * @return 结果
     */
    public int deleteNbTakeById(Long id);
}
