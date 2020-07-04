package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: com.bytedance.lobby.auth.c */
public final class C12198c {

    /* renamed from: a */
    public final FragmentActivity f32457a;

    /* renamed from: b */
    public final String f32458b;

    /* renamed from: c */
    public final C12196a f32459c;

    /* renamed from: d */
    private final Bundle f32460d;

    /* renamed from: com.bytedance.lobby.auth.c$a */
    public static class C12200a {

        /* renamed from: a */
        public String f32461a;

        /* renamed from: b */
        public FragmentActivity f32462b;

        /* renamed from: c */
        public C12196a f32463c;

        /* renamed from: d */
        public Bundle f32464d;

        /* renamed from: a */
        public final C12198c mo29934a() {
            return new C12198c(this);
        }

        /* renamed from: a */
        public final C12200a mo29932a(C12196a aVar) {
            this.f32463c = aVar;
            return this;
        }

        public C12200a(FragmentActivity fragmentActivity) {
            this.f32462b = fragmentActivity;
        }

        /* renamed from: a */
        public final C12200a mo29933a(String str) {
            this.f32461a = str;
            return this;
        }

        /* renamed from: a */
        public final C12200a mo29931a(Bundle bundle) {
            if (this.f32464d == null) {
                this.f32464d = bundle;
            } else {
                this.f32464d.putAll(bundle);
            }
            return this;
        }
    }

    /* renamed from: a */
    public final Bundle mo29930a() {
        if (this.f32460d == null) {
            return new Bundle();
        }
        return this.f32460d;
    }

    private C12198c(C12200a aVar) {
        this.f32458b = aVar.f32461a;
        this.f32457a = aVar.f32462b;
        this.f32459c = aVar.f32463c;
        this.f32460d = aVar.f32464d;
    }
}
