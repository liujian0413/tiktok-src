package com.p280ss.android.ugc.effectmanager.effect.p1733c;

import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43789f;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43792i;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43812g;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43818m;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.d */
public final class C43777d implements C43744a {

    /* renamed from: a */
    private C43834g f113262a = this.f113263b.f113068a;

    /* renamed from: b */
    private C43680a f113263b;

    /* renamed from: c */
    private Handler f113264c = new C43743j(this);

    public C43777d(C43680a aVar) {
        this.f113263b = aVar;
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        switch (message.what) {
            case 40:
                if (message.obj instanceof C43789f) {
                    C43789f fVar = (C43789f) message.obj;
                    C43766p j = this.f113262a.f113508B.mo106053j(fVar.f113219a);
                    if (j != null) {
                        if (!fVar.f113296b) {
                            j.mo101169a(fVar.f113298d);
                            break;
                        } else {
                            j.mo101170a(fVar.f113297c);
                            return;
                        }
                    }
                }
                break;
            case BaseNotice.LIKE /*41*/:
                if (message.obj instanceof C43792i) {
                    C43792i iVar = (C43792i) message.obj;
                    C43761k k = this.f113262a.f113508B.mo106054k(iVar.f113219a);
                    if (k != null) {
                        if (iVar.f113303b == null) {
                            k.mo101301a(iVar.f113304c);
                            break;
                        } else {
                            k.mo101300a(iVar.f113303b);
                        }
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo105828a(String str, String str2) {
        this.f113262a.f113527r.mo105782a((C43724a) new C43818m(this.f113263b, str, str2, this.f113264c));
    }

    /* renamed from: a */
    public final void mo105829a(String str, List<String> list, Boolean bool, String str2) {
        C43812g gVar = new C43812g(this.f113263b, str, str2, this.f113264c, list, bool.booleanValue());
        this.f113262a.f113527r.mo105782a((C43724a) gVar);
    }
}
