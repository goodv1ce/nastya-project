package ua.goodvice.easylib.easylib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.goodvice.easylib.easylib.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
