package com.p280ss.android.ugc.aweme.sdk.p1508b;

import android.content.Context;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.sdk.b.a */
public final class C37317a {
    /* renamed from: a */
    public static boolean m119816a(Context context, Object obj) {
        return m119817a(context, obj, null);
    }

    /* renamed from: a */
    private static boolean m119817a(Context context, Object obj, C6892b<Integer> bVar) {
        if (obj == null || !(obj instanceof Exception)) {
            return false;
        }
        if (obj instanceof ApiServerException) {
            C9738o.m28697a(context, ((ApiServerException) obj).getErrorMsg());
        } else {
            C9738o.m28693a(context, (int) R.string.fqn);
        }
        return true;
    }
}
