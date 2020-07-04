package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop;

import android.app.Activity;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40129c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c */
public final class C40450c implements C40129c {

    /* renamed from: a */
    private final Activity f105168a;

    public C40450c(Activity activity) {
        this.f105168a = activity;
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        C7573i.m23587b(intent, "data");
        if (this.f105168a != null) {
            this.f105168a.setResult(-1, intent);
            this.f105168a.finish();
            this.f105168a.overridePendingTransition(0, R.anim.t);
        }
    }
}
