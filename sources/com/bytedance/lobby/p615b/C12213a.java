package com.bytedance.lobby.p615b;

import android.os.Bundle;

/* renamed from: com.bytedance.lobby.b.a */
public final class C12213a {

    /* renamed from: a */
    private Bundle f32473a;

    /* renamed from: a */
    public final Bundle mo29944a() {
        return m35479b();
    }

    /* renamed from: b */
    private synchronized Bundle m35479b() {
        if (this.f32473a == null) {
            this.f32473a = new Bundle();
        }
        return this.f32473a;
    }

    /* renamed from: a */
    public final C12213a mo29945a(String str, String str2) {
        m35479b().putString(str, str2);
        return this;
    }
}
