package com.google.firebase.iid;

import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.af */
final class C18308af {

    /* renamed from: a */
    private int f49764a;

    /* renamed from: b */
    private final Map<Integer, C17058g<Void>> f49765b = new ArrayMap();

    /* renamed from: c */
    private final C18303aa f49766c;

    C18308af(C18303aa aaVar) {
        this.f49766c = aaVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C17057f<Void> mo47216a(String str) {
        String a;
        C17058g gVar;
        int i;
        synchronized (this.f49766c) {
            a = this.f49766c.mo47204a();
            C18303aa aaVar = this.f49766c;
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(str).length());
            sb.append(a);
            sb.append(",");
            sb.append(str);
            aaVar.mo47205a(sb.toString());
        }
        gVar = new C17058g();
        Map<Integer, C17058g<Void>> map = this.f49765b;
        if (TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = a.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.f49764a + i), gVar);
        return gVar.f47728a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo47217a() {
        return m60379b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = (com.google.android.gms.tasks.C17058g) r4.f49765b.remove(java.lang.Integer.valueOf(r4.f49764a));
        m60380b(r0);
        r4.f49764a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r2.mo44299a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (m60378a(r5, r0) != false) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47218a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m60379b()     // Catch:{ all -> 0x0038 }
            r1 = 1
            if (r0 != 0) goto L_0x000d
            com.google.firebase.iid.FirebaseInstanceId.m60328g()     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            boolean r2 = m60378a(r5, r0)
            if (r2 != 0) goto L_0x0016
            r5 = 0
            return r5
        L_0x0016:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.g<java.lang.Void>> r2 = r4.f49765b     // Catch:{ all -> 0x0035 }
            int r3 = r4.f49764a     // Catch:{ all -> 0x0035 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0035 }
            com.google.android.gms.tasks.g r2 = (com.google.android.gms.tasks.C17058g) r2     // Catch:{ all -> 0x0035 }
            r4.m60380b(r0)     // Catch:{ all -> 0x0035 }
            int r0 = r4.f49764a     // Catch:{ all -> 0x0035 }
            int r0 = r0 + r1
            r4.f49764a = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo44299a(r0)
            goto L_0x0000
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r5
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18308af.mo47218a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    /* renamed from: b */
    private final String m60379b() {
        String a;
        synchronized (this.f49766c) {
            a = this.f49766c.mo47204a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* renamed from: b */
    private final synchronized boolean m60380b(String str) {
        synchronized (this.f49766c) {
            String a = this.f49766c.mo47204a();
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (!a.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                return false;
            }
            String valueOf3 = String.valueOf(",");
            String valueOf4 = String.valueOf(str);
            this.f49766c.mo47205a(a.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length()));
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m60378a(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        firebaseInstanceId.mo47188b(str3);
                        boolean g = FirebaseInstanceId.m60328g();
                        break;
                    case 1:
                        firebaseInstanceId.mo47190c(str3);
                        FirebaseInstanceId.m60328g();
                        break;
                }
            } catch (IOException e) {
                String str4 = "Topic sync failed: ";
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str4.concat(valueOf);
                } else {
                    new String(str4);
                }
                return false;
            }
        }
        return true;
    }
}
