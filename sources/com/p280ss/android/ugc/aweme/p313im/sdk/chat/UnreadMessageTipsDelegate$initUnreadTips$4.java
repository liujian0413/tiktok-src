package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.UnreadMessageTipsDelegate$initUnreadTips$4 */
public final class UnreadMessageTipsDelegate$initUnreadTips$4 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ C31056y f80471a;

    UnreadMessageTipsDelegate$initUnreadTips$4(C31056y yVar) {
        this.f80471a = yVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.f80471a.f81510b) {
            LinearLayoutManager linearLayoutManager = this.f80471a.f81516h;
            if (linearLayoutManager != null) {
                i2 = linearLayoutManager.mo5447l();
            } else {
                i2 = -1;
            }
            if (i2 == this.f80471a.f81514f) {
                recyclerView.mo5521a(0, -this.f80471a.f81515g);
                this.f80471a.f81510b = false;
                return;
            }
            recyclerView.mo5561d(this.f80471a.f81514f);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f80471a.mo81531b();
    }
}
