package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C13499h;
import java.util.UUID;

/* renamed from: com.facebook.appevents.internal.h */
final class C13184h {

    /* renamed from: a */
    public Long f34921a;

    /* renamed from: b */
    public Long f34922b;

    /* renamed from: c */
    public int f34923c;

    /* renamed from: d */
    public C13186j f34924d;

    /* renamed from: e */
    public UUID f34925e;

    /* renamed from: f */
    private Long f34926f;

    /* renamed from: c */
    public final void mo32358c() {
        this.f34923c++;
    }

    /* renamed from: d */
    public final long mo32359d() {
        if (this.f34926f == null) {
            return 0;
        }
        return this.f34926f.longValue();
    }

    /* renamed from: e */
    public final long mo32360e() {
        if (this.f34921a == null || this.f34922b == null) {
            return 0;
        }
        return this.f34922b.longValue() - this.f34921a.longValue();
    }

    /* renamed from: b */
    public static void m38530b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C13186j.m38540b();
    }

    /* renamed from: a */
    public static C13184h m38529a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C13184h hVar = new C13184h(Long.valueOf(j), Long.valueOf(j2));
        hVar.f34923c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        hVar.f34924d = C13186j.m38539a();
        hVar.f34926f = Long.valueOf(System.currentTimeMillis());
        hVar.f34925e = UUID.fromString(string);
        return hVar;
    }

    /* renamed from: f */
    public final void mo32361f() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f34921a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f34922b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f34923c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f34925e.toString());
        edit.apply();
        if (this.f34924d != null) {
            this.f34924d.mo32362c();
        }
    }

    public C13184h(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private C13184h(Long l, Long l2, UUID uuid) {
        this.f34921a = l;
        this.f34922b = l2;
        this.f34925e = uuid;
    }
}
