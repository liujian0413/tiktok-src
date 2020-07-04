package com.p280ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photomovie.c */
final /* synthetic */ class C34863c implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f90926a;

    /* renamed from: b */
    private final PhotoMovieContext f90927b;

    C34863c(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f90926a = photoMovieEditActivity;
        this.f90927b = photoMovieContext;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f90926a.mo88337b(this.f90927b, view);
    }
}
