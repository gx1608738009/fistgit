package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
/**
 * ʵ��dao�з�����һ��������
 */
import entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// ����һ�������������û���Ϣ
        List<User> list=new ArrayList<User>();
        list.add(user);
        for(User user2:list) {
        	System.out.println(user2.getName()+","
        			+user2.getAge());
        }
	}

}
