package com.bytedance.android.live.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PhoneStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C2402a f7934a;

    /* renamed from: com.bytedance.android.live.broadcast.PhoneStateReceiver$a */
    public interface C2402a {
        /* renamed from: a */
        void mo8769a(String str);
    }

    public PhoneStateReceiver(C2402a aVar) {
        this.f7934a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            this.f7934a.mo8769a(intent.getStringExtra("state"));
        }
    }
}
