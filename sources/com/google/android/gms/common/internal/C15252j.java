package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C15252j {

    /* renamed from: a */
    private static final Object f39451a = new Object();

    /* renamed from: b */
    private static C15252j f39452b;

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class C15253a {

        /* renamed from: a */
        public final String f39453a;

        /* renamed from: b */
        public final ComponentName f39454b = null;

        /* renamed from: c */
        public final int f39455c;

        /* renamed from: d */
        private final String f39456d;

        public C15253a(String str, String str2, int i) {
            this.f39456d = C15267r.m44386a(str);
            this.f39453a = C15267r.m44386a(str2);
            this.f39455c = i;
        }

        public final String toString() {
            return this.f39456d == null ? this.f39454b.flattenToString() : this.f39456d;
        }

        /* renamed from: a */
        public final Intent mo38602a(Context context) {
            if (this.f39456d != null) {
                return new Intent(this.f39456d).setPackage(this.f39453a);
            }
            return new Intent().setComponent(this.f39454b);
        }

        public final int hashCode() {
            return C15265q.m44379a(this.f39456d, this.f39453a, this.f39454b, Integer.valueOf(this.f39455c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15253a)) {
                return false;
            }
            C15253a aVar = (C15253a) obj;
            return C15265q.m44381a(this.f39456d, aVar.f39456d) && C15265q.m44381a(this.f39453a, aVar.f39453a) && C15265q.m44381a(this.f39454b, aVar.f39454b) && this.f39455c == aVar.f39455c;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo38531a(C15253a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo38532b(C15253a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public static C15252j m44362a(Context context) {
        synchronized (f39451a) {
            if (f39452b == null) {
                f39452b = new C15215ag(context.getApplicationContext());
            }
        }
        return f39452b;
    }

    /* renamed from: a */
    public final void mo38601a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo38532b(new C15253a(str, str2, i), serviceConnection, str3);
    }
}
