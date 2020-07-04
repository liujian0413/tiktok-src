package com.p280ss.android.common.applog.p286a;

import android.text.TextUtils;
import com.p280ss.android.common.applog.TaskSessionDao;
import com.p280ss.android.common.applog.TeaUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.a.d */
public final class C19272d {

    /* renamed from: a */
    public long f52161a;

    /* renamed from: b */
    public String f52162b;

    /* renamed from: c */
    public boolean f52163c;

    /* renamed from: d */
    public String f52164d;

    /* renamed from: e */
    public boolean f52165e;

    /* renamed from: f */
    public String f52166f;

    /* renamed from: g */
    public long f52167g;

    /* renamed from: h */
    public long f52168h;

    /* renamed from: i */
    private long f52169i;

    private C19272d() {
    }

    public final String toString() {
        return mo51155c();
    }

    /* renamed from: f */
    private long m63146f() {
        return Math.max(0, (this.f52167g - this.f52161a) - this.f52169i);
    }

    /* renamed from: a */
    public final boolean mo51152a() {
        if (!TextUtils.isEmpty(this.f52164d)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo51154b() {
        if (!TextUtils.isEmpty(this.f52166f)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final long mo51158e() {
        return Math.max(1, m63146f() / 1000);
    }

    /* renamed from: d */
    public final int mo51157d() {
        boolean z = this.f52163c;
        boolean z2 = this.f52165e;
        if (!z && !z2) {
            return 1;
        }
        if (z && !z2) {
            return 2;
        }
        if (z || !z2) {
            return 4;
        }
        return 3;
    }

    /* renamed from: c */
    public final String mo51155c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.f52161a);
            jSONObject.put("session_id", this.f52162b);
            jSONObject.put("is_front_continuous", this.f52163c);
            jSONObject.put("front_session_id", this.f52164d);
            jSONObject.put("is_end_continuous", this.f52165e);
            jSONObject.put("end_session_id", this.f52166f);
            jSONObject.put("latest_end_time", this.f52167g);
            jSONObject.put("non_task_time", this.f52169i);
            jSONObject.put("tea_event_index", this.f52168h);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo51151a(long j) {
        this.f52169i += j;
    }

    /* renamed from: b */
    public final void mo51153b(String str) {
        this.f52163c = true;
        this.f52164d = str;
    }

    /* renamed from: c */
    public final void mo51156c(String str) {
        this.f52165e = true;
        this.f52166f = str;
    }

    public C19272d(long j) {
        this.f52161a = j;
        this.f52162b = TaskSessionDao.genSessionId();
        this.f52168h = TaskSessionDao.genTeaEventIndex();
    }

    /* renamed from: a */
    public static C19272d m63144a(C19272d dVar) {
        if (dVar == null) {
            return null;
        }
        C19272d dVar2 = new C19272d();
        dVar2.f52161a = dVar.f52161a;
        dVar2.f52162b = dVar.f52162b;
        dVar2.f52163c = dVar.f52163c;
        dVar2.f52164d = dVar.f52164d;
        dVar2.f52165e = dVar.f52165e;
        dVar2.f52166f = dVar.f52166f;
        dVar2.f52167g = dVar.f52167g;
        dVar2.f52169i = dVar.f52169i;
        dVar2.f52168h = dVar.f52168h;
        return dVar2;
    }

    /* renamed from: a */
    public static C19272d m63145a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session_id", "");
            C19272d dVar = new C19272d();
            dVar.f52162b = optString;
            dVar.f52161a = TeaUtils.optLong(jSONObject, "start_time");
            dVar.f52163c = jSONObject.optBoolean("is_front_continuous", false);
            dVar.f52164d = jSONObject.optString("front_session_id", "");
            dVar.f52165e = jSONObject.optBoolean("is_end_continuous", false);
            dVar.f52166f = jSONObject.optString("end_session_id", "");
            dVar.f52167g = TeaUtils.optLong(jSONObject, "latest_end_time");
            dVar.f52169i = TeaUtils.optLong(jSONObject, "non_task_time");
            dVar.f52168h = TeaUtils.optLong(jSONObject, "tea_event_index");
            return dVar;
        } catch (JSONException unused) {
            return null;
        }
    }
}
