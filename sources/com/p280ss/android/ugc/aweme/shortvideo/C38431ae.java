package com.p280ss.android.ugc.aweme.shortvideo;

import com.C1642a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41457l;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41457l.C41458a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41459m;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41461o;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41494t;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41496v;
import com.p280ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants.ConsumeStatus;
import com.p280ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants.GetHeaderSizeStatus;
import com.p280ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants.UploadStatus;
import com.p280ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadException;
import com.p280ss.android.ugc.aweme.shortvideo.upload.PublishResultState;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41440a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae */
public final class C38431ae implements C41457l {

    /* renamed from: a */
    public final Lock f99882a = new ReentrantLock();

    /* renamed from: b */
    public final Condition f99883b = this.f99882a.newCondition();

    /* renamed from: c */
    public final Lock f99884c = new ReentrantLock();

    /* renamed from: d */
    public final Condition f99885d = this.f99884c.newCondition();

    /* renamed from: e */
    public C41461o f99886e = new C41461o();

    /* renamed from: f */
    public RandomAccessFile f99887f;

    /* renamed from: g */
    public volatile int f99888g = 0;

    /* renamed from: h */
    public volatile boolean f99889h;

    /* renamed from: i */
    public volatile UploadStatus f99890i;

    /* renamed from: j */
    public C41458a f99891j;

    /* renamed from: k */
    public LinkedList<C41496v> f99892k = new LinkedList<>();

    /* renamed from: l */
    public File f99893l;

    /* renamed from: m */
    public int f99894m = 0;

    /* renamed from: n */
    private final boolean f99895n;

    /* renamed from: o */
    private C41440a<Long> f99896o = new C41440a<>(Long.valueOf(-1));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$a */
    class C38433a implements C41459m {

        /* renamed from: a */
        public volatile int f99898a;

        /* renamed from: b */
        public Exception f99899b;

        /* renamed from: c */
        public volatile ConsumeStatus f99900c;

        /* renamed from: e */
        private int f99902e;

        /* renamed from: f */
        private volatile int f99903f;

        /* renamed from: g */
        private byte[] f99904g;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo96353c() {
            this.f99900c = null;
        }

        /* renamed from: b */
        public final boolean mo96352b() {
            if (this.f99900c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private C41496v m122887e() {
            Iterator it = C38431ae.this.f99892k.iterator();
            while (it.hasNext()) {
                C41496v vVar = (C41496v) it.next();
                if (this.f99902e == vVar.f107925a) {
                    return vVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        private C41496v m122886d() {
            C41496v e = m122887e();
            if (e != null) {
                return e;
            }
            int i = 0;
            if (C38431ae.this.f99892k.isEmpty()) {
                C38431ae.this.mo96347b("[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Integer.valueOf(C38431ae.this.f99888g));
                if (C38431ae.this.f99888g <= 0) {
                    return null;
                }
                i = C38431ae.this.f99888g;
            } else {
                int a = ((C41496v) C38431ae.this.f99892k.getLast()).mo102152a();
                if (C38431ae.this.f99889h) {
                    if (this.f99902e == 0) {
                        this.f99903f = C38431ae.this.f99888g;
                    } else if (((long) a) >= C38431ae.this.f99893l.length()) {
                        this.f99903f = 0;
                    }
                }
                i = a;
            }
            return new C41496v(this.f99902e, i, this.f99903f);
        }

        /* renamed from: f */
        private void m122888f() {
            String str;
            long length = C38431ae.this.f99893l.length();
            if (length == 0) {
                C38431ae aeVar = C38431ae.this;
                StringBuilder sb = new StringBuilder("parallel_upload_file_delete_on_consume OutputFileLength:");
                sb.append(length);
                sb.append(" UploadStatus:");
                sb.append(C38431ae.this.f99890i);
                aeVar.mo96347b(sb.toString(), new Object[0]);
                String str2 = "parallel_upload_file_delete_on_consume";
                C38510bb a = new C38510bb().mo96480a("OutputFileLength", Long.valueOf(length));
                String str3 = "UploadStatus";
                if (C38431ae.this.f99890i == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                } else {
                    str = C38431ae.this.f99890i.toString();
                }
                C6893q.m21447a(str2, a.mo96481a(str3, str).mo96482b());
            }
        }

        /* renamed from: a */
        public final void mo96351a() {
            C41496v d = m122886d();
            if (d == null) {
                C38431ae.this.mo96347b("[SliceConsume] sliceModel=null consume wait", new Object[0]);
                this.f99900c = ConsumeStatus.CONSUME_WAIT_DATA;
                return;
            }
            m122888f();
            try {
                if (((long) d.mo102152a()) > C38431ae.this.f99893l.length()) {
                    if (!C38431ae.this.f99889h) {
                        this.f99900c = ConsumeStatus.CONSUME_WAIT_DATA;
                        return;
                    }
                    d.f107927c = ((int) C38431ae.this.f99893l.length()) - d.f107926b;
                }
                this.f99898a = d.f107927c;
                C38431ae.this.f99887f.seek((long) d.f107926b);
                if (d.f107927c < 0) {
                    StringBuilder sb = new StringBuilder("ArrayIndexOutOfBoundsException sliceModel.getOffset():");
                    sb.append(d.f107926b);
                    sb.append("  mOutputFile.length():");
                    sb.append(C38431ae.this.f99893l.length());
                    C6921a.m21559a((Throwable) new Exception(sb.toString()));
                    m122885a(ConsumeStatus.CONSUME_FAIL);
                    return;
                }
                C38431ae.this.f99887f.read(this.f99904g, 0, d.f107927c);
                C38431ae.this.f99892k.add(d);
                if (d.mo102153b()) {
                    m122885a(ConsumeStatus.CONSUME_END);
                } else {
                    m122885a(ConsumeStatus.CONSUME_DONE);
                }
                C38431ae.this.mo96343a("consume execute %d-%d", Integer.valueOf(d.f107926b), Integer.valueOf(d.mo102152a()));
                C38431ae.this.mo96347b("consume execute %d-%d", Integer.valueOf(d.f107926b), Integer.valueOf(d.mo102152a()));
            } catch (IOException e) {
                this.f99899b = e;
                m122885a(ConsumeStatus.CONSUME_FAIL);
            }
        }

        /* renamed from: a */
        private void m122885a(ConsumeStatus consumeStatus) {
            C38431ae.this.f99884c.lock();
            this.f99900c = consumeStatus;
            C38431ae.this.f99885d.signalAll();
            C38431ae.this.f99884c.unlock();
        }

        private C38433a(int i, byte[] bArr, int i2) {
            this.f99902e = i;
            this.f99904g = bArr;
            this.f99903f = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$b */
    class C38434b implements C41459m {

        /* renamed from: b */
        private PublishResultState f99906b;

        /* renamed from: a */
        public final void mo96351a() {
            C38431ae.this.f99884c.lock();
            C38431ae.this.f99885d.signalAll();
            C38431ae.this.f99884c.unlock();
            if (C38431ae.this.f99891j != null) {
                C38431ae.this.f99891j.mo96370a(this.f99906b);
            }
            C38431ae.this.f99882a.lock();
            C38431ae.this.f99883b.signalAll();
            C38431ae.this.f99882a.unlock();
            try {
                C38431ae.this.f99887f.close();
                C38431ae.this.mo96347b("raf.close();", new Object[0]);
            } catch (IOException e) {
                C38431ae aeVar = C38431ae.this;
                StringBuilder sb = new StringBuilder("raf.close() ");
                sb.append(e.getMessage());
                aeVar.mo96347b(sb.toString(), new Object[0]);
            }
            if (C38431ae.this.f99893l.exists()) {
                C38431ae.this.f99893l.delete();
            }
            C38431ae.this.f99886e.mo102128a();
        }

        public C38434b(PublishResultState publishResultState) {
            this.f99906b = publishResultState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$c */
    class C38435c implements C41459m {

        /* renamed from: a */
        public volatile GetHeaderSizeStatus f99907a;

        /* renamed from: b */
        public final boolean mo96354b() {
            if (this.f99907a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo96351a() {
            if (C38431ae.this.f99888g > 0) {
                m122893a(GetHeaderSizeStatus.GET_HEADER_SIZE_DONE);
            } else {
                this.f99907a = GetHeaderSizeStatus.GET_HEADER_SIZE_WAIT;
            }
        }

        private C38435c() {
        }

        /* renamed from: a */
        private void m122893a(GetHeaderSizeStatus getHeaderSizeStatus) {
            C38431ae.this.f99884c.lock();
            this.f99907a = getHeaderSizeStatus;
            C38431ae.this.f99885d.signalAll();
            C38431ae.this.f99884c.unlock();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$d */
    class C38436d implements C41459m {

        /* renamed from: a */
        public volatile Exception f99909a;

        /* renamed from: c */
        private byte[] f99911c;

        /* renamed from: d */
        private int f99912d;

        /* renamed from: e */
        private int f99913e;

        /* renamed from: a */
        public final void mo96351a() {
            try {
                if (C38431ae.this.f99887f.length() == 0) {
                    C38431ae.this.f99888g = this.f99912d;
                    C38431ae.this.mo96347b("Produce on empty file, mMp4HeaderSize:%d", Integer.valueOf(C38431ae.this.f99888g));
                    C6893q.m21444a("parallel_upload_ve_compile_first_offset", this.f99912d, (JSONObject) null);
                    C38431ae.this.f99887f.write(new byte[this.f99912d], 0, this.f99912d);
                }
                C38431ae.this.f99887f.seek((long) this.f99912d);
                C38431ae.this.f99887f.write(this.f99911c, 0, this.f99913e);
                C38431ae.this.mo96343a("write offset:%d size:%d", Integer.valueOf(this.f99912d), Integer.valueOf(this.f99913e));
            } catch (IOException e) {
                this.f99909a = e;
            }
            C38431ae.this.f99882a.lock();
            C38431ae.this.f99883b.signalAll();
            C38431ae.this.f99882a.unlock();
        }

        public C38436d(byte[] bArr, int i, int i2) {
            this.f99911c = bArr;
            this.f99912d = i;
            this.f99913e = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$e */
    class C38437e implements C41459m {

        /* renamed from: a */
        public volatile int f99914a;

        /* renamed from: b */
        public Exception f99915b;

        /* renamed from: c */
        public volatile ConsumeStatus f99916c;

        /* renamed from: e */
        private final long f99918e;

        /* renamed from: f */
        private final byte[] f99919f;

        /* renamed from: g */
        private final long f99920g;

        /* renamed from: h */
        private final long f99921h;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo96356c() {
            this.f99916c = null;
        }

        /* renamed from: b */
        public final boolean mo96355b() {
            if (this.f99916c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo96351a() {
            int length = (int) C38431ae.this.f99893l.length();
            if (!C38431ae.this.f99889h) {
                if (this.f99920g > ((long) length)) {
                    this.f99916c = ConsumeStatus.CONSUME_WAIT_DATA;
                } else {
                    m122897a(length);
                }
            } else if (this.f99918e < ((long) length)) {
                m122897a(length);
            } else {
                m122898a(ConsumeStatus.CONSUME_END);
            }
        }

        /* renamed from: a */
        private void m122898a(ConsumeStatus consumeStatus) {
            C38431ae.this.f99884c.lock();
            this.f99916c = consumeStatus;
            C38431ae.this.f99885d.signalAll();
            C38431ae.this.f99884c.unlock();
        }

        /* renamed from: a */
        private void m122897a(int i) {
            this.f99914a = (int) (Math.min(this.f99921h, (long) i) - this.f99918e);
            try {
                C38431ae.this.f99887f.seek(this.f99918e);
                C38431ae.this.f99887f.read(this.f99919f, 0, this.f99914a);
                m122898a(ConsumeStatus.CONSUME_DONE);
            } catch (IOException e) {
                this.f99915b = e;
                m122898a(ConsumeStatus.CONSUME_FAIL);
            }
        }

        private C38437e(long j, byte[] bArr, int i, int i2) {
            this.f99918e = j;
            this.f99919f = bArr;
            this.f99921h = ((long) i) + j;
            this.f99920g = j + ((long) i2);
        }
    }

    /* renamed from: c */
    public final boolean mo96348c() {
        return this.f99889h;
    }

    /* renamed from: d */
    public final long mo96349d() {
        return ((Long) this.f99896o.f107807a).longValue();
    }

    /* renamed from: e */
    public final long mo96350e() {
        if (this.f99889h) {
            return this.f99893l.length();
        }
        return -1;
    }

    /* renamed from: h */
    private int m122871h() {
        if (UploadStatus.UPLOAD_FINISH.equals(this.f99890i)) {
            return -1;
        }
        if (UploadStatus.UPLOAD_CANCEL.equals(this.f99890i)) {
            return -2;
        }
        return 1;
    }

    /* renamed from: a */
    public final int mo96338a() {
        mo96343a("StartGetHeaderSize", new Object[0]);
        int g = m122870g();
        mo96343a("EndGetHeaderSize result:%d", Integer.valueOf(g));
        return g;
    }

    /* renamed from: f */
    private void m122869f() {
        if (this.f99892k == null || this.f99892k.isEmpty()) {
            this.f99896o.mo102092a(Long.valueOf(0));
        } else {
            this.f99896o.mo102092a(Long.valueOf((long) ((C41496v) this.f99892k.getLast()).mo102152a()));
        }
    }

    /* renamed from: b */
    public final void mo96346b() {
        StringBuilder sb = new StringBuilder("stop cancelUpload, currentStatus:");
        sb.append(this.f99890i);
        mo96347b(sb.toString(), new Object[0]);
        if (this.f99890i == UploadStatus.UPLOADING) {
            this.f99890i = UploadStatus.UPLOAD_CANCEL;
            try {
                this.f99886e.mo102129a(new C38434b(PublishResultState.CANCEL));
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: g */
    private int m122870g() {
        boolean await;
        int h = m122871h();
        if (h < 0) {
            return h;
        }
        if (this.f99888g > 0) {
            return this.f99888g;
        }
        C38435c cVar = new C38435c();
        this.f99884c.lock();
        do {
            try {
                this.f99886e.mo102129a(cVar);
                do {
                    await = this.f99885d.await(30, TimeUnit.SECONDS);
                } while (!cVar.mo96354b());
                if (await) {
                    int h2 = m122871h();
                    if (h2 < 0) {
                        this.f99884c.unlock();
                        return h2;
                    }
                } else {
                    throw new ConcurrentUploadException("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new ConcurrentUploadException((Throwable) e);
            } catch (Throwable th) {
                this.f99884c.unlock();
                throw th;
            }
        } while (cVar.f99907a == GetHeaderSizeStatus.GET_HEADER_SIZE_WAIT);
        this.f99884c.unlock();
        if (this.f99888g <= 0) {
            return -1;
        }
        return this.f99888g;
    }

    /* renamed from: a */
    public final void mo96342a(C41458a aVar) {
        this.f99891j = aVar;
    }

    public C38431ae(String str) {
        this.f99893l = new File(str);
        this.f99890i = UploadStatus.UPLOADING;
        try {
            C7276d.m22822e(this.f99893l.getParent());
            new File(this.f99893l.getParent()).mkdirs();
            this.f99893l.createNewFile();
            this.f99887f = new RandomAccessFile(this.f99893l, "rw");
            this.f99895n = C35563c.f93231M.mo93305a(Property.EnablePublishDetailALog);
        } catch (FileNotFoundException e) {
            throw new ConcurrentUploadException((Throwable) e);
        } catch (IOException e2) {
            throw new ConcurrentUploadException((Throwable) e2);
        }
    }

    /* renamed from: a */
    public final void mo96344a(boolean z) {
        PublishResultState publishResultState;
        StringBuilder sb = new StringBuilder("stop stopUpload, currentStatus:");
        sb.append(this.f99890i);
        mo96347b(sb.toString(), new Object[0]);
        if (this.f99890i == UploadStatus.UPLOADING) {
            this.f99890i = UploadStatus.UPLOAD_FINISH;
            try {
                C41461o oVar = this.f99886e;
                if (z) {
                    publishResultState = PublishResultState.SUCCESS;
                } else {
                    publishResultState = PublishResultState.FAILED;
                }
                oVar.mo102129a(new C38434b(publishResultState));
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: c */
    private void m122868c(String str, Object... objArr) {
        m122864a(true, true, str, objArr);
    }

    /* renamed from: a */
    public final void mo96343a(String str, Object... objArr) {
        m122864a(true, false, str, objArr);
    }

    /* renamed from: b */
    public final void mo96347b(String str, Object... objArr) {
        m122864a(false, true, str, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[SYNTHETIC, Splitter:B:26:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC, Splitter:B:32:0x0062] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m122867b(long r15, long r17) {
        /*
            r14 = this;
            r1 = r14
            r2 = r15
            int r0 = r14.m122871h()
            if (r0 >= 0) goto L_0x000a
            long r2 = (long) r0
            return r2
        L_0x000a:
            java.io.File r0 = r1.f99893l
            long r4 = r0.length()
            int r0 = (int) r4
            long r4 = (long) r0
            long r6 = r2 + r17
            r8 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            return r8
        L_0x001b:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r4 = 0
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            java.io.File r6 = r1.f99893l     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x0060, all -> 0x0058 }
            r5.seek(r2)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r10 = r6
        L_0x0034:
            int r4 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            r5.read(r3)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r12 = 2048(0x800, double:1.0118E-320)
            long r10 = r10 + r12
            r4 = 0
            long r12 = r10 - r17
            long r12 = java.lang.Math.max(r6, r12)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            int r12 = (int) r12     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            int r12 = 2048 - r12
            r0.update(r3, r4, r12)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            goto L_0x0034
        L_0x004c:
            long r2 = r0.getValue()     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r5.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r2
        L_0x0054:
            r0 = move-exception
            goto L_0x005a
        L_0x0056:
            r4 = r5
            goto L_0x0060
        L_0x0058:
            r0 = move-exception
            r5 = r4
        L_0x005a:
            if (r5 == 0) goto L_0x005f
            r5.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            throw r0
        L_0x0060:
            if (r4 == 0) goto L_0x0065
            r4.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.C38431ae.m122867b(long, long):long");
    }

    /* renamed from: a */
    public final long mo96341a(long j, long j2) {
        long b = m122867b(j, j2);
        mo96343a("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(b));
        return b;
    }

    /* renamed from: a */
    public final int mo96339a(int i, byte[] bArr, int i2) {
        m122868c("StartSliceConsume sliceId:%d size:%d", Integer.valueOf(i), Integer.valueOf(i2));
        m122869f();
        int b = m122865b(i, bArr, i2);
        m122868c("EndSliceConsume sliceId:%d size:%d result:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }

    /* renamed from: b */
    private int m122865b(int i, byte[] bArr, int i2) {
        boolean await;
        int h = m122871h();
        if (h < 0) {
            return h;
        }
        C38433a aVar = new C38433a(i, bArr, i2);
        this.f99884c.lock();
        do {
            try {
                aVar.mo96353c();
                this.f99886e.mo102129a(aVar);
                do {
                    await = this.f99885d.await(30, TimeUnit.SECONDS);
                } while (!aVar.mo96352b());
                if (await) {
                    int h2 = m122871h();
                    if (h2 < 0) {
                        this.f99884c.unlock();
                        return h2;
                    }
                } else {
                    this.f99894m = -1;
                    throw new ConcurrentUploadException("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new ConcurrentUploadException((Throwable) e);
            } catch (Throwable th) {
                this.f99884c.unlock();
                throw th;
            }
        } while (aVar.f99900c == ConsumeStatus.CONSUME_WAIT_DATA);
        this.f99884c.unlock();
        switch (aVar.f99900c) {
            case CONSUME_FAIL:
                throw new ConcurrentUploadException((Throwable) aVar.f99899b);
            case CONSUME_END:
                return 0;
            default:
                return aVar.f99898a;
        }
    }

    /* renamed from: a */
    private void m122864a(boolean z, boolean z2, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(C1642a.m8035a(Locale.US, str, objArr));
        sb.append(" hash:");
        sb.append(hashCode());
        String sb2 = sb.toString();
        if (z2) {
            StringBuilder sb3 = new StringBuilder("ConcurrentUploadByFile:");
            sb3.append(sb2);
            C41530am.m132280a(sb3.toString());
        }
        if (z) {
            C41494t.m132184a().mo102149a(sb2);
        }
    }

    /* renamed from: a */
    public final int mo96340a(long j, byte[] bArr, int i, int i2) {
        m122864a(true, this.f99895n, "StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        this.f99896o.mo102092a(Long.valueOf(j));
        int b = m122866b(j, bArr, i, i2);
        m122864a(true, this.f99895n, "EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }

    /* renamed from: b */
    private int m122866b(long j, byte[] bArr, int i, int i2) {
        boolean await;
        int h = m122871h();
        if (h < 0) {
            return h;
        }
        C38437e eVar = new C38437e(j, bArr, i, i2);
        this.f99884c.lock();
        do {
            try {
                eVar.mo96356c();
                this.f99886e.mo102129a(eVar);
                do {
                    await = this.f99885d.await(30, TimeUnit.SECONDS);
                } while (!eVar.mo96355b());
                if (await) {
                    int h2 = m122871h();
                    if (h2 < 0) {
                        this.f99884c.unlock();
                        return h2;
                    }
                } else {
                    this.f99894m = -1;
                    throw new ConcurrentUploadException("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new ConcurrentUploadException((Throwable) e);
            } catch (Throwable th) {
                this.f99884c.unlock();
                throw th;
            }
        } while (eVar.f99916c == ConsumeStatus.CONSUME_WAIT_DATA);
        this.f99884c.unlock();
        switch (eVar.f99916c) {
            case CONSUME_FAIL:
                throw new ConcurrentUploadException((Throwable) eVar.f99915b);
            case CONSUME_END:
                return 0;
            default:
                return eVar.f99914a;
        }
    }

    /* renamed from: a */
    public final void mo96345a(byte[] bArr, int i, int i2, boolean z) {
        mo96343a("produce offset:%d size:%d isFinish:%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (m122871h() >= 0) {
            C38436d dVar = new C38436d(bArr, i, i2);
            this.f99882a.lock();
            try {
                this.f99886e.mo102129a(dVar);
                this.f99883b.await();
                if (dVar.f99909a == null) {
                    this.f99882a.unlock();
                    this.f99889h = z;
                    this.f99884c.lock();
                    this.f99885d.signalAll();
                    this.f99884c.unlock();
                    return;
                }
                throw new ConcurrentUploadException((Throwable) dVar.f99909a);
            } catch (InterruptedException e) {
                throw new ConcurrentUploadException((Throwable) e);
            } catch (Throwable th) {
                this.f99882a.unlock();
                throw th;
            }
        }
    }
}
