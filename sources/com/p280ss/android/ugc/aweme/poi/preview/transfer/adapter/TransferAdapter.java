package com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter;

import android.support.p022v4.view.PagerAdapter;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter */
public abstract class TransferAdapter extends PagerAdapter {

    /* renamed from: b */
    protected int f91937b;

    /* renamed from: c */
    protected C35155a f91938c;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter$a */
    public interface C35155a {
        /* renamed from: a */
        void mo89459a();
    }

    /* renamed from: a */
    public abstract TransferImage mo89455a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo89457a();

    /* renamed from: b */
    public abstract FrameLayout mo89458b(int i);

    /* renamed from: a */
    public void mo89456a(C35155a aVar) {
        this.f91938c = aVar;
    }
}
