package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class adr {

    /* renamed from: a */
    private final Object f40064a = new Object();

    /* renamed from: b */
    private String f40065b = "";

    /* renamed from: c */
    private String f40066c = "";

    /* renamed from: d */
    private boolean f40067d = false;

    /* renamed from: e */
    private String f40068e = "";

    /* renamed from: a */
    public final void mo39230a(Context context, String str, String str2) {
        if (!m45650b(context, str, str2)) {
            m45649a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f40068e)) {
            acd.m45777b("Creative is not pushed for this device.");
            m45649a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f40068e)) {
            acd.m45777b("The app is not linked for creative preview.");
            m45654e(context, str, str2);
        } else {
            if ("0".equals(this.f40068e)) {
                acd.m45777b("Device is linked for in app preview.");
                m45649a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo39231a(Context context, String str, String str2, String str3) {
        boolean b = mo39233b();
        if (m45652c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                mo39232b(context, str2, str3, str);
            }
            acd.m45777b("Device is linked for debug signals.");
            m45649a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m45654e(context, str, str2);
    }

    /* renamed from: b */
    private final boolean m45650b(Context context, String str, String str2) {
        String d = m45653d(context, m45651c(context, (String) bym.m50299d().mo41272a(C15585bw.f43909cx), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            acd.m45777b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f40068e = jSONObject.optString("status");
            synchronized (this.f40064a) {
                this.f40066c = optString;
            }
            return true;
        } catch (JSONException e) {
            acd.m45780c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m45652c(Context context, String str, String str2) {
        String d = m45653d(context, m45651c(context, (String) bym.m50299d().mo41272a(C15585bw.f43910cy), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            acd.m45777b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f40064a) {
                this.f40067d = equals;
            }
            return equals;
        } catch (JSONException e) {
            acd.m45780c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m45653d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C14793ay.m42895a().mo39176b(context, str2));
        agj a = new aea(context).mo39247a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43860cA)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String str3 = "Timeout while retriving a response from: ";
            String valueOf = String.valueOf(str);
            acd.m45778b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String str4 = "Interrupted while retriving a response from: ";
            String valueOf2 = String.valueOf(str);
            acd.m45778b(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e2);
            a.cancel(true);
            return null;
        } catch (Exception e3) {
            String str5 = "Error retriving a response from: ";
            String valueOf3 = String.valueOf(str);
            acd.m45778b(valueOf3.length() != 0 ? str5.concat(valueOf3) : new String(str5), e3);
            return null;
        }
    }

    /* renamed from: e */
    private final void m45654e(Context context, String str, String str2) {
        acl.m45527a(context, m45651c(context, (String) bym.m50299d().mo41272a(C15585bw.f43908cw), str, str2));
    }

    /* renamed from: b */
    public final void mo39232b(Context context, String str, String str2, String str3) {
        Builder buildUpon = m45651c(context, (String) bym.m50299d().mo41272a(C15585bw.f43911cz), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        acl.m45528a(context, str, buildUpon.build().toString());
    }

    /* renamed from: c */
    private final Uri m45651c(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m45648a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    private final String m45648a(Context context) {
        String str;
        synchronized (this.f40064a) {
            if (TextUtils.isEmpty(this.f40065b)) {
                this.f40065b = acl.m45548c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f40065b)) {
                    this.f40065b = acl.m45518a();
                    acl.m45544b(context, "debug_signals_id.txt", this.f40065b);
                }
            }
            str = this.f40065b;
        }
        return str;
    }

    /* renamed from: a */
    public final String mo39229a() {
        String str;
        synchronized (this.f40064a) {
            str = this.f40066c;
        }
        return str;
    }

    /* renamed from: b */
    public final boolean mo39233b() {
        boolean z;
        synchronized (this.f40064a) {
            z = this.f40067d;
        }
        return z;
    }

    /* renamed from: a */
    private final void m45649a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            acd.m45781d("Can not create dialog without Activity Context");
            return;
        }
        Handler handler = acl.f40003a;
        C15472ads ads = new C15472ads(this, context, str, z, z2);
        handler.post(ads);
    }
}
