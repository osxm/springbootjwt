/**
 * @Title: RootEntity.java
 * @Package com.edu.badou.core.entity
 * @Description: TODO
 * @author oscarchen
 * @date 2019年11月13日
 * @version V1.0
 */
package com.osxm.springbootjwt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

/**
  * @ClassName: RootEntity
  * @Description: TODO
  * @author oscarchen
  */
@MappedSuperclass
public abstract class RootEntity implements Serializable {

	   /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */

    private Date sysCreateTime;

    /**
     * 更新时间
     */

    private Date sysUpdateTime;

    /**
     * 创建人
     */

    private String sysCreator;

    /**
     * 更新人
     */

    private String sysUpdater;

    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    public String getSysCreator() {
        return sysCreator;
    }

    public void setSysCreator(String sysCreator) {
        this.sysCreator = sysCreator;
    }

    public String getSysUpdater() {
        return sysUpdater;
    }

    public void setSysUpdater(String sysUpdater) {
        this.sysUpdater = sysUpdater;
    }
}
