package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fo */
public final class C16533fo implements C16519fa {

    /* renamed from: a */
    static final Map<String, C16533fo> f46316a = new HashMap();

    /* renamed from: b */
    private final SharedPreferences f46317b;

    /* renamed from: c */
    private final OnSharedPreferenceChangeListener f46318c = new C16534fp(this);

    /* renamed from: d */
    private final Object f46319d = new Object();

    /* renamed from: e */
    private volatile Map<String, ?> f46320e;

    /* renamed from: f */
    private final List<Object> f46321f = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, java.lang.String, com.google.android.gms.internal.measurement.fo] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [java.lang.Object, java.lang.String, com.google.android.gms.internal.measurement.fo]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Object, java.lang.String, com.google.android.gms.internal.measurement.fo]
      mth insns count: 34
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C16533fo m53882a(android.content.Context r4, java.lang.String r5) {
        /*
            boolean r5 = com.google.android.gms.internal.measurement.C16513ev.m53821a()
            r0 = 0
            if (r5 == 0) goto L_0x0014
            java.lang.String r5 = "direct_boot:"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0014
            boolean r5 = com.google.android.gms.internal.measurement.C16513ev.m53822a(r4)
            goto L_0x0015
        L_0x0014:
            r5 = 1
        L_0x0015:
            if (r5 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.Class<com.google.android.gms.internal.measurement.fo> r5 = com.google.android.gms.internal.measurement.C16533fo.class
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.fo> r1 = f46316a     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0053 }
            com.google.android.gms.internal.measurement.fo r1 = (com.google.android.gms.internal.measurement.C16533fo) r1     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            com.google.android.gms.internal.measurement.fo r1 = new com.google.android.gms.internal.measurement.fo     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "direct_boot:"
            boolean r2 = r0.startsWith(r2)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r2 == 0) goto L_0x0045
            boolean r2 = com.google.android.gms.internal.measurement.C16513ev.m53821a()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x003a
            android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0053 }
        L_0x003a:
            r2 = 12
            java.lang.String r2 = r0.substring(r2)     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences r4 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r2, r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0049
        L_0x0045:
            android.content.SharedPreferences r4 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r0, r3)     // Catch:{ all -> 0x0053 }
        L_0x0049:
            r1.<init>(r4)     // Catch:{ all -> 0x0053 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.fo> r4 = f46316a     // Catch:{ all -> 0x0053 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x0053:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533fo.m53882a(android.content.Context, java.lang.String):com.google.android.gms.internal.measurement.fo");
    }

    private C16533fo(SharedPreferences sharedPreferences) {
        this.f46317b = sharedPreferences;
        this.f46317b.registerOnSharedPreferenceChangeListener(this.f46318c);
    }

    /* renamed from: a */
    public final Object mo42707a(String str) {
        Map<String, ?> map = this.f46320e;
        if (map == null) {
            synchronized (this.f46319d) {
                map = this.f46320e;
                if (map == null) {
                    map = this.f46317b.getAll();
                    this.f46320e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo42723a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f46319d) {
            this.f46320e = null;
            C16526fh.m53854a();
        }
        synchronized (this) {
            Iterator it = this.f46321f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
