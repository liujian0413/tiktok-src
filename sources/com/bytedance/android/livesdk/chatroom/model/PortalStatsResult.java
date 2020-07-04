package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p276a.C6593c;
import java.util.List;

public final class PortalStatsResult {
    @C6593c(mo15949a = "portals")

    /* renamed from: a */
    public List<C4847a> f13833a;

    public enum PortalStatus {
        NONE,
        CREATED,
        INVITED,
        REWARDED,
        FINISHED
    }

    public enum PortalUserType {
        AUDIENCE,
        SUGAR_DADDY,
        ANCHOR
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a */
    public static class C4847a {
        @C6593c(mo15949a = "start_time")

        /* renamed from: a */
        public long f13834a;
        @C6593c(mo15949a = "enter_count")

        /* renamed from: b */
        public long f13835b;
        @C6593c(mo15949a = "sugar_daddy")

        /* renamed from: c */
        public User f13836c;
        @C6593c(mo15949a = "anchor")

        /* renamed from: d */
        public User f13837d;
        @C6593c(mo15949a = "room_id")

        /* renamed from: e */
        public long f13838e;
        @C6593c(mo15949a = "portal_id")

        /* renamed from: f */
        public long f13839f;
        @C6593c(mo15949a = "user_type")

        /* renamed from: g */
        public int f13840g;
        @C6593c(mo15949a = "invitee_count")

        /* renamed from: h */
        public long f13841h;
        @C6593c(mo15949a = "status")

        /* renamed from: i */
        public int f13842i;
    }
}
