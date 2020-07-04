package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f37712a;

    /* renamed from: b */
    static C14620j f37713b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f37714c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static C14623m[] f37715d = null;

    /* renamed from: e */
    private static int f37716e = 0;

    /* renamed from: f */
    private static C14627p f37717f;

    /* renamed from: g */
    private static C14604b f37718g;

    /* renamed from: h */
    private static final HashSet<String> f37719h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f37720i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f37721j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static C14626o f37722k = null;

    /* renamed from: l */
    private static int f37723l;

    static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m42258a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f37712a = z;
    }

    /* renamed from: a */
    private static int m42244a() {
        int i;
        f37714c.writeLock().lock();
        try {
            if ((f37723l & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            return i;
        } finally {
            f37714c.writeLock().unlock();
        }
    }

    /* renamed from: c */
    private static void m42256c() {
        f37714c.readLock().lock();
        try {
            if (f37715d == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f37714c.readLock().unlock();
        }
    }

    /* renamed from: b */
    private static Method m42253b() {
        Method method;
        if (VERSION.SDK_INT < 23) {
            return null;
        }
        try {
            if (VERSION.SDK_INT <= 27) {
                method = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
            } else {
                method = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class});
            }
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m42252b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: a */
    private static synchronized void m42247a(C14620j jVar) {
        final boolean z;
        String str;
        synchronized (SoLoader.class) {
            if (jVar != null) {
                f37713b = jVar;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method b = m42253b();
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = Api14Utils.m42258a();
            } else {
                str = null;
            }
            final String str2 = str;
            final String b2 = m42252b(str2);
            C146011 r1 = new C14620j() {
                /* renamed from: a */
                public final void mo36846a(String str, int i) {
                    boolean z;
                    String str2;
                    String str3;
                    if (z) {
                        if ((i & 4) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str2 = str2;
                        } else {
                            str2 = b2;
                        }
                        try {
                            synchronized (runtime) {
                                if (VERSION.SDK_INT <= 27) {
                                    str3 = (String) b.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                                } else {
                                    str3 = (String) b.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader()});
                                }
                                if (str3 != null) {
                                    throw new UnsatisfiedLinkError(str3);
                                }
                            }
                            if (str3 == null) {
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                            StringBuilder sb = new StringBuilder("Error: Cannot load ");
                            sb.append(str);
                            throw new RuntimeException(sb.toString(), e);
                        }
                    } else {
                        C14621k.m42293a(str);
                    }
                }
            };
            f37713b = r1;
        }
    }

    /* renamed from: a */
    public static boolean m42249a(String str) {
        return m42250a(str, 0);
    }

    /* renamed from: a */
    public static void m42245a(Context context, int i) throws IOException {
        m42246a(context, 0, (C14620j) null);
    }

    /* renamed from: a */
    private static boolean m42250a(String str, int i) throws UnsatisfiedLinkError {
        boolean z;
        f37714c.readLock().lock();
        try {
            if (f37715d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m42256c();
                } else {
                    synchronized (SoLoader.class) {
                        z = !f37719h.contains(str);
                        if (z && f37722k == null) {
                            C14622l.m42294a(str);
                        }
                    }
                    f37714c.readLock().unlock();
                    return z;
                }
            }
            f37714c.readLock().unlock();
            return m42251a(System.mapLibraryName(str), str, null, 0, null);
        } catch (Throwable th) {
            f37714c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    static void m42248a(String str, int i, ThreadPolicy threadPolicy) {
        m42251a(str, null, null, i, threadPolicy);
    }

    /* renamed from: a */
    private static void m42246a(Context context, int i, C14620j jVar) throws IOException {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m42247a((C14620j) null);
            m42254b(context, i, (C14620j) null);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: b */
    private static void m42254b(Context context, int i, C14620j jVar) throws IOException {
        boolean z;
        int i2;
        int i3;
        f37714c.writeLock().lock();
        try {
            if (f37715d == null) {
                f37723l = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (String file : split) {
                    arrayList.add(new C14605c(new File(file), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        f37717f = null;
                        arrayList.add(0, new C14606e(context, "lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            if (VERSION.SDK_INT <= 17) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            f37718g = new C14604b(context, i3);
                            arrayList.add(0, f37718g);
                            i2 = 1;
                        }
                        f37717f = new C14602a(context, "lib-main", i2);
                        arrayList.add(0, f37717f);
                    }
                }
                C14623m[] mVarArr = (C14623m[]) arrayList.toArray(new C14623m[arrayList.size()]);
                int a = m42244a();
                int length = mVarArr.length;
                while (true) {
                    int i4 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    mVarArr[i4].mo36851a(a);
                    length = i4;
                }
                f37715d = mVarArr;
                f37716e++;
            }
        } finally {
            f37714c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static void m42255b(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        f37714c.readLock().lock();
        try {
            if (f37715d != null) {
                f37714c.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f37712a) {
                    StringBuilder sb = new StringBuilder("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Api18TraceUtils.m42243a(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        f37714c.readLock().lock();
                        int i3 = f37716e;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                if (i4 >= f37715d.length) {
                                    break;
                                }
                                int a = f37715d[i4].mo36850a(str, i, threadPolicy);
                                if (a == 3) {
                                    try {
                                        if (f37717f != null) {
                                            f37717f.mo36863a(str);
                                            i2 = f37717f.mo36850a(str, i, threadPolicy);
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = a;
                                        f37714c.readLock().unlock();
                                        throw th;
                                    }
                                }
                                i4++;
                                i2 = a;
                            } catch (Throwable th2) {
                                th = th2;
                                f37714c.readLock().unlock();
                                throw th;
                            }
                        }
                        f37714c.readLock().unlock();
                        if (i2 == 0) {
                            f37714c.writeLock().lock();
                            if (f37718g != null && f37718g.mo36852a()) {
                                f37716e++;
                            }
                            if (f37716e != i3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f37714c.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th3) {
                        if (f37712a) {
                            Api18TraceUtils.m42242a();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb2 = new StringBuilder("couldn't find DSO to load: ");
                            sb2.append(str);
                            throw new UnsatisfiedLinkError(sb2.toString());
                        }
                        throw th3;
                    }
                } while (z2);
                if (f37712a) {
                    Api18TraceUtils.m42242a();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    StringBuilder sb3 = new StringBuilder("couldn't find DSO to load: ");
                    sb3.append(str);
                    throw new UnsatisfiedLinkError(sb3.toString());
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder("couldn't find DSO to load: ");
            sb4.append(str);
            throw new UnsatisfiedLinkError(sb4.toString());
        } catch (Throwable th4) {
            f37714c.readLock().unlock();
            throw th4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (f37719h.contains(r6) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r8 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        m42255b(r6, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        r9 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        f37719h.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0064, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0065, code lost:
        r7 = r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0079, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0080, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0084, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0092, code lost:
        if (f37721j.contains(r7) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0094, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0096, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0097, code lost:
        if (r8 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0099, code lost:
        if (r6 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x009d, code lost:
        if (f37712a == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x009f, code lost:
        r6 = new java.lang.StringBuilder("MergedSoMapping.invokeJniOnload[");
        r6.append(r7);
        r6.append("]");
        com.facebook.soloader.Api18TraceUtils.m42243a(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        com.facebook.soloader.C14617h.m42283a(r7);
        f37721j.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00bf, code lost:
        if (f37712a == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00c1, code lost:
        com.facebook.soloader.Api18TraceUtils.m42242a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00c5, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00c8, code lost:
        if (f37712a != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00ca, code lost:
        com.facebook.soloader.Api18TraceUtils.m42242a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00cd, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00ce, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00cf, code lost:
        if (r2 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00d1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d2, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00d4, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m42251a(java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set<java.lang.String> r0 = f37721j
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r2 = f37719h     // Catch:{ all -> 0x00d5 }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x00d5 }
            r3 = 1
            if (r2 == 0) goto L_0x0022
            if (r8 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            return r1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = f37720i     // Catch:{ all -> 0x00d5 }
            boolean r4 = r4.containsKey(r6)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = f37720i     // Catch:{ all -> 0x00d5 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x00d5 }
            r4.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = f37720i     // Catch:{ all -> 0x00d5 }
            r5.put(r6, r4)     // Catch:{ all -> 0x00d5 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            monitor-enter(r4)
            if (r2 != 0) goto L_0x0086
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r5 = f37719h     // Catch:{ all -> 0x0081 }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0051
            if (r8 != 0) goto L_0x0050
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            return r1
        L_0x0050:
            r2 = 1
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0086
            m42255b(r6, r9, r10)     // Catch:{ IOException -> 0x007a, UnsatisfiedLinkError -> 0x0064 }
            java.lang.Class<com.facebook.soloader.SoLoader> r9 = com.facebook.soloader.SoLoader.class
            monitor-enter(r9)     // Catch:{ all -> 0x0084 }
            java.util.HashSet<java.lang.String> r10 = f37719h     // Catch:{ all -> 0x0061 }
            r10.add(r6)     // Catch:{ all -> 0x0061 }
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x0086
        L_0x0061:
            r6 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0064:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r8 = "unexpected e_machine:"
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0079
            com.facebook.soloader.SoLoader$WrongAbiError r7 = new com.facebook.soloader.SoLoader$WrongAbiError     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0079:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x007a:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            r7.<init>(r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x0081:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            goto L_0x00d3
        L_0x0086:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0096
            java.util.Set<java.lang.String> r6 = f37721j     // Catch:{ all -> 0x0084 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0096
            r6 = 1
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r8 == 0) goto L_0x00ce
            if (r6 != 0) goto L_0x00ce
            boolean r6 = f37712a     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00b5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "MergedSoMapping.invokeJniOnload["
            r6.<init>(r8)     // Catch:{ all -> 0x0084 }
            r6.append(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = "]"
            r6.append(r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0084 }
            com.facebook.soloader.Api18TraceUtils.m42243a(r6)     // Catch:{ all -> 0x0084 }
        L_0x00b5:
            com.facebook.soloader.C14617h.m42283a(r7)     // Catch:{ all -> 0x00c5 }
            java.util.Set<java.lang.String> r6 = f37721j     // Catch:{ all -> 0x00c5 }
            r6.add(r7)     // Catch:{ all -> 0x00c5 }
            boolean r6 = f37712a     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x00ce
            com.facebook.soloader.Api18TraceUtils.m42242a()     // Catch:{ all -> 0x0084 }
            goto L_0x00ce
        L_0x00c5:
            r6 = move-exception
            boolean r7 = f37712a     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x00cd
            com.facebook.soloader.Api18TraceUtils.m42242a()     // Catch:{ all -> 0x0084 }
        L_0x00cd:
            throw r6     // Catch:{ all -> 0x0084 }
        L_0x00ce:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x00d2
            return r3
        L_0x00d2:
            return r1
        L_0x00d3:
            monitor-exit(r4)     // Catch:{ all -> 0x0084 }
            throw r6
        L_0x00d5:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d5 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m42251a(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
