package com.bytedance.android.livesdk.player;

import android.os.SystemClock;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.live.p402a.C8384a;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.k */
public final class C8773k extends C3168a {

    /* renamed from: a */
    private C8384a f23816a;

    /* renamed from: b */
    private long f23817b;

    /* renamed from: c */
    private volatile boolean f23818c;

    /* renamed from: d */
    private volatile boolean f23819d;

    /* renamed from: e */
    private int f23820e;

    /* renamed from: f */
    private C8775m f23821f;

    /* renamed from: b */
    public final void mo21822b() {
        this.f23820e = 1;
    }

    /* renamed from: c */
    private long m26216c() {
        long j;
        if (this.f23816a != null) {
            j = this.f23816a.mo21546a();
        } else if (this.f23817b > 0) {
            j = SystemClock.uptimeMillis() - this.f23817b;
        } else {
            j = 0;
        }
        this.f23816a = null;
        this.f23817b = 0;
        return j;
    }

    /* renamed from: a */
    public final void mo21815a() {
        this.f23820e = 2;
        if (this.f23821f != null) {
            mo21818a(this.f23821f.f23822a, this.f23821f.f23823b, this.f23821f.f23824c, this.f23821f.f23825d, this.f23821f.f23826e);
            this.f23821f = null;
        }
    }

    /* renamed from: a */
    public final void mo21821a(C8384a aVar) {
        if (aVar != null) {
            this.f23816a = aVar;
        } else {
            this.f23817b = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo21819a(long j) {
        String str;
        if (!this.f23818c) {
            this.f23818c = true;
            if (this.f23816a != null) {
                str = this.f23816a.f22984a;
            } else {
                str = "other";
            }
            long c = m26216c();
            JSONObject jSONObject = new JSONObject();
            m11984a(jSONObject, "enter_room_type", str);
            m11983a(jSONObject, "room_id", j);
            C3172e.m12000a("ttlive_audience_enter_room_all", 2, c, jSONObject);
            C3172e.m12002a("ttlive_audience_enter_room_error", 2, jSONObject);
            C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_audience_enter_room", 2, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo21816a(int i, String str) {
        if (!this.f23819d) {
            this.f23819d = true;
            JSONObject jSONObject = new JSONObject();
            m11983a(jSONObject, "exit_code", (long) i);
            m11984a(jSONObject, "exit_msg", str);
            C3172e.m12002a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo21820a(long j, String str) {
        String str2;
        if (!this.f23818c) {
            this.f23818c = true;
            if (this.f23816a != null) {
                str2 = this.f23816a.f22984a;
            } else {
                str2 = "other";
            }
            long c = m26216c();
            JSONObject jSONObject = new JSONObject();
            m11984a(jSONObject, "enter_room_type", str2);
            m11983a(jSONObject, "room_id", j);
            m11984a(jSONObject, "pull_url", str);
            C3172e.m12000a("ttlive_audience_enter_room_all", 0, c, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo21817a(int i, String str, long j) {
        if (!this.f23819d) {
            if (i != 115) {
                this.f23819d = true;
            }
            JSONObject jSONObject = new JSONObject();
            m11983a(jSONObject, "exit_code", (long) i);
            m11984a(jSONObject, "exit_msg", str);
            m11983a(jSONObject, "room_id", j);
            C3172e.m12002a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo21823b(int i, String str, long j, String str2, String str3) {
        if (this.f23820e != 1) {
            if (this.f23820e == 2) {
                mo21818a(i, str, j, str2, str3);
                return;
            }
            if (this.f23821f == null) {
                C8775m mVar = new C8775m(i, str, j, str2, str3);
                this.f23821f = mVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo21818a(int i, String str, long j, String str2, String str3) {
        String str4;
        if (!this.f23818c) {
            this.f23818c = true;
            if (this.f23816a != null) {
                str4 = this.f23816a.f22984a;
            } else {
                str4 = "other";
            }
            m26216c();
            JSONObject jSONObject = new JSONObject();
            m11984a(jSONObject, "enter_room_type", str4);
            m11984a(jSONObject, "room_type", str2);
            m11983a(jSONObject, "error_code", (long) i);
            m11984a(jSONObject, "error_msg", str);
            m11983a(jSONObject, "room_id", j);
            m11984a(jSONObject, "pull_url", str3);
            C3172e.m12008b("ttlive_audience_enter_room_all", 1, jSONObject);
            C3172e.m12002a("ttlive_audience_enter_room_error", 1, jSONObject);
            C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_audience_enter_room", 1, jSONObject);
        }
    }
}
