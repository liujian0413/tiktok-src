package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.j */
public abstract class C35178j {

    /* renamed from: a */
    protected C35169i f92047a;

    /* renamed from: b */
    protected Context f92048b;

    /* renamed from: a */
    public abstract TransferImage mo89460a(int i);

    /* renamed from: a */
    public abstract void mo89461a(TransferImage transferImage, int i);

    /* renamed from: b */
    public abstract void mo89462b(int i);

    /* renamed from: c */
    public abstract TransferImage mo89463c(int i);

    /* renamed from: a */
    private int m113496a() {
        try {
            Class cls = Class.forName("com.android.internal.R$dimen");
            return this.f92048b.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static int[] m113497a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo89527d(int i) {
        return i - m113496a();
    }

    C35178j(C35169i iVar) {
        this.f92047a = iVar;
        this.f92048b = iVar.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TransferImage mo89525a(ImageView imageView) {
        C35166h transConfig = this.f92047a.getTransConfig();
        int[] iArr = {0, 0};
        if (!transConfig.f91995z) {
            if (transConfig.mo89472e()) {
                iArr = transConfig.mo89473f();
            } else if (imageView != null) {
                iArr = m113497a((View) imageView);
            }
        }
        TransferImage transferImage = new TransferImage(this.f92048b);
        transferImage.setScaleType(ScaleType.FIT_CENTER);
        if (!transConfig.f91995z) {
            if (transConfig.mo89472e()) {
                transferImage.mo89584a(iArr[0], mo89527d(iArr[1]), transConfig.mo89474g(), transConfig.mo89475h());
            } else if (imageView != null) {
                transferImage.mo89584a(iArr[0], mo89527d(iArr[1]), imageView.getWidth(), imageView.getHeight());
            }
            transferImage.setBackgroundColor(transConfig.f91974e);
            transferImage.setDuration(transConfig.f91975f);
            transferImage.setLayoutParams(new LayoutParams(-1, -1));
            transferImage.setOnTransferListener(this.f92047a.getTransListener());
            return transferImage;
        }
        transferImage.mo89584a(iArr[0], mo89527d(iArr[1]), 0, 0);
        transferImage.setBackgroundColor(transConfig.f91974e);
        transferImage.setDuration(transConfig.f91975f);
        transferImage.setLayoutParams(new LayoutParams(-1, -1));
        transferImage.setOnTransferListener(this.f92047a.getTransListener());
        return transferImage;
    }

    /* renamed from: b */
    private void m113498b(String str, TransferImage transferImage, boolean z) {
        C35166h transConfig = this.f92047a.getTransConfig();
        Drawable a = transConfig.f91986q.mo89423a(str, transConfig);
        if (a == null) {
            transferImage.setImageDrawable(transConfig.mo89466a(this.f92048b));
        } else {
            transferImage.setImageDrawable(a);
        }
        if (z) {
            transferImage.mo89588g();
        } else {
            transferImage.mo89592h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo89526a(String str, TransferImage transferImage, boolean z) {
        C35166h transConfig = this.f92047a.getTransConfig();
        C35139c cVar = transConfig.f91986q;
        if (!(this instanceof C35163f) || cVar.mo89427a(str)) {
            m113498b(str, transferImage, z);
            return;
        }
        transferImage.setImageDrawable(transConfig.mo89466a(this.f92048b));
        if (z) {
            transferImage.mo89588g();
        } else {
            transferImage.mo89592h();
        }
    }
}
