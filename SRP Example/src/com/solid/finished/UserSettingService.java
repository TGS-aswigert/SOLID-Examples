package com.solid.finished;

public class UserSettingService {
    public void changeEmail(User user, String newEmail) {
        if(SecurityService.checkAccess(user)) {
            user.setEmail(newEmail);
        }
    }

    public void changeName(User user, String newName) {
        if(SecurityService.checkAccess(user)) {
            user.setName(newName);
        }
    }
}
