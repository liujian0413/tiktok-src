package com.p280ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photomovie.e */
final /* synthetic */ class C34865e implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f90930a;

    C34865e(PhotoMovieEditActivity photoMovieEditActivity) {
        this.f90930a = photoMovieEditActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f90930a.mo88334a(view);
    }
}
