package com.jingyuan.nb.service.impl;

import java.util.List;

import com.jingyuan.nb.domain.NbTake;
import com.jingyuan.nb.mapper.NbTakeMapper;
import com.jingyuan.nb.service.INbTakeService;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 历史记录Service业务层处理
 * 
 * @author Jinghao
 * @date 2022-04-21
 */
@Service
public class NbTakeServiceImpl implements INbTakeService
{
    @Autowired
    private NbTakeMapper nbTakeMapper;

    /**
     * 查询历史记录
     * 
     * @param id 历史记录主键
     * @return 历史记录
     */
    @Override
    public NbTake selectNbTakeById(Long id)
    {
        return nbTakeMapper.selectNbTakeById(id);
    }

    /**
     * 查询历史记录列表
     * 
     * @param nbTake 历史记录
     * @return 历史记录
     */
    @Override
    public List<NbTake> selectNbTakeList(NbTake nbTake)
    {
        return nbTakeMapper.selectNbTakeList(nbTake);
    }

    /**
     * 新增历史记录
     * 
     * @param nbTake 历史记录
     * @return 结果
     */
    @Override
    public int insertNbTake(NbTake nbTake)
    {
        nbTake.setCreateTime(DateUtils.getNowDate());
        return nbTakeMapper.insertNbTake(nbTake);
    }

    /**
     * 修改历史记录
     * 
     * @param nbTake 历史记录
     * @return 结果
     */
    @Override
    public int updateNbTake(NbTake nbTake)
    {
        return nbTakeMapper.updateNbTake(nbTake);
    }

    /**
     * 批量删除历史记录
     * 
     * @param ids 需要删除的历史记录主键
     * @return 结果
     */
    @Override
    public int deleteNbTakeByIds(String ids)
    {
        return nbTakeMapper.deleteNbTakeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除历史记录信息
     * 
     * @param id 历史记录主键
     * @return 结果
     */
    @Override
    public int deleteNbTakeById(Long id)
    {
        return nbTakeMapper.deleteNbTakeById(id);
    }
}
