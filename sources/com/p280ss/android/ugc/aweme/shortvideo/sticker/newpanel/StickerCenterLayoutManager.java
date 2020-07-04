package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40885h.C40886a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.StickerCenterLayoutManager */
public final class StickerCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.StickerCenterLayoutManager$a */
    static final class C40850a extends LinearSmoothScroller {
        public C40850a(Context context) {
            C7573i.m23587b(context, "context");
            super(context);
        }

        /* renamed from: a */
        public final float mo5464a(DisplayMetrics displayMetrics) {
            C7573i.m23587b(displayMetrics, "displayMetrics");
            return C40886a.m130657a();
        }

        /* renamed from: a */
        public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public StickerCenterLayoutManager(Context context, int i, boolean z) {
        C7573i.m23587b(context, "context");
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        C7573i.m23582a((Object) context, "recyclerView.context");
        C40850a aVar = new C40850a(context);
        aVar.f4993g = i;
        mo5755a((C1287r) aVar);
    }

    public StickerCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i, i2);
    }
}
