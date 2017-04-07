package cn.gdeng.market.entity.lease.settings;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "market")
public class MarketEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 9040722704658314100L;

	/**
     *
     */
    private Integer id;

     *组织id
     */
    private Integer orgId;

     *市场名称
     */
    private String name;

     *市场编号
     */
    private String code;

     *市场名称简写
     */
    private String nameShort;

     *开业时间
     */
    private Date openTime;

     *市场状态:  默认 1 运营中 2 筹备中 3 关闭
     */
    private Integer marketStatus;

     *省id
     */
    private Integer provinceId;

     *市id
     */
    private Integer cityId;

     *区id
     */
    private Integer areaId;

     *省市区（用/隔开）
     */
    private String pca;

     *地址
     */
    private String address;

     *状态:  默认 1 正常  0 删除
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
    
    /**
    *
    */
    private String marketImage;

    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "orgId")
    public Integer getOrgId(){

    }
    public void setOrgId(Integer orgId){

    }
    @Column(name = "name")
    public String getName(){

    }
    public void setName(String name){

    }
    @Column(name = "code")
    public String getCode(){

    }
    public void setCode(String code){

    }
    @Column(name = "nameShort")
    public String getNameShort(){

    }
    public void setNameShort(String nameShort){

    }
    @Column(name = "openTime")
    public Date getOpenTime(){

    }
    public void setOpenTime(Date openTime){

    }
    @Column(name = "marketStatus")
    public Integer getMarketStatus(){

    }
    public void setMarketStatus(Integer marketStatus){

    }
    @Column(name = "provinceId")
    public Integer getProvinceId(){

    }
    public void setProvinceId(Integer provinceId){

    }
    @Column(name = "cityId")
    public Integer getCityId(){

    }
    public void setCityId(Integer cityId){

    }
    @Column(name = "areaId")
    public Integer getAreaId(){

    }
    public void setAreaId(Integer areaId){

    }
    @Column(name = "pca")
    public String getPca(){

    }
    public void setPca(String pca){

    }
    @Column(name = "address")
    public String getAddress(){

    }
    public void setAddress(String address){

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
	
    @Column(name = "marketImage")
    public String getMarketImage() {
		return marketImage;
	}
	public void setMarketImage(String marketImage) {
		this.marketImage = marketImage;
	}
    
}