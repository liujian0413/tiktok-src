package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.p280ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.CouponDetailApiResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent.C33461a;
import com.p280ss.android.ugc.aweme.p1004an.p1006b.C22499a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p331m.C7164b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.qrcode.C37075e;
import com.p280ss.android.ugc.aweme.qrcode.TextQRCodeActivity;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37006b;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37012d;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37013e;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37014f;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37015g;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37016h;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37017i;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37028d.C37030a;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37053a;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37054b;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.p280ss.android.ugc.aweme.router.C37286v;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.p280ss.android.ugc.aweme.util.C42886m;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.f */
public final class C37032f implements C37030a, C37054b {

    /* renamed from: a */
    public AmeSSActivity f96971a;

    /* renamed from: b */
    public C37053a f96972b;

    /* renamed from: c */
    public boolean f96973c;

    /* renamed from: d */
    public String f96974d;

    /* renamed from: e */
    public boolean f96975e;

    /* renamed from: f */
    public boolean f96976f;

    /* renamed from: g */
    public boolean f96977g;

    /* renamed from: h */
    private C37028d f96978h;

    /* renamed from: i */
    private C37075e f96979i = new C37075e();

    /* renamed from: j */
    private List<C37012d> f96980j;

    /* renamed from: k */
    private List<C37012d> f96981k;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.f$a */
    static class C37038a {

        /* renamed from: a */
        public final CouponDetailApiResponse f96995a;

        /* renamed from: b */
        public final String f96996b;

        C37038a(CouponDetailApiResponse couponDetailApiResponse, String str) {
            this.f96995a = couponDetailApiResponse;
            this.f96996b = str;
        }
    }

    /* renamed from: a */
    public final long mo93461a() {
        return 65536;
    }

    /* renamed from: a */
    public final void mo93462a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public final void mo93465a(boolean z, int i, final String str, final int i2) {
        if (this.f96971a.isViewValid()) {
            if (i2 == 2) {
                C42886m.m136182b(str, this.f96971a);
            } else if (!C42886m.m136181a(str, (Activity) this.f96971a)) {
                this.f96973c = z;
                if (!C37043k.m119113a(this.f96971a)) {
                    C9738o.m28693a((Context) this.f96971a, (int) R.string.cjs);
                    return;
                }
                C42961az.m136380a(new C33461a().mo85771a("qrCode").mo85774b(str).mo85773a());
                C1592h a = C1592h.m7855a((Callable<TResult>) new Callable<String>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public String call() throws Exception {
                        C37032f.this.f96972b.mo93505f();
                        return null;
                    }
                }, C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<String, C37038a>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C37038a then(C1592h<String> hVar) throws Exception {
                        String str;
                        int i;
                        if (C37073c.m119201a(str)) {
                            str = C38012e.m121342b(str);
                        } else {
                            str = str;
                        }
                        CouponDetailApiResponse couponDetailApiResponse = null;
                        if (!C6399b.m19944t() && !TimeLockRuler.isTeenModeON() && TextUtils.equals("13", C37286v.m119759b(str, "schema_type"))) {
                            String b = C37286v.m119759b(str, "object_id");
                            if (!TextUtils.isEmpty(b)) {
                                try {
                                    if (i2 == 3) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    couponDetailApiResponse = (CouponDetailApiResponse) CouponRedeemApi.m80560a(b, i).get();
                                } catch (InterruptedException | CancellationException | ExecutionException unused) {
                                }
                            }
                        }
                        return new C37038a(couponDetailApiResponse, str);
                    }
                }, (Executor) C1592h.f5957a);
                final int i3 = i2;
                final int i4 = i;
                final String str2 = str;
                final boolean z2 = z;
                C370342 r1 = new C1591g<C37038a, String>() {
                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo93483a(C37038a aVar) {
                        PoiCouponRedeemActivity.m80495a(C37032f.this.f96971a, C37286v.m119759b(aVar.f96996b, "object_id"), aVar.f96995a, "scan");
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
                    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8  */
                    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ff  */
                    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.lang.String then(bolts.C1592h<com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.C37038a> r7) {
                        /*
                            r6 = this;
                            java.lang.Object r7 = r7.mo6890e()
                            com.ss.android.ugc.aweme.qrcode.b.f$a r7 = (com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.C37038a) r7
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r0 = r7.f96995a
                            r1 = 1
                            r2 = 0
                            if (r0 == 0) goto L_0x0060
                            boolean r0 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
                            if (r0 != 0) goto L_0x0060
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r0 = r7.f96995a
                            int r0 = r0.statusCode
                            if (r0 == 0) goto L_0x0028
                            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r1 = r7.f96995a
                            java.lang.String r1 = r1.statusMsg
                            com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r0, r1)
                            r0.mo25750a()
                            goto L_0x006f
                        L_0x0028:
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r0 = r7.f96995a
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetail r0 = r0.coupon
                            if (r0 == 0) goto L_0x0048
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r0 = r7.f96995a
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetail r0 = r0.coupon
                            int r0 = r0.couponType
                            r3 = 10
                            if (r0 != r3) goto L_0x0048
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r0.f96971a
                            java.lang.String r3 = r7.f96996b
                            java.lang.String r4 = "object_id"
                            java.lang.String r3 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r3, r4)
                            com.p280ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity.m80454a(r0, r3)
                            goto L_0x0070
                        L_0x0048:
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            java.lang.String r3 = "verify_coupon_page"
                            r0.f96974d = r3
                            android.os.Handler r0 = new android.os.Handler
                            android.os.Looper r3 = android.os.Looper.getMainLooper()
                            r0.<init>(r3)
                            com.ss.android.ugc.aweme.qrcode.b.j r3 = new com.ss.android.ugc.aweme.qrcode.b.j
                            r3.<init>(r6, r7)
                            r0.post(r3)
                            goto L_0x0070
                        L_0x0060:
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.f r1 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r1.f96971a
                            java.lang.String r3 = r7.f96996b
                            int r4 = r3
                            int r5 = r4
                            r0.mo93482a(r1, r3, r4, r5)
                        L_0x006f:
                            r1 = 0
                        L_0x0070:
                            int r0 = r3
                            r3 = 3
                            if (r0 != r3) goto L_0x0086
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r7 = r7.f96972b
                            r7.mo93507g()
                            if (r1 != 0) goto L_0x00ca
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r7 = r7.f96972b
                            r7.mo93509i()
                            goto L_0x00ca
                        L_0x0086:
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            boolean r0 = r0.f96976f
                            if (r0 == 0) goto L_0x0098
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r7 = r7.f96972b
                            r7.mo93507g()
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            r7.f96976f = r2
                            goto L_0x00ca
                        L_0x0098:
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            boolean r0 = r0.f96975e
                            if (r0 != 0) goto L_0x00c6
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            boolean r0 = r0.f96977g
                            if (r0 != 0) goto L_0x00c1
                            com.ss.android.ugc.aweme.qrcode.b.f r0 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r0 = r0.f96972b
                            r0.mo93502c()
                            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$CouponDetailApiResponse r7 = r7.f96995a
                            if (r7 != 0) goto L_0x00b9
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r7 = r7.f96972b
                            r0 = 200(0xc8, float:2.8E-43)
                            r7.mo93499a(r0)
                            goto L_0x00ca
                        L_0x00b9:
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            com.ss.android.ugc.aweme.qrcode.b.n$a r7 = r7.f96972b
                            r7.finish()
                            goto L_0x00ca
                        L_0x00c1:
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            r7.f96977g = r2
                            goto L_0x00ca
                        L_0x00c6:
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            r7.f96975e = r2
                        L_0x00ca:
                            java.lang.String r7 = r5
                            android.net.Uri r7 = android.net.Uri.parse(r7)
                            java.lang.String r0 = "u_code"
                            java.lang.String r7 = r7.getQueryParameter(r0)
                            com.ss.android.ugc.aweme.metrics.aj r0 = new com.ss.android.ugc.aweme.metrics.aj
                            r0.<init>()
                            java.lang.String r1 = r5
                            com.ss.android.ugc.aweme.metrics.aj r0 = r0.mo85088a(r1)
                            boolean r1 = r6
                            if (r1 == 0) goto L_0x00e8
                            java.lang.String r1 = "scan_album"
                            goto L_0x00ea
                        L_0x00e8:
                            java.lang.String r1 = "scan_cam"
                        L_0x00ea:
                            com.ss.android.ugc.aweme.metrics.aj r0 = r0.mo85089b(r1)
                            com.ss.android.ugc.aweme.qrcode.b.f r1 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            java.lang.String r1 = r1.f96974d
                            com.ss.android.ugc.aweme.metrics.aj r0 = r0.mo85090c(r1)
                            com.ss.android.ugc.aweme.metrics.aj r7 = r0.mo85091d(r7)
                            int r0 = r4
                            r1 = 2
                            if (r0 != r1) goto L_0x0102
                            java.lang.String r0 = "shaped"
                            goto L_0x0104
                        L_0x0102:
                            java.lang.String r0 = "general"
                        L_0x0104:
                            com.ss.android.ugc.aweme.metrics.aj r7 = r7.mo85092e(r0)
                            r7.mo85252e()
                            com.ss.android.ugc.aweme.qrcode.b.f r7 = com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.this
                            r7.f96973c = r2
                            r7 = 0
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.C370342.then(bolts.h):java.lang.String");
                    }
                };
                a.mo6876a((C1591g<TResult, TContinuationResult>) r1, C1592h.f5958b);
                m119090f();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo93482a(Context context, String str, int i, int i2) {
        String a = m119085a(str);
        if (TimeLockRuler.isTeenModeON() && !ParentalPlatformManager.m74632b(a)) {
            C10761a.m31409e(C6399b.m19921a(), (int) R.string.e5q).mo25750a();
            return true;
        } else if (C37073c.m119202b(a) || C37073c.m119205e(a)) {
            if (C37073c.m119205e(a)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("&schema_type=9");
                sb.append("&object_id=");
                sb.append(C37286v.m119759b(a, "app_effect_id"));
                a = sb.toString();
            }
            for (C37012d dVar : this.f96980j) {
                if (dVar.mo59069a(a, i2)) {
                    this.f96974d = dVar.mo93443a();
                    return true;
                }
            }
            this.f96974d = "web";
            if (this.f96978h == null) {
                this.f96978h = new C37028d(this);
            }
            this.f96978h.mo93470a(this.f96971a, a, i);
            return true;
        } else {
            for (C37012d dVar2 : this.f96981k) {
                if (dVar2.mo59069a(a, i2)) {
                    this.f96974d = dVar2.mo93443a();
                    return true;
                }
            }
            TextQRCodeActivity.m119029a(this.f96971a, a);
            this.f96974d = "text";
            return true;
        }
    }

    /* renamed from: a */
    public final void mo93464a(boolean z, int i, int i2) {
        if (this.f96971a != null && this.f96971a.isViewValid()) {
            new Handler(Looper.getMainLooper()).post(new C37039g(this, z));
            if (z) {
                this.f96972b.bG_();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        if (com.bytedance.ies.ugc.appcontext.C6399b.m19944t() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        com.p280ss.android.ugc.aweme.forward.view.ForwardDetailActivity.m98168a(r12, r14, r6, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0238, code lost:
        m119088a("enter_tag_detail", r0.f96973c, "tag_id", r14);
        com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity.m77713a(r12, r14, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0244, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93481a(android.content.Context r12, int r13, final java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r3 = r14
            r5 = r15
            r6 = r16
            java.lang.String r2 = ""
            boolean r4 = android.text.TextUtils.isEmpty(r15)
            if (r4 != 0) goto L_0x0027
            android.net.Uri r4 = android.net.Uri.parse(r15)
            if (r4 == 0) goto L_0x0027
            java.lang.String r2 = "sec_uid"
            java.lang.String r2 = r4.getQueryParameter(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0027
            com.ss.android.ugc.aweme.utils.dz r4 = com.p280ss.android.ugc.aweme.utils.C43077dz.m136657a()
            r4.mo104731a(r14, r2)
        L_0x0027:
            boolean r4 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            r7 = 0
            if (r4 == 0) goto L_0x002f
            return r7
        L_0x002f:
            r4 = 0
            r8 = 1
            switch(r13) {
                case 1: goto L_0x0245;
                case 2: goto L_0x0238;
                case 3: goto L_0x022b;
                case 4: goto L_0x021e;
                case 5: goto L_0x01ea;
                case 6: goto L_0x0034;
                case 7: goto L_0x0189;
                case 8: goto L_0x0185;
                case 9: goto L_0x0130;
                case 10: goto L_0x00bc;
                case 11: goto L_0x0034;
                case 12: goto L_0x0034;
                case 13: goto L_0x0034;
                case 14: goto L_0x0034;
                case 15: goto L_0x0034;
                case 16: goto L_0x00af;
                case 17: goto L_0x0084;
                case 18: goto L_0x0034;
                case 19: goto L_0x0125;
                case 20: goto L_0x006c;
                case 21: goto L_0x0054;
                case 22: goto L_0x0034;
                case 23: goto L_0x004f;
                case 24: goto L_0x0036;
                case 25: goto L_0x0035;
                case 26: goto L_0x0035;
                case 27: goto L_0x0035;
                case 28: goto L_0x0035;
                case 29: goto L_0x0245;
                default: goto L_0x0034;
            }
        L_0x0034:
            return r7
        L_0x0035:
            return r7
        L_0x0036:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x003d
            return r7
        L_0x003d:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r16
            r6 = r7
            com.p280ss.android.ugc.aweme.mix.MixDetailActivity.m108254a(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x004f:
            com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao.m82974a(r14)
            goto L_0x0238
        L_0x0054:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x005b
            return r7
        L_0x005b:
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r1 = com.p280ss.android.ugc.aweme.commerce.service.C24436a.m80356a()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r2 = r0.f96971a
            r3 = r14
            r4 = r16
            r5 = r15
            r6 = r18
            boolean r1 = r1.gotoPortfolio(r2, r3, r4, r5, r6)
            return r1
        L_0x006c:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x0073
            return r7
        L_0x0073:
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r1 = com.p280ss.android.ugc.aweme.commerce.service.C24436a.m80356a()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r2 = r0.f96971a
            r3 = r14
            r4 = r16
            r5 = r15
            r6 = r18
            boolean r1 = r1.gotoSeedPage(r2, r3, r4, r5, r6)
            return r1
        L_0x0084:
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r7] = r3
            java.util.ArrayList r2 = com.google.common.collect.C17795bu.m59146a((E[]) r2)
            com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.m133131a(r12, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = "enter_prop_detail"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "scan"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r4, r5)
            java.lang.String r4 = "prop_id"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r4, r14)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)
        L_0x00ae:
            return r8
        L_0x00af:
            java.lang.String r4 = "enter_personal_detail"
            boolean r5 = r0.f96973c
            java.lang.String r7 = "user_id"
            r11.m119088a(r4, r5, r7, r14)
            com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity.m117394a(r12, r14, r2, r6)
            return r8
        L_0x00bc:
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r2 != 0) goto L_0x0125
            java.lang.String r1 = "id"
            java.lang.String r1 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r1)
            java.lang.String r2 = "edition_uid"
            com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x00d4
            return r7
        L_0x00d4:
            boolean r2 = com.p280ss.android.ugc.aweme.discover.helper.C26656d.m87587a()
            if (r2 != 0) goto L_0x0124
            r0.f96976f = r8
            int r1 = java.lang.Integer.parseInt(r1)
            switch(r1) {
                case 0: goto L_0x0118;
                case 1: goto L_0x010b;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x0124
        L_0x00e4:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131827408(0x7f111ad0, float:1.9287728E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            goto L_0x0124
        L_0x00f1:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131827407(0x7f111acf, float:1.9287726E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            goto L_0x0124
        L_0x00fe:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131827405(0x7f111acd, float:1.9287722E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            goto L_0x0124
        L_0x010b:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131827409(0x7f111ad1, float:1.928773E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
            goto L_0x0124
        L_0x0118:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131827410(0x7f111ad2, float:1.9287732E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31409e(r1, r2)
            r1.mo25750a()
        L_0x0124:
            return r8
        L_0x0125:
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r2 == 0) goto L_0x012c
            return r7
        L_0x012c:
            com.p280ss.android.ugc.aweme.forward.view.ForwardDetailActivity.m98168a(r12, r14, r6, r4, r7)
            return r8
        L_0x0130:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.publish.IPublishService r1 = r1.getPublishService()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r2 = r0.f96971a
            boolean r1 = r1.checkIsAlreadyPublished(r2)
            if (r1 != 0) goto L_0x0156
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131820882(0x7f110152, float:1.9274491E38)
            com.bytedance.common.utility.C9738o.m28693a(r1, r2)
            com.ss.android.ugc.aweme.qrcode.b.n$a r1 = r0.f96972b
            r1.bG_()
            return r8
        L_0x0156:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            java.lang.String r2 = "grade_key"
            java.lang.String r2 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r2)
            if (r1 == 0) goto L_0x0174
            boolean r1 = r1.needLoginBeforeRecord()
            if (r1 != 0) goto L_0x0174
            r11.mo93479a(r14, r2)
            goto L_0x0184
        L_0x0174:
            r0.f96975e = r8
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            java.lang.String r5 = "scan"
            java.lang.String r6 = "click_my_qr"
            com.ss.android.ugc.aweme.qrcode.b.f$5 r7 = new com.ss.android.ugc.aweme.qrcode.b.f$5
            r7.<init>(r14, r2)
            com.p280ss.android.ugc.aweme.login.C32656f.m105744a(r1, r5, r6, r4, r7)
        L_0x0184:
            return r8
        L_0x0185:
            com.p280ss.android.ugc.aweme.music.p1410ui.MusicDetailActivity.m109060a(r12, r14, r6)
            return r8
        L_0x0189:
            java.lang.String r2 = "preview"
            java.lang.String r2 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r2)
            java.lang.String r4 = "card_source"
            java.lang.String r4 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r4)
            java.lang.String r7 = "challenge_id"
            java.lang.String r7 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r7)
            java.lang.String r9 = "sticker_id"
            java.lang.String r5 = com.p280ss.android.ugc.aweme.router.C37286v.m119759b(r15, r9)
            java.lang.String r9 = "//poi/detail"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r12, r9)
            java.lang.String r9 = "poi_bundle"
            com.ss.android.ugc.aweme.poi.model.e r10 = new com.ss.android.ugc.aweme.poi.model.e
            r10.<init>()
            com.ss.android.ugc.aweme.poi.model.e r3 = r10.mo89342c(r14)
            java.lang.String r10 = ""
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89350k(r10)
            java.lang.String r10 = "1"
            boolean r2 = r10.equalsIgnoreCase(r2)
            com.ss.android.ugc.aweme.poi.model.e r2 = r3.mo89339a(r2)
            com.ss.android.ugc.aweme.poi.model.e r2 = r2.mo89352m(r6)
            java.lang.String r3 = "scan_activity_poi"
            com.ss.android.ugc.aweme.poi.model.e r2 = r2.mo89356q(r3)
            java.lang.String r3 = "1"
            boolean r3 = r3.equalsIgnoreCase(r4)
            com.ss.android.ugc.aweme.poi.model.e r2 = r2.mo89341b(r3)
            com.ss.android.ugc.aweme.poi.model.e r2 = r2.mo89365z(r7)
            com.ss.android.ugc.aweme.poi.model.e r2 = r2.mo89328A(r5)
            com.ss.android.ugc.aweme.poi.model.PoiBundle r2 = r2.mo89331a()
            com.bytedance.router.SmartRoute r1 = r1.withParam(r9, r2)
            r1.open()
            return r8
        L_0x01ea:
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            boolean r2 = r2.isLogin()
            if (r2 != 0) goto L_0x0201
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r0.f96971a
            r2 = 2131829279(0x7f11221f, float:1.9291523E38)
            com.bytedance.ies.dmt.ui.c.a r1 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31392b(r1, r2, r7)
            r1.mo25750a()
            return r8
        L_0x0201:
            com.ss.android.ugc.aweme.profile.model.User r2 = new com.ss.android.ugc.aweme.profile.model.User
            r2.<init>()
            long r3 = java.lang.Long.parseLong(r14)
            r2.roomId = r3
            com.ss.android.ugc.aweme.story.live.e$a r3 = new com.ss.android.ugc.aweme.story.live.e$a
            r3.<init>(r12, r2)
            com.ss.android.ugc.aweme.story.live.e$a r1 = r3.mo103122b(r6)
            r2 = 4
            com.ss.android.ugc.aweme.story.live.e$a r1 = r1.mo103117a(r2)
            com.p280ss.android.ugc.aweme.story.live.C41990e.m133503a(r1)
            return r8
        L_0x021e:
            java.lang.String r4 = "enter_personal_detail"
            boolean r5 = r0.f96973c
            java.lang.String r7 = "user_id"
            r11.m119088a(r4, r5, r7, r14)
            com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity.m117394a(r12, r14, r2, r6)
            return r8
        L_0x022b:
            java.lang.String r2 = "enter_music_detail"
            boolean r4 = r0.f96973c
            java.lang.String r5 = "music_id"
            r11.m119088a(r2, r4, r5, r14)
            com.p280ss.android.ugc.aweme.music.p1410ui.MusicDetailActivity.m109060a(r12, r14, r6)
            return r8
        L_0x0238:
            java.lang.String r2 = "enter_tag_detail"
            boolean r4 = r0.f96973c
            java.lang.String r5 = "tag_id"
            r11.m119088a(r2, r4, r5, r14)
            com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity.m77713a(r12, r14, r6)
            return r8
        L_0x0245:
            com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity.m86051a(r12, r14, r6)
            java.lang.String r1 = "video_play"
            boolean r2 = r0.f96973c
            java.lang.String r4 = "group_id"
            r11.m119088a(r1, r2, r4, r14)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f.mo93481a(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.Map):boolean");
    }

    /* renamed from: b */
    public final void mo93472b() {
        this.f96972b.mo93499a((int) C34943c.f91127w);
    }

    /* renamed from: d */
    public final void mo93467d() {
        this.f96972b.mo93500a(false);
    }

    /* renamed from: c */
    public final void mo93466c() {
        if (this.f96978h != null) {
            this.f96978h.mo93471b();
        }
        this.f96972b = null;
        this.f96971a = null;
    }

    /* renamed from: f */
    private void m119090f() {
        Vibrator vibrator = (Vibrator) this.f96971a.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: e */
    private void m119089e() {
        this.f96980j = new ArrayList();
        C370331 r0 = new C37005a() {
            /* renamed from: a */
            public final boolean mo93444a(int i, String str, String str2, int i2, Map<String, Object> map) {
                return C37032f.this.mo93481a(C37032f.this.f96971a, i, str, str2, "scan", i2, map);
            }
        };
        if (C7164b.m22364a()) {
            this.f96980j.add(new C37007c(r0));
        }
        this.f96980j.add(new C37015g(r0));
        this.f96980j.add(new C37006b(r0));
        this.f96980j.add(new C37014f(r0));
        this.f96980j.add(new C37016h(r0));
        this.f96981k = new ArrayList();
        this.f96981k.add(new C37017i());
        this.f96981k.add(new C37013e(r0));
        this.f96981k.add(new C22499a(r0));
    }

    /* renamed from: a */
    private static String m119085a(String str) {
        return C38012e.m121344c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93477a(int i) {
        if (this.f96972b != null) {
            if (i == 2006) {
                this.f96972b.mo93507g();
                this.f96972b.mo93502c();
                this.f96972b.mo93504e();
                return;
            }
            this.f96972b.mo93502c();
            if (i == 0) {
                this.f96972b.mo93499a((int) C34943c.f91127w);
                return;
            }
            this.f96972b.mo93499a(1500);
        }
    }

    /* renamed from: a */
    public final void mo93478a(Bundle bundle) {
        m119089e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93480a(boolean z) {
        int i;
        AmeSSActivity ameSSActivity = this.f96971a;
        if (z) {
            i = R.string.buz;
        } else {
            i = R.string.cr1;
        }
        C9738o.m28693a((Context) ameSSActivity, i);
    }

    public C37032f(AmeSSActivity ameSSActivity, C37053a aVar) {
        this.f96971a = ameSSActivity;
        this.f96972b = aVar;
    }

    /* renamed from: a */
    public final void mo93479a(String str, String str2) {
        if (this.f96971a != null && this.f96971a.isViewValid()) {
            this.f96977g = true;
            C38275x xVar = new C38275x(this.f96971a, "scan");
            xVar.f99485o = false;
            xVar.f99480j = new C37040h(str);
            xVar.f99481k = new C37041i(this);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "qrcode");
            if (C7163a.m22363a() && !TextUtils.isEmpty(str2)) {
                hashMap.put("grade_key", str2);
            }
            xVar.mo95918a(C17795bu.m59146a((E[]) new String[]{str}), false, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    private void m119088a(String str, boolean z, String str2, String str3) {
        m119086a(null, str, z, str2, str3);
    }

    /* renamed from: a */
    private static void m119086a(C22984d dVar, String str, boolean z, String str2, String str3) {
        String str4;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "scan");
        String str5 = "enter_method";
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        C6907h.m21524a(str, (Map) a.mo59973a(str5, str4).mo59973a(str2, str3).mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).f60753a);
    }
}
