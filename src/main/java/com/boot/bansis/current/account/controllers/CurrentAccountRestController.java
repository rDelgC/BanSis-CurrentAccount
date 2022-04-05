package com.boot.bansis.current.account.controllers;

import com.boot.bansis.current.account.entities.CurrentAccount;
import com.boot.bansis.current.account.services.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
@RestController
@RequestMapping("/cu-accounts")
public class CurrentAccountRestController {

    @Autowired
    private CurrentAccountService currentAccountService;

    @GetMapping("/")
    public Flux<CurrentAccount> getAll() {
        return currentAccountService.findAll();
    }

    @PostMapping("/save")
    public Mono<CurrentAccount> save(@RequestBody CurrentAccount currentAccount) {
        return currentAccountService.save(currentAccount);
    }

}
