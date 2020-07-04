package com.bytedance.apm.p248k;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C6294k;
import com.bytedance.apm.util.C9640c;
import com.bytedance.apm.util.C9656t;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.lynx.webview.extension.URLRequestFlowCount;
import com.bytedance.lynx.webview.extension.URLRequestFlowCount.URLRequestFlowCountListener;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.g */
public final class C6259g extends C6244a {

    /* renamed from: a */
    private boolean f18442a;

    /* renamed from: d */
    private Context f18443d = C6174c.m19129a();

    /* renamed from: e */
    private String f18444e;

    /* renamed from: f */
    private long f18445f;

    /* renamed from: g */
    private long f18446g;

    /* renamed from: h */
    private long f18447h;

    /* renamed from: i */
    private boolean f18448i;

    /* renamed from: j */
    private BroadcastReceiver f18449j = new BroadcastReceiver() {
        public final void onReceive(final Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                    public final void run() {
                        String a = C6259g.m19420a(context);
                        if (!TextUtils.isEmpty(a)) {
                            C6259g.this.mo15043a(context, a);
                        }
                    }
                });
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return 0;
    }

    /* renamed from: a */
    public final void mo15031a() {
        if (this.f18442a) {
            URLRequestFlowCount.setURLRequestFlowCountListener(new URLRequestFlowCountListener() {
            });
        }
    }

    /* renamed from: j */
    private static long m19426j() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: i */
    private void m19425i() {
        if (C9656t.m28554a()) {
            long j = m19426j();
            long j2 = j - 86400000;
            long j3 = j;
            long a = C9656t.m28551a(C6174c.m19129a(), j2, j3, 1);
            long a2 = C9656t.m28551a(C6174c.m19129a(), j2, j3, 0);
            long j4 = a + a2;
            if (j4 > 0) {
                m19422a("net_stats_wifi_day", a);
                m19422a("net_stats_mobile_day", a2);
                m19422a("net_stats_total_day", j4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14863b() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C6259g.this.mo15031a();
            }
        });
        m19423b(this.f18443d);
        m19425i();
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        super.mo14861a(activity);
        m19424b(true);
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        super.mo14864b(activity);
        m19424b(false);
    }

    /* renamed from: b */
    private void m19424b(final boolean z) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6259g.this.mo15044a(z);
            }
        });
    }

    public C6259g(boolean z) {
        this.f18442a = z;
    }

    /* renamed from: b */
    private void m19423b(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.f18449j, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m19420a(Context context) {
        NetworkType c = C6294k.m19531c(context);
        if (c == NetworkType.WIFI) {
            return "WIFI";
        }
        if (c == NetworkType.MOBILE || c == NetworkType.MOBILE_2G || c == NetworkType.MOBILE_3G || c == NetworkType.MOBILE_4G) {
            return "MOBILE";
        }
        return "";
    }

    /* renamed from: a */
    public final void mo15044a(boolean z) {
        try {
            SharedPreferences a = C7285c.m22838a(this.f18443d, "traffic_monitor_info", 0);
            String string = a.getString("net_type", null);
            a.getLong("timestamp", -1);
            long j = a.getLong("last_total_traffic", -1);
            long j2 = a.getLong("mobile_traffic", -1);
            long j3 = a.getLong("wifi_traffic", -1);
            int i = a.getInt("traffic_upload_switch", 0);
            if (string != null && i == 1) {
                if ("WIFI".equals(string)) {
                    j3 = (j3 + C9640c.m28515a(this.f18443d)) - j;
                } else if ("MOBILE".equals(string)) {
                    j2 = (j2 + C9640c.m28515a(this.f18443d)) - j;
                }
                if (z) {
                    if (j3 > 0) {
                        m19422a("wifi_traffic_foreground", j3);
                    }
                    if (j2 > 0) {
                        m19422a("mobile_traffic_foreground", j2);
                    }
                    this.f18448i = false;
                } else if (!this.f18448i) {
                    if (j3 > 0) {
                        m19422a("wifi_traffic_background", j3);
                    }
                    if (j2 > 0) {
                        m19422a("mobile_traffic_background", j2);
                    }
                    this.f18448i = true;
                }
            }
            this.f18447h = C9640c.m28515a(this.f18443d);
            this.f18444e = m19420a(this.f18443d);
            this.f18445f = 0;
            this.f18446g = 0;
            m19421a(this.f18443d, this.f18444e, this.f18445f, this.f18446g, this.f18447h, 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m19422a(String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, j);
            C9600e eVar = new C9600e("traffic", "traffic_monitor", false, jSONObject, null, null);
            m19342a(eVar);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo15043a(Context context, String str) {
        if (TextUtils.isEmpty(this.f18444e)) {
            this.f18444e = str;
            this.f18445f = 0;
            this.f18446g = 0;
            this.f18447h = C9640c.m28515a(context);
            m19421a(context, this.f18444e, this.f18445f, this.f18446g, this.f18447h, 1);
        } else if (!str.equals(this.f18444e)) {
            if ("WIFI".equals(this.f18444e)) {
                this.f18446g += C9640c.m28515a(context) - this.f18447h;
            } else {
                this.f18445f += C9640c.m28515a(context) - this.f18447h;
            }
            this.f18444e = str;
            this.f18447h = C9640c.m28515a(context);
            m19421a(context, this.f18444e, this.f18445f, this.f18446g, this.f18447h, 1);
        }
    }

    /* renamed from: a */
    private static void m19421a(Context context, String str, long j, long j2, long j3, int i) {
        if (context != null) {
            try {
                Editor edit = C7285c.m22838a(context, "traffic_monitor_info", 0).edit();
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("net_type", str);
                }
                edit.putLong("mobile_traffic", j);
                edit.putLong("wifi_traffic", j2);
                edit.putLong("last_total_traffic", j3);
                edit.putLong("collect_traffic_time", System.currentTimeMillis());
                edit.putInt("traffic_upload_switch", 1);
                edit.putLong("timestamp", System.currentTimeMillis());
                edit.apply();
            } catch (Throwable unused) {
            }
        }
    }
}
