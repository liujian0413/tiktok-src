package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftPanelVigoRechargeWidget extends FakeGiftPanelVigoRechargeWidget {

    /* renamed from: a */
    public Room f22588a;

    /* renamed from: b */
    private GiftDialogViewModel f22589b;

    /* renamed from: c */
    private View f22590c;

    public int getLayoutId() {
        return R.layout.ano;
    }

    /* renamed from: a */
    private void m25232a() {
        this.f22590c = this.contentView.findViewById(R.id.aqs);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f22589b.mo21338a((C0043i) this);
    }

    public void onCreate() {
        super.onCreate();
        this.f22589b = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f22588a = this.f22589b.f22457e;
        m25232a();
        this.f22589b.f22471s.observe(this, new C8228aj(this));
    }

    /* renamed from: a */
    private void m25233a(boolean z) {
        int i;
        ViewGroup viewGroup = this.containerView;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21386a(C8169b bVar) {
        boolean z;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        m25233a(z);
    }

    public void onEvent(C8296e eVar) {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22185e().mo19128a();
        int i = eVar.f22777b;
        User user = (User) this.dataCenter.get("data_user_in_room");
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) i));
            user.setNeverRecharge(false);
        }
    }
}
