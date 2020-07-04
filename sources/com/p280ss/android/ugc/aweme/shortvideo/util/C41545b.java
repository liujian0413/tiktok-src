package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import dmt.p1861av.video.p1863b.C47450e;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b */
public final class C41545b implements Callback {

    /* renamed from: a */
    private HashMap<String, C41562n> f108014a;

    /* renamed from: b */
    private Handler f108015b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b$a */
    static class C41547a {

        /* renamed from: a */
        public static C41545b f108016a = new C41545b();
    }

    /* renamed from: a */
    public static C41545b m132307a() {
        return C41547a.f108016a;
    }

    private C41545b() {
        this.f108014a = new HashMap<>();
        this.f108015b = new Handler(C41552f.m132326a(), this);
    }

    /* renamed from: a */
    public final void mo102188a(String str) {
        m132309a(str, 1);
    }

    /* renamed from: b */
    public final void mo102189b(String str) {
        m132309a(str, 2);
    }

    /* renamed from: c */
    public final void mo102190c(String str) {
        m132309a(str, 3);
    }

    /* renamed from: a */
    private void m132308a(Message message) {
        C41562n nVar = new C41562n();
        C41518ad adVar = (C41518ad) message.obj;
        nVar.f108031a.add(Long.valueOf(adVar.f107978a));
        this.f108014a.put(adVar.f107979b, nVar);
    }

    /* renamed from: b */
    private void m132310b(Message message) {
        C41518ad adVar = (C41518ad) message.obj;
        C41562n nVar = (C41562n) this.f108014a.get(adVar.f107979b);
        if (nVar != null) {
            nVar.f108031a.add(Long.valueOf(adVar.f107978a));
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m132308a(message);
                break;
            case 2:
                m132310b(message);
                break;
            case 3:
                m132311c(message);
                break;
        }
        return false;
    }

    /* renamed from: c */
    private void m132311c(Message message) {
        C41518ad adVar = (C41518ad) message.obj;
        C41562n nVar = (C41562n) this.f108014a.remove(adVar.f107979b);
        if (nVar != null) {
            nVar.f108031a.add(Long.valueOf(adVar.f107978a));
            int size = nVar.f108031a.size();
            if (size > 1) {
                C6869c a = C6869c.m21381a();
                int i = 0;
                while (i < size - 1) {
                    StringBuilder sb = new StringBuilder("step");
                    int i2 = i + 1;
                    sb.append(i2);
                    a.mo16886a(sb.toString(), Long.valueOf(((Long) nVar.f108031a.get(i2)).longValue() - ((Long) nVar.f108031a.get(i)).longValue()));
                    i = i2;
                }
                a.mo16886a("totaltime", Long.valueOf(((Long) nVar.f108031a.get(nVar.f108031a.size() - 1)).longValue() - ((Long) nVar.f108031a.get(0)).longValue()));
                a.mo16882a("useVERecoder", Boolean.valueOf(C47450e.m148163a()));
                C6893q.m21447a(adVar.f107979b, a.mo16888b());
                nVar.f108031a.clear();
            }
        }
    }

    /* renamed from: a */
    private void m132309a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            Message obtain = Message.obtain();
            obtain.what = i;
            C41518ad adVar = new C41518ad();
            adVar.f107978a = System.currentTimeMillis();
            adVar.f107979b = str;
            obtain.obj = adVar;
            this.f108015b.sendMessage(obtain);
        }
    }
}
