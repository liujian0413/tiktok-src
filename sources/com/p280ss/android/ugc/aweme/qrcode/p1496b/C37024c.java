package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.qrcode.model.C37088g;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37053a;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37054b;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.c */
public final class C37024c implements C37054b {

    /* renamed from: d */
    public static final C37025a f96958d = new C37025a(null);

    /* renamed from: a */
    public final C37088g f96959a = new C37088g();

    /* renamed from: b */
    public final Activity f96960b;

    /* renamed from: c */
    public C37053a f96961c;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.c$a */
    public static final class C37025a {
        private C37025a() {
        }

        public /* synthetic */ C37025a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.c$b */
    static final class C37026b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37024c f96962a;

        /* renamed from: b */
        final /* synthetic */ String f96963b;

        C37026b(C37024c cVar, String str) {
            this.f96962a = cVar;
            this.f96963b = str;
        }

        public final /* synthetic */ Object call() {
            m119069a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m119069a() {
            C37053a aVar = this.f96962a.f96961c;
            if (aVar != null) {
                aVar.mo93505f();
            }
            this.f96962a.f96959a.addNotifyListener(new C25678f(this) {

                /* renamed from: a */
                final /* synthetic */ C37026b f96964a;

                /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo56977b() {
                    /*
                        r4 = this;
                        com.ss.android.ugc.aweme.qrcode.b.c$b r0 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r0 = r0.f96962a
                        com.ss.android.ugc.aweme.qrcode.b.n$a r0 = r0.f96961c
                        if (r0 == 0) goto L_0x000b
                        r0.mo93507g()
                    L_0x000b:
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        com.ss.android.ugc.aweme.qrcode.b.c$b r1 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r1 = r1.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r1 = r1.f96959a
                        T r1 = r1.mData
                        if (r1 == 0) goto L_0x008d
                        com.ss.android.ugc.aweme.qrcode.b.c$b r1 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r1 = r1.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r1 = r1.f96959a
                        T r1 = r1.mData
                        com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse r1 = (com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse) r1
                        if (r1 != 0) goto L_0x0029
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x0029:
                        com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r1 = r1.getEasterEgg()
                        if (r1 == 0) goto L_0x008d
                        com.ss.android.ugc.aweme.qrcode.b.c$b r1 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r1 = r1.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r1 = r1.f96959a
                        T r1 = r1.mData
                        com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse r1 = (com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse) r1
                        if (r1 != 0) goto L_0x003e
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x003e:
                        int r1 = r1.status_code
                        if (r1 != 0) goto L_0x008d
                        com.ss.android.ugc.aweme.qrcode.b.c$b r1 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r1 = r1.f96962a
                        com.ss.android.ugc.aweme.qrcode.b.c$b r2 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r2 = r2.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r2 = r2.f96959a
                        T r2 = r2.mData
                        com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse r2 = (com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse) r2
                        if (r2 != 0) goto L_0x0055
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x0055:
                        com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r2 = r2.getEasterEgg()
                        if (r2 != 0) goto L_0x005e
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x005e:
                        r1.mo93463a(r2)
                        r1 = r0
                        java.util.Map r1 = (java.util.Map) r1
                        java.lang.String r2 = "next_page"
                        com.ss.android.ugc.aweme.qrcode.b.c$b r3 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r3 = r3.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r3 = r3.f96959a
                        T r3 = r3.mData
                        com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse r3 = (com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse) r3
                        if (r3 != 0) goto L_0x0075
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x0075:
                        com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r3 = r3.getEasterEgg()
                        if (r3 != 0) goto L_0x007e
                        kotlin.jvm.internal.C7573i.m23580a()
                    L_0x007e:
                        boolean r3 = r3.isH5()
                        if (r3 == 0) goto L_0x0087
                        java.lang.String r3 = "direct"
                        goto L_0x0089
                    L_0x0087:
                        java.lang.String r3 = "egg_ad"
                    L_0x0089:
                        r1.put(r2, r3)
                        goto L_0x0098
                    L_0x008d:
                        com.ss.android.ugc.aweme.qrcode.b.c$b r1 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r1 = r1.f96962a
                        com.ss.android.ugc.aweme.qrcode.b.n$a r1 = r1.f96961c
                        if (r1 == 0) goto L_0x0098
                        r1.bG_()
                    L_0x0098:
                        java.util.Map r0 = (java.util.Map) r0
                        java.lang.String r1 = "enter_from"
                        java.lang.String r2 = "qr_code_scan"
                        r0.put(r1, r2)
                        java.lang.String r1 = "fail_code"
                        com.ss.android.ugc.aweme.qrcode.b.c$b r2 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r2 = r2.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r2 = r2.f96959a
                        T r2 = r2.mData
                        com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse r2 = (com.p280ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse) r2
                        if (r2 == 0) goto L_0x00b6
                        int r2 = r2.status_code
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        goto L_0x00b7
                    L_0x00b6:
                        r2 = 0
                    L_0x00b7:
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        r0.put(r1, r2)
                        java.lang.String r1 = "recognation_status"
                        com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
                        com.ss.android.ugc.aweme.qrcode.b.c$b r0 = r4.f96964a
                        com.ss.android.ugc.aweme.qrcode.b.c r0 = r0.f96962a
                        com.ss.android.ugc.aweme.qrcode.model.g r0 = r0.f96959a
                        r1 = r4
                        com.ss.android.ugc.aweme.common.f r1 = (com.p280ss.android.ugc.aweme.common.C25678f) r1
                        r0.clearNotifyListener(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.qrcode.p1496b.C37024c.C37026b.C370271.mo56977b():void");
                }

                {
                    this.f96964a = r1;
                }

                /* renamed from: a */
                public final void mo57296a(Exception exc) {
                    C37053a aVar = this.f96964a.f96962a.f96961c;
                    if (aVar != null) {
                        aVar.mo93507g();
                    }
                    C37053a aVar2 = this.f96964a.f96962a.f96961c;
                    if (aVar2 != null) {
                        aVar2.bG_();
                    }
                    this.f96964a.f96962a.f96959a.clearNotifyListener(this);
                }
            });
            this.f96962a.f96959a.mo93539a(this.f96963b);
        }
    }

    /* renamed from: a */
    public final long mo93461a() {
        return 35734127902720L;
    }

    /* renamed from: a */
    public final void mo93464a(boolean z, int i, int i2) {
    }

    /* renamed from: c */
    public final void mo93466c() {
        this.f96961c = null;
    }

    /* renamed from: b */
    public static String[] m119060b() {
        return new String[]{"arscan", "ObjectScan"};
    }

    /* renamed from: d */
    public final void mo93467d() {
        C37053a aVar = this.f96961c;
        if (aVar != null) {
            aVar.mo93500a(true);
        }
    }

    /* renamed from: e */
    private final void m119061e() {
        Vibrator vibrator = (Vibrator) this.f96960b.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: a */
    public final void mo93463a(EasterEggInfo easterEggInfo) {
        if (easterEggInfo.isH5()) {
            if (!C25371n.m83463a((Context) this.f96960b, easterEggInfo.getOpenUrl(), false)) {
                C25371n.m83459a((Context) this.f96960b, easterEggInfo.getWebUrl(), easterEggInfo.getWebTitle());
            }
            C37053a aVar = this.f96961c;
            if (aVar != null) {
                aVar.mo93502c();
            }
            C37053a aVar2 = this.f96961c;
            if (aVar2 != null) {
                aVar2.finish();
            }
        } else {
            EasterEggPageParams easterEggPageParams = new EasterEggPageParams();
            easterEggPageParams.setEasterEggInfo(easterEggInfo);
            easterEggPageParams.setEnterFrom("qr_code_scan");
            C25222ad.m82927a(this.f96960b, easterEggPageParams, BaseNotice.HASHTAG);
            C37053a aVar3 = this.f96961c;
            if (aVar3 != null) {
                aVar3.mo93502c();
            }
            C37053a aVar4 = this.f96961c;
            if (aVar4 != null) {
                aVar4.mo93504e();
            }
        }
    }

    public C37024c(Activity activity, C37053a aVar) {
        C7573i.m23587b(activity, "activity");
        this.f96960b = activity;
        this.f96961c = aVar;
    }

    /* renamed from: a */
    public final void mo93462a(int i, int i2, Intent intent) {
        if (i == 101) {
            if (i2 != 1002) {
                C37053a aVar = this.f96961c;
                if (aVar != null) {
                    aVar.finish();
                }
            } else {
                C37053a aVar2 = this.f96961c;
                if (aVar2 != null) {
                    aVar2.bG_();
                }
                C37053a aVar3 = this.f96961c;
                if (aVar3 != null) {
                    aVar3.mo93503d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93465a(boolean z, int i, String str, int i2) {
        C7573i.m23587b(str, "result");
        C1592h.m7855a((Callable<TResult>) new C37026b<TResult>(this, str), C1592h.f5958b);
        m119061e();
    }
}
