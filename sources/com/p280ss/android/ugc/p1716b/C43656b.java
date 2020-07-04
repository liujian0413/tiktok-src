package com.p280ss.android.ugc.p1716b;

import android.content.Context;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1717a.C43652b;
import com.p280ss.android.ugc.p1716b.p1717a.C43653c;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;
import com.p280ss.android.ugc.p1716b.p1717a.C43655e;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.p280ss.android.ugc.p1716b.p1720d.C43663a;

/* renamed from: com.ss.android.ugc.b.b */
public final class C43656b {

    /* renamed from: a */
    public boolean f112966a;

    /* renamed from: b */
    private C43663a f112967b = new C43663a();

    /* renamed from: a */
    public final void mo105607a(String str, String str2, boolean z) {
        if (this.f112967b != null) {
            this.f112967b.mo105623a(str, str2, z);
        }
    }

    /* renamed from: a */
    public final void mo105606a(C44849d dVar) {
        if (this.f112967b != null) {
            this.f112967b.f112999c = dVar;
        }
    }

    /* renamed from: b */
    public final void mo105608b() {
        if (this.f112967b != null) {
            this.f112967b.mo105624b();
        }
    }

    public C43656b() {
        m138310a(C43659c.m138324a().f112989c);
        m138311c();
    }

    /* renamed from: a */
    public final void mo105598a() {
        if (this.f112967b != null) {
            this.f112967b.mo105619a();
        }
    }

    /* renamed from: c */
    private void m138311c() {
        String c = C43659c.m138324a().mo105615c();
        String b = C43659c.m138324a().mo105614b();
        if (!C43650a.m138299a(c)) {
            C43650a.m138298a(c, false);
        }
        if (!C43650a.m138299a(b)) {
            C43650a.m138298a(b, false);
        }
        if (this.f112967b != null) {
            this.f112967b.f113003g = b;
        }
    }

    /* renamed from: a */
    public final void mo105604a(C43657a aVar) {
        mo105605a(aVar, true);
    }

    /* renamed from: a */
    private void m138310a(Context context) {
        if (this.f112967b != null) {
            this.f112967b.mo105620a(context);
        }
    }

    /* renamed from: b */
    public final void mo105609b(C43657a aVar) {
        if (aVar.f112969b == 4 && this.f112967b != null) {
            if (this.f112966a) {
                this.f112967b.mo105625b(aVar);
                return;
            }
            this.f112967b.mo105621a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo105599a(C43651a aVar) {
        if (this.f112967b != null) {
            this.f112967b.f112998b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo105600a(C43652b bVar) {
        if (this.f112967b != null) {
            this.f112967b.f113001e = bVar;
        }
    }

    /* renamed from: a */
    public final void mo105601a(C43653c cVar) {
        if (this.f112967b != null) {
            this.f112967b.f113002f = cVar;
        }
    }

    /* renamed from: a */
    public final void mo105602a(C43654d dVar) {
        if (this.f112967b != null) {
            this.f112967b.f112997a = dVar;
        }
    }

    /* renamed from: a */
    public final void mo105603a(C43655e eVar) {
        if (this.f112967b != null) {
            this.f112967b.f113000d = eVar;
        }
    }

    /* renamed from: a */
    public final void mo105605a(C43657a aVar, boolean z) {
        if (!(aVar == null || aVar.f112969b != 4 || this.f112967b == null)) {
            this.f112967b.mo105622a(aVar, z);
        }
    }
}
