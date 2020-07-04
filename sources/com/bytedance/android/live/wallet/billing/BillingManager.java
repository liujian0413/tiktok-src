package com.bytedance.android.live.wallet.billing;

import android.app.Activity;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3642b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.p177a.C3601a;
import com.bytedance.android.live.wallet.p177a.C3602b;
import com.bytedance.android.live.wallet.p177a.C3605c;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9432a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9433b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9436e;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9437f;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9438g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class BillingManager {

    /* renamed from: a */
    public ConnectionState f10935a;

    /* renamed from: b */
    public LinkedList<C3674a> f10936b;

    /* renamed from: c */
    public C3675a f10937c;

    /* renamed from: d */
    private C9432a f10938d;

    /* renamed from: e */
    private AtomicInteger f10939e;

    public enum ConnectionState {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        CLOSED
    }

    /* renamed from: com.bytedance.android.live.wallet.billing.BillingManager$a */
    public interface C3674a {
        /* renamed from: a */
        void mo11103a();
    }

    /* renamed from: d */
    private C9432a m13292d() {
        if (this.f10938d == null) {
            m13290b();
        }
        return this.f10938d;
    }

    /* renamed from: b */
    private void m13290b() {
        this.f10938d = ((IWalletService) C3596c.m13172a(IWalletService.class)).getBillingClient(new C9437f() {
        });
        this.f10935a = ConnectionState.DISCONNECTED;
        this.f10937c = new C3675a(new C3605c(), new C3602b(), new C3601a(), this);
    }

    /* renamed from: c */
    private void m13291c() {
        this.f10938d = null;
        this.f10935a = ConnectionState.CLOSED;
        if (this.f10937c != null) {
            this.f10937c.mo11130a();
            this.f10937c = null;
            C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
            if (iVar != null) {
                iVar.mo11052b();
            }
        }
        this.f10936b.clear();
    }

    /* renamed from: a */
    public final C9436e mo11123a() {
        if (this.f10935a != ConnectionState.CONNECTED) {
            return null;
        }
        C9432a d = m13292d();
        if (d != null) {
            return d.mo23185a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11126a(C3674a aVar) {
        this.f10936b.remove(aVar);
    }

    /* renamed from: b */
    public final void mo11129b(C3674a aVar) {
        if (this.f10935a != ConnectionState.CONNECTED) {
            if (aVar != null && !this.f10936b.contains(aVar)) {
                this.f10936b.add(aVar);
            }
            m13289a(0);
        } else if (aVar != null) {
            aVar.mo11103a();
        }
    }

    /* renamed from: a */
    private void m13289a(int i) {
        if (this.f10935a == ConnectionState.DISCONNECTED) {
            this.f10935a = ConnectionState.CONNECTING;
            Iterator it = this.f10936b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (m13292d() != null) {
                new Object(0) {
                };
            }
        }
    }

    /* renamed from: a */
    public final void mo11124a(C3669a aVar) {
        int decrementAndGet = this.f10939e.decrementAndGet();
        if (this.f10937c != null) {
            this.f10937c.mo11131a(aVar);
        }
        if (decrementAndGet <= 0) {
            m13291c();
        }
    }

    /* renamed from: a */
    public final int mo11122a(Activity activity, String str) {
        if (this.f10935a != ConnectionState.CONNECTED) {
            return -1;
        }
        C9432a d = m13292d();
        if (d != null) {
            return d.mo23184a(activity, str);
        }
        return 6;
    }

    /* renamed from: a */
    public final void mo11127a(String str, C9433b bVar) {
        if (this.f10935a != ConnectionState.CONNECTED) {
            bVar.mo11139a(-1, null);
        } else {
            m13292d();
        }
    }

    /* renamed from: a */
    public final void mo11128a(List<String> list, C9438g gVar) {
        if (this.f10935a != ConnectionState.CONNECTED) {
            gVar.mo11151a(-1, null);
        } else {
            m13292d();
        }
    }

    /* renamed from: a */
    public final void mo11125a(C3669a aVar, Activity activity, ChargeDeal chargeDeal, JSONObject jSONObject, String str) {
        if (this.f10937c != null) {
            this.f10937c.mo11132a(aVar, activity, chargeDeal, jSONObject, str);
        }
    }
}
