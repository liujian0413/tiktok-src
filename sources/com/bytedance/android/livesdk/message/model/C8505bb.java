package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4861l;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bb */
public class C8505bb extends C8538c {
    @C6593c(mo15949a = "message_type")

    /* renamed from: a */
    public int f23302a;
    @C6593c(mo15949a = "punish_effect_list")

    /* renamed from: b */
    public List<C4861l> f23303b;
    @C6593c(mo15949a = "prompts")

    /* renamed from: c */
    public String f23304c;
    @C6593c(mo15949a = "mvp")

    /* renamed from: d */
    public User f23305d;
    @C6593c(mo15949a = "medicine_count")

    /* renamed from: e */
    public int f23306e;
    @C6593c(mo15949a = "target_effect")

    /* renamed from: f */
    public C4861l f23307f;
    @C6593c(mo15949a = "start_time")

    /* renamed from: g */
    public long f23308g;
    @C6593c(mo15949a = "target_user")

    /* renamed from: h */
    public User f23309h;
    @C6593c(mo15949a = "speedy_gift_id")

    /* renamed from: i */
    public long f23310i;
    @C6593c(mo15949a = "duration")

    /* renamed from: j */
    public long f23311j;
    @C6593c(mo15949a = "channel_id")

    /* renamed from: k */
    public long f23312k;
    @C6593c(mo15949a = "battle_id")

    /* renamed from: l */
    public long f23313l;

    public C8505bb() {
        this.type = MessageType.LINK_MIC_BATTLE_PUNISH;
    }
}
