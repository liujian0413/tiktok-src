package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.ko */
public final class C15821ko implements C16197yn {

    /* renamed from: a */
    private final Map<String, C15849lp> f44543a;

    /* renamed from: b */
    private long f44544b;

    /* renamed from: c */
    private final File f44545c;

    /* renamed from: d */
    private final int f44546d;

    public C15821ko(File file, int i) {
        this.f44543a = new LinkedHashMap(16, 0.75f, true);
        this.f44544b = 0;
        this.f44545c = file;
        this.f44546d = i;
    }

    public C15821ko(File file) {
        this(file, 5242880);
    }

    /* renamed from: a */
    public final synchronized aux mo41690a(String str) {
        C15877mq mqVar;
        C15849lp lpVar = (C15849lp) this.f44543a.get(str);
        if (lpVar == null) {
            return null;
        }
        File d = m51170d(str);
        try {
            mqVar = new C15877mq(new BufferedInputStream(m51158a(d)), d.length());
            C15849lp a = C15849lp.m51291a(mqVar);
            if (!TextUtils.equals(str, a.f44606b)) {
                Object[] objArr = {d.getAbsolutePath(), str, a.f44606b};
                m51171e(str);
                mqVar.close();
                return null;
            }
            byte[] a2 = m51164a(mqVar, mqVar.mo41758a());
            aux aux = new aux();
            aux.f41066a = a2;
            aux.f41067b = lpVar.f44607c;
            aux.f41068c = lpVar.f44608d;
            aux.f41069d = lpVar.f44609e;
            aux.f41070e = lpVar.f44610f;
            aux.f41071f = lpVar.f44611g;
            List<bky> list = lpVar.f44612h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (bky bky : list) {
                treeMap.put(bky.f42430a, bky.f42431b);
            }
            aux.f41072g = treeMap;
            aux.f41073h = Collections.unmodifiableList(lpVar.f44612h);
            mqVar.close();
            return aux;
        } catch (IOException e) {
            Object[] objArr2 = {d.getAbsolutePath(), e.toString()};
            m51167b(str);
            return null;
        } catch (Throwable th) {
            mqVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0054 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41691a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f44545c     // Catch:{ all -> 0x005c }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 != 0) goto L_0x001f
            java.io.File r0 = r9.f44545c     // Catch:{ all -> 0x005c }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x001d
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x005c }
            java.io.File r2 = r9.f44545c     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x005c }
            r0[r1] = r2     // Catch:{ all -> 0x005c }
        L_0x001d:
            monitor-exit(r9)
            return
        L_0x001f:
            java.io.File r0 = r9.f44545c     // Catch:{ all -> 0x005c }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0029
            monitor-exit(r9)
            return
        L_0x0029:
            int r2 = r0.length     // Catch:{ all -> 0x005c }
        L_0x002a:
            if (r1 >= r2) goto L_0x005a
            r3 = r0[r1]     // Catch:{ all -> 0x005c }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0054 }
            com.google.android.gms.internal.ads.mq r6 = new com.google.android.gms.internal.ads.mq     // Catch:{ IOException -> 0x0054 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0054 }
            java.io.InputStream r8 = m51158a(r3)     // Catch:{ IOException -> 0x0054 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0054 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0054 }
            com.google.android.gms.internal.ads.lp r7 = com.google.android.gms.internal.ads.C15849lp.m51291a(r6)     // Catch:{ all -> 0x004f }
            r7.f44605a = r4     // Catch:{ all -> 0x004f }
            java.lang.String r4 = r7.f44606b     // Catch:{ all -> 0x004f }
            r9.m51163a(r4, r7)     // Catch:{ all -> 0x004f }
            r6.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0057
        L_0x004f:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0054 }
            throw r4     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r3.delete()     // Catch:{ all -> 0x005c }
        L_0x0057:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x005a:
            monitor-exit(r9)
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15821ko.mo41691a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
        if (r3.delete() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        new java.lang.Object[1][0] = r3.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00f6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41692a(java.lang.String r18, com.google.android.gms.internal.ads.aux r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            monitor-enter(r17)
            long r3 = r1.f44544b     // Catch:{ all -> 0x0106 }
            byte[] r5 = r2.f41066a     // Catch:{ all -> 0x0106 }
            int r5 = r5.length     // Catch:{ all -> 0x0106 }
            long r5 = (long) r5     // Catch:{ all -> 0x0106 }
            long r3 = r3 + r5
            int r5 = r1.f44546d     // Catch:{ all -> 0x0106 }
            long r5 = (long) r5     // Catch:{ all -> 0x0106 }
            r7 = 1063675494(0x3f666666, float:0.9)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0027
            byte[] r3 = r2.f41066a     // Catch:{ all -> 0x0106 }
            int r3 = r3.length     // Catch:{ all -> 0x0106 }
            float r3 = (float) r3     // Catch:{ all -> 0x0106 }
            int r4 = r1.f44546d     // Catch:{ all -> 0x0106 }
            float r4 = (float) r4
            float r4 = r4 * r7
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            monitor-exit(r17)
            return
        L_0x0027:
            java.io.File r3 = r17.m51170d(r18)     // Catch:{ all -> 0x0106 }
            r4 = 0
            r5 = 1
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00f6 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f6 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x00f6 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x00f6 }
            com.google.android.gms.internal.ads.lp r8 = new com.google.android.gms.internal.ads.lp     // Catch:{ IOException -> 0x00f6 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x00f6 }
            boolean r9 = r8.mo41738a(r6)     // Catch:{ IOException -> 0x00f6 }
            if (r9 == 0) goto L_0x00e5
            byte[] r2 = r2.f41066a     // Catch:{ IOException -> 0x00f6 }
            r6.write(r2)     // Catch:{ IOException -> 0x00f6 }
            r6.close()     // Catch:{ IOException -> 0x00f6 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x00f6 }
            r8.f44605a = r9     // Catch:{ IOException -> 0x00f6 }
            r1.m51163a(r0, r8)     // Catch:{ IOException -> 0x00f6 }
            long r8 = r1.f44544b     // Catch:{ IOException -> 0x00f6 }
            int r0 = r1.f44546d     // Catch:{ IOException -> 0x00f6 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x00f6 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00e3
            long r8 = r1.f44544b     // Catch:{ IOException -> 0x00f6 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00f6 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.lp> r0 = r1.f44543a     // Catch:{ IOException -> 0x00f6 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x00f6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00f6 }
            r2 = 0
        L_0x006d:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x00f6 }
            r12 = 2
            if (r6 == 0) goto L_0x00bf
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x00f6 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00f6 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00f6 }
            com.google.android.gms.internal.ads.lp r6 = (com.google.android.gms.internal.ads.C15849lp) r6     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r13 = r6.f44606b     // Catch:{ IOException -> 0x00f6 }
            java.io.File r13 = r1.m51170d(r13)     // Catch:{ IOException -> 0x00f6 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x00f6 }
            if (r13 == 0) goto L_0x0096
            long r13 = r1.f44544b     // Catch:{ IOException -> 0x00f6 }
            r15 = r8
            long r7 = r6.f44605a     // Catch:{ IOException -> 0x00f6 }
            r6 = 0
            long r13 = r13 - r7
            r1.f44544b = r13     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00a5
        L_0x0096:
            r15 = r8
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r8 = r6.f44606b     // Catch:{ IOException -> 0x00f6 }
            r7[r4] = r8     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r6 = r6.f44606b     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r6 = m51169c(r6)     // Catch:{ IOException -> 0x00f6 }
            r7[r5] = r6     // Catch:{ IOException -> 0x00f6 }
        L_0x00a5:
            r0.remove()     // Catch:{ IOException -> 0x00f6 }
            int r2 = r2 + 1
            long r6 = r1.f44544b     // Catch:{ IOException -> 0x00f6 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x00f6 }
            int r7 = r1.f44546d     // Catch:{ IOException -> 0x00f6 }
            float r7 = (float) r7     // Catch:{ IOException -> 0x00f6 }
            r8 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            r8 = r15
            r7 = 1063675494(0x3f666666, float:0.9)
            goto L_0x006d
        L_0x00bf:
            r15 = r8
        L_0x00c0:
            boolean r0 = com.google.android.gms.internal.ads.C15633dq.f44343a     // Catch:{ IOException -> 0x00f6 }
            if (r0 == 0) goto L_0x00e3
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x00f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x00f6 }
            r0[r4] = r2     // Catch:{ IOException -> 0x00f6 }
            long r6 = r1.f44544b     // Catch:{ IOException -> 0x00f6 }
            r2 = 0
            long r6 = r6 - r15
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x00f6 }
            r0[r5] = r2     // Catch:{ IOException -> 0x00f6 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00f6 }
            r2 = 0
            long r6 = r6 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x00f6 }
            r0[r12] = r2     // Catch:{ IOException -> 0x00f6 }
        L_0x00e3:
            monitor-exit(r17)
            return
        L_0x00e5:
            r6.close()     // Catch:{ IOException -> 0x00f6 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00f6 }
            r0[r4] = r2     // Catch:{ IOException -> 0x00f6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00f6 }
            r0.<init>()     // Catch:{ IOException -> 0x00f6 }
            throw r0     // Catch:{ IOException -> 0x00f6 }
        L_0x00f6:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x0104
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0106 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x0106 }
            r0[r4] = r2     // Catch:{ all -> 0x0106 }
        L_0x0104:
            monitor-exit(r17)
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15821ko.mo41692a(java.lang.String, com.google.android.gms.internal.ads.aux):void");
    }

    /* renamed from: b */
    private final synchronized void m51167b(String str) {
        boolean delete = m51170d(str).delete();
        m51171e(str);
        if (!delete) {
            Object[] objArr = {str, m51169c(str)};
        }
    }

    /* renamed from: c */
    private static String m51169c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    private final File m51170d(String str) {
        return new File(this.f44545c, m51169c(str));
    }

    /* renamed from: a */
    private final void m51163a(String str, C15849lp lpVar) {
        if (!this.f44543a.containsKey(str)) {
            this.f44544b += lpVar.f44605a;
        } else {
            this.f44544b += lpVar.f44605a - ((C15849lp) this.f44543a.get(str)).f44605a;
        }
        this.f44543a.put(str, lpVar);
    }

    /* renamed from: e */
    private final void m51171e(String str) {
        C15849lp lpVar = (C15849lp) this.f44543a.remove(str);
        if (lpVar != null) {
            this.f44544b -= lpVar.f44605a;
        }
    }

    /* renamed from: a */
    private static byte[] m51164a(C15877mq mqVar, long j) throws IOException {
        long a = mqVar.mo41758a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(mqVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    private static InputStream m51158a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: c */
    private static int m51168c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m51160a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & NormalGiftView.ALPHA_255);
        outputStream.write((i >> 8) & NormalGiftView.ALPHA_255);
        outputStream.write((i >> 16) & NormalGiftView.ALPHA_255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static int m51157a(InputStream inputStream) throws IOException {
        return (m51168c(inputStream) << 24) | m51168c(inputStream) | 0 | (m51168c(inputStream) << 8) | (m51168c(inputStream) << 16);
    }

    /* renamed from: a */
    static void m51161a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m51165b(InputStream inputStream) throws IOException {
        return (((long) m51168c(inputStream)) & 255) | 0 | ((((long) m51168c(inputStream)) & 255) << 8) | ((((long) m51168c(inputStream)) & 255) << 16) | ((((long) m51168c(inputStream)) & 255) << 24) | ((((long) m51168c(inputStream)) & 255) << 32) | ((((long) m51168c(inputStream)) & 255) << 40) | ((((long) m51168c(inputStream)) & 255) << 48) | ((255 & ((long) m51168c(inputStream))) << 56);
    }

    /* renamed from: a */
    static void m51162a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m51161a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    static String m51159a(C15877mq mqVar) throws IOException {
        return new String(m51164a(mqVar, m51165b((InputStream) mqVar)), "UTF-8");
    }

    /* renamed from: b */
    static List<bky> m51166b(C15877mq mqVar) throws IOException {
        int a = m51157a((InputStream) mqVar);
        if (a >= 0) {
            List<bky> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < a; i++) {
                emptyList.add(new bky(m51159a(mqVar).intern(), m51159a(mqVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(a);
        throw new IOException(sb.toString());
    }
}
