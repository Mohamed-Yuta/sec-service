package com.sig.secservice.sec.web;

import com.sig.secservice.sec.entities.AppRole;
import com.sig.secservice.sec.entities.AppUser;
import com.sig.secservice.sec.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountRestController {
    private  final AccountService accountService ;
    @GetMapping(path = "/users")
    public List<AppUser> list(){
        return accountService.lisUsers();
    }
    @PostMapping(path = "/users")
    AppUser saveUser(@RequestBody AppUser appUser){
        return accountService.addNewUser(appUser);
    }
    @PostMapping(path = "/roles")
    AppRole saveRole(@RequestBody AppRole appRole){
        return accountService.addNewRole(appRole);
    }
    @PostMapping(path = "/addRoleToUser")
    void addRoleToUser(@RequestBody RoleUserForm roleUserForm){
         accountService.addRoleToUser(roleUserForm.getUsername(),roleUserForm.getRoleName());
    }

}
@Data
class RoleUserForm {
    private String username ;
    private String roleName ;
}