package com.p280ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.g */
final /* synthetic */ class C35714g implements Runnable {

    /* renamed from: a */
    private final DraftBoxViewHolder f93664a;

    /* renamed from: b */
    private final Bitmap f93665b;

    C35714g(DraftBoxViewHolder draftBoxViewHolder, Bitmap bitmap) {
        this.f93664a = draftBoxViewHolder;
        this.f93665b = bitmap;
    }

    public final void run() {
        this.f93664a.mo90528a(this.f93665b);
    }
}
