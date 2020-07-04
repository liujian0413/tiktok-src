package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.C15271t;
import com.google.android.gms.common.util.C15337t;

/* renamed from: com.google.firebase.d */
public final class C18298d {

    /* renamed from: a */
    public final String f49724a;

    /* renamed from: b */
    public final String f49725b;

    /* renamed from: c */
    public final String f49726c;

    /* renamed from: d */
    public final String f49727d;

    /* renamed from: e */
    public final String f49728e;

    /* renamed from: f */
    public final String f49729f;

    /* renamed from: g */
    public final String f49730g;

    public final int hashCode() {
        return C15265q.m44379a(this.f49725b, this.f49724a, this.f49726c, this.f49727d, this.f49728e, this.f49729f, this.f49730g);
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("applicationId", this.f49725b).mo38611a("apiKey", this.f49724a).mo38611a("databaseUrl", this.f49726c).mo38611a("gcmSenderId", this.f49728e).mo38611a("storageBucket", this.f49729f).mo38611a("projectId", this.f49730g).toString();
    }

    /* renamed from: a */
    public static C18298d m60318a(Context context) {
        C15271t tVar = new C15271t(context);
        String a = tVar.mo38614a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C18298d dVar = new C18298d(a, tVar.mo38614a("google_api_key"), tVar.mo38614a("firebase_database_url"), tVar.mo38614a("ga_trackingId"), tVar.mo38614a("gcm_defaultSenderId"), tVar.mo38614a("google_storage_bucket"), tVar.mo38614a("project_id"));
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18298d)) {
            return false;
        }
        C18298d dVar = (C18298d) obj;
        if (!C15265q.m44381a(this.f49725b, dVar.f49725b) || !C15265q.m44381a(this.f49724a, dVar.f49724a) || !C15265q.m44381a(this.f49726c, dVar.f49726c) || !C15265q.m44381a(this.f49727d, dVar.f49727d) || !C15265q.m44381a(this.f49728e, dVar.f49728e) || !C15265q.m44381a(this.f49729f, dVar.f49729f) || !C15265q.m44381a(this.f49730g, dVar.f49730g)) {
            return false;
        }
        return true;
    }

    private C18298d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C15267r.m44391a(!C15337t.m44610a(str), (Object) "ApplicationId must be set.");
        this.f49725b = str;
        this.f49724a = str2;
        this.f49726c = str3;
        this.f49727d = str4;
        this.f49728e = str5;
        this.f49729f = str6;
        this.f49730g = str7;
    }
}
