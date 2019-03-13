package com.cgj.pattern.prototype.work;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;


/**
 * luoyulin
 */
@Entity
@Table(name = "RE_RESULT")
public class ReResult implements java.io.Serializable {

  // Fields

  /**
	 * 
	 */
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
  private String reTimeStr;
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


  /** default constructor */
  public ReResult() {
  }

  /** minimal constructor */
  public ReResult(Long id) {
    this.id = id;
  }



  // Property accessors
  @Id
  @Column(name = "ID", unique = true, nullable = false)
  // 主键生成策略修改为数据库自增
  @GeneratedValue(generator = "native_generator")
  @GenericGenerator(name = "native_generator", strategy = "native", parameters = { @org.hibernate.annotations.Parameter(name = "sequence", value = "SEQ_RE_RESULT") })
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "RE_QUEUE_ID")
  public Long getReQueueId() {
    return this.reQueueId;
  }

  public void setReQueueId(Long reQueueId) {
    this.reQueueId = reQueueId;
  }



  @Column(name = "NOTICE_ID")
  public Integer getNoticeId() {
    return this.noticeId;
  }

  public void setNoticeId(Integer noticeId) {
    this.noticeId = noticeId;
  }

  @Column(name = "CONTENT", length = 50)
  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Column(name = "REPLY_TYPE", length = 10)
  public String getReplyType() {
    return this.replyType;
  }

  public void setReplyType(String replyType) {
    this.replyType = replyType;
  }

  @Column(name = "REPLY_TIME")
  public Date getReplyTime() {
    return this.replyTime;
  }

  public void setReplyTime(Date replyTime) {
    this.replyTime = replyTime;
  }

  @Column(name = "TYPE", length = 6)
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Column(name = "STATE", length = 10)
  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Column(name = "CREATETIME")
  public Date getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Column(name = "CREATETYPE", length = 20)
  public String getCreateType() {
    return this.createType;
  }

  public void setCreateType(String createType) {
    this.createType = createType;
  }

  @Column(name = "CREATEUSERID")
  public Long getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Long createUserId) {
    this.createUserId = createUserId;
  }

  @Column(name = "CREATEDEMO", length = 200)
  public String getCreateDemo() {
    return this.createDemo;
  }

  public void setCreateDemo(String createDemo) {
    this.createDemo = createDemo;
  }


  @Column(name = "RE_TIME")
  public Date getReTime() {
    return this.reTime;
  }

  public void setReTime(Date reTime) {
    this.reTime = reTime;
  }

  @Transient
  public String getReTimeStr() {
    this.reTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.reTime);
    return this.reTimeStr;
  }

  public void setReTimeStr(String reTimeStr) {
    this.reTimeStr = reTimeStr;
  }

  @Column(name = "ADVICE", length = 1000)
  public String getAdvice() {
    return advice;
  }

  public void setAdvice(String advice) {
    this.advice = advice;
  }

  @Column(name = "MEMO", length = 200)
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  @Column(name = "RESULTTIME")
  public Date getResultTime() {
    return this.resultTime;
  }

  public void setResultTime(Date resultTime) {
    this.resultTime = resultTime;
  }

  @Transient
  public String getResultTimeStr() {
    this.resultTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.resultTime);
    return this.resultTimeStr;
  }

  public void setResultTimeStr(String resultTimeStr) {
    this.resultTimeStr = resultTimeStr;
  }

  @Column(name = "RESULTCAUSE", length = 200)
  public String getResultCause() {
    return this.resultCause;
  }

  public void setResultCause(String resultCause) {
    this.resultCause = resultCause;
  }

  @Column(name = "RESULTUSERID")
  public Long getResultUserId() {
    return this.resultUserId;
  }

  public void setResultUserId(Long resultUserId) {
    this.resultUserId = resultUserId;
  }

  @Transient
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  @Transient
  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  @Transient
  public String getCallNum() {
    return callNum;
  }

  public void setCallNum(String callNum) {
    this.callNum = callNum;
  }

  @Transient
  public String getWoUserName() {
    return woUserName;
  }

  public void setWoUserName(String woUserName) {
    this.woUserName = woUserName;
  }

  @Transient
  public Integer getWoUserId() {
    return woUserId;
  }

  public void setWoUserId(Integer woUserId) {
    this.woUserId = woUserId;
  }

  @Transient
  public String getWoLinkName() {
    return woLinkName;
  }

  public void setWoLinkName(String woLinkName) {
    this.woLinkName = woLinkName;
  }

  @Transient
  public String getWoLinkPhone() {
    return woLinkPhone;
  }

  public void setWoLinkPhone(String woLinkPhone) {
    this.woLinkPhone = woLinkPhone;
  }

  @Transient
  public Integer getWoId() {
    return woId;
  }

  public void setWoId(Integer woId) {
    this.woId = woId;
  }

  @Transient
  public String getWoCode() {
    return woCode;
  }

  public void setWoCode(String woCode) {
    this.woCode = woCode;
  }

  @Transient
  public String getWoTitle() {
    return woTitle;
  }

  public void setWoTitle(String woTitle) {
    this.woTitle = woTitle;
  }

  @Transient
  public String getWoType() {
    return woType;
  }

  public void setWoType(String woType) {
    this.woType = woType;
  }

  @Transient
  public String getWoCreateTime() {
    return woCreateTime;
  }

  public void setWoCreateTime(String woCreateTime) {
    this.woCreateTime = woCreateTime;
  }

  @Transient
  public String getWoEndTime() {
    return woEndTime;
  }

  public void setWoEndTime(String woEndTime) {
    this.woEndTime = woEndTime;
  }

  @Transient
  public Long getReUserId() {
    return reUserId;
  }

  public void setReUserId(Long reUserId) {
    this.reUserId = reUserId;
  }

  @Transient
  public String getReUserName() {
    return reUserName;
  }

  public void setReUserName(String reUserName) {
    this.reUserName = reUserName;
  }

  @Transient
  public String getReUserAccount() {
    return reUserAccount;
  }

  public void setReUserAccount(String reUserAccount) {
    this.reUserAccount = reUserAccount;
  }

  @Override
  public String toString() {
    return "ReResult{" +
            "id=" + id +
            ", reQueueId=" + reQueueId +
            ", noticeId=" + noticeId +
            ", content='" + content + '\'' +
            ", replyType='" + replyType + '\'' +
            ", replyTime=" + replyTime +
            ", type='" + type + '\'' +
            ", state='" + state + '\'' +
            ", createTime=" + createTime +
            ", createType='" + createType + '\'' +
            ", createUserId=" + createUserId +
            ", createDemo='" + createDemo + '\'' +
            ", reTime=" + reTime +
            ", reTimeStr='" + reTimeStr + '\'' +
            ", advice='" + advice + '\'' +
            ", memo='" + memo + '\'' +
            ", resultTime=" + resultTime +
            ", resultTimeStr='" + resultTimeStr + '\'' +
            ", resultCause='" + resultCause + '\'' +
            ", resultUserId=" + resultUserId +
            ", orgName='" + orgName + '\'' +
            ", callType='" + callType + '\'' +
            ", callNum='" + callNum + '\'' +
            ", woUserName='" + woUserName + '\'' +
            ", woUserId=" + woUserId +
            ", woLinkName='" + woLinkName + '\'' +
            ", woLinkPhone='" + woLinkPhone + '\'' +
            ", woId=" + woId +
            ", woCode='" + woCode + '\'' +
            ", woTitle='" + woTitle + '\'' +
            ", woType='" + woType + '\'' +
            ", woCreateTime='" + woCreateTime + '\'' +
            ", woEndTime='" + woEndTime + '\'' +
            ", reUserId=" + reUserId +
            ", reUserName='" + reUserName + '\'' +
            ", reUserAccount='" + reUserAccount + '\'' +
            '}';
  }
}