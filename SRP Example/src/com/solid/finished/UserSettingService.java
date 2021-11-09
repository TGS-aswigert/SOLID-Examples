package com.solid.finished;

public class UserSettingService {
    public void changeEmail(User user) {
        if(SecurityService.checkAccess(user)) {
            user.setEmail(user.name + "@email.com");
        }
    }
}
