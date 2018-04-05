/**
 * 
 */
package babasport_common.utils;

import java.io.Serializable;

/**
 *  时间工具类
 * @author Administrator
 *
 */
public class TimeUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4049030089401424499L;

	private String name;
	private Long age;
	
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
