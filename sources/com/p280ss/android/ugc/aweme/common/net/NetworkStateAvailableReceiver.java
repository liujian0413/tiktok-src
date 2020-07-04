package com.p280ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.NetworkUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver */
public final class NetworkStateAvailableReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (C7573i.m23585a((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) intent.getAction())) {
                if (NetworkUtils.m136224a(context)) {
                    C42961az.m136380a(new C25709d(true));
                    return;
                }
                C42961az.m136380a(new C25709d(false));
            }
        }
    }
}
