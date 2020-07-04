package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.p453a.C9452m;
import com.bytedance.android.livesdkapi.p457i.C9486m;
import java.util.List;
import java.util.Map;

public interface IHostWallet extends C9452m {
    public static final String SHOW_EXCHANGE_SCORE = "show_exchange_score";
    public static final String VIGO_FIRST_CHARGE_BOTTOM_RIGHT_ENTRANCE = "vigo_first_charge_bottom_right_entrance";
    public static final String VIGO_FIRST_CHARGE_DEAL_CLICK = "vigo_first_charge_deal_click";
    public static final String VIGO_FIRST_CHARGE_NOTICE_DIALOG_ENTRANCE = "vigo_first_charge_notice_dialog_entrance";

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$a */
    public interface C9432a {
        /* renamed from: a */
        int mo23184a(Activity activity, String str);

        /* renamed from: a */
        C9436e mo23185a();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$b */
    public interface C9433b {
        /* renamed from: a */
        void mo11139a(int i, String str);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$c */
    public interface C9434c {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$d */
    public interface C9435d {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$e */
    public interface C9436e {
        /* renamed from: a */
        int mo23186a();

        /* renamed from: b */
        List<C9486m> mo23187b();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$f */
    public interface C9437f {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$g */
    public interface C9438g {
        /* renamed from: a */
        void mo11151a(int i, List<HsSkuDetail> list);
    }

    C9432a getBillingClient(C9437f fVar);

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void openBillingProxyActivity(Context context, Bundle bundle);

    void payWithAli(Activity activity, C9353b bVar, C9435d dVar);

    void payWithWX(Context context, C9353b bVar, C9435d dVar);

    void verifyWithAli(Activity activity, String str, C9434c cVar);
}
