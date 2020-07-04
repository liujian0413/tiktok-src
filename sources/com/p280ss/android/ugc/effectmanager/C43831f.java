package com.p280ss.android.ugc.effectmanager;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.effectmanager.p1724b.C43688a;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: com.ss.android.ugc.effectmanager.f */
public final class C43831f {

    /* renamed from: a */
    public final String f113503a;

    /* renamed from: b */
    private final C43688a f113504b;

    /* renamed from: com.ss.android.ugc.effectmanager.f$1 */
    static /* synthetic */ class C438321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f113505a = new int[FetchModelType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.android.ugc.effectmanager.FetchModelType[] r0 = com.p280ss.android.ugc.effectmanager.FetchModelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f113505a = r0
                int[] r0 = f113505a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.p280ss.android.ugc.effectmanager.FetchModelType.ZIP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f113505a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.p280ss.android.ugc.effectmanager.FetchModelType.ORIGIN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43831f.C438321.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.f$a */
    static class C43833a extends FilterOutputStream {

        /* renamed from: a */
        long f113506a;

        public C43833a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void write(int i) throws IOException {
            this.out.write(i);
            this.f113506a++;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.out.write(bArr, i, i2);
            this.f113506a += (long) i2;
        }
    }

    /* renamed from: e */
    private static int m138781e(String str) {
        return str.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo105971c(String str) {
        try {
            this.f113504b.mo105693c(str);
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    private static String m138780d(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.effectmanager.model.LocalModelInfo mo105969a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = m138780d(r6)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r5.f113504b     // Catch:{ IOException -> 0x005e }
            java.util.Set r1 = r1.mo105697f()     // Catch:{ IOException -> 0x005e }
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.p280ss.android.ugc.effectmanager.common.C43723d.m138564a(r2)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x000f
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 != 0) goto L_0x002a
            return r0
        L_0x002a:
            com.ss.android.ugc.effectmanager.b.a r6 = r5.f113504b     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            com.ss.android.ugc.effectmanager.b.a$c r6 = r6.mo105687a(r2)     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            if (r6 != 0) goto L_0x0038
            if (r6 == 0) goto L_0x0037
            r6.close()
        L_0x0037:
            return r0
        L_0x0038:
            r1 = 0
            java.io.File r1 = r6.mo105713b(r1)     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            com.ss.android.ugc.effectmanager.model.LocalModelInfo r1 = com.p280ss.android.ugc.effectmanager.model.LocalModelInfo.fromFile(r1)     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            if (r6 == 0) goto L_0x004a
            r6.close()
        L_0x004a:
            return r1
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            r6.close()
        L_0x0056:
            throw r0
        L_0x0057:
            r6 = r0
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r6.close()
        L_0x005d:
            return r0
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43831f.mo105969a(java.lang.String):com.ss.android.ugc.effectmanager.model.LocalModelInfo");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0013 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.lang.String> mo105970b(java.lang.String r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = m138780d(r6)
            com.ss.android.ugc.effectmanager.b.a r1 = r5.f113504b     // Catch:{ IOException -> 0x0051 }
            java.util.Set r1 = r1.mo105697f()     // Catch:{ IOException -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.p280ss.android.ugc.effectmanager.common.C43723d.m138564a(r2)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0013
            r3 = 0
            com.ss.android.ugc.effectmanager.b.a r4 = r5.f113504b     // Catch:{ IOException -> 0x004a, all -> 0x0043 }
            com.ss.android.ugc.effectmanager.b.a$c r4 = r4.mo105687a(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0043 }
            if (r4 != 0) goto L_0x0038
            if (r4 == 0) goto L_0x0013
        L_0x0034:
            r4.close()
            goto L_0x0013
        L_0x0038:
            r0.add(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003e }
            if (r4 == 0) goto L_0x0013
            goto L_0x0034
        L_0x003e:
            r6 = move-exception
            r3 = r4
            goto L_0x0044
        L_0x0041:
            r3 = r4
            goto L_0x004a
        L_0x0043:
            r6 = move-exception
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()
        L_0x0049:
            throw r6
        L_0x004a:
            if (r3 == 0) goto L_0x0013
            r3.close()
            goto L_0x0013
        L_0x0050:
            return r0
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43831f.mo105970b(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: a */
    private static long m138777a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    C43831f(String str, String str2) {
        try {
            this.f113504b = C43688a.m138427a(new File(str), m138781e(str2), 1, Long.MAX_VALUE);
            this.f113503a = str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m138779b(java.lang.String r4, java.io.InputStream r5, java.security.MessageDigest r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r4 = m138780d(r4)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r3.f113504b     // Catch:{ IOException -> 0x004c }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r1.mo105690b(r4)     // Catch:{ IOException -> 0x004c }
            com.ss.android.ugc.effectmanager.f$a r0 = new com.ss.android.ugc.effectmanager.f$a     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.security.DigestOutputStream r1 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2 = 0
            java.io.OutputStream r2 = r4.mo105700a(r2)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r1.<init>(r2, r6)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            m138777a(r5, r0)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r0.close()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            byte[] r5 = r6.digest()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.lang.String r5 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f.m138606a(r5)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            boolean r5 = r5.equals(r7)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r5 == 0) goto L_0x0039
            r4.mo105701a()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            long r5 = r0.f113506a     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            r4.mo105703c()
        L_0x0038:
            return r5
        L_0x0039:
            r4.mo105702b()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r4 == 0) goto L_0x0041
            r4.mo105703c()
        L_0x0041:
            r4 = -1
            return r4
        L_0x0044:
            r5 = move-exception
            goto L_0x0053
        L_0x0046:
            r5 = move-exception
            r0 = r4
            goto L_0x004d
        L_0x0049:
            r5 = move-exception
            r4 = r0
            goto L_0x0053
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0049 }
            r4.<init>(r5)     // Catch:{ all -> 0x0049 }
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0053:
            if (r4 == 0) goto L_0x0058
            r4.mo105703c()
        L_0x0058:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43831f.m138779b(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f A[SYNTHETIC, Splitter:B:45:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094 A[Catch:{ IOException -> 0x0097 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m138778a(java.lang.String r4, java.io.InputStream r5, java.security.MessageDigest r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r4 = m138780d(r4)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r3.f113504b     // Catch:{ IOException -> 0x0083, all -> 0x007f }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r1.mo105690b(r4)     // Catch:{ IOException -> 0x0083, all -> 0x007f }
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r5 = r5.getName()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r2 = r3.f113503a     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r0.<init>(r2, r5)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            boolean r5 = r0.exists()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            if (r5 == 0) goto L_0x002e
            r0.delete()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            goto L_0x0035
        L_0x002e:
            java.io.File r5 = r0.getParentFile()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r5.mkdirs()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
        L_0x0035:
            com.ss.android.ugc.effectmanager.f$a r5 = new com.ss.android.ugc.effectmanager.f$a     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.security.DigestOutputStream r0 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r2 = 0
            java.io.OutputStream r2 = r4.mo105700a(r2)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r0.<init>(r2, r6)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            m138777a(r1, r5)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r5.close()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            byte[] r6 = r6.digest()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r6 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f.m138606a(r6)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            boolean r6 = r6.equals(r7)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            if (r6 == 0) goto L_0x0066
            r4.mo105701a()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            long r5 = r5.f113506a     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r1.close()     // Catch:{ IOException -> 0x0065 }
            if (r4 == 0) goto L_0x0065
            r4.mo105703c()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r5
        L_0x0066:
            r4.mo105702b()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r1.close()     // Catch:{ IOException -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            r4.mo105703c()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r4 = -1
            return r4
        L_0x0074:
            r5 = move-exception
            goto L_0x008d
        L_0x0076:
            r5 = move-exception
            goto L_0x007d
        L_0x0078:
            r5 = move-exception
            r1 = r0
            goto L_0x008d
        L_0x007b:
            r5 = move-exception
            r1 = r0
        L_0x007d:
            r0 = r4
            goto L_0x0085
        L_0x007f:
            r5 = move-exception
            r4 = r0
            r1 = r4
            goto L_0x008d
        L_0x0083:
            r5 = move-exception
            r1 = r0
        L_0x0085:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x008b }
            r4.<init>(r5)     // Catch:{ all -> 0x008b }
            throw r4     // Catch:{ all -> 0x008b }
        L_0x008b:
            r5 = move-exception
            r4 = r0
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0092:
            if (r4 == 0) goto L_0x0097
            r4.mo105703c()     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43831f.m138778a(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo105968a(FetchModelType fetchModelType, String str, InputStream inputStream, MessageDigest messageDigest, String str2) {
        if (C438321.f113505a[fetchModelType.ordinal()] != 1) {
            return m138779b(str, inputStream, messageDigest, str2);
        }
        return m138778a(str, inputStream, messageDigest, str2);
    }
}
