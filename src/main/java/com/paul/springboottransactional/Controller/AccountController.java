package com.paul.springboottransactional.Controller;

import com.paul.springboottransactional.Dao.Account;
import com.paul.springboottransactional.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paul
 * @date 2019/8/1 10:06
 */

@RestController
public class AccountController {

    @SuppressWarnings("all")
    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public Account getAccount() {
        //查询账户
        return accountService.getAccount();
    }

    @GetMapping("/add")
    public Object addMoney() {
        try {
            accountService.addMoney();
        } catch (Exception e) {
            return "发生异常了：" + accountService.getAccount();
        }
        return getAccount();
    }
}
