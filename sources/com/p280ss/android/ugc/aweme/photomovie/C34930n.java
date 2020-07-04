package com.p280ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photomovie.n */
final /* synthetic */ class C34930n implements OnClickListener {

    /* renamed from: a */
    private final PhotoMoviePublishFragment f91108a;

    C34930n(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f91108a = photoMoviePublishFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91108a.mo88370b(view);
    }
}
