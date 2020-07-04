package com.p280ss.android.ugc.aweme.profile.adapter;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.b */
final /* synthetic */ class C35709b implements Runnable {

    /* renamed from: a */
    private final DraftBoxViewHolder f93657a;

    /* renamed from: b */
    private final C27311c f93658b;

    /* renamed from: c */
    private final int f93659c;

    C35709b(DraftBoxViewHolder draftBoxViewHolder, C27311c cVar, int i) {
        this.f93657a = draftBoxViewHolder;
        this.f93658b = cVar;
        this.f93659c = i;
    }

    public final void run() {
        this.f93657a.mo90532b(this.f93658b, this.f93659c);
    }
}
