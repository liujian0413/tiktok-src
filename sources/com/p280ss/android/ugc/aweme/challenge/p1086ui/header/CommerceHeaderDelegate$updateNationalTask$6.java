package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.CommerceHeaderDelegate$updateNationalTask$6 */
public final class CommerceHeaderDelegate$updateNationalTask$6 extends C1272h {
    CommerceHeaderDelegate$updateNationalTask$6() {
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.left = C23486n.m77122a(14.0d);
        }
        C1262a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount() - 1;
        } else {
            i = -1;
        }
        if (f == i) {
            rect.right = C23486n.m77122a(14.0d);
        } else {
            rect.right = C23486n.m77122a(4.0d);
        }
    }
}
