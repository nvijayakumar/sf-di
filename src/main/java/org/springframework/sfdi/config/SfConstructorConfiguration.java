/**
 * 
 */
package org.springframework.sfdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author vijayakumar
 * @Since  30-Jan-2022
 *
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfConstructorConfiguration {

	private final String username;
	private final String password;
	private final String jdbcurl;
	
	public SfConstructorConfiguration(String username, String password, String jdbcurl) {
		this.username = username;
		this.password = password;
		this.jdbcurl = jdbcurl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SfConstructorConfiguration [username=").append(username).append(", password=").append(password)
				.append(", jdbcurl=").append(jdbcurl).append("]");
		return builder.toString();
	}
	
}
