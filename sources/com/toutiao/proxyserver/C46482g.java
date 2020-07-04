package com.toutiao.proxyserver;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.toutiao.proxyserver.exception.FileNotDeleteException;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1842d.C46474a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.toutiao.proxyserver.g */
public final class C46482g extends C46467c {

    /* renamed from: a */
    final File f119763a;

    /* renamed from: b */
    public final LinkedHashMap<String, File> f119764b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    public final WriteLock f119765c = this.f119770h.writeLock();

    /* renamed from: d */
    public final Set<C46492a> f119766d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: e */
    public volatile long f119767e = 104857600;

    /* renamed from: f */
    public final C46493b f119768f = new C46493b();

    /* renamed from: g */
    public final Executor f119769g;

    /* renamed from: h */
    private final ReentrantReadWriteLock f119770h = new ReentrantReadWriteLock();

    /* renamed from: i */
    private final ReadLock f119771i = this.f119770h.readLock();

    /* renamed from: j */
    private volatile float f119772j = 0.5f;

    /* renamed from: k */
    private final Runnable f119773k;

    /* renamed from: l */
    private final Handler f119774l;

    /* renamed from: com.toutiao.proxyserver.g$a */
    public interface C46492a {
        /* renamed from: a */
        void mo115626a(String str);

        /* renamed from: a */
        void mo115627a(Set<String> set);
    }

    /* renamed from: com.toutiao.proxyserver.g$b */
    final class C46493b {

        /* renamed from: b */
        private final Map<String, Integer> f119788b;

        /* renamed from: c */
        private final Map<String, String> f119789c;

        private C46493b() {
            this.f119788b = new HashMap();
            this.f119789c = new HashMap();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final synchronized void mo115631c(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f119789c.remove(str);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final synchronized boolean mo115632d(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f119788b.containsKey(str);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo115628a(java.lang.String r4) throws com.toutiao.proxyserver.exception.FileNotDeleteException {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003c }
                if (r0 != 0) goto L_0x003a
                java.util.Map<java.lang.String, java.lang.String> r0 = r3.f119789c     // Catch:{ all -> 0x003c }
                boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x003c }
                if (r0 != 0) goto L_0x0034
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f119788b     // Catch:{ all -> 0x003c }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x003c }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x003c }
                r1 = 1
                if (r0 != 0) goto L_0x0025
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f119788b     // Catch:{ all -> 0x003c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003c }
                r0.put(r4, r1)     // Catch:{ all -> 0x003c }
                monitor-exit(r3)
                return
            L_0x0025:
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r3.f119788b     // Catch:{ all -> 0x003c }
                int r0 = r0.intValue()     // Catch:{ all -> 0x003c }
                int r0 = r0 + r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003c }
                r2.put(r4, r0)     // Catch:{ all -> 0x003c }
                goto L_0x003a
            L_0x0034:
                com.toutiao.proxyserver.exception.FileNotDeleteException r4 = new com.toutiao.proxyserver.exception.FileNotDeleteException     // Catch:{ all -> 0x003c }
                r4.<init>()     // Catch:{ all -> 0x003c }
                throw r4     // Catch:{ all -> 0x003c }
            L_0x003a:
                monitor-exit(r3)
                return
            L_0x003c:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46482g.C46493b.mo115628a(java.lang.String):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo115630b(java.lang.String r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003e }
                if (r0 != 0) goto L_0x003c
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f119788b     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x003e }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003c
                int r1 = r0.intValue()     // Catch:{ all -> 0x003e }
                r2 = 1
                if (r1 != r2) goto L_0x002e
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f119788b     // Catch:{ all -> 0x003e }
                r0.remove(r4)     // Catch:{ all -> 0x003e }
                java.util.Map<java.lang.String, java.lang.String> r0 = r3.f119789c     // Catch:{ all -> 0x003e }
                java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x003e }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x003e }
                if (r4 == 0) goto L_0x002c
                com.toutiao.proxyserver.g r0 = com.toutiao.proxyserver.C46482g.this     // Catch:{ all -> 0x003e }
                r0.mo115616f(r4)     // Catch:{ all -> 0x003e }
            L_0x002c:
                monitor-exit(r3)
                return
            L_0x002e:
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f119788b     // Catch:{ all -> 0x003e }
                int r0 = r0.intValue()     // Catch:{ all -> 0x003e }
                int r0 = r0 - r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003e }
                r1.put(r4, r0)     // Catch:{ all -> 0x003e }
            L_0x003c:
                monitor-exit(r3)
                return
            L_0x003e:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46482g.C46493b.mo115630b(java.lang.String):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo115629a(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0028 }
                if (r0 != 0) goto L_0x0026
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0028 }
                r0.<init>(r3)     // Catch:{ all -> 0x0028 }
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f119788b     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0021
                boolean r0 = r0.exists()     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0021
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.f119789c     // Catch:{ all -> 0x0028 }
                r0.put(r3, r4)     // Catch:{ all -> 0x0028 }
                monitor-exit(r2)
                return
            L_0x0021:
                com.toutiao.proxyserver.g r3 = com.toutiao.proxyserver.C46482g.this     // Catch:{ all -> 0x0028 }
                r3.mo115616f(r4)     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r2)
                return
            L_0x0028:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46482g.C46493b.mo115629a(java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: c */
    private void m146146c() {
        this.f119774l.removeCallbacks(this.f119773k);
        this.f119774l.postDelayed(this.f119773k, 10000);
    }

    /* renamed from: b */
    public final void mo115614b() {
        C46522q.m146227a().mo115685b();
        Context a = C46534r.m146257a();
        if (a != null) {
            C46463c.m146065a(a).mo115585a(0);
        }
        this.f119774l.removeCallbacks(this.f119773k);
        this.f119769g.execute(new Runnable() {
            public final void run() {
                C46482g.this.mo115615b(0);
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo115611a() {
        this.f119765c.lock();
        try {
            File[] listFiles = this.f119763a.listFiles();
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
                    this.f119764b.put(m146145a(file2), file2);
                }
            }
            this.f119765c.unlock();
            m146146c();
        } catch (Throwable th) {
            this.f119765c.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static String m146145a(File file) {
        return file.getName();
    }

    /* renamed from: a */
    public final void mo115612a(long j) {
        this.f119767e = j;
        m146146c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo115593b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f119768f.mo115630b(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo115594c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f119768f.mo115629a(C46474a.m146102a(str), str);
        }
    }

    /* renamed from: a */
    public final void mo115613a(C46492a aVar) {
        this.f119766d.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final File mo115596e(String str) {
        if (!this.f119771i.tryLock()) {
            return null;
        }
        File file = (File) this.f119764b.get(str);
        this.f119771i.unlock();
        return file;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115592a(String str) throws FileNotDeleteException {
        if (!TextUtils.isEmpty(str)) {
            this.f119768f.mo115628a(str);
        }
    }

    /* renamed from: f */
    public final void mo115616f(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C46522q.m146227a().mo115683a(false, str);
            this.f119774l.removeCallbacks(this.f119773k);
            this.f119769g.execute(new Runnable() {
                public final void run() {
                    HashSet hashSet;
                    String a = C46474a.m146102a(str);
                    C46482g.this.f119765c.lock();
                    try {
                        File file = (File) C46482g.this.f119764b.get(a);
                        if (file == null || C46482g.this.f119768f.mo115632d(C46482g.m146145a(file)) || !file.delete()) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet(1);
                            hashSet.add(a);
                            C46482g.this.f119764b.remove(a);
                            C46482g.this.f119768f.mo115631c(a);
                        }
                        if (hashSet != null) {
                            for (C46492a a2 : C46482g.this.f119766d) {
                                a2.mo115627a((Set<String>) hashSet);
                            }
                        }
                    } finally {
                        C46482g.this.f119765c.unlock();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final File mo115595d(String str) {
        this.f119771i.lock();
        File file = (File) this.f119764b.get(str);
        this.f119771i.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f119763a, str);
        this.f119765c.lock();
        this.f119764b.put(str, file2);
        this.f119765c.unlock();
        for (C46492a a : this.f119766d) {
            a.mo115626a(str);
        }
        m146146c();
        return file2;
    }

    public C46482g(File file) throws IOException {
        String str;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("DiskLruCache-cleanup-");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                thread.setDaemon(true);
                return thread;
            }
        }, new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
        this.f119769g = threadPoolExecutor;
        this.f119773k = new Runnable() {
            public final void run() {
                C46482g.this.f119769g.execute(new Runnable() {
                    public final void run() {
                        C46482g.this.mo115615b(C46482g.this.f119767e);
                    }
                });
            }
        };
        this.f119774l = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                StringBuilder sb = new StringBuilder("exists: ");
                sb.append(file.exists());
                sb.append(", isDirectory: ");
                sb.append(file.isDirectory());
                sb.append(", canRead: ");
                sb.append(file.canRead());
                sb.append(", canWrite: ");
                sb.append(file.canWrite());
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("dir error!  ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
        this.f119763a = file;
        this.f119769g.execute(new Runnable() {
            public final void run() {
                C46482g.this.mo115611a();
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        r12.f119765c.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7 A[ExcHandler: all (r13v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115615b(long r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.f119765c
            r1.lock()
            r1 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r12.f119764b     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            long r4 = r4.length()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            r6 = 0
            long r1 = r1 + r4
            goto L_0x0016
        L_0x002f:
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0039
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f119765c
            r13.unlock()
            return
        L_0x0039:
            float r13 = (float) r13
            float r14 = r12.f119772j     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            r3.<init>()     // Catch:{ Throwable -> 0x00ce, all -> 0x00c7 }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r12.f119764b     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
        L_0x004e:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.Object r6 = r5.getValue()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r6 == 0) goto L_0x00a5
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r7 == 0) goto L_0x00a5
            com.toutiao.proxyserver.g$b r7 = r12.f119768f     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.String r8 = m146145a(r6)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            boolean r7 = r7.mo115632d(r8)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r7 != 0) goto L_0x00ac
            long r7 = r6.length()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.io.File r9 = new java.io.File     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r10.<init>()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r10.append(r11)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            boolean r6 = r6.renameTo(r9)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r6 == 0) goto L_0x00ac
            r0.add(r9)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r6 = 0
            long r1 = r1 - r7
            java.lang.Object r5 = r5.getKey()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r3.add(r5)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            goto L_0x00ac
        L_0x00a5:
            java.lang.Object r5 = r5.getKey()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r3.add(r5)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
        L_0x00ac:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b1
            goto L_0x004e
        L_0x00b1:
            java.util.Iterator r13 = r3.iterator()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
        L_0x00b5:
            boolean r14 = r13.hasNext()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            if (r14 == 0) goto L_0x00cf
            java.lang.Object r14 = r13.next()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.f119764b     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            r1.remove(r14)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c7 }
            goto L_0x00b5
        L_0x00c7:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.f119765c
            r14.unlock()
            throw r13
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f119765c
            r13.unlock()
            java.util.Set<com.toutiao.proxyserver.g$a> r13 = r12.f119766d
            java.util.Iterator r13 = r13.iterator()
        L_0x00da:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ea
            java.lang.Object r14 = r13.next()
            com.toutiao.proxyserver.g$a r14 = (com.toutiao.proxyserver.C46482g.C46492a) r14
            r14.mo115627a(r3)
            goto L_0x00da
        L_0x00ea:
            java.util.concurrent.Executor r13 = r12.f119769g
            com.toutiao.proxyserver.g$8 r14 = new com.toutiao.proxyserver.g$8
            r14.<init>(r0)
            r13.execute(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46482g.mo115615b(long):void");
    }
}
