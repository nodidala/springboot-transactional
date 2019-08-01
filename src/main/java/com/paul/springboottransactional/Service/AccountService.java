package com.paul.springboottransactional.Service;

import com.paul.springboottransactional.Dao.Account;
import com.paul.springboottransactional.Mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author paul
 * @date 2019/8/1 10:07
 */
@Service
public class AccountService {
    @SuppressWarnings("all")

    @Autowired
    private AccountMapper accountMapper;

    public Account getAccount() {
        return accountMapper.getAccount();
    }

    @Transactional
    public void addMoney() throws Exception {
        //先增加余额
        accountMapper.addMoney();
        //然后遇到故障
        throw new RuntimeException("发生异常了..");
    }
}
