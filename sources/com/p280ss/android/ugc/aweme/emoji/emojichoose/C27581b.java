package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.b */
final /* synthetic */ class C27581b implements OnClickListener {

    /* renamed from: a */
    private final Context f72671a;

    C27581b(Context context) {
        this.f72671a = context;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f72671a.startActivity(SmartRouter.buildRoute(this.f72671a, "emoji_manager").buildIntent());
    }
}
