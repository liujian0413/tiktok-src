package com.p280ss.android.ugc.aweme.app.application.task.p1026a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.trill.app.C44981a;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.a.a */
public final class C22870a implements Runnable {

    /* renamed from: a */
    private static boolean f60592a;

    public final void run() {
        C44981a.m141935a(23, C22871b.f60593a);
    }

    /* renamed from: a */
    public static void m75334a() {
        if (!f60592a) {
            f60592a = true;
            new C22870a().run();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m75335b() {
        try {
            String[] stringArray = AwemeApplication.m21341a().getResources().getStringArray(R.array.ay);
            int length = stringArray.length;
            int i = 0;
            while (i < length) {
                if (!TextUtils.equals(Build.MODEL.toLowerCase(), stringArray[i].toLowerCase())) {
                    i++;
                } else {
                    return;
                }
            }
            try {
                new WebView(TrillApplication.m21341a()).destroy();
            } catch (NoSuchMethodError e) {
                C6921a.m21559a((Throwable) e);
            }
        } catch (Exception e2) {
            C6921a.m21554a(e2);
        }
    }
}
