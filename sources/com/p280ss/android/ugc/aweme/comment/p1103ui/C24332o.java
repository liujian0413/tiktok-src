package com.p280ss.android.ugc.aweme.comment.p1103ui;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.o */
final /* synthetic */ class C24332o implements Runnable {

    /* renamed from: a */
    private final CommentListFragment f64240a;

    /* renamed from: b */
    private final List f64241b;

    /* renamed from: c */
    private final boolean f64242c;

    C24332o(CommentListFragment commentListFragment, List list, boolean z) {
        this.f64240a = commentListFragment;
        this.f64241b = list;
        this.f64242c = z;
    }

    public final void run() {
        this.f64240a.mo63080d(this.f64241b, this.f64242c);
    }
}
