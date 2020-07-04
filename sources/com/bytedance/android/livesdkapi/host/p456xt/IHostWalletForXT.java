package com.bytedance.android.livesdkapi.host.p456xt;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9435d;
import com.bytedance.android.livesdkapi.host.p453a.C9452m;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostWalletForXT */
public interface IHostWalletForXT extends C2324b, C9452m {
    String getCJAppId();

    String getCJMerchantId();

    void payWithAli(Activity activity, C9353b bVar, C9435d dVar);

    void payWithWX(Context context, C9353b bVar, C9435d dVar);
}
