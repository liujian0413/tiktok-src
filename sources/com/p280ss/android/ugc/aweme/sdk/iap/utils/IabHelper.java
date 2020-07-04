package com.p280ss.android.ugc.aweme.sdk.iap.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.sdk.p1508b.C37320d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper */
public final class IabHelper {

    /* renamed from: a */
    boolean f97555a;

    /* renamed from: b */
    String f97556b = "IabHelper";

    /* renamed from: c */
    boolean f97557c;

    /* renamed from: d */
    public boolean f97558d;

    /* renamed from: e */
    boolean f97559e;

    /* renamed from: f */
    boolean f97560f;

    /* renamed from: g */
    boolean f97561g;

    /* renamed from: h */
    public volatile boolean f97562h;

    /* renamed from: i */
    String f97563i = "";

    /* renamed from: j */
    Context f97564j;

    /* renamed from: k */
    IInAppBillingService f97565k;

    /* renamed from: l */
    ServiceConnection f97566l;

    /* renamed from: m */
    int f97567m;

    /* renamed from: n */
    String f97568n;

    /* renamed from: o */
    String f97569o = null;

    /* renamed from: p */
    C37366c f97570p;

    /* renamed from: q */
    private final Object f97571q = new Object();

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$IabAsyncInProgressException */
    public static class IabAsyncInProgressException extends Exception {
        public IabAsyncInProgressException(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$a */
    public interface C37364a {
        /* renamed from: a */
        void mo93976a(Purchase purchase, C37369a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$b */
    public interface C37365b {
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$c */
    public interface C37366c {
        /* renamed from: a */
        void mo93972a(C37369a aVar, Purchase purchase);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$d */
    public interface C37367d {
        /* renamed from: a */
        void mo93969a(C37369a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$e */
    public interface C37368e {
        /* renamed from: a */
        void mo93971a(C37369a aVar, C37370b bVar);
    }

    /* renamed from: a */
    public final void mo93998a(final C37367d dVar) {
        m119940c();
        if (!this.f97557c) {
            this.f97566l = new ServiceConnection() {
                public final void onServiceDisconnected(ComponentName componentName) {
                    IabHelper.this.f97565k = null;
                }

                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    if (!IabHelper.this.f97558d) {
                        IabHelper.this.f97565k = Stub.asInterface(iBinder);
                        String packageName = IabHelper.this.f97564j.getPackageName();
                        try {
                            int isBillingSupported = IabHelper.this.f97565k.isBillingSupported(3, packageName, "inapp");
                            if (isBillingSupported != 0) {
                                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6002, new C6909j().mo16966a("msg", "iabhelper_error_billing_not_supported").mo16967a());
                                if (dVar != null) {
                                    dVar.mo93969a(new C37369a(isBillingSupported, "Error checking for billing v3 support."));
                                }
                                IabHelper.this.f97560f = false;
                                IabHelper.this.f97561g = false;
                                return;
                            }
                            new StringBuilder("In-app billing version 3 supported for ").append(packageName);
                            if (IabHelper.this.f97565k.isBillingSupported(5, packageName, "subs") == 0) {
                                IabHelper.this.f97561g = true;
                            } else {
                                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6003, new C6909j().mo16966a("msg", "iabhelper_error_billing_not_supported_subs").mo16967a());
                                IabHelper.this.f97561g = false;
                            }
                            if (IabHelper.this.f97561g) {
                                IabHelper.this.f97560f = true;
                            } else {
                                int isBillingSupported2 = IabHelper.this.f97565k.isBillingSupported(3, packageName, "subs");
                                if (isBillingSupported2 == 0) {
                                    IabHelper.this.f97560f = true;
                                } else {
                                    new StringBuilder("Subscriptions NOT AVAILABLE. Response: ").append(isBillingSupported2);
                                    IabHelper.this.f97560f = false;
                                    IabHelper.this.f97561g = false;
                                }
                            }
                            IabHelper.this.f97557c = true;
                            if (dVar != null) {
                                dVar.mo93969a(new C37369a(0, "Setup successful."));
                            }
                        } catch (RemoteException e) {
                            StringBuilder sb = new StringBuilder("iabhelper_remote_exception:");
                            sb.append(e.getMessage());
                            C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6004, new C6909j().mo16966a("msg", sb.toString()).mo16967a());
                            if (dVar != null) {
                                dVar.mo93969a(new C37369a(-6004, "RemoteException while setting up in-app billing."));
                            }
                        }
                    }
                }
            };
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List queryIntentServices = this.f97564j.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6000, new C6909j().mo16966a("msg", "query_google_service_error").mo16967a());
                dVar.mo93969a(new C37369a(3, "Billing service unavailable on device."));
                return;
            }
            if (!this.f97564j.bindService(intent, this.f97566l, 1)) {
                C37320d.m119821a().mo93933a("aweme_wallet_purchase_status", -6001, new C6909j().mo16966a("msg", "bind_google_service_error").mo16967a());
                dVar.mo93969a(new C37369a(3, "Billing service unavailable on device."));
            }
            return;
        }
        throw new IllegalStateException("IAB helper is already set up.");
    }

    /* renamed from: a */
    public final void mo93996a() throws IabAsyncInProgressException {
        synchronized (this.f97571q) {
            if (this.f97562h) {
                StringBuilder sb = new StringBuilder("Can't dispose because an async operation (");
                sb.append(this.f97563i);
                sb.append(") is in progress.");
                throw new IabAsyncInProgressException(sb.toString());
            }
        }
        this.f97557c = false;
        if (!(this.f97566l == null || this.f97565k == null)) {
            try {
                if (this.f97564j != null) {
                    this.f97564j.unbindService(this.f97566l);
                }
            } catch (Exception unused) {
            }
        }
        this.f97558d = true;
        this.f97564j = null;
        this.f97566l = null;
        this.f97565k = null;
        this.f97570p = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m119936a(android.app.Activity r17, java.lang.String r18, java.lang.String r19, java.util.List<java.lang.String> r20, int r21, com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.C37366c r22, java.lang.String r23) throws com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.IabAsyncInProgressException {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            r10 = r21
            r15 = r22
            r16.m119940c()
            java.lang.String r1 = "launchPurchaseFlow"
            r0.m119937a(r1)
            java.lang.String r1 = "launchPurchaseFlow"
            r0.m119939b(r1)
            java.lang.String r1 = "subs"
            boolean r1 = r8.equals(r1)
            r14 = 0
            if (r1 == 0) goto L_0x0036
            boolean r1 = r0.f97560f
            if (r1 != 0) goto L_0x0036
            com.ss.android.ugc.aweme.sdk.iap.utils.a r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.a
            r2 = -1009(0xfffffffffffffc0f, float:NaN)
            java.lang.String r3 = "Subscriptions are not available."
            r1.<init>(r2, r3)
            r16.mo94004b()
            if (r15 == 0) goto L_0x0035
            r15.mo93972a(r1, r14)
        L_0x0035:
            return
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r2 = "Constructing buy intent for "
            r1.<init>(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r7)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r2 = ", item type: "
            r1.append(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r8)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            com.android.vending.billing.IInAppBillingService r1 = r0.f97565k     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2 = 3
            android.content.Context r3 = r0.f97564j     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r4 = r18
            r5 = r19
            r6 = r23
            android.os.Bundle r1 = r1.getBuyIntent(r2, r3, r4, r5, r6)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r2 = r0.m119932a(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            if (r2 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Unable to buy item, Error response: "
            r1.<init>(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = m119935a(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1.append(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r16.mo94004b()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            com.ss.android.ugc.aweme.sdk.iap.utils.a r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.a     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Unable to buy item"
            r1.<init>(r2, r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            if (r15 == 0) goto L_0x007e
            r15.mo93972a(r1, r14)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
        L_0x007e:
            return
        L_0x007f:
            java.lang.String r2 = "BUY_INTENT"
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = "Launching buy intent for "
            r2.<init>(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2.append(r7)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.String r3 = ". Request code: "
            r2.append(r3)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r2.append(r10)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f97567m = r10     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f97570p = r15     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r0.f97568n = r8     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.content.IntentSender r9 = r1.getIntentSender()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r11.<init>()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r12 = r2.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r13 = r2.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            int r1 = r1.intValue()     // Catch:{ SendIntentException -> 0x010b, RemoteException -> 0x00ee, Throwable -> 0x00d1 }
            r8 = r17
            r10 = r21
            r2 = r14
            r14 = r1
            r8.startIntentSenderForResult(r9, r10, r11, r12, r13, r14)     // Catch:{ SendIntentException -> 0x00cf, RemoteException -> 0x00cd, Throwable -> 0x00cb }
            return
        L_0x00cb:
            goto L_0x00d2
        L_0x00cd:
            goto L_0x00ef
        L_0x00cf:
            goto L_0x010c
        L_0x00d1:
            r2 = r14
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "UnknownException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo94004b()
            com.ss.android.ugc.aweme.sdk.iap.utils.a r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.a
            r3 = -1008(0xfffffffffffffc10, float:NaN)
            java.lang.String r4 = "unknown error while starting purchase flow"
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x00ed
            r15.mo93972a(r1, r2)
        L_0x00ed:
            return
        L_0x00ee:
            r2 = r14
        L_0x00ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "RemoteException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo94004b()
            com.ss.android.ugc.aweme.sdk.iap.utils.a r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.a
            r3 = -6004(0xffffffffffffe88c, float:NaN)
            java.lang.String r4 = "Remote exception while starting purchase flow"
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x010a
            r15.mo93972a(r1, r2)
        L_0x010a:
            return
        L_0x010b:
            r2 = r14
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "SendIntentException while launching purchase flow for sku "
            r1.<init>(r3)
            r1.append(r7)
            r16.mo94004b()
            com.ss.android.ugc.aweme.sdk.iap.utils.a r1 = new com.ss.android.ugc.aweme.sdk.iap.utils.a
            r3 = -1004(0xfffffffffffffc14, float:NaN)
            java.lang.String r4 = "Failed to send intent."
            r1.<init>(r3, r4)
            if (r15 == 0) goto L_0x0127
            r15.mo93972a(r1, r2)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.m119936a(android.app.Activity, java.lang.String, java.lang.String, java.util.List, int, com.ss.android.ugc.aweme.sdk.iap.utils.IabHelper$c, java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo94003a(int i, int i2, Intent intent) {
        if (i != this.f97567m) {
            return false;
        }
        m119940c();
        m119937a("handleActivityResult");
        mo94004b();
        if (intent == null) {
            C37369a aVar = new C37369a(-1002, "Null data in IAB result");
            if (this.f97570p != null) {
                this.f97570p.mo93972a(aVar, null);
            }
            return true;
        }
        int a = m119931a(intent);
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && a == 0) {
            new StringBuilder("Purchase data: ").append(stringExtra);
            new StringBuilder("Data signature: ").append(stringExtra2);
            new StringBuilder("Extras: ").append(intent.getExtras());
            new StringBuilder("Expected item type: ").append(this.f97568n);
            if (stringExtra == null || stringExtra2 == null) {
                new StringBuilder("Extras: ").append(intent.getExtras().toString());
                C37369a aVar2 = new C37369a(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.f97570p != null) {
                    this.f97570p.mo93972a(aVar2, null);
                }
                return true;
            }
            try {
                Purchase purchase = new Purchase(this.f97568n, stringExtra, stringExtra2);
                String sku = purchase.getSku();
                if (!C37371c.m119963a(this.f97569o, stringExtra, stringExtra2)) {
                    new StringBuilder("Purchase signature verification FAILED for sku ").append(sku);
                    StringBuilder sb = new StringBuilder("Signature verification failed for sku ");
                    sb.append(sku);
                    C37369a aVar3 = new C37369a(-1003, sb.toString());
                    if (this.f97570p != null) {
                        this.f97570p.mo93972a(aVar3, purchase);
                    }
                    return true;
                } else if (this.f97570p != null) {
                    this.f97570p.mo93972a(new C37369a(0, "Success"), purchase);
                }
            } catch (JSONException unused) {
                C37369a aVar4 = new C37369a(-1002, "Failed to parse purchase data.");
                if (this.f97570p != null) {
                    this.f97570p.mo93972a(aVar4, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            new StringBuilder("Result code was OK but in-app billing response was not OK: ").append(m119935a(a));
            if (this.f97570p != null) {
                this.f97570p.mo93972a(new C37369a(a, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            new StringBuilder("Purchase canceled - Response: ").append(m119935a(a));
            C37369a aVar5 = new C37369a(-1005, "User canceled.");
            if (this.f97570p != null) {
                this.f97570p.mo93972a(aVar5, null);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Purchase failed. Result code: ");
            sb2.append(Integer.toString(i2));
            sb2.append(". Response: ");
            sb2.append(m119935a(a));
            C37369a aVar6 = new C37369a(-1006, "Unknown purchase response.");
            if (this.f97570p != null) {
                this.f97570p.mo93972a(aVar6, null);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C37370b mo93995a(boolean z, List<String> list, List<String> list2) throws IabException {
        m119940c();
        m119937a("queryInventory");
        try {
            C37370b bVar = new C37370b();
            int a = m119933a(bVar, "inapp");
            if (a == 0) {
                if (z) {
                    int a2 = m119934a("inapp", bVar, list);
                    if (a2 != 0) {
                        throw new IabException(a2, "Error refreshing inventory (querying prices of items).");
                    }
                }
                if (this.f97560f) {
                    int a3 = m119933a(bVar, "subs");
                    if (a3 != 0) {
                        throw new IabException(a3, "Error refreshing inventory (querying owned subscriptions).");
                    } else if (z) {
                        int a4 = m119934a("subs", bVar, list2);
                        if (a4 != 0) {
                            throw new IabException(a4, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                }
                return bVar;
            }
            throw new IabException(a, "Error refreshing inventory (querying owned items).");
        } catch (RemoteException e) {
            throw new IabException(-6004, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        } catch (Exception e3) {
            throw new IabException(-1008, "unknow error", e3);
        }
    }

    /* renamed from: a */
    public final void mo94002a(boolean z, List<String> list, List<String> list2, C37368e eVar) throws IabAsyncInProgressException {
        final Handler handler = new Handler();
        m119940c();
        m119937a("queryInventory");
        m119939b("refresh inventory");
        final List<String> list3 = list;
        final C37368e eVar2 = eVar;
        C373592 r0 = new Runnable(true, null) {
            public final void run() {
                final C37370b bVar;
                final C37369a aVar = new C37369a(0, "Inventory refresh successful.");
                try {
                    bVar = IabHelper.this.mo93995a(true, list3, null);
                } catch (IabException e) {
                    aVar = e.getResult();
                    bVar = null;
                }
                IabHelper.this.mo94004b();
                if (!IabHelper.this.f97558d && eVar2 != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                            eVar2.mo93971a(aVar, bVar);
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo93999a(Purchase purchase) throws IabException {
        m119940c();
        m119937a("consume");
        if (purchase.getItemType().equals("inapp")) {
            try {
                String token = purchase.getToken();
                String sku = purchase.getSku();
                if (token == null || token.equals("")) {
                    StringBuilder sb = new StringBuilder("Can't consume ");
                    sb.append(sku);
                    sb.append(". No token.");
                    StringBuilder sb2 = new StringBuilder("PurchaseInfo is missing token for sku: ");
                    sb2.append(sku);
                    sb2.append(" ");
                    sb2.append(purchase);
                    throw new IabException(-1007, sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("Consuming sku: ");
                sb3.append(sku);
                sb3.append(", token: ");
                sb3.append(token);
                int consumePurchase = this.f97565k.consumePurchase(3, this.f97564j.getPackageName(), token);
                if (consumePurchase == 0) {
                    new StringBuilder("Successfully consumed sku: ").append(sku);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("Error consuming consuming sku ");
                sb4.append(sku);
                sb4.append(". ");
                sb4.append(m119935a(consumePurchase));
                StringBuilder sb5 = new StringBuilder("Error consuming sku ");
                sb5.append(sku);
                throw new IabException(consumePurchase, sb5.toString());
            } catch (RemoteException e) {
                StringBuilder sb6 = new StringBuilder("Remote exception while consuming. PurchaseInfo: ");
                sb6.append(purchase);
                throw new IabException(-6004, sb6.toString(), e);
            }
        } else {
            StringBuilder sb7 = new StringBuilder("Items of type '");
            sb7.append(purchase.getItemType());
            sb7.append("' can't be consumed.");
            throw new IabException(-1010, sb7.toString());
        }
    }

    /* renamed from: a */
    public final void mo94000a(Purchase purchase, C37364a aVar) throws IabAsyncInProgressException {
        m119940c();
        m119937a("consume");
        ArrayList arrayList = new ArrayList();
        arrayList.add(purchase);
        m119938a((List<Purchase>) arrayList, aVar, (C37365b) null);
    }

    /* renamed from: c */
    private void m119940c() {
        if (this.f97558d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:5|6)|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94004b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f97571q
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            java.lang.String r2 = "Ending async operation: "
            r1.<init>(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = r3.f97563i     // Catch:{ all -> 0x001f }
            r1.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = ""
            r3.f97563i = r1     // Catch:{ all -> 0x001f }
            r1 = 0
            r3.f97562h = r1     // Catch:{ all -> 0x001f }
            boolean r1 = r3.f97559e     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo93996a()     // Catch:{ IabAsyncInProgressException -> 0x001d }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.sdk.iap.utils.IabHelper.mo94004b():void");
    }

    /* renamed from: a */
    public final void mo94001a(boolean z) {
        m119940c();
        this.f97555a = true;
    }

    /* renamed from: a */
    private void m119937a(String str) {
        if (!this.f97557c) {
            StringBuilder sb = new StringBuilder("Illegal state for operation (");
            sb.append(str);
            sb.append("): IAB helper is not set up.");
            StringBuilder sb2 = new StringBuilder("IAB helper is not set up. Can't perform operation: ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: b */
    private void m119939b(String str) throws IabAsyncInProgressException {
        synchronized (this.f97571q) {
            if (!this.f97562h) {
                this.f97563i = str;
                this.f97562h = true;
                new StringBuilder("Starting async operation: ").append(str);
            } else {
                StringBuilder sb = new StringBuilder("Can't start async operation (");
                sb.append(str);
                sb.append(") because another async operation (");
                sb.append(this.f97563i);
                sb.append(") is in progress.");
                throw new IabAsyncInProgressException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private int m119931a(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Unexpected type for intent response code: ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    private int m119932a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        obj.getClass().getName();
        StringBuilder sb = new StringBuilder("Unexpected type for bundle response code: ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static String m119935a(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(i));
            sb.append(":Unknown IAB Helper Error");
            return sb.toString();
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(i));
            sb2.append(":Unknown");
            return sb2.toString();
        }
    }

    public IabHelper(Context context, String str) {
        this.f97564j = context.getApplicationContext();
        this.f97569o = str;
    }

    /* renamed from: a */
    private int m119933a(C37370b bVar, String str) throws JSONException, RemoteException {
        new StringBuilder("Querying owned items, item type: ").append(str);
        new StringBuilder("Package name: ").append(this.f97564j.getPackageName());
        String str2 = null;
        boolean z = false;
        while (true) {
            new StringBuilder("Calling getPurchases with continuation token: ").append(str2);
            Bundle purchases = this.f97565k.getPurchases(3, this.f97564j.getPackageName(), str, str2);
            int a = m119932a(purchases);
            new StringBuilder("Owned items response: ").append(String.valueOf(a));
            if (a != 0) {
                new StringBuilder("getPurchases() failed: ").append(m119935a(a));
                return a;
            } else if (purchases.containsKey("INAPP_PURCHASE_ITEM_LIST") && purchases.containsKey("INAPP_PURCHASE_DATA_LIST") && purchases.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList stringArrayList = purchases.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = z;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = (String) stringArrayList2.get(i);
                    String str4 = (String) stringArrayList3.get(i);
                    String str5 = (String) stringArrayList.get(i);
                    if (C37371c.m119963a(this.f97569o, str3, str4)) {
                        new StringBuilder("Sku is owned: ").append(str5);
                        Purchase purchase = new Purchase(str, str3, str4);
                        if (TextUtils.isEmpty(purchase.getToken())) {
                            new StringBuilder("Purchase data: ").append(str3);
                        }
                        bVar.mo94041a(purchase);
                    } else {
                        new StringBuilder("   Purchase data: ").append(str3);
                        new StringBuilder("   Signature: ").append(str4);
                        z2 = true;
                    }
                }
                str2 = purchases.getString("INAPP_CONTINUATION_TOKEN");
                new StringBuilder("Continuation token: ").append(str2);
                if (!TextUtils.isEmpty(str2)) {
                    z = z2;
                } else if (z2) {
                    return -1003;
                } else {
                    return 0;
                }
            }
        }
        return -1002;
    }

    /* renamed from: a */
    private void m119938a(List<Purchase> list, C37364a aVar, C37365b bVar) throws IabAsyncInProgressException {
        final Handler handler = new Handler();
        m119939b("consume");
        final List<Purchase> list2 = list;
        final C37364a aVar2 = aVar;
        C373613 r0 = new Runnable(null) {
            public final void run() {
                final ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list2) {
                    try {
                        IabHelper.this.mo93999a(purchase);
                        StringBuilder sb = new StringBuilder("Successful consume of sku ");
                        sb.append(purchase.getSku());
                        arrayList.add(new C37369a(0, sb.toString()));
                    } catch (IabException e) {
                        arrayList.add(e.getResult());
                    }
                }
                IabHelper.this.mo94004b();
                if (!IabHelper.this.f97558d && aVar2 != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                            aVar2.mo93976a((Purchase) list2.get(0), (C37369a) arrayList.get(0));
                        }
                    });
                }
                if (!IabHelper.this.f97558d && null != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* renamed from: a */
    private int m119934a(String str, C37370b bVar, List<String> list) throws RemoteException, JSONException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.mo94044c(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = new ArrayList();
            int i2 = i * 20;
            for (String add : arrayList.subList(i2, i2 + 20)) {
                arrayList3.add(add);
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            int i3 = size * 20;
            for (String add2 : arrayList.subList(i3, size2 + i3)) {
                arrayList4.add(add2);
            }
            arrayList2.add(arrayList4);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ArrayList arrayList5 = (ArrayList) it.next();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            Bundle skuDetails = this.f97565k.getSkuDetails(3, this.f97564j.getPackageName(), str, bundle);
            if (!skuDetails.containsKey("DETAILS_LIST")) {
                int a = m119932a(skuDetails);
                if (a == 0) {
                    return -1002;
                }
                new StringBuilder("getSkuDetails() failed: ").append(m119935a(a));
                return a;
            }
            Iterator it2 = skuDetails.getStringArrayList("DETAILS_LIST").iterator();
            while (it2.hasNext()) {
                C37372d dVar = new C37372d(str, (String) it2.next());
                new StringBuilder("Got sku details: ").append(dVar);
                bVar.mo94042a(dVar);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo93997a(Activity activity, String str, int i, C37366c cVar, String str2) throws IabAsyncInProgressException {
        m119936a(activity, str, "inapp", null, 10010, cVar, str2);
    }
}
