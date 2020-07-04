package com.p280ss.android.ugc.aweme.music.p1410ui.viewholder;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicItemDecoration */
public final class SimilarMusicItemDecoration extends C1272h {

    /* renamed from: a */
    public static final float f88638a;

    /* renamed from: b */
    public static final double f88639b;

    /* renamed from: c */
    public static final C33985a f88640c = new C33985a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicItemDecoration$a */
    public static final class C33985a {
        private C33985a() {
        }

        /* renamed from: a */
        public static double m109465a() {
            return SimilarMusicItemDecoration.f88639b;
        }

        public /* synthetic */ C33985a(C7571f fVar) {
            this();
        }
    }

    static {
        float a = ((float) C9738o.m28691a(C6399b.m19921a())) - C9738o.m28708b(C6399b.m19921a(), 33.0f);
        f88638a = a;
        double d = (double) ((a / 2.0f) * 1.3333334f);
        Double.isNaN(d);
        double d2 = d * 0.15d;
        double b = (double) C9738o.m28708b(C6399b.m19921a(), 16.0f);
        Double.isNaN(b);
        f88639b = d2 + b;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        C1262a adapter = recyclerView.getAdapter();
        int i2 = 0;
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (f == i - 1) {
            i2 = (int) f88639b;
        }
        rect.bottom = i2;
    }
}
