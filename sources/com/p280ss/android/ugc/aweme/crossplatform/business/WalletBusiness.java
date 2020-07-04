package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.sdk.p899a.C20097a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1070bb.C23524a;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness */
public class WalletBusiness extends Business {

    /* renamed from: a */
    public boolean f68374a;

    /* renamed from: b */
    static void m85079b() {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.syncWallet();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo67220a() {
        if (this.f68374a) {
            if (((Integer) SharePrefCache.inst().getRefreshZhima().mo59877d()).intValue() != 1) {
                C42961az.m136380a(new C23524a());
            } else if (this.f68328g instanceof C25822g) {
                ((C25822g) this.f68328g).mo65873b("https://wallet.snssdk.com/douyin/withdraw");
            }
            this.f68374a = false;
        }
    }

    WalletBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public static void m85078a(String str, int i, int i2, Intent intent) {
        if (C6399b.m19944t() && str != null && str.contains("wallet/home")) {
            C42961az.m136380a(new C20097a().mo53814a(i).mo53816b(i2).mo53815a(intent));
        }
    }
}
