package com.qzx.tx;

public class AccountServiceImpl implements AccountService {
//	@Autowired
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
//	@Transactional(propagation = Propagation.SUPPORTS)
	public void transfer(String outUser, String inUser, int money) {
		try {
			this.accountDao.out(outUser, money);
//			this.accountDao.in(inUser, money);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
