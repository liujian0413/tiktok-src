package com.bytedance.android.livesdk;

import android.widget.PopupWindow.OnDismissListener;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.bytedance.android.livesdk.v */
final /* synthetic */ class C6143v implements OnDismissListener {

    /* renamed from: a */
    private final LottieAnimationView f18097a;

    private C6143v(LottieAnimationView lottieAnimationView) {
        this.f18097a = lottieAnimationView;
    }

    /* renamed from: a */
    static OnDismissListener m19082a(LottieAnimationView lottieAnimationView) {
        return new C6143v(lottieAnimationView);
    }

    public final void onDismiss() {
        this.f18097a.mo7085f();
    }
}
