package gr.hua.dit.ds.DS_PR.repository;

import gr.hua.dit.ds.DS_PR.entity.ERole;
import gr.hua.dit.ds.DS_PR.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(ERole roleName);
}
