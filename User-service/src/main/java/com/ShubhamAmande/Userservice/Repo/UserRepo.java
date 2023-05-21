package com.ShubhamAmande.Userservice.Repo;

import com.ShubhamAmande.Userservice.Entity.Custom_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Custom_User,Long> {
}
