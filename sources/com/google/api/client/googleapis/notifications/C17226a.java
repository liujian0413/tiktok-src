package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.C17380v;
import com.google.api.client.util.C17380v.C17382a;
import com.google.api.client.util.C17384w;

/* renamed from: com.google.api.client.googleapis.notifications.a */
public abstract class C17226a {

    /* renamed from: a */
    public long f48007a;

    /* renamed from: b */
    public String f48008b;

    /* renamed from: c */
    public String f48009c;

    /* renamed from: d */
    public String f48010d;

    /* renamed from: e */
    public String f48011e;

    /* renamed from: f */
    public String f48012f;

    /* renamed from: g */
    public String f48013g;

    /* renamed from: h */
    public String f48014h;

    public String toString() {
        return mo44546a().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C17382a mo44546a() {
        return C17380v.m57842a(this).mo44870a("messageNumber", Long.valueOf(this.f48007a)).mo44870a("resourceState", this.f48008b).mo44870a("resourceId", this.f48009c).mo44870a("resourceUri", this.f48010d).mo44870a("channelId", this.f48011e).mo44870a("channelExpiration", this.f48012f).mo44870a("channelToken", this.f48013g).mo44870a("changed", this.f48014h);
    }

    /* renamed from: e */
    public C17226a mo44550e(String str) {
        this.f48012f = str;
        return this;
    }

    /* renamed from: f */
    public C17226a mo44551f(String str) {
        this.f48013g = str;
        return this;
    }

    /* renamed from: g */
    public C17226a mo44552g(String str) {
        this.f48014h = str;
        return this;
    }

    /* renamed from: a */
    public C17226a mo44544a(long j) {
        boolean z;
        if (j >= 1) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        this.f48007a = j;
        return this;
    }

    /* renamed from: b */
    public C17226a mo44547b(String str) {
        this.f48009c = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: c */
    public C17226a mo44548c(String str) {
        this.f48010d = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: d */
    public C17226a mo44549d(String str) {
        this.f48011e = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: a */
    public C17226a mo44545a(String str) {
        this.f48008b = (String) C17384w.m57847a(str);
        return this;
    }

    protected C17226a(C17226a aVar) {
        this(aVar.f48007a, aVar.f48008b, aVar.f48009c, aVar.f48010d, aVar.f48011e);
        mo44550e(aVar.f48012f);
        mo44551f(aVar.f48013g);
        mo44552g(aVar.f48014h);
    }

    private C17226a(long j, String str, String str2, String str3, String str4) {
        mo44544a(j);
        mo44545a(str);
        mo44547b(str2);
        mo44548c(str3);
        mo44549d(str4);
    }
}
