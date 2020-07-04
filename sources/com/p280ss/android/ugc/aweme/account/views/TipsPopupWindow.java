package com.p280ss.android.ugc.aweme.account.views;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.account.views.TipsPopupWindow */
public final class TipsPopupWindow extends PopupWindow implements C0042h {
    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        dismiss();
    }

    public final void dismiss() {
        if (isShowing()) {
            C22366d.m74064a(this);
        }
    }
}
