package com.bytedance.android.livesdk.p422s;

import android.view.KeyEvent;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p393h.C8291a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.live.C9321a;

/* renamed from: com.bytedance.android.livesdk.s.a */
public class C8912a implements C9321a {

    /* renamed from: a */
    private static volatile C8912a f24281a;

    /* renamed from: b */
    public final void mo22000b() {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* renamed from: a */
    public static C9321a m26658a() {
        if (f24281a == null) {
            synchronized (C8912a.class) {
                if (f24281a == null) {
                    f24281a = new C8912a();
                }
            }
        }
        return f24281a;
    }

    /* renamed from: a */
    public final boolean mo21999a(int i, int i2, KeyEvent keyEvent) {
        C9097a.m27146a().mo22267a((Object) new C8291a(0, i2, keyEvent));
        return false;
    }
}
