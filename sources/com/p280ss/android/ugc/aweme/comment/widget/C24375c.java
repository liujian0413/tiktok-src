package com.p280ss.android.ugc.aweme.comment.widget;

import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.c */
public final class C24375c {

    /* renamed from: a */
    private C24376a f64341a;

    /* renamed from: b */
    private final View f64342b;

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.c$a */
    public interface C24376a {
        /* renamed from: a */
        void mo63199a(int i);
    }

    /* renamed from: a */
    public final void mo63299a(C24376a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f64341a = aVar;
    }

    public C24375c(View view) {
        C7573i.m23587b(view, "watchedView");
        this.f64342b = view;
    }

    /* renamed from: a */
    public final void mo63298a(int i) {
        this.f64342b.setVisibility(i);
        if (this.f64341a != null) {
            C24376a aVar = this.f64341a;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.mo63199a(i);
        }
    }
}
