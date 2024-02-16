package com.sig.secservice.sec.sec.service;

import com.sig.secservice.sec.entities.AppRole;
import com.sig.secservice.sec.entities.AppUser;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public AppUser addNewUser(AppUser appUser) {
        return null;
    }

    @Override
    public AppRole addNewRole(AppRole appRole) {
        return null;
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {

    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return null;
    }

    @Override
    public List<AppUser> lisUsers() {
        return null;
    }
}
