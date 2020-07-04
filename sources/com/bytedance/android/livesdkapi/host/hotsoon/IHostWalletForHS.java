package com.bytedance.android.livesdkapi.host.hotsoon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9432a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9434c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9435d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9437f;
import com.bytedance.android.livesdkapi.host.p453a.C9452m;
import java.util.Map;

public interface IHostWalletForHS extends C2324b, C9452m {
    C9432a getBillingClient(C9437f fVar);

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void openBillingProxyActivity(Context context, Bundle bundle);

    void payWithAli(Activity activity, C9353b bVar, C9435d dVar);

    void payWithWX(Context context, C9353b bVar, C9435d dVar);

    void verifyWithAli(Activity activity, String str, C9434c cVar);
}
