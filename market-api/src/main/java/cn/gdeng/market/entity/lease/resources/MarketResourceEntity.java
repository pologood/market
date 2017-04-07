package cn.gdeng.market.entity.lease.resources;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "market_resource")
public class MarketResourceEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4362695300606258344L;

	/**
     *
     */
    private Integer id;

     *资源编码
     */
    private String code;

     *资源简码
     */
    private String shortCode;

     *原资源编码
     */
    private String orginCode;

     *原资源操作  默认  0   创建  1  被拆分   2  被合并
     */
    private Integer originOperate;

     *资源名称
     */
    private String name;

     *市场id
     */
    private Integer marketId;

     *区域id
     */
    private Integer areaId;

     *楼栋id
     */
    private Integer budingId;

     *楼层id
     */
    private Integer floorId;

     *单元id
     */
    private Integer unitId;

     *资源类型Id
     */
    private Integer resourceTypeId;

     *建筑面积
     */
    private Double builtArea;

     *套内面积
     */
    private Double innerArea;

     *可出租面积
     */
    private Double leaseArea;

     *租赁状态:  默认 1 未生效  2 已租  3  待租  4 预租  5 签约
     */
    private Integer leaseStatus;

     *收租模式  1 指定金额  2 手工录入  3 建筑面积  4  套内面积  5 可出租面积
     */
    private String rentMode;

     *生效时间
     */
    private Date leaseValidateTime;

     *状态: 默认  1 正常  0 删除
     */
    private Integer status;

     *
     */
    private String createUserId;

     *
     */
    private Date createTime;

     *
     */
    private String updateUserId;

     *
     */
    private Date updateTime;

    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "code")
    public String getCode(){

    }
    public void setCode(String code){

    }
    @Column(name = "shortCode")
    public String getShortCode(){

    }
    public void setShortCode(String shortCode){

    }
    @Column(name = "orginCode")
    public String getOrginCode(){

    }
    public void setOrginCode(String orginCode){

    }
    @Column(name = "originOperate")
    public Integer getOriginOperate(){

    }
    public void setOriginOperate(Integer originOperate){

    }
    @Column(name = "name")
    public String getName(){

    }
    public void setName(String name){

    }
    @Column(name = "marketId")
    public Integer getMarketId(){
        
    }
    public void setMarketId(Integer marketId){

    }
    @Column(name = "areaId")
    public Integer getAreaId(){

    }
    public void setAreaId(Integer areaId){

    }
    @Column(name = "budingId")
    public Integer getBudingId(){

    }
    public void setBudingId(Integer budingId){

    }
    @Column(name = "floorId")
    public Integer getFloorId(){

    }
    public void setFloorId(Integer floorId){

    }
    @Column(name = "unitId")
    public Integer getUnitId(){

    }
    public void setUnitId(Integer unitId){

    }
    @Column(name = "resourceTypeId")
    public Integer getResourceTypeId(){

    }
    public void setResourceTypeId(Integer resourceTypeId){

    }
    @Column(name = "builtArea")
    public Double getBuiltArea(){

    }
    public void setBuiltArea(Double builtArea){

    }
    @Column(name = "innerArea")
    public Double getInnerArea(){

    }
    public void setInnerArea(Double innerArea){

    }
    @Column(name = "leaseArea")
    public Double getLeaseArea(){

    }
    public void setLeaseArea(Double leaseArea){

    }
    @Column(name = "leaseStatus")
    public Integer getLeaseStatus(){

    }
    public void setLeaseStatus(Integer leaseStatus){

    }
    @Column(name = "rentMode")
    public String getRentMode(){

    }
    public void setRentMode(String rentMode){

    }
    @Column(name = "leaseValidateTime")
    public Date getLeaseValidateTime(){

    }
    public void setLeaseValidateTime(Date leaseValidateTime){

    }
    @Column(name = "status")
    public Integer getStatus(){

    }
    public void setStatus(Integer status){

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
	@Override
	public String toString() {
		return "MarketResourceEntity [id=" + id + ", code=" + code + ", shortCode=" + shortCode + ", orginCode="
				+ orginCode + ", originOperate=" + originOperate + ", name=" + name + ", marketId=" + marketId
				+ ", areaId=" + areaId + ", budingId=" + budingId + ", floorId=" + floorId + ", unitId=" + unitId
				+ ", resourceTypeId=" + resourceTypeId + ", builtArea=" + builtArea + ", innerArea=" + innerArea
				+ ", leaseArea=" + leaseArea + ", leaseStatus=" + leaseStatus + ", rentMode=" + rentMode
				+ ", leaseValidateTime=" + leaseValidateTime + ", status=" + status + ", createUserId=" + createUserId
				+ ", createTime=" + createTime + ", updateUserId=" + updateUserId + ", updateTime=" + updateTime + "]";
	}
    
}