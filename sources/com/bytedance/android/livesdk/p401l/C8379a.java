package com.bytedance.android.livesdk.p401l;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.bytedance.android.livesdk.l.a */
public final class C8379a implements OnCancelListener, C6310a {

    /* renamed from: a */
    public boolean f22967a;

    /* renamed from: b */
    private Handler f22968b;

    /* renamed from: c */
    private boolean f22969c;

    /* renamed from: b */
    public final void mo21535b() {
        this.f22968b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo21534a() {
        this.f22968b.removeCallbacksAndMessages(null);
        if (!this.f22967a && !TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            this.f22968b.sendEmptyMessageDelayed(1, 180000);
            this.f22969c = true;
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo21534a();
    }
}
