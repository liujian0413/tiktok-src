package com.bytedance.android.live.wallet.billing;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.wallet.billing.BillingManager.C3674a;
import com.bytedance.android.live.wallet.billing.BillingManager.ConnectionState;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdkapi.depend.model.C9343a;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9438g;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.live.wallet.billing.d */
public final class C3691d implements C6310a {

    /* renamed from: a */
    public final C6309f f10999a;

    /* renamed from: b */
    public String f11000b;

    /* renamed from: c */
    private final BillingManager f11001c;

    /* renamed from: d */
    private boolean f11002d;

    /* renamed from: e */
    private C9343a f11003e;

    /* renamed from: f */
    private C3674a f11004f;

    /* renamed from: b */
    public final void mo11150b() {
        if (this.f11002d && this.f11003e != null) {
            m13337c();
        }
    }

    /* renamed from: a */
    public final void mo11147a() {
        this.f11002d = false;
        this.f11003e = null;
        this.f10999a.removeCallbacksAndMessages(null);
        this.f11001c.mo11126a(this.f11004f);
    }

    /* renamed from: c */
    private void m13337c() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final C9343a aVar = new C9343a(this.f11003e);
        this.f11003e = null;
        ArrayList arrayList = new ArrayList();
        for (ChargeDeal chargeDeal : aVar.f25539a) {
            if (chargeDeal.f25521g != null) {
                arrayList.add(chargeDeal.f25521g);
            }
        }
        this.f11001c.mo11128a((List<String>) arrayList, (C9438g) new C9438g() {
            /* renamed from: a */
            public final void mo11151a(int i, List<HsSkuDetail> list) {
                C3691d.m13334a(uptimeMillis, 1, -1, "");
                C3691d dVar = C3691d.this;
                StringBuilder sb = new StringBuilder("queryFailed: ");
                sb.append(-1);
                dVar.mo11148a(R.string.ejh, sb.toString());
            }
        });
    }

    public final void handleMsg(Message message) {
        if (this.f11002d && message.what == 1001) {
            m13335a(message);
        }
    }

    /* renamed from: a */
    private void m13335a(Message message) {
        if (message.obj instanceof Exception) {
            m13336a((Exception) message.obj);
            return;
        }
        C9343a aVar = (C9343a) message.obj;
        if (aVar == null || C6311g.m19573a(aVar.f25539a)) {
            mo11149a(aVar);
            return;
        }
        this.f11003e = aVar;
        if (this.f11001c.f10935a == ConnectionState.CONNECTED) {
            m13337c();
        } else {
            this.f11001c.mo11129b(this.f11004f);
        }
    }

    /* renamed from: a */
    private void m13336a(Exception exc) {
        String str;
        String str2;
        C8449h hVar;
        if (exc instanceof ApiException) {
            hVar = new C8449h().mo21613a("errorCode", (Object) Integer.valueOf(((ApiException) exc).getErrorCode()));
            str2 = "errorDesc";
        } else {
            hVar = new C8449h().mo21613a("errorCode", (Object) Integer.valueOf(-1));
            str2 = "errorDesc";
            if (exc == null) {
                str = "";
                hVar.mo21613a(str2, (Object) str).mo21616a("hotsoon_iap_productslist_failure_rate", 1);
                this.f11002d = false;
            }
        }
        str = exc.getMessage();
        hVar.mo21613a(str2, (Object) str).mo21616a("hotsoon_iap_productslist_failure_rate", 1);
        this.f11002d = false;
    }

    /* renamed from: a */
    public final void mo11149a(C9343a aVar) {
        new C8449h().mo21616a("hotsoon_iap_productslist_failure_rate", 0);
        this.f11002d = false;
        if (aVar != null && aVar.f25539a != null && aVar.f25539a.size() > 0 && aVar.f25539a.get(0) != null && ((ChargeDeal) aVar.f25539a.get(0)).f25525k != null) {
            this.f11000b = ((ChargeDeal) aVar.f25539a.get(0)).f25525k.f25534f;
        }
    }

    /* renamed from: a */
    public final void mo11148a(int i, String str) {
        new C8449h().mo21613a("errorCode", (Object) Integer.valueOf(-2)).mo21613a("errorDesc", (Object) str).mo21616a("hotsoon_iap_productslist_failure_rate", 1);
        this.f11002d = false;
    }

    /* renamed from: a */
    public static void m13334a(long j, int i, int i2, String str) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        HashMap hashMap = new HashMap();
        if (i == 0) {
            C9281a.m27621c(i, uptimeMillis, hashMap);
            return;
        }
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C9281a.m27621c(i, uptimeMillis, hashMap);
        C9281a.m27622d(i, uptimeMillis, hashMap);
    }
}
