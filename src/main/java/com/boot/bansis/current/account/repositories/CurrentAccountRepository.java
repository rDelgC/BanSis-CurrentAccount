package com.boot.bansis.current.account.repositories;

import com.boot.bansis.current.account.entities.CurrentAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Demn
 */
@Repository
public interface CurrentAccountRepository extends ReactiveMongoRepository<CurrentAccount, String> {

}
