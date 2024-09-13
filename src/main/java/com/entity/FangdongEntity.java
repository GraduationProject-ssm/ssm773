package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 房东
 *
 * @author 
 * @email
 */
@TableName("fangdong")
public class FangdongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangdongEntity() {

	}

	public FangdongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 房东姓名
     */
    @TableField(value = "fangdong_name")

    private String fangdongName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身份证号
     */
    @TableField(value = "fangdong_id_number")

    private String fangdongIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "fangdong_phone")

    private String fangdongPhone;


    /**
     * 照片
     */
    @TableField(value = "fangdong_photo")

    private String fangdongPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：房东姓名
	 */
    public String getFangdongName() {
        return fangdongName;
    }


    /**
	 * 获取：房东姓名
	 */

    public void setFangdongName(String fangdongName) {
        this.fangdongName = fangdongName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getFangdongIdNumber() {
        return fangdongIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setFangdongIdNumber(String fangdongIdNumber) {
        this.fangdongIdNumber = fangdongIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getFangdongPhone() {
        return fangdongPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setFangdongPhone(String fangdongPhone) {
        this.fangdongPhone = fangdongPhone;
    }
    /**
	 * 设置：照片
	 */
    public String getFangdongPhoto() {
        return fangdongPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setFangdongPhoto(String fangdongPhoto) {
        this.fangdongPhoto = fangdongPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fangdong{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", fangdongName=" + fangdongName +
            ", sexTypes=" + sexTypes +
            ", fangdongIdNumber=" + fangdongIdNumber +
            ", fangdongPhone=" + fangdongPhone +
            ", fangdongPhoto=" + fangdongPhoto +
            ", createTime=" + createTime +
        "}";
    }
}
