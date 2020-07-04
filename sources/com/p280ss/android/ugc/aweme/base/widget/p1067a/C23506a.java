package com.p280ss.android.ugc.aweme.base.widget.p1067a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.a.a */
public final class C23506a implements OnClickListener {

    /* renamed from: a */
    public boolean f62020a;

    /* renamed from: b */
    public OnClickListener f62021b;

    /* renamed from: c */
    private boolean f62022c;

    /* renamed from: a */
    public static C23506a m77197a(OnClickListener onClickListener) {
        return m77198a(onClickListener, true);
    }

    public final void onClick(final View view) {
        ClickInstrumentation.onClick(view);
        if (!this.f62022c) {
            this.f62021b.onClick(view);
        } else if (!this.f62020a) {
            this.f62020a = true;
            C23485m.m77117a(new Runnable() {
                public final void run() {
                    C23506a.this.f62021b.onClick(view);
                    C23506a.this.f62020a = false;
                }
            }, (long) C23481i.m77093d(R.integer.j));
        }
    }

    private C23506a(OnClickListener onClickListener, boolean z) {
        this.f62021b = onClickListener;
        this.f62022c = z;
    }

    /* renamed from: a */
    private static C23506a m77198a(OnClickListener onClickListener, boolean z) {
        boolean z2;
        if (onClickListener == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 21) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C23506a(onClickListener, z2);
    }
}
