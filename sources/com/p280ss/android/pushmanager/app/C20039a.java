package com.p280ss.android.pushmanager.app;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.ss.android.pushmanager.app.a */
public final class C20039a {

    /* renamed from: a */
    private final int f54230a;

    /* renamed from: b */
    private final TreeMap<C20041a, C20041a> f54231b = new TreeMap<>(new Comparator<C20041a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m66001a((C20041a) obj, (C20041a) obj2);
        }

        /* renamed from: a */
        private static int m66001a(C20041a aVar, C20041a aVar2) {
            if (aVar == null) {
                return 1;
            }
            if (aVar2 == null) {
                return -1;
            }
            if (aVar.equals(aVar2)) {
                return 0;
            }
            if (aVar.f54234b > aVar2.f54234b) {
                return 1;
            }
            return -1;
        }
    });

    /* renamed from: com.ss.android.pushmanager.app.a$a */
    public class C20041a {

        /* renamed from: a */
        public Long f54233a;

        /* renamed from: b */
        public long f54234b;

        public final int hashCode() {
            return this.f54233a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.f54233a));
            sb.append("|");
            sb.append(String.valueOf(this.f54234b));
            return sb.toString();
        }

        public C20041a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C20041a) || obj == null) {
                return super.equals(obj);
            }
            return this.f54233a.equals(((C20041a) obj).f54233a);
        }

        /* renamed from: a */
        public final void mo53658a(String str) {
            if (str != null) {
                String[] split = str.split("\\|");
                if (split != null && split.length == 2) {
                    this.f54233a = Long.valueOf(split[0]);
                    this.f54234b = Long.valueOf(split[1]).longValue();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo53652a() {
        String str;
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            Set<Entry> entrySet = this.f54231b.entrySet();
            int i = 0;
            for (Entry value : entrySet) {
                C20041a aVar = (C20041a) value.getValue();
                if (aVar != null) {
                    if (i != entrySet.size() - 1) {
                        sb.append(aVar.toString());
                        sb.append("@");
                    } else {
                        sb.append(aVar.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
        } catch (Throwable unused) {
        }
        return str;
    }

    public C20039a(int i) {
        this.f54230a = i;
    }

    /* renamed from: a */
    public final synchronized boolean mo53654a(C20041a aVar) {
        if (aVar == null) {
            return false;
        }
        return this.f54231b.containsKey(aVar);
    }

    /* renamed from: b */
    public final synchronized C20041a mo53655b(C20041a aVar) {
        C20041a aVar2;
        if (aVar == null) {
            return null;
        }
        try {
            aVar2 = (C20041a) this.f54231b.get(aVar);
        } catch (Exception unused) {
            aVar2 = null;
        }
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53653a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r0 = r4.f54231b     // Catch:{ Exception -> 0x002c }
            r0.clear()     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = "@"
            java.lang.String[] r5 = r5.split(r0)     // Catch:{ Exception -> 0x002c }
            if (r5 == 0) goto L_0x002a
            int r0 = r5.length     // Catch:{ Exception -> 0x002c }
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x002a
            r2 = r5[r1]     // Catch:{ Exception -> 0x002c }
            com.ss.android.pushmanager.app.a$a r3 = new com.ss.android.pushmanager.app.a$a     // Catch:{ Exception -> 0x002c }
            r3.<init>()     // Catch:{ Exception -> 0x002c }
            r3.mo53658a(r2)     // Catch:{ Exception -> 0x002c }
            r4.mo53656c(r3)     // Catch:{ Exception -> 0x002c }
            int r1 = r1 + 1
            goto L_0x0018
        L_0x002a:
            monitor-exit(r4)
            return
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.app.C20039a.mo53653a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53656c(com.p280ss.android.pushmanager.app.C20039a.C20041a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            boolean r0 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 == 0) goto L_0x000e
            r2.mo53652a()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x000e:
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r0 = r2.f54231b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            int r1 = r2.f54230a     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 < r1) goto L_0x0029
            boolean r0 = r2.mo53654a(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 != 0) goto L_0x0029
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r0 = r2.f54231b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r1 = r2.f54231b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            java.lang.Object r1 = r1.firstKey()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.remove(r1)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0029:
            boolean r0 = r2.mo53654a(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 == 0) goto L_0x0034
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r0 = r2.f54231b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0034:
            java.util.TreeMap<com.ss.android.pushmanager.app.a$a, com.ss.android.pushmanager.app.a$a> r0 = r2.f54231b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.put(r3, r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            boolean r3 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r3 == 0) goto L_0x0042
            r2.mo53652a()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0042:
            monitor-exit(r2)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0047:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.app.C20039a.mo53656c(com.ss.android.pushmanager.app.a$a):void");
    }
}
