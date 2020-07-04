package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.CouponPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g */
public final class C41357g implements IAVPublishExtension<CouponPublishModel> {

    /* renamed from: b */
    public static final C41358a f107636b = new C41358a(null);

    /* renamed from: a */
    public CouponPublishSettingItem f107637a;

    /* renamed from: c */
    private ExtensionMisc f107638c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$a */
    public static final class C41358a {
        private C41358a() {
        }

        public /* synthetic */ C41358a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$b */
    static final class C41359b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41357g f107639a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107640b;

        C41359b(C41357g gVar, ExtensionMisc extensionMisc) {
            this.f107639a = gVar;
            this.f107640b = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C41357g.m131924a(this.f107639a).f107118j) {
                this.f107639a.mo101996a();
            } else if (C7573i.m23585a((Object) (Boolean) this.f107640b.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107640b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107640b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107640b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10761a.m31403c(C41357g.m131924a(this.f107639a).getContext(), C41357g.m131924a(this.f107639a).getContext().getString(R.string.e0d)).mo25750a();
            } else {
                C10761a.m31403c(C41357g.m131924a(this.f107639a).getContext(), C41357g.m131924a(this.f107639a).getContext().getString(R.string.aio, new Object[]{C41357g.m131924a(this.f107639a).getContext().getString(R.string.a_9)})).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$c */
    static final class C41360c<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41357g f107641a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107642b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$c$a */
        static final class C41361a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107643a;

            /* renamed from: b */
            final /* synthetic */ C41360c f107644b;

            C41361a(AnchorTransData anchorTransData, C41360c cVar) {
                this.f107643a = anchorTransData;
                this.f107644b = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131932a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131932a() {
                this.f107644b.f107641a.mo101997a(this.f107644b.f107642b);
            }
        }

        C41360c(C41357g gVar, ExtensionMisc extensionMisc) {
            this.f107641a = gVar;
            this.f107642b = extensionMisc;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(AnchorTransData anchorTransData) {
            Object obj;
            boolean z;
            if (anchorTransData != null) {
                List b = AnchorListManager.f64708a.mo64313b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (anchorTransData.getBusinessType() == ((C24536e) obj).f64760a) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C24536e eVar = (C24536e) obj;
                    if (eVar != null) {
                        CouponPublishSettingItem a = C41357g.m131924a(this.f107641a);
                        UrlModel urlModel = eVar.f64764e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        String anchorTag = anchorTransData.getAnchorTag();
                        if (anchorTag == null) {
                            anchorTag = "";
                        }
                        a.mo101612a(urlModel, title, anchorTag, new C41361a(anchorTransData, this));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$d */
    static final class C41362d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41357g f107645a;

        C41362d(C41357g gVar) {
            this.f107645a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41357g gVar = this.f107645a;
                C7573i.m23582a((Object) bool, "it");
                gVar.mo101998a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "CouponPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onCreateFinish() {
        DefaultImpls.onCreateFinish(this);
    }

    public final void onDestroy() {
        C42961az.m136383d(this);
    }

    public final void onPublish(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
    }

    /* renamed from: b */
    private static CouponPublishModel m131925b() {
        return new CouponPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131925b();
    }

    public final void onEnterChildrenMode() {
        CouponPublishSettingItem couponPublishSettingItem = this.f107637a;
        if (couponPublishSettingItem == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        couponPublishSettingItem.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo101996a() {
        Object obj;
        boolean z;
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.COUPON.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C24536e eVar = (C24536e) obj;
            if (eVar != null) {
                String str = eVar.f64763d;
                if (str != null) {
                    CouponPublishSettingItem couponPublishSettingItem = this.f107637a;
                    if (couponPublishSettingItem == null) {
                        C7573i.m23583a("couponPublishSettingItem");
                    }
                    SmartRouter.buildRoute(couponPublishSettingItem.getContext(), str).withParam("need_bottom_out", true).withAnimation(R.anim.s, 0).open();
                }
            }
        }
    }

    /* renamed from: c */
    private final boolean m131927c() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107638c;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo88234d();
        } else {
            str = null;
        }
        C25006o a = C25006o.m82325a(str);
        C7573i.m23582a((Object) a, "PublishExtensionModel\n  …                        )");
        if (a.f65943f != null) {
            return false;
        }
        ExtensionMisc extensionMisc2 = this.f107638c;
        if (extensionMisc2 == null) {
            C7573i.m23583a("extensionMisc");
        }
        AnchorTransData anchorTransData = (AnchorTransData) extensionMisc2.getExtensionDataRepo().getUpdateAnchor().getValue();
        if (anchorTransData != null) {
            Integer source = anchorTransData.getSource();
            if (source == null || source.intValue() != 0) {
                return false;
            }
        }
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null && b.size() <= 1) {
            Iterable<C24536e> iterable = b;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C24536e eVar : iterable) {
                    if (eVar.f64760a == AnchorBusinessType.COUPON.getTYPE()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ CouponPublishSettingItem m131924a(C41357g gVar) {
        CouponPublishSettingItem couponPublishSettingItem = gVar.f107637a;
        if (couponPublishSettingItem == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        return couponPublishSettingItem;
    }

    /* renamed from: a */
    private static CouponPublishSettingItem m131923a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        C7573i.m23582a((Object) context, "container.context");
        CouponPublishSettingItem couponPublishSettingItem = new CouponPublishSettingItem(context, null);
        linearLayout.addView(couponPublishSettingItem, new LayoutParams(-1, (int) C20505c.m68010a(linearLayout.getContext(), 52.0f)));
        couponPublishSettingItem.setGravity(16);
        couponPublishSettingItem.setOrientation(0);
        couponPublishSettingItem.setVisibility(8);
        return couponPublishSettingItem;
    }

    /* renamed from: b */
    private final void m131926b(ExtensionMisc extensionMisc) {
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            C25006o b = C25006o.m82327b(publishExtensionDataContainer.mo88234d());
            b.f65945h = AnchorBusinessType.NO_TYPE.getTYPE();
            b.f65946i = "";
            b.f65947j = "";
            b.f65955r = "";
            b.f65956s = "";
            b.f65957t = "";
            publishExtensionDataContainer.mo88231a(C25006o.m82326a(b));
        }
        CouponPublishSettingItem couponPublishSettingItem = this.f107637a;
        if (couponPublishSettingItem == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        couponPublishSettingItem.mo101611a();
    }

    /* renamed from: a */
    public final void mo101997a(ExtensionMisc extensionMisc) {
        m131926b(extensionMisc);
        mo101998a(true);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r14 == null) goto L_0x0082;
     */
    @org.greenrobot.eventbus.C7709l(mo20400a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncCouponInfoEvent(com.p280ss.android.ugc.aweme.p1216fe.method.C27994k r14) {
        /*
            r13 = this;
            java.lang.String r0 = "broadCastEvent"
            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
            org.json.JSONObject r0 = r14.f73730b
            if (r0 == 0) goto L_0x0094
            org.json.JSONObject r1 = r14.f73730b
            java.lang.String r2 = "eventName"
            java.lang.String r1 = r1.optString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "pick_coupon_anchor_content"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0029
            org.json.JSONObject r1 = r14.f73730b
            java.lang.String r2 = "data"
            boolean r1 = r1.has(r2)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r2 = 0
            if (r1 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0094
            org.json.JSONObject r14 = r14.f73730b
            java.lang.String r0 = "data"
            org.json.JSONObject r14 = r14.optJSONObject(r0)
            java.lang.String r0 = "anchor_content"
            org.json.JSONObject r14 = r14.optJSONObject(r0)
            if (r14 == 0) goto L_0x0047
            java.lang.String r0 = "title"
            java.lang.String r2 = r14.optString(r0)
        L_0x0047:
            r6 = r2
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r14 = r13.f107638c
            if (r14 != 0) goto L_0x005a
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x005a:
            r13.mo101997a(r14)
            goto L_0x0094
        L_0x005e:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r13.f107638c
            if (r0 != 0) goto L_0x0067
            java.lang.String r1 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0067:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.o r0 = r0.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.COUPON
            int r4 = r2.getTYPE()
            if (r14 == 0) goto L_0x0082
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r5 = r14
            goto L_0x0085
        L_0x0082:
            java.lang.String r14 = ""
            goto L_0x0080
        L_0x0085:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 120(0x78, float:1.68E-43)
            r12 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.setValue(r1)
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41357g.onAsyncCouponInfoEvent(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    /* renamed from: a */
    public final void mo101998a(boolean z) {
        if (z) {
            CouponPublishSettingItem couponPublishSettingItem = this.f107637a;
            if (couponPublishSettingItem == null) {
                C7573i.m23583a("couponPublishSettingItem");
            }
            couponPublishSettingItem.setAlpha(1.0f);
            CouponPublishSettingItem couponPublishSettingItem2 = this.f107637a;
            if (couponPublishSettingItem2 == null) {
                C7573i.m23583a("couponPublishSettingItem");
            }
            couponPublishSettingItem2.setEnable(true);
            CouponPublishSettingItem couponPublishSettingItem3 = this.f107637a;
            if (couponPublishSettingItem3 == null) {
                C7573i.m23583a("couponPublishSettingItem");
            }
            RemoteImageView leftDrawableView = couponPublishSettingItem3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "couponPublishSettingItem.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        CouponPublishSettingItem couponPublishSettingItem4 = this.f107637a;
        if (couponPublishSettingItem4 == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        couponPublishSettingItem4.setAlpha(0.5f);
        CouponPublishSettingItem couponPublishSettingItem5 = this.f107637a;
        if (couponPublishSettingItem5 == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        couponPublishSettingItem5.setEnable(false);
        CouponPublishSettingItem couponPublishSettingItem6 = this.f107637a;
        if (couponPublishSettingItem6 == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        RemoteImageView leftDrawableView2 = couponPublishSettingItem6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "couponPublishSettingItem.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        int i;
        Object obj;
        boolean z;
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        C42961az.m136382c(this);
        this.f107638c = extensionMisc;
        this.f107637a = m131923a(linearLayout);
        CouponPublishSettingItem couponPublishSettingItem = this.f107637a;
        if (couponPublishSettingItem == null) {
            C7573i.m23583a("couponPublishSettingItem");
        }
        if (m131927c()) {
            i = 0;
        } else {
            i = 8;
        }
        couponPublishSettingItem.setVisibility(i);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41360c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41362d(this));
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.COUPON.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (((C24536e) obj) != null) {
                CouponPublishSettingItem couponPublishSettingItem2 = this.f107637a;
                if (couponPublishSettingItem2 == null) {
                    C7573i.m23583a("couponPublishSettingItem");
                }
                couponPublishSettingItem2.setOnClickListener(new C41359b(this, extensionMisc));
            }
        }
    }
}
