package com.sig.secservice.sec.sec.service;

import com.sig.secservice.sec.entities.AppRole;
import com.sig.secservice.sec.entities.AppUser;
import com.sig.secservice.sec.repositories.AppRoleRepository;
import com.sig.secservice.sec.repositories.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AppUserRepository appUserRepository ;
    private  final AppRoleRepository appRoleRepository;
    @Override
    public AppUser addNewUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }
    @Override
    public AppRole addNewRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }
    @Override
    public void addRoleToUser(String userName, String roleName) {
        AppUser appUser = appUserRepository.findByUsername(userName);
        AppRole appRole = appRoleRepository.findByRoleName(roleName);
        appUser.getAppRoles().add(appRole);
        appUserRepository.save(appUser);
    }
    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }
    @Override
    public List<AppUser> lisUsers() {
        return appUserRepository.findAll();
    }
}
