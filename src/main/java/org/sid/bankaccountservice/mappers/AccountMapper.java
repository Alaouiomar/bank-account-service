package org.sid.bankaccountservice.mappers;

import org.sid.bankaccountservice.dto.BankAccountReponseDTO;
import org.sid.bankaccountservice.entitties.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountReponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountReponseDTO bankAccountReponseDTO = new BankAccountReponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountReponseDTO);
        return bankAccountReponseDTO ;
    }
}
