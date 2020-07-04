package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g */
public class C21635g {

    /* renamed from: a */
    private final WeakReference<AppCompatActivity> f58067a;

    /* renamed from: h */
    public JSONObject f58068h;

    /* renamed from: i */
    public String f58069i;

    /* renamed from: j */
    public String f58070j = "";

    /* renamed from: k */
    public final ViewStub f58071k;

    /* renamed from: l */
    public C21636a f58072l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a */
    public interface C21636a {
        /* renamed from: a */
        void mo57784a(String str);
    }

    /* renamed from: a */
    public View mo57818a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AppCompatActivity mo57850d() {
        return (AppCompatActivity) this.f58067a.get();
    }

    /* renamed from: a */
    public final void mo57848a(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "fullJson");
        this.f58068h = jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo57851d(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f58070j = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo57852e(String str) {
        C21636a aVar = this.f58072l;
        if (aVar != null) {
            aVar.mo57784a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo57849b(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.ref.WeakReference<android.support.v7.app.AppCompatActivity> r0 = r2.f58067a
            java.lang.Object r0 = r0.get()
            android.support.v7.app.AppCompatActivity r0 = (android.support.p029v7.app.AppCompatActivity) r0
            if (r0 == 0) goto L_0x0013
            r1 = 2131822983(0x7f110987, float:1.9278753E38)
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = "Sorry, error occurred"
        L_0x0015:
            if (r4 != 0) goto L_0x0018
            return r0
        L_0x0018:
            if (r3 == 0) goto L_0x0027
            r3.intValue()
            int r3 = r3.intValue()
            r1 = 1066(0x42a, float:1.494E-42)
            if (r3 != r1) goto L_0x0026
            return r0
        L_0x0026:
            return r4
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.mo57849b(java.lang.Integer, java.lang.String):java.lang.String");
    }

    public C21635g(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "viewStub");
        this.f58071k = viewStub;
        this.f58072l = aVar;
        this.f58067a = new WeakReference<>(appCompatActivity);
    }
}
