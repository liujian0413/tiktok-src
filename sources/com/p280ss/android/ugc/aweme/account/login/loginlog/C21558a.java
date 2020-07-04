package com.p280ss.android.ugc.aweme.account.login.loginlog;

import android.webkit.CookieManager;
import com.alibaba.fastjson.JSONObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.LogManager;

/* renamed from: com.ss.android.ugc.aweme.account.login.loginlog.a */
public final class C21558a {

    /* renamed from: a */
    private static C21558a f57892a;

    /* renamed from: b */
    private ArrayList<LoginLog> f57893b;

    public C21558a() {
        m72265c();
    }

    /* renamed from: c */
    private void m72265c() {
        this.f57893b = new ArrayList<>();
    }

    /* renamed from: b */
    public final String mo57699b() {
        try {
            return JSONObject.toJSONString(this.f57893b);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C21558a m72263a() {
        if (f57892a == null) {
            synchronized (LogManager.class) {
                if (f57892a == null) {
                    f57892a = new C21558a();
                }
            }
        }
        return f57892a;
    }

    /* renamed from: a */
    private static String m72264a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    /* renamed from: a */
    public final void mo57698a(String str, String str2, boolean z, String str3, boolean z2) {
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = str;
        loginLog.errorUrl = str2;
        loginLog.isSuccess = false;
        loginLog.isLogin = z2;
        loginLog.platform = str3;
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str2);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = m72264a(System.currentTimeMillis());
        if (this.f57893b != null) {
            this.f57893b.add(loginLog);
        }
    }

    /* renamed from: a */
    public final void mo57697a(String str, String str2, boolean z, String str3, String str4, String str5) {
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = str;
        loginLog.errorUrl = str2;
        loginLog.isSuccess = z;
        loginLog.platform = str3;
        loginLog.postParams = str4;
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str2);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = m72264a(System.currentTimeMillis());
        loginLog.action = str5;
        if (this.f57893b != null) {
            this.f57893b.add(loginLog);
        }
    }
}
