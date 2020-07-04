package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.z */
public class C8696z extends C8538c implements C8455b {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23700a;
    @C6593c(mo15949a = "to_user")

    /* renamed from: b */
    public User f23701b;
    @C6593c(mo15949a = "gift_id")

    /* renamed from: c */
    public long f23702c;
    @C6593c(mo15949a = "repeat_count")

    /* renamed from: d */
    public int f23703d;
    @C6593c(mo15949a = "fan_ticket_count")

    /* renamed from: e */
    public long f23704e;
    @C6593c(mo15949a = "room_fan_ticket_count")

    /* renamed from: f */
    public long f23705f;
    @C6593c(mo15949a = "compose")

    /* renamed from: g */
    public C8473aa f23706g;
    @C6593c(mo15949a = "priority")

    /* renamed from: h */
    public C8488an f23707h;

    /* renamed from: i */
    public transient boolean f23708i;

    /* renamed from: a */
    public final C8488an mo21628a() {
        return this.f23707h;
    }

    /* renamed from: b */
    public final boolean mo21629b() {
        return this.f23708i;
    }

    public C8696z() {
        this.type = MessageType.DOODLE_GIFT;
    }

    public boolean canText() {
        if (this.f23700a != null) {
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
        StringBuilder sb = new StringBuilder("DoodleGiftMessage{fromUserId=");
        long j2 = 0;
        if (this.f23700a != null) {
            j = this.f23700a.getId();
        } else {
            j = 0;
        }
        sb.append(j);
        sb.append(", toUserId=");
        if (this.f23701b != null) {
            j2 = this.f23701b.getId();
        }
        sb.append(j2);
        sb.append(", giftId=");
        sb.append(this.f23702c);
        sb.append(", repeatCount=");
        sb.append(this.f23703d);
        sb.append(", fanTicketCount=");
        sb.append(this.f23704e);
        sb.append(", compose=");
        sb.append(C2317a.m9932a().mo15979b((Object) this.f23706g));
        sb.append('}');
        return sb.toString();
    }
}
