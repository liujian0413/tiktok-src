package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode.ThreadPolicy;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.p */
public abstract class C14627p extends C14605c {

    /* renamed from: a */
    private final Map<String, Object> f37755a = new HashMap();

    /* renamed from: f */
    protected final Context f37756f;

    /* renamed from: g */
    protected String f37757g;

    /* renamed from: h */
    public String[] f37758h;

    /* renamed from: com.facebook.soloader.p$a */
    public static class C14629a {

        /* renamed from: c */
        public final String f37765c;

        /* renamed from: d */
        public final String f37766d;

        public C14629a(String str, String str2) {
            this.f37765c = str;
            this.f37766d = str2;
        }
    }

    /* renamed from: com.facebook.soloader.p$b */
    public static final class C14630b {

        /* renamed from: a */
        public final C14629a[] f37767a;

        public C14630b(C14629a[] aVarArr) {
            this.f37767a = aVarArr;
        }

        /* renamed from: a */
        static final C14630b m42317a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C14629a[] aVarArr = new C14629a[readInt];
                    for (int i = 0; i < readInt; i++) {
                        aVarArr[i] = new C14629a(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C14630b(aVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: a */
        public final void mo36865a(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f37767a.length);
            for (int i = 0; i < this.f37767a.length; i++) {
                dataOutput.writeUTF(this.f37767a[i].f37765c);
                dataOutput.writeUTF(this.f37767a[i].f37766d);
            }
        }
    }

    /* renamed from: com.facebook.soloader.p$c */
    protected static final class C14631c implements Closeable {

        /* renamed from: a */
        public final C14629a f37768a;

        /* renamed from: b */
        public final InputStream f37769b;

        public final void close() throws IOException {
            this.f37769b.close();
        }

        public C14631c(C14629a aVar, InputStream inputStream) {
            this.f37768a = aVar;
            this.f37769b = inputStream;
        }
    }

    /* renamed from: com.facebook.soloader.p$d */
    protected static abstract class C14632d implements Closeable {
        protected C14632d() {
        }

        /* renamed from: a */
        public abstract boolean mo36857a();

        /* renamed from: b */
        public abstract C14631c mo36858b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* renamed from: com.facebook.soloader.p$e */
    protected static abstract class C14633e implements Closeable {
        protected C14633e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C14630b mo36855a() throws IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C14632d mo36856b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C14633e mo36847a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo36863a(String str) throws IOException {
        synchronized (m42311b(str)) {
            this.f37757g = str;
            mo36851a(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo36848b() throws IOException {
        Throwable th;
        Parcel obtain = Parcel.obtain();
        C14633e a = mo36847a();
        try {
            C14629a[] aVarArr = a.mo36855a().f37767a;
            obtain.writeByte(1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].f37765c);
                obtain.writeString(aVarArr[i].f37766d);
            }
            a.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            C6497a.m20181a(th, th2);
        }
        throw th;
    }

    /* renamed from: b */
    private Object m42311b(String str) {
        Object obj;
        synchronized (this.f37755a) {
            obj = this.f37755a.get(str);
            if (obj == null) {
                obj = new Object();
                this.f37755a.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: a */
    private void m42309a(C14629a[] aVarArr) throws IOException {
        String[] list = this.f37736b.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < aVarArr.length) {
                        if (aVarArr[i].f37765c.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        C14624n.m42300a(new File(this.f37736b, str));
                    }
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unable to list directory ");
        sb.append(this.f37736b);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36851a(int i) throws IOException {
        C14624n.m42303b(this.f37736b);
        C14616g a = C14616g.m42282a(new File(this.f37736b, "dso_lock"));
        try {
            if (m42310a(a, i, mo36848b())) {
                a = null;
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    protected C14627p(Context context, String str) {
        super(m42305a(context, str), 1);
        this.f37756f = context;
    }

    /* renamed from: a */
    private static File m42305a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/");
        sb.append(str);
        return new File(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3 != null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42308a(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r3 = 0
            r0.seek(r1)     // Catch:{ Throwable -> 0x0024 }
            r0.write(r4)     // Catch:{ Throwable -> 0x0024 }
            long r1 = r0.getFilePointer()     // Catch:{ Throwable -> 0x0024 }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x0024 }
            java.io.FileDescriptor r4 = r0.getFD()     // Catch:{ Throwable -> 0x0024 }
            r4.sync()     // Catch:{ Throwable -> 0x0024 }
            r0.close()
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0026:
            if (r3 == 0) goto L_0x0031
            r0.close()     // Catch:{ Throwable -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r0)
            goto L_0x0034
        L_0x0031:
            r0.close()
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14627p.m42308a(java.io.File, byte):void");
    }

    /* renamed from: a */
    private void m42307a(C14631c cVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        if (this.f37736b.setWritable(true, true)) {
            File file = new File(this.f37736b, cVar.f37768a.f37765c);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException unused) {
                C14624n.m42300a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = cVar.f37769b.available();
                if (available > 1) {
                    C14624n.m42301a(randomAccessFile.getFD(), (long) available);
                }
                C14624n.m42298a(randomAccessFile, cVar.f37769b, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                StringBuilder sb = new StringBuilder("cannot make file executable: ");
                sb.append(file);
                throw new IOException(sb.toString());
            } catch (IOException e) {
                C14624n.m42300a(file);
                throw e;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("cannot make directory writable for us: ");
            sb2.append(this.f37736b);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final int mo36850a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        int a;
        synchronized (m42311b(str)) {
            a = mo36854a(str, i, this.f37736b, threadPolicy);
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC, Splitter:B:11:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ Throwable -> 0x001c, all -> 0x0019, Throwable -> 0x009a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m42306a(byte r11, com.facebook.soloader.C14627p.C14630b r12, com.facebook.soloader.C14627p.C14632d r13) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r10.f37736b
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            r2 = 0
            if (r11 != r0) goto L_0x0020
            com.facebook.soloader.p$b r11 = com.facebook.soloader.C14627p.C14630b.m42317a(r1)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0019:
            r11 = move-exception
            goto L_0x0094
        L_0x001c:
            r11 = move-exception
            r2 = r11
            goto L_0x0093
        L_0x0020:
            r11 = r2
        L_0x0021:
            r3 = 0
            if (r11 != 0) goto L_0x002b
            com.facebook.soloader.p$b r11 = new com.facebook.soloader.p$b     // Catch:{ Throwable -> 0x001c }
            com.facebook.soloader.p$a[] r4 = new com.facebook.soloader.C14627p.C14629a[r3]     // Catch:{ Throwable -> 0x001c }
            r11.<init>(r4)     // Catch:{ Throwable -> 0x001c }
        L_0x002b:
            com.facebook.soloader.p$a[] r12 = r12.f37767a     // Catch:{ Throwable -> 0x001c }
            r10.m42309a(r12)     // Catch:{ Throwable -> 0x001c }
            r12 = 32768(0x8000, float:4.5918E-41)
            byte[] r12 = new byte[r12]     // Catch:{ Throwable -> 0x001c }
        L_0x0035:
            boolean r4 = r13.mo36857a()     // Catch:{ Throwable -> 0x001c }
            if (r4 == 0) goto L_0x008f
            com.facebook.soloader.p$c r4 = r13.mo36858b()     // Catch:{ Throwable -> 0x001c }
            r5 = 1
            r6 = 0
        L_0x0041:
            if (r5 == 0) goto L_0x0071
            com.facebook.soloader.p$a[] r7 = r11.f37767a     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            int r7 = r7.length     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r6 >= r7) goto L_0x0071
            com.facebook.soloader.p$a[] r7 = r11.f37767a     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r7 = r7[r6]     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r7 = r7.f37765c     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            com.facebook.soloader.p$a r8 = r4.f37768a     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r8 = r8.f37765c     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            boolean r7 = r7.equals(r8)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r7 == 0) goto L_0x0069
            com.facebook.soloader.p$a[] r7 = r11.f37767a     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r7 = r7[r6]     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r7 = r7.f37766d     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            com.facebook.soloader.p$a r8 = r4.f37768a     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r8 = r8.f37766d     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            boolean r7 = r7.equals(r8)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r7 == 0) goto L_0x0069
            r5 = 0
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x006c:
            r11 = move-exception
            r12 = r2
            goto L_0x007c
        L_0x006f:
            r11 = move-exception
            goto L_0x0077
        L_0x0071:
            if (r5 == 0) goto L_0x008b
            r10.m42307a(r4, r12)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            goto L_0x008b
        L_0x0077:
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r12 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x007c:
            if (r12 == 0) goto L_0x0087
            r4.close()     // Catch:{ Throwable -> 0x0082 }
            goto L_0x008a
        L_0x0082:
            r13 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r12, r13)     // Catch:{ Throwable -> 0x001c }
            goto L_0x008a
        L_0x0087:
            r4.close()     // Catch:{ Throwable -> 0x001c }
        L_0x008a:
            throw r11     // Catch:{ Throwable -> 0x001c }
        L_0x008b:
            r4.close()     // Catch:{ Throwable -> 0x001c }
            goto L_0x0035
        L_0x008f:
            r1.close()
            return
        L_0x0093:
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0094:
            if (r2 == 0) goto L_0x009f
            r1.close()     // Catch:{ Throwable -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r12 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r2, r12)
            goto L_0x00a2
        L_0x009f:
            r1.close()
        L_0x00a2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14627p.m42306a(byte, com.facebook.soloader.p$b, com.facebook.soloader.p$d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 != 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c6, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c7, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cb, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r10 = r13;
        r13 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m42310a(com.facebook.soloader.C14616g r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r11.f37736b
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r1 = 0
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x002d, Throwable -> 0x001c }
            if (r3 == r7) goto L_0x002e
            goto L_0x002d
        L_0x001a:
            r12 = move-exception
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001e:
            if (r1 == 0) goto L_0x0029
            r0.close()     // Catch:{ Throwable -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r13 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r13)
            goto L_0x002c
        L_0x0029:
            r0.close()
        L_0x002c:
            throw r12
        L_0x002d:
            r3 = 0
        L_0x002e:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r11.f37736b
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r6 = "rw"
            r0.<init>(r4, r6)
            long r8 = r0.length()     // Catch:{ Throwable -> 0x00e0 }
            int r6 = (int) r8     // Catch:{ Throwable -> 0x00e0 }
            byte[] r6 = new byte[r6]     // Catch:{ Throwable -> 0x00e0 }
            int r8 = r0.read(r6)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r6.length     // Catch:{ Throwable -> 0x00e0 }
            if (r8 == r9) goto L_0x0050
            r3 = 0
        L_0x0050:
            boolean r6 = java.util.Arrays.equals(r6, r14)     // Catch:{ Throwable -> 0x00e0 }
            if (r6 != 0) goto L_0x0057
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x0060
            r6 = r13 & 2
            if (r6 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r8 = r1
            goto L_0x0078
        L_0x0060:
            m42308a(r5, r2)     // Catch:{ Throwable -> 0x00e0 }
            com.facebook.soloader.p$e r6 = r11.mo36847a()     // Catch:{ Throwable -> 0x00e0 }
            com.facebook.soloader.p$b r8 = r6.mo36855a()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            com.facebook.soloader.p$d r9 = r6.mo36856b()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r11.m42306a(r3, r8, r9)     // Catch:{ Throwable -> 0x00b1, all -> 0x00ae }
            r9.close()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            r6.close()     // Catch:{ Throwable -> 0x00e0 }
        L_0x0078:
            r0.close()
            if (r8 != 0) goto L_0x007e
            return r2
        L_0x007e:
            com.facebook.soloader.p$1 r9 = new com.facebook.soloader.p$1
            r0 = r9
            r1 = r11
            r2 = r4
            r3 = r14
            r4 = r8
            r6 = r12
            r0.<init>(r2, r3, r4, r5, r6)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00aa
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "SoSync:"
            r13.<init>(r14)
            java.io.File r14 = r11.f37736b
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00ad
        L_0x00aa:
            r9.run()
        L_0x00ad:
            return r7
        L_0x00ae:
            r12 = move-exception
            r13 = r1
            goto L_0x00b7
        L_0x00b1:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00b7:
            if (r13 == 0) goto L_0x00c2
            r9.close()     // Catch:{ Throwable -> 0x00bd, all -> 0x00c6 }
            goto L_0x00c5
        L_0x00bd:
            r14 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r13, r14)     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
            goto L_0x00c5
        L_0x00c2:
            r9.close()     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
        L_0x00c5:
            throw r12     // Catch:{ Throwable -> 0x00c9, all -> 0x00c6 }
        L_0x00c6:
            r12 = move-exception
            r13 = r1
            goto L_0x00cf
        L_0x00c9:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00cf:
            if (r13 == 0) goto L_0x00da
            r6.close()     // Catch:{ Throwable -> 0x00d5 }
            goto L_0x00dd
        L_0x00d5:
            r14 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r13, r14)     // Catch:{ Throwable -> 0x00e0 }
            goto L_0x00dd
        L_0x00da:
            r6.close()     // Catch:{ Throwable -> 0x00e0 }
        L_0x00dd:
            throw r12     // Catch:{ Throwable -> 0x00e0 }
        L_0x00de:
            r12 = move-exception
            goto L_0x00e3
        L_0x00e0:
            r12 = move-exception
            r1 = r12
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00e3:
            if (r1 == 0) goto L_0x00ee
            r0.close()     // Catch:{ Throwable -> 0x00e9 }
            goto L_0x00f1
        L_0x00e9:
            r13 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r13)
            goto L_0x00f1
        L_0x00ee:
            r0.close()
        L_0x00f1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14627p.m42310a(com.facebook.soloader.g, int, byte[]):boolean");
    }
}
