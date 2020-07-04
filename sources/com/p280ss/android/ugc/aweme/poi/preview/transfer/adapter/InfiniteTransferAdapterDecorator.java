package com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter.C35155a;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.adapter.InfiniteTransferAdapterDecorator */
public final class InfiniteTransferAdapterDecorator extends TransferAdapter {

    /* renamed from: a */
    public TransferAdapter f91933a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo89457a() {
        return this.f91933a.mo89457a();
    }

    public final int getCount() {
        if (this.f91933a.mo89457a()) {
            return Integer.MAX_VALUE;
        }
        return this.f91933a.getCount();
    }

    /* renamed from: a */
    public final TransferImage mo89455a(int i) {
        return this.f91933a.mo89455a(i);
    }

    /* renamed from: b */
    public final FrameLayout mo89458b(int i) {
        return this.f91933a.mo89458b(i);
    }

    public InfiniteTransferAdapterDecorator(TransferAdapter transferAdapter) {
        C7573i.m23587b(transferAdapter, "adapter");
        this.f91933a = transferAdapter;
    }

    /* renamed from: a */
    public final void mo89456a(C35155a aVar) {
        this.f91933a.mo89456a(aVar);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "container");
        Object instantiateItem = this.f91933a.instantiateItem(viewGroup, i % this.f91933a.getCount());
        C7573i.m23582a(instantiateItem, "adapter.instantiateItem(…position % adapter.count)");
        return instantiateItem;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C7573i.m23587b(view, "p0");
        C7573i.m23587b(obj, "p1");
        return this.f91933a.isViewFromObject(view, obj);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "object");
        this.f91933a.destroyItem(viewGroup, i / this.f91933a.getCount(), obj);
    }
}
