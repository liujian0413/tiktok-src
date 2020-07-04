package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ao */
public class C8489ao extends C8538c implements C8455b {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23252a;
    @C6593c(mo15949a = "to_user")

    /* renamed from: b */
    public User f23253b;
    @C6593c(mo15949a = "gift_id")

    /* renamed from: c */
    public long f23254c;
    @C6593c(mo15949a = "repeat_count")

    /* renamed from: d */
    public int f23255d;
    @C6593c(mo15949a = "fan_ticket_count")

    /* renamed from: e */
    public int f23256e;
    @C6593c(mo15949a = "room_fan_ticket_count")

    /* renamed from: f */
    public long f23257f;
    @C6593c(mo15949a = "repeat_end")

    /* renamed from: g */
    public int f23258g;
    @C6593c(mo15949a = "combo_count")

    /* renamed from: h */
    public int f23259h;
    @C6593c(mo15949a = "group_count")

    /* renamed from: i */
    public int f23260i;
    @C6593c(mo15949a = "group_id")

    /* renamed from: j */
    public long f23261j;
    @C6593c(mo15949a = "text_effect")

    /* renamed from: k */
    public C8551cm f23262k;
    @C6593c(mo15949a = "income_taskgifts")

    /* renamed from: l */
    public long f23263l;

    /* renamed from: m */
    public boolean f23264m;

    /* renamed from: n */
    public transient boolean f23265n;
    @C6593c(mo15949a = "priority")

    /* renamed from: o */
    public C8488an f23266o;

    /* renamed from: a */
    public final C8488an mo21628a() {
        return this.f23266o;
    }

    /* renamed from: b */
    public final boolean mo21629b() {
        return this.f23265n;
    }

    public C8489ao() {
        this.type = MessageType.GIFT;
    }

    public boolean canText() {
        if (this.f23252a != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        StringBuilder sb = new StringBuilder("GiftMessage{fromUserId=");
        sb.append(this.f23252a);
        sb.append(", toUserId=");
        if (this.f23253b != null) {
            j = this.f23253b.getId();
        } else {
            j = 0;
        }
        sb.append(j);
        sb.append(", giftId=");
        sb.append(this.f23254c);
        sb.append(", repeatCount=");
        sb.append(this.f23255d);
        sb.append(", fanTicketCount=");
        sb.append(this.f23256e);
        sb.append(", repeatEnd=");
        sb.append(this.f23258g);
        sb.append(", comboCount=");
        sb.append(this.f23259h);
        sb.append(", groupCount=");
        sb.append(this.f23260i);
        sb.append(", groupId=");
        sb.append(this.f23261j);
        sb.append(", textEffect=");
        sb.append(C2317a.m9932a().mo15979b((Object) this.f23262k));
        sb.append(", incomeTaskgifts=");
        sb.append(this.f23263l);
        sb.append(", isUrgent=");
        sb.append(this.f23264m);
        sb.append(", isLocal=");
        sb.append(this.f23265n);
        sb.append('}');
        return sb.toString();
    }
}
