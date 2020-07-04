package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RoomStruct */
public class RoomStruct implements Serializable {
    @C6593c(mo15949a = "height")
    public int height;
    @C6593c(mo15949a = "room_id")
    public long roomId;
    @C6593c(mo15949a = "user_count")
    private int userCount;
    @C6593c(mo15949a = "width")
    public int width;

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
