package com.jingyuan.nb.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 历史记录对象 nb_take
 * 
 * @author Jinghao
 * @date 2022-04-21
 */
public class NbTake extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 命令类型 */
    @Excel(name = "命令类型")
    private String commandType;

    /** 状态码 */
    @Excel(name = "状态码")
    private Long code;

    /** 表号 */
    @Excel(name = "表号")
    private String meterNo;

    /** 读数 */
    @Excel(name = "读数")
    private String readNumber;

    /** 电压 */
    @Excel(name = "电压")
    private String voltage;

    /** 阀门状态 */
    @Excel(name = "阀门状态")
    private String valveState;

    /** 阀门故障 */
    @Excel(name = "阀门故障")
    private String valveFailure;

    /** 攻击状态 */
    @Excel(name = "攻击状态")
    private String attackState;

    /** 电池状态 */
    @Excel(name = "电池状态")
    private String batteryStu;

    /** 霍尔故障 */
    @Excel(name = "霍尔故障")
    private String hallofFailure;

    /** 掉电 */
    @Excel(name = "掉电")
    private String dowerDown;

    /** 网络信号 */
    @Excel(name = "网络信号")
    private String csq;

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

    /** 抄表时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "抄表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workerTime;

    /** 是否记账 */
    @Excel(name = "是否记账")
    private String isCharge;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private Long deptId;

    /** 年 */
    @Excel(name = "年")
    private Long workTimeYear;

    /** 月 */
    @Excel(name = "月")
    private Long workTimeMonth;

    /** 日 */
    @Excel(name = "日")
    private Long workTimeDay;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCommandType(String commandType) 
    {
        this.commandType = commandType;
    }

    public String getCommandType() 
    {
        return commandType;
    }
    public void setCode(Long code) 
    {
        this.code = code;
    }

    public Long getCode() 
    {
        return code;
    }
    public void setMeterNo(String meterNo) 
    {
        this.meterNo = meterNo;
    }

    public String getMeterNo() 
    {
        return meterNo;
    }
    public void setReadNumber(String readNumber) 
    {
        this.readNumber = readNumber;
    }

    public String getReadNumber() 
    {
        return readNumber;
    }
    public void setVoltage(String voltage) 
    {
        this.voltage = voltage;
    }

    public String getVoltage() 
    {
        return voltage;
    }
    public void setValveState(String valveState) 
    {
        this.valveState = valveState;
    }

    public String getValveState() 
    {
        return valveState;
    }
    public void setValveFailure(String valveFailure) 
    {
        this.valveFailure = valveFailure;
    }

    public String getValveFailure() 
    {
        return valveFailure;
    }
    public void setAttackState(String attackState) 
    {
        this.attackState = attackState;
    }

    public String getAttackState() 
    {
        return attackState;
    }
    public void setBatteryStu(String batteryStu) 
    {
        this.batteryStu = batteryStu;
    }

    public String getBatteryStu() 
    {
        return batteryStu;
    }
    public void setHallofFailure(String hallofFailure) 
    {
        this.hallofFailure = hallofFailure;
    }

    public String getHallofFailure() 
    {
        return hallofFailure;
    }
    public void setDowerDown(String dowerDown) 
    {
        this.dowerDown = dowerDown;
    }

    public String getDowerDown() 
    {
        return dowerDown;
    }
    public void setCsq(String csq) 
    {
        this.csq = csq;
    }

    public String getCsq() 
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
    public void setWorkerTime(Date workerTime) 
    {
        this.workerTime = workerTime;
    }

    public Date getWorkerTime() 
    {
        return workerTime;
    }
    public void setIsCharge(String isCharge) 
    {
        this.isCharge = isCharge;
    }

    public String getIsCharge() 
    {
        return isCharge;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setWorkTimeYear(Long workTimeYear) 
    {
        this.workTimeYear = workTimeYear;
    }

    public Long getWorkTimeYear() 
    {
        return workTimeYear;
    }
    public void setWorkTimeMonth(Long workTimeMonth) 
    {
        this.workTimeMonth = workTimeMonth;
    }

    public Long getWorkTimeMonth() 
    {
        return workTimeMonth;
    }
    public void setWorkTimeDay(Long workTimeDay) 
    {
        this.workTimeDay = workTimeDay;
    }

    public Long getWorkTimeDay() 
    {
        return workTimeDay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("commandType", getCommandType())
            .append("code", getCode())
            .append("meterNo", getMeterNo())
            .append("readNumber", getReadNumber())
            .append("voltage", getVoltage())
            .append("valveState", getValveState())
            .append("valveFailure", getValveFailure())
            .append("attackState", getAttackState())
            .append("batteryStu", getBatteryStu())
            .append("hallofFailure", getHallofFailure())
            .append("dowerDown", getDowerDown())
            .append("csq", getCsq())
            .append("rsrp", getRsrp())
            .append("snr", getSnr())
            .append("cimi", getCimi())
            .append("iccid", getIccid())
            .append("workerTime", getWorkerTime())
            .append("createTime", getCreateTime())
            .append("isCharge", getIsCharge())
            .append("deptId", getDeptId())
            .append("workTimeYear", getWorkTimeYear())
            .append("workTimeMonth", getWorkTimeMonth())
            .append("workTimeDay", getWorkTimeDay())
            .toString();
    }
}
