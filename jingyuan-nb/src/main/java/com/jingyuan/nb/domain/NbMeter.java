package com.jingyuan.nb.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 智能表管理对象 nb_meter
 * 
 * @author ruoyi
 * @date 2022-04-16
 */
public class NbMeter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表地址 */
    private String meterAddr;

    /** 已绑户号 */
    @Excel(name = "已绑户号")
    private String guestNo;

    /** 水表型号 */
    @Excel(name = "水表型号")
    private Integer meterType;

    /** IMEI号 */
    @Excel(name = "IMEI号")
    private String imei;

    /** 最后指数 */
    @Excel(name = "最后指数")
    private BigDecimal reading;

    /** 上数时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上数时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date takeTime;

    /** 阀门状态 */
    @Excel(name = "阀门状态")
    private String valveCode;

    /** 指令状态 */
    @Excel(name = "指令状态")
    private String controllCode;

    /** 信号强度 */
    @Excel(name = "信号强度")
    private Integer csq;

    /** rsrp */
    @Excel(name = "rsrp")
    private String rsrp;

    /** snr */
    @Excel(name = "snr")
    private String snr;

    /** CIMI编号 */
    @Excel(name = "CIMI编号")
    private String cimi;

    /** ICCID */
    @Excel(name = "ICCID")
    private String iccid;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private Integer deptId;

    /** 是否删除 */
    private String delFlag;

    public void setMeterAddr(String meterAddr) 
    {
        this.meterAddr = meterAddr;
    }

    public String getMeterAddr() 
    {
        return meterAddr;
    }
    public void setGuestNo(String guestNo) 
    {
        this.guestNo = guestNo;
    }

    public String getGuestNo() 
    {
        return guestNo;
    }
    public void setMeterType(Integer meterType) 
    {
        this.meterType = meterType;
    }

    public Integer getMeterType() 
    {
        return meterType;
    }
    public void setImei(String imei) 
    {
        this.imei = imei;
    }

    public String getImei() 
    {
        return imei;
    }
    public void setReading(BigDecimal reading) 
    {
        this.reading = reading;
    }

    public BigDecimal getReading() 
    {
        return reading;
    }
    public void setTakeTime(Date takeTime) 
    {
        this.takeTime = takeTime;
    }

    public Date getTakeTime() 
    {
        return takeTime;
    }
    public void setValveCode(String valveCode) 
    {
        this.valveCode = valveCode;
    }

    public String getValveCode() 
    {
        return valveCode;
    }
    public void setControllCode(String controllCode) 
    {
        this.controllCode = controllCode;
    }

    public String getControllCode() 
    {
        return controllCode;
    }
    public void setCsq(Integer csq) 
    {
        this.csq = csq;
    }

    public Integer getCsq() 
    {
        return csq;
    }
    public void setRsrp(String rsrp) 
    {
        this.rsrp = rsrp;
    }

    public String getRsrp() 
    {
        return rsrp;
    }
    public void setSnr(String snr) 
    {
        this.snr = snr;
    }

    public String getSnr() 
    {
        return snr;
    }
    public void setCimi(String cimi) 
    {
        this.cimi = cimi;
    }

    public String getCimi() 
    {
        return cimi;
    }
    public void setIccid(String iccid) 
    {
        this.iccid = iccid;
    }

    public String getIccid() 
    {
        return iccid;
    }
    public void setDeptId(Integer deptId) 
    {
        this.deptId = deptId;
    }

    public Integer getDeptId() 
    {
        return deptId;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("meterAddr", getMeterAddr())
            .append("guestNo", getGuestNo())
            .append("meterType", getMeterType())
            .append("imei", getImei())
            .append("reading", getReading())
            .append("takeTime", getTakeTime())
            .append("valveCode", getValveCode())
            .append("controllCode", getControllCode())
            .append("csq", getCsq())
            .append("rsrp", getRsrp())
            .append("snr", getSnr())
            .append("cimi", getCimi())
            .append("iccid", getIccid())
            .append("deptId", getDeptId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
