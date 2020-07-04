package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.os.Build.VERSION;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.ad.e.f */
public final class C22458f {
    /* renamed from: a */
    public static final void m74330a(TextView textView) {
        int i;
        if (textView != null && VERSION.SDK_INT >= 17) {
            boolean a = C22459g.m74331a(textView.getContext());
            textView.setTextDirection(2);
            if (a) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i);
        }
    }
}
