package cn.gdeng.market.entity.lease.resources;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 市场单元楼层表
 * */
@Entity(name = "market_unit_floor")
public class MarketUnitFloorEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1272429428508797858L;

	/**
     *
     */
    private Integer id;

     *楼栋id
     */
    private Integer buildingId;

     *楼层名称
     */
    private String name;

     *楼层序号
     */
    private Integer floorNo;
    
     *楼层图
     */
    private String floorImage;

     *状态: 默认 1 正常  0 删除
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
    @Column(name = "buildingId")
    public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
    @Column(name = "name")
    public String getName(){

    }
    public void setName(String name){

    }
    @Column(name = "floorImage")
    public String getFloorImage(){

    }
    public void setFloorImage(String floorImage){

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
    @Column(name = "floorNo")
    public Integer getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}
}