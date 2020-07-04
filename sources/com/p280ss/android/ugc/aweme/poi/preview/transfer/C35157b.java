package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c.C35140a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.b */
final class C35157b extends C35178j {
    C35157b(C35169i iVar) {
        super(iVar);
    }

    /* renamed from: e */
    private Drawable m113414e(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        ImageView imageView = (ImageView) transConfig.mo89469b().get(i);
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return transConfig.mo89466a(this.f92048b);
    }

    /* renamed from: a */
    public final TransferImage mo89460a(int i) {
        ImageView imageView = (ImageView) this.f92047a.getTransConfig().mo89469b().get(i);
        TransferImage a = mo89525a(imageView);
        a.setImageDrawable(imageView.getDrawable());
        a.mo89583a(201);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: b */
    public final void mo89462b(int i) {
        Drawable b;
        TransferAdapter transAdapter = this.f92047a.getTransAdapter();
        C35166h transConfig = this.f92047a.getTransConfig();
        String str = (String) transConfig.f91981l.get(i);
        TransferImage a = transAdapter.mo89455a(i);
        if (transConfig.f91976g) {
            b = m113414e(i);
        } else {
            b = m113413b(a, i);
        }
        Drawable drawable = b;
        final C35153c cVar = transConfig.f91984o;
        cVar.mo89451a(i, transAdapter.mo89458b(i));
        C35139c cVar2 = transConfig.f91986q;
        final int i2 = i;
        final TransferImage transferImage = a;
        final C35166h hVar = transConfig;
        C351581 r2 = new C35140a() {
            /* renamed from: a */
            public final void mo89428a() {
                cVar.mo89450a(i2);
            }

            /* renamed from: a */
            public final void mo89429a(int i) {
                switch (i) {
                    case 0:
                        transferImage.setImageDrawable(hVar.mo89468b(C35157b.this.f92048b));
                        break;
                    case 1:
                        cVar.mo89452b(i2);
                        transferImage.mo89583a(202);
                        transferImage.mo89535a();
                        C35157b.this.f92047a.mo89504a((ImageView) transferImage, i2);
                        return;
                }
            }
        };
        cVar2.mo89425a(str, a, drawable, transConfig, r2);
    }

    /* renamed from: c */
    public final TransferImage mo89463c(int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        List b = transConfig.mo89469b();
        if (b.size() <= i || b.get(i) == null) {
            return null;
        }
        TransferImage a = mo89525a((ImageView) b.get(i));
        a.setImageDrawable(this.f92047a.getTransAdapter().mo89455a(transConfig.f91970a).getDrawable());
        a.mo89586b(201);
        this.f92047a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final void mo89461a(TransferImage transferImage, int i) {
        transferImage.setImageDrawable(m113413b(transferImage, i));
    }

    /* renamed from: b */
    private Drawable m113413b(TransferImage transferImage, int i) {
        C35166h transConfig = this.f92047a.getTransConfig();
        Drawable e = m113414e(i);
        int[] iArr = new int[2];
        ImageView imageView = (ImageView) transConfig.mo89469b().get(i);
        if (imageView != null) {
            iArr[0] = imageView.getWidth();
            iArr[1] = imageView.getHeight();
        }
        m113412a(transferImage, e, iArr);
        return e;
    }

    /* renamed from: a */
    private void m113412a(TransferImage transferImage, Drawable drawable, int[] iArr) {
        DisplayMetrics displayMetrics = this.f92048b.getResources().getDisplayMetrics();
        TransferImage transferImage2 = transferImage;
        Drawable drawable2 = drawable;
        transferImage2.mo89585a(drawable2, iArr[0], iArr[1], displayMetrics.widthPixels, mo89527d(displayMetrics.heightPixels));
        transferImage.mo89587f();
    }
}
