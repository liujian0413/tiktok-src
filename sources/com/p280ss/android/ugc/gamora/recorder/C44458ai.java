package com.p280ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.ai */
public final class C44458ai {

    /* renamed from: com.ss.android.ugc.gamora.recorder.ai$a */
    static final class C44459a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f114726a;

        /* renamed from: b */
        final /* synthetic */ Activity f114727b;

        C44459a(View view, Activity activity) {
            this.f114726a = view;
            this.f114727b = activity;
        }

        public final void run() {
            int i;
            if (this.f114726a.isShown()) {
                this.f114726a.getLocationOnScreen(new int[2]);
                C10751a a = new C10752a(this.f114727b).mo25738b((int) R.string.dtm).mo25730a(Color.parseColor("#E6FFFFFF")).mo25737a();
                View view = this.f114726a;
                if (C43127fh.m136806a(this.f114727b)) {
                    i = 5;
                } else {
                    i = 3;
                }
                a.mo25719a(view, i, true);
            }
        }
    }

    /* renamed from: a */
    public static final void m140630a(Activity activity, View view) {
        C7573i.m23587b(view, "targetView");
        if (activity != null) {
            activity.isFinishing();
            view.post(new C44459a(view, activity));
        }
    }
}
