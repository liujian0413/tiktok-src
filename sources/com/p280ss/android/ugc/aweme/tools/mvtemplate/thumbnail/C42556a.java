package com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a */
public final class C42556a {

    /* renamed from: a */
    public static final C42556a f110640a = new C42556a();

    /* renamed from: b */
    private static int f110641b;

    private C42556a() {
    }

    /* renamed from: a */
    public static int m135231a(Context context) {
        C7573i.m23587b(context, "context");
        if (f110641b <= 0) {
            f110641b = (int) (context.getResources().getDimension(R.dimen.co) + 0.5f);
        }
        return f110641b;
    }
}
