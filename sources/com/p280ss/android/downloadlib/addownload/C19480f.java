package com.p280ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p857a.C19382k;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.download.api.p858b.C19389e;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.C19529f;
import com.p280ss.android.downloadlib.p868c.C19513b;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.downloadlib.p868c.C19524i;
import com.p280ss.android.downloadlib.p868c.C19524i.C19525a;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo.C20335a;
import com.p280ss.android.socialbase.downloader.notification.C20354b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.downloadlib.addownload.f */
public class C19480f implements C19483g, C19525a {

    /* renamed from: a */
    public static final String f52735a = "f";

    /* renamed from: b */
    public C19484h f52736b;

    /* renamed from: c */
    public Map<Integer, C19388d> f52737c = new ConcurrentHashMap();

    /* renamed from: d */
    public DownloadInfo f52738d;

    /* renamed from: e */
    public IDownloadListener f52739e = new C19488a(this.f52741g);

    /* renamed from: f */
    public C19387c f52740f = null;

    /* renamed from: g */
    private final C19524i f52741g = new C19524i(Looper.getMainLooper(), this);

    /* renamed from: h */
    private WeakReference<Context> f52742h;

    /* renamed from: i */
    private C19400e f52743i;

    /* renamed from: j */
    private C19482a f52744j;

    /* renamed from: k */
    private boolean f52745k;

    /* renamed from: l */
    private long f52746l;

    /* renamed from: m */
    private Map<Long, C19387c> f52747m = new ConcurrentHashMap();

    /* renamed from: n */
    private long f52748n = -1;

    /* renamed from: o */
    private C19386b f52749o = null;

    /* renamed from: p */
    private C19384a f52750p = null;

    /* renamed from: q */
    private boolean f52751q;

    /* renamed from: com.ss.android.downloadlib.addownload.f$a */
    class C19482a extends AsyncTask<String, Void, DownloadInfo> {
        private C19482a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DownloadInfo doInBackground(String... strArr) {
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            String str = strArr[0];
            if (C19480f.this.f52740f == null || TextUtils.isEmpty(C19480f.this.f52740f.mo51003l())) {
                return AppDownloader.getInstance().getAppDownloadInfo(C19491j.m64206a(), str);
            }
            return Downloader.getInstance(C19491j.m64206a()).getDownloadInfo(str, C19480f.this.f52740f.mo51003l());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(DownloadInfo downloadInfo) {
            super.onPostExecute(downloadInfo);
            if (!isCancelled() && C19480f.this.f52740f != null) {
                try {
                    boolean a = C19523h.m64305a(C19480f.this.f52740f.mo51010s(), C19480f.this.f52740f.mo51006o(), C19480f.this.f52740f.mo51007p()).mo51536a();
                    if (downloadInfo == null || downloadInfo.getId() == 0 || (!a && Downloader.getInstance(C19491j.m64206a()).isDownloadSuccessAndFileNotExist(downloadInfo))) {
                        if (C19480f.this.f52738d != null) {
                            Downloader.getInstance(C19491j.m64206a()).removeTaskMainListener(C19480f.this.f52738d.getId());
                        }
                        if (a) {
                            if (C19480f.this.f52738d == null) {
                                C19480f.this.f52738d = new C20335a(C19480f.this.f52740f.mo50992a()).mo54758a();
                                C19480f.this.f52738d.setStatus(-3);
                            }
                            C19480f.this.f52736b.mo51579a(C19480f.this.f52738d, C19480f.this.mo51566g(), C19484h.m64139a(C19480f.this.f52737c));
                        } else {
                            if (!C19480f.this.f52737c.isEmpty()) {
                                for (C19388d a2 : C19484h.m64139a(C19480f.this.f52737c)) {
                                    a2.mo51373a();
                                }
                            }
                            C19480f.this.f52738d = null;
                        }
                    } else {
                        Downloader.getInstance(C19491j.m64206a()).removeTaskMainListener(downloadInfo.getId());
                        boolean z = true;
                        if (C19495l.m64243a(downloadInfo.getId()).mo51596a("bugfix_remove_listener", 1) == 0) {
                            z = false;
                        }
                        if (C19480f.this.f52738d == null || (C19480f.this.f52738d.getStatus() != -4 && (z || C19480f.this.f52738d.getStatus() != -1))) {
                            C19480f.this.f52738d = downloadInfo;
                            Downloader.getInstance(C19491j.m64206a()).setMainThreadListener(C19480f.this.f52738d.getId(), C19480f.this.f52739e);
                        } else {
                            C19480f.this.f52738d = null;
                        }
                        C19480f.this.f52736b.mo51579a(downloadInfo, C19480f.this.mo51566g(), C19484h.m64139a(C19480f.this.f52737c));
                    }
                    C19480f.this.f52736b.mo51577a(C19480f.this.mo51566g());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo51561b() {
        return this.f52745k;
    }

    /* renamed from: d */
    public final long mo51563d() {
        return this.f52746l;
    }

    /* renamed from: e */
    public final void mo51564e() {
        m64104m();
    }

    /* renamed from: a */
    public final boolean mo51560a(int i) {
        if (i == 0) {
            this.f52737c.clear();
        } else {
            this.f52737c.remove(Integer.valueOf(i));
        }
        if (!this.f52737c.isEmpty()) {
            return false;
        }
        this.f52745k = false;
        this.f52746l = System.currentTimeMillis();
        if (this.f52738d != null) {
            Downloader.getInstance(C19491j.m64206a()).removeTaskMainListener(this.f52738d.getId());
        }
        if (!(this.f52744j == null || this.f52744j.getStatus() == Status.FINISHED)) {
            this.f52744j.cancel(true);
        }
        this.f52736b.mo51578a(this.f52738d);
        new StringBuilder("onUnbind removeCallbacksAndMessages, downloadUrl:").append(this.f52738d == null ? "" : this.f52738d.getUrl());
        this.f52741g.removeCallbacksAndMessages(null);
        m64106o();
        return true;
    }

    /* renamed from: a */
    public final void mo51559a(boolean z) {
        if (this.f52738d != null) {
            if (z) {
                IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                if (iAppDownloadEventHandler != null) {
                    iAppDownloadEventHandler.handleDownloadCancel(this.f52738d);
                }
                C20354b.m67519a().mo54922c(this.f52738d.getId());
                Downloader.getInstance(C20269b.m66765x()).cancel(this.f52738d.getId());
                Downloader.getInstance(C19491j.m64206a()).clearDownloadData(this.f52738d.getId());
                return;
            }
            Intent intent = new Intent(C19491j.m64206a(), DownloadHandlerService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_DELETE");
            intent.putExtra("extra_click_download_ids", this.f52738d.getId());
            C19491j.m64206a().startService(intent);
        }
    }

    /* renamed from: c */
    public final boolean mo51562c() {
        if (this.f52738d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private C19484h m64100i() {
        if (this.f52736b == null) {
            this.f52736b = new C19484h();
        }
        return this.f52736b;
    }

    /* renamed from: k */
    private C19386b m64102k() {
        if (this.f52749o == null) {
            return new C19389e();
        }
        return this.f52749o;
    }

    /* renamed from: l */
    private C19384a m64103l() {
        if (this.f52750p == null) {
            return new C19226a();
        }
        return this.f52750p;
    }

    /* renamed from: o */
    private void m64106o() {
        this.f52743i = null;
        this.f52738d = null;
        this.f52747m.clear();
    }

    /* renamed from: g */
    public final C19400e mo51566g() {
        if (this.f52743i == null) {
            this.f52743i = new C19400e();
        }
        return this.f52743i;
    }

    /* renamed from: j */
    private Context m64101j() {
        if (this.f52742h == null || this.f52742h.get() == null) {
            return C19491j.m64206a();
        }
        return (Context) this.f52742h.get();
    }

    /* renamed from: h */
    private boolean m64099h() {
        if (C19491j.m64228i().optInt("quick_app_enable_switch", 0) == 0 && C19472d.m64065a(this.f52740f) && C19472d.m64066a(this.f52738d)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m64105n() {
        if (!(this.f52744j == null || this.f52744j.getStatus() == Status.FINISHED)) {
            this.f52744j.cancel(true);
        }
        this.f52744j = new C19482a();
        C19513b.m64281a(this.f52744j, this.f52740f.mo50992a(), this.f52740f.mo51010s());
    }

    /* renamed from: f */
    public final void mo51565f() {
        if (this.f52737c != null && this.f52737c.size() != 0) {
            for (C19388d a : C19484h.m64139a(this.f52737c)) {
                a.mo51373a();
            }
            if (this.f52738d != null) {
                this.f52738d.setStatus(-4);
            }
        }
    }

    /* renamed from: m */
    private void m64104m() {
        for (C19388d a : C19484h.m64139a(this.f52737c)) {
            a.mo51374a(this.f52740f, m64103l());
        }
        C19529f.m64362a().mo51653a(this.f52740f, m64103l(), m64102k());
        int a2 = this.f52736b.mo51569a(C19491j.m64206a(), this.f52739e);
        new StringBuilder("beginDownloadWithNewDownloader id:").append(a2);
        if (a2 != 0) {
            if (this.f52738d == null) {
                if (C19490i.m64204b(this.f52740f)) {
                    this.f52736b.mo51580a((String) null, m64102k().mo50972z());
                } else {
                    this.f52736b.mo51588c(m64102k().mo50972z());
                }
            }
            this.f52736b.mo51587c(this.f52738d);
            if (m64102k().mo50971y()) {
                C19444a.m63957a().mo51493a(new C19236a(this.f52740f, m64102k().mo50972z(), (long) a2));
            }
        } else {
            DownloadInfo a3 = new C20335a(this.f52740f.mo50992a()).mo54758a();
            a3.setStatus(-1);
            m64087a(a3);
            this.f52736b.mo51589d();
        }
        if (this.f52736b.mo51585b(mo51562c())) {
            C19491j.m64222c();
            m64101j();
            m64103l();
            m64102k();
            new StringBuilder("beginDownloadWithNewDownloader onItemClick id:").append(a2);
        }
    }

    /* renamed from: a */
    public final void mo51557a() {
        this.f52745k = true;
        m64105n();
    }

    /* renamed from: a */
    private void m64087a(DownloadInfo downloadInfo) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = downloadInfo;
        this.f52741g.sendMessage(obtain);
    }

    /* renamed from: c */
    private void m64095c(boolean z) {
        if (z) {
            this.f52736b.mo51572a(1);
        }
        m64097e(z);
    }

    /* renamed from: d */
    private void m64096d(boolean z) {
        m64098f(z);
        this.f52736b.mo51571a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C19480f mo51553a(Context context) {
        if (context != null) {
            this.f52742h = new WeakReference<>(context);
        }
        C19491j.m64221b(context);
        return this;
    }

    /* renamed from: e */
    private void m64097e(boolean z) {
        if (this.f52736b.mo51584b(this.f52738d)) {
            m64098f(z);
            return;
        }
        C19491j.m64222c();
        m64101j();
        m64103l();
        m64102k();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C19480f mo51554a(C19384a aVar) {
        this.f52750p = aVar;
        m64100i().mo51575a(m64103l());
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C19480f mo51555a(C19386b bVar) {
        boolean z;
        this.f52749o = bVar;
        if (m64102k().mo50968v() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f52751q = z;
        m64100i().f52755b = m64102k();
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C19480f mo51556a(C19387c cVar) {
        if (cVar != null) {
            this.f52747m.put(Long.valueOf(cVar.mo50995d()), cVar);
            this.f52740f = cVar;
            if (C19490i.m64201a(cVar)) {
                ((C19232c) cVar).f51967a = 3;
            }
            m64100i().mo51576a(this.f52740f);
        }
        return this;
    }

    /* renamed from: f */
    private void m64098f(boolean z) {
        if (this.f52738d == null || (this.f52738d.getStatus() != -3 && !Downloader.getInstance(C19491j.m64206a()).canResume(this.f52738d.getId()))) {
            if (z) {
                this.f52736b.mo51572a(2);
            }
            this.f52736b.mo51574a((C19382k) new C19382k() {
                /* renamed from: a */
                public final void mo51368a(String str) {
                }

                /* renamed from: a */
                public final void mo51367a() {
                    C19480f.this.mo51564e();
                }
            });
            return;
        }
        new StringBuilder("performButtonClickWithNewDownloader continue download, status:").append(this.f52738d.getStatus());
        this.f52736b.mo51587c(this.f52738d);
        if (!(this.f52738d == null || this.f52740f == null)) {
            this.f52738d.setOnlyWifi(this.f52740f.mo51002k());
        }
        AppDownloader.getInstance().handleStatusClick(C19491j.m64206a(), this.f52738d.getId(), this.f52738d.getStatus());
        if (!(this.f52738d.getId() == 0 || this.f52739e == null)) {
            Downloader.getInstance(m64101j()).setMainThreadListener(this.f52738d.getId(), this.f52739e);
        }
        if (this.f52738d.getStatus() == -3) {
            this.f52736b.mo51586c();
        }
    }

    /* renamed from: b */
    private void m64093b(boolean z) {
        if (this.f52736b.mo51570a(this.f52751q) != 1) {
            m64096d(z);
            return;
        }
        if (z) {
            this.f52736b.mo51572a(1);
        }
        C19491j.m64222c();
        m64101j();
        m64103l();
        m64102k();
    }

    /* renamed from: b */
    private boolean m64094b(int i) {
        String str;
        if (!m64099h()) {
            return false;
        }
        long j = 0;
        int i2 = -1;
        String str2 = this.f52740f.mo51015x().f52506a;
        switch (i) {
            case 1:
                this.f52736b.mo51572a(1);
                i2 = 5;
                j = 1;
                break;
            case 2:
                i2 = 4;
                this.f52736b.mo51572a(2);
                j = 2;
                break;
        }
        boolean e = C19523h.m64335e(C19491j.m64206a(), str2);
        if (e) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.obj = Long.valueOf(this.f52740f.mo50995d());
            C19524i iVar = this.f52741g;
            C19472d.m64062a();
            iVar.sendMessageDelayed(obtain, C19472d.m64067b());
            C19472d.m64062a().mo51547a(i2, this.f52740f, this.f52749o);
        } else {
            C19472d.m64062a();
            C19387c cVar = this.f52740f;
            if (this.f52749o == null) {
                str = "";
            } else {
                str = this.f52749o.mo50946A();
            }
            C19472d.m64064a(false, cVar, str, j);
        }
        return e;
    }

    /* renamed from: a */
    public final void mo51520a(Message message) {
        String str;
        String str2;
        if (message != null && this.f52745k && !this.f52737c.isEmpty()) {
            switch (message.what) {
                case 3:
                    this.f52738d = (DownloadInfo) message.obj;
                    this.f52736b.mo51573a(message, mo51566g(), C19484h.m64139a(this.f52737c));
                    return;
                case 4:
                    if (C19491j.m64230k() == null || !C19491j.m64230k().mo51355a()) {
                        if (this.f52749o == null) {
                            str = "";
                        } else {
                            str = this.f52749o.mo50946A();
                        }
                        C19472d.m64062a();
                        C19472d.m64064a(false, this.f52740f, str, 2);
                        m64093b(false);
                        return;
                    }
                    return;
                case 5:
                    if (C19491j.m64230k() == null || !C19491j.m64230k().mo51355a()) {
                        if (this.f52749o == null) {
                            str2 = "";
                        } else {
                            str2 = this.f52749o.mo50946A();
                        }
                        C19472d.m64062a();
                        C19472d.m64064a(false, this.f52740f, str2, 1);
                        m64095c(false);
                        break;
                    } else {
                        return;
                    }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C19480f mo51552a(int i, C19388d dVar) {
        if (dVar != null) {
            this.f52737c.put(Integer.valueOf(i), dVar);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo51558a(long j, int i) {
        StringBuilder sb = new StringBuilder("handleDownload id:");
        sb.append(j);
        sb.append(",actionType:");
        sb.append(i);
        if (!this.f52736b.mo51582a(m64101j(), i, this.f52751q)) {
            C19387c cVar = (C19387c) this.f52747m.get(Long.valueOf(j));
            if (cVar != null) {
                this.f52740f = cVar;
                this.f52748n = j;
                m64100i().mo51576a(this.f52740f);
            }
            boolean b = m64094b(i);
            StringBuilder sb2 = new StringBuilder("handleDownload mIsNormalScene:");
            sb2.append(this.f52751q);
            sb2.append(",mCurrentId:");
            sb2.append(this.f52748n);
            sb2.append(",interceptQuickApp:");
            sb2.append(b);
            switch (i) {
                case 1:
                    if (!b) {
                        StringBuilder sb3 = new StringBuilder("handleDownload id:");
                        sb3.append(j);
                        sb3.append(",tryPerformItemClick:");
                        m64095c(true);
                        break;
                    }
                    break;
                case 2:
                    if (!b) {
                        StringBuilder sb4 = new StringBuilder("handleDownload id:");
                        sb4.append(j);
                        sb4.append(",tryPerformButtonClick:");
                        m64093b(true);
                        return;
                    }
                    break;
            }
        }
    }
}
