package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.wschannel.C9758c;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.server.NetworkUtils.NetworkType;

public class WsChannelReceiver extends BroadcastReceiver {

    /* renamed from: c */
    private static boolean f26791c;

    /* renamed from: a */
    private boolean f26792a = true;

    /* renamed from: b */
    private NetworkType f26793b = NetworkUtils.m29011a(C9758c.m28774a());

    /* renamed from: a */
    private static void m29014a(Context context) {
        try {
            boolean a = C9817d.m28950a(context).mo24286a();
            if (a != f26791c) {
                f26791c = a;
            }
        } catch (Throwable unused) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.f26792a) {
                this.f26792a = false;
                if (NetworkUtils.m29011a(C9758c.m28774a()) == this.f26793b) {
                    return;
                }
            }
            m29014a(context);
            if (f26791c) {
                try {
                    int b = NetworkUtils.m29012b(context);
                    Intent intent2 = new Intent(context, WsChannelService.class);
                    intent2.setAction("com.bytedance.article.wschannel.networkstate");
                    intent2.putExtra("network_state", b);
                    context.startService(intent2);
                } catch (Exception unused) {
                }
            }
        }
    }
}
