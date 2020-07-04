package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9360c;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bd */
public class C8508bd extends C8538c {
    @C6593c(mo15949a = "confluence_type")

    /* renamed from: A */
    public int f23317A;
    @C6593c(mo15949a = "inviter_rival_extra")

    /* renamed from: B */
    public RivalExtraInfo f23318B;
    @C6593c(mo15949a = "message_type")

    /* renamed from: a */
    public int f23319a;
    @C6593c(mo15949a = "app_id")

    /* renamed from: b */
    public String f23320b;
    @C6593c(mo15949a = "app_sign")

    /* renamed from: c */
    public String f23321c;
    @C6593c(mo15949a = "access_key")

    /* renamed from: d */
    public String f23322d;
    @C6593c(mo15949a = "anchor_linkmic_id")

    /* renamed from: e */
    public int f23323e;
    @C6593c(mo15949a = "user_id")

    /* renamed from: f */
    public long f23324f;
    @C6593c(mo15949a = "fan_ticket")

    /* renamed from: g */
    public long f23325g;
    @C6593c(mo15949a = "total_linkmic_fan_ticket")

    /* renamed from: h */
    long f23326h;
    @C6593c(mo15949a = "channel_id")

    /* renamed from: i */
    public long f23327i;
    @C6593c(mo15949a = "layout")

    /* renamed from: j */
    public int f23328j;
    @C6593c(mo15949a = "vendor")

    /* renamed from: k */
    public int f23329k;
    @C6593c(mo15949a = "dimension")

    /* renamed from: l */
    public int f23330l;
    @C6593c(mo15949a = "theme")

    /* renamed from: m */
    public String f23331m;
    @C6593c(mo15949a = "invite_uid")

    /* renamed from: n */
    public long f23332n;
    @C6593c(mo15949a = "answer")

    /* renamed from: o */
    public int f23333o;
    @C6593c(mo15949a = "start_time_ms")

    /* renamed from: p */
    public long f23334p;
    @C6593c(mo15949a = "duration")

    /* renamed from: q */
    public int f23335q;
    @C6593c(mo15949a = "user_scores")

    /* renamed from: r */
    public List<C9360c> f23336r;
    @C6593c(mo15949a = "match_type")

    /* renamed from: s */
    public int f23337s;
    @C6593c(mo15949a = "win")

    /* renamed from: t */
    public boolean f23338t;
    @C6593c(mo15949a = "prompts")

    /* renamed from: u */
    public String f23339u;
    @C6593c(mo15949a = "to_user_id")

    /* renamed from: v */
    public long f23340v;
    @C6593c(mo15949a = "from_room_id")

    /* renamed from: w */
    public long f23341w;
    @C6593c(mo15949a = "tips")

    /* renamed from: x */
    public String f23342x;
    @C6593c(mo15949a = "invite_type")

    /* renamed from: y */
    public int f23343y;
    @C6593c(mo15949a = "sub_type")

    /* renamed from: z */
    public long f23344z;

    public C8508bd() {
        this.type = MessageType.LINK_MIC;
    }
}
