package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.live.base.model.user.User;

public class UserProfileEvent {
    public static final String SOURCE_BARRAGE = "live_barrage";
    public static final String SOURCE_COMMENT = "live_comment";
    public String interactLogLabel;
    public String mClickUserPosition;
    public String mEventModule;
    public String mSource;
    public User user;
    public long userId;

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public UserProfileEvent(long j) {
        this.userId = j;
    }

    public UserProfileEvent(User user2) {
        if (user2 != null) {
            this.user = user2;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public UserProfileEvent(User user2, String str) {
        this(user2);
        this.interactLogLabel = str;
    }
}
