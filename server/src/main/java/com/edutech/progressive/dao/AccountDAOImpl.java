package com.edutech.progressive.dao;
 
import java.util.ArrayList;
import java.util.List;
 
import com.edutech.progressive.entity.Accounts;
 
public class AccountDAOImpl implements AccountDAO{
    private List<Accounts> accountList;
 
    public AccountDAOImpl() {
        this.accountList = new ArrayList<>();
    }
 
    @Override
    public int addAccount(Accounts accounts) {
        return -1;
    }
 
    @Override
    public Accounts getAccountById(int accountId) {
        return null;
    }
 
    @Override
    public void updateAccount(Accounts accounts) {
    }
 
    @Override
    public void deleteAccount(int accountId) {
    }
 
    @Override
    public List<Accounts> getAllAccounts() {
        return null;
    }
 
    @Override
    public List<Accounts> getAllAccountsByCustomer(int customer_id) {
        return accountList;
    }
}