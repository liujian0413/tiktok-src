package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b */
final /* synthetic */ class C26482b implements OnClickListener {

    /* renamed from: a */
    private final CategoryNewViewHolder f69849a;

    /* renamed from: b */
    private final Challenge f69850b;

    /* renamed from: c */
    private final Category f69851c;

    /* renamed from: d */
    private final int f69852d;

    C26482b(CategoryNewViewHolder categoryNewViewHolder, Challenge challenge, Category category, int i) {
        this.f69849a = categoryNewViewHolder;
        this.f69850b = challenge;
        this.f69851c = category;
        this.f69852d = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69849a.mo67927a(this.f69850b, this.f69851c, this.f69852d, view);
    }
}
