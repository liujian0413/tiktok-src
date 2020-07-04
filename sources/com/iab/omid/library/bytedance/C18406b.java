package com.iab.omid.library.bytedance;

import android.content.Context;
import com.iab.omid.library.bytedance.p789b.C18408b;
import com.iab.omid.library.bytedance.p789b.C18411c;
import com.iab.omid.library.bytedance.p789b.C18416g;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18426d;

/* renamed from: com.iab.omid.library.bytedance.b */
public final class C18406b {

    /* renamed from: a */
    public boolean f49937a;

    /* renamed from: b */
    private static void m60591b(Context context) {
        C18426d.m60669a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47831a(Context context) {
        m60591b(context);
        if (!this.f49937a) {
            this.f49937a = true;
            C18416g.m60629a().mo47854a(context);
            C18408b.m60600a().mo47837a(context);
            C18423b.m60652a(context);
            C18411c.m60611a().mo47843a(context);
        }
    }
}
