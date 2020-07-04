package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.relay.p392a.C8269a;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.aj */
public class C8483aj extends C8538c {
    @C6593c(mo15949a = "gift_id")

    /* renamed from: a */
    public long f23224a;
    @C6593c(mo15949a = "fan_ticket_count")

    /* renamed from: b */
    public long f23225b;
    @C6593c(mo15949a = "group_count")

    /* renamed from: c */
    public long f23226c;
    @C6593c(mo15949a = "repeat_count")

    /* renamed from: d */
    public long f23227d;
    @C6593c(mo15949a = "combo_count")

    /* renamed from: e */
    public long f23228e;
    @C6593c(mo15949a = "user")

    /* renamed from: f */
    public User f23229f;
    @C6593c(mo15949a = "to_user")

    /* renamed from: g */
    public User f23230g;
    @C6593c(mo15949a = "free_cell")

    /* renamed from: h */
    public C8269a f23231h;

    /* renamed from: i */
    public boolean f23232i;

    public boolean canText() {
        if (this.f23229f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C8489ao m25748a(C8483aj ajVar) {
        if (ajVar == null) {
            return null;
        }
        C8489ao aoVar = new C8489ao();
        aoVar.f23265n = ajVar.f23232i;
        aoVar.baseMessage = ajVar.baseMessage;
        aoVar.f23254c = ajVar.f23224a;
        aoVar.f23256e = (int) ajVar.f23225b;
        aoVar.f23260i = (int) ajVar.f23226c;
        aoVar.f23255d = (int) ajVar.f23227d;
        aoVar.f23259h = (int) ajVar.f23228e;
        aoVar.f23252a = ajVar.f23229f;
        aoVar.f23253b = ajVar.f23230g;
        aoVar.f23258g = 0;
        return aoVar;
    }
}
