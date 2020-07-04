package com.p280ss.android.ugc.aweme.friends.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.friends.model.Friend */
public class Friend extends User {
    private boolean invited;
    private boolean isFirstOne;
    @C6593c(mo15949a = "social_name")
    private String socialName;

    public String getSocialName() {
        return this.socialName;
    }

    public boolean isFirstOne() {
        return this.isFirstOne;
    }

    public boolean isInvited() {
        return this.invited;
    }

    public void setFirstOne(boolean z) {
        this.isFirstOne = z;
    }

    public void setInvited(boolean z) {
        this.invited = z;
    }

    public void setSocialName(String str) {
        this.socialName = str;
    }

    public Friend(String str) {
        this.socialName = str;
    }

    public static Friend copyFrom(User user) {
        Field[] declaredFields;
        if (user == null) {
            return null;
        }
        if (user instanceof Friend) {
            return (Friend) user;
        }
        Friend friend = new Friend(null);
        for (Field field : User.class.getDeclaredFields()) {
            if (((C6593c) field.getAnnotation(C6593c.class)) != null) {
                field.setAccessible(true);
                try {
                    field.set(friend, field.get(user));
                } catch (IllegalAccessException unused) {
                }
            }
        }
        return friend;
    }
}
