package com.qzx.tx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl implements AccountDao {
	//	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 汇款的实现方法
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void out(String outUser, int money) {
		this.jdbcTemplate.update("update account set money = ? where username = ?", money, outUser);
//		for (int i = 1; i >= 0; --i) {
//			int a = 10 / i;
//		}
	}

	// 收款的实现方法
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public void in(String inUser, int money) {
		this.jdbcTemplate.update("update account set money = ? where username =?", money, inUser);
	}
}
