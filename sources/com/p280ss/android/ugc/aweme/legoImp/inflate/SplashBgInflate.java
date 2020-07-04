package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate */
public class SplashBgInflate implements LegoInflate {
    private Drawable splashBgDrawable;

    public Class<? extends Activity> activity() {
        return null;
    }

    public int theme() {
        return R.style.gu;
    }

    public Drawable getSplashBgDrawable(Context context) {
        if (this.splashBgDrawable != null) {
            Drawable drawable = this.splashBgDrawable;
            this.splashBgDrawable = null;
            return drawable;
        }
        try {
            return context.getResources().getDrawable(R.drawable.splash_bg_normal);
        } catch (Exception unused) {
            return null;
        }
    }

    public void inflate(Context context, Activity activity) {
        try {
            this.splashBgDrawable = context.getResources().getDrawable(R.drawable.splash_bg_normal);
        } catch (Exception unused) {
        }
    }
}
