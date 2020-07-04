package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.model.C3813c;
import com.bytedance.android.live.wallet.model.C3817d;
import com.bytedance.android.live.wallet.model.C3819f;
import com.bytedance.android.live.wallet.model.C3820g;
import com.bytedance.android.live.wallet.model.C3822h;
import com.bytedance.android.live.wallet.model.C3823i;
import com.bytedance.android.live.wallet.model.C3824j;
import com.bytedance.android.live.wallet.model.C3826k;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.livesdkapi.depend.model.C9343a;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.p446b.C9354a;
import com.bytedance.android.livesdkapi.p457i.C9476d;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7492s;

public interface WalletApi {
    @C6456g
    @C6468s(mo15750a = "/hotsoon/props/bundles/buy/")
    C7492s<C3479d<C3819f>> buyPackage(@C6455f HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/hotsoon/ward/buy/")
    C7492s<C3479d<C3819f>> buyWard(@C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/hotsoon/diamond/{dealId}/_buy/")
    C7492s<C3479d<C9353b>> createOrder(@C6472w(mo15754a = "dealId") long j, @C6474y(mo15757a = "way") String str, @C6474y(mo15757a = "email") String str2, @C6474y(mo15757a = "pay_currency") String str3, @C6474y(mo15757a = "pay_method") String str4);

    @C6457h(mo15740a = "/hotsoon/diamond/{dealId}/_buy/")
    C7492s<String> createOrderInfo(@C6472w(mo15754a = "dealId") String str, @C6474y(mo15757a = "way") int i, @C6474y(mo15757a = "pay_currency") String str2);

    @C6456g
    @C6468s(mo15750a = "/webcast/wallet/recharge/")
    C7492s<C3479d<C3813c>> createOrderInfo(@C6454e(mo15737a = "diamond_id") String str, @C6454e(mo15737a = "currency") String str2);

    @C6457h(mo15740a = "/webcast/wallet_api/diamond_buy/")
    C7492s<C3479d<C9354a>> createPreOrder(@C6474y(mo15757a = "diamond_id") long j, @C6474y(mo15757a = "way") int i, @C6474y(mo15757a = "source") int i2, @C6474y(mo15757a = "currency") String str);

    @C6457h(mo15740a = "/webcast/wallet_api/diamond_exchange/")
    C7492s<C3479d<Object>> diamondExchange(@C6474y(mo15757a = "diamond_count") long j);

    @C6457h(mo15740a = "/hotsoon/wallet/payment_channels/")
    C7492s<C3478c<C3817d>> fetchOptionList();

    @C6457h(mo15740a = "/hotsoon/wallet/pay/")
    C7492s<C3479d<Object>> flameChangeDiamond(@C6474y(mo15757a = "diamond_id") String str, @C6474y(mo15757a = "way") String str2);

    @C6457h(mo15740a = "/live/diamond/banner/")
    C7492s<C3478c<C2337a>> getDiamondBannerList();

    @C6457h(mo15740a = "/hotsoon/diamond/?type=1")
    C7492s<C9343a> getDiamondList(@C6474y(mo15757a = "entrance") int i);

    @C6457h(mo15740a = "/hotsoon/diamond/first_charge/")
    C7492s<String> getFirstCharge(@C6474y(mo15757a = "type") int i);

    @C6457h(mo15740a = "https://wallet.snssdk.com/ies/checkout/api/query_recharge_pay_status/")
    C7492s<C3477b<Object, Extra>> getOrderStatus(@C6475z Map<String, String> map);

    @C6457h(mo15740a = "https://wallet.snssdk.com/ies/checkout/api/gen_recharge_param/")
    C7492s<C3479d<C3820g>> getRechargeParam(@C6475z Map<String, String> map);

    @C6457h(mo15740a = "/webcast/wallet_api/profile/")
    C7492s<C3479d<C3824j>> getWalletBindInfo();

    @C6457h(mo15740a = "/webcast/wallet/info/")
    C7492s<C3479d<C3826k>> getWalletInfo(@C6474y(mo15757a = "sec_user_id") String str);

    @C6457h(mo15740a = "/webcast/wallet_api/my_wallet/")
    C7492s<C3477b<Object, Extra>> getWalletPageInfo();

    @C6457h(mo15740a = "/webcast/diamond/?type=1")
    C7492s<C9343a> getWebcastDiamondList(@C6474y(mo15757a = "entrance") int i);

    @C6456g
    @C6468s(mo15750a = "/hotsoon/wallet/google_pay_verify/")
    C7492s<C3479d<C9476d>> googlePayVerify(@C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/diamond/first_charge/")
    C7492s<C3479d<FirstChargeCheck>> isFirstCharge();

    @C6456g
    @C6468s(mo15750a = "/aweme/v1/wallet/googlepay/verify/")
    C7492s<C3479d<Object>> mtVerify(@C6454e(mo15737a = "order_id") String str, @C6454e(mo15737a = "data") String str2);

    @C6457h(mo15740a = "/webcast/wallet_api/query_order/")
    C7492s<CheckOrderOriginalResult> queryOrder(@C6474y(mo15757a = "order_id") String str);

    @C6457h(mo15740a = "/webcast/wallet_api/i18n_cashier/")
    C7492s<C3474a<C3822h, C3823i>> vigoChargeDeals();

    @C6457h(mo15740a = "/hotsoon/wallet/vigo_recharge/")
    C7492s<C3474a<C3822h, C3823i>> vigoRecharge();
}
