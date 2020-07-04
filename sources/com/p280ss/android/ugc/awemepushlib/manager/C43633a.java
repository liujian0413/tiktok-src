package com.p280ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.newmedia.redbadge.C19973b;
import com.p280ss.android.push.window.oppo.C20025c;
import com.p280ss.android.pushmanager.app.C20039a;
import com.p280ss.android.pushmanager.app.C20039a.C20041a;
import com.p280ss.android.pushmanager.client.C20061c;
import com.p280ss.android.pushmanager.client.C20070h;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.awemepushlib.interaction.C43600b;
import com.p280ss.android.ugc.awemepushlib.interaction.C43603d;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.a */
public class C43633a {

    /* renamed from: o */
    private static volatile C43633a f112901o;

    /* renamed from: p */
    private static final SimpleDateFormat f112902p = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: s */
    private static int f112903s = 0;

    /* renamed from: t */
    private static boolean f112904t = false;

    /* renamed from: a */
    public String f112905a;

    /* renamed from: b */
    public boolean f112906b;

    /* renamed from: c */
    public boolean f112907c;

    /* renamed from: d */
    public String f112908d;

    /* renamed from: e */
    public long f112909e;

    /* renamed from: f */
    public int f112910f;

    /* renamed from: g */
    public int f112911g;

    /* renamed from: h */
    public int f112912h;

    /* renamed from: i */
    protected C20039a f112913i;

    /* renamed from: j */
    public int f112914j;

    /* renamed from: k */
    public int f112915k;

    /* renamed from: l */
    protected boolean f112916l;

    /* renamed from: m */
    public int f112917m;

    /* renamed from: n */
    private int f112918n = -1;

    /* renamed from: q */
    private final SharedPreferences f112919q;

    /* renamed from: r */
    private int f112920r;

    /* renamed from: a */
    public final boolean mo105554a(Context context) {
        if (!m138265h(context) || this.f112917m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo105553a(int i, long j) {
        C20041a a = m138249a((long) i, j);
        boolean a2 = m138254a(a);
        if (a2) {
            C20041a b = m138255b(a);
            if (b != null && a.f54234b - b.f54234b > 43200000) {
                a2 = false;
            }
        }
        m138260c(a);
        m138264g();
        return a2;
    }

    /* renamed from: d */
    private int m138261d() {
        if (this.f112906b) {
            return f112903s;
        }
        return 1;
    }

    /* renamed from: c */
    public static C43633a m138259c() {
        if (f112901o == null) {
            synchronized (C43633a.class) {
                if (f112901o == null) {
                    f112901o = new C43633a();
                }
            }
        }
        return f112901o;
    }

    /* renamed from: f */
    private String m138263f() {
        if (this.f112905a == null) {
            this.f112905a = C43600b.m138163a().getDefaultUninstallQuestionUrl();
        }
        return this.f112905a;
    }

    public C43633a() {
        int i = 1;
        this.f112906b = true;
        this.f112907c = true;
        this.f112908d = "";
        this.f112909e = 6000;
        this.f112913i = new C20039a(20);
        this.f112920r = 1;
        this.f112914j = 1;
        this.f112915k = -1;
        this.f112916l = true;
        if (m138261d() != 1) {
            i = 0;
        }
        this.f112917m = i;
        this.f112919q = C7285c.m22838a(C29960a.m98230a(), "app_setting", 0);
    }

    /* renamed from: e */
    private void m138262e() {
        this.f112911g = this.f112919q.getInt("keep_notify_count", 0);
        this.f112910f = this.f112919q.getInt("max_notify_count", 0);
        this.f112912h = this.f112919q.getInt("notify_fresh_period", 0);
        this.f112913i.mo53653a(this.f112919q.getString("notify_message_ids", ""));
    }

    /* renamed from: g */
    private void m138264g() {
        Editor edit = this.f112919q.edit();
        edit.putInt("keep_notify_count", this.f112911g);
        edit.putInt("max_notify_count", this.f112910f);
        edit.putInt("notify_fresh_period", this.f112912h);
        edit.putString("notify_message_ids", this.f112913i.mo53652a());
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    public final boolean mo105556b() {
        if (this.f112914j > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo105552a() {
        if (this.f112920r > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C43633a m138250a(int i) {
        this.f112920r = i;
        return this;
    }

    /* renamed from: b */
    private C43633a m138256b(int i) {
        this.f112914j = i;
        return this;
    }

    /* renamed from: a */
    private C43633a m138251a(String str) {
        this.f112908d = str;
        return this;
    }

    /* renamed from: b */
    private C20041a m138255b(C20041a aVar) {
        return this.f112913i.mo53655b(aVar);
    }

    /* renamed from: c */
    private void m138260c(C20041a aVar) {
        this.f112913i.mo53656c(aVar);
    }

    /* renamed from: b */
    private C43633a m138257b(long j) {
        this.f112909e = j;
        return this;
    }

    /* renamed from: c */
    public final boolean mo105558c(Context context) {
        if (m138265h(context)) {
            return this.f112916l;
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized void mo105559d(Context context) {
        if (m138265h(context)) {
            this.f112906b = true;
        } else {
            this.f112906b = false;
        }
    }

    /* renamed from: g */
    public final void mo105562g(Context context) {
        SharedPreferences a = C7285c.m22838a(context, "push_setting", 0);
        m138266i(context);
        m138262e();
        C20025c.m65968a(context).mo53615a(a);
    }

    /* renamed from: a */
    private boolean m138254a(C20041a aVar) {
        return this.f112913i.mo53654a(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return java.lang.Boolean.TRUE.booleanValue();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m138265h(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f112915k     // Catch:{ Exception -> 0x0028 }
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L_0x0017
            java.lang.String r0 = "push_setting"
            android.content.SharedPreferences r4 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r0, r2)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "allow_settings_notify_enable"
            boolean r1 = r3.f112906b     // Catch:{ Exception -> 0x0028 }
            int r4 = r4.getInt(r0, r1)     // Catch:{ Exception -> 0x0028 }
            r3.f112915k = r4     // Catch:{ Exception -> 0x0028 }
        L_0x0017:
            int r4 = r3.f112915k     // Catch:{ Exception -> 0x0028 }
            if (r4 <= 0) goto L_0x001c
            r2 = 1
        L_0x001c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0028 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0026:
            r4 = move-exception
            goto L_0x0030
        L_0x0028:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return r4
        L_0x0030:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.awemepushlib.manager.C43633a.m138265h(android.content.Context):boolean");
    }

    /* renamed from: j */
    private Editor m138267j(Context context) {
        if (context == null) {
            return null;
        }
        Editor edit = C7285c.m22838a(context, "push_setting", 0).edit();
        if (edit != null) {
            edit.putInt("shut_push_on_stop_service", this.f112917m);
            edit.putInt("allow_settings_notify_enable", this.f112915k);
            edit.putBoolean("notify_enabled", this.f112916l);
            edit.putString("uninstall_question_url", this.f112905a);
            if (!C30538p.m99745a()) {
                edit.putString("aweme_push_config", this.f112908d);
            }
        }
        return edit;
    }

    /* renamed from: f */
    public final void mo105561f(Context context) {
        m138264g();
        Editor j = m138267j(context);
        if (j != null) {
            C20025c.m65968a(context).mo53614a(j);
            C9721b.m28656a(j);
        }
    }

    /* renamed from: a */
    public final C43633a mo105549a(boolean z) {
        this.f112907c = z;
        return this;
    }

    /* renamed from: e */
    public final void mo105560e(Context context) {
        if (C43603d.m138182b()) {
            C20070h.m66075a();
            C20070h.m66078b(context, m138263f());
            C20070h.m66075a();
            C20070h.m66080c(context, mo105554a(context));
            C20070h.m66075a();
            C20070h.m66081d(context, C20090b.m66187a().mo53792s());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("port", C10981a.m32167a());
                C6759a.m20910a("http_monitor_port_ug", jSONObject);
            } catch (Throwable unused) {
            }
            Map a = C43603d.m138173a();
            if (!C43590a.m138126a(a)) {
                C43590a.m138121a((Runnable) new C43635c(context, a));
            }
            C20061c.m66051a(context);
            C19973b.m65837a(context).mo53467d();
        }
    }

    /* renamed from: i */
    private void m138266i(Context context) {
        if (context != null) {
            int i = 0;
            SharedPreferences a = C7285c.m22838a(context, "push_setting", 0);
            if (C30538p.m99745a()) {
                if (a != null) {
                    String str = "shut_push_on_stop_service";
                    if (m138261d() == 1) {
                        i = 1;
                    }
                    this.f112917m = a.getInt(str, i);
                    this.f112915k = a.getInt("allow_settings_notify_enable", this.f112906b ? 1 : 0);
                    this.f112916l = a.getBoolean("notify_enabled", true);
                    this.f112905a = a.getString("uninstall_question_url", C43600b.m138163a().getDefaultUninstallQuestionUrl());
                    this.f112914j = a.getInt("push_clear_switch", 1);
                }
            } else if (a != null) {
                String str2 = "shut_push_on_stop_service";
                if (m138261d() == 1) {
                    i = 1;
                }
                this.f112917m = a.getInt(str2, i);
                this.f112915k = a.getInt("allow_settings_notify_enable", this.f112906b ? 1 : 0);
                this.f112916l = a.getBoolean("notify_enabled", true);
                this.f112905a = a.getString("uninstall_question_url", C43600b.m138163a().getDefaultUninstallQuestionUrl());
                this.f112908d = a.getString("aweme_push_config", "");
                try {
                    JSONObject jSONObject = new JSONObject(this.f112908d);
                    this.f112909e = (long) jSONObject.optInt("float_window_show_time");
                    this.f112920r = jSONObject.optInt("oppo_unify_style");
                    this.f112914j = jSONObject.optInt("push_clear_switch");
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo105550a(long j) {
        this.f112919q.edit().putLong("last_notify_time", j).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return java.lang.Boolean.TRUE.booleanValue();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105557b(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f112918n     // Catch:{ Exception -> 0x002f }
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x001d
            boolean r0 = f112904t     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "push_setting"
            android.content.SharedPreferences r5 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r5, r0, r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "confirm_push"
            int r5 = r5.getInt(r0, r3)     // Catch:{ Exception -> 0x002f }
            r4.f112918n = r5     // Catch:{ Exception -> 0x002f }
            goto L_0x001d
        L_0x001b:
            r4.f112918n = r2     // Catch:{ Exception -> 0x002f }
        L_0x001d:
            int r5 = r4.f112918n     // Catch:{ Exception -> 0x002f }
            if (r5 <= 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x002f }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x002f }
            monitor-exit(r4)
            return r5
        L_0x002d:
            r5 = move-exception
            goto L_0x0037
        L_0x002f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x002d }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x002d }
            monitor-exit(r4)
            return r5
        L_0x0037:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.awemepushlib.manager.C43633a.mo105557b(android.content.Context):boolean");
    }

    /* renamed from: a */
    private C20041a m138249a(long j, long j2) {
        C20039a aVar = this.f112913i;
        aVar.getClass();
        C20041a aVar2 = new C20041a();
        aVar2.f54233a = Long.valueOf(j);
        aVar2.f54234b = j2;
        return aVar2;
    }

    /* renamed from: b */
    public final void mo105555b(Context context, boolean z) {
        this.f112916l = z;
        Editor edit = C7285c.m22838a(context, "push_setting", 0).edit();
        edit.putBoolean("notify_enabled", this.f112916l);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static boolean m138253a(Context context, JSONObject jSONObject) {
        boolean z;
        int i;
        boolean z2 = false;
        if (jSONObject == null) {
            return false;
        }
        int optInt = jSONObject.optInt("allow_settings_notify_enable", m138259c().f112906b ? 1 : 0);
        if (optInt == m138259c().f112915k || optInt < 0) {
            z = false;
        } else {
            m138259c().f112915k = m138259c().f112915k;
            boolean c = m138259c().mo105558c(context);
            m138259c().mo105559d(context);
            C20070h.m66075a();
            C20070h.m66079b(context, c);
            if (c && m138259c().mo105554a(context)) {
                Map a = C43603d.m138173a();
                if (!C43590a.m138126a(a)) {
                    C43590a.m138121a((Runnable) new C43634b(context, a));
                }
            }
            C20070h.m66075a();
            C20070h.m66080c(context, m138259c().mo105554a(context));
            z = true;
        }
        String str = "shut_push_on_stop_service";
        if (m138259c().m138261d() == 1) {
            i = 1;
        } else {
            i = 0;
        }
        int optInt2 = jSONObject.optInt(str, i);
        if (optInt2 != m138259c().f112917m && optInt2 >= 0) {
            m138259c().f112917m = optInt2;
            z = true;
        }
        if (C30538p.m99745a()) {
            int optInt3 = jSONObject.optInt("push_clear_switch", 1);
            if (optInt3 != m138259c().f112914j && optInt3 >= 0) {
                m138259c().m138256b(optInt3);
                z = true;
            }
        }
        int optInt4 = jSONObject.optInt("allow_off_alive", 0);
        if (optInt4 >= 0) {
            C20090b a2 = C20090b.m66187a();
            if (optInt4 > 0) {
                z2 = true;
            }
            a2.mo53774e(z2);
            z = true;
        }
        String optString = jSONObject.optString("uninstall_question_url", C43600b.m138163a().getDefaultUninstallQuestionUrl());
        if (optString != null && !optString.equals(m138259c().m138263f())) {
            m138259c().f112905a = optString;
            z = true;
        }
        boolean a3 = AwemeRedBadgerManager.m138220a().mo105541a(jSONObject, context) | z | C20025c.m65968a(context).mo53618a(jSONObject);
        if (!C30538p.m99745a()) {
            String optString2 = jSONObject.optString("aweme_push_config");
            if (!TextUtils.equals(optString2, m138259c().f112908d) && !TextUtils.isEmpty(optString2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString2);
                    m138259c().m138250a(jSONObject2.optInt("oppo_unify_style"));
                    m138259c().m138257b((long) jSONObject2.optInt("float_window_show_time"));
                    m138259c().m138256b(jSONObject2.optInt("push_clear_switch"));
                    m138259c().m138251a(optString2);
                    C20090b.m66187a().mo53757a((long) jSONObject2.optInt("date_change_delay_interval"));
                    a3 = true;
                } catch (JSONException unused) {
                }
            }
        }
        C20070h.m66075a();
        C20070h.m66078b(context, m138259c().m138263f());
        C20070h.m66075a();
        C20070h.m66080c(context, m138259c().mo105554a(context));
        return a3;
    }

    /* renamed from: a */
    public final synchronized void mo105551a(Context context, boolean z) {
        try {
            if (this.f112918n != z) {
                this.f112918n = z ? 1 : 0;
                boolean z2 = false;
                Editor edit = C7285c.m22838a(context, "push_setting", 0).edit();
                edit.putInt("confirm_push", this.f112918n);
                C9721b.m28656a(edit);
                C20070h.m66075a();
                if (this.f112918n > 0) {
                    z2 = true;
                }
                C20070h.m66077a(context, z2);
            }
        } catch (Exception unused) {
        }
    }
}
