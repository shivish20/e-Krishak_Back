package com.neebal.eKrishak.service.Impl;

import com.neebal.eKrishak.exception.UserFoundException;
import com.neebal.eKrishak.model.User;
import com.neebal.eKrishak.model.UserRole;
import com.neebal.eKrishak.repository.RoleRepository;
import com.neebal.eKrishak.repository.UserRepository;
import com.neebal.eKrishak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
    public class UserServiceImpl implements UserService {
        @Autowired
        private UserRepository userRepository;

        @Autowired
        private RoleRepository roleRepository;

        //creating user
        @Override
        public User createUser(User user, Set<UserRole> userRoles) throws Exception {


            User local = this.userRepository.findByUsername(user.getUsername());
            if (local != null) {
                System.out.println("User is already there !!");
                throw new UserFoundException();
            } else {
                //user create
                for (UserRole ur : userRoles) {
                    roleRepository.save(ur.getRole());
                }

                user.getUserRoles().addAll(userRoles);
                local = this.userRepository.save(user);

            }

            return local;
        }

        //getting user by username
        @Override
        public User getUser(String username) {
            return this.userRepository.findByUsername(username);
        }

        @Override
        public void deleteUser(Long userId) {
            this.userRepository.deleteById(userId);
        }


    }