package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.d */
final class C2908d {
    /* renamed from: a */
    static void m11392a(Context context) {
        if (context != null) {
            new C9249a(context, 0).mo22718b((int) R.string.fc5).mo22722b(1, (int) R.string.fdl, C2909e.f9132a).mo22722b(0, (int) R.string.elw, (OnClickListener) new C2910f(context)).mo22720b().show();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m11393a(Context context, DialogInterface dialogInterface, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://m.tiktok.com/suicide/help/");
        sb.append(C2907c.m11391a());
        sb.append("?is_live=1");
        sb.append("&title=");
        sb.append(context.getString(R.string.f_z));
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(context, C3979c.m13952b(sb.toString()));
    }
}
