package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4032b;
import com.bytedance.android.livesdk.chatroom.event.C4424ap;
import com.bytedance.android.livesdk.chatroom.event.C4425aq;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.HashMap;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class RechargeWidget extends Widget {

    /* renamed from: a */
    private DialogFragment f16453a;

    /* renamed from: b */
    private Dialog f16454b;

    /* renamed from: c */
    private C0053p<KVData> f16455c = new C5702ep(this);

    /* renamed from: d */
    private C47562b f16456d = new C47562b();

    public void onCreate() {
        super.onCreate();
        this.dataCenter.observeForever("cmd_show_recharge_dialog", this.f16455c);
        this.dataCenter.observeForever("cmd_show_pay_dialog", this.f16455c);
        if (this.f16456d != null) {
            this.f16456d.mo119660a();
        }
        m17855a(C4032b.class);
        m17855a(C8296e.class);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f16456d != null) {
            this.f16456d.mo119660a();
        }
        this.dataCenter.removeObserver(this.f16455c);
        if (this.f16453a != null && this.f16453a.getDialog() != null && this.f16453a.getDialog().isShowing()) {
            this.f16453a.dismiss();
        }
    }

    /* renamed from: a */
    private void m17856a(String str) {
        TTLiveSDKContext.getHostService().mo22362c().openWallet((Activity) this.context);
    }

    /* renamed from: a */
    private <T> void m17855a(Class<T> cls) {
        this.f16456d.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4032b) {
                    RechargeWidget.this.onEvent((C4032b) t);
                    return;
                }
                if (t instanceof C8296e) {
                    RechargeWidget.this.onEvent((C8296e) t);
                }
            }
        }));
    }

    public void onEvent(C4032b bVar) {
        if (TextUtils.equals("in_room_dialog", bVar.f12005a)) {
            m17857a(bVar.f12006b, bVar.f12007c, bVar.f12008d, 0);
        } else {
            m17856a(bVar.f12006b);
        }
    }

    public void onEvent(C8296e eVar) {
        if (this.f16454b != null && this.f16454b.isShowing()) {
            C5703eq.m18051a(this.f16454b);
        }
    }

    /* renamed from: a */
    private void m17854a(C4425aq aqVar) {
        switch (aqVar.f12854a) {
            case 0:
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                    m17857a(aqVar.f12856c, aqVar.f12857d, aqVar.f12858e, aqVar.f12855b);
                    return;
                } else {
                    m17856a(aqVar.f12856c);
                    return;
                }
            case 1:
                m17857a(aqVar.f12856c, aqVar.f12857d, aqVar.f12858e, aqVar.f12855b);
                return;
            case 2:
                m17856a(aqVar.f12856c);
                break;
        }
    }

    /* renamed from: a */
    private void m17853a(C4424ap apVar) {
        String str;
        if (apVar != null) {
            ChargeDeal chargeDeal = apVar.f12851a;
            String str2 = apVar.f12852b;
            if (this.f16454b != null && this.f16454b.isShowing()) {
                C5703eq.m18051a(this.f16454b);
            }
            Bundle bundle = new Bundle();
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str2);
            bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, "live_detail");
            bundle.putInt(IWalletService.KEY_BUNDLE_CHARGE_TYPE, apVar.f12853c);
            this.f16454b = ((IWalletService) C3596c.m13172a(IWalletService.class)).getPayDialog(this.context, 1, bundle, chargeDeal);
            this.f16454b.setCanceledOnTouchOutside(true);
            this.f16454b.show();
            HashMap hashMap = new HashMap();
            hashMap.put("money", String.valueOf(chargeDeal.f25519e + chargeDeal.f25520f));
            hashMap.put("request_page", "live_detail");
            hashMap.put("charge_reason", str2);
            if (apVar.f12853c == 1) {
                str = "first_recharge";
            } else if (apVar.f12853c == 2) {
                str = "small_heart";
            } else {
                str = "normal";
            }
            hashMap.put("panel_position", str);
            C8443c.m25663a().mo21606a("livesdk_check_out_show", hashMap, C8438j.class, Room.class);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14002a(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -187819389) {
                if (hashCode == 1257343548 && key.equals("cmd_show_pay_dialog")) {
                    c = 1;
                }
            } else if (key.equals("cmd_show_recharge_dialog")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    m17854a((C4425aq) kVData.getData());
                    return;
                case 1:
                    m17853a((C4424ap) kVData.getData());
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m17857a(String str, String str2, String str3, int i) {
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        Bundle bundle = new Bundle();
        bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, booleanValue);
        bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str3);
        this.f16453a = ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.context, bundle, this.dataCenter, null);
    }
}
