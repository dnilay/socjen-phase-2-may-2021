package com.example;

import java.util.UUID;

public class Tester {

    public static void main(String args[]) throws InvalidAmountException {
        Account myAccount=new Account();
        String str[]= UUID.randomUUID().toString().split("-");
        myAccount.setAccountId(str[0]);
        myAccount.setAccountName("John Doe");
        myAccount.setAccountType(AccountType.LOAN);
        myAccount.setAmount(100);
        System.out.println(myAccount);


    }
}
