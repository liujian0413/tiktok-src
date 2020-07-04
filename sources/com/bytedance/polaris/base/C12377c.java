package com.bytedance.polaris.base;

import android.content.SharedPreferences;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12367r;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.base.c */
public class C12377c {

    /* renamed from: b */
    private static volatile C12377c f32838b;

    /* renamed from: a */
    public JSONObject f32839a;

    /* renamed from: c */
    private final SharedPreferences f32840c = C7285c.m22838a(C12428i.m36153c(), "polaris_setting", 0);

    /* renamed from: d */
    private int f32841d;

    private C12377c() {
        m35962b();
    }

    /* renamed from: a */
    public static C12377c m35961a() {
        if (f32838b == null) {
            synchronized (C12377c.class) {
                if (f32838b == null) {
                    f32838b = new C12377c();
                }
            }
        }
        return f32838b;
    }

    /* renamed from: b */
    private void m35962b() {
        try {
            this.f32841d = this.f32840c.getInt("tweak_webview_drawing_cache", -1);
            C12367r.m35916a(this.f32841d);
            try {
                this.f32839a = new JSONObject(this.f32840c.getString("polaris_app_settings", ""));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
