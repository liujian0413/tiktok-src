package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicCoverDecoration */
public final class SimilarMusicCoverDecoration extends C1272h {

    /* renamed from: a */
    public static final C33895a f88457a = new C33895a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicCoverDecoration$a */
    public static final class C33895a {
        private C33895a() {
        }

        public /* synthetic */ C33895a(C7571f fVar) {
            this();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m5892f(view) == 0) {
            i = 0;
        } else {
            i = (int) C9738o.m28708b(view.getContext(), -10.0f);
        }
        if (C43127fh.m136806a(view.getContext())) {
            rect.set(0, 0, i, 0);
        } else {
            rect.set(i, 0, 0, 0);
        }
    }
}
