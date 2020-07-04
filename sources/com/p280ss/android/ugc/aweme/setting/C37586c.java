package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.apm.C6159b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.c */
public final class C37586c {

    /* renamed from: a */
    public static final C37586c f98012a = new C37586c();

    /* renamed from: b */
    private Keva f98013b;

    /* renamed from: c */
    private C6600e f98014c;

    /* renamed from: d */
    private Random f98015d = new Random();

    /* renamed from: e */
    private boolean f98016e;

    /* renamed from: a */
    public final boolean mo94893a(String str, boolean z) {
        return this.f98013b.getBoolean(str, z);
    }

    /* renamed from: a */
    public final String[] mo94894a(String str) {
        return this.f98013b.getStringArray(str, null);
    }

    /* renamed from: a */
    public final void mo94891a(String str, String[] strArr) {
        this.f98013b.storeStringArray(str, strArr);
    }

    /* renamed from: a */
    public final void mo94889a(long j, long j2, String str) {
        if (m120362b()) {
            m120361a(Long.valueOf(j), Long.valueOf(j2), j == j2, str);
        }
    }

    /* renamed from: a */
    public final void mo94892a(boolean z, boolean z2, String str) {
        if (m120362b()) {
            m120361a(Boolean.valueOf(z), Boolean.valueOf(z2), z == z2, str);
        }
    }

    /* renamed from: a */
    public final void mo94890a(Object obj, Object obj2, String str) {
        if (m120362b()) {
            String b = mo94884a().mo15979b(obj);
            String b2 = mo94884a().mo15979b(obj2);
            m120361a(b, b2, String.valueOf(b).equals(String.valueOf(b2)), str);
        }
    }

    /* renamed from: b */
    private boolean m120362b() {
        if (!this.f98016e || !ApmDelegate.getInstance().getLogTypeSwitch("aweme_monitor_ab_report") || this.f98015d.nextInt(100) != 0) {
            return false;
        }
        return true;
    }

    private C37586c() {
        boolean z;
        if (this.f98015d.nextInt(1000) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f98016e = z;
        System.nanoTime();
        this.f98013b = Keva.getRepoSync("abtest_data_repo", 1);
    }

    /* renamed from: a */
    public final C6600e mo94884a() {
        if (this.f98014c == null) {
            this.f98014c = new C6600e();
        }
        return this.f98014c;
    }

    /* renamed from: a */
    public final double mo94881a(String str, double d) {
        return this.f98013b.getDouble(str, d);
    }

    /* renamed from: b */
    public final void mo94895b(String str, double d) {
        this.f98013b.storeDouble(str, d);
    }

    /* renamed from: a */
    public final int mo94882a(String str, int i) {
        return this.f98013b.getInt(str, i);
    }

    /* renamed from: b */
    public final void mo94896b(String str, int i) {
        this.f98013b.storeInt(str, i);
    }

    /* renamed from: a */
    public final long mo94883a(String str, long j) {
        return this.f98013b.getLong(str, j);
    }

    /* renamed from: b */
    public final void mo94897b(String str, long j) {
        this.f98013b.storeLong(str, j);
    }

    /* renamed from: b */
    public final void mo94898b(String str, String str2) {
        this.f98013b.storeString(str, str2);
    }

    /* renamed from: a */
    public final Object mo94885a(String str, Class cls) {
        return mo94884a().mo15974a(this.f98013b.getString(str, null), cls);
    }

    /* renamed from: b */
    public final void mo94899b(String str, boolean z) {
        this.f98013b.storeBoolean(str, z);
    }

    /* renamed from: a */
    public final String mo94886a(String str, String str2) {
        return this.f98013b.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo94887a(double d, double d2, String str) {
        boolean z;
        if (m120362b()) {
            Double valueOf = Double.valueOf(d);
            Double valueOf2 = Double.valueOf(d2);
            if (d == d2) {
                z = true;
            } else {
                z = false;
            }
            m120361a(valueOf, valueOf2, z, str);
        }
    }

    /* renamed from: a */
    public final void mo94888a(int i, int i2, String str) {
        boolean z;
        if (m120362b()) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            m120361a(valueOf, valueOf2, z, str);
        }
    }

    /* renamed from: a */
    private static void m120361a(Object obj, Object obj2, boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("kv_perf_key", str);
            jSONObject.put("kv_perf_spsp_value", obj2);
            jSONObject.put("kv_perf_keva_value", obj);
            jSONObject.put("kv_perf_read_same", z);
        } catch (Throwable unused) {
        }
        C6159b.m19110a("aweme_monitor_ab_report", jSONObject);
    }
}
