/**
 * 
 */
package org.springframework.sfdi.datasource;

/**
 * @author vijayakumar
 * @Since  29-Jan-2022
 *
 */
public class FakeDataSource {

	private String username;
	private String password;
	private String jdbcurl;
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getJdbcurl() {
		return jdbcurl;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FakeDataSource [username=").append(username).append(", password=").append(password)
				.append(", jdbcurl=").append(jdbcurl).append("]");
		return builder.toString();
	}
	
}
