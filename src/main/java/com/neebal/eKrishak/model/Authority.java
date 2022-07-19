package com.neebal.eKrishak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
public class Authority implements GrantedAuthority {

    private String authority;

    //Spring security internally uses getAuthority() i.e simple string Ex: Admin,Normal..etc

}
