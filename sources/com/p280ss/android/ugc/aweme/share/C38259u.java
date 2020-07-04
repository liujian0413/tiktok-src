package com.p280ss.android.ugc.aweme.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.u */
final /* synthetic */ class C38259u implements OnClickListener {

    /* renamed from: a */
    private final PhotoUploadSuccessPopView f99426a;

    /* renamed from: b */
    private final Aweme f99427b;

    /* renamed from: c */
    private final C25000i f99428c;

    C38259u(PhotoUploadSuccessPopView photoUploadSuccessPopView, Aweme aweme, C25000i iVar) {
        this.f99426a = photoUploadSuccessPopView;
        this.f99427b = aweme;
        this.f99428c = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f99426a.mo95465a(this.f99427b, this.f99428c, view);
    }
}
