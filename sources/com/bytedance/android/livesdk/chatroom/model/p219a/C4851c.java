package com.bytedance.android.livesdk.chatroom.model.p219a;

import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.c */
public class C4851c extends C8538c {
    @C6593c(mo15949a = "mode")

    /* renamed from: a */
    public int f13853a;
    @C6593c(mo15949a = "steal_tower_data")

    /* renamed from: b */
    public C4852a f13854b;
    @C6593c(mo15949a = "now")

    /* renamed from: c */
    public long f13855c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.a.c$a */
    public static class C4852a {
        @C6593c(mo15949a = "start_time")

        /* renamed from: a */
        public long f13856a;
        @C6593c(mo15949a = "finish_time")

        /* renamed from: b */
        public long f13857b;
        @C6593c(mo15949a = "duration")

        /* renamed from: c */
        public int f13858c;
        @C6593c(mo15949a = "open_score")

        /* renamed from: d */
        public int f13859d;
        @C6593c(mo15949a = "target_score")

        /* renamed from: e */
        public int f13860e;
        @C6593c(mo15949a = "attacker_id")

        /* renamed from: f */
        public long f13861f;
        @C6593c(mo15949a = "finish")

        /* renamed from: g */
        public boolean f13862g;
        @C6593c(mo15949a = "win")

        /* renamed from: h */
        public int f13863h;
        @C6593c(mo15949a = "trigger_time")

        /* renamed from: i */
        public int f13864i;
        @C6593c(mo15949a = "count")

        /* renamed from: j */
        public int f13865j;
    }

    public C4851c() {
        this.type = MessageType.BATTLE_MODE;
    }
}
