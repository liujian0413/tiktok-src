package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.by */
public final class C15587by {

    /* renamed from: a */
    public String f44156a = ((String) bym.m50299d().mo41272a(C15585bw.f43741O));

    /* renamed from: b */
    public Map<String, String> f44157b = new LinkedHashMap();

    /* renamed from: c */
    public Context f44158c;

    /* renamed from: d */
    public String f44159d;

    public C15587by(Context context, String str) {
        String str2;
        this.f44158c = context;
        this.f44159d = str;
        this.f44157b.put("s", "gmob_sdk");
        this.f44157b.put("v", "3");
        this.f44157b.put("os", VERSION.RELEASE);
        this.f44157b.put("sdk", VERSION.SDK);
        this.f44157b.put("device", acl.m45542b());
        Map<String, String> map = this.f44157b;
        String str3 = "app";
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map.put(str3, str2);
        this.f44157b.put("is_lite_sdk", acl.m45566l(context) ? "1" : "0");
        Future a = C14793ay.m42904j().mo42064a(this.f44158c);
        try {
            this.f44157b.put("network_coarse", Integer.toString(((C16164xh) a.get()).f45356o));
            this.f44157b.put("network_fine", Integer.toString(((C16164xh) a.get()).f45357p));
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }
}
