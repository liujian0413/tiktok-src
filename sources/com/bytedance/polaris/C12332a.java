package com.bytedance.polaris;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12369t;
import com.bytedance.polaris.p634b.C12370u;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.a */
public final class C12332a implements C6310a {

    /* renamed from: e */
    public static C12369t<C12332a> f32732e = new C12369t<C12332a>() {
        /* renamed from: c */
        private static C12332a m35822c() {
            return new C12332a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo30173a() {
            return m35822c();
        }
    };

    /* renamed from: a */
    public volatile boolean f32733a;

    /* renamed from: b */
    public long f32734b;

    /* renamed from: c */
    public Handler f32735c;

    /* renamed from: d */
    public long f32736d;

    /* renamed from: f */
    private JSONObject f32737f;

    /* renamed from: com.bytedance.polaris.a$a */
    static final class C12334a implements Runnable {
        C12334a() {
        }

        public final void run() {
            try {
                if (!C12332a.m35814a().f32733a) {
                    C12332a.m35814a().f32733a = true;
                    C12424e i = C12428i.m36159i();
                    if (i == null) {
                        C12332a.m35814a().f32733a = false;
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C12332a.m35814a().f32734b > 21600000 || C12332a.m35814a().f32736d * 1000 <= currentTimeMillis) {
                        C12332a.m35814a().f32734b = System.currentTimeMillis();
                        C12332a.m35814a().mo30170c();
                        StringBuilder sb = new StringBuilder(C12428i.m36152b("/luckycat/tiktokm/v1/widget/kvs"));
                        C12370u.m35932a(sb, true);
                        sb.append("&keys=next_req_interval,req_frequency_control_switch,next_refresh");
                        String a = i.mo30313a(20480, sb.toString());
                        if (TextUtils.isEmpty(a)) {
                            C12332a.m35814a().f32733a = false;
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(a);
                        if (jSONObject.optInt("err_no", -1) != 0) {
                            C12332a.m35814a().f32733a = false;
                            return;
                        }
                        C12332a.m35814a().f32733a = false;
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = optJSONObject;
                        C12332a.m35814a().f32735c.sendMessage(obtain);
                        return;
                    }
                    C12332a.m35814a().f32733a = false;
                }
            } catch (Throwable unused) {
                C12332a.m35814a().f32733a = false;
            }
        }
    }

    /* renamed from: a */
    public static C12332a m35814a() {
        return (C12332a) f32732e.mo30198b();
    }

    /* renamed from: b */
    public final void mo30169b() {
        if (!this.f32733a) {
            C6304f.submitRunnable(new C12334a());
        }
    }

    /* renamed from: d */
    public final long mo30171d() {
        return m35813a("next_req_interval", 0);
    }

    /* renamed from: e */
    public final boolean mo30172e() {
        if (m35812a("req_frequency_control_switch", 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static long m35816f() {
        Application c = C12428i.m36153c();
        if (c == null) {
            return 0;
        }
        SharedPreferences a = C7285c.m22838a(c, "red_packet", 0);
        if (a == null) {
            return 0;
        }
        return a.getLong("last_update_settings_time", 0);
    }

    /* renamed from: c */
    public final void mo30170c() {
        Application c = C12428i.m36153c();
        if (c != null) {
            Editor edit = C7285c.m22838a(c, "red_packet", 0).edit();
            edit.putLong("last_update_settings_time", this.f32734b);
            edit.commit();
        }
    }

    private C12332a() {
        this.f32737f = m35817g();
        this.f32734b = m35816f();
        this.f32735c = new C6309f(Looper.getMainLooper(), this);
        if (this.f32737f == null) {
            this.f32736d = -1;
        } else {
            this.f32736d = m35813a("next_refresh", -1);
        }
    }

    /* renamed from: g */
    private static JSONObject m35817g() {
        try {
            Application c = C12428i.m36153c();
            if (c == null) {
                return null;
            }
            String string = C7285c.m22838a(c, "red_packet", 0).getString("red_packet_settings", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            m35814a().m35815a((JSONObject) message.obj);
        }
    }

    /* renamed from: a */
    private void m35815a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Application c = C12428i.m36153c();
            if (c != null) {
                this.f32737f = jSONObject;
                if (this.f32737f != null) {
                    this.f32736d = m35813a("next_refresh", -1);
                }
                Editor edit = C7285c.m22838a(c, "red_packet", 0).edit();
                edit.putString("red_packet_settings", jSONObject.toString());
                edit.commit();
            }
        }
    }

    /* renamed from: a */
    private int m35812a(String str, int i) {
        try {
            if (TextUtils.isEmpty(str) || this.f32737f == null || !this.f32737f.has(str)) {
                return 0;
            }
            JSONObject optJSONObject = this.f32737f.optJSONObject(str);
            if (optJSONObject == null) {
                return 0;
            }
            return Integer.valueOf(optJSONObject.optString("value", "0")).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private long m35813a(String str, long j) {
        try {
            if (TextUtils.isEmpty(str) || !this.f32737f.has(str)) {
                return j;
            }
            JSONObject optJSONObject = this.f32737f.optJSONObject(str);
            if (optJSONObject == null) {
                return j;
            }
            return Long.valueOf(optJSONObject.optString("value", String.valueOf(j))).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }
}
