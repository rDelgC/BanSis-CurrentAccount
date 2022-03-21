package com.boot.bansis.current.account.services.impl;

import com.boot.bansis.current.account.entities.CurrentAccount;
import com.boot.bansis.current.account.repositories.CurrentAccountRepository;
import com.boot.bansis.current.account.services.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

    @Autowired
    private CurrentAccountRepository currentAccountDao;

    @Override
    public Flux<CurrentAccount> findAll() {
        return currentAccountDao.findAll();
    }

    @Override
    public Mono<CurrentAccount> save(CurrentAccount currentAccount) {
        return currentAccountDao.save(currentAccount);
    }
}
