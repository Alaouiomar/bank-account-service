package org.sid.bankaccountservice.service;

import org.sid.bankaccountservice.dto.BankAccountReponseDTO;
import org.sid.bankaccountservice.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice.entitties.BankAccount;

public interface AccountService {
    BankAccountReponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountReponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
