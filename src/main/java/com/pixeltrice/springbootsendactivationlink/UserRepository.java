package com.pixeltrice.springbootsendactivationlink;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {

    UserEntity findByEmailIdIgnoreCase(String emailId);

}
