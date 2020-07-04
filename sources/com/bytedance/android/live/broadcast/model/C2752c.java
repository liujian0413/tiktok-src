package com.bytedance.android.live.broadcast.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.broadcast.model.c */
public final class C2752c {
    @C6593c(mo15949a = "enable_live_audio")

    /* renamed from: a */
    public boolean f8720a;
    @C6593c(mo15949a = "enable_live_third_party")

    /* renamed from: b */
    public boolean f8721b;
    @C6593c(mo15949a = "enable_live_screenshot")

    /* renamed from: c */
    public boolean f8722c;
    @C6593c(mo15949a = "toast")

    /* renamed from: d */
    public C2753a f8723d;

    /* renamed from: com.bytedance.android.live.broadcast.model.c$a */
    public static class C2753a {
        @C6593c(mo15949a = "new_anchor")

        /* renamed from: a */
        public boolean f8724a;
    }

    public C2752c() {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2752c)) {
            return false;
        }
        C2752c cVar = (C2752c) obj;
        if (this.f8720a == cVar.f8720a && this.f8721b == cVar.f8721b && this.f8722c == cVar.f8722c) {
            return true;
        }
        return false;
    }

    public C2752c(boolean z, boolean z2, boolean z3) {
        this.f8720a = z;
        this.f8721b = z2;
        this.f8722c = z3;
    }
}
