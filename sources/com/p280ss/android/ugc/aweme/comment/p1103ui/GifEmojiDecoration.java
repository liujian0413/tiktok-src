package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDecoration */
public final class GifEmojiDecoration extends C1272h {

    /* renamed from: a */
    public static final C24279a f64128a = new C24279a(null);

    /* renamed from: b */
    private static final int f64129b = ((int) C9738o.m28708b(C6399b.m19921a(), 4.0f));

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDecoration$a */
    public static final class C24279a {
        private C24279a() {
        }

        public /* synthetic */ C24279a(C7571f fVar) {
            this();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        float f;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        Context a = C6399b.m19921a();
        if (RecyclerView.m5892f(view) != 0) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        int b = (int) C9738o.m28708b(a, f);
        if (C43127fh.m136806a(view.getContext())) {
            rect.set(f64129b, 0, b, 0);
        } else {
            rect.set(b, 0, f64129b, 0);
        }
    }
}
