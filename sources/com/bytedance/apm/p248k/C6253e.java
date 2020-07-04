package com.bytedance.apm.p248k;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.util.LongSparseArray;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.util.C9640c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.e */
public final class C6253e extends C6244a {

    /* renamed from: a */
    private boolean f18401a;

    /* renamed from: d */
    private long f18402d;

    /* renamed from: e */
    private long f18403e;

    /* renamed from: f */
    private long f18404f;

    /* renamed from: g */
    private long f18405g;

    /* renamed from: h */
    private long f18406h = 120;

    /* renamed from: a */
    private static String m19386a(boolean z) {
        return z ? "total_pss_background_used_rate" : "total_pss_foreground_used_rate";
    }

    /* renamed from: b */
    private static String m19389b(boolean z) {
        return z ? "total_pss_background" : "total_pss_foreground";
    }

    /* renamed from: c */
    private static String m19392c(boolean z) {
        return z ? "native_pss_background_used_rate" : "native_pss_foreground_used_rate";
    }

    /* renamed from: d */
    private static String m19393d(boolean z) {
        return z ? "native_pss_background" : "native_pss_foreground";
    }

    /* renamed from: e */
    private static String m19394e(boolean z) {
        return z ? "dalvik_pss_background_used_rate" : "dalvik_pss_foreground_used_rate";
    }

    /* renamed from: f */
    private static String m19395f(boolean z) {
        return z ? "dalvik_pss_background" : "dalvik_pss_foreground";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return true;
    }

    /* renamed from: e */
    public final void mo14867e() {
        m19387a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return this.f18406h * 1000;
    }

    public final void onReady() {
        super.onReady();
        this.f18401a = ApmDelegate.getInstance().getServiceNameSwitch("enable_clear_memory");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14863b() {
        super.mo14863b();
        m19391b((JSONObject) null);
        if (!C6174c.m19145c()) {
            m19396i();
        }
    }

    /* renamed from: a */
    private void m19387a() {
        try {
            MemoryInfo a = C9640c.m28517a(Process.myPid(), C6174c.m19129a());
            if (a != null) {
                int i = a.dalvikPss;
                if (i > 0) {
                    boolean z = !ActivityLifeObserver.getInstance().isV2Foreground();
                    int i2 = a.nativePss;
                    int totalPss = a.getTotalPss();
                    JSONObject jSONObject = new JSONObject();
                    m19391b(jSONObject);
                    m19388a(i, z, i2, totalPss, jSONObject);
                    m19390b(i, z, i2, totalPss, jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("process_name", C6174c.m19141b());
                    jSONObject2.put("is_main_process", C6174c.m19141b());
                    jSONObject2.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
                    C9600e eVar = new C9600e("memory", "mem_monitor", false, jSONObject, jSONObject2, null);
                    m19342a(eVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: i */
    private void m19396i() {
        try {
            if (VERSION.SDK_INT >= 16) {
                if (this.f18401a) {
                    Resources resources = C6174c.m19129a().getResources();
                    Field declaredField = Class.forName("android.content.res.ResourcesImpl").getDeclaredField("sPreloadedDrawables");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (VERSION.SDK_INT <= 17) {
                        LongSparseArray longSparseArray = (LongSparseArray) declaredField.get(resources);
                        if (longSparseArray != null) {
                            longSparseArray.clear();
                        }
                        return;
                    }
                    LongSparseArray[] longSparseArrayArr = (LongSparseArray[]) declaredField.get(resources);
                    if (longSparseArrayArr != null) {
                        for (LongSparseArray longSparseArray2 : longSparseArrayArr) {
                            if (longSparseArray2 != null) {
                                longSparseArray2.clear();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C2077a.m9160a(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14862a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("mem_monitor_interval", 120);
        if (optLong > 0) {
            this.f18406h = optLong;
        }
    }

    /* renamed from: b */
    private void m19391b(JSONObject jSONObject) {
        if (VERSION.SDK_INT >= 23) {
            long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
            long parseLong2 = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
            long parseLong3 = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
            long parseLong4 = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
            if (jSONObject != null) {
                try {
                    jSONObject.put("gc_count", parseLong - this.f18402d);
                    jSONObject.put("gc_time", parseLong2 - this.f18403e);
                    jSONObject.put("block_gc_count", parseLong3 - this.f18404f);
                    jSONObject.put("block_gc_time", parseLong4 - this.f18405g);
                } catch (JSONException unused) {
                }
            }
            this.f18402d = parseLong;
            this.f18403e = parseLong2;
            this.f18404f = parseLong3;
            this.f18405g = parseLong4;
        }
    }

    /* renamed from: a */
    private void m19388a(int i, boolean z, int i2, int i3, JSONObject jSONObject) throws JSONException {
        jSONObject.put(m19395f(z), ((long) i) * 1024);
        jSONObject.put(m19393d(z), ((long) i2) * 1024);
        jSONObject.put(m19389b(z), ((long) i3) * 1024);
    }

    /* renamed from: b */
    private void m19390b(int i, boolean z, int i2, int i3, JSONObject jSONObject) throws JSONException {
        long d = C9640c.m28524d();
        if (d > 0) {
            float f = (float) d;
            jSONObject.put(m19394e(z), (double) (((((float) i) * 1.0f) * 1024.0f) / f));
            if (i2 > 0) {
                jSONObject.put(m19392c(z), (double) (((((float) i2) * 1.0f) * 1024.0f) / f));
            }
            if (i3 > 0) {
                double d2 = (double) (((((float) i3) * 1.0f) * 1024.0f) / f);
                jSONObject.put(m19386a(z), d2);
                if (d2 > 0.85d) {
                    jSONObject.put("reach_top", 1);
                    m19396i();
                }
            }
        }
    }
}
