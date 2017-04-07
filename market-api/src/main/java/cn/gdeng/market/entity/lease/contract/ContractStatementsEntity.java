package cn.gdeng.market.entity.lease.contract;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "contract_statements")
public class ContractStatementsEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5169150571248469230L;

	/**
     *主键id
     */
    private Integer id;

     *合同ID
     */
    private Integer contractId;

     *合同编号
     */
    private String contractNo;

     *退还保证金
     */
    private Double deposit;
    /**
     *市场id
     */
    private Integer marketId;
     *罚款金额
     */
    private Double forfeit;

     *经办人
     */
    private String trustees;

     *经办时间
     */
    private Date reviewedTime;

     *结算说明
     */
    private String info;

     *结算类型 0 合同到期 1 提前解约
     */
    private Byte statementsType;

     *创建人员ID
     */
    private String createUserId;

     *创建时间
     */
    private Date createTime;

     *修改人员ID
     */
    private String updateUserId;

     *修改时间
     */
    private Date updateTime;
    
    /**
     *审批状态 0 待审批 1 审批中 2 已驳回 3 已通过
     */
    private Byte approvalStatus;

    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "contractId")
    public Integer getContractId(){

    }
    public void setContractId(Integer contractId){

    }
    @Column(name = "contractNo")
    public String getContractNo(){

    }
    public void setContractNo(String contractNo){

    }
    @Column(name = "deposit")
    public Double getDeposit(){

    }
    public void setDeposit(Double deposit){

    }
    @Column(name = "forfeit")
    public Double getForfeit(){

    }
    public void setForfeit(Double forfeit){

    }
    @Column(name = "trustees")
    public String getTrustees(){

    }
    public void setTrustees(String trustees){

    }
    @Column(name = "reviewedTime")
    public Date getReviewedTime(){

    }
    public void setReviewedTime(Date reviewedTime){

    }
    @Column(name = "info")
    public String getInfo(){

    }
    public void setInfo(String info){

    }
    @Column(name = "statementsType")
    public Byte getStatementsType(){

    }
    public void setStatementsType(Byte statementsType){

    }
    @Column(name = "createUserId")
    public String getCreateUserId(){

    }
    public void setCreateUserId(String createUserId){

    }
    @Column(name = "createTime")
    public Date getCreateTime(){

    }
    public void setCreateTime(Date createTime){

    }
    @Column(name = "updateUserId")
    public String getUpdateUserId(){

    }
    public void setUpdateUserId(String updateUserId){

    }
    @Column(name = "updateTime")
    public Date getUpdateTime(){

    }
    public void setUpdateTime(Date updateTime){

    }
    @Column(name = "marketId")
	public Integer getMarketId() {
		return marketId;
	}
	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	@Column(name = "approvalStatus")
	public Byte getApprovalStatus(){
	
	    return this.approvalStatus;
	}
	public void setApprovalStatus(Byte approvalStatus){
	
	    this.approvalStatus = approvalStatus;
	}  
}