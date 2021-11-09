package com.solid;

public class UserSettingService {
    public void changeEmail(User user) {
        if(checkAccess(user)) {
            user.setEmail(user.name + "@email.com");
        }
    }

    public boolean checkAccess(User user) {
        return user.isValid;
    }
}
