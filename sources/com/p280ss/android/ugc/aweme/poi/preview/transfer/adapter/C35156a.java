package com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter;

import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35169i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.adapter.a */
public final class C35156a {

    /* renamed from: a */
    public static final C35156a f91939a = new C35156a();

    private C35156a() {
    }

    /* renamed from: a */
    public static TransferAdapter m113411a(boolean z, C35169i iVar, int i, int i2) {
        C7573i.m23587b(iVar, "transferLayout");
        TransferAdapter previewAdapter = new PreviewAdapter(iVar, i, i2);
        if (z) {
            return new InfiniteTransferAdapterDecorator(previewAdapter);
        }
        return previewAdapter;
    }
}
