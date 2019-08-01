package com.paul.springboottransactional.Mapper;

import com.paul.springboottransactional.Dao.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author paul
 * @date 2019/8/1 10:08
 */
@Mapper
public interface AccountMapper {
    @Select("select * from account where account_id=1")
    Account getAccount();

    @Update("update account set balance = balance+100 where account_id=1")
    void addMoney();
}
