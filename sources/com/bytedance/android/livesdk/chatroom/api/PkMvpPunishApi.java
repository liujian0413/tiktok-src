package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface PkMvpPunishApi {

    /* renamed from: a */
    public static final C4252a f12415a = C4252a.f12416a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.PkMvpPunishApi$a */
    public static final class C4252a {

        /* renamed from: a */
        static final /* synthetic */ C4252a f12416a = new C4252a();

        private C4252a() {
        }
    }

    @C6457h(mo15740a = "/webcast/linkmic/battle/control_punish/")
    C7492s<Void> controlPunishEffect(@C6474y(mo15757a = "control_type") int i, @C6474y(mo15757a = "from_user_id") Long l, @C6474y(mo15757a = "from_user_type") Integer num, @C6474y(mo15757a = "from_room_id") Long l2, @C6474y(mo15757a = "punish_effect_id") Long l3, @C6474y(mo15757a = "channel_id") Long l4, @C6474y(mo15757a = "battle_id") Long l5, @C6474y(mo15757a = "end_reason") Integer num2);
}
