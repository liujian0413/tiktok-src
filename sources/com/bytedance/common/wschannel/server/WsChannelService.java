package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.bytedance.common.wschannel.app.AbsMessengerService;
import com.bytedance.common.wschannel.app.IWsApp;

public class WsChannelService extends AbsMessengerService {

    /* renamed from: com.bytedance.common.wschannel.server.WsChannelService$a */
    static class C9828a {

        /* renamed from: a */
        int f26794a;

        /* renamed from: b */
        byte[] f26795b;

        C9828a() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        C9829a.m29017a((Context) this);
    }

    /* renamed from: a */
    static int m29015a(IWsApp iWsApp) {
        if (iWsApp == null) {
            return Integer.MIN_VALUE;
        }
        return iWsApp.mo24145a();
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message != null) {
            C9829a.m29017a((Context) this).handleMsg(message);
        }
    }

    /* renamed from: a */
    private void m29016a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.appstate".equals(action)) {
                int intExtra = intent.getIntExtra("app_state", -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                handleMsg(message);
                return;
            }
            if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
                int intExtra2 = intent.getIntExtra("network_state", -1);
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = intExtra2;
                handleMsg(message2);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m29016a(intent);
        return 1;
    }
}
