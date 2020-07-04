package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.i */
final /* synthetic */ class C31492i implements OnLongClickListener {

    /* renamed from: a */
    private final SessionListViewHolder f82468a;

    /* renamed from: b */
    private final C31494a f82469b;

    C31492i(SessionListViewHolder sessionListViewHolder, C31494a aVar) {
        this.f82468a = sessionListViewHolder;
        this.f82469b = aVar;
    }

    public final boolean onLongClick(View view) {
        return this.f82468a.mo82176b(this.f82469b, view);
    }
}
