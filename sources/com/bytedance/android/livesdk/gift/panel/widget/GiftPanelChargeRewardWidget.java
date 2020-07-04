package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class GiftPanelChargeRewardWidget extends Widget {

    /* renamed from: a */
    private C47562b f22507a = new C47562b();

    /* renamed from: b */
    private GiftDialogViewModel f22508b;

    public int getLayoutId() {
        return R.layout.ano;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    private void m25149a() {
        this.f22507a.mo119661a(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22186f().mo19325f((C7326g<? super T>) new C8244l<Object>(this)));
    }

    public void onCreate() {
        super.onCreate();
        this.f22508b = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        m25149a();
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21356a(IUser iUser) {
        m25151c(iUser);
    }

    /* renamed from: c */
    private static boolean m25151c(IUser iUser) {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c() || (iUser != null && iUser.getPayScores() <= 0)) {
            return true;
        }
        return false;
    }
}
