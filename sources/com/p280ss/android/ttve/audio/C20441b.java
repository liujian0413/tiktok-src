package com.p280ss.android.ttve.audio;

import android.media.AudioRecord;

/* renamed from: com.ss.android.ttve.audio.b */
public final class C20441b {

    /* renamed from: a */
    protected static int f55190a = -1;

    /* renamed from: b */
    protected static int[] f55191b = {44100, 8000, 11025, 16000, 22050};

    /* renamed from: c */
    protected static int f55192c = -1;

    /* renamed from: d */
    protected static int[] f55193d = {12, 16, 1};

    /* renamed from: e */
    AudioRecord f55194e;

    /* renamed from: f */
    public int f55195f = -1;

    /* renamed from: g */
    int f55196g;

    /* renamed from: h */
    int f55197h = -1;

    /* renamed from: i */
    int f55198i = 2;

    /* renamed from: j */
    boolean f55199j;

    /* renamed from: k */
    public C20440a f55200k;

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (this.f55194e != null) {
            try {
                if (this.f55194e.getState() != 0) {
                    this.f55194e.stop();
                }
                this.f55194e.release();
            } catch (Exception unused) {
            }
            this.f55194e = null;
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo55022a() {
        if (this.f55194e != null) {
            try {
                if (this.f55194e.getState() != 0) {
                    this.f55194e.stop();
                }
                this.f55194e.release();
            } catch (Exception unused) {
            }
            this.f55194e = null;
        }
        if (this.f55200k != null) {
            this.f55200k.mo55010b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r2.f55194e.getState() == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r2.f55194e.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2.f55200k.mo55007a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55025b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f55199j     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.media.AudioRecord r0 = r2.f55194e     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            r2.f55199j = r1     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            android.media.AudioRecord r0 = r2.f55194e
            int r0 = r0.getState()
            if (r0 == 0) goto L_0x001b
            android.media.AudioRecord r0 = r2.f55194e
            r0.stop()
        L_0x001b:
            com.ss.android.ttve.audio.a r0 = r2.f55200k
            r0.mo55007a()
            r0 = 1
            return r0
        L_0x0022:
            android.media.AudioRecord r0 = r2.f55194e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            android.media.AudioRecord r0 = r2.f55194e     // Catch:{ all -> 0x002d }
            r0.release()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.audio.C20441b.mo55025b():boolean");
    }

    public C20441b(C20440a aVar) {
        this.f55200k = aVar;
    }

    /* renamed from: a */
    public final void mo55023a(int i) {
        if (this.f55194e == null) {
            try {
                if (!(f55192c == -1 || f55190a == -1)) {
                    this.f55197h = f55193d[f55192c];
                    this.f55195f = f55191b[f55190a];
                    this.f55196g = AudioRecord.getMinBufferSize(this.f55195f, this.f55197h, this.f55198i);
                    AudioRecord audioRecord = new AudioRecord(i, this.f55195f, this.f55197h, this.f55198i, this.f55196g);
                    this.f55194e = audioRecord;
                }
            } catch (Exception unused) {
            }
            if (this.f55194e == null) {
                f55192c = -1;
                boolean z = false;
                for (int i2 : f55193d) {
                    this.f55197h = i2;
                    f55192c++;
                    f55190a = -1;
                    int[] iArr = f55191b;
                    int length = iArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int i4 = iArr[i3];
                        f55190a++;
                        try {
                            this.f55196g = AudioRecord.getMinBufferSize(i4, this.f55197h, this.f55198i);
                            if (this.f55196g > 0) {
                                this.f55195f = i4;
                                AudioRecord audioRecord2 = new AudioRecord(i, this.f55195f, this.f55197h, this.f55198i, this.f55196g);
                                this.f55194e = audioRecord2;
                                z = true;
                                break;
                            }
                            f55190a++;
                            i3++;
                        } catch (Exception unused2) {
                            this.f55195f = 0;
                            this.f55194e = null;
                            f55190a++;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (this.f55195f > 0) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r9.f55200k.mo55008a(r10, r9.f55195f, 2, r11, r13, r14) == 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        new java.lang.Thread(new com.p280ss.android.ttve.audio.C20441b.C204421(r9)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55024a(java.lang.String r10, double r11, int r13, int r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f55199j     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            android.media.AudioRecord r0 = r9.f55194e     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x000a
            goto L_0x002c
        L_0x000a:
            r0 = 1
            r9.f55199j = r0     // Catch:{ all -> 0x002e }
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            com.ss.android.ttve.audio.a r1 = r9.f55200k
            int r3 = r9.f55195f
            r4 = 2
            r2 = r10
            r5 = r11
            r7 = r13
            r8 = r14
            int r10 = r1.mo55008a(r2, r3, r4, r5, r7, r8)
            if (r10 == 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.Thread r10 = new java.lang.Thread
            com.ss.android.ttve.audio.b$1 r11 = new com.ss.android.ttve.audio.b$1
            r11.<init>()
            r10.<init>(r11)
            r10.start()
            return
        L_0x002c:
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x002e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.audio.C20441b.mo55024a(java.lang.String, double, int, int):void");
    }
}
