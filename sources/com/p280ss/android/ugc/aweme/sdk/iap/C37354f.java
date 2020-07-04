package com.p280ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.C37324c;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.Wallet;
import com.p280ss.android.ugc.aweme.sdk.bean.C37321a;
import com.p280ss.android.ugc.aweme.sdk.bean.DiamondStruct;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37351a;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37352b;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37353c;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.C37332a;
import com.p280ss.android.ugc.aweme.sdk.iap.api.C37333a;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.C37357a;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37317a;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37318b;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37320d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.f */
public final class C37354f implements C6310a, C37334b, C37352b {

    /* renamed from: a */
    private boolean f97542a = true;

    /* renamed from: b */
    private boolean f97543b;

    /* renamed from: c */
    private boolean f97544c;

    /* renamed from: d */
    private C37353c f97545d;

    /* renamed from: e */
    private C37335c f97546e = new C37335c();

    /* renamed from: f */
    private C6309f f97547f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: g */
    private IWalletService f97548g;

    /* renamed from: h */
    private List<C37334b> f97549h = new ArrayList();

    /* renamed from: i */
    private C37324c f97550i = C37324c.m119823a();

    /* renamed from: e */
    public final void mo93989e() {
        this.f97546e.mo93962a();
        this.f97547f.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    private void m119920f() {
        this.f97545d.mo93941a(C37330a.m119843a().mo93951a((int) R.string.c06).mo93953b((int) R.string.de2));
    }

    /* renamed from: d */
    public final void mo93988d() {
        if (!this.f97542a && !this.f97543b) {
            m119915a(16);
        }
        this.f97542a = false;
    }

    /* renamed from: c */
    public final void mo93987c() {
        this.f97548g = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (this.f97548g == null) {
            m119920f();
            return;
        }
        try {
            Uri parse = Uri.parse("aweme://webview/?url=https://www.musical.ly/wallet/transactions/");
            Activity b = this.f97545d.mo93944b();
            Intent a = C37318b.m119818a(b, parse);
            a.putExtra("show_load_dialog", true);
            a.putExtra("hide_nav_bar", true);
            a.putExtra("hide_status_bar", true);
            b.startActivity(a);
        } catch (Exception unused) {
            m119920f();
        }
    }

    /* renamed from: a */
    public final void mo93983a() {
        this.f97545d.mo93945c();
        m119915a(17);
    }

    /* renamed from: b */
    public final void mo93986b() {
        this.f97548g = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (this.f97548g == null) {
            m119920f();
            return;
        }
        this.f97545d.mo93945c();
        C23397p.m76735a().mo60807a(this.f97547f, new Callable() {
            public final Object call() throws Exception {
                return C37333a.m119863b().token;
            }
        }, 32);
    }

    /* renamed from: a */
    private void m119915a(int i) {
        C23397p.m76735a().mo60807a(this.f97547f, new Callable() {
            public final Object call() throws Exception {
                return C37333a.m119862a();
            }
        }, i);
    }

    /* renamed from: a */
    private void m119916a(Message message) {
        this.f97545d.mo93946d();
        if (!(message.obj instanceof Exception)) {
            Wallet.m119796a().cashOut(this.f97545d.mo93944b(), (String) message.obj);
        }
    }

    /* renamed from: a */
    private void m119917a(C37321a aVar) {
        if (aVar != null && aVar.f97462a != null) {
            this.f97544c = aVar.f97462a.isPhoneBinded();
        }
    }

    /* renamed from: b */
    private void m119918b(Message message) {
        this.f97545d.mo93946d();
        if (!(message.obj instanceof Exception)) {
            C37357a aVar = (C37357a) message.obj;
            if (!(aVar == null || aVar.f97553a == null)) {
                m119917a(aVar.f97553a);
                this.f97545d.mo93940a(aVar.f97553a.f97463b, (long) aVar.f97553a.f97464c, aVar.f97553a.f97465d, aVar.f97553a.f97466e);
            }
        }
    }

    public final void handleMsg(Message message) {
        if (this.f97545d.mo93943a()) {
            C37317a.m119816a(this.f97545d.mo93944b(), message.obj);
            int i = message.what;
            if (i != 32) {
                switch (i) {
                    case 16:
                        m119918b(message);
                        return;
                    case 17:
                        m119919c(message);
                        return;
                }
            } else {
                m119916a(message);
            }
        }
    }

    /* renamed from: c */
    private void m119919c(Message message) {
        if (message.obj instanceof Exception) {
            mo93929a(0, (Exception) message.obj);
            StringBuilder sb = new StringBuilder("query_wallet:");
            sb.append(((Exception) message.obj).getMessage());
            C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6005, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
            return;
        }
        C37357a aVar = (C37357a) message.obj;
        m119917a(aVar.f97553a);
        if (aVar.f97553a != null) {
            this.f97545d.mo93940a(aVar.f97553a.f97463b, (long) aVar.f97553a.f97464c, aVar.f97553a.f97465d, aVar.f97553a.f97466e);
        }
        if (C6307b.m19566a((Collection<T>) aVar.f97554b)) {
            mo93930a(1, (Object) aVar.f97554b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (DiamondStruct a : aVar.f97554b) {
            arrayList.add(C37332a.m119857a(a));
        }
        this.f97546e.mo93965a((List<C37332a>) arrayList);
    }

    /* renamed from: a */
    public final void mo93990a(C37334b bVar) {
        this.f97549h.add(bVar);
    }

    public C37354f(C37353c cVar, String str) {
        this.f97545d = cVar;
        this.f97546e.mo93963a((Context) this.f97545d.mo93944b(), (C37334b) this, str);
    }

    public C37354f(Context context, C37334b bVar) {
        String iapKey = ((IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class)).getIapKey();
        this.f97549h.add(bVar);
        this.f97545d = new C37351a();
        this.f97546e.mo93963a(context, (C37334b) this, iapKey);
    }

    /* renamed from: a */
    public final void mo93929a(int i, Exception exc) {
        if (this.f97545d.mo93943a()) {
            this.f97545d.mo93946d();
            C37330a a = C37330a.m119843a();
            switch (i) {
                case 0:
                case 1:
                    a.mo93951a((int) R.string.c16);
                    a.mo93953b((int) R.string.de2);
                    this.f97545d.mo93941a(a);
                    break;
                case 2:
                    this.f97543b = false;
                    C37330a a2 = C37330a.m119843a();
                    a2.mo93951a((int) R.string.c25);
                    a2.mo93953b((int) R.string.de2);
                    this.f97545d.mo93941a(a2);
                    break;
            }
            if (!this.f97549h.isEmpty()) {
                for (C37334b a3 : this.f97549h) {
                    a3.mo93929a(i, exc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93930a(int i, Object obj) {
        if (this.f97545d.mo93943a()) {
            switch (i) {
                case 1:
                    this.f97545d.mo93946d();
                    this.f97545d.mo93942a((List) obj);
                    break;
                case 2:
                    m119915a(16);
                    this.f97543b = false;
                    break;
                case 3:
                    m119915a(16);
                    break;
            }
            if (!this.f97549h.isEmpty()) {
                for (C37334b a : this.f97549h) {
                    a.mo93930a(i, obj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93985a(String str, int i) {
        this.f97545d.mo93945c();
        this.f97543b = true;
        this.f97546e.mo93964a(str, i);
    }

    /* renamed from: a */
    public final void mo93984a(int i, int i2, Intent intent) {
        this.f97546e.mo93966a(i, i2, intent);
    }
}
