package serviceImpl;
import javax.swing.JOptionPane;

import domain.Account;
import service.AccountService;//비즈니스 로직
public class AccountServiceImpl implements AccountService {
	Account[] list ;
	int count ;
	public AccountServiceImpl() {
		list = new Account[10] ;
		count = 0;
	}
	public void addList(Account account) {
		list[count++] = account;
	}
	@Override
	public Account createAccount(String name, String uid, String password) {
		return new Account(
				name,uid,password
				);
	}
	public Account[] list() {
		return list;
	}
	@Override
	public int deposit(int restMoney, String money) {
		
		return 0;
	}

	@Override
	public int withdraw(int restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		String result = "";
		for(int i = 0;i<count;i++) {
			result += list()[i].toString();
			return result;
		}
		return null;
	}
	@Override
	public int deposit(String money) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int withdraw(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
