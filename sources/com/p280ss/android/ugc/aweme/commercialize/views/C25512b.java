package com.p280ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.b */
final /* synthetic */ class C25512b implements OnClickListener {

    /* renamed from: a */
    private final AvatarBackgroundImageView f67217a;

    C25512b(AvatarBackgroundImageView avatarBackgroundImageView) {
        this.f67217a = avatarBackgroundImageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f67217a.mo66085a(view);
    }
}
