package com.bytedance.android.livesdk.feed.live;

import android.widget.PopupWindow.OnDismissListener;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.bytedance.android.livesdk.feed.live.e */
final /* synthetic */ class C6054e implements OnDismissListener {

    /* renamed from: a */
    private final LottieAnimationView f17940a;

    private C6054e(LottieAnimationView lottieAnimationView) {
        this.f17940a = lottieAnimationView;
    }

    /* renamed from: a */
    static OnDismissListener m18948a(LottieAnimationView lottieAnimationView) {
        return new C6054e(lottieAnimationView);
    }

    public final void onDismiss() {
        this.f17940a.mo7085f();
    }
}
