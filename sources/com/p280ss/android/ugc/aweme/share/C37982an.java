package com.p280ss.android.ugc.aweme.share;

import android.widget.ImageView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.share.shareicon.ShareIcon;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.an */
public final class C37982an {
    /* renamed from: a */
    public static int m121298a() {
        int drawable = ShareIcon.build(C7213d.m22500a().mo18803bo().getI18nShareButtonStyle()).getDrawable();
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d == null || d.shareButtonStyleUnite != 1) {
            return drawable;
        }
        if (C6399b.m19946v()) {
            return R.drawable.a8z;
        }
        if (C6399b.m19947w()) {
            return R.drawable.a8x;
        }
        return drawable;
    }

    /* renamed from: b */
    private static int m121300b() {
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d != null && d.shareButtonStyleUnite == 1) {
            if (C6399b.m19946v()) {
                return R.drawable.a8y;
            }
            if (C6399b.m19947w()) {
                return R.drawable.a8x;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m121299a(ImageView imageView) {
        int b = m121300b();
        if (b != 0) {
            imageView.setImageResource(b);
        }
    }
}
