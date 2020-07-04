package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.qrcode.model.C37079a;
import com.p280ss.android.ugc.aweme.qrcode.model.C37080b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.e */
public final class C37031e extends C34029b<C37080b, C37022a> implements C25678f {
    /* renamed from: d */
    public final File mo93476d() {
        if (this.f88765b != null) {
            return ((C37080b) this.f88765b).mo93533b();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            if (((C37079a) ((C37080b) this.f88765b).mData) == null) {
                ((C37022a) this.f88766c).mo93458a(new Exception());
                return;
            }
            ((C37022a) this.f88766c).mo93457a((C37079a) ((C37080b) this.f88765b).mData);
        }
    }

    /* renamed from: a */
    public final boolean mo93475a() {
        if (this.f88765b != null) {
            return ((C37080b) this.f88765b).mo93532a();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f88766c != null) {
            ((C37022a) this.f88766c).mo93458a(exc);
        }
    }

    /* renamed from: a */
    public final void mo93474a(String str) {
        if (this.f88765b != null) {
            ((C37080b) this.f88765b).mo93531a(str);
        }
    }

    public C37031e(C37080b bVar, C37022a aVar) {
        super(bVar, aVar);
        bVar.addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo93473a(int i, String str) {
        ((C37080b) this.f88765b).mo93530a(i, str, null);
    }
}
