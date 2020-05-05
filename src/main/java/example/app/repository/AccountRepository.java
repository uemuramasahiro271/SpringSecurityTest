package example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.app.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>{

}
