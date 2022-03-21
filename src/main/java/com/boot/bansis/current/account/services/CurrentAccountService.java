package com.boot.bansis.current.account.services;

import com.boot.bansis.current.account.entities.CurrentAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
public interface CurrentAccountService {

    public Flux<CurrentAccount> findAll();
    
    public Mono<CurrentAccount> save(CurrentAccount currentAccount);
}
