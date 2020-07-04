package net.jpountz.util;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

public enum Native {
    ;
    
    private static boolean loaded;

    /* renamed from: net.jpountz.util.Native$OS */
    enum C48235OS {
        private static final /* synthetic */ C48235OS[] $VALUES = null;
        public static final C48235OS LINUX = null;
        public static final C48235OS MAC = null;
        public static final C48235OS SOLARIS = null;
        public static final C48235OS WINDOWS = null;
        public final String libExtension;
        public final String name;

        public static C48235OS[] values() {
            return (C48235OS[]) $VALUES.clone();
        }

        static {
            WINDOWS = new C48235OS("WINDOWS", 0, "win32", "so");
            LINUX = new C48235OS("LINUX", 1, "linux", "so");
            MAC = new C48235OS("MAC", 2, "darwin", "dylib");
            SOLARIS = new C48235OS("SOLARIS", 3, "solaris", "so");
            $VALUES = new C48235OS[]{WINDOWS, LINUX, MAC, SOLARIS};
        }

        public static C48235OS valueOf(String str) {
            return (C48235OS) Enum.valueOf(C48235OS.class, str);
        }

        private C48235OS(String str, int i, String str2, String str3) {
            this.name = str2;
            this.libExtension = str3;
        }
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static String arch() {
        return System.getProperty("os.arch");
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            z = loaded;
        }
        return z;
    }

    /* renamed from: os */
    private static C48235OS m149641os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return C48235OS.LINUX;
        }
        if (property.contains("Mac")) {
            return C48235OS.MAC;
        }
        if (property.contains("Windows")) {
            return C48235OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return C48235OS.SOLARIS;
        }
        StringBuilder sb = new StringBuilder("Unsupported operating system: ");
        sb.append(property);
        throw new UnsupportedOperationException(sb.toString());
    }

    private static String resourceName() {
        C48235OS os = m149641os();
        String replace = Native.class.getPackage().getName().replace('.', '/');
        StringBuilder sb = new StringBuilder("/");
        sb.append(replace);
        sb.append("/");
        sb.append(os.name);
        sb.append("/");
        sb.append(arch());
        sb.append("/liblz4-java.");
        sb.append(os.libExtension);
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:24|25|26|27|28|(2:30|31)|(3:34|35|(4:37|(1:39)(1:40)|41|42))|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = resourceName();
        r3 = net.jpountz.util.Native.class.getResourceAsStream(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r3 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        r2 = "liblz4-java";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = new java.lang.StringBuilder(com.taobao.android.dexposed.ClassUtils.PACKAGE_SEPARATOR);
        r4.append(m149641os().libExtension);
        r2 = java.io.File.createTempFile(r2, r4.toString());
        r4 = new java.io.FileOutputStream(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5 = new byte[4096];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r6 = r3.read(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r6 != -1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        r4.write(r5, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        net.jpountz.util.Native._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(r2.getAbsolutePath());
        loaded = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r4 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r2 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if (r2.exists() != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        if (loaded == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        r2.deleteOnExit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0078, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007e, code lost:
        if (r2 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0084, code lost:
        if (r2.exists() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0088, code lost:
        if (loaded == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008a, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008e, code lost:
        r2.deleteOnExit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0091, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x009a, code lost:
        r3 = new java.lang.StringBuilder("Unsupported OS/arch, cannot find ");
        r3.append(r2);
        r3.append(". Please try building from source.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b2, code lost:
        throw new java.lang.UnsupportedOperationException(r3.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC, Splitter:B:30:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063 A[SYNTHETIC, Splitter:B:34:0x0063] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void load() {
        /*
            java.lang.Class<net.jpountz.util.Native> r0 = net.jpountz.util.Native.class
            monitor-enter(r0)
            boolean r1 = loaded     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            java.lang.String r2 = "lz4-java"
            net.jpountz.util.Native._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0013 }
            loaded = r1     // Catch:{ UnsatisfiedLinkError -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0013:
            java.lang.String r2 = resourceName()     // Catch:{ all -> 0x00b3 }
            java.lang.Class<net.jpountz.util.Native> r3 = net.jpountz.util.Native.class
            java.io.InputStream r3 = r3.getResourceAsStream(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x009a
            java.lang.String r2 = "liblz4-java"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0092 }
            java.lang.String r5 = "."
            r4.<init>(r5)     // Catch:{ IOException -> 0x0092 }
            net.jpountz.util.Native$OS r5 = m149641os()     // Catch:{ IOException -> 0x0092 }
            java.lang.String r5 = r5.libExtension     // Catch:{ IOException -> 0x0092 }
            r4.append(r5)     // Catch:{ IOException -> 0x0092 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0092 }
            java.io.File r2 = java.io.File.createTempFile(r2, r4)     // Catch:{ IOException -> 0x0092 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0092 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0092 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0078 }
        L_0x0042:
            int r6 = r3.read(r5)     // Catch:{ all -> 0x0078 }
            r7 = -1
            if (r6 == r7) goto L_0x004e
            r7 = 0
            r4.write(r5, r7, r6)     // Catch:{ all -> 0x0078 }
            goto L_0x0042
        L_0x004e:
            r4.close()     // Catch:{ IOException -> 0x0053 }
            r3 = 0
            r4 = r3
        L_0x0053:
            java.lang.String r3 = r2.getAbsolutePath()     // Catch:{ all -> 0x0078 }
            net.jpountz.util.Native._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(r3)     // Catch:{ all -> 0x0078 }
            loaded = r1     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0061
            r4.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            if (r2 == 0) goto L_0x0076
            boolean r1 = r2.exists()     // Catch:{ IOException -> 0x0092 }
            if (r1 == 0) goto L_0x0076
            boolean r1 = loaded     // Catch:{ IOException -> 0x0092 }
            if (r1 != 0) goto L_0x0071
            r2.delete()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0074
        L_0x0071:
            r2.deleteOnExit()     // Catch:{ IOException -> 0x0092 }
        L_0x0074:
            monitor-exit(r0)
            return
        L_0x0076:
            monitor-exit(r0)
            return
        L_0x0078:
            r1 = move-exception
            if (r4 == 0) goto L_0x007e
            r4.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            if (r2 == 0) goto L_0x0091
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0092 }
            if (r3 == 0) goto L_0x0091
            boolean r3 = loaded     // Catch:{ IOException -> 0x0092 }
            if (r3 != 0) goto L_0x008e
            r2.delete()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0091
        L_0x008e:
            r2.deleteOnExit()     // Catch:{ IOException -> 0x0092 }
        L_0x0091:
            throw r1     // Catch:{ IOException -> 0x0092 }
        L_0x0092:
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot unpack liblz4-java"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x009a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = "Unsupported OS/arch, cannot find "
            r3.<init>(r4)     // Catch:{ all -> 0x00b3 }
            r3.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = ". Please try building from source."
            r3.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00b3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.util.Native.load():void");
    }
}
