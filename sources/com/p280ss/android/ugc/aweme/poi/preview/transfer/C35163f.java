package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c.C35140a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.f */
final class C35163f extends C35178j {
    C35163f(C35169i iVar) {
        super(iVar);
    }

    /* renamed from: c */
    public final TransferImage mo89463c(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        List b = transConfig.mo89469b();
        if (b.size() <= i || b.get(i) == null) {
            return null;
        }
        TransferImage a = mo89525a((ImageView) b.get(i));
        mo89526a((String) transConfig.f91982m.get(i), a, false);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final TransferImage mo89460a(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        TransferImage a = mo89525a((ImageView) transConfig.mo89469b().get(i));
        mo89526a((String) transConfig.f91982m.get(i), a, true);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: b */
    public final void mo89462b(int i) {
        TransferAdapter transAdapter = this.f92047a.getTransAdapter();
        C35166h transConfig = this.f92047a.getTransConfig();
        TransferImage a = this.f92047a.getTransAdapter().mo89455a(i);
        C35139c cVar = transConfig.f91986q;
        C35153c cVar2 = transConfig.f91984o;
        cVar2.mo89451a(i, transAdapter.mo89458b(i));
        if (transConfig.f91976g) {
            m113432a(a.getDrawable(), i, a, cVar2);
            return;
        }
        String str = (String) transConfig.f91982m.get(i);
        if (cVar.mo89427a(str)) {
            C35165g gVar = new C35165g(this, transConfig, i, a, cVar2);
            cVar.mo89426a(str, transConfig, gVar);
            return;
        }
        m113432a(transConfig.mo89466a(this.f92048b), i, a, cVar2);
    }

    /* renamed from: a */
    public final void mo89461a(TransferImage transferImage, int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        C35139c cVar = transConfig.f91986q;
        String str = (String) transConfig.f91982m.get(i);
        if (cVar.mo89427a(str)) {
            Drawable a = cVar.mo89423a(str, transConfig);
            if (a == null) {
                transferImage.setImageDrawable(transConfig.mo89466a(this.f92048b));
            } else {
                transferImage.setImageDrawable(a);
            }
        } else {
            transferImage.setImageDrawable(transConfig.mo89466a(this.f92048b));
        }
    }

    /* renamed from: a */
    private void m113432a(Drawable drawable, int i, TransferImage transferImage, C35153c cVar) {
        C35166h transConfig = this.f92047a.getTransConfig();
        C35139c cVar2 = transConfig.f91986q;
        String str = (String) transConfig.f91981l.get(i);
        final C35153c cVar3 = cVar;
        final int i2 = i;
        final TransferImage transferImage2 = transferImage;
        final C35166h hVar = transConfig;
        C351641 r1 = new C35140a() {
            /* renamed from: a */
            public final void mo89428a() {
                cVar3.mo89450a(i2);
            }

            /* renamed from: a */
            public final void mo89429a(int i) {
                switch (i) {
                    case 0:
                        transferImage2.setImageDrawable(hVar.mo89468b(C35163f.this.f92048b));
                        break;
                    case 1:
                        cVar3.mo89452b(i2);
                        transferImage2.mo89535a();
                        C35163f.this.f92047a.mo89504a((ImageView) transferImage2, i2);
                        return;
                }
            }
        };
        cVar2.mo89425a(str, transferImage, drawable, transConfig, r1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89465a(C35166h hVar, int i, TransferImage transferImage, C35153c cVar, Drawable drawable) {
        if (drawable == null) {
            drawable = hVar.mo89466a(this.f92048b);
        }
        m113432a(drawable, i, transferImage, cVar);
    }
}
