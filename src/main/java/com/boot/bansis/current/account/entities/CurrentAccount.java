package com.boot.bansis.current.account.entities;

import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("current_account")
public class CurrentAccount {

    @Id
    private String id;

    @Field("account_number")
    private String accountNumber;

    @Field("interbank_account_code")
    private String interbankAccountCode;

    @Field("currency")
    private String currency;

    @Field("available_balance")
    private double availableBalance;

    @Field("holders")
    private Set<Holder> holders;

    @Field("authorized_signers;")
    private Set<Signer> authorizedSigners;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

}
