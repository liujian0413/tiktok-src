package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.a */
final /* synthetic */ class C30766a implements OnClickListener {

    /* renamed from: a */
    private final SearchGifAdapter f80544a;

    /* renamed from: b */
    private final C1293v f80545b;

    C30766a(SearchGifAdapter searchGifAdapter, C1293v vVar) {
        this.f80544a = searchGifAdapter;
        this.f80545b = vVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f80544a.mo80556a(this.f80545b, view);
    }
}
