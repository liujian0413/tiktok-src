package com.p280ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.utils.NetworkUtils;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetworkReceiver */
public class NetworkReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C29958a.m98224a(NetworkUtils.m136225b(context));
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!NetworkUtils.m136224a(context)) {
                C7705c.m23799a().mo20394d(new C25710e(0));
            } else if (NetworkUtils.m136226c(context)) {
                C7705c.m23799a().mo20394d(new C25710e(2));
            } else if (NetworkUtils.m136227d(context)) {
                C7705c.m23799a().mo20394d(new C25710e(1));
            }
        }
    }
}
