package com.p280ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20211ac;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.C20282i;
import com.p280ss.android.socialbase.downloader.downloader.C20282i.C20283a;
import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import com.p280ss.android.socialbase.downloader.downloader.C20289n;
import com.p280ss.android.socialbase.downloader.downloader.C20290o;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.socialbase.downloader.utils.C20360f;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.o */
public class C20323o implements C20288m, C20289n {

    /* renamed from: a */
    private static final String f54897a = "o";

    /* renamed from: b */
    private volatile C20282i f54898b;

    /* renamed from: c */
    private C20290o<IndependentProcessDownloadService> f54899c = C20269b.m66756o();

    /* renamed from: d */
    private C20288m f54900d = new C20325p();

    /* renamed from: b */
    public final void mo54427b(DownloadInfo downloadInfo) {
    }

    /* renamed from: h */
    public final void mo54458h() {
        this.f54898b = null;
    }

    /* renamed from: a */
    public final void mo54419a(List<String> list) {
        if (this.f54898b == null) {
            this.f54900d.mo54419a(list);
            return;
        }
        try {
            this.f54898b.mo54365a(list);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo54421a(DownloadInfo downloadInfo) {
        if (this.f54898b == null) {
            return this.f54900d.mo54421a(downloadInfo);
        }
        try {
            this.f54898b.mo54367a(downloadInfo);
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54412a(int i, Notification notification) {
        if (this.f54898b == null) {
            C20190a.m66502b(f54897a, "startForeground, aidlService is null");
            return;
        }
        String str = f54897a;
        StringBuilder sb = new StringBuilder("aidlService.startForeground, id = ");
        sb.append(i);
        C20190a.m66500a(str, sb.toString());
        try {
            this.f54898b.mo54358a(i, notification);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54420a(boolean z, boolean z2) {
        if (this.f54898b == null) {
            C20190a.m66502b(f54897a, "stopForeground, aidlService is null");
            return;
        }
        C20190a.m66500a(f54897a, "aidlService.stopForeground");
        try {
            this.f54898b.mo54366a(z2);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54418a(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f54899c == null)) {
            this.f54899c.mo54277b(downloadTask);
        }
    }

    /* renamed from: a */
    public final void mo54414a(int i, List<DownloadChunk> list) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54372b(i, list);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54415a(int i, boolean z) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54361a(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54417a(DownloadChunk downloadChunk) {
        if (this.f54898b == null) {
            this.f54900d.mo54417a(downloadChunk);
            return;
        }
        try {
            this.f54898b.mo54363a(downloadChunk);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54416a(C20211ac acVar) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54362a(C20360f.m67609a(acVar));
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54413a(int i, C20254v vVar) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54359a(i, C20360f.m67627a(vVar));
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54457a(IBinder iBinder) {
        this.f54898b = C20283a.m66909a(iBinder);
        if (C20359e.m67556a()) {
            mo54416a((C20211ac) new C20211ac() {
                /* renamed from: a */
                public final void mo54135a(int i, int i2) {
                    if (i2 == 1) {
                        Downloader.getInstance(C20269b.m66765x()).pause(i);
                        List j = C20315l.m67199a(false).mo54445j(i);
                        if (j != null) {
                            C20315l.m67199a(true).mo54414a(i, C20359e.m67546a(j));
                        }
                        return;
                    }
                    if (i2 == 2) {
                        Downloader.getInstance(C20269b.m66765x()).cancel(i);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final boolean mo54431c() {
        return C20269b.m66767z();
    }

    /* renamed from: g */
    public final boolean mo54442g() {
        if (this.f54898b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54405a() {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54351a();
            } catch (RemoteException unused) {
            }
        }
    }

    public C20323o() {
        this.f54899c.mo54271a((C20289n) this);
    }

    /* renamed from: d */
    public final void mo54435d() {
        if (this.f54899c != null) {
            this.f54899c.mo54281e();
        }
    }

    /* renamed from: e */
    public final boolean mo54438e() {
        if (this.f54898b == null) {
            return this.f54900d.mo54438e();
        }
        try {
            return this.f54898b.mo54376c();
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final void mo54440f() {
        if (this.f54898b == null) {
            this.f54900d.mo54440f();
            return;
        }
        try {
            this.f54898b.mo54379d();
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo54429b() {
        if (this.f54898b == null) {
            C20190a.m66502b(f54897a, "isServiceForeground, aidlService is null");
            return false;
        }
        C20190a.m66500a(f54897a, "aidlService.isServiceForeground");
        try {
            return this.f54898b.mo54382e();
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo54432c(int i) {
        if (this.f54898b == null) {
            return false;
        }
        try {
            return this.f54898b.mo54377c(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo54434d(String str) {
        if (this.f54898b != null) {
            try {
                return this.f54898b.mo54375c(str);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo54437e(int i) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54381e(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: f */
    public final long mo54439f(int i) {
        if (this.f54898b == null) {
            return 0;
        }
        try {
            return this.f54898b.mo54383f(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public final int mo54441g(int i) {
        if (this.f54898b == null) {
            return 0;
        }
        try {
            return this.f54898b.mo54384g(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public final boolean mo54443h(int i) {
        if (this.f54898b == null) {
            return false;
        }
        try {
            return this.f54898b.mo54385h(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final void mo54448m(int i) {
        if (this.f54899c != null) {
            this.f54899c.mo54267a(i);
        }
    }

    /* renamed from: n */
    public final boolean mo54449n(int i) {
        if (this.f54898b == null) {
            return false;
        }
        try {
            return this.f54898b.mo54390m(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54404a(String str) {
        if (this.f54898b == null) {
            return this.f54900d.mo54404a(str);
        }
        try {
            return this.f54898b.mo54350a(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54423b(String str) {
        if (this.f54898b == null) {
            return this.f54900d.mo54423b(str);
        }
        try {
            return this.f54898b.mo54369b(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54430c(String str) {
        if (this.f54898b == null) {
            return this.f54900d.mo54430c(str);
        }
        try {
            return this.f54898b.mo54378d(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final DownloadInfo mo54444i(int i) {
        if (this.f54898b == null) {
            return this.f54900d.mo54444i(i);
        }
        try {
            return this.f54898b.mo54386i(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final List<DownloadChunk> mo54445j(int i) {
        if (this.f54898b == null) {
            return this.f54900d.mo54445j(i);
        }
        try {
            return this.f54898b.mo54387j(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final void mo54446k(int i) {
        if (this.f54898b == null) {
            this.f54900d.mo54446k(i);
            return;
        }
        try {
            this.f54898b.mo54388k(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: l */
    public final void mo54447l(int i) {
        if (this.f54898b == null) {
            this.f54900d.mo54447l(i);
            return;
        }
        try {
            this.f54898b.mo54389l(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: o */
    public final int mo54450o(int i) {
        if (this.f54898b == null) {
            return C20271c.m66769a().mo54292b(i);
        }
        try {
            return this.f54898b.mo54392o(i);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    /* renamed from: p */
    public final boolean mo54451p(int i) {
        if (this.f54898b == null) {
            return this.f54900d.mo54451p(i);
        }
        try {
            return this.f54898b.mo54393p(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final void mo54452q(int i) {
        if (this.f54898b == null) {
            this.f54900d.mo54452q(i);
            return;
        }
        try {
            this.f54898b.mo54394q(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: r */
    public final boolean mo54453r(int i) {
        if (this.f54898b == null) {
            return this.f54900d.mo54453r(i);
        }
        try {
            return this.f54898b.mo54395r(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final C20254v mo54454s(int i) {
        if (this.f54898b != null) {
            try {
                return C20360f.m67628a(this.f54898b.mo54396s(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: t */
    public final C20259y mo54455t(int i) {
        if (this.f54898b != null) {
            try {
                return C20360f.m67630a(this.f54898b.mo54397t(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: u */
    public final C20241o mo54456u(int i) {
        if (this.f54898b != null) {
            try {
                return C20360f.m67621a(this.f54898b.mo54398u(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo54406a(int i) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54352a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo54424b(int i) {
        if (this.f54898b == null) {
            this.f54900d.mo54424b(i);
            return;
        }
        try {
            this.f54898b.mo54370b(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo54433c(DownloadInfo downloadInfo) {
        if (this.f54898b == null) {
            return this.f54900d.mo54433c(downloadInfo);
        }
        try {
            return this.f54898b.mo54374b(downloadInfo);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo54436d(int i) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54380d(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo54428b(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f54899c == null)) {
            this.f54899c.mo54279c(downloadTask);
        }
    }

    /* renamed from: a */
    public final int mo54403a(String str, String str2) {
        return C20269b.m66720a(str, str2);
    }

    /* renamed from: b */
    public final DownloadInfo mo54422b(String str, String str2) {
        return mo54444i(mo54403a(str, str2));
    }

    /* renamed from: a */
    public final void mo54407a(int i, int i2) {
        if (this.f54898b != null) {
            try {
                this.f54898b.mo54353a(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo54426b(int i, List<DownloadChunk> list) {
        if (this.f54898b == null) {
            this.f54900d.mo54426b(i, list);
            return;
        }
        try {
            this.f54898b.mo54360a(i, list);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54410a(int i, int i2, long j) {
        if (this.f54898b == null) {
            this.f54900d.mo54410a(i, i2, j);
            return;
        }
        try {
            this.f54898b.mo54356a(i, i2, j);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54408a(int i, int i2, int i3, int i4) {
        if (this.f54898b == null) {
            this.f54900d.mo54408a(i, i2, i3, i4);
            return;
        }
        try {
            this.f54898b.mo54354a(i, i2, i3, i4);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo54409a(int i, int i2, int i3, long j) {
        if (this.f54898b == null) {
            this.f54900d.mo54409a(i, i2, i3, j);
            return;
        }
        try {
            this.f54898b.mo54355a(i, i2, i3, j);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final void mo54425b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        boolean z2;
        if (this.f54898b != null) {
            try {
                C20282i iVar = this.f54898b;
                if (listenerType == ListenerType.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                iVar.mo54357a(i, i2, C20360f.m67615a(iDownloadListener, z2), listenerType.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54411a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        boolean z2;
        if (this.f54898b != null) {
            try {
                C20282i iVar = this.f54898b;
                if (listenerType == ListenerType.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                iVar.mo54371b(i, i2, C20360f.m67615a(iDownloadListener, z2), listenerType.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }
}
