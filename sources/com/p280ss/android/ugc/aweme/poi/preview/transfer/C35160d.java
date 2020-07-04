package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c.C35140a;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.d */
final class C35160d extends C35178j {
    C35160d(C35169i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final TransferImage mo89460a(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        TransferImage a = mo89525a((ImageView) transConfig.mo89469b().get(i));
        mo89526a((String) transConfig.f91981l.get(i), a, true);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: b */
    public final void mo89462b(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        String str = (String) transConfig.f91981l.get(i);
        TransferImage a = this.f92047a.getTransAdapter().mo89455a(i);
        if (transConfig.f91976g) {
            m113423a(str, a, a.getDrawable(), i);
            return;
        }
        C35139c cVar = transConfig.f91986q;
        C35162e eVar = new C35162e(this, transConfig, str, a, i);
        cVar.mo89426a(str, transConfig, eVar);
    }

    /* renamed from: c */
    public final TransferImage mo89463c(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        List b = transConfig.mo89469b();
        if (b.size() <= i || b.get(i) == null) {
            return null;
        }
        TransferImage a = mo89525a((ImageView) b.get(i));
        mo89526a((String) transConfig.f91981l.get(i), a, false);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final void mo89461a(TransferImage transferImage, int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        Drawable a = transConfig.f91986q.mo89423a((String) transConfig.f91981l.get(i), transConfig);
        if (a == null) {
            transferImage.setImageDrawable(transConfig.mo89466a(this.f92048b));
        } else {
            transferImage.setImageDrawable(a);
        }
    }

    /* renamed from: a */
    private void m113423a(String str, final TransferImage transferImage, Drawable drawable, final int i) {
        final C35166h transConfig = this.f92047a.getTransConfig();
        transConfig.f91986q.mo89425a(str, transferImage, drawable, transConfig, new C35140a() {
            /* renamed from: a */
            public final void mo89428a() {
            }

            /* renamed from: a */
            public final void mo89429a(int i) {
                switch (i) {
                    case 0:
                        transferImage.setImageDrawable(transConfig.mo89468b(C35160d.this.f92048b));
                        break;
                    case 1:
                        if (3 == transferImage.getState()) {
                            transferImage.mo89583a(202);
                        }
                        transferImage.mo89535a();
                        C35160d.this.f92047a.mo89504a((ImageView) transferImage, i);
                        return;
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89464a(C35166h hVar, String str, TransferImage transferImage, int i, Drawable drawable) {
        if (drawable == null) {
            drawable = hVar.mo89466a(this.f92048b);
        }
        m113423a(str, transferImage, drawable, i);
    }
}
