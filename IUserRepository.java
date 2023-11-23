/*created by Meghana Reddy
 * 23-11-23
 */
package com.tns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.User;

public interface IUserRepository extends JpaRepository<User , Long> {
	User addNewUser(User user);
	User updateUser(User user);
	User deleteUser(long id);

}
