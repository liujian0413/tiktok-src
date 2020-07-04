package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.m */
final /* synthetic */ class C36545m implements OnClickListener {

    /* renamed from: a */
    private final C36481a f95935a;

    /* renamed from: b */
    private final HotSearchSprintStruct f95936b;

    C36545m(C36481a aVar, HotSearchSprintStruct hotSearchSprintStruct) {
        this.f95935a = aVar;
        this.f95936b = hotSearchSprintStruct;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95935a.mo92634a(this.f95936b, view);
    }
}
