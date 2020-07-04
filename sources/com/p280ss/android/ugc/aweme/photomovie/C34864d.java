package com.p280ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photomovie.d */
final /* synthetic */ class C34864d implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f90928a;

    /* renamed from: b */
    private final PhotoMovieContext f90929b;

    C34864d(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f90928a = photoMovieEditActivity;
        this.f90929b = photoMovieContext;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f90928a.mo88335a(this.f90929b, view);
    }
}
