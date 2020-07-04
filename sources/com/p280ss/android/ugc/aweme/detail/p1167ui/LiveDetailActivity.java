package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.view.View;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity */
public class LiveDetailActivity extends DetailActivity {
    static {
        BusinessComponentServiceUtils.getLiveAllService().mo103114b();
    }

    /* renamed from: b */
    public static void m86174b(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        Intent intent = new Intent(context, LiveDetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        ActivityCompat.m2905a(context, intent, C0598c.m2487b(view, 0, 0, view.getWidth(), view.getHeight()).mo2580a());
    }
}
