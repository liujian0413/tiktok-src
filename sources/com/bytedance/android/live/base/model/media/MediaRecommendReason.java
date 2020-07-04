package com.bytedance.android.live.base.model.media;

import com.google.gson.p276a.C6593c;

public class MediaRecommendReason {
    public static final int TYPE_FRIENDSHIP = 2;
    public static final int TYPE_LOCATION = 1;
    @C6593c(mo15949a = "city")
    private String city;
    @C6593c(mo15949a = "friend_name")
    private String friendName;
    @C6593c(mo15949a = "reason")
    private String reason;
    @C6593c(mo15949a = "type")
    private int type;

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
