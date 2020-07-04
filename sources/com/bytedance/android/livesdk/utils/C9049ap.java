package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.utils.ap */
public final class C9049ap {
    /* renamed from: a */
    public static void m27022a(int i) {
        m27023a(i, 0);
    }

    /* renamed from: a */
    public static void m27028a(String str) {
        m27029a(str, 0);
    }

    /* renamed from: a */
    public static void m27023a(int i, int i2) {
        Context e = C3358ac.m12528e();
        if (e != null) {
            m27029a(e.getString(i), i2);
        }
    }

    /* renamed from: a */
    public static void m27024a(Context context, int i) {
        m27025a(context, i, 0);
    }

    /* renamed from: a */
    public static void m27026a(Context context, String str) {
        m27027a(context, str, 0);
    }

    /* renamed from: a */
    public static void m27029a(String str, int i) {
        Context e = C3358ac.m12528e();
        if (e != null && !TextUtils.isEmpty(str)) {
            if (C9095y.m27140b()) {
                TextView textView = (TextView) ((LayoutInflater) e.getSystemService("layout_inflater")).inflate(R.layout.axh, null);
                if (textView != null) {
                    Toast toast = new Toast(e);
                    toast.setGravity(17, 0, 0);
                    toast.setView(textView);
                    toast.setDuration(i);
                    textView.setText(str);
                    C9050aq.m27030a(toast);
                    return;
                }
                return;
            }
            ((IHostApp) C3596c.m13172a(IHostApp.class)).centerToast(e, str, i);
        }
    }

    /* renamed from: a */
    private static void m27025a(Context context, int i, int i2) {
        if (context == null) {
            context = C3358ac.m12528e();
        }
        m27027a(context, context.getString(i), 0);
    }

    /* renamed from: a */
    private static void m27027a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            ((IHostApp) C3596c.m13172a(IHostApp.class)).systemToast(context, str, i);
        }
    }
}
