package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.performance.BaseSampler.C3220a;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.performance.b */
public final class C3222b {

    /* renamed from: a */
    public static Handler f9907a;

    /* renamed from: e */
    private static C3222b f9908e = new C3222b();

    /* renamed from: g */
    private static Handler f9909g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private boolean f9910b;

    /* renamed from: c */
    private int f9911c = C34943c.f91128x;

    /* renamed from: d */
    private final int f9912d = 3000;

    /* renamed from: f */
    private ConcurrentHashMap<String, BaseSampler> f9913f = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C3222b m12218a() {
        return f9908e;
    }

    /* renamed from: a */
    public final void mo10142a(boolean z, int i) {
        this.f9910b = z;
        this.f9911c = i;
        HandlerThread handlerThread = new HandlerThread("monitor-performance", 10);
        handlerThread.start();
        f9907a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final void mo10140a(String str, HashMap<String, String> hashMap) {
        if (this.f9910b) {
            for (String str2 : this.f9913f.keySet()) {
                if (str2.contains(str)) {
                    BaseSampler baseSampler = (BaseSampler) this.f9913f.get(str2);
                    if (baseSampler != null) {
                        baseSampler.mo10120a(hashMap);
                    }
                    this.f9913f.remove(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10141a(ArrayList arrayList, String str, String str2, HashMap<String, String> hashMap) {
        JSONObject a = m12219a(arrayList, str, str2);
        if (hashMap != null) {
            TimeCostUtil.m12205a(a, "extra", C2317a.m9932a().mo15979b((Object) hashMap));
        }
        C3172e.m12008b(TimeCostUtil.m12197a(str), 0, a);
        new StringBuilder("monitor:").append(a.toString());
    }

    private C3222b() {
    }

    /* renamed from: a */
    public final void mo10134a(String str) {
        mo10140a(str, null);
    }

    /* renamed from: a */
    public static double m12217a(ArrayList<Double> arrayList) {
        double d = 0.0d;
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Double d2 = (Double) it.next();
            if (d2 != null) {
                d += d2.doubleValue();
            } else {
                i++;
            }
        }
        double size = (double) (arrayList.size() - i);
        Double.isNaN(size);
        return d / size;
    }

    /* renamed from: b */
    public final void mo10143b(String str) {
        if (this.f9910b) {
            for (String str2 : this.f9913f.keySet()) {
                if (str2.contains(str)) {
                    ((BaseSampler) this.f9913f.get(str2)).mo10117a();
                    this.f9913f.remove(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12220a(Lifecycle lifecycle, BaseSampler baseSampler) {
        if (lifecycle != null) {
            try {
                lifecycle.mo56b(baseSampler);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* renamed from: b */
    public final void mo10144b(String str, Lifecycle lifecycle, Context context) {
        mo10145b(str, lifecycle, context, -1);
    }

    /* renamed from: c */
    public final void mo10147c(String str, Lifecycle lifecycle, Context context) {
        mo10144b(str, lifecycle, context);
        mo10135a(str, lifecycle, context);
    }

    /* renamed from: b */
    public final void mo10146b(String str, C0043i iVar, Context context) {
        mo10144b(str, iVar.getLifecycle(), context);
    }

    /* renamed from: c */
    public final void mo10148c(String str, C0043i iVar, Context context) {
        mo10146b(str, iVar, context);
        mo10137a(str, iVar, context);
    }

    /* renamed from: a */
    public final void mo10135a(String str, Lifecycle lifecycle, Context context) {
        mo10136a(str, lifecycle, context, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m12219a(java.util.ArrayList r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            monitor-enter(r10)     // Catch:{ Throwable -> 0x00aa }
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "biz"
            com.bytedance.android.live.core.performance.TimeCostUtil.m12205a(r0, r1, r11)     // Catch:{ all -> 0x00a7 }
        L_0x0011:
            if (r10 == 0) goto L_0x00a5
            int r11 = r10.size()     // Catch:{ all -> 0x00a7 }
            if (r11 != 0) goto L_0x001b
            goto L_0x00a5
        L_0x001b:
            java.lang.String r11 = "mem"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x008c
            int r11 = r10.size()     // Catch:{ all -> 0x00a7 }
            r1 = 1
            r2 = 0
            if (r11 != r1) goto L_0x0037
            java.lang.String r11 = "mem"
            java.lang.Object r12 = r10.get(r2)     // Catch:{ all -> 0x00a7 }
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch:{ all -> 0x00a7 }
            com.bytedance.android.live.core.performance.TimeCostUtil.m12206a(r0, r11, r12)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a3
        L_0x0037:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x00a7 }
            r11.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x00a7 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x00a7 }
            r3 = 0
        L_0x0043:
            org.json.JSONArray r4 = r1.names()     // Catch:{ all -> 0x00a7 }
            int r4 = r4.length()     // Catch:{ all -> 0x00a7 }
            if (r3 >= r4) goto L_0x0088
            org.json.JSONArray r4 = r1.names()     // Catch:{ JSONException -> 0x007f }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x007f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x007f }
            r5.<init>()     // Catch:{ JSONException -> 0x007f }
            java.util.Iterator r6 = r10.iterator()     // Catch:{ JSONException -> 0x007f }
        L_0x005e:
            boolean r7 = r6.hasNext()     // Catch:{ JSONException -> 0x007f }
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r6.next()     // Catch:{ JSONException -> 0x007f }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x007f }
            int r7 = r7.optInt(r4, r2)     // Catch:{ JSONException -> 0x007f }
            double r7 = (double) r7     // Catch:{ JSONException -> 0x007f }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ JSONException -> 0x007f }
            r5.add(r7)     // Catch:{ JSONException -> 0x007f }
            goto L_0x005e
        L_0x0077:
            double r5 = m12217a(r5)     // Catch:{ JSONException -> 0x007f }
            r11.put(r4, r5)     // Catch:{ JSONException -> 0x007f }
            goto L_0x0085
        L_0x007f:
            r4 = move-exception
            java.lang.String r5 = "PerformanceMonitor"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r5, r4)     // Catch:{ all -> 0x00a7 }
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0088:
            com.bytedance.android.live.core.performance.TimeCostUtil.m12206a(r0, r12, r11)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a3
        L_0x008c:
            java.lang.String r11 = "cpu"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 != 0) goto L_0x009c
            java.lang.String r11 = "fps"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x00a3
        L_0x009c:
            double r1 = m12217a(r10)     // Catch:{ all -> 0x00a7 }
            com.bytedance.android.live.core.performance.TimeCostUtil.m12203a(r0, r12, r1)     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00a5:
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00a7:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ Throwable -> 0x00aa }
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.performance.C3222b.m12219a(java.util.ArrayList, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public final void mo10137a(String str, C0043i iVar, Context context) {
        mo10135a(str, iVar.getLifecycle(), context);
    }

    /* renamed from: a */
    public final void mo10136a(final String str, final Lifecycle lifecycle, Context context, int i) {
        if (this.f9910b) {
            if (TextUtils.equals(str, Tag.CreateLive.name())) {
                lifecycle = null;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("-mem");
            String sb2 = sb.toString();
            if (i == -1) {
                i = this.f9911c;
            }
            final MemSampler memSampler = new MemSampler(i, 3000);
            this.f9913f.put(sb2, memSampler);
            if (lifecycle != null) {
                lifecycle.mo55a(memSampler);
            }
            memSampler.mo10118a(f9907a, context, new C3220a() {
                /* renamed from: a */
                public final void mo10127a() {
                    C3222b.m12220a(lifecycle, (BaseSampler) memSampler);
                }

                /* renamed from: a */
                public final void mo10128a(ArrayList arrayList, HashMap<String, String> hashMap) {
                    C3222b.f9907a.post(new C3227d(this, arrayList, str, hashMap));
                    C3222b.m12220a(lifecycle, (BaseSampler) memSampler);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo10149a(ArrayList arrayList, String str, HashMap hashMap) {
                    C3222b.this.mo10141a(arrayList, str, "mem", hashMap);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo10145b(final String str, final Lifecycle lifecycle, Context context, int i) {
        if (this.f9910b) {
            if (TextUtils.equals(str, Tag.CreateLive.name())) {
                lifecycle = null;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("-cpu");
            String sb2 = sb.toString();
            if (i == -1) {
                i = this.f9911c;
            }
            final CpuSampler cpuSampler = new CpuSampler(i, 3000);
            this.f9913f.put(sb2, cpuSampler);
            if (lifecycle != null) {
                lifecycle.mo55a(cpuSampler);
            }
            cpuSampler.mo10118a(f9907a, context, new C3220a() {
                /* renamed from: a */
                public final void mo10127a() {
                    C3222b.m12220a(lifecycle, (BaseSampler) cpuSampler);
                }

                /* renamed from: a */
                public final void mo10128a(ArrayList arrayList, HashMap<String, String> hashMap) {
                    C3222b.f9907a.post(new C3228e(this, arrayList, str, hashMap));
                    C3222b.m12220a(lifecycle, (BaseSampler) cpuSampler);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo10150a(ArrayList arrayList, String str, HashMap hashMap) {
                    if (C3222b.m12217a(arrayList) != 0.0d) {
                        C3222b.this.mo10141a(arrayList, str, "cpu", hashMap);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo10138a(String str, C0043i iVar, Context context, int i) {
        if (!this.f9910b || !FpsSampler.m12192c()) {
            return;
        }
        if (i == 0) {
            mo10134a(str);
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("-fps");
        String sb2 = sb.toString();
        Handler handler = f9909g;
        C3226c cVar = new C3226c(this, sb2, iVar, context, str);
        handler.post(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10139a(String str, final C0043i iVar, Context context, final String str2) {
        final FpsSampler fpsSampler = new FpsSampler(Choreographer.getInstance(), this.f9911c, 3000);
        this.f9913f.put(str, fpsSampler);
        iVar.getLifecycle().mo55a(fpsSampler);
        fpsSampler.mo10130b();
        fpsSampler.mo10118a(f9907a, context, new C3220a() {
            /* renamed from: a */
            public final void mo10127a() {
                C3222b.m12220a(iVar.getLifecycle(), (BaseSampler) fpsSampler);
            }

            /* renamed from: a */
            public final void mo10128a(ArrayList arrayList, HashMap<String, String> hashMap) {
                C3222b.f9907a.post(new C3229f(this, arrayList, str2, hashMap));
                C3222b.m12220a(iVar.getLifecycle(), (BaseSampler) fpsSampler);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo10151a(ArrayList arrayList, String str, HashMap hashMap) {
                C3222b.this.mo10141a(arrayList, str, "fps", hashMap);
            }
        });
    }
}
