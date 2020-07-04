package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C2376h;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService.C3597a;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.api.C3630e;
import com.bytedance.android.live.wallet.api.C3631f;
import com.bytedance.android.live.wallet.api.C3632g;
import com.bytedance.android.live.wallet.api.C3633h;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.dialog.C3732b;
import com.bytedance.android.live.wallet.dialog.C3740d;
import com.bytedance.android.live.wallet.dialog.C3764o;
import com.bytedance.android.live.wallet.dialog.RechargeDialog;
import com.bytedance.android.live.wallet.fragment.FirstChargeRewardFragment;
import com.bytedance.android.live.wallet.fragment.MyDiamondFragment;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.live.wallet.p177a.C3607e;
import com.bytedance.android.live.wallet.p178b.p179a.C3644a;
import com.bytedance.android.live.wallet.p178b.p179a.C3646c;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.C9334h;
import com.bytedance.android.livesdkapi.depend.live.ILiveWalletService;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9432a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9434c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9435d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9437f;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Map;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;

public class WalletService implements IWalletService {
    private IHostWallet iHostWallet;

    private static String getBannerUrl(DataCenter dataCenter) {
        return null;
    }

    public String getCJAppId() {
        return this.iHostWallet.getCJAppId();
    }

    public String getCJMerchantId() {
        return this.iHostWallet.getCJMerchantId();
    }

    public Map<String, String> getHostWalletSetting() {
        return this.iHostWallet.getHostWalletSetting();
    }

    public C3693c walletCenter() {
        return C3778f.m13508h();
    }

    public void setCJStatisticCallback() {
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11044a();
        }
    }

    public int getRechargeType() {
        if (((Integer) LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE.mo10240a()).intValue() == 0) {
            return 2;
        }
        return 3;
    }

    public C7492s<C3479d<FirstChargeCheck>> isFirstCharge() {
        return ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).isFirstCharge().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
    }

    public C9432a getBillingClient(C9437f fVar) {
        return this.iHostWallet.getBillingClient(fVar);
    }

    public LiveActivityProxy getLiveBillingActivityProxy(FragmentActivity fragmentActivity) {
        return new LiveBillingActivityProxy(fragmentActivity);
    }

    public WalletService(IHostWallet iHostWallet2) {
        this.iHostWallet = iHostWallet2;
        C3596c.m13174a(IWalletService.class, this);
        C3596c.m13174a(ILiveWalletService.class, this);
    }

    public void startCJBackgroundTask(Context context) {
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11046a(context);
        }
    }

    public void openWallet(Activity activity) {
        if (((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo10240a()).booleanValue()) {
            ((IHostApp) C3596c.m13172a(IHostApp.class)).openWallet(activity);
        }
    }

    public int isFirstConsume(IUser iUser) {
        if (iUser.getUserHonor() == null || iUser.getUserHonor().mo8712p() == null || iUser.getUserHonor().mo8712p().size() <= 1 || iUser.getUserHonor().mo8712p().get(1) == null || ((C2376h) iUser.getUserHonor().mo8712p().get(1)).f7826d != 0) {
            return 0;
        }
        return 1;
    }

    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        return MyDiamondFragment.m13531a(bundle);
    }

    public Fragment getFirstChargeRewardFragment(int i, int i2) {
        return FirstChargeRewardFragment.m13526a(i, i2);
    }

    public void openBillingProxyActivity(Context context, Bundle bundle) {
        this.iHostWallet.openBillingProxyActivity(context, bundle);
    }

    public DialogFragment getFirstChargeDealFragment(Context context, Bundle bundle) {
        C3630e eVar = (C3630e) C3642b.m13238a(C3630e.class);
        if (eVar != null) {
            return eVar.mo11095a(context, bundle);
        }
        return null;
    }

    public Fragment getWalletFragment(Context context, Bundle bundle) {
        C3631f fVar = (C3631f) C3642b.m13238a(C3631f.class);
        if (fVar != null) {
            return fVar.mo11096a(context, bundle);
        }
        return null;
    }

    public void payWithWX(Context context, C9353b bVar, C9435d dVar) {
        this.iHostWallet.payWithWX(context, bVar, dVar);
    }

    public DialogFragment createRechargeDialogFragment(FragmentActivity fragmentActivity, C9334h hVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        return RechargeDialog.m13373a(fragmentActivity, bundle, null, null, hVar);
    }

    public void payWithAli(Activity activity, C9353b bVar, C9435d dVar) {
        if (((C3632g) C3642b.m13238a(C3632g.class)) == null) {
            this.iHostWallet.payWithAli(activity, bVar, dVar);
        }
    }

    public void verifyWithAli(Activity activity, String str, C9434c cVar) {
        if (((C3633h) C3642b.m13238a(C3633h.class)) == null) {
            this.iHostWallet.verifyWithAli(activity, str, cVar);
        }
    }

    public Dialog getPayDialog(Context context, int i, Bundle bundle, ChargeDeal chargeDeal) {
        String string = bundle.getString(IWalletService.KEY_BUNDLE_CHARGE_REASON);
        String string2 = bundle.getString(IWalletService.KEY_BUNDLE_REQUEST_PAGE);
        if (i == 1) {
            C3764o oVar = new C3764o(context, null, string, string2, bundle.getInt(IWalletService.KEY_BUNDLE_CHARGE_TYPE, 0));
            oVar.mo11266a(chargeDeal);
            return oVar;
        }
        C3740d dVar = new C3740d(context, false, string, string2, chargeDeal);
        return dVar;
    }

    public DialogFragment showRechargeDialog(FragmentActivity fragmentActivity, Bundle bundle, DataCenter dataCenter, C3701d dVar) {
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo10240a()).booleanValue() || !((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo10240a()).booleanValue()) {
            return null;
        }
        bundle.getString(IWalletService.KEY_BUNDLE_CHARGE_REASON);
        boolean z = true;
        if (!bundle.containsKey(IWalletService.KEY_BUNDLE_BANNER_URL) || TextUtils.isEmpty(bundle.getString(IWalletService.KEY_BUNDLE_BANNER_URL))) {
            String bannerUrl = getBannerUrl(dataCenter);
            z = true ^ TextUtils.isEmpty(bannerUrl);
            bundle.putString(IWalletService.KEY_BUNDLE_BANNER_URL, bannerUrl);
        }
        bundle.putInt(IWalletService.KEY_BUNDLE_CHARGE_TYPE, z ? 1 : 0);
        RechargeDialog a = RechargeDialog.m13373a(fragmentActivity, bundle, dataCenter, dVar, null);
        if (fragmentActivity.getSupportFragmentManager().mo2644a("RechargeDialog") != null) {
            return null;
        }
        a.show(fragmentActivity.getSupportFragmentManager(), "RechargeDialog");
        return a;
    }

    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, C3597a aVar, String str) {
        C3732b bVar = new C3732b(activity, bundle.getString(IWalletService.KEY_BUNDLE_REQUEST_PAGE));
        C3777e a = new C3607e(jSONObject).mo11043a();
        if (a != null) {
            bVar.mo11233a(a);
        }
        bVar.f11118i = aVar;
        bVar.mo11234a(str);
        return bVar;
    }

    public C3644a getBasePayPresenter(Activity activity, C3628c cVar, String str, String str2, int i, C3669a aVar) {
        C3646c cVar2 = new C3646c(activity, cVar, str, str2, i);
        cVar2.mo9142a(aVar);
        return cVar2;
    }
}
