package com.p280ss.android.ugc.aweme.mobile;

import android.app.Activity;
import com.bytedance.ies.uikit.dialog.C11029b;

/* renamed from: com.ss.android.ugc.aweme.mobile.k */
final class C33614k extends C11029b {

    /* renamed from: b */
    public C33615a f87736b;

    /* renamed from: com.ss.android.ugc.aweme.mobile.k$a */
    interface C33615a {
        /* renamed from: a */
        void mo85946a(boolean z);
    }

    C33614k(Activity activity) {
        super(activity);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f87736b != null) {
            this.f87736b.mo85946a(z);
        }
    }
}
