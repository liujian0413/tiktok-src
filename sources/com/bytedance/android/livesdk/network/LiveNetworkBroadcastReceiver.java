package com.bytedance.android.livesdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class LiveNetworkBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    NetworkType f23716a = NetworkType.NONE;

    /* renamed from: b */
    private List<WeakReference<C8704a>> f23717b = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver$a */
    public interface C8704a {
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            NetworkType networkType = this.f23716a;
            this.f23716a = NetworkUtils.getNetworkType(context);
            if (this.f23717b != null && networkType != this.f23716a) {
                for (WeakReference weakReference : this.f23717b) {
                    if (weakReference != null) {
                        weakReference.get();
                    }
                }
            }
        }
    }
}
