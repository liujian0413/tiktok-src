package com.bytedance.android.livesdk.utils;

import android.telephony.PhoneStateListener;

/* renamed from: com.bytedance.android.livesdk.utils.aa */
public final class C9030aa extends PhoneStateListener {

    /* renamed from: a */
    private C9031a f24695a;

    /* renamed from: com.bytedance.android.livesdk.utils.aa$a */
    public interface C9031a {
        /* renamed from: a */
        void mo11347a(int i);
    }

    public C9030aa(C9031a aVar) {
        this.f24695a = aVar;
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        if (this.f24695a != null) {
            this.f24695a.mo11347a(i);
        }
    }
}
