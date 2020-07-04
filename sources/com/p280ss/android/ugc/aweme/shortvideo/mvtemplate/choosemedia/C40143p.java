package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p */
final /* synthetic */ class C40143p implements OnClickListener {

    /* renamed from: a */
    private final MvChoosePhotoActivity f104343a;

    C40143p(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f104343a = mvChoosePhotoActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f104343a.mo99818a(view);
    }
}
