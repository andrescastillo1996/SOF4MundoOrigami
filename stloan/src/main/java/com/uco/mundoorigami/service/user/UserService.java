package com.uco.mundoorigami.service.user;


import com.uco.mundoorigami.domain.User;

import java.util.List;

public interface UserService {
    User save (User user);

    List<User> getAllByStatus(String status);
    public User findByEmail(String email);
    void delete(int code);

    User update(User user);
}
