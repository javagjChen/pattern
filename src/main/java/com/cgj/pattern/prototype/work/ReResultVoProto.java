package com.cgj.pattern.prototype.work;




import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class ReResultVoProto {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long reQueueId;
    private Integer noticeId;
    private String content;
    private String replyType;
    private Date replyTime;
    private String type;
    private String state;
    private Date createTime;
    private String createType;
    private Long createUserId;
    private String createDemo;
    private Date reTime;
    private String advice;
    private String memo;
    private Date resultTime;
    private String resultTimeStr;
    private String resultCause;
    private Long resultUserId;

    private String orgName;
    private String callType;
    private String callNum;
    private String woUserName;
    private Integer woUserId;
    private String woLinkName;
    private String woLinkPhone;
    private Integer woId;
    private String woCode;
    private String woTitle;
    private String woType;
    private String woCreateTime;
    private String woEndTime;
    private Long reUserId = null;
    private String reUserName = "";
    private String reUserAccount = "";


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReQueueId() {
        return reQueueId;
    }

    public void setReQueueId(Long reQueueId) {
        this.reQueueId = reQueueId;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateDemo() {
        return createDemo;
    }

    public void setCreateDemo(String createDemo) {
        this.createDemo = createDemo;
    }

    public Date getReTime() {
        return reTime;
    }

    public void setReTime(Date reTime) {
        this.reTime = reTime;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    public String getResultTimeStr() {
        return resultTimeStr;
    }

    public void setResultTimeStr(String resultTimeStr) {
        this.resultTimeStr = resultTimeStr;
    }

    public String getResultCause() {
        return resultCause;
    }

    public void setResultCause(String resultCause) {
        this.resultCause = resultCause;
    }

    public Long getResultUserId() {
        return resultUserId;
    }

    public void setResultUserId(Long resultUserId) {
        this.resultUserId = resultUserId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getCallNum() {
        return callNum;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }

    public String getWoUserName() {
        return woUserName;
    }

    public void setWoUserName(String woUserName) {
        this.woUserName = woUserName;
    }

    public Integer getWoUserId() {
        return woUserId;
    }

    public void setWoUserId(Integer woUserId) {
        this.woUserId = woUserId;
    }

    public String getWoLinkName() {
        return woLinkName;
    }

    public void setWoLinkName(String woLinkName) {
        this.woLinkName = woLinkName;
    }

    public String getWoLinkPhone() {
        return woLinkPhone;
    }

    public void setWoLinkPhone(String woLinkPhone) {
        this.woLinkPhone = woLinkPhone;
    }

    public Integer getWoId() {
        return woId;
    }

    public void setWoId(Integer woId) {
        this.woId = woId;
    }

    public String getWoCode() {
        return woCode;
    }

    public void setWoCode(String woCode) {
        this.woCode = woCode;
    }

    public String getWoTitle() {
        return woTitle;
    }

    public void setWoTitle(String woTitle) {
        this.woTitle = woTitle;
    }

    public String getWoType() {
        return woType;
    }

    public void setWoType(String woType) {
        this.woType = woType;
    }

    public String getWoCreateTime() {
        return woCreateTime;
    }

    public void setWoCreateTime(String woCreateTime) {
        this.woCreateTime = woCreateTime;
    }

    public String getWoEndTime() {
        return woEndTime;
    }

    public void setWoEndTime(String woEndTime) {
        this.woEndTime = woEndTime;
    }

    public Long getReUserId() {
        return reUserId;
    }

    public void setReUserId(Long reUserId) {
        this.reUserId = reUserId;
    }

    public String getReUserName() {
        return reUserName;
    }

    public void setReUserName(String reUserName) {
        this.reUserName = reUserName;
    }

    public String getReUserAccount() {
        return reUserAccount;
    }

    public void setReUserAccount(String reUserAccount) {
        this.reUserAccount = reUserAccount;
    }



    public static ReResult genericFromVo(ReResultVo vo){
        if (null==vo) {
            return null;
        }
        ReResult reResult = new ReResult();
        BeanUtils.copyProperties(vo,reResult);

        return reResult;
    }
    public static ReResultVo genericFrom(ReResult reResult){
        if (null==reResult) {
            return null;
        }
        ReResultVo vo = new ReResultVo();
        BeanUtils.copyProperties(reResult,vo);
        return vo;

    }
}
