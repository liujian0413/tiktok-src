package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.d */
final /* synthetic */ class C7941d implements C7326g {

    /* renamed from: a */
    static final C7326g f21506a = new C7941d();

    private C7941d() {
    }

    public final void accept(Object obj) {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }
}
