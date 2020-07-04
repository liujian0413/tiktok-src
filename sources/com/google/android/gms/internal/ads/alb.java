package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.api.C15043f;
import java.lang.ref.WeakReference;
import java.util.Map;

@C6505uv
public abstract class alb implements C15043f {

    /* renamed from: a */
    protected Context f40536a;

    /* renamed from: b */
    protected String f40537b;

    /* renamed from: c */
    protected WeakReference<aik> f40538c;

    public alb(aik aik) {
        this.f40536a = aik.getContext();
        this.f40537b = C14793ay.m42895a().mo39176b(this.f40536a, aik.mo39472k().f45677a);
        this.f40538c = new WeakReference<>(aik);
    }

    /* renamed from: a */
    public abstract void mo39647a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39648a(int i) {
    }

    /* renamed from: a */
    public abstract boolean mo39656a(String str);

    /* renamed from: b */
    public void mo38266b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo39659c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo39660d(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo39661e(int i) {
    }

    /* renamed from: a */
    public boolean mo39657a(String str, String[] strArr) {
        return mo39656a(str);
    }

    /* renamed from: a */
    public final void mo39651a(String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        Handler handler = afb.f40136a;
        ald ald = new ald(this, str, str2, i, 0, z, i3, i4);
        handler.post(ald);
    }

    /* renamed from: a */
    public final void mo39653a(String str, String str2, long j, long j2, boolean z) {
        Handler handler = afb.f40136a;
        ale ale = new ale(this, str, str2, j, j2, z);
        handler.post(ale);
    }

    /* renamed from: a */
    public final void mo39654a(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        Handler handler = afb.f40136a;
        alf alf = new alf(this, str, str2, j, j2, z, i, i2);
        handler.post(alf);
    }

    /* renamed from: a */
    public final void mo39650a(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        Handler handler = afb.f40136a;
        alg alg = new alg(this, str, str2, i, i2, j, j2, z, i3, i4);
        handler.post(alg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39649a(String str, String str2, int i) {
        afb.f40136a.post(new alh(this, str, str2, i));
    }

    /* renamed from: a */
    public final void mo39652a(String str, String str2, long j) {
        Handler handler = afb.f40136a;
        ali ali = new ali(this, str, str2, j);
        handler.post(ali);
    }

    /* renamed from: a */
    public final void mo39655a(String str, String str2, String str3, String str4) {
        Handler handler = afb.f40136a;
        alj alj = new alj(this, str, str2, str3, str4);
        handler.post(alj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo39658b(String str) {
        return afb.m45724a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String mo39672c(java.lang.String r2) {
        /*
            java.lang.String r0 = "internal"
            int r1 = r2.hashCode()
            switch(r1) {
                case -1947652542: goto L_0x007f;
                case -1396664534: goto L_0x0074;
                case -1347010958: goto L_0x006a;
                case -918817863: goto L_0x005f;
                case -659376217: goto L_0x0055;
                case -642208130: goto L_0x004b;
                case -354048396: goto L_0x0040;
                case -32082395: goto L_0x0035;
                case 3387234: goto L_0x002b;
                case 96784904: goto L_0x0021;
                case 580119100: goto L_0x0016;
                case 725497484: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0089
        L_0x000b:
            java.lang.String r1 = "noCacheDir"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 7
            goto L_0x008a
        L_0x0016:
            java.lang.String r1 = "expireFailed"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 6
            goto L_0x008a
        L_0x0021:
            java.lang.String r1 = "error"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x002b:
            java.lang.String r1 = "noop"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 4
            goto L_0x008a
        L_0x0035:
            java.lang.String r1 = "externalAbort"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 10
            goto L_0x008a
        L_0x0040:
            java.lang.String r1 = "sizeExceeded"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 11
            goto L_0x008a
        L_0x004b:
            java.lang.String r1 = "playerFailed"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 5
            goto L_0x008a
        L_0x0055:
            java.lang.String r1 = "contentLengthMissing"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 0
            goto L_0x008a
        L_0x005f:
            java.lang.String r1 = "downloadTimeout"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 9
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = "inProgress"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 2
            goto L_0x008a
        L_0x0074:
            java.lang.String r1 = "badUrl"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 8
            goto L_0x008a
        L_0x007f:
            java.lang.String r1 = "interrupted"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0089
            r2 = 3
            goto L_0x008a
        L_0x0089:
            r2 = -1
        L_0x008a:
            switch(r2) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                case 3: goto L_0x0097;
                case 4: goto L_0x0097;
                case 5: goto L_0x0097;
                case 6: goto L_0x0094;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x0091;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0099
        L_0x008e:
            java.lang.String r0 = "policy"
            goto L_0x0099
        L_0x0091:
            java.lang.String r0 = "network"
            goto L_0x0099
        L_0x0094:
            java.lang.String r0 = "io"
            goto L_0x0099
        L_0x0097:
            java.lang.String r0 = "internal"
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alb.mo39672c(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m46257a(String str, Map<String, String> map) {
        aik aik = (aik) this.f40538c.get();
        if (aik != null) {
            aik.mo39809a(str, map);
        }
    }
}
