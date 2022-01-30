/**
 * 
 */
package org.springframework.sfdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author vijayakumar
 * @Since  30-Jan-2022
 *
 */
@ConfigurationProperties("guru")
@Configuration
public class SfConfiguration {

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
		builder.append("SfConfiguration [username=").append(username).append(", password=").append(password)
				.append(", jdbcurl=").append(jdbcurl).append("]");
		return builder.toString();
	}
	
}
