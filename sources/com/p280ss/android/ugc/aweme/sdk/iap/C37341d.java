package com.p280ss.android.ugc.aweme.sdk.iap;

import android.os.Message;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.sdk.iap.api.C37333a;
import com.p280ss.android.ugc.aweme.sdk.iap.model.request.IapPayBody;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultStruct;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.C37369a;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.C37364a;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.IabAsyncInProgressException;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.Purchase;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37319c;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37320d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.d */
public final class C37341d implements C6310a {

    /* renamed from: a */
    public Purchase f97525a;

    /* renamed from: b */
    public C37334b f97526b;

    /* renamed from: c */
    public IabHelper f97527c;

    /* renamed from: b */
    private void m119887b(final boolean z) {
        try {
            if (this.f97527c != null) {
                this.f97527c.mo94000a(this.f97525a, (C37364a) new C37364a() {
                    /* renamed from: a */
                    public final void mo93976a(Purchase purchase, C37369a aVar) {
                        if (C37341d.this.f97527c == null) {
                            C37341d.this.mo93974a(z, new Exception("mHelper is null"));
                        } else if (aVar.mo94037a()) {
                            C37341d.this.f97525a.setPendingCount(0);
                            C37341d.this.f97525a.setRetryCount(0);
                            if (!z) {
                                C37341d.this.f97526b.mo93930a(2, (Object) C37341d.this.f97525a);
                            } else {
                                C37341d.this.f97526b.mo93930a(3, (Object) C37341d.this.f97525a);
                            }
                            StringBuilder sb = new StringBuilder("isRetry:");
                            sb.append(z);
                            C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", 0, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
                        } else {
                            C37341d.this.mo93974a(z, new Exception(C1642a.m8034a("consumeAsync Error while consuming: %s, isRetry=%s, orderId=%s, product=%s", new Object[]{aVar, Boolean.valueOf(z), C37341d.this.f97525a.getInnerOrderId(), C37341d.this.f97525a.getSku()})));
                        }
                    }
                });
            }
        } catch (IabAsyncInProgressException e) {
            mo93974a(z, (Exception) e);
        }
    }

    /* renamed from: c */
    private void m119888c(final boolean z) {
        int i;
        C23397p a = C23397p.m76735a();
        C6309f weakHandler = this.f97525a.getWeakHandler();
        C373443 r2 = new Callable() {
            public final Object call() throws Exception {
                return C37333a.m119861a(C37341d.this.f97525a.getInnerOrderId());
            }
        };
        if (z) {
            i = 97;
        } else {
            i = 96;
        }
        a.mo60807a(weakHandler, r2, i);
    }

    /* renamed from: d */
    private void m119889d(final boolean z) {
        this.f97525a.getWeakHandler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                C23397p a = C23397p.m76735a();
                C6309f weakHandler = C37341d.this.f97525a.getWeakHandler();
                C373461 r2 = new Callable() {
                    public final Object call() throws Exception {
                        return C37333a.m119861a(C37341d.this.f97525a.getInnerOrderId());
                    }
                };
                if (z) {
                    i = 97;
                } else {
                    i = 96;
                }
                a.mo60807a(weakHandler, r2, i);
            }
        }, (long) (Math.pow(2.0d, (double) this.f97525a.getPendingCount()) * 500.0d));
        this.f97525a.setPendingCount(this.f97525a.getPendingCount() + 1);
    }

    /* renamed from: a */
    public final void mo93973a(final boolean z) {
        if (this.f97527c.f97562h) {
            this.f97525a.getWeakHandler().postDelayed(new Runnable() {
                public final void run() {
                    C37341d.this.mo93973a(z);
                }
            }, 500);
        } else {
            m119887b(z);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f97525a.getWeakHandler() != null) {
            switch (message.what) {
                case 49:
                    m119890e(false);
                    return;
                case 50:
                    m119890e(true);
                    return;
                case 64:
                    m119885a(message, false);
                    return;
                case 65:
                    m119885a(message, true);
                    return;
                case 96:
                    m119886b(message, false);
                    return;
                case 97:
                    m119886b(message, true);
                    break;
            }
        }
    }

    /* renamed from: e */
    private void m119890e(boolean z) {
        long j;
        if (TextUtils.isEmpty(this.f97525a.getInnerOrderId())) {
            mo93974a(z, new Exception("innerOrderId is empty"));
            return;
        }
        final IapPayBody iapPayBody = new IapPayBody();
        iapPayBody.packageName = this.f97525a.getPackageName();
        iapPayBody.productId = this.f97525a.getSku();
        iapPayBody.purchaseToken = this.f97525a.getPurchaseToken();
        if (!z) {
            C23397p.m76735a().mo60807a(this.f97525a.getWeakHandler(), new Callable() {
                public final Object call() throws Exception {
                    return C37333a.m119859a(C37341d.this.f97525a.getInnerOrderId(), iapPayBody);
                }
            }, 64);
            return;
        }
        if (this.f97525a.getRetryCount() == 0) {
            j = 0;
        } else {
            j = (long) (Math.pow(2.0d, (double) this.f97525a.getRetryCount()) * 500.0d);
        }
        this.f97525a.getWeakHandler().postDelayed(new Runnable() {
            public final void run() {
                C23397p.m76735a().mo60807a(C37341d.this.f97525a.getWeakHandler(), new Callable() {
                    public final Object call() throws Exception {
                        return C37333a.m119859a(C37341d.this.f97525a.getInnerOrderId(), iapPayBody);
                    }
                }, 65);
            }
        }, j);
        this.f97525a.setRetryCount(this.f97525a.getRetryCount() + 1);
    }

    /* renamed from: a */
    private void m119885a(Message message, boolean z) {
        if (message.obj instanceof Exception) {
            mo93974a(z, (Exception) message.obj);
            m119890e(true);
            return;
        }
        m119888c(z);
    }

    /* renamed from: b */
    private void m119886b(Message message, boolean z) {
        if (message.obj instanceof Exception) {
            mo93974a(z, (Exception) message.obj);
            m119889d(true);
            return;
        }
        PayOrderResultStruct payOrderResultStruct = ((PayOrderResultResponse) message.obj).data;
        if (payOrderResultStruct != null) {
            if (payOrderResultStruct.result == 0) {
                m119889d(z);
            } else if (payOrderResultStruct.result == 1) {
                mo93973a(z);
            } else {
                mo93974a(z, new Exception("all is fail"));
            }
        }
    }

    /* renamed from: a */
    public final void mo93974a(boolean z, Exception exc) {
        String str;
        if (!z) {
            this.f97526b.mo93929a(2, exc);
            C37319c a = C37320d.m119821a();
            String str2 = "aweme_wallet_purchase_status";
            C6909j jVar = new C6909j();
            String str3 = "msg";
            StringBuilder sb = new StringBuilder("buy_coins IapVerifyHandler  failed, purchase originalJson: ");
            sb.append(this.f97525a.getOriginalJson());
            sb.append("innerOrderId");
            sb.append(this.f97525a.getInnerOrderId());
            if (exc == null) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder("  exception:");
                sb2.append(exc.getClass().getSimpleName());
                sb2.append("  errMsg:");
                sb2.append(exc.getMessage());
                str = sb2.toString();
            }
            sb.append(str);
            a.mo93933a(str2, -6007, jVar.mo16966a(str3, sb.toString()).mo16967a());
        }
    }

    C37341d(Purchase purchase, C37334b bVar, IabHelper iabHelper) {
        this.f97525a = purchase;
        this.f97526b = bVar;
        this.f97527c = iabHelper;
    }
}
