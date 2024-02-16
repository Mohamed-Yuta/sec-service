package com.sig.secservice.sec.service;

import com.sig.secservice.sec.entities.AppRole;
import com.sig.secservice.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String userName , String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> lisUsers();

}
