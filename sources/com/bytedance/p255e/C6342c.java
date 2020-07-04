package com.bytedance.p255e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.p255e.p256a.C6336f;
import com.facebook.appevents.C13192m;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.e.c */
final class C6342c {

    /* renamed from: a */
    static final C6342c f18595a;

    /* renamed from: n */
    private static final String[] f18596n = {"log", C13192m.f34940a, "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};

    /* renamed from: b */
    public final C6346e f18597b;

    /* renamed from: c */
    private final File f18598c;

    /* renamed from: d */
    private final Map<String, C6343a> f18599d = new HashMap();

    /* renamed from: e */
    private final File f18600e = new File(this.f18598c, "process.lock");

    /* renamed from: f */
    private boolean f18601f;

    /* renamed from: g */
    private File f18602g;

    /* renamed from: h */
    private ZipFile[] f18603h;

    /* renamed from: i */
    private String f18604i;

    /* renamed from: j */
    private ApplicationInfo f18605j;

    /* renamed from: k */
    private Map<String, String> f18606k;

    /* renamed from: l */
    private String[] f18607l;

    /* renamed from: m */
    private String f18608m;

    /* renamed from: com.bytedance.e.c$a */
    static class C6343a {

        /* renamed from: a */
        boolean f18609a;

        C6343a() {
        }
    }

    /* renamed from: com.bytedance.e.c$b */
    class C6344b {

        /* renamed from: b */
        private RandomAccessFile f18611b;

        /* renamed from: c */
        private FileLock f18612c;

        /* renamed from: d */
        private FileChannel f18613d;

        /* renamed from: e */
        private File f18614e;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo15177b() {
            if (this.f18612c != null) {
                try {
                    this.f18612c.release();
                } catch (IOException unused) {
                }
            }
            new StringBuilder("released lock ").append(this.f18614e.getPath());
            C6342c.this.mo15174a((Closeable) this.f18613d);
            C6342c.this.mo15174a((Closeable) this.f18611b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo15176a() throws IOException {
            this.f18611b = new RandomAccessFile(this.f18614e, "rw");
            try {
                this.f18613d = this.f18611b.getChannel();
                new StringBuilder("blocking on lock ").append(this.f18614e.getPath());
                this.f18612c = this.f18613d.lock();
                new StringBuilder("acquired on lock ").append(this.f18614e.getPath());
            } catch (IOException e) {
                C6342c.this.mo15174a((Closeable) this.f18613d);
                throw e;
            } catch (IOException e2) {
                C6342c.this.mo15174a((Closeable) this.f18611b);
                throw e2;
            }
        }

        C6344b(File file) {
            this.f18614e = file;
        }
    }

    /* renamed from: b */
    private String m19668b() {
        ZipFile[] zipFileArr;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ZipFile zipFile : this.f18603h) {
            String name = zipFile.getName();
            File file = new File(name);
            sb.append(name);
            sb.append("#");
            sb.append(zipFile.size());
            sb.append(":");
            sb.append(file.length());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        String str;
        C6346e eVar;
        Context context = C6326a.f18571a;
        C6326a.f18571a = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (C6326a.f18572b != null) {
                str = C6326a.f18572b;
            } else {
                str = "default.version";
            }
            File file = new File(applicationInfo.sourceDir);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(file.lastModified() >> 8);
            File file2 = new File(dir, sb.toString());
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (!file2.getName().equals(file3.getName())) {
                        File[] listFiles2 = file3.listFiles();
                        if (listFiles2 != null) {
                            for (File delete : listFiles2) {
                                delete.delete();
                            }
                        }
                        file3.delete();
                    }
                }
            }
            file2.mkdirs();
            if (file2.exists()) {
                if (C6326a.f18573c != null) {
                    eVar = C6326a.f18573c;
                } else {
                    eVar = new C6346e();
                }
                f18595a = new C6342c(applicationInfo, file2, eVar);
                return;
            }
            f18595a = null;
            return;
        }
        throw new C6347f("you should call init first or use loadLibraryForModule.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19665a() {
        /*
            r8 = this;
            boolean r0 = r8.f18601f
            if (r0 != 0) goto L_0x00e1
            monitor-enter(r8)
            boolean r0 = r8.f18601f     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00dc
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00de }
            android.content.pm.ApplicationInfo r1 = r8.f18605j     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.sourceDir     // Catch:{ all -> 0x00de }
            r0.<init>(r1)     // Catch:{ all -> 0x00de }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00de }
            r1.<init>()     // Catch:{ all -> 0x00de }
            r1.add(r0)     // Catch:{ all -> 0x00de }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00de }
            r2 = 21
            r3 = 0
            if (r0 < r2) goto L_0x003b
            android.content.pm.ApplicationInfo r0 = r8.f18605j     // Catch:{ all -> 0x00de }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x003b
            int r4 = r0.length     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x003b
            int r4 = r0.length     // Catch:{ all -> 0x00de }
            r5 = 0
        L_0x002c:
            if (r5 >= r4) goto L_0x003b
            r6 = r0[r5]     // Catch:{ all -> 0x00de }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00de }
            r7.<init>(r6)     // Catch:{ all -> 0x00de }
            r1.add(r7)     // Catch:{ all -> 0x00de }
            int r5 = r5 + 1
            goto L_0x002c
        L_0x003b:
            int r0 = r1.size()     // Catch:{ all -> 0x00de }
            java.util.zip.ZipFile[] r0 = new java.util.zip.ZipFile[r0]     // Catch:{ all -> 0x00de }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00de }
            r4 = 0
        L_0x0046:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00de }
            if (r5 == 0) goto L_0x005d
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00de }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00de }
            int r6 = r4 + 1
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x005b }
            r7.<init>(r5)     // Catch:{ IOException -> 0x005b }
            r0[r4] = r7     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r4 = r6
            goto L_0x0046
        L_0x005d:
            r8.f18603h = r0     // Catch:{ all -> 0x00de }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00de }
            android.content.pm.ApplicationInfo r1 = r8.f18605j     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.nativeLibraryDir     // Catch:{ all -> 0x00de }
            r0.<init>(r1)     // Catch:{ all -> 0x00de }
            r8.f18602g = r0     // Catch:{ all -> 0x00de }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00de }
            r0.<init>()     // Catch:{ all -> 0x00de }
            r8.f18606k = r0     // Catch:{ all -> 0x00de }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f18606k     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "arm64-v8a"
            java.lang.String r4 = "arm64"
            r0.put(r1, r4)     // Catch:{ all -> 0x00de }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f18606k     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "armeabi-v7a"
            java.lang.String r4 = "arm"
            r0.put(r1, r4)     // Catch:{ all -> 0x00de }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f18606k     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "armeabi"
            java.lang.String r4 = "arm"
            r0.put(r1, r4)     // Catch:{ all -> 0x00de }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00de }
            r1 = 0
            if (r0 < r2) goto L_0x00b6
            java.lang.String r0 = "dalvik.system.VMRuntime"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = "getRuntime"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = "vmInstructionSet"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r0 = r0.invoke(r4, r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            r8.f18604i = r0     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "vm instruction set: "
            r0.<init>(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r8.f18604i     // Catch:{ all -> 0x00de }
            r0.append(r1)     // Catch:{ all -> 0x00de }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00de }
            r1 = 1
            if (r0 >= r2) goto L_0x00d6
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00de }
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch:{ all -> 0x00de }
            r0[r3] = r2     // Catch:{ all -> 0x00de }
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch:{ all -> 0x00de }
            r0[r1] = r2     // Catch:{ all -> 0x00de }
            goto L_0x00d8
        L_0x00d6:
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch:{ all -> 0x00de }
        L_0x00d8:
            r8.f18607l = r0     // Catch:{ all -> 0x00de }
            r8.f18601f = r1     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r8)     // Catch:{ all -> 0x00de }
            return
        L_0x00de:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00de }
            throw r0
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p255e.C6342c.m19665a():void");
    }

    /* renamed from: a */
    public final void mo15174a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m19667a(String str) {
        for (String equals : f18596n) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private List<String> m19669b(File file) throws IOException {
        C6336f fVar = null;
        try {
            C6336f fVar2 = new C6336f(file);
            try {
                List<String> a = fVar2.mo15170a();
                Collections.sort(a);
                mo15174a((Closeable) fVar2);
                return a;
            } catch (Throwable th) {
                th = th;
                fVar = fVar2;
                mo15174a((Closeable) fVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mo15174a((Closeable) fVar);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m19672c(String str) {
        if (this.f18604i == null) {
            return true;
        }
        String str2 = (String) this.f18606k.get(str);
        String str3 = this.f18604i;
        if (str2 != null) {
            str = str2;
        }
        return str3.equals(str);
    }

    /* renamed from: d */
    private static String m19673d(String str) {
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|11|14|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m19671c(java.io.File r6) {
        /*
            r5 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream     // Catch:{ IOException -> 0x002d }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r3.<init>(r6)     // Catch:{ IOException -> 0x002d }
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x002d }
            r4.<init>()     // Catch:{ IOException -> 0x002d }
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x002d }
        L_0x0014:
            int r1 = r2.read(r0)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            if (r1 >= 0) goto L_0x0014
            java.util.zip.Checksum r0 = r2.getChecksum()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            long r0 = r0.getValue()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r5.mo15174a(r2)
            return r0
        L_0x0026:
            r6 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x0029:
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r6 = move-exception
            goto L_0x0041
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "fail to check sum for "
            r0.<init>(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r6 = r6.getPath()     // Catch:{ all -> 0x002b }
            r0.append(r6)     // Catch:{ all -> 0x002b }
            r5.mo15174a(r1)
            r0 = 0
            return r0
        L_0x0041:
            r5.mo15174a(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p255e.C6342c.m19671c(java.io.File):long");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private boolean m19674d(File file) throws IOException {
        m19670b(file.getName());
        StringBuilder sb = new StringBuilder("lib/");
        sb.append(this.f18608m);
        sb.append("/");
        sb.append(file.getName());
        String sb2 = sb.toString();
        ZipFile[] zipFileArr = this.f18603h;
        int length = zipFileArr.length;
        int i = 0;
        while (i < length) {
            ZipFile zipFile = zipFileArr[i];
            ZipEntry entry = zipFile.getEntry(sb2);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    m19664a(inputStream, file);
                    StringBuilder sb3 = new StringBuilder("get lib file ");
                    sb3.append(file.getPath());
                    sb3.append(" from ");
                    sb3.append(sb2);
                    sb3.append(" of ");
                    sb3.append(zipFile.getName());
                    mo15174a((Closeable) inputStream);
                    return true;
                } catch (Throwable th) {
                    mo15174a((Closeable) inputStream);
                    throw th;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m19670b(String str) {
        String[] strArr;
        if (this.f18608m == null) {
            for (String str2 : this.f18607l) {
                if (m19672c(str2)) {
                    StringBuilder sb = new StringBuilder("lib/");
                    sb.append(str2);
                    sb.append("/");
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (ZipFile entry : this.f18603h) {
                        if (entry.getEntry(sb2) != null) {
                            this.f18608m = str2;
                            new StringBuilder("ensure that abi is ").append(str2);
                            return;
                        }
                    }
                    continue;
                }
            }
            StringBuilder sb3 = new StringBuilder("can not ensure abi for ");
            sb3.append(str);
            sb3.append(", check ");
            sb3.append(this.f18604i);
            sb3.append(", apks ");
            sb3.append(m19668b());
            throw new C6347f(sb3.toString());
        }
    }

    /* renamed from: a */
    private boolean m19666a(File file) {
        if (!file.exists()) {
            new StringBuilder("file is not exist: ").append(file.getPath());
            return false;
        }
        m19670b(file.getName());
        long j = 0;
        StringBuilder sb = new StringBuilder("lib/");
        sb.append(this.f18608m);
        sb.append("/");
        sb.append(file.getName());
        String sb2 = sb.toString();
        ZipFile[] zipFileArr = this.f18603h;
        int length = zipFileArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ZipEntry entry = zipFileArr[i].getEntry(sb2);
            if (entry != null) {
                j = entry.getCrc();
                break;
            }
            i++;
        }
        long c = m19671c(file);
        if (j == c) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" compare crc ok: entry is ");
            sb3.append(j);
            sb3.append(", file is ");
            sb3.append(c);
            return true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(" crc is wrong: entry is ");
        sb4.append(j);
        sb4.append(", file is ");
        sb4.append(c);
        return false;
    }

    /* renamed from: a */
    private File m19664a(InputStream inputStream, File file) throws IOException {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        new StringBuilder("extracting ").append(createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                new StringBuilder("renaming to ").append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                StringBuilder sb = new StringBuilder("failed to rename \"");
                sb.append(createTempFile.getAbsolutePath());
                sb.append("\" to \"");
                sb.append(file.getAbsolutePath());
                sb.append("\"");
                throw new IOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("failed to mark readonly \"");
            sb2.append(createTempFile.getAbsolutePath());
            sb2.append("\" (tmp of \"");
            sb2.append(file.getAbsolutePath());
            sb2.append("\")");
            throw new IOException(sb2.toString());
        } finally {
            mo15174a((Closeable) fileOutputStream);
            createTempFile.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1.f18609a == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        new java.lang.StringBuilder("lib was already loaded before: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r0 = new java.io.File(r7.f18598c, m19673d(r8));
        r2 = r0.exists();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r9 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r2 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.bytedance.p255e.C6345d.m19679a(r0.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        com.bytedance.p255e.C6345d.m19680b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        new java.lang.StringBuilder("lib is loaded: ").append(r8);
        r1.f18609a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r4 = new java.lang.StringBuilder("fail to load ");
        r4.append(r0.getName());
        r4.append(", out lib exists: ");
        r4.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        m19665a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r2 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r2 = new java.io.File(r7.f18602g, m19673d(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (m19666a(r2) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r2 = new com.bytedance.p255e.C6342c.C6344b(r7, r7.f18600e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.mo15176a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (m19674d(r0) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (r9 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        new java.lang.StringBuilder("may be system lib, no found ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.mo15177b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r0 = new java.lang.StringBuilder("fail to find ");
        r0.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        throw new com.bytedance.p255e.C6347f(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.mo15177b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r3 = new java.lang.StringBuilder("fail to extract ");
        r3.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        throw new com.bytedance.p255e.C6347f(r3.toString(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2.mo15177b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00db, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dc, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2 = m19669b(r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        if (r2.hasNext() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r4 = (java.lang.String) r2.next();
        r4 = r4.substring(3, r4.length() - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        if (m19667a(r4) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        new java.lang.StringBuilder("to load depended lib ").append(r4);
        mo15175a(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        com.bytedance.p255e.C6345d.m19679a(r0.getPath());
        new java.lang.StringBuilder("loaded the lib ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r1.f18609a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0124, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        r2 = new java.lang.StringBuilder("finally fail to load ");
        r2.append(r0.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013c, code lost:
        throw new com.bytedance.p255e.C6347f(r2.toString(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0145, code lost:
        throw new com.bytedance.p255e.C6347f("fail to load depended lib", r8);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15175a(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.util.Map<java.lang.String, com.bytedance.e.c$a> r0 = r7.f18599d
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.bytedance.e.c$a> r1 = r7.f18599d     // Catch:{ all -> 0x0149 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0149 }
            com.bytedance.e.c$a r1 = (com.bytedance.p255e.C6342c.C6343a) r1     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x0013
            boolean r2 = r1.f18609a     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            return
        L_0x0013:
            com.bytedance.e.c$a r1 = new com.bytedance.e.c$a     // Catch:{ all -> 0x0149 }
            r1.<init>()     // Catch:{ all -> 0x0149 }
            java.util.Map<java.lang.String, com.bytedance.e.c$a> r2 = r7.f18599d     // Catch:{ all -> 0x0149 }
            r2.put(r8, r1)     // Catch:{ all -> 0x0149 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            monitor-enter(r1)
            boolean r0 = r1.f18609a     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x002f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "lib was already loaded before: "
            r9.<init>(r0)     // Catch:{ all -> 0x0146 }
            r9.append(r8)     // Catch:{ all -> 0x0146 }
            monitor-exit(r1)     // Catch:{ all -> 0x0146 }
            return
        L_0x002f:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0146 }
            java.io.File r2 = r7.f18598c     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = m19673d(r8)     // Catch:{ all -> 0x0146 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0146 }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x0146 }
            r3 = 1
            if (r9 != 0) goto L_0x0072
            if (r2 == 0) goto L_0x004b
            java.lang.String r4 = r0.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            com.bytedance.p255e.C6345d.m19679a(r4)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            goto L_0x004e
        L_0x004b:
            com.bytedance.p255e.C6345d.m19680b(r8)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
        L_0x004e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            java.lang.String r5 = "lib is loaded: "
            r4.<init>(r5)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            r4.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            r1.f18609a = r3     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            monitor-exit(r1)     // Catch:{ all -> 0x0146 }
            return
        L_0x005c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = "fail to load "
            r4.<init>(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = r0.getName()     // Catch:{ all -> 0x0146 }
            r4.append(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = ", out lib exists: "
            r4.append(r5)     // Catch:{ all -> 0x0146 }
            r4.append(r2)     // Catch:{ all -> 0x0146 }
        L_0x0072:
            r7.m19665a()     // Catch:{ all -> 0x0146 }
            if (r2 != 0) goto L_0x00dd
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0146 }
            java.io.File r4 = r7.f18602g     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = m19673d(r8)     // Catch:{ all -> 0x0146 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0146 }
            boolean r4 = r7.m19666a(r2)     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x00dc
            com.bytedance.e.c$b r2 = new com.bytedance.e.c$b     // Catch:{ all -> 0x0146 }
            java.io.File r4 = r7.f18600e     // Catch:{ all -> 0x0146 }
            r2.<init>(r4)     // Catch:{ all -> 0x0146 }
            r2.mo15176a()     // Catch:{ IOException -> 0x00c3 }
            boolean r4 = r7.m19674d(r0)     // Catch:{ IOException -> 0x00c3 }
            if (r4 != 0) goto L_0x00bd
            if (r9 == 0) goto L_0x00a9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = "may be system lib, no found "
            r9.<init>(r0)     // Catch:{ IOException -> 0x00c3 }
            r9.append(r8)     // Catch:{ IOException -> 0x00c3 }
            r2.mo15177b()     // Catch:{ all -> 0x0146 }
            monitor-exit(r1)     // Catch:{ all -> 0x0146 }
            return
        L_0x00a9:
            com.bytedance.e.f r9 = new com.bytedance.e.f     // Catch:{ IOException -> 0x00c3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r3 = "fail to find "
            r0.<init>(r3)     // Catch:{ IOException -> 0x00c3 }
            r0.append(r8)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00c3 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x00c3 }
            throw r9     // Catch:{ IOException -> 0x00c3 }
        L_0x00bd:
            r2.mo15177b()     // Catch:{ all -> 0x0146 }
            goto L_0x00dd
        L_0x00c1:
            r8 = move-exception
            goto L_0x00d8
        L_0x00c3:
            r9 = move-exception
            com.bytedance.e.f r0 = new com.bytedance.e.f     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = "fail to extract "
            r3.<init>(r4)     // Catch:{ all -> 0x00c1 }
            r3.append(r8)     // Catch:{ all -> 0x00c1 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x00c1 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00d8:
            r2.mo15177b()     // Catch:{ all -> 0x0146 }
            throw r8     // Catch:{ all -> 0x0146 }
        L_0x00dc:
            r0 = r2
        L_0x00dd:
            java.util.List r2 = r7.m19669b(r0)     // Catch:{ IOException -> 0x013d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x013d }
        L_0x00e5:
            boolean r4 = r2.hasNext()     // Catch:{ IOException -> 0x013d }
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r2.next()     // Catch:{ IOException -> 0x013d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x013d }
            int r5 = r4.length()     // Catch:{ IOException -> 0x013d }
            r6 = 3
            int r5 = r5 - r6
            java.lang.String r4 = r4.substring(r6, r5)     // Catch:{ IOException -> 0x013d }
            boolean r5 = m19667a(r4)     // Catch:{ IOException -> 0x013d }
            if (r5 != 0) goto L_0x00e5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013d }
            java.lang.String r6 = "to load depended lib "
            r5.<init>(r6)     // Catch:{ IOException -> 0x013d }
            r5.append(r4)     // Catch:{ IOException -> 0x013d }
            r7.mo15175a(r4, r9)     // Catch:{ IOException -> 0x013d }
            goto L_0x00e5
        L_0x010f:
            java.lang.String r9 = r0.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            com.bytedance.p255e.C6345d.m19679a(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            java.lang.String r2 = "loaded the lib "
            r9.<init>(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r9.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0124 }
            r1.f18609a = r3     // Catch:{ all -> 0x0146 }
            monitor-exit(r1)     // Catch:{ all -> 0x0146 }
            return
        L_0x0124:
            r8 = move-exception
            com.bytedance.e.f r9 = new com.bytedance.e.f     // Catch:{ all -> 0x0146 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = "finally fail to load "
            r2.<init>(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0146 }
            r2.append(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0146 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0146 }
            throw r9     // Catch:{ all -> 0x0146 }
        L_0x013d:
            r8 = move-exception
            com.bytedance.e.f r9 = new com.bytedance.e.f     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "fail to load depended lib"
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0146 }
            throw r9     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0146 }
            throw r8
        L_0x0149:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p255e.C6342c.mo15175a(java.lang.String, boolean):void");
    }

    private C6342c(ApplicationInfo applicationInfo, File file, C6346e eVar) {
        this.f18598c = file;
        this.f18597b = eVar;
        this.f18605j = applicationInfo;
    }
}
