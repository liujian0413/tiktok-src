package com.p280ss.android.socialbase.downloader.downloader;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus;
import com.p280ss.android.socialbase.downloader.depend.C20207aa;
import com.p280ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.p280ss.android.socialbase.downloader.impls.C20295a;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.downloader.e */
public class C20275e {

    /* renamed from: a */
    public static final String f54796a = "e";

    /* renamed from: b */
    public DownloadInfo f54797b;

    /* renamed from: c */
    public final C20285j f54798c;

    /* renamed from: d */
    private final Handler f54799d;

    /* renamed from: e */
    private DownloadTask f54800e;

    /* renamed from: f */
    private SparseArray<IDownloadListener> f54801f;

    /* renamed from: g */
    private SparseArray<IDownloadListener> f54802g;

    /* renamed from: h */
    private SparseArray<IDownloadListener> f54803h;

    /* renamed from: i */
    private boolean f54804i;

    /* renamed from: j */
    private volatile long f54805j;

    /* renamed from: k */
    private final AtomicLong f54806k = new AtomicLong();

    /* renamed from: l */
    private boolean f54807l = false;

    /* renamed from: m */
    private int f54808m;

    /* renamed from: n */
    private long f54809n;

    /* renamed from: o */
    private IDownloadDepend f54810o;

    /* renamed from: p */
    private IDownloadMonitorDepend f54811p;

    /* renamed from: a */
    public final boolean mo54332a(long j) {
        this.f54806k.addAndGet(j);
        this.f54797b.increaseCurBytes(j);
        this.f54797b.updateRealDownloadTime(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        return m66824a(uptimeMillis, m66827b(uptimeMillis));
    }

    /* renamed from: c */
    public final void mo54334c() {
        mo54326a(-4, (BaseException) null);
    }

    /* renamed from: k */
    private void m66829k() {
        ExecutorService h = C20269b.m66749h();
        if (h != null) {
            h.execute(new Runnable() {
                public final void run() {
                    C20275e.this.f54798c.mo54071h(C20275e.this.f54797b.getId());
                    C20275e.this.mo54326a(1, (BaseException) null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo54325a() {
        if (!this.f54797b.canSkipStatusHandler()) {
            this.f54797b.setStatus(1);
            m66829k();
        }
    }

    /* renamed from: d */
    public final void mo54335d() {
        this.f54797b.setStatus(-2);
        try {
            this.f54798c.mo54064d(this.f54797b.getId(), this.f54797b.getCurBytes());
        } catch (SQLiteException unused) {
        }
        mo54326a(-2, (BaseException) null);
    }

    /* renamed from: e */
    public final void mo54336e() {
        this.f54797b.setStatus(-7);
        try {
            this.f54798c.mo54072i(this.f54797b.getId());
        } catch (SQLiteException unused) {
        }
        mo54326a(-7, (BaseException) null);
    }

    /* renamed from: i */
    public final void mo54340i() {
        this.f54797b.setStatus(8);
        this.f54797b.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_WAITING);
        C20295a q = C20269b.m66758q();
        if (q != null) {
            q.mo54484a(this.f54797b.getId(), 8);
        }
    }

    /* renamed from: j */
    private void m66828j() {
        if (this.f54800e != null) {
            this.f54797b = this.f54800e.getDownloadInfo();
            this.f54801f = this.f54800e.getDownloadListeners(ListenerType.MAIN);
            this.f54803h = this.f54800e.getDownloadListeners(ListenerType.NOTIFICATION);
            this.f54802g = this.f54800e.getDownloadListeners(ListenerType.SUB);
            this.f54810o = this.f54800e.getDepend();
            this.f54811p = this.f54800e.getMonitorDepend();
        }
    }

    /* renamed from: h */
    public final void mo54339h() {
        mo54326a(-3, (BaseException) null);
        this.f54798c.mo54059c(this.f54797b.getId(), this.f54797b.getTotalBytes());
        this.f54798c.mo54065d(this.f54797b.getId());
    }

    /* renamed from: g */
    public final void mo54338g() {
        try {
            Md5CheckStatus checkMd5Valid = this.f54797b.checkMd5Valid();
            if (checkMd5Valid != Md5CheckStatus.VALID) {
                String str = "";
                if (checkMd5Valid == Md5CheckStatus.INVALID_FILE_NO_EXIST) {
                    str = "md5 invalid because of file not exist";
                } else if (checkMd5Valid == Md5CheckStatus.INVALID_FILE_MD5_EMPTY) {
                    str = "md5 invalid because of file md5 is empty";
                } else if (checkMd5Valid == Md5CheckStatus.INVALID_MD5_NOT_EQUALS) {
                    str = "md5 invalid because of file md5 is not equals to task md5";
                }
                mo54328a(new BaseException(1034, str));
                C20359e.m67550a(this.f54797b);
                return;
            }
            this.f54797b.setFirstSuccess(false);
            mo54326a(-3, (BaseException) null);
            this.f54798c.mo54059c(this.f54797b.getId(), this.f54797b.getTotalBytes());
            this.f54798c.mo54065d(this.f54797b.getId());
        } catch (Throwable th) {
            mo54328a(new BaseException(1008, C20359e.m67575b(th, "onCompleted")));
        }
    }

    /* renamed from: b */
    public final void mo54333b() {
        if (this.f54797b.canSkipStatusHandler()) {
            this.f54797b.changeSkipStatus();
            return;
        }
        this.f54798c.mo54038a(this.f54797b.getId());
        if (this.f54797b.isFirstDownload()) {
            mo54326a(6, (BaseException) null);
        }
        mo54326a(2, (BaseException) null);
    }

    /* renamed from: f */
    public final void mo54337f() {
        this.f54797b.setFirstDownload(false);
        if (!this.f54797b.isIgnoreDataVerify() && this.f54797b.getCurBytes() != this.f54797b.getTotalBytes()) {
            this.f54797b.getErrorBytesLog();
            StringBuilder sb = new StringBuilder("current bytes is not equals to total bytes, bytes changed with process : ");
            sb.append(this.f54797b.getByteInvalidRetryStatus());
            mo54328a((BaseException) new DownloadRetryNeedlessException(1027, sb.toString()));
        } else if (this.f54797b.getCurBytes() <= 0) {
            this.f54797b.getErrorBytesLog();
            StringBuilder sb2 = new StringBuilder("curBytes is 0, bytes changed with process : ");
            sb2.append(this.f54797b.getByteInvalidRetryStatus());
            mo54328a((BaseException) new DownloadRetryNeedlessException(1026, sb2.toString()));
        } else if (this.f54797b.isIgnoreDataVerify() || this.f54797b.getTotalBytes() > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f54797b.getName());
            sb3.append(" onCompleted start save file as target name");
            IDownloadMonitorDepend iDownloadMonitorDepend = this.f54811p;
            if (this.f54800e != null) {
                iDownloadMonitorDepend = this.f54800e.getMonitorDepend();
            }
            if (this.f54797b.isNewSaveTempFileEnable()) {
                C20359e.m67551a(this.f54797b, iDownloadMonitorDepend, (C20207aa) new C20207aa() {
                    /* renamed from: a */
                    public final void mo54129a() {
                        C20275e.this.mo54338g();
                    }

                    /* renamed from: a */
                    public final void mo54130a(BaseException baseException) {
                        String str;
                        StringBuilder sb = new StringBuilder("saveFileAsTargetName onFailed : ");
                        if (baseException != null) {
                            str = baseException.getErrorMessage();
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        C20275e.this.mo54328a(baseException);
                    }
                });
            } else {
                C20359e.m67552a(this.f54797b, (C20207aa) new C20207aa() {
                    /* renamed from: a */
                    public final void mo54129a() {
                        C20275e.this.mo54338g();
                    }

                    /* renamed from: a */
                    public final void mo54130a(BaseException baseException) {
                        String str;
                        StringBuilder sb = new StringBuilder("saveFileAsTargetName onFailed : ");
                        if (baseException != null) {
                            str = baseException.getErrorMessage();
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        C20275e.this.mo54328a(baseException);
                    }
                });
            }
        } else {
            this.f54797b.getErrorBytesLog();
            StringBuilder sb4 = new StringBuilder("TotalBytes is 0, bytes changed with process : ");
            sb4.append(this.f54797b.getByteInvalidRetryStatus());
            mo54328a((BaseException) new DownloadRetryNeedlessException(1044, sb4.toString()));
        }
    }

    /* renamed from: a */
    public final void mo54328a(BaseException baseException) {
        this.f54797b.setFirstDownload(false);
        m66825b(baseException);
    }

    /* renamed from: b */
    private boolean m66827b(long j) {
        boolean z = true;
        if (!this.f54807l) {
            this.f54807l = true;
            return true;
        }
        long j2 = j - this.f54805j;
        if (this.f54806k.get() < this.f54809n && j2 < ((long) this.f54808m)) {
            z = false;
        }
        if (z) {
            this.f54805j = j;
            this.f54806k.set(0);
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0030 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66825b(com.p280ss.android.socialbase.downloader.exception.BaseException r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x001e
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x001e
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof android.database.sqlite.SQLiteFullException
            if (r0 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.downloader.j r0 = r4.f54798c     // Catch:{ SQLiteException -> 0x001c }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f54797b     // Catch:{ SQLiteException -> 0x001c }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x001c }
            r0.mo54069f(r1)     // Catch:{ SQLiteException -> 0x001c }
            goto L_0x003b
        L_0x001c:
            goto L_0x003b
        L_0x001e:
            com.ss.android.socialbase.downloader.downloader.j r0 = r4.f54798c     // Catch:{ SQLiteException -> 0x0030 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f54797b     // Catch:{ SQLiteException -> 0x0030 }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x0030 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r4.f54797b     // Catch:{ SQLiteException -> 0x0030 }
            long r2 = r2.getCurBytes()     // Catch:{ SQLiteException -> 0x0030 }
            r0.mo54053b(r1, r2)     // Catch:{ SQLiteException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            com.ss.android.socialbase.downloader.downloader.j r0 = r4.f54798c     // Catch:{ SQLiteException -> 0x001c }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f54797b     // Catch:{ SQLiteException -> 0x001c }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x001c }
            r0.mo54069f(r1)     // Catch:{ SQLiteException -> 0x001c }
        L_0x003b:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.f54797b
            r0.setFailedException(r5)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.f54797b
            int r0 = r0.getRetryScheduleMinutes()
            if (r0 <= 0) goto L_0x0051
            com.ss.android.socialbase.downloader.impls.r r0 = com.p280ss.android.socialbase.downloader.impls.C20327r.m67371a()
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f54797b
            r0.mo54528a(r1)
        L_0x0051:
            r0 = -1
            r4.mo54326a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20275e.m66825b(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    /* renamed from: a */
    public final void mo54331a(String str) throws BaseException {
        StringBuilder sb = new StringBuilder("onCompleteForFileExist existTargetFileName is ");
        sb.append(str);
        sb.append(" but curName is ");
        sb.append(this.f54797b.getName());
        if (C20356b.m67535a(16384)) {
            mo54326a(-3, (BaseException) null);
            this.f54798c.mo54051a(this.f54797b);
            C20359e.m67553a(this.f54797b, str);
            return;
        }
        this.f54798c.mo54051a(this.f54797b);
        C20359e.m67553a(this.f54797b, str);
        mo54326a(-3, (BaseException) null);
    }

    /* renamed from: a */
    public final void mo54326a(int i, BaseException baseException) {
        m66823a(i, baseException, true);
    }

    public C20275e(DownloadTask downloadTask, Handler handler) {
        this.f54800e = downloadTask;
        m66828j();
        this.f54799d = handler;
        this.f54798c = C20269b.m66754m();
    }

    /* renamed from: b */
    private void m66826b(BaseException baseException, boolean z) {
        int i;
        this.f54798c.mo54070g(this.f54797b.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        mo54326a(i, baseException);
    }

    /* renamed from: a */
    private boolean m66824a(long j, boolean z) {
        boolean z2 = false;
        if (this.f54797b.getCurBytes() == this.f54797b.getTotalBytes()) {
            try {
                this.f54798c.mo54040a(this.f54797b.getId(), this.f54797b.getCurBytes());
            } catch (Exception unused) {
            }
            return false;
        }
        if (this.f54804i) {
            this.f54804i = false;
            this.f54797b.setStatus(4);
        }
        if (this.f54797b.isNeedPostProgress() && z) {
            z2 = true;
        }
        m66823a(4, (BaseException) null, z2);
        return z;
    }

    /* renamed from: a */
    public final void mo54329a(BaseException baseException, boolean z) {
        this.f54797b.setFirstDownload(false);
        this.f54806k.set(0);
        m66826b(baseException, z);
    }

    /* renamed from: a */
    public final void mo54327a(long j, String str, String str2) {
        this.f54797b.setTotalBytes(j);
        this.f54797b.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f54797b.getName())) {
            this.f54797b.setName(str2);
        }
        try {
            this.f54798c.mo54041a(this.f54797b.getId(), j, str, str2);
        } catch (Exception unused) {
        }
        mo54326a(3, (BaseException) null);
        this.f54809n = this.f54797b.getMinByteIntervalForPostToMainThread(j);
        this.f54808m = this.f54797b.getMinProgressTimeMsInterval();
        this.f54804i = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059 A[Catch:{ Throwable -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66823a(int r8, com.p280ss.android.socialbase.downloader.exception.BaseException r9, boolean r10) {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            int r0 = r0.getStatus()
            r1 = -3
            if (r0 != r1) goto L_0x000d
            r2 = 4
            if (r8 != r2) goto L_0x000d
            return
        L_0x000d:
            r7.m66828j()
            boolean r2 = com.p280ss.android.socialbase.downloader.constants.C20195c.m66508d(r8)
            if (r2 == 0) goto L_0x001b
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54797b
            r2.updateDownloadTime()
        L_0x001b:
            boolean r2 = com.p280ss.android.socialbase.downloader.constants.C20195c.m66509e(r8)
            r3 = 0
            if (r2 == 0) goto L_0x0027
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54797b
            r2.updateRealDownloadTime(r3)
        L_0x0027:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r7.f54811p
            r4 = 1
            if (r2 == 0) goto L_0x004c
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r7.f54811p
            boolean r2 = r2 instanceof com.p280ss.android.socialbase.downloader.depend.C20212b
            if (r2 == 0) goto L_0x004c
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r7.f54811p
            com.ss.android.socialbase.downloader.depend.b r2 = (com.p280ss.android.socialbase.downloader.depend.C20212b) r2
            int[] r2 = r2.mo54136a()
            if (r2 == 0) goto L_0x004c
            int r5 = r2.length
            if (r5 <= 0) goto L_0x004c
            r5 = 0
        L_0x0040:
            int r6 = r2.length
            if (r5 >= r6) goto L_0x004c
            r6 = r2[r5]
            if (r8 != r6) goto L_0x0049
            r2 = 1
            goto L_0x004d
        L_0x0049:
            int r5 = r5 + 1
            goto L_0x0040
        L_0x004c:
            r2 = 0
        L_0x004d:
            boolean r5 = com.p280ss.android.socialbase.downloader.constants.C20195c.m66507c(r8)
            if (r5 != 0) goto L_0x0055
            if (r2 == 0) goto L_0x0067
        L_0x0055:
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r2 = r7.f54810o     // Catch:{ Throwable -> 0x0060 }
            if (r2 == 0) goto L_0x0060
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r2 = r7.f54810o     // Catch:{ Throwable -> 0x0060 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r7.f54797b     // Catch:{ Throwable -> 0x0060 }
            r2.monitorLogSend(r5, r9, r8)     // Catch:{ Throwable -> 0x0060 }
        L_0x0060:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r7.f54811p
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r7.f54797b
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r2, r5, r9, r8)
        L_0x0067:
            r2 = 6
            if (r8 != r2) goto L_0x0071
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54797b
            r5 = 2
            r2.setStatus(r5)
            goto L_0x007f
        L_0x0071:
            r2 = -6
            if (r8 != r2) goto L_0x007a
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54797b
            r2.setStatus(r1)
            goto L_0x007f
        L_0x007a:
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54797b
            r2.setStatus(r8)
        L_0x007f:
            if (r0 == r1) goto L_0x0084
            r1 = -1
            if (r0 != r1) goto L_0x00b7
        L_0x0084:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.RetryDelayStatus r0 = r0.getRetryDelayStatus()
            com.ss.android.socialbase.downloader.constants.RetryDelayStatus r1 = com.p280ss.android.socialbase.downloader.constants.RetryDelayStatus.DELAY_RETRY_DOWNLOADING
            if (r0 != r1) goto L_0x0095
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.RetryDelayStatus r1 = com.p280ss.android.socialbase.downloader.constants.RetryDelayStatus.DELAY_RETRY_DOWNLOADED
            r0.setRetryDelayStatus(r1)
        L_0x0095:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.AsyncHandleStatus r0 = r0.getAsyncHandleStatus()
            com.ss.android.socialbase.downloader.constants.AsyncHandleStatus r1 = com.p280ss.android.socialbase.downloader.constants.AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING
            if (r0 != r1) goto L_0x00a6
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.AsyncHandleStatus r1 = com.p280ss.android.socialbase.downloader.constants.AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADED
            r0.setAsyncHandleStatus(r1)
        L_0x00a6:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus r0 = r0.getByteInvalidRetryStatus()
            com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus r1 = com.p280ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING
            if (r0 != r1) goto L_0x00b7
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus r1 = com.p280ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADED
            r0.setByteInvalidRetryStatus(r1)
        L_0x00b7:
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r0 = r7.f54802g
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54797b
            com.p280ss.android.socialbase.downloader.utils.C20358d.m67537a(r8, r0, r4, r1, r9)
            r0 = -4
            if (r8 != r0) goto L_0x00c2
            return
        L_0x00c2:
            if (r10 == 0) goto L_0x00f8
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54801f
            if (r10 == 0) goto L_0x00d0
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54801f
            int r10 = r10.size()
            if (r10 > 0) goto L_0x00e4
        L_0x00d0:
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54803h
            if (r10 == 0) goto L_0x00f8
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54803h
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x00f8
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54797b
            boolean r10 = r10.canShowNotification()
            if (r10 == 0) goto L_0x00f8
        L_0x00e4:
            android.os.Handler r10 = r7.f54799d
            if (r10 == 0) goto L_0x00f8
            android.os.Handler r10 = r7.f54799d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54797b
            int r0 = r0.getId()
            android.os.Message r8 = r10.obtainMessage(r8, r0, r3, r9)
            r8.sendToTarget()
            return
        L_0x00f8:
            com.ss.android.socialbase.downloader.impls.a r9 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66758q()
            if (r9 == 0) goto L_0x0107
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54797b
            int r10 = r10.getId()
            r9.mo54484a(r10, r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20275e.m66823a(int, com.ss.android.socialbase.downloader.exception.BaseException, boolean):void");
    }

    /* renamed from: a */
    public final void mo54330a(DownloadChunk downloadChunk, BaseException baseException, boolean z) {
        int i;
        this.f54797b.setFirstDownload(false);
        this.f54806k.set(0);
        this.f54798c.mo54070g(this.f54797b.getId());
        if (z) {
            i = 10;
        } else {
            i = 9;
        }
        m66823a(i, baseException, true);
    }
}
