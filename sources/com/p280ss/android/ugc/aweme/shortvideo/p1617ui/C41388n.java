package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.common.base.C17439m;
import com.p280ss.android.ugc.aweme.utils.KeyBoardMonitor.C42902a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.n */
public final class C41388n implements C42902a {

    /* renamed from: a */
    LinearLayout f107698a;

    /* renamed from: b */
    private ColorDrawable f107699b;

    /* renamed from: c */
    private ColorDrawable f107700c;

    /* renamed from: a */
    public final void mo102018a() {
        if (VERSION.SDK_INT > 23) {
            if (this.f107700c == null) {
                this.f107700c = new ColorDrawable(this.f107698a.getContext().getResources().getColor(R.color.a7f, null));
            }
            if (this.f107698a.getForeground() != this.f107700c) {
                this.f107698a.setForeground(this.f107700c);
                this.f107698a.getForeground().setAlpha(NormalGiftView.MASK_TRANSLATE_VALUE);
            }
        }
    }

    /* renamed from: b */
    public final void mo102019b() {
        if (VERSION.SDK_INT > 23) {
            if (this.f107699b == null) {
                this.f107699b = new ColorDrawable(this.f107698a.getContext().getResources().getColor(R.color.ayd, null));
            }
            if (this.f107698a.getForeground() != this.f107699b) {
                this.f107698a.setForeground(this.f107699b);
            }
        }
    }

    public C41388n(LinearLayout linearLayout) {
        this.f107698a = (LinearLayout) C17439m.m57962a(linearLayout);
    }
}
