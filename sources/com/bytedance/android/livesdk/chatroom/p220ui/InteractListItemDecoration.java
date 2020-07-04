package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.InteractListItemDecoration */
public class InteractListItemDecoration extends C1272h {

    /* renamed from: a */
    private static int f14591a = -1;

    /* renamed from: b */
    private static int f14592b = -1;

    /* renamed from: a */
    private static void m16396a(Context context) {
        if (f14591a <= 0) {
            f14591a = (int) C9738o.m28708b(context, 4.0f);
            f14592b = (int) C9738o.m28708b(context, 4.0f);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        m16396a(recyclerView.getContext());
        int g = RecyclerView.m5893g(view);
        if (g == 0) {
            rect.set(f14591a, 0, f14592b, 0);
        } else if (recyclerView.getAdapter().getItemCount() - 1 == g) {
            rect.set(f14592b, 0, f14591a, 0);
        } else {
            rect.set(f14592b, 0, f14592b, 0);
        }
    }
}
