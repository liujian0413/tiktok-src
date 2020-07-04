package com.bytedance.android.livesdk.feed;

import android.os.SystemClock;
import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.q */
public final class C6085q extends C3168a {

    /* renamed from: a */
    private long f17974a;

    /* renamed from: b */
    private long f17975b;

    /* renamed from: a */
    public final void mo14738a() {
        this.f17974a = SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final void mo14742b() {
        this.f17975b = SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    private long m18976c() {
        long j;
        if (this.f17974a > 0) {
            j = SystemClock.uptimeMillis() - this.f17974a;
        } else {
            j = 0;
        }
        this.f17974a = 0;
        return j;
    }

    /* renamed from: d */
    private long m18977d() {
        long j;
        if (this.f17975b > 0) {
            j = SystemClock.uptimeMillis() - this.f17975b;
        } else {
            j = 0;
        }
        this.f17975b = 0;
        return j;
    }

    /* renamed from: a */
    public final void mo14739a(String str) {
        m18972a(m18976c(), str);
    }

    /* renamed from: b */
    public final void mo14743b(String str) {
        m18975b(m18977d(), str);
    }

    /* renamed from: a */
    public static void m18971a(float f) {
        JSONObject jSONObject = new JSONObject();
        m11982a(jSONObject, "feed_fps", f);
        C3172e.m12008b("ttlive_feed_list_fps_all", 0, jSONObject);
    }

    /* renamed from: b */
    private static void m18975b(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        m11984a(jSONObject, "url", str);
        C3172e.m12000a("ttlive_feed_image_load_all", 0, j, jSONObject);
    }

    /* renamed from: a */
    private static void m18972a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        m11984a(jSONObject, "request_type", str);
        C3172e.m12000a("ttlive_request_feed_api_all", 0, j, jSONObject);
    }

    /* renamed from: a */
    public final void mo14740a(String str, Throwable th) {
        m18976c();
        m18973a(-1, str, th);
    }

    /* renamed from: a */
    public final void mo14741a(Throwable th, String str) {
        m18977d();
        m18974a(-1, th, str);
    }

    /* renamed from: a */
    private static void m18973a(long j, String str, Throwable th) {
        int i;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (th instanceof ApiException) {
            i = ((ApiException) th).getErrorCode();
        } else {
            i = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str2);
        m11984a(jSONObject, "request_type", str);
        C3172e.m12008b("ttlive_request_feed_api_all", 1, jSONObject);
        C3172e.m12002a("ttlive_request_feed_api_error", 1, jSONObject);
    }

    /* renamed from: a */
    private static void m18974a(long j, Throwable th, String str) {
        int i;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (th instanceof ApiException) {
            i = ((ApiException) th).getErrorCode();
        } else {
            i = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str2);
        m11984a(jSONObject, "url", str);
        C3172e.m12008b("ttlive_feed_image_load_all", 1, jSONObject);
        C3172e.m12002a("ttlive_feed_image_load_error", 1, jSONObject);
    }
}
