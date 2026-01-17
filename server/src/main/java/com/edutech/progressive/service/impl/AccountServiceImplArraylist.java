package com.edutech.progressive.service.impl;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
import com.edutech.progressive.entity.Accounts;
// import com.edutech.progressive.service.AccountService;
 
public class AccountServiceImplArraylist implements AccountService{
    private static List<Accounts> accountList = new ArrayList<>();
 
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountList;
    }
 
    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        accountList.add(accounts);
        return accountList.size();
    }
 
    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        Collections.sort(accountList);
        return accountList;
    }
 
    public void emptyArrayList(){
        accountList.clear();
    }
}