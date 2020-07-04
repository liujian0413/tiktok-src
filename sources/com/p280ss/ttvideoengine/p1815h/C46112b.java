package com.p280ss.ttvideoengine.p1815h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.b */
public final class C46112b {

    /* renamed from: b */
    public static String f117995b = "buffer_timeout";

    /* renamed from: c */
    public static String f117996c = "com.video.ttvideosetting";

    /* renamed from: a */
    public int f117997a;

    /* renamed from: d */
    private Context f117998d;

    /* renamed from: e */
    private SharedPreferences f117999e = m144495a(this.f117998d);

    /* renamed from: a */
    private void m144496a() {
        this.f117997a = this.f117999e.getInt(f117995b, 30);
    }

    /* renamed from: a */
    private static SharedPreferences m144495a(Context context) {
        return C7285c.m22838a(context, f117996c, 0);
    }

    public C46112b(Context context) throws JSONException {
        this.f117998d = context.getApplicationContext();
        m144496a();
    }

    /* renamed from: a */
    private void m144497a(Editor editor) {
        editor.putInt(f117995b, this.f117997a);
    }

    /* renamed from: a */
    public final void mo112284a(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean z = false;
            int a = m144494a(jSONObject, f117995b);
            if (a >= 0 && a != this.f117997a) {
                z = true;
                this.f117997a = a;
            }
            if (z) {
                Editor edit = this.f117999e.edit();
                m144497a(edit);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    private static int m144494a(JSONObject jSONObject, String str) {
        return jSONObject.optInt(str, -1);
    }
}
