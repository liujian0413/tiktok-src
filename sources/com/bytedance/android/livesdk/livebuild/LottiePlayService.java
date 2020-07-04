package com.bytedance.android.livesdk.livebuild;

import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.room.C3492i;
import com.bytedance.android.livesdk.commerce.coupon.C5843a;
import com.bytedance.android.livesdk.p397k.C8362l;

public class LottiePlayService implements C3492i {
    private C5843a lottieHelper;

    public void startLotteryFullAnimation(C8362l lVar, LottieAnimationView lottieAnimationView, boolean z) {
        if (this.lottieHelper == null) {
            this.lottieHelper = new C5843a();
        }
        this.lottieHelper.mo14349a(lVar, lottieAnimationView, z);
    }
}
