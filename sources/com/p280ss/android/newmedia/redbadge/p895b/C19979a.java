package com.p280ss.android.newmedia.redbadge.p895b;

import android.content.Context;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C20088b;

/* renamed from: com.ss.android.newmedia.redbadge.b.a */
public final class C19979a {

    /* renamed from: a */
    private static C19979a f54079a;

    /* renamed from: b */
    private C20088b f54080b = PushMultiProcessSharedProvider.m66155a(this.f54081c);

    /* renamed from: c */
    private Context f54081c;

    /* renamed from: b */
    public final String mo53478b() {
        return this.f54080b.mo53737a("desktop_red_badge_args", "");
    }

    /* renamed from: c */
    public final long mo53481c() {
        return this.f54080b.mo53735a("red_badge_last_request_time", 0);
    }

    /* renamed from: d */
    public final int mo53484d() {
        return this.f54080b.mo53734a("red_badge_next_query_interval", 600);
    }

    /* renamed from: e */
    public final String mo53486e() {
        return this.f54080b.mo53737a("red_badge_last_time_paras", "");
    }

    /* renamed from: f */
    public final String mo53488f() {
        return this.f54080b.mo53737a("red_badge_last_last_time_paras", "");
    }

    /* renamed from: g */
    public final int mo53490g() {
        return this.f54080b.mo53734a("red_badge_launch_times", 0);
    }

    /* renamed from: h */
    public final int mo53491h() {
        return this.f54080b.mo53734a("red_badge_show_times", 0);
    }

    /* renamed from: i */
    public final String mo53492i() {
        return this.f54080b.mo53737a("session_key", "");
    }

    /* renamed from: j */
    public final String mo53493j() {
        return this.f54080b.mo53737a("rom", "");
    }

    /* renamed from: k */
    public final String mo53494k() {
        return this.f54080b.mo53737a("red_badge_last_valid_response", "");
    }

    /* renamed from: l */
    public final boolean mo53495l() {
        return this.f54080b.mo53738a("red_badge_is_use_last_valid_response", true);
    }

    /* renamed from: a */
    public final boolean mo53477a() {
        return this.f54080b.mo53738a("is_desktop_red_badge_show", false);
    }

    /* renamed from: a */
    public final void mo53473a(int i) {
        this.f54080b.mo53736a().mo53728a("red_badge_next_query_interval", i).mo53732a();
    }

    private C19979a(Context context) {
        this.f54081c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C19979a m65855a(Context context) {
        C19979a aVar;
        synchronized (C19979a.class) {
            if (f54079a == null) {
                f54079a = new C19979a(context);
            }
            aVar = f54079a;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo53479b(int i) {
        this.f54080b.mo53736a().mo53728a("red_badge_launch_times", i).mo53732a();
    }

    /* renamed from: c */
    public final void mo53482c(int i) {
        this.f54080b.mo53736a().mo53728a("red_badge_show_times", i).mo53732a();
    }

    /* renamed from: d */
    public final void mo53485d(String str) {
        this.f54080b.mo53736a().mo53730a("session_key", str).mo53732a();
    }

    /* renamed from: e */
    public final void mo53487e(String str) {
        this.f54080b.mo53736a().mo53730a("rom", str).mo53732a();
    }

    /* renamed from: f */
    public final void mo53489f(String str) {
        this.f54080b.mo53736a().mo53730a("red_badge_last_valid_response", str).mo53732a();
    }

    /* renamed from: a */
    public final void mo53474a(long j) {
        this.f54080b.mo53736a().mo53729a("red_badge_last_request_time", j).mo53732a();
    }

    /* renamed from: b */
    public final void mo53480b(String str) {
        this.f54080b.mo53736a().mo53730a("red_badge_last_time_paras", str).mo53732a();
    }

    /* renamed from: c */
    public final void mo53483c(String str) {
        this.f54080b.mo53736a().mo53730a("red_badge_last_last_time_paras", str).mo53732a();
    }

    /* renamed from: a */
    public final void mo53475a(String str) {
        this.f54080b.mo53736a().mo53730a("desktop_red_badge_args", str).mo53732a();
    }

    /* renamed from: a */
    public final void mo53476a(boolean z) {
        this.f54080b.mo53736a().mo53731a("is_desktop_red_badge_show", z).mo53732a();
    }
}
