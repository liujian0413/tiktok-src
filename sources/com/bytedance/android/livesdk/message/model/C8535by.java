package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.message.model.by */
public final class C8535by extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23462a;
    @C6593c(mo15949a = "luckymoney_id")

    /* renamed from: b */
    public long f23463b;
    @C6593c(mo15949a = "diamond_count")

    /* renamed from: c */
    public int f23464c;
    @C6593c(mo15949a = "send_time")

    /* renamed from: d */
    public int f23465d;
    @C6593c(mo15949a = "delay_time")

    /* renamed from: e */
    public int f23466e;
    @C6593c(mo15949a = "style")

    /* renamed from: f */
    public int f23467f;
    @C6593c(mo15949a = "lucky_icon")

    /* renamed from: g */
    public ImageModel f23468g;
    @C6593c(mo15949a = "is_official")

    /* renamed from: h */
    public boolean f23469h;
    @C6593c(mo15949a = "background")

    /* renamed from: i */
    public ImageModel f23470i;

    /* renamed from: j */
    public transient boolean f23471j;

    /* renamed from: k */
    public transient WeakReference<C4343b> f23472k;

    public final boolean canText() {
        return true;
    }

    public C8535by() {
        this.type = MessageType.LUCKY_BOX;
    }

    /* renamed from: a */
    public final int mo21668a() {
        if (this.f23466e <= 0) {
            return 0;
        }
        int a = this.f23466e - (((int) (C9048ao.m27015a() / 1000)) - this.f23465d);
        if (a > 0) {
            return a;
        }
        return 0;
    }

    /* renamed from: a */
    public static C8535by m25768a(C8512bh bhVar) {
        C8535by byVar = new C8535by();
        byVar.baseMessage = bhVar.baseMessage;
        byVar.f23462a = bhVar.f23362a;
        byVar.f23463b = bhVar.f23363b;
        byVar.f23464c = bhVar.f23368g;
        byVar.f23465d = (int) (bhVar.f23364c / 1000);
        byVar.f23466e = bhVar.f23365d;
        byVar.f23468g = bhVar.f23374m;
        byVar.f23469h = bhVar.f23373l;
        byVar.f23470i = bhVar.f23372k;
        return byVar;
    }
}
