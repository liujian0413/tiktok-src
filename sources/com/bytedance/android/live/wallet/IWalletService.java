package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.live.wallet.p178b.p179a.C3644a;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.ILiveWalletService;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.ies.sdk.widgets.DataCenter;
import org.json.JSONObject;
import p346io.reactivex.C7492s;

public interface IWalletService extends ILiveWalletService, IHostWallet {
    public static final int CJ_PAY_DIALOG = 2;
    public static final int CJ_TYPE = 1;
    public static final int HOTSOON_TYPE = 0;
    public static final int JSB_PAY_DIALOG = 0;
    public static final String KEY_BUNDLE_4_MOC = "key_bundle_for_moc";
    public static final String KEY_BUNDLE_BANNER_URL = "key_bundle_banner_url";
    public static final String KEY_BUNDLE_CHARGE_REASON = "KEY_CHARGE_REASON";
    public static final String KEY_BUNDLE_CHARGE_STYLE = "key_bundle_charge_style";
    public static final String KEY_BUNDLE_CHARGE_TYPE = "key_bundle_charge_type";
    public static final String KEY_BUNDLE_FIRST_CHARGE_INFO = "key_bundle_first_charge_info";
    public static final String KEY_BUNDLE_FLAME_FROM = "flame_from";
    public static final String KEY_BUNDLE_IS_ANCHOR = "key_bundle_is_anchor";
    public static final String KEY_BUNDLE_REQUEST_PAGE = "KEY_REQUEST_PAGE";
    public static final String KEY_REQUEST_PAGE = "key_request_page";
    public static final String SERVICE_RECHARGE_WEBVIEW_LOAD = "ttlive_charge_open_fe";
    public static final String SERVICE_RECHARGE_WEBVIEW_LOAD_DETAIL = "ttlive_charge_open_fe_detail";
    public static final int WEBCAST_H5_TYPE = 3;
    public static final int WEBCAST_PAY_DIALOG = 1;
    public static final int WEBCAST_TYPE = 2;

    /* renamed from: com.bytedance.android.live.wallet.IWalletService$a */
    public interface C3597a {
        /* renamed from: a */
        void mo11022a(Dialog dialog, C3777e eVar);
    }

    C3644a getBasePayPresenter(Activity activity, C3628c cVar, String str, String str2, int i, C3669a aVar);

    Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, C3597a aVar, String str);

    Fragment getDiamondRechargeFragment(Context context, Bundle bundle);

    DialogFragment getFirstChargeDealFragment(Context context, Bundle bundle);

    LiveActivityProxy getLiveBillingActivityProxy(FragmentActivity fragmentActivity);

    Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal);

    int getRechargeType();

    Fragment getWalletFragment(Context context, Bundle bundle);

    C7492s<C3479d<FirstChargeCheck>> isFirstCharge();

    int isFirstConsume(IUser iUser);

    void openWallet(Activity activity);

    void setCJStatisticCallback();

    DialogFragment showRechargeDialog(FragmentActivity fragmentActivity, Bundle bundle, DataCenter dataCenter, C3701d dVar);

    void startCJBackgroundTask(Context context);

    C3693c walletCenter();
}
