package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.c */
final /* synthetic */ class C26483c implements OnClickListener {

    /* renamed from: a */
    private final CategoryNewViewHolder f69853a;

    /* renamed from: b */
    private final Music f69854b;

    /* renamed from: c */
    private final Category f69855c;

    C26483c(CategoryNewViewHolder categoryNewViewHolder, Music music, Category category) {
        this.f69853a = categoryNewViewHolder;
        this.f69854b = music;
        this.f69855c = category;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69853a.mo67928a(this.f69854b, this.f69855c, view);
    }
}
