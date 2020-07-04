package com.p280ss.android.socialbase.downloader.p906d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.p280ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.p280ss.android.socialbase.downloader.constants.RunStatus;
import com.p280ss.android.socialbase.downloader.depend.C20240n;
import com.p280ss.android.socialbase.downloader.depend.C20249s;
import com.p280ss.android.socialbase.downloader.depend.C20250t;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20273d;
import com.p280ss.android.socialbase.downloader.downloader.C20275e;
import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.downloader.C20292q;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p280ss.android.socialbase.downloader.exception.DownloadOnlyWifiException;
import com.p280ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p280ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus;
import com.p280ss.android.socialbase.downloader.impls.C20295a;
import com.p280ss.android.socialbase.downloader.impls.C20326q;
import com.p280ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.p280ss.android.socialbase.downloader.model.C20340b;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk.C20333a;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20341a;
import com.p280ss.android.socialbase.downloader.network.C20344c;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.p905c.C20192a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20357c;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* renamed from: com.ss.android.socialbase.downloader.d.c */
public class C20198c implements C20203e, Runnable {

    /* renamed from: b */
    private static final String f54654b = "c";

    /* renamed from: A */
    private C20240n f54655A;

    /* renamed from: B */
    private volatile int f54656B = 5;

    /* renamed from: C */
    private boolean f54657C = false;

    /* renamed from: D */
    private boolean f54658D = false;

    /* renamed from: E */
    private String f54659E;

    /* renamed from: a */
    public final DownloadTask f54660a;

    /* renamed from: c */
    private volatile boolean f54661c;

    /* renamed from: d */
    private AtomicInteger f54662d;

    /* renamed from: e */
    private final ArrayList<C20197b> f54663e = new ArrayList<>();

    /* renamed from: f */
    private volatile C20273d f54664f;

    /* renamed from: g */
    private boolean f54665g;

    /* renamed from: h */
    private boolean f54666h;

    /* renamed from: i */
    private boolean f54667i;

    /* renamed from: j */
    private boolean f54668j;

    /* renamed from: k */
    private boolean f54669k;

    /* renamed from: l */
    private final AtomicBoolean f54670l;

    /* renamed from: m */
    private volatile RunStatus f54671m = RunStatus.RUN_STATUS_NONE;

    /* renamed from: n */
    private final C20285j f54672n;

    /* renamed from: o */
    private DownloadInfo f54673o;

    /* renamed from: p */
    private C20281h f54674p;

    /* renamed from: q */
    private final C20281h f54675q;

    /* renamed from: r */
    private C20280g f54676r;

    /* renamed from: s */
    private final C20280g f54677s;

    /* renamed from: t */
    private C20292q f54678t;

    /* renamed from: u */
    private final C20275e f54679u;

    /* renamed from: v */
    private AlarmManager f54680v;

    /* renamed from: w */
    private volatile BaseException f54681w;

    /* renamed from: x */
    private C20346e f54682x;

    /* renamed from: y */
    private C20344c f54683y;

    /* renamed from: z */
    private C20249s f54684z;

    /* renamed from: com.ss.android.socialbase.downloader.d.c$a */
    class C20201a extends Throwable {

        /* renamed from: b */
        private String f54689b;

        /* renamed from: a */
        public final String mo54112a() {
            return this.f54689b;
        }

        public C20201a(String str) {
            super(str);
            this.f54689b = str;
        }
    }

    /* renamed from: a */
    public final void mo54095a() {
        this.f54671m = RunStatus.RUN_STATUS_PAUSE;
        if (this.f54664f != null) {
            this.f54664f.mo54319a();
        } else {
            m66547n();
            this.f54671m = RunStatus.RUN_STATUS_PAUSE;
            m66544k();
        }
        try {
            Iterator it = ((ArrayList) this.f54663e.clone()).iterator();
            while (it.hasNext()) {
                C20197b bVar = (C20197b) it.next();
                if (bVar != null) {
                    bVar.mo54088a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m66533a(String str, List<HttpHeader> list) throws BaseException, C20201a {
        if (this.f54682x == null) {
            try {
                this.f54682x = C20269b.m66722a(this.f54673o.isNeedDefaultHttpServiceBackUp(), this.f54673o.getMaxBytes(), str, list);
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                mo54098a((C20344c) this.f54682x);
                throw th;
            }
            mo54098a((C20344c) this.f54682x);
            if (this.f54682x == null) {
                throw new BaseException(1022, (Throwable) new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:45|46|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ce */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66534a(java.util.List<com.p280ss.android.socialbase.downloader.model.DownloadChunk> r8, long r9) throws com.p280ss.android.socialbase.downloader.exception.BaseException {
        /*
            r7 = this;
            java.util.Iterator r8 = r8.iterator()
        L_0x0004:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r8.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r0
            if (r0 == 0) goto L_0x0004
            long r1 = r0.f54921c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            long r1 = r0.mo54553k()
            long r1 = r9 - r1
            goto L_0x002b
        L_0x0021:
            long r1 = r0.f54921c
            long r5 = r0.mo54553k()
            long r1 = r1 - r5
            r5 = 1
            long r1 = r1 + r5
        L_0x002b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0004
            r0.f54922d = r1
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54673o
            boolean r1 = r1.isNeedReuseFirstConnection()
            if (r1 == 0) goto L_0x006d
            com.ss.android.socialbase.downloader.network.e r1 = r7.f54682x
            if (r1 == 0) goto L_0x006d
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54673o
            boolean r1 = r1.isHeadConnectionAvailable()
            if (r1 == 0) goto L_0x0049
            boolean r1 = r7.f54658D
            if (r1 == 0) goto L_0x006d
        L_0x0049:
            int r1 = r0.f54923e
            if (r1 != 0) goto L_0x005c
            com.ss.android.socialbase.downloader.d.b r1 = new com.ss.android.socialbase.downloader.d.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54660a
            com.ss.android.socialbase.downloader.network.e r3 = r7.f54682x
            r1.<init>(r0, r2, r3, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r0 = r7.f54663e
            r0.add(r1)
            goto L_0x0004
        L_0x005c:
            int r1 = r0.f54923e
            if (r1 <= 0) goto L_0x0004
            com.ss.android.socialbase.downloader.d.b r1 = new com.ss.android.socialbase.downloader.d.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54660a
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r0 = r7.f54663e
            r0.add(r1)
            goto L_0x0004
        L_0x006d:
            com.ss.android.socialbase.downloader.d.b r1 = new com.ss.android.socialbase.downloader.d.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54660a
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r0 = r7.f54663e
            r0.add(r1)
            goto L_0x0004
        L_0x007a:
            r8 = 64
            boolean r8 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r8)
            if (r8 == 0) goto L_0x00f7
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r9 = r7.f54663e
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r9 = r7.f54663e
            java.util.Iterator r9 = r9.iterator()
        L_0x0093:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.d.b r10 = (com.p280ss.android.socialbase.downloader.p906d.C20197b) r10
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x00a9
            r10.mo54090b()
            goto L_0x0093
        L_0x00a9:
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x00b3
            r10.mo54088a()
            goto L_0x0093
        L_0x00b3:
            r8.add(r10)
            goto L_0x0093
        L_0x00b7:
            r9 = 0
            java.lang.Object r9 = r8.remove(r9)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            java.util.List r8 = com.p280ss.android.socialbase.downloader.impls.C20306e.m67146c(r8)     // Catch:{ Throwable -> 0x00f6 }
        L_0x00c2:
            if (r9 == 0) goto L_0x00d3
            boolean r10 = r7.m66550q()     // Catch:{ Throwable -> 0x00f6 }
            if (r10 == 0) goto L_0x00cb
            return
        L_0x00cb:
            r9.run()     // Catch:{ Throwable -> 0x00ce }
        L_0x00ce:
            java.lang.Runnable r9 = com.p280ss.android.socialbase.downloader.impls.C20306e.m67147d(r8)     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00c2
        L_0x00d3:
            boolean r9 = r8.isEmpty()     // Catch:{ Throwable -> 0x00f6 }
            if (r9 != 0) goto L_0x00f5
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Throwable -> 0x00f6 }
        L_0x00dd:
            boolean r9 = r8.hasNext()     // Catch:{ Throwable -> 0x00f6 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r8.next()     // Catch:{ Throwable -> 0x00f6 }
            java.util.concurrent.Future r9 = (java.util.concurrent.Future) r9     // Catch:{ Throwable -> 0x00f6 }
            if (r9 == 0) goto L_0x00dd
            boolean r10 = r9.isDone()     // Catch:{ Throwable -> 0x00f6 }
            if (r10 != 0) goto L_0x00dd
            r9.get()     // Catch:{ Throwable -> 0x00dd }
            goto L_0x00dd
        L_0x00f5:
            return
        L_0x00f6:
            return
        L_0x00f7:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r9 = r7.f54663e
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.d.b> r9 = r7.f54663e
            java.util.Iterator r9 = r9.iterator()
        L_0x0108:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0130
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.d.b r10 = (com.p280ss.android.socialbase.downloader.p906d.C20197b) r10
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x011e
            r10.mo54090b()
            goto L_0x0108
        L_0x011e:
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x0128
            r10.mo54088a()
            goto L_0x0108
        L_0x0128:
            java.util.concurrent.Callable r10 = java.util.concurrent.Executors.callable(r10)
            r8.add(r10)
            goto L_0x0108
        L_0x0130:
            boolean r9 = r7.m66550q()
            if (r9 == 0) goto L_0x0137
            return
        L_0x0137:
            com.p280ss.android.socialbase.downloader.impls.C20306e.m67145b(r8)     // Catch:{ InterruptedException -> 0x013b }
            return
        L_0x013b:
            r8 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r9 = new com.ss.android.socialbase.downloader.exception.BaseException
            r10 = 1020(0x3fc, float:1.43E-42)
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66534a(java.util.List, long):void");
    }

    /* renamed from: a */
    private void m66530a(DownloadChunk downloadChunk, C20346e eVar) throws BaseException {
        downloadChunk.f54922d = this.f54673o.getTotalBytes() - downloadChunk.mo54553k();
        this.f54673o.setChunkCount(1);
        this.f54672n.mo54039a(this.f54673o.getId(), 1);
        this.f54664f = new C20273d(this.f54673o, eVar, downloadChunk, this);
        m66548o();
    }

    /* renamed from: a */
    private boolean m66535a(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.f54668j || this.f54667i)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.f54673o.getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m66532a(String str, String str2) throws C20201a {
        this.f54672n.mo54065d(this.f54673o.getId());
        C20359e.m67550a(this.f54673o);
        this.f54666h = false;
        this.f54673o.resetDataForEtagEndure(str);
        this.f54672n.mo54051a(this.f54673o);
        throw new C20201a(str2);
    }

    /* renamed from: a */
    private void m66531a(C20344c cVar, long j, boolean z) throws BaseException, C20201a {
        long j2;
        if (cVar != null) {
            try {
                int b = cVar.mo20818b();
                this.f54667i = C20359e.m67558a(b, cVar.mo20817a("Accept-Ranges"));
                this.f54668j = C20359e.m67557a(b);
                String str = this.f54673o.geteTag();
                String a = cVar.mo20817a("Etag");
                if (m66535a(b, str, a)) {
                    if (cVar instanceof C20346e) {
                        if (!TextUtils.isEmpty(str) && str.equals(a)) {
                            a = "";
                        }
                        m66532a(a, "eTag of server file changed");
                    } else {
                        throw new DownloadHttpException(1002, b, "");
                    }
                }
                if (!this.f54667i) {
                    if (!this.f54668j) {
                        if (b == 403) {
                            throw new BaseException(1047, "response code error : 403");
                        }
                        StringBuilder sb = new StringBuilder("response code error : ");
                        sb.append(b);
                        throw new DownloadHttpException(LiveRoomStruct.ROOM_LONGTIME_NO_NET, b, sb.toString());
                    }
                }
                if (this.f54668j && j > 0) {
                    if (cVar instanceof C20346e) {
                        m66532a("", "http head request not support");
                    } else {
                        throw new BaseException((int) LiveRoomStruct.ROOM_LONGTIME_NO_NET, "isResponseFromBegin but firstOffset > 0");
                    }
                }
                long a2 = C20359e.m67538a(cVar);
                String str2 = "";
                if (TextUtils.isEmpty(this.f54673o.getName())) {
                    str2 = C20359e.m67542a(cVar, this.f54673o.getUrl());
                }
                if (C20356b.m67535a(8)) {
                    this.f54669k = C20359e.m67582b(cVar);
                } else {
                    this.f54669k = C20359e.m67560a(a2);
                }
                if (!this.f54669k && a2 == 0) {
                    if (!(cVar instanceof C20346e)) {
                        throw new BaseException((int) LiveRoomStruct.ROOM_LONGTIME_NO_NET, "");
                    }
                }
                if (!this.f54669k) {
                    String a3 = cVar.mo20817a("Content-Range");
                    j2 = (TextUtils.isEmpty(a3) || !C20356b.m67535a(2)) ? j + a2 : C20359e.m67539a(a3);
                } else {
                    j2 = -1;
                }
                if (!m66550q()) {
                    this.f54679u.mo54327a(j2, a, str2);
                }
            } catch (BaseException e) {
                throw e;
            } catch (C20201a e2) {
                throw e2;
            } catch (Throwable th) {
                C20359e.m67555a(th, "HandleFirstConnection");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54101a(BaseException baseException) {
        if (C20359e.m67580b(baseException)) {
            if (this.f54665g && !this.f54661c) {
                C20359e.m67550a(this.f54673o);
                this.f54661c = true;
            }
            return true;
        } else if (((this.f54662d == null || this.f54662d.get() <= 0) && !this.f54673o.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f54673o.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo54097a(BaseException baseException, boolean z) {
        this.f54671m = RunStatus.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.f54681w = baseException;
        m66521B();
        if (!(z ? m66539d(baseException) : false)) {
            m66520A();
        }
    }

    /* renamed from: a */
    public final void mo54099a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f54673o.setForbiddenBackupUrls(list, this.f54671m == RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER);
            C20295a q = C20269b.m66758q();
            if (q != null) {
                q.mo54505m(this.f54673o.getId());
            }
        }
    }

    /* renamed from: a */
    public final RetryCheckStatus mo54093a(DownloadChunk downloadChunk, BaseException baseException, long j) {
        if (m66549p()) {
            return RetryCheckStatus.RETURN;
        }
        if (baseException.getErrorCode() == 1047 || C20359e.m67591c((Throwable) baseException)) {
            return mo54092a(baseException, j);
        }
        this.f54681w = baseException;
        this.f54673o.increaseCurBytes(-j);
        this.f54672n.mo54051a(this.f54673o);
        if (m66539d(baseException)) {
            return RetryCheckStatus.RETURN;
        }
        this.f54679u.mo54330a(downloadChunk, baseException, this.f54671m == RunStatus.RUN_STATUS_RETRY_DELAY);
        if (this.f54671m != RunStatus.RUN_STATUS_RETRY_DELAY && this.f54673o.isNeedRetryDelay()) {
            long v = m66555v();
            if (v > 0) {
                String str = f54654b;
                StringBuilder sb = new StringBuilder("onSingleChunkRetry with delay time ");
                sb.append(v);
                C20190a.m66500a(str, sb.toString());
                try {
                    Thread.sleep(v);
                } catch (Throwable th) {
                    String str2 = f54654b;
                    StringBuilder sb2 = new StringBuilder("onSingleChunkRetry:");
                    sb2.append(th.getMessage());
                    C20190a.m66502b(str2, sb2.toString());
                }
            }
        }
        return RetryCheckStatus.CONTINUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if (m66539d(r8) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        return com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0108  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus mo54092a(com.p280ss.android.socialbase.downloader.exception.BaseException r8, long r9) {
        /*
            r7 = this;
            r7.f54681w = r8
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54673o
            long r9 = -r9
            r0.increaseCurBytes(r9)
            com.ss.android.socialbase.downloader.downloader.j r9 = r7.f54672n
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54673o
            r9.mo54051a(r10)
            boolean r9 = r7.m66549p()
            if (r9 == 0) goto L_0x0018
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x0018:
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0061
            int r0 = r8.getErrorCode()
            r1 = 1047(0x417, float:1.467E-42)
            if (r0 != r1) goto L_0x0061
            com.ss.android.socialbase.downloader.depend.s r0 = r7.f54684z
            if (r0 == 0) goto L_0x0058
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54673o
            boolean r0 = r0.isForbiddenRetryed()
            if (r0 == 0) goto L_0x0031
            goto L_0x0058
        L_0x0031:
            com.ss.android.socialbase.downloader.d.c$1 r0 = new com.ss.android.socialbase.downloader.d.c$1
            r0.<init>()
            com.ss.android.socialbase.downloader.depend.s r1 = r7.f54684z
            boolean r1 = r1.mo54192a(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54673o
            r2.setForbiddenRetryed()
            if (r1 == 0) goto L_0x00e6
            boolean r0 = r0.mo54128a()
            if (r0 != 0) goto L_0x00c7
            r7.m66521B()
            com.ss.android.socialbase.downloader.downloader.e r8 = r7.f54679u
            r8.mo54340i()
            com.ss.android.socialbase.downloader.constants.RunStatus r8 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER
            r7.f54671m = r8
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x0058:
            boolean r0 = r7.m66539d(r8)
            if (r0 == 0) goto L_0x00e6
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x0061:
            boolean r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67591c(r8)
            if (r0 == 0) goto L_0x00dd
            com.ss.android.socialbase.downloader.depend.n r0 = r7.f54655A
            if (r0 != 0) goto L_0x0071
            r7.mo54103b(r8)
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x0071:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r10)
            com.ss.android.socialbase.downloader.d.c$2 r6 = new com.ss.android.socialbase.downloader.d.c$2
            r6.<init>(r0)
            boolean r1 = r8 instanceof com.p280ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException
            if (r1 == 0) goto L_0x008b
            r1 = r8
            com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException r1 = (com.p280ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException) r1
            long r2 = r1.getAvaliableSpaceBytes()
            long r4 = r1.getRequiredSpaceBytes()
            goto L_0x0095
        L_0x008b:
            r1 = -1
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f54673o
            long r3 = r3.getTotalBytes()
            r4 = r3
            r2 = r1
        L_0x0095:
            monitor-enter(r7)
            com.ss.android.socialbase.downloader.depend.n r1 = r7.f54655A     // Catch:{ all -> 0x00da }
            boolean r1 = r1.mo51539a(r2, r4, r6)     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x00c9
            r7.m66553t()     // Catch:{ all -> 0x00da }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00bd
            com.ss.android.socialbase.downloader.constants.RunStatus r8 = r7.f54671m     // Catch:{ all -> 0x00da }
            com.ss.android.socialbase.downloader.constants.RunStatus r9 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00da }
            if (r8 == r9) goto L_0x00b9
            com.ss.android.socialbase.downloader.constants.RunStatus r8 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00da }
            r7.f54671m = r8     // Catch:{ all -> 0x00da }
            r7.m66521B()     // Catch:{ all -> 0x00da }
            com.ss.android.socialbase.downloader.downloader.e r8 = r7.f54679u     // Catch:{ all -> 0x00da }
            r8.mo54340i()     // Catch:{ all -> 0x00da }
        L_0x00b9:
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN     // Catch:{ all -> 0x00da }
            monitor-exit(r7)     // Catch:{ all -> 0x00da }
            return r8
        L_0x00bd:
            monitor-exit(r7)     // Catch:{ all -> 0x00da }
            boolean r0 = r7.m66539d(r8)
            if (r0 == 0) goto L_0x00c7
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x00c7:
            r0 = 1
            goto L_0x00e7
        L_0x00c9:
            com.ss.android.socialbase.downloader.constants.RunStatus r9 = r7.f54671m     // Catch:{ all -> 0x00da }
            com.ss.android.socialbase.downloader.constants.RunStatus r10 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00da }
            if (r9 != r10) goto L_0x00d3
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN     // Catch:{ all -> 0x00da }
            monitor-exit(r7)     // Catch:{ all -> 0x00da }
            return r8
        L_0x00d3:
            r7.mo54103b(r8)     // Catch:{ all -> 0x00da }
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN     // Catch:{ all -> 0x00da }
            monitor-exit(r7)     // Catch:{ all -> 0x00da }
            return r8
        L_0x00da:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00da }
            throw r8
        L_0x00dd:
            boolean r0 = r7.m66539d(r8)
            if (r0 == 0) goto L_0x00e6
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r7.m66522C()
            if (r0 == 0) goto L_0x00f2
            r7.m66521B()
        L_0x00f2:
            com.ss.android.socialbase.downloader.downloader.e r0 = r7.f54679u
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r2 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_RETRY_DELAY
            if (r1 != r2) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r9 = 0
        L_0x00fc:
            r0.mo54329a(r8, r9)
            com.ss.android.socialbase.downloader.constants.RunStatus r8 = r7.f54671m
            com.ss.android.socialbase.downloader.constants.RunStatus r9 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_RETRY_DELAY
            if (r8 != r9) goto L_0x0108
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN
            return r8
        L_0x0108:
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r8 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.CONTINUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.mo54092a(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.RetryCheckStatus");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.socialbase.downloader.model.DownloadChunk mo54094a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.f54673o     // Catch:{ all -> 0x0040 }
            int r0 = r0.getChunkCount()     // Catch:{ all -> 0x0040 }
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L_0x000d
            monitor-exit(r4)
            return r2
        L_0x000d:
            com.ss.android.socialbase.downloader.downloader.j r0 = r4.f54672n     // Catch:{ all -> 0x0040 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f54673o     // Catch:{ all -> 0x0040 }
            int r1 = r1.getId()     // Catch:{ all -> 0x0040 }
            java.util.List r0 = r0.mo54060c(r1)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            r1 = 0
        L_0x0023:
            int r3 = r0.size()     // Catch:{ all -> 0x0040 }
            if (r1 >= r3) goto L_0x003c
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0040 }
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r3     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x0039
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = r4.m66525a(r3, r5)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x0039
            monitor-exit(r4)
            return r3
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0023
        L_0x003c:
            monitor-exit(r4)
            return r2
        L_0x003e:
            monitor-exit(r4)
            return r2
        L_0x0040:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.mo54094a(int):com.ss.android.socialbase.downloader.model.DownloadChunk");
    }

    /* renamed from: a */
    public final void mo54098a(C20344c cVar) {
        if (cVar != null) {
            try {
                int b = cVar.mo20818b();
                this.f54673o.setHttpStatusCode(b);
                this.f54673o.setHttpStatusMessage(C20357c.m67536a(b));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: n */
    private void m66547n() {
        m66545l();
        m66546m();
    }

    /* renamed from: c */
    public final boolean mo54105c() {
        return this.f54670l.get();
    }

    /* renamed from: e */
    public final void mo54107e() {
        this.f54679u.mo54325a();
    }

    /* renamed from: l */
    private void m66545l() {
        if (this.f54683y != null) {
            this.f54683y.mo20819c();
            this.f54683y = null;
        }
    }

    /* renamed from: m */
    private void m66546m() {
        if (this.f54682x != null) {
            this.f54682x.mo20820d();
            this.f54682x = null;
        }
    }

    /* renamed from: d */
    public final int mo54106d() {
        if (this.f54673o != null) {
            return this.f54673o.getId();
        }
        return 0;
    }

    /* renamed from: p */
    private boolean m66549p() {
        if (this.f54671m == RunStatus.RUN_STATUS_CANCELED || this.f54671m == RunStatus.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private long m66555v() {
        return this.f54678t.mo54462a(this.f54673o.getCurRetryTimeInTotal(), this.f54673o.getTotalRetryCount());
    }

    /* renamed from: b */
    public final void mo54102b() {
        this.f54671m = RunStatus.RUN_STATUS_CANCELED;
        if (this.f54664f != null) {
            this.f54664f.mo54322b();
        } else {
            m66547n();
            this.f54671m = RunStatus.RUN_STATUS_CANCELED;
            m66544k();
        }
        m66521B();
    }

    /* renamed from: f */
    public final void mo54108f() {
        if (!m66550q()) {
            C20295a q = C20269b.m66758q();
            if (q != null) {
                q.mo54505m(this.f54673o.getId());
            }
        }
    }

    /* renamed from: A */
    private void m66520A() {
        try {
            this.f54672n.mo54065d(this.f54673o.getId());
            C20359e.m67550a(this.f54673o);
            this.f54666h = false;
            this.f54673o.resetDataForEtagEndure("");
            this.f54672n.mo54051a(this.f54673o);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: B */
    private void m66521B() {
        try {
            Iterator it = ((ArrayList) this.f54663e.clone()).iterator();
            while (it.hasNext()) {
                C20197b bVar = (C20197b) it.next();
                if (bVar != null) {
                    bVar.mo54090b();
                }
            }
        } catch (Throwable th) {
            String str = f54654b;
            StringBuilder sb = new StringBuilder("cancelAllChunkRunnable: ");
            sb.append(th.toString());
            C20190a.m66500a(str, sb.toString());
        }
    }

    /* renamed from: C */
    private boolean m66522C() {
        if (this.f54671m == RunStatus.RUN_STATUS_RETRY_DELAY || this.f54680v == null || !this.f54673o.isNeedRetryDelay() || m66555v() <= 0) {
            return false;
        }
        this.f54671m = RunStatus.RUN_STATUS_RETRY_DELAY;
        return true;
    }

    /* renamed from: g */
    private void m66540g() {
        if (this.f54673o != null) {
            int retryCount = this.f54673o.getRetryCount() - this.f54673o.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            if (this.f54662d == null) {
                this.f54662d = new AtomicInteger(retryCount);
            } else {
                this.f54662d.set(retryCount);
            }
        }
    }

    /* renamed from: h */
    private boolean m66541h() {
        int status = this.f54673o.getStatus();
        if (status == 1 || this.f54673o.canSkipStatusHandler()) {
            return true;
        }
        if (!(status == -2 || status == -4)) {
            StringBuilder sb = new StringBuilder("The download Task can't start, because its status is not prepare:");
            sb.append(status);
            mo54103b(new BaseException(1000, sb.toString()));
        }
        return false;
    }

    /* renamed from: o */
    private void m66548o() throws BaseException {
        if (this.f54664f != null) {
            if (this.f54671m == RunStatus.RUN_STATUS_CANCELED) {
                this.f54673o.setStatus(-4);
                this.f54664f.mo54322b();
            } else if (this.f54671m == RunStatus.RUN_STATUS_PAUSE) {
                this.f54673o.setStatus(-2);
                this.f54664f.mo54319a();
            } else {
                this.f54664f.mo54323c();
            }
        }
    }

    /* renamed from: q */
    private boolean m66550q() {
        if (!m66549p() && this.f54673o.getStatus() != -2) {
            return false;
        }
        if (!m66549p()) {
            if (this.f54673o.getStatus() == -2) {
                this.f54671m = RunStatus.RUN_STATUS_PAUSE;
            } else if (this.f54673o.getStatus() == -4) {
                this.f54671m = RunStatus.RUN_STATUS_CANCELED;
            }
        }
        return true;
    }

    /* renamed from: x */
    private boolean m66557x() {
        if (this.f54673o == null || ((this.f54666h && this.f54673o.getChunkCount() <= 1) || this.f54673o.isChunkDowngradeRetryUsed() || !this.f54667i || this.f54669k)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m66558y() throws DownloadRetryNeedlessException {
        if (this.f54673o.isOnlyWifi() && !C20359e.m67563a(C20269b.m66765x(), "android.permission.ACCESS_NETWORK_STATE")) {
            throw new DownloadRetryNeedlessException(1019, C1642a.m8034a("download task need permission:%s", new Object[]{"android.permission.ACCESS_NETWORK_STATE"}));
        } else if (!this.f54673o.isDownloadWithWifiValid()) {
            throw new DownloadOnlyWifiException();
        }
    }

    /* renamed from: k */
    private void m66544k() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (this.f54671m == RunStatus.RUN_STATUS_PAUSE || this.f54671m == RunStatus.RUN_STATUS_CANCELED) {
            z = false;
        } else {
            z = true;
        }
        try {
            z3 = m66551r();
            z2 = false;
        } catch (Exception e) {
            if (e instanceof BaseException) {
                this.f54679u.mo54328a((BaseException) e);
            } else {
                this.f54679u.mo54328a(new BaseException(1046, (Throwable) e));
            }
            z3 = true;
            z2 = true;
        }
        if (z3 || z2) {
            this.f54670l.set(false);
            if (z) {
                try {
                    C20295a q = C20269b.m66758q();
                    if (q != null) {
                        q.mo54488a(this);
                    }
                } catch (Throwable th) {
                    IDownloadMonitorDepend monitorDepend = this.f54660a.getMonitorDepend();
                    DownloadInfo downloadInfo = this.f54673o;
                    BaseException baseException = new BaseException(1014, C20359e.m67575b(th, "removeDownloadRunnable"));
                    if (this.f54673o != null) {
                        i = this.f54673o.getStatus();
                    }
                    C20192a.m66504a(monitorDepend, downloadInfo, baseException, i);
                }
            }
        } else {
            this.f54657C = true;
        }
    }

    /* renamed from: s */
    private boolean m66552s() {
        if (this.f54673o.getChunkCount() > 1) {
            List<DownloadChunk> c = this.f54672n.mo54060c(this.f54673o.getId());
            if (c == null || c.size() <= 1) {
                return false;
            }
            for (DownloadChunk downloadChunk : c) {
                if (downloadChunk != null) {
                    if (!downloadChunk.mo54550h()) {
                    }
                }
                return false;
            }
            return true;
        } else if (this.f54673o.getCurBytes() <= 0 || this.f54673o.getCurBytes() != this.f54673o.getTotalBytes()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: t */
    private boolean m66553t() {
        if (this.f54673o.isChunked()) {
            this.f54673o.setTotalBytes(this.f54673o.getCurBytes());
        }
        if (this.f54673o.getCurBytes() > 0 && (this.f54673o.isIgnoreDataVerify() || (this.f54673o.getTotalBytes() > 0 && this.f54673o.getCurBytes() == this.f54673o.getTotalBytes()))) {
            return true;
        }
        this.f54673o.setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f54673o.reset();
        this.f54672n.mo54051a(this.f54673o);
        this.f54672n.mo54065d(this.f54673o.getId());
        C20359e.m67550a(this.f54673o);
        return false;
    }

    /* renamed from: z */
    private void m66559z() throws BaseException {
        if (TextUtils.isEmpty(this.f54673o.getSavePath())) {
            throw new BaseException(1028, "download savePath can not be empty");
        } else if (!TextUtils.isEmpty(this.f54673o.getName())) {
            File file = new File(this.f54673o.getSavePath());
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    throw new BaseException((int) OnRunningErrorCallback.TYPE_SHOT_SCREEN, "download savePath directory can not created");
                }
            } else if (!file.isDirectory()) {
                throw new BaseException(1031, "download savePath is not a directory");
            }
        } else {
            throw new BaseException(1029, "download name can not be empty");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[SYNTHETIC, Splitter:B:34:0x0076] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66542i() throws com.p280ss.android.socialbase.downloader.exception.DownloadFileExistException {
        /*
            r6 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            int r0 = r0.getId()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            com.ss.android.socialbase.downloader.downloader.j r1 = r6.f54672n     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r1 == 0) goto L_0x007d
            r1 = 2048(0x800, float:2.87E-42)
            boolean r1 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r1)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r1 == 0) goto L_0x0017
            com.ss.android.socialbase.downloader.downloader.j r1 = r6.f54672n     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r1.mo54067e()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
        L_0x0017:
            com.ss.android.socialbase.downloader.downloader.j r1 = r6.f54672n     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r1.mo54052b(r0)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r2 = 1
            if (r1 == 0) goto L_0x006f
            boolean r3 = r1.isNewTask()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r3 == 0) goto L_0x0027
            goto L_0x006f
        L_0x0027:
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            java.lang.String r3 = r3.getSavePath()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            java.lang.String r4 = r4.getMd5()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r5.copyFromCacheData(r1, r2)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            java.lang.String r5 = r1.getSavePath()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            boolean r3 = r3.equals(r5)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r5 = 0
            if (r3 == 0) goto L_0x0054
            boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67566a(r1, r5, r4)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r3 != 0) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            com.ss.android.socialbase.downloader.exception.DownloadFileExistException r0 = new com.ss.android.socialbase.downloader.exception.DownloadFileExistException     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            java.lang.String r1 = r1.getName()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r0.<init>(r1)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            throw r0     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
        L_0x0054:
            int r3 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66719a(r1)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r3 == r0) goto L_0x0060
            com.ss.android.socialbase.downloader.downloader.j r3 = r6.f54672n     // Catch:{ SQLiteException -> 0x005f }
            r3.mo54069f(r0)     // Catch:{ SQLiteException -> 0x005f }
        L_0x005f:
            r5 = 1
        L_0x0060:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r0)     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r0 == 0) goto L_0x006d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            if (r1 == r0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r2 = r5
            goto L_0x0074
        L_0x006f:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r6.f54673o     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            r0.reset()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
        L_0x0074:
            if (r2 == 0) goto L_0x007d
            com.ss.android.socialbase.downloader.downloader.j r0 = r6.f54672n     // Catch:{ SQLiteException -> 0x007d }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r6.f54673o     // Catch:{ SQLiteException -> 0x007d }
            r0.mo54051a(r1)     // Catch:{ SQLiteException -> 0x007d }
        L_0x007d:
            r6.m66540g()     // Catch:{ DownloadFileExistException -> 0x00a9, Throwable -> 0x0081 }
            return
        L_0x0081:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r6.f54660a
            if (r1 == 0) goto L_0x00a8
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r6.f54673o
            if (r1 == 0) goto L_0x00a8
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r6.f54660a
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r1 = r1.getMonitorDepend()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r6.f54673o
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r5 = "checkTaskCache"
            java.lang.String r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67575b(r0, r5)
            r3.<init>(r4, r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r6.f54673o
            int r0 = r0.getStatus()
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r1, r2, r3, r0)
        L_0x00a8:
            return
        L_0x00a9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66542i():void");
    }

    /* renamed from: r */
    private boolean m66551r() {
        C20341a.m67488a().mo54900c();
        if (this.f54671m == RunStatus.RUN_STATUS_ERROR) {
            this.f54679u.mo54328a(this.f54681w);
        } else if (this.f54671m == RunStatus.RUN_STATUS_CANCELED) {
            this.f54679u.mo54334c();
        } else if (this.f54671m == RunStatus.RUN_STATUS_PAUSE) {
            this.f54679u.mo54335d();
        } else if (this.f54671m == RunStatus.RUN_STATUS_END_RIGHT_NOW) {
            this.f54679u.mo54339h();
        } else if (this.f54671m == RunStatus.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.f54679u.mo54331a(this.f54659E);
            } catch (BaseException e) {
                this.f54679u.mo54328a(e);
            }
        } else if (this.f54671m == RunStatus.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.f54679u.mo54329a(this.f54681w, false);
            return false;
        } else if (this.f54671m == RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        } else {
            if (this.f54671m != RunStatus.RUN_STATUS_RETRY_DELAY || m66552s()) {
                try {
                    if (!m66553t()) {
                        return false;
                    }
                    this.f54679u.mo54337f();
                } catch (Throwable th) {
                    mo54103b(new BaseException(1008, C20359e.m67575b(th, "doTaskStatusHandle onComplete")));
                }
            } else {
                m66554u();
                if (this.f54671m == RunStatus.RUN_STATUS_RETRY_DELAY) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    private void m66554u() {
        boolean z;
        long v = m66555v();
        try {
            Intent intent = new Intent("com.ss.android.downloader.action.DOWNLOAD_WAKEUP");
            intent.putExtra("extra_download_id", this.f54673o.getId());
            intent.setClass(C20269b.m66765x(), DownloadHandleService.class);
            if (VERSION.SDK_INT >= 19) {
                this.f54680v.setExact(2, SystemClock.elapsedRealtime() + v, PendingIntent.getService(C20269b.m66765x(), this.f54673o.getId(), intent, 1073741824));
            } else {
                this.f54680v.set(2, SystemClock.elapsedRealtime() + v, PendingIntent.getService(C20269b.m66765x(), this.f54673o.getId(), intent, 1073741824));
            }
        } catch (Throwable unused) {
        }
        this.f54671m = RunStatus.RUN_STATUS_RETRY_DELAY;
        this.f54673o.setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_WAITING);
        this.f54672n.mo54051a(this.f54673o);
        if (!z) {
            this.f54671m = RunStatus.RUN_STATUS_NONE;
            return;
        }
        this.f54671m = RunStatus.RUN_STATUS_RETRY_DELAY;
        this.f54673o.setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_WAITING);
        this.f54672n.mo54051a(this.f54673o);
    }

    /* renamed from: w */
    private void m66556w() throws C20201a, BaseException {
        int id = this.f54673o.getId();
        int a = C20269b.m66719a(this.f54673o);
        if (!this.f54673o.isDownloaded()) {
            DownloadInfo b = this.f54672n.mo54052b(a);
            if (b != null) {
                C20295a q = C20269b.m66758q();
                if (q != null && b.getId() != id && b.equalsTask(this.f54673o)) {
                    if (!q.mo54491a(b.getId())) {
                        List<DownloadChunk> c = this.f54672n.mo54060c(a);
                        C20359e.m67550a(this.f54673o);
                        this.f54672n.mo54069f(a);
                        if (b != null && b.isBreakpointAvailable()) {
                            this.f54673o.copyFromCacheData(b, false);
                            this.f54672n.mo54051a(this.f54673o);
                            if (c != null) {
                                for (DownloadChunk downloadChunk : c) {
                                    downloadChunk.f54919a = id;
                                    this.f54672n.mo54049a(downloadChunk);
                                }
                            }
                            throw new C20201a("retry task because id generator changed");
                        }
                        return;
                    }
                    this.f54672n.mo54069f(id);
                    throw new BaseException(1025, "another same task is downloading");
                }
                return;
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    public void run() {
        int i;
        Process.setThreadPriority(10);
        try {
            C20250t interceptor = this.f54660a.getInterceptor();
            if (interceptor != null && interceptor.mo54193a()) {
                this.f54679u.mo54336e();
                return;
            }
        } catch (Throwable unused) {
        }
        if (!m66541h()) {
            IDownloadMonitorDepend monitorDepend = this.f54660a.getMonitorDepend();
            DownloadInfo downloadInfo = this.f54673o;
            BaseException baseException = new BaseException(1003, "task status is invalid");
            if (this.f54673o != null) {
                i = this.f54673o.getStatus();
            } else {
                i = 0;
            }
            C20192a.m66504a(monitorDepend, downloadInfo, baseException, i);
            return;
        }
        while (true) {
            m66543j();
            if (!this.f54657C) {
                break;
            } else if (this.f54656B > 0) {
                this.f54656B--;
            } else if (this.f54673o.getCurBytes() != this.f54673o.getTotalBytes()) {
                this.f54673o.getErrorBytesLog();
                C20275e eVar = this.f54679u;
                StringBuilder sb = new StringBuilder("current bytes is not equals to total bytes, bytes invalid retry status is : ");
                sb.append(this.f54673o.getByteInvalidRetryStatus());
                eVar.mo54328a((BaseException) new DownloadRetryNeedlessException(1027, sb.toString()));
                return;
            } else if (this.f54673o.getCurBytes() <= 0) {
                this.f54673o.getErrorBytesLog();
                C20275e eVar2 = this.f54679u;
                StringBuilder sb2 = new StringBuilder("curBytes is 0, bytes invalid retry status is : ");
                sb2.append(this.f54673o.getByteInvalidRetryStatus());
                eVar2.mo54328a((BaseException) new DownloadRetryNeedlessException(1026, sb2.toString()));
                return;
            } else if (this.f54673o.getTotalBytes() <= 0) {
                this.f54673o.getErrorBytesLog();
                C20275e eVar3 = this.f54679u;
                StringBuilder sb3 = new StringBuilder("TotalBytes is 0, bytes invalid retry status is : ");
                sb3.append(this.f54673o.getByteInvalidRetryStatus());
                eVar3.mo54328a((BaseException) new DownloadRetryNeedlessException(1044, sb3.toString()));
                break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a8, code lost:
        new java.lang.StringBuilder("retry throwable for ").append(r2.mo54112a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ba, code lost:
        if (r12.f54671m != com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01bf, code lost:
        if (r12.f54662d == null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01c9, code lost:
        r12.f54673o.updateCurRetryTime(r12.f54662d.decrementAndGet());
        r12.f54673o.setStatus(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        m66547n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e0, code lost:
        if (r12.f54662d != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e8, code lost:
        if (r12.f54673o.trySwitchToNextBackupUrl() != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ea, code lost:
        r12.f54673o.setStatus(5);
        r12.f54662d.set(r12.f54673o.getRetryCount());
        r12.f54673o.updateCurRetryTime(r12.f54662d.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0206, code lost:
        mo54103b(new com.p280ss.android.socialbase.downloader.exception.BaseException(1018, com.C1642a.m8034a("retry for Throwable, but retry Time %s all used, last error is %s", new java.lang.Object[]{java.lang.String.valueOf(r12.f54673o.getRetryCount()), r2.mo54112a()})));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x022d, code lost:
        r3 = new java.lang.StringBuilder("retry for Throwable, but retain retry time is NULL, last error is");
        r3.append(r2.mo54112a());
        mo54103b(new com.p280ss.android.socialbase.downloader.exception.BaseException(1043, r3.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x024b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0250, code lost:
        if (r12.f54671m != com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0258, code lost:
        if (r4.getErrorCode() == 1025) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0260, code lost:
        if (r4.getErrorCode() == 1009) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0267, code lost:
        if (mo54101a(r4) != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026d, code lost:
        if (com.p280ss.android.socialbase.downloader.utils.C20359e.m67564a(r4) != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x026f, code lost:
        m66520A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0278, code lost:
        if (mo54092a(r4, 0) == com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        m66547n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x027d, code lost:
        m66544k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0280, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        mo54103b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0286, code lost:
        r12.f54671m = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_END_RIGHT_NOW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        m66547n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x028d, code lost:
        m66544k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0290, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r12.f54673o.setHeadConnectionException(com.p280ss.android.socialbase.downloader.utils.C20359e.m67597e(r10));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0100 */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a7 A[Catch:{ all -> 0x0192, DownloadFileExistException -> 0x0015, all -> 0x0299 }, ExcHandler: a (r2v5 'e' com.ss.android.socialbase.downloader.d.c$a A[CUSTOM_DECLARE, Catch:{ all -> 0x0192, DownloadFileExistException -> 0x0015, all -> 0x0299 }]), Splitter:B:33:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x024b A[Catch:{ all -> 0x0192, DownloadFileExistException -> 0x0015, all -> 0x0299 }, ExcHandler: BaseException (r4v0 'e' com.ss.android.socialbase.downloader.exception.BaseException A[CUSTOM_DECLARE, Catch:{ all -> 0x0192, DownloadFileExistException -> 0x0015, all -> 0x0299 }]), Splitter:B:33:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f1 A[Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa A[SYNTHETIC, Splitter:B:65:0x00fa] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0110 A[SYNTHETIC, Splitter:B:71:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0117 A[SYNTHETIC, Splitter:B:75:0x0117] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66543j() {
        /*
            r12 = this;
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_NONE     // Catch:{ all -> 0x0299 }
            r12.f54671m = r0     // Catch:{ all -> 0x0299 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r12.f54673o     // Catch:{ all -> 0x0299 }
            r0.updateStartDownloadTime()     // Catch:{ all -> 0x0299 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r12.f54673o     // Catch:{ all -> 0x0299 }
            r0.resetRealStartDownloadTime()     // Catch:{ all -> 0x0299 }
            r0 = 0
            r1 = 1
            r12.m66542i()     // Catch:{ DownloadFileExistException -> 0x0015 }
            r2 = 0
            goto L_0x002b
        L_0x0015:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = "file exist "
            r3.<init>(r4)     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = r2.getExistTargetFileName()     // Catch:{ all -> 0x0299 }
            r3.append(r4)     // Catch:{ all -> 0x0299 }
            java.lang.String r2 = r2.getExistTargetFileName()     // Catch:{ all -> 0x0299 }
            r12.f54659E = r2     // Catch:{ all -> 0x0299 }
            r2 = 1
        L_0x002b:
            boolean r3 = r12.f54657C     // Catch:{ all -> 0x0299 }
            if (r3 != 0) goto L_0x0034
            com.ss.android.socialbase.downloader.downloader.e r3 = r12.f54679u     // Catch:{ all -> 0x0299 }
            r3.mo54333b()     // Catch:{ all -> 0x0299 }
        L_0x0034:
            r12.f54657C = r0     // Catch:{ all -> 0x0299 }
            boolean r3 = r12.m66550q()     // Catch:{ all -> 0x0299 }
            if (r3 == 0) goto L_0x0040
            r12.m66544k()
            return
        L_0x0040:
            java.lang.String r3 = r12.f54659E     // Catch:{ all -> 0x0299 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0299 }
            if (r3 != 0) goto L_0x0065
            if (r2 == 0) goto L_0x0065
            java.lang.String r0 = r12.f54659E     // Catch:{ all -> 0x0299 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r12.f54673o     // Catch:{ all -> 0x0299 }
            java.lang.String r1 = r1.getTargetFilePath()     // Catch:{ all -> 0x0299 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x005d
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x0299 }
            r12.f54671m = r0     // Catch:{ all -> 0x0299 }
            goto L_0x0061
        L_0x005d:
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_END_FOR_FILE_EXIST     // Catch:{ all -> 0x0299 }
            r12.f54671m = r0     // Catch:{ all -> 0x0299 }
        L_0x0061:
            r12.m66544k()
            return
        L_0x0065:
            com.ss.android.socialbase.downloader.network.a r2 = com.p280ss.android.socialbase.downloader.network.C20341a.m67488a()     // Catch:{ all -> 0x0299 }
            r2.mo54899b()     // Catch:{ all -> 0x0299 }
        L_0x006c:
            boolean r2 = r12.m66550q()     // Catch:{ all -> 0x0299 }
            if (r2 == 0) goto L_0x0076
            r12.m66544k()
            return
        L_0x0076:
            r2 = 0
            r12.m66559z()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66556w()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66558y()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.downloader.j r4 = r12.f54672n     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            int r5 = r5.getId()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.util.List r4 = r4.mo54060c(r5)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66538c(r4)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.lang.String r5 = r5.getConnectionUrl()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r6 = r12.m66550q()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r6 == 0) goto L_0x00a3
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x00a3:
            boolean r6 = r12.f54666h     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r6 == 0) goto L_0x00c7
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            int r6 = r6.getChunkCount()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r6 != r1) goto L_0x00b6
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            long r6 = r6.getCurBytes()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            goto L_0x00c8
        L_0x00b6:
            if (r4 == 0) goto L_0x00c7
            int r6 = r4.size()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r6 <= r1) goto L_0x00c7
            long r6 = r12.m66536b(r4)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r6 = r2
        L_0x00c8:
            com.ss.android.socialbase.downloader.model.DownloadChunk r8 = r12.m66537b(r6)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.util.List r9 = r12.m66526a(r8)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r10 = r12.f54658D     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r10 != 0) goto L_0x00ed
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r10 = r10.isHeadConnectionAvailable()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r10 == 0) goto L_0x00ed
            com.ss.android.socialbase.downloader.network.c r10 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66721a(r5, r9)     // Catch:{ Throwable -> 0x00e3, BaseException -> 0x024b, a -> 0x01a7 }
            r12.f54683y = r10     // Catch:{ Throwable -> 0x00e3, BaseException -> 0x024b, a -> 0x01a7 }
            goto L_0x00ed
        L_0x00e3:
            r10 = move-exception
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.lang.String r10 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67597e(r10)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r11.setHeadConnectionException(r10)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
        L_0x00ed:
            com.ss.android.socialbase.downloader.network.c r10 = r12.f54683y     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r10 != 0) goto L_0x00fa
            r12.m66533a(r5, r9)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.network.e r10 = r12.f54682x     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66531a(r10, r6, r0)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            goto L_0x010a
        L_0x00fa:
            com.ss.android.socialbase.downloader.network.c r10 = r12.f54683y     // Catch:{ Throwable -> 0x0100, BaseException -> 0x024b, a -> 0x01a7 }
            r12.m66531a(r10, r6, r1)     // Catch:{ Throwable -> 0x0100, BaseException -> 0x024b, a -> 0x01a7 }
            goto L_0x010a
        L_0x0100:
            r12.f54658D = r1     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66533a(r5, r9)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.network.e r10 = r12.f54682x     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66531a(r10, r6, r0)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
        L_0x010a:
            boolean r6 = r12.m66550q()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r6 == 0) goto L_0x0117
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x0117:
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            long r6 = r6.getTotalBytes()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.lang.String r10 = r10.getTempPath()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            java.lang.String r11 = r11.getTempName()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            m66529a(r6, r10, r11)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            int r10 = r12.m66523a(r6, r4)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r11 = r12.m66550q()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r11 == 0) goto L_0x013d
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x013d:
            if (r10 <= 0) goto L_0x0188
            if (r10 != r1) goto L_0x0143
            r11 = 1
            goto L_0x0144
        L_0x0143:
            r11 = 0
        L_0x0144:
            r12.f54665g = r11     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r11 = r12.f54665g     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r11 == 0) goto L_0x0160
            r12.m66533a(r5, r9)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r4 = r12.m66550q()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r4 == 0) goto L_0x015a
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x015a:
            com.ss.android.socialbase.downloader.network.e r4 = r12.f54682x     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r12.m66530a(r8, r4)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            goto L_0x0183
        L_0x0160:
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r12.f54673o     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            boolean r5 = r5.isNeedReuseFirstConnection()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r5 != 0) goto L_0x016b
            r12.m66546m()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
        L_0x016b:
            boolean r5 = r12.m66550q()     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r5 == 0) goto L_0x0178
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x0178:
            boolean r5 = r12.f54666h     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            if (r5 == 0) goto L_0x0180
            r12.m66527a(r10, r4)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            goto L_0x0183
        L_0x0180:
            r12.m66528a(r6, r10)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
        L_0x0183:
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            goto L_0x0291
        L_0x0188:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            r5 = 1032(0x408, float:1.446E-42)
            java.lang.String r6 = "chunkCount is 0"
            r4.<init>(r5, r6)     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
            throw r4     // Catch:{ BaseException -> 0x024b, a -> 0x01a7, Throwable -> 0x0195 }
        L_0x0192:
            r0 = move-exception
            goto L_0x0295
        L_0x0195:
            r0 = move-exception
            com.ss.android.socialbase.downloader.constants.RunStatus r1 = r12.f54671m     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.constants.RunStatus r2 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE     // Catch:{ all -> 0x0192 }
            if (r1 == r2) goto L_0x0183
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0192 }
            r2 = 1045(0x415, float:1.464E-42)
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0192 }
            r12.mo54103b(r1)     // Catch:{ all -> 0x0192 }
            goto L_0x0183
        L_0x01a7:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = "retry throwable for "
            r3.<init>(r4)     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = r2.mo54112a()     // Catch:{ all -> 0x0192 }
            r3.append(r4)     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.constants.RunStatus r3 = r12.f54671m     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.constants.RunStatus r4 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE     // Catch:{ all -> 0x0192 }
            if (r3 == r4) goto L_0x0183
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f54662d     // Catch:{ all -> 0x0192 }
            r4 = 5
            if (r3 == 0) goto L_0x01de
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f54662d     // Catch:{ all -> 0x0192 }
            int r3 = r3.get()     // Catch:{ all -> 0x0192 }
            if (r3 <= 0) goto L_0x01de
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r12.f54673o     // Catch:{ all -> 0x0192 }
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f54662d     // Catch:{ all -> 0x0192 }
            int r3 = r3.decrementAndGet()     // Catch:{ all -> 0x0192 }
            r2.updateCurRetryTime(r3)     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r12.f54673o     // Catch:{ all -> 0x0192 }
            r2.setStatus(r4)     // Catch:{ all -> 0x0192 }
        L_0x01d9:
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            goto L_0x006c
        L_0x01de:
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f54662d     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x022d
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r12.f54673o     // Catch:{ all -> 0x0192 }
            boolean r3 = r3.trySwitchToNextBackupUrl()     // Catch:{ all -> 0x0192 }
            if (r3 == 0) goto L_0x0206
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r12.f54673o     // Catch:{ all -> 0x0192 }
            r2.setStatus(r4)     // Catch:{ all -> 0x0192 }
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f54662d     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r12.f54673o     // Catch:{ all -> 0x0192 }
            int r3 = r3.getRetryCount()     // Catch:{ all -> 0x0192 }
            r2.set(r3)     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r12.f54673o     // Catch:{ all -> 0x0192 }
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f54662d     // Catch:{ all -> 0x0192 }
            int r3 = r3.get()     // Catch:{ all -> 0x0192 }
            r2.updateCurRetryTime(r3)     // Catch:{ all -> 0x0192 }
            goto L_0x01d9
        L_0x0206:
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0192 }
            r4 = 1018(0x3fa, float:1.427E-42)
            java.lang.String r5 = "retry for Throwable, but retry Time %s all used, last error is %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r12.f54673o     // Catch:{ all -> 0x0192 }
            int r7 = r7.getRetryCount()     // Catch:{ all -> 0x0192 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0192 }
            r6[r0] = r7     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = r2.mo54112a()     // Catch:{ all -> 0x0192 }
            r6[r1] = r0     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = com.C1642a.m8034a(r5, r6)     // Catch:{ all -> 0x0192 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0192 }
            r12.mo54103b(r3)     // Catch:{ all -> 0x0192 }
            goto L_0x0183
        L_0x022d:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0192 }
            r1 = 1043(0x413, float:1.462E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = "retry for Throwable, but retain retry time is NULL, last error is"
            r3.<init>(r4)     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = r2.mo54112a()     // Catch:{ all -> 0x0192 }
            r3.append(r2)     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0192 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0192 }
            r12.mo54103b(r0)     // Catch:{ all -> 0x0192 }
            goto L_0x0183
        L_0x024b:
            r4 = move-exception
            com.ss.android.socialbase.downloader.constants.RunStatus r5 = r12.f54671m     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.constants.RunStatus r6 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_PAUSE     // Catch:{ all -> 0x0192 }
            if (r5 == r6) goto L_0x0183
            int r5 = r4.getErrorCode()     // Catch:{ all -> 0x0192 }
            r6 = 1025(0x401, float:1.436E-42)
            if (r5 == r6) goto L_0x0286
            int r5 = r4.getErrorCode()     // Catch:{ all -> 0x0192 }
            r6 = 1009(0x3f1, float:1.414E-42)
            if (r5 != r6) goto L_0x0263
            goto L_0x0286
        L_0x0263:
            boolean r5 = r12.mo54101a(r4)     // Catch:{ all -> 0x0192 }
            if (r5 == 0) goto L_0x0281
            boolean r5 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67564a(r4)     // Catch:{ all -> 0x0192 }
            if (r5 == 0) goto L_0x0272
            r12.m66520A()     // Catch:{ all -> 0x0192 }
        L_0x0272:
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r2 = r12.mo54092a(r4, r2)     // Catch:{ all -> 0x0192 }
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r3 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN     // Catch:{ all -> 0x0192 }
            if (r2 != r3) goto L_0x01d9
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x0281:
            r12.mo54103b(r4)     // Catch:{ all -> 0x0192 }
            goto L_0x0183
        L_0x0286:
            com.ss.android.socialbase.downloader.constants.RunStatus r0 = com.p280ss.android.socialbase.downloader.constants.RunStatus.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x0192 }
            r12.f54671m = r0     // Catch:{ all -> 0x0192 }
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            r12.m66544k()
            return
        L_0x0291:
            r12.m66544k()
            return
        L_0x0295:
            r12.m66547n()     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x0299:
            r0 = move-exception
            r12.m66544k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66543j():void");
    }

    /* renamed from: a */
    public final boolean mo54100a(long j) {
        return this.f54679u.mo54332a(j);
    }

    /* renamed from: a */
    public final void mo54096a(C20197b bVar) {
        if (!this.f54665g) {
            synchronized (this) {
                this.f54663e.remove(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo54104c(BaseException baseException) {
        if (this.f54673o != null) {
            this.f54673o.setChunkDowngradeRetryUsed(true);
        }
        mo54097a(baseException, false);
    }

    /* renamed from: a */
    private List<HttpHeader> m66526a(DownloadChunk downloadChunk) {
        return C20359e.m67548a(this.f54673o.getExtraHeaders(), this.f54673o.geteTag(), downloadChunk);
    }

    /* renamed from: a */
    private static C20292q m66524a(DownloadTask downloadTask) {
        C20292q retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator != null) {
            return retryDelayTimeCalculator;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
            if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                return new C20326q(retryDelayTimeArray);
            }
        }
        return C20269b.m66764w();
    }

    /* renamed from: b */
    private DownloadChunk m66537b(long j) {
        return new C20333a(this.f54673o.getId()).mo54558a(-1).mo54559a(0).mo54565e(j).mo54562b(j).mo54563c(0).mo54564d(this.f54673o.getTotalBytes() - j).mo54561a();
    }

    /* renamed from: b */
    private long m66536b(List<DownloadChunk> list) {
        if (!this.f54666h || list == null || list.isEmpty()) {
            return -1;
        }
        long j = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && ((downloadChunk.mo54553k() <= downloadChunk.f54921c || downloadChunk.f54921c == 0) && (j == -1 || j > downloadChunk.mo54553k()))) {
                j = downloadChunk.mo54553k();
            }
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66538c(java.util.List<com.p280ss.android.socialbase.downloader.model.DownloadChunk> r8) {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54673o
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54673o
            int r0 = r0.getChunkCount()
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r7.f54673o
            boolean r4 = r4.isBreakpointAvailable()
            r5 = 0
            if (r4 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x0032
            int r3 = r8.size()
            if (r0 != r3) goto L_0x0032
            long r3 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67571b(r8)
            goto L_0x0033
        L_0x002b:
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r7.f54673o
            long r3 = r8.getCurBytes()
            goto L_0x0033
        L_0x0032:
            r3 = r5
        L_0x0033:
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r7.f54673o
            r8.setCurBytes(r3)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            r7.f54666h = r1
            boolean r8 = r7.f54666h
            if (r8 != 0) goto L_0x0053
            com.ss.android.socialbase.downloader.downloader.j r8 = r7.f54672n
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54673o
            int r0 = r0.getId()
            r8.mo54065d(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r7.f54673o
            com.p280ss.android.socialbase.downloader.utils.C20359e.m67550a(r8)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66538c(java.util.List):void");
    }

    /* renamed from: d */
    private boolean m66539d(BaseException baseException) {
        boolean z = true;
        if (this.f54662d != null) {
            if (this.f54662d.get() <= 0) {
                if (this.f54673o.trySwitchToNextBackupUrl()) {
                    this.f54662d.set(this.f54673o.getBackUpUrlRetryCount());
                    this.f54673o.updateCurRetryTime(this.f54662d.get());
                } else if (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f54673o.canReplaceHttpForRetry())) {
                    mo54103b(new BaseException(baseException.getErrorCode(), C1642a.m8034a("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", new Object[]{String.valueOf(this.f54662d), String.valueOf(this.f54673o.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                } else {
                    this.f54662d.set(this.f54673o.getRetryCount());
                    this.f54673o.updateCurRetryTime(this.f54662d.get());
                    this.f54673o.setHttpsToHttpRetryUsed(true);
                }
                z = false;
            }
            if (this.f54671m != RunStatus.RUN_STATUS_RETRY_DELAY && z) {
                this.f54673o.updateCurRetryTime(this.f54662d.decrementAndGet());
            }
            return false;
        }
        StringBuilder sb = new StringBuilder("retry for exception, but retain retry time is null, last error is :");
        sb.append(baseException.getErrorMessage());
        mo54103b(new BaseException(1043, sb.toString()));
        return true;
    }

    /* renamed from: b */
    public final void mo54103b(BaseException baseException) {
        new StringBuilder("onError:").append(baseException.getMessage());
        this.f54671m = RunStatus.RUN_STATUS_ERROR;
        this.f54681w = baseException;
        m66521B();
    }

    public C20198c(DownloadTask downloadTask, Handler handler) {
        this.f54660a = downloadTask;
        if (downloadTask != null) {
            this.f54673o = downloadTask.getDownloadInfo();
            this.f54674p = downloadTask.getChunkStrategy();
            this.f54676r = downloadTask.getChunkAdjustCalculator();
            this.f54684z = downloadTask.getForbiddenHandler();
            this.f54655A = downloadTask.getDiskSpaceHandler();
            this.f54678t = m66524a(downloadTask);
        }
        m66540g();
        this.f54672n = C20269b.m66754m();
        this.f54675q = C20269b.m66761t();
        this.f54677s = C20269b.m66763v();
        this.f54679u = new C20275e(downloadTask, handler);
        this.f54680v = C20269b.m66746e();
        this.f54670l = new AtomicBoolean(true);
    }

    /* renamed from: a */
    private void m66527a(int i, List<DownloadChunk> list) throws BaseException {
        if (list.size() == i) {
            m66534a(list, this.f54673o.getTotalBytes());
            return;
        }
        throw new BaseException(1033, (Throwable) new IllegalArgumentException());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r9 <= 0) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m66523a(long r7, java.util.List<com.p280ss.android.socialbase.downloader.model.DownloadChunk> r9) {
        /*
            r6 = this;
            boolean r0 = r6.m66557x()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.f54666h
            if (r0 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x0013
            int r9 = r9.size()
            goto L_0x005a
        L_0x0013:
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r6.f54673o
            int r9 = r9.getChunkCount()
            goto L_0x005a
        L_0x001a:
            com.ss.android.socialbase.downloader.downloader.h r9 = r6.f54674p
            if (r9 == 0) goto L_0x0025
            com.ss.android.socialbase.downloader.downloader.h r9 = r6.f54674p
            int r9 = r9.mo51487a(r7)
            goto L_0x002b
        L_0x0025:
            com.ss.android.socialbase.downloader.downloader.h r9 = r6.f54675q
            int r9 = r9.mo51487a(r7)
        L_0x002b:
            com.ss.android.socialbase.downloader.network.g r0 = com.p280ss.android.socialbase.downloader.network.C20348g.m67505a()
            com.ss.android.socialbase.downloader.network.NetworkQuality r0 = r0.mo54907b()
            java.lang.String r3 = "NetworkQuality is : %s"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r0.name()
            r4[r1] = r5
            com.C1642a.m8034a(r3, r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r6.f54673o
            java.lang.String r4 = r0.name()
            r3.setNetworkQuality(r4)
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.f54676r
            if (r3 == 0) goto L_0x0054
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.f54676r
            int r9 = r3.mo51549a(r9, r0)
            goto L_0x005a
        L_0x0054:
            com.ss.android.socialbase.downloader.downloader.g r3 = r6.f54677s
            int r9 = r3.mo51549a(r9, r0)
        L_0x005a:
            if (r9 > 0) goto L_0x005d
        L_0x005c:
            r9 = 1
        L_0x005d:
            boolean r0 = com.p280ss.android.socialbase.downloader.p904b.C20190a.m66501a()
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "chunk count : %s for %s contentLen:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r3[r1] = r4
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r6.f54673o
            java.lang.String r1 = r1.getName()
            r3[r2] = r1
            r1 = 2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3[r1] = r7
            com.C1642a.m8034a(r0, r3)
        L_0x0080:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66523a(long, java.util.List):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r9.mo54548f() != false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p280ss.android.socialbase.downloader.model.DownloadChunk m66525a(com.p280ss.android.socialbase.downloader.model.DownloadChunk r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r9.mo54545d()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 1
            long r2 = r9.mo54543b(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "reuseChunk retainLen:"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = " chunkIndex:"
            r4.append(r5)
            r4.append(r10)
            r4 = 0
            boolean r5 = r9.mo54548f()
            if (r5 != 0) goto L_0x005c
            long r5 = com.p280ss.android.socialbase.downloader.constants.C20194b.f54636a
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005c
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r8.f54673o
            boolean r2 = r2.isNeedReuseChunkRunnable()
            if (r2 == 0) goto L_0x005c
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r8.f54673o
            int r2 = r2.getChunkCount()
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r8.f54673o
            long r3 = r3.getTotalBytes()
            java.util.List r2 = r9.mo54536a(r2, r3)
            if (r2 == 0) goto L_0x0062
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r3
            com.ss.android.socialbase.downloader.downloader.j r4 = r8.f54672n
            r4.mo54057b(r3)
            goto L_0x004a
        L_0x005c:
            boolean r2 = r9.mo54548f()
            if (r2 == 0) goto L_0x0063
        L_0x0062:
            r4 = 1
        L_0x0063:
            if (r4 == 0) goto L_0x00fe
            boolean r2 = r9.mo54548f()
            if (r2 == 0) goto L_0x00fe
            r2 = 1
        L_0x006c:
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk> r3 = r9.f54925g
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x00bf
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk> r3 = r9.f54925g
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = (com.p280ss.android.socialbase.downloader.model.DownloadChunk) r3
            if (r3 == 0) goto L_0x00bc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "check can checkUnCompletedChunk -- chunkIndex:"
            r4.<init>(r5)
            int r5 = r3.f54923e
            r4.append(r5)
            java.lang.String r5 = " currentOffset:"
            r4.append(r5)
            long r5 = r3.mo54553k()
            r4.append(r5)
            java.lang.String r5 = "  startOffset:"
            r4.append(r5)
            long r5 = r3.f54920b
            r4.append(r5)
            java.lang.String r5 = " contentLen:"
            r4.append(r5)
            long r5 = r3.f54922d
            r4.append(r5)
            int r4 = r3.f54923e
            if (r4 < 0) goto L_0x00ba
            boolean r4 = r3.mo54550h()
            if (r4 != 0) goto L_0x00bc
            boolean r4 = r3.mo54544c()
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            r1 = r3
            goto L_0x00bf
        L_0x00bc:
            int r2 = r2 + 1
            goto L_0x006c
        L_0x00bf:
            if (r1 == 0) goto L_0x00fd
            long r2 = r9.mo54553k()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "unComplete chunk "
            r4.<init>(r5)
            int r9 = r9.f54923e
            r4.append(r9)
            java.lang.String r9 = " curOffset:"
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = " reuseChunk chunkIndex:"
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = " for subChunk:"
            r4.append(r9)
            int r9 = r1.f54923e
            r4.append(r9)
            com.ss.android.socialbase.downloader.downloader.j r9 = r8.f54672n
            int r2 = r1.f54919a
            int r3 = r1.f54923e
            int r4 = r1.mo54542b()
            r9.mo54044a(r2, r3, r4, r10)
            r1.f54923e = r10
            r1.mo54541a(r0)
        L_0x00fd:
            return r1
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20198c.m66525a(com.ss.android.socialbase.downloader.model.DownloadChunk, int):com.ss.android.socialbase.downloader.model.DownloadChunk");
    }

    /* renamed from: a */
    private void m66528a(long j, int i) throws BaseException {
        long j2;
        long j3 = j;
        int i2 = i;
        long j4 = j3 / ((long) i2);
        int id = this.f54673o.getId();
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i2 - 1) {
                j2 = 0;
            } else {
                j2 = (j5 + j4) - 1;
            }
            DownloadChunk a = new C20333a(id).mo54558a(i3).mo54559a(j5).mo54565e(j5).mo54562b(j5).mo54563c(j2).mo54561a();
            arrayList.add(a);
            this.f54672n.mo54049a(a);
            j5 += j4;
        }
        this.f54673o.setChunkCount(i2);
        this.f54672n.mo54039a(id, i2);
        m66534a((List<DownloadChunk>) arrayList, j3);
    }

    /* renamed from: a */
    private static void m66529a(long j, String str, String str2) throws BaseException {
        if (!C20359e.m67560a(j)) {
            C20340b a = C20359e.m67541a(str, str2);
            try {
                long length = j - new File(str, str2).length();
                long c = C20359e.m67586c(str);
                if (c >= length) {
                    a.mo54898b(j);
                    try {
                        a.mo54897b();
                    } catch (Exception unused) {
                    }
                    return;
                }
                throw new DownloadOutOfSpaceException(c, length);
            } catch (IOException e) {
                throw new BaseException(1040, (Throwable) e);
            } catch (Throwable th) {
                try {
                    a.mo54897b();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
    }
}
