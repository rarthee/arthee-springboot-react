package com.springdemo.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QATeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(QATeamApplication.class, args);
	}


	/*@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT TOP 10 * FROM QA_TEAM";

		List<Resources> resource = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Resources.class));

	}
*/
}
