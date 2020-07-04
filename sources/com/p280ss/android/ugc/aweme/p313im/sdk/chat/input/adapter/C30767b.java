package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30858b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.b */
final /* synthetic */ class C30767b implements OnClickListener {

    /* renamed from: a */
    private final SearchGifAdapter f80546a;

    /* renamed from: b */
    private final C30858b f80547b;

    C30767b(SearchGifAdapter searchGifAdapter, C30858b bVar) {
        this.f80546a = searchGifAdapter;
        this.f80547b = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f80546a.mo80557a(this.f80547b, view);
    }
}
