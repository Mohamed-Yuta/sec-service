package com.sig.secservice.sec.repositories;

import com.sig.secservice.sec.entities.AppRole;
import com.sig.secservice.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
}
