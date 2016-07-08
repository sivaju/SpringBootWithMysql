package com.iicinf.datamod;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sivakrishna on 7/1/2016.
 */
public interface UserRepository extends JpaRepository<User,Long>
{
//    User delete(int i);

//    User findOne(Integer id);
}
