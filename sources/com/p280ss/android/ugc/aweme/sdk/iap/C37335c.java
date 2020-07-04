package com.p280ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.C37332a;
import com.p280ss.android.ugc.aweme.sdk.iap.api.C37333a;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderStruct;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.C37369a;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.C37370b;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.C37372d;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.C37366c;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.C37367d;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.C37368e;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.IabAsyncInProgressException;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.Purchase;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37320d;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.c */
public final class C37335c implements C6310a {

    /* renamed from: a */
    public Set<Purchase> f97504a = new LinkedHashSet();

    /* renamed from: b */
    public List<String> f97505b = new ArrayList();

    /* renamed from: c */
    public IabHelper f97506c;

    /* renamed from: d */
    public String f97507d;

    /* renamed from: e */
    public List<C37372d> f97508e = new ArrayList();

    /* renamed from: f */
    public C37334b f97509f = this.f97515l;

    /* renamed from: g */
    public List<C37341d> f97510g = new ArrayList();

    /* renamed from: h */
    public int f97511h = 0;

    /* renamed from: i */
    private boolean f97512i;

    /* renamed from: j */
    private List<C37332a> f97513j;

    /* renamed from: k */
    private WeakReference<Context> f97514k;

    /* renamed from: l */
    private C37334b f97515l = new C37334b() {
        /* renamed from: a */
        public final void mo93929a(int i, Exception exc) {
        }

        /* renamed from: a */
        public final void mo93930a(int i, Object obj) {
        }
    };

    /* renamed from: m */
    private C6309f f97516m = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: n */
    private C37368e f97517n = new C37368e() {
        /* renamed from: a */
        public final void mo93971a(C37369a aVar, C37370b bVar) {
            if (C37335c.this.f97506c == null || aVar.mo94038b()) {
                StringBuilder sb = new StringBuilder("query_product:");
                sb.append(aVar.f97593b);
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6006, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
                C37334b bVar2 = C37335c.this.f97509f;
                StringBuilder sb2 = new StringBuilder("Manager.mGotInventoryListener mHelper:");
                sb2.append(C37335c.this.f97506c);
                sb2.append(" result.isFailure");
                bVar2.mo93929a(1, new Exception(sb2.toString()));
                return;
            }
            C37335c.this.f97508e.clear();
            C37335c.this.f97504a.clear();
            for (String a : C37335c.this.f97505b) {
                C37372d a2 = bVar.mo94040a(a);
                if (a2 != null) {
                    C37335c.this.f97508e.add(a2);
                }
            }
            for (int i = 0; i < C37335c.this.f97505b.size(); i++) {
                Purchase b = bVar.mo94043b((String) C37335c.this.f97505b.get(i));
                if (b != null && C37335c.this.mo93967a(b)) {
                    C37341d dVar = new C37341d(b, C37335c.this.f97509f, C37335c.this.f97506c);
                    C37335c.this.f97510g.add(dVar);
                    b.setWeakHandler(new C6309f(Looper.getMainLooper(), dVar));
                    C37335c.this.f97504a.add(b);
                    Message message = new Message();
                    message.what = 50;
                    b.getWeakHandler().sendMessageDelayed(message, (long) (i * VETransitionFilterParam.TransitionDuration_DEFAULT));
                }
            }
            if (C37335c.this.f97508e.size() == 0) {
                C37335c.this.f97509f.mo93929a(1, new Exception("Manager.mGotInventoryListener mOnShelfProducts.size() == 0"));
            } else {
                C37335c.this.mo93968b();
            }
        }
    };

    /* renamed from: o */
    private C37366c f97518o = new C37366c() {
        /* renamed from: a */
        public final void mo93972a(C37369a aVar, Purchase purchase) {
            if (C37335c.this.f97506c == null) {
                C37335c.this.f97509f.mo93929a(2, new Exception("Manager.mPurchaseFinishedListener mHelper null"));
            } else if (aVar.mo94038b()) {
                C37335c.this.f97509f.mo93929a(2, new Exception("Manager.mPurchaseFinishedListener result isFailure"));
                int i = aVar.f97592a;
                StringBuilder sb = new StringBuilder("buy_coins onIabPurchaseFinished result isFailure:");
                sb.append(aVar.f97593b);
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", i, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
            } else if (!C37335c.this.mo93967a(purchase)) {
                C37334b bVar = C37335c.this.f97509f;
                StringBuilder sb2 = new StringBuilder("Manager.mPurchaseFinishedListener verifyDeveloperPayload false, payload:");
                sb2.append(purchase.getDeveloperPayload());
                bVar.mo93929a(2, new Exception(sb2.toString()));
                StringBuilder sb3 = new StringBuilder("buy_coins verifyDeveloperPayload  failed, purchase originalJson: ");
                sb3.append(purchase.getOriginalJson());
                sb3.append("  basePayLoad:");
                sb3.append(C37335c.this.f97507d);
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6007, new C6909j().mo16966a("msg", sb3.toString()).mo16967a());
            } else {
                C37341d dVar = new C37341d(purchase, C37335c.this.f97509f, C37335c.this.f97506c);
                C37335c.this.f97510g.add(dVar);
                purchase.setWeakHandler(new C6309f(Looper.getMainLooper(), dVar));
                C37335c.this.f97504a.add(purchase);
                Message message = new Message();
                message.what = 49;
                purchase.getWeakHandler().sendMessage(message);
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo93965a(List<C37332a> list) {
        this.f97513j = list;
        for (C37332a aVar : this.f97513j) {
            if (!TextUtils.isEmpty(aVar.f97500b)) {
                this.f97505b.add(aVar.f97500b);
            }
        }
        if (this.f97505b.size() == 0) {
            this.f97509f.mo93929a(1, new Exception("Manager.fetchProductsFromGooglePay mIapIds size==0"));
        } else {
            m119871d();
        }
    }

    /* renamed from: a */
    public final boolean mo93967a(Purchase purchase) {
        String[] split = purchase.getDeveloperPayload().split(",");
        return split.length > 0 && split[0].equals(this.f97507d);
    }

    /* renamed from: c */
    private void m119870c() {
        Message message = new Message();
        message.what = 32;
        this.f97516m.sendMessageDelayed(message, 500);
    }

    /* renamed from: d */
    private void m119871d() {
        if (this.f97511h == 1) {
            m119872e();
        } else if (this.f97511h == 3) {
            m119870c();
        } else {
            C37334b bVar = this.f97509f;
            StringBuilder sb = new StringBuilder("Manager.checkSetupStatus status:");
            sb.append(this.f97511h);
            bVar.mo93929a(1, new Exception(sb.toString()));
        }
    }

    /* renamed from: e */
    private void m119872e() {
        try {
            if (this.f97506c == null) {
                this.f97509f.mo93929a(1, new Exception("Presenter.queryInventory mHelper null"));
            } else {
                this.f97506c.mo94002a(true, this.f97505b, null, this.f97517n);
            }
        } catch (Exception e) {
            this.f97509f.mo93929a(1, e);
        }
    }

    /* renamed from: b */
    public final void mo93968b() {
        ArrayList arrayList = new ArrayList();
        for (C37372d dVar : this.f97508e) {
            C37332a aVar = new C37332a();
            aVar.f97500b = dVar.f97596a;
            aVar.f97501c = dVar.f97598c;
            Iterator it = this.f97513j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C37332a aVar2 = (C37332a) it.next();
                if (aVar2.f97500b.equals(aVar.f97500b)) {
                    aVar.f97499a = aVar2.f97499a;
                    aVar.f97502d = aVar2.f97502d;
                    break;
                }
            }
            arrayList.add(aVar);
        }
        this.f97509f.mo93930a(1, (Object) arrayList);
    }

    /* renamed from: a */
    public final void mo93962a() {
        this.f97510g.clear();
        this.f97514k.clear();
        this.f97508e.clear();
        this.f97509f = this.f97515l;
        this.f97512i = false;
        this.f97511h = 0;
        this.f97516m.removeCallbacksAndMessages(null);
        for (Purchase purchase : this.f97504a) {
            if (purchase.getWeakHandler() != null) {
                purchase.getWeakHandler().removeCallbacksAndMessages(null);
            }
            purchase.setWeakHandler(null);
        }
        this.f97504a.clear();
        try {
            this.f97506c.mo93996a();
        } catch (IabAsyncInProgressException unused) {
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
        if (i != 32) {
            if (i == 48) {
                m119869a(message);
            }
            return;
        }
        m119871d();
    }

    /* renamed from: a */
    private C37372d m119867a(String str) {
        if (this.f97508e.size() == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        for (C37372d dVar : this.f97508e) {
            if (dVar.f97596a.equals(str)) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m119868a(Context context) {
        String packageName = context.getPackageName();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(iUserService.getCurrentUserID());
            sb.append(packageName);
            packageName = sb.toString();
        }
        return String.valueOf(packageName.hashCode());
    }

    /* renamed from: a */
    private void m119869a(Message message) {
        if (message.obj instanceof Exception) {
            this.f97509f.mo93929a(2, (Exception) message.obj);
            StringBuilder sb = new StringBuilder("buy_coins:");
            sb.append(((Exception) message.obj).getMessage());
            C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6007, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
            return;
        }
        DiamondOrderStruct diamondOrderStruct = (DiamondOrderStruct) message.obj;
        if (diamondOrderStruct != null) {
            if (this.f97506c == null) {
                this.f97509f.mo93929a(2, new Exception("Manager.launchPurchaseFlow mHelper: null"));
                StringBuilder sb2 = new StringBuilder("buy_coinsmHelper: ");
                sb2.append(this.f97506c);
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6007, new C6909j().mo16966a("msg", sb2.toString()).mo16967a());
            } else if (this.f97506c.f97558d) {
                C37334b bVar = this.f97509f;
                StringBuilder sb3 = new StringBuilder("Manager.launchPurchaseFlow:  mHelpoer isDisposed:");
                sb3.append(this.f97506c.f97558d);
                bVar.mo93929a(2, new Exception(sb3.toString()));
                StringBuilder sb4 = new StringBuilder("buy_coins mHelper isDisposed:");
                sb4.append(this.f97506c.f97558d);
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6007, new C6909j().mo16966a("msg", sb4.toString()).mo16967a());
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f97507d);
                sb5.append(",");
                sb5.append(UUID.randomUUID().toString());
                sb5.append(",");
                sb5.append(diamondOrderStruct.orderId);
                try {
                    this.f97506c.mo93997a((Activity) this.f97514k.get(), diamondOrderStruct.productId, 10010, this.f97518o, sb5.toString());
                } catch (IabAsyncInProgressException e) {
                    this.f97509f.mo93929a(2, (Exception) e);
                    StringBuilder sb6 = new StringBuilder("buy_coins IabAsyncInProgressException:");
                    sb6.append(e.getMessage());
                    C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6007, new C6909j().mo16966a("msg", sb6.toString()).mo16967a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93964a(String str, final int i) {
        if (m119867a(str) == null) {
            this.f97509f.mo93929a(2, new Exception("Managager.charge: getSkuDetail by iapId null"));
        } else {
            C23397p.m76735a().mo60807a(this.f97516m, new Callable() {
                public final Object call() throws Exception {
                    return C37333a.m119860a(i).data;
                }
            }, 48);
        }
    }

    /* renamed from: a */
    public final boolean mo93966a(int i, int i2, Intent intent) {
        if (i != 10010 || this.f97506c == null || !this.f97506c.mo94003a(i, i2, intent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo93963a(Context context, C37334b bVar, String str) {
        if (!this.f97512i) {
            this.f97512i = true;
            this.f97509f = bVar;
            this.f97514k = new WeakReference<>(context);
            this.f97507d = m119868a(context);
            this.f97506c = new IabHelper(context, str);
            this.f97506c.mo94001a(true);
            this.f97511h = 3;
            this.f97506c.mo93998a((C37367d) new C37367d() {
                /* renamed from: a */
                public final void mo93969a(C37369a aVar) {
                    if (aVar.mo94038b()) {
                        C37335c.this.f97511h = 2;
                    } else if (C37335c.this.f97506c != null) {
                        C37335c.this.f97511h = 1;
                    }
                }
            });
        }
    }
}
