package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9435d;
import com.bytedance.android.livesdkapi.host.p453a.C9452m;
import java.util.Map;

public interface IHostWalletForDouyin extends C2324b, C9452m {
    public static final String SHOW_EXCHANGE_SCORE = "show_exchange_score";
    public static final String VIGO_FIRST_CHARGE_BOTTOM_RIGHT_ENTRANCE = "vigo_first_charge_bottom_right_entrance";
    public static final String VIGO_FIRST_CHARGE_DEAL_CLICK = "vigo_first_charge_deal_click";
    public static final String VIGO_FIRST_CHARGE_NOTICE_DIALOG_ENTRANCE = "vigo_first_charge_notice_dialog_entrance";

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void payWithWX(Context context, C9353b bVar, C9435d dVar);
}
