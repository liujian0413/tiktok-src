package com.p280ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttvideoengine.p1812e.C46081f;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.ttvideoengine.x */
public final class C46169x {

    /* renamed from: g */
    private static String f118704g = "VideoCacheManager";

    /* renamed from: h */
    private static volatile File f118705h;

    /* renamed from: a */
    public volatile long f118706a;

    /* renamed from: b */
    private final LinkedHashMap<String, File> f118707b;

    /* renamed from: c */
    private final LinkedHashMap<String, C46081f> f118708c;

    /* renamed from: d */
    private final ReentrantReadWriteLock f118709d;

    /* renamed from: e */
    private final ReadLock f118710e;

    /* renamed from: f */
    private final WriteLock f118711f;

    /* renamed from: i */
    private volatile float f118712i;

    /* renamed from: j */
    private volatile boolean f118713j;

    /* renamed from: k */
    private final C46173b f118714k;

    /* renamed from: l */
    private C46171a f118715l;

    /* renamed from: com.ss.ttvideoengine.x$a */
    static class C46171a {

        /* renamed from: a */
        private HandlerThread f118718a;

        /* renamed from: b */
        private Handler f118719b;

        public C46171a() {
            try {
                this.f118718a = new HandlerThread("clearCacheThread");
                this.f118718a.start();
                this.f118719b = new Handler(this.f118718a.getLooper()) {
                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
                        return;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void handleMessage(android.os.Message r2) {
                        /*
                            r1 = this;
                            if (r2 != 0) goto L_0x0003
                            return
                        L_0x0003:
                            java.lang.Object r0 = r2.obj     // Catch:{ Throwable -> 0x001a }
                            com.ss.ttvideoengine.x r0 = (com.p280ss.ttvideoengine.C46169x) r0     // Catch:{ Throwable -> 0x001a }
                            int r2 = r2.what     // Catch:{ Throwable -> 0x001a }
                            switch(r2) {
                                case 0: goto L_0x0015;
                                case 1: goto L_0x0011;
                                case 2: goto L_0x000d;
                                default: goto L_0x000c;
                            }     // Catch:{ Throwable -> 0x001a }
                        L_0x000c:
                            goto L_0x0019
                        L_0x000d:
                            r0.mo112473d()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x0019
                        L_0x0011:
                            r0.mo112472c()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x001a
                        L_0x0015:
                            r0.mo112471b()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x001a
                        L_0x0019:
                            return
                        L_0x001a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.C46169x.C46171a.C461721.handleMessage(android.os.Message):void");
                    }
                };
            } catch (Throwable unused) {
                this.f118718a = null;
                this.f118719b = null;
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.x$b */
    static final class C46173b {

        /* renamed from: a */
        private final Map<String, Integer> f118721a;

        private C46173b() {
            this.f118721a = new HashMap();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo112476a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f118721a.containsKey(str);
        }
    }

    /* renamed from: com.ss.ttvideoengine.x$c */
    static class C46174c {

        /* renamed from: a */
        public static final C46169x f118722a = new C46169x();
    }

    /* renamed from: a */
    public static C46169x m145029a() {
        return C46174c.f118722a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo112472c() {
        C46123h.m144545a(f118704g, C1642a.m8034a("start clear all cache", new Object[0]));
        m145030a(0);
        C46123h.m144545a(f118704g, C1642a.m8034a("end clear all cache", new Object[0]));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo112473d() {
        C46123h.m144545a(f118704g, C1642a.m8034a("start clean file maxSize:%d", new Object[]{Long.valueOf(this.f118706a)}));
        m145030a(this.f118706a);
        C46123h.m144545a(f118704g, C1642a.m8034a("end clean file maxSize:%d", new Object[]{Long.valueOf(this.f118706a)}));
    }

    private C46169x() {
        this.f118707b = new LinkedHashMap<>(0, 0.75f, true);
        this.f118708c = new LinkedHashMap<>(0, 0.75f, true);
        this.f118709d = new ReentrantReadWriteLock();
        this.f118710e = this.f118709d.readLock();
        this.f118711f = this.f118709d.writeLock();
        this.f118706a = 209715200;
        this.f118712i = 0.3f;
        this.f118713j = false;
        this.f118714k = new C46173b();
        this.f118715l = new C46171a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo112471b() {
        C46123h.m144545a(f118704g, C1642a.m8034a("start init videocachemanager", new Object[0]));
        this.f118711f.lock();
        try {
            if (!this.f118713j && m145031a(f118705h)) {
                File[] listFiles = f118705h.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    final HashMap hashMap = new HashMap(listFiles.length);
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            arrayList.add(file);
                            hashMap.put(file, Long.valueOf(file.lastModified()));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<File>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            long longValue = ((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue();
                            if (longValue < 0) {
                                return -1;
                            }
                            if (longValue > 0) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        C46123h.m144545a(f118704g, C1642a.m8034a("add file:%s", new Object[]{file2.getName()}));
                        this.f118707b.put(m145034b(file2), file2);
                        String[] c = m145035c(file2);
                        if (m145032a(c)) {
                            String a = C1642a.m8034a("%s_%s", new Object[]{c[0], c[1]});
                            String a2 = C1642a.m8034a("%s_%s_%s_%s", new Object[]{c[0], c[1], c[2], c[3]});
                            String str = null;
                            if (c.length == 5) {
                                str = c[4];
                            }
                            String canonicalPath = file2.getCanonicalPath();
                            if (str != null && str.length() > 0) {
                                String c2 = C46122g.m144536c(str);
                                if (c2 != null && !c2.equals(str)) {
                                    canonicalPath = canonicalPath.replace(str, c2);
                                    file2.renameTo(new File(canonicalPath));
                                    str = c2;
                                }
                            }
                            this.f118708c.put(a, new C46081f(canonicalPath, a2, a2, str));
                        }
                    }
                }
                this.f118713j = true;
            }
        } catch (Throwable th) {
            this.f118711f.unlock();
            throw th;
        }
        this.f118711f.unlock();
        C46123h.m144545a(f118704g, C1642a.m8034a("end init videocachemanager", new Object[0]));
    }

    /* renamed from: b */
    private static String m145034b(File file) {
        return file.getName();
    }

    /* renamed from: c */
    private String[] m145035c(File file) {
        String name = file.getName();
        if (name == null) {
            return null;
        }
        return m145033a(name);
    }

    /* renamed from: a */
    private static boolean m145031a(File file) {
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m145032a(String[] strArr) {
        if (strArr == null || (strArr.length != 4 && strArr.length != 5)) {
            return false;
        }
        for (String str : strArr) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static String[] m145033a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split == null || split.length <= 0) {
            return null;
        }
        return split[0].split("_");
    }

    /* renamed from: a */
    private void m145030a(long j) {
        long j2 = j;
        HashSet hashSet = new HashSet();
        C46123h.m144545a(f118704g, C1642a.m8034a("start trim", new Object[0]));
        this.f118711f.lock();
        long j3 = 0;
        try {
            for (Entry value : this.f118707b.entrySet()) {
                j3 += ((File) value.getValue()).length();
            }
            C46123h.m144545a(f118704g, C1642a.m8034a("current file size:%d,maxsize:%d", new Object[]{Long.valueOf(j3), Long.valueOf(j)}));
            if (j3 <= j2) {
                this.f118711f.unlock();
                return;
            }
            long j4 = (long) (((float) j2) * this.f118712i);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (Entry entry : this.f118707b.entrySet()) {
                File file = (File) entry.getValue();
                if (file == null || !file.exists()) {
                    hashSet2.add(entry.getKey());
                } else if (!this.f118714k.mo112476a(m145034b(file))) {
                    long length = file.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getAbsolutePath());
                    sb.append("-tmp");
                    File file2 = new File(sb.toString());
                    if (file.renameTo(file2)) {
                        hashSet.add(file2);
                        j3 -= length;
                        hashSet2.add(entry.getKey());
                        String[] c = m145035c(file);
                        if (m145032a(c)) {
                            hashSet3.add(C1642a.m8034a("%s_%s", new Object[]{c[0], c[1]}));
                        }
                    }
                }
                if (j3 <= j4) {
                    break;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                this.f118707b.remove((String) it.next());
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                this.f118708c.remove((String) it2.next());
            }
            this.f118711f.unlock();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                File file3 = (File) it3.next();
                try {
                    try {
                        C46123h.m144545a(f118704g, C1642a.m8034a("delete file name:%s", new Object[]{file3.getName()}));
                        file3.delete();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
            C46123h.m144545a(f118704g, C1642a.m8034a("end trim", new Object[0]));
        } catch (Throwable th) {
            this.f118711f.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo112470a(String str, String str2) {
        if (this.f118711f.tryLock()) {
            try {
                String[] a = m145033a(str);
                if (m145032a(a)) {
                    String a2 = C1642a.m8034a("%s_%s", new Object[]{a[0], a[1]});
                    String a3 = C1642a.m8034a("%s_%s_%s_%s", new Object[]{a[0], a[1], a[2], a[3]});
                    String str3 = null;
                    if (a.length == 5) {
                        str3 = a[4];
                    }
                    C46081f fVar = new C46081f(str2, a3, a3, str3);
                    if (!this.f118708c.containsKey(a2)) {
                        this.f118708c.put(a2, fVar);
                    }
                }
            } catch (Throwable th) {
                this.f118711f.unlock();
                throw th;
            }
            this.f118711f.unlock();
        }
    }
}
