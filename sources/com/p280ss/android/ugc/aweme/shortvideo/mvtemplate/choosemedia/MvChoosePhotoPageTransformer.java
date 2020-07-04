package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.support.p022v4.view.ViewPager.C0936f;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoPageTransformer */
public class MvChoosePhotoPageTransformer implements C0936f {
    /* renamed from: a */
    public final void mo3622a(View view, float f) {
        float f2 = -f;
        view.setTranslationX(((float) view.getWidth()) * f2);
        if (view.getId() == R.id.f0) {
            view.setTranslationY(f2 * ((float) view.getHeight()));
        } else {
            view.setTranslationY(0.0f);
        }
    }
}
