package com.p280ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.depend.C20208ab;
import com.p280ss.android.socialbase.downloader.depend.C20220f;
import com.p280ss.android.socialbase.downloader.depend.C20226h;
import com.p280ss.android.socialbase.downloader.depend.C20251u;
import com.p280ss.android.socialbase.downloader.depend.C20256x;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.C20282i.C20283a;
import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import com.p280ss.android.socialbase.downloader.model.C20337a;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.socialbase.downloader.utils.C20360f;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.m */
public class C20317m extends C20283a {

    /* renamed from: a */
    private static final String f54882a = "m";

    /* renamed from: b */
    private final C20288m f54883b = new C20325p(true);

    /* renamed from: a */
    public final void mo54364a(C20337a aVar) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54428b(C20360f.m67634a(aVar));
        }
    }

    /* renamed from: a */
    public final void mo54365a(List<String> list) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54419a(list);
        }
    }

    /* renamed from: a */
    public final void mo54357a(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54425b(i, i2, C20360f.m67607a(hVar), C20359e.m67587c(i3), z);
        }
    }

    /* renamed from: a */
    public final boolean mo54367a(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54421a(downloadInfo);
    }

    /* renamed from: a */
    public final void mo54358a(int i, Notification notification) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54412a(i, notification);
        }
    }

    /* renamed from: a */
    public final void mo54366a(boolean z) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54420a(true, z);
        }
    }

    /* renamed from: a */
    public final void mo54363a(DownloadChunk downloadChunk) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54417a(downloadChunk);
        }
    }

    /* renamed from: a */
    public final void mo54360a(int i, List<DownloadChunk> list) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54426b(i, list);
        }
    }

    /* renamed from: a */
    public final void mo54362a(C20208ab abVar) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54416a(C20360f.m67610a(abVar));
        }
    }

    /* renamed from: a */
    public final void mo54359a(int i, C20251u uVar) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54413a(i, C20360f.m67628a(uVar));
        }
    }

    /* renamed from: c */
    public final boolean mo54376c() throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54438e();
    }

    /* renamed from: d */
    public final void mo54379d() throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54440f();
        }
    }

    /* renamed from: e */
    public final boolean mo54382e() throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54429b();
    }

    /* renamed from: a */
    public final void mo54351a() throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54405a();
        }
    }

    /* renamed from: b */
    public final boolean mo54373b() throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54431c();
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54375c(String str) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54434d(str);
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo54378d(String str) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54430c(str);
    }

    /* renamed from: e */
    public final void mo54381e(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54437e(i);
        }
    }

    /* renamed from: f */
    public final long mo54383f(int i) throws RemoteException {
        if (this.f54883b == null) {
            return 0;
        }
        return this.f54883b.mo54439f(i);
    }

    /* renamed from: g */
    public final int mo54384g(int i) throws RemoteException {
        if (this.f54883b == null) {
            return 0;
        }
        return this.f54883b.mo54441g(i);
    }

    /* renamed from: h */
    public final boolean mo54385h(int i) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54443h(i);
    }

    /* renamed from: i */
    public final DownloadInfo mo54386i(int i) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54444i(i);
    }

    /* renamed from: j */
    public final List<DownloadChunk> mo54387j(int i) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54445j(i);
    }

    /* renamed from: k */
    public final void mo54388k(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54446k(i);
        }
    }

    /* renamed from: l */
    public final void mo54389l(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54447l(i);
        }
    }

    /* renamed from: m */
    public final boolean mo54390m(int i) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54449n(i);
    }

    /* renamed from: n */
    public final void mo54391n(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54448m(i);
        }
    }

    /* renamed from: o */
    public final int mo54392o(int i) throws RemoteException {
        return C20271c.m66769a().mo54292b(i);
    }

    /* renamed from: p */
    public final boolean mo54393p(int i) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54451p(i);
    }

    /* renamed from: q */
    public final void mo54394q(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54452q(i);
        }
    }

    /* renamed from: r */
    public final boolean mo54395r(int i) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54453r(i);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54350a(String str) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54404a(str);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54369b(String str) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54423b(str);
    }

    /* renamed from: s */
    public final C20251u mo54396s(int i) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return C20360f.m67627a(this.f54883b.mo54454s(i));
    }

    /* renamed from: t */
    public final C20256x mo54397t(int i) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return C20360f.m67629a(this.f54883b.mo54455t(i));
    }

    /* renamed from: u */
    public final C20220f mo54398u(int i) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return C20360f.m67613a(this.f54883b.mo54456u(i));
    }

    /* renamed from: b */
    public final void mo54370b(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54424b(i);
        }
    }

    /* renamed from: c */
    public final boolean mo54377c(int i) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54432c(i);
    }

    /* renamed from: d */
    public final void mo54380d(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54436d(i);
        }
    }

    /* renamed from: a */
    public final void mo54352a(int i) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54406a(i);
        }
    }

    /* renamed from: b */
    public final boolean mo54374b(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f54883b == null) {
            return false;
        }
        return this.f54883b.mo54433c(downloadInfo);
    }

    /* renamed from: a */
    public final void mo54361a(int i, boolean z) throws RemoteException {
        C20271c.m66769a().mo54297b(i, z);
    }

    /* renamed from: a */
    public final int mo54349a(String str, String str2) throws RemoteException {
        if (this.f54883b == null) {
            return 0;
        }
        return this.f54883b.mo54403a(str, str2);
    }

    /* renamed from: b */
    public final DownloadInfo mo54368b(String str, String str2) throws RemoteException {
        if (this.f54883b == null) {
            return null;
        }
        return this.f54883b.mo54422b(str, str2);
    }

    /* renamed from: a */
    public final void mo54353a(int i, int i2) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54407a(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo54372b(int i, List<DownloadChunk> list) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54414a(i, list);
        }
    }

    /* renamed from: a */
    public final void mo54356a(int i, int i2, long j) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54410a(i, i2, j);
        }
    }

    /* renamed from: a */
    public final void mo54354a(int i, int i2, int i3, int i4) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54408a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo54355a(int i, int i2, int i3, long j) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54409a(i, i2, i3, j);
        }
    }

    /* renamed from: b */
    public final void mo54371b(int i, int i2, C20226h hVar, int i3, boolean z) throws RemoteException {
        if (this.f54883b != null) {
            this.f54883b.mo54411a(i, i2, C20360f.m67607a(hVar), C20359e.m67587c(i3), z);
        }
    }
}
