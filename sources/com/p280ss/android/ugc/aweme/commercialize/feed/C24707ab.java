package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ab */
final /* synthetic */ class C24707ab implements OnClickListener {

    /* renamed from: a */
    private final RemoteImageView f65155a;

    /* renamed from: b */
    private final String f65156b;

    C24707ab(RemoteImageView remoteImageView, String str) {
        this.f65155a = remoteImageView;
        this.f65156b = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C6903bc.m21470K().mo57879a(this.f65155a.getContext(), this.f65156b);
    }
}
