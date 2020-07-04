package com.p280ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.C28368d;
import com.p280ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.l */
public final class C28397l implements C28368d {

    /* renamed from: a */
    public final Context f74838a;

    public C28397l(Context context) {
        C7573i.m23587b(context, "context");
        this.f74838a = context;
    }

    /* renamed from: a */
    public final void mo72060a(GalleryLayoutManager galleryLayoutManager, View view, float f) {
        C7573i.m23587b(galleryLayoutManager, "layoutManager");
        C7573i.m23587b(view, "page");
        if (f < -1.0f || f > 1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(0.34f);
        } else {
            float abs = ((1.0f - Math.abs(f)) * 0.100000024f) + 0.9f;
            float abs2 = ((1.0f - Math.abs(f)) * 0.65999997f) + 0.34f;
            float abs3 = ((1.0f - Math.abs(f)) * 1.0f) + 7.0f;
            float abs4 = Math.abs(f) * 12.0f;
            view.setScaleX(abs);
            view.setScaleY(abs);
            view.setAlpha(abs2);
            view.setTranslationY(C9738o.m28708b(this.f74838a, abs4));
            RectCornerRelativeLayout rectCornerRelativeLayout = (RectCornerRelativeLayout) view.findViewById(R.id.a34);
            if (rectCornerRelativeLayout != null) {
                rectCornerRelativeLayout.setRadius((int) C9738o.m28708b(this.f74838a, abs3));
            }
        }
    }
}
