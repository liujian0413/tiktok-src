package com.p280ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20211ac;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import com.p280ss.android.socialbase.downloader.downloader.C20290o;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.p905c.C20192a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.p */
public final class C20325p implements C20288m {

    /* renamed from: a */
    private final C20295a f54902a;

    /* renamed from: b */
    private final C20285j f54903b;

    /* renamed from: c */
    private final C20290o f54904c;

    /* renamed from: d */
    public final void mo54435d() {
    }

    /* renamed from: g */
    public final boolean mo54442g() {
        return false;
    }

    /* renamed from: a */
    public final void mo54419a(List<String> list) {
        if (this.f54902a != null) {
            this.f54902a.mo54490a(list);
        }
    }

    /* renamed from: a */
    public final boolean mo54421a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = C20359e.m67559a(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (a) {
            mo54446k(downloadInfo.getId());
        }
        return a;
    }

    /* renamed from: a */
    public final void mo54412a(int i, Notification notification) {
        if (this.f54904c != null) {
            this.f54904c.mo54268a(i, notification);
        }
    }

    /* renamed from: a */
    public final void mo54420a(boolean z, boolean z2) {
        if (this.f54904c != null) {
            this.f54904c.mo54274a(z2);
        }
    }

    /* renamed from: a */
    public final void mo54418a(DownloadTask downloadTask) {
        if (this.f54904c != null) {
            this.f54904c.mo54277b(downloadTask);
            return;
        }
        if (downloadTask != null) {
            C20192a.m66504a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    /* renamed from: a */
    public final void mo54414a(int i, List<DownloadChunk> list) {
        this.f54903b.mo54047a(i, list);
    }

    /* renamed from: a */
    public final void mo54415a(int i, boolean z) {
        C20271c.m66769a().mo54288a(i, z);
    }

    /* renamed from: a */
    public final void mo54417a(DownloadChunk downloadChunk) {
        this.f54903b.mo54049a(downloadChunk);
    }

    /* renamed from: a */
    public final void mo54413a(int i, C20254v vVar) {
        if (this.f54902a != null) {
            this.f54902a.mo54486a(i, vVar);
        }
    }

    public C20325p() {
        this(false);
    }

    /* renamed from: c */
    public final boolean mo54431c() {
        return C20269b.m66767z();
    }

    /* renamed from: e */
    public final boolean mo54438e() {
        return this.f54903b.mo54066d();
    }

    /* renamed from: f */
    public final void mo54440f() {
        this.f54903b.mo54055b();
    }

    /* renamed from: a */
    public final void mo54405a() {
        if (this.f54902a != null) {
            this.f54902a.mo54492b();
        }
    }

    /* renamed from: b */
    public final boolean mo54429b() {
        if (this.f54904c != null) {
            return this.f54904c.mo54275a();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54416a(C20211ac acVar) {
        C20269b.m66727a(acVar);
    }

    /* renamed from: m */
    public final void mo54448m(int i) {
        C20190a.m66499a(i);
    }

    /* renamed from: j */
    public final List<DownloadChunk> mo54445j(int i) {
        return this.f54903b.mo54060c(i);
    }

    /* renamed from: p */
    public final boolean mo54451p(int i) {
        return this.f54903b.mo54068e(i);
    }

    /* renamed from: q */
    public final void mo54452q(int i) {
        this.f54903b.mo54065d(i);
    }

    /* renamed from: r */
    public final boolean mo54453r(int i) {
        return this.f54903b.mo54069f(i);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54404a(String str) {
        if (this.f54903b != null) {
            this.f54903b.mo54042a(str);
        }
        return null;
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54430c(String str) {
        if (this.f54903b != null) {
            return this.f54903b.mo54061c(str);
        }
        return null;
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo54434d(String str) {
        if (this.f54902a != null) {
            return this.f54902a.mo54483a(str);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo54437e(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54500h(i);
        }
    }

    /* renamed from: h */
    public final boolean mo54443h(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54491a(i);
        }
        return false;
    }

    /* renamed from: i */
    public final DownloadInfo mo54444i(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54496d(i);
        }
        return null;
    }

    /* renamed from: k */
    public final void mo54446k(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54506n(i);
        }
    }

    /* renamed from: l */
    public final void mo54447l(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54508p(i);
        }
    }

    /* renamed from: n */
    public final boolean mo54449n(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54504l(i);
        }
        return false;
    }

    /* renamed from: o */
    public final int mo54450o(int i) {
        return C20271c.m66769a().mo54284a(i);
    }

    /* renamed from: s */
    public final C20254v mo54454s(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54502j(i);
        }
        return null;
    }

    /* renamed from: u */
    public final C20241o mo54456u(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54503k(i);
        }
        return null;
    }

    public C20325p(boolean z) {
        this.f54902a = C20269b.m66758q();
        this.f54903b = C20269b.m66754m();
        if (!z) {
            this.f54904c = C20269b.m66755n();
        } else {
            this.f54904c = C20269b.m66756o();
        }
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54423b(String str) {
        if (this.f54903b != null) {
            return this.f54903b.mo54054b(str);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo54432c(int i) {
        if (this.f54902a != null) {
            return this.f54902a.mo54509q(i);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo54436d(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54499g(i);
        }
    }

    /* renamed from: g */
    public final int mo54441g(int i) {
        if (this.f54902a == null) {
            return 0;
        }
        DownloadInfo d = this.f54902a.mo54496d(i);
        if (d == null) {
            return 0;
        }
        return d.getStatus();
    }

    /* renamed from: t */
    public final C20259y mo54455t(int i) {
        C20259y yVar;
        if (this.f54902a != null) {
            yVar = this.f54902a.mo54501i(i);
        } else {
            yVar = null;
        }
        if (yVar == null) {
            return C20269b.m66762u();
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo54406a(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54497e(i);
        }
    }

    /* renamed from: b */
    public final void mo54424b(int i) {
        if (this.f54902a != null) {
            this.f54902a.mo54498f(i);
        }
    }

    /* renamed from: c */
    public final boolean mo54433c(DownloadInfo downloadInfo) {
        return this.f54903b.mo54051a(downloadInfo);
    }

    /* renamed from: f */
    public final long mo54439f(int i) {
        if (this.f54903b == null) {
            return 0;
        }
        DownloadInfo b = this.f54903b.mo54052b(i);
        if (b == null) {
            return 0;
        }
        int chunkCount = b.getChunkCount();
        if (chunkCount <= 1) {
            return b.getCurBytes();
        }
        List c = this.f54903b.mo54060c(i);
        if (c == null || c.size() != chunkCount) {
            return 0;
        }
        return C20359e.m67571b(c);
    }

    /* renamed from: b */
    public final void mo54427b(DownloadInfo downloadInfo) {
        this.f54903b.mo54063c(downloadInfo);
    }

    /* renamed from: b */
    public final void mo54428b(DownloadTask downloadTask) {
        if (this.f54904c != null) {
            this.f54904c.mo54279c(downloadTask);
        }
    }

    /* renamed from: a */
    public final int mo54403a(String str, String str2) {
        return C20269b.m66720a(str, str2);
    }

    /* renamed from: b */
    public final void mo54426b(int i, List<DownloadChunk> list) {
        this.f54903b.mo54056b(i, list);
    }

    /* renamed from: b */
    public final DownloadInfo mo54422b(String str, String str2) {
        return mo54444i(C20269b.m66720a(str, str2));
    }

    /* renamed from: a */
    public final void mo54407a(int i, int i2) {
        if (C20269b.m66744d() != null) {
            for (C20211ac acVar : C20269b.m66744d()) {
                if (acVar != null) {
                    acVar.mo54135a(i2, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54410a(int i, int i2, long j) {
        this.f54903b.mo54046a(i, i2, j);
    }

    /* renamed from: a */
    public final void mo54408a(int i, int i2, int i3, int i4) {
        this.f54903b.mo54044a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo54409a(int i, int i2, int i3, long j) {
        this.f54903b.mo54045a(i, i2, i3, j);
    }

    /* renamed from: b */
    public final void mo54425b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        if (this.f54902a != null) {
            this.f54902a.mo54485a(i, i2, iDownloadListener, listenerType, z);
        }
    }

    /* renamed from: a */
    public final void mo54411a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        if (this.f54902a != null) {
            this.f54902a.mo54494b(i, i2, iDownloadListener, listenerType, z);
        }
    }
}
