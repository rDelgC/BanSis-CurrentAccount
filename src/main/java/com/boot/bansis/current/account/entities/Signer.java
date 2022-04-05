package com.boot.bansis.current.account.entities;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
public class Signer {

    @Field("client_id")
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

}
