package com.p280ss.android.ugc.aweme.comment.p1103ui;

import com.p280ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.g */
final /* synthetic */ class C24324g implements Runnable {

    /* renamed from: a */
    private final CommentListFragment f64228a;

    /* renamed from: b */
    private final int f64229b;

    /* renamed from: c */
    private final List f64230c;

    /* renamed from: d */
    private final Comment f64231d;

    C24324g(CommentListFragment commentListFragment, int i, List list, Comment comment) {
        this.f64228a = commentListFragment;
        this.f64229b = i;
        this.f64230c = list;
        this.f64231d = comment;
    }

    public final void run() {
        this.f64228a.mo63074a(this.f64229b, this.f64230c, this.f64231d);
    }
}
