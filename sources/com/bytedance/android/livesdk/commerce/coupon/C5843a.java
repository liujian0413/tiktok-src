package com.bytedance.android.livesdk.commerce.coupon;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.C1707c;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1780i;
import com.airbnb.lottie.C1833n;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.livebuild.C8404a;
import com.bytedance.android.livesdk.livebuild.C8406c;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.common.utility.C9738o;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.commerce.coupon.a */
public final class C5843a {

    /* renamed from: a */
    public Map<String, C1757f> f17202a = new WeakHashMap();

    /* renamed from: a */
    private void m18307a(LottieAnimationView lottieAnimationView, final HashMap<String, Bitmap> hashMap) {
        if (lottieAnimationView != null && hashMap != null) {
            lottieAnimationView.setImageAssetDelegate(new C1707c() {
                /* renamed from: a */
                public final Bitmap mo7162a(C1780i iVar) {
                    if (iVar == null) {
                        return null;
                    }
                    String str = iVar.f6397d;
                    if (TextUtils.isEmpty(str) || !hashMap.containsKey(str)) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) hashMap.get(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return null;
                    }
                    return bitmap;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo14349a(final C8362l lVar, final LottieAnimationView lottieAnimationView, final boolean z) {
        if (lVar != null && lVar.f22920b != null && lVar.f22921c != null && lottieAnimationView != null) {
            C9738o.m28712b((View) lottieAnimationView, 0);
            lottieAnimationView.mo7085f();
            lottieAnimationView.setProgress(0.0f);
            m18307a(lottieAnimationView, lVar.f22923e);
            C1757f fVar = (C1757f) this.f17202a.get(lVar.f22920b);
            if (fVar == null) {
                try {
                    C8404a.m25573a(C8406c.class);
                    lottieAnimationView.getContext();
                    new C1833n() {
                        /* renamed from: a */
                        public final void mo7330a(C1757f fVar) {
                            if (fVar != null) {
                                try {
                                    C5843a.this.f17202a.put(lVar.f22920b, fVar);
                                    lottieAnimationView.setComposition(fVar);
                                    if (z) {
                                        lottieAnimationView.mo7078b();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    };
                } catch (Exception unused) {
                }
                return;
            }
            lottieAnimationView.setComposition(fVar);
            if (z) {
                lottieAnimationView.mo7078b();
            }
        }
    }
}
