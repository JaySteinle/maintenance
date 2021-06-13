package com.example.maintenance.models;

import javax.validation.constraints.NotNull;

public class user {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;


    @NotNull
    private String email;
}
