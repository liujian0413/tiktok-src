package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.g */
public final class C4905g {
    @C6593c(mo15949a = "has_more")

    /* renamed from: a */
    public boolean f14024a;
    @C6593c(mo15949a = "ranks")

    /* renamed from: b */
    public List<C4906a> f14025b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.g$a */
    public static class C4906a {
        @C6593c(mo15949a = "fansclub")

        /* renamed from: a */
        public C4907a f14026a;
        @C6593c(mo15949a = "anchor")

        /* renamed from: b */
        public User f14027b;
        @C6593c(mo15949a = "rank")

        /* renamed from: c */
        public int f14028c;

        /* renamed from: com.bytedance.android.livesdk.chatroom.model.g$a$a */
        public static class C4907a {
            @C6593c(mo15949a = "intimacy")

            /* renamed from: a */
            public int f14029a;
            @C6593c(mo15949a = "level")

            /* renamed from: b */
            public int f14030b;
            @C6593c(mo15949a = "status")

            /* renamed from: c */
            public int f14031c;
            @C6593c(mo15949a = "auto_renewal")

            /* renamed from: d */
            public int f14032d;
            @C6593c(mo15949a = "badge")

            /* renamed from: e */
            public C4908a f14033e;

            /* renamed from: com.bytedance.android.livesdk.chatroom.model.g$a$a$a */
            public static class C4908a {
                @C6593c(mo15949a = "title")

                /* renamed from: a */
                public String f14034a;
                @C6593c(mo15949a = "icon")

                /* renamed from: b */
                public ImageModel f14035b;
            }
        }
    }
}
