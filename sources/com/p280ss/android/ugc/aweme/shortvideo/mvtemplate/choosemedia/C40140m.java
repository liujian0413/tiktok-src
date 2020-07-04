package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.m */
final /* synthetic */ class C40140m implements OnClickListener {

    /* renamed from: a */
    private final MvChoosePhotoActivity f104340a;

    C40140m(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f104340a = mvChoosePhotoActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f104340a.mo99823b(view);
    }
}
