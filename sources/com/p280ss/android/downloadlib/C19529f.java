package com.p280ss.android.downloadlib;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.downloadlib.addownload.C19480f;
import com.p280ss.android.downloadlib.addownload.C19483g;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.downloadlib.f */
public class C19529f implements C19528e {

    /* renamed from: b */
    private static volatile C19529f f52819b;

    /* renamed from: a */
    public final CopyOnWriteArrayList<C19385a> f52820a = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Handler f52821c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final List<C19483g> f52822d = new ArrayList();

    /* renamed from: e */
    private final Map<String, C19483g> f52823e = new HashMap();

    /* renamed from: f */
    private long f52824f;

    /* renamed from: a */
    public final void mo51649a(String str, int i) {
        C19483g gVar = (C19483g) this.f52823e.get(str);
        if (gVar != null) {
            if (gVar.mo51560a(i)) {
                this.f52822d.add(gVar);
                this.f52823e.remove(str);
            }
            m64364b();
        }
    }

    /* renamed from: a */
    public final void mo51650a(String str, long j, int i, C19386b bVar, C19384a aVar) {
        C19483g gVar = (C19483g) this.f52823e.get(str);
        if (gVar != null) {
            gVar.mo51555a(bVar).mo51554a(aVar).mo51558a(j, i);
        }
    }

    /* renamed from: a */
    public static C19529f m64362a() {
        if (f52819b == null) {
            synchronized (C19529f.class) {
                if (f52819b == null) {
                    f52819b = new C19529f();
                }
            }
        }
        return f52819b;
    }

    /* renamed from: b */
    private void m64364b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f52824f >= 120000) {
            this.f52824f = currentTimeMillis;
            if (!this.f52822d.isEmpty()) {
                m64366c();
            }
        }
    }

    private C19529f() {
    }

    /* renamed from: c */
    private void m64366c() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C19483g gVar : this.f52822d) {
            if (!gVar.mo51561b() && currentTimeMillis - gVar.mo51563d() > 600000) {
                arrayList.add(gVar);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f52822d.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo51647a(C19385a aVar) {
        this.f52820a.add(aVar);
    }

    /* renamed from: b */
    public final void mo51651b(C19385a aVar) {
        this.f52820a.remove(aVar);
    }

    /* renamed from: b */
    public final boolean mo51652b(String str) {
        C19483g gVar = (C19483g) this.f52823e.get(str);
        if (gVar == null || !gVar.mo51562c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51654a(final DownloadInfo downloadInfo) {
        this.f52821c.post(new Runnable() {
            public final void run() {
                Iterator it = C19529f.this.f52820a.iterator();
                while (it.hasNext()) {
                    ((C19385a) it.next()).mo51370a(downloadInfo);
                }
            }
        });
    }

    /* renamed from: c */
    public final C19480f mo51658c(String str) {
        if (this.f52823e == null || this.f52823e.size() == 0) {
            return null;
        }
        C19483g gVar = (C19483g) this.f52823e.get(str);
        if (gVar == null || !(gVar instanceof C19480f)) {
            return null;
        }
        return (C19480f) gVar;
    }

    /* renamed from: a */
    public final void mo51648a(String str) {
        m64363a(str, false);
    }

    /* renamed from: a */
    private void m64363a(String str, boolean z) {
        C19483g gVar = (C19483g) this.f52823e.get(str);
        if (gVar != null) {
            gVar.mo51559a(false);
        }
    }

    /* renamed from: b */
    public final void mo51657b(final DownloadInfo downloadInfo, final String str) {
        this.f52821c.post(new Runnable() {
            public final void run() {
                Iterator it = C19529f.this.f52820a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo51656a(final DownloadInfo downloadInfo, final String str) {
        this.f52821c.post(new Runnable() {
            public final void run() {
                Iterator it = C19529f.this.f52820a.iterator();
                while (it.hasNext()) {
                    ((C19385a) it.next()).mo51372a(downloadInfo, str);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo51653a(final C19387c cVar, final C19384a aVar, final C19386b bVar) {
        this.f52821c.post(new Runnable() {
            public final void run() {
                Iterator it = C19529f.this.f52820a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo51655a(final DownloadInfo downloadInfo, final BaseException baseException, final String str) {
        this.f52821c.post(new Runnable() {
            public final void run() {
                Iterator it = C19529f.this.f52820a.iterator();
                while (it.hasNext()) {
                    ((C19385a) it.next()).mo51371a(downloadInfo, baseException, str);
                }
            }
        });
    }

    /* renamed from: b */
    private void m64365b(Context context, int i, C19388d dVar, C19387c cVar) {
        if (this.f52822d.isEmpty()) {
            m64367c(context, i, dVar, cVar);
            return;
        }
        C19483g gVar = (C19483g) this.f52822d.remove(0);
        gVar.mo51553a(context).mo51552a(i, dVar).mo51556a(cVar).mo51557a();
        this.f52823e.put(cVar.mo50992a(), gVar);
    }

    /* renamed from: a */
    public final void mo51646a(Context context, int i, C19388d dVar, C19387c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.mo50992a())) {
            C19483g gVar = (C19483g) this.f52823e.get(cVar.mo50992a());
            if (gVar != null) {
                gVar.mo51553a(context).mo51552a(i, dVar).mo51556a(cVar).mo51557a();
            } else if (!this.f52822d.isEmpty()) {
                m64365b(context, i, dVar, cVar);
            } else {
                m64367c(context, i, dVar, cVar);
            }
        }
    }

    /* renamed from: c */
    private void m64367c(Context context, int i, C19388d dVar, C19387c cVar) {
        if (cVar != null) {
            C19480f fVar = new C19480f();
            fVar.mo51553a(context).mo51552a(i, dVar).mo51556a(cVar).mo51557a();
            this.f52823e.put(cVar.mo50992a(), fVar);
        }
    }
}
