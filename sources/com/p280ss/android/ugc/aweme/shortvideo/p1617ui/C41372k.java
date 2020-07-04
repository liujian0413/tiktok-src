package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.commerce.service.p1106a.C24437a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39322a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.BusinessGoodsPublishSettingItem.C41131a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41556j;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k */
public final class C41372k implements IAVPublishExtension<GoodsPublishModel> {

    /* renamed from: a */
    public BusinessGoodsPublishSettingItem f107663a;

    /* renamed from: b */
    public ExtensionDataRepo f107664b;

    /* renamed from: c */
    public ExtensionMisc f107665c;

    /* renamed from: d */
    private BusinessGoodsPublishModel f107666d;

    /* renamed from: e */
    private AVPublishContentType f107667e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$a */
    static final class C41373a extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41372k f107668a;

        C41373a(C41372k kVar) {
            this.f107668a = kVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m131966a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131966a(String str) {
            this.f107668a.mo102008a(BusinessGoodsPublishModel.toObj(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$b */
    static final class C41374b implements C41131a {

        /* renamed from: a */
        final /* synthetic */ C41372k f107669a;

        C41374b(C41372k kVar) {
            this.f107669a = kVar;
        }

        /* renamed from: a */
        public final void mo101595a(boolean z) {
            C41372k.m131953a(this.f107669a).getLocationState().setValue(Boolean.valueOf(!z));
            C41372k.m131953a(this.f107669a).getLinkState().setValue(Boolean.valueOf(!z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$c */
    static final class C41375c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41372k f107670a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107671b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107672c;

        C41375c(C41372k kVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f107670a = kVar;
            this.f107671b = extensionMisc;
            this.f107672c = fragment;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            String str2 = null;
            if (!this.f107670a.mo102007a().f107118j) {
                if (C7573i.m23585a((Object) (Boolean) this.f107671b.getExtensionDataRepo().isPoiAdd().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context = this.f107672c.getContext();
                    Context context2 = this.f107672c.getContext();
                    if (context2 != null) {
                        str = context2.getString(R.string.a_d);
                    } else {
                        str = null;
                    }
                    C9738o.m28697a(context, str);
                }
                if (C7573i.m23585a((Object) (Boolean) this.f107671b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107671b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107671b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context3 = this.f107672c.getContext();
                    Context context4 = this.f107672c.getContext();
                    if (context4 != null) {
                        str2 = context4.getString(R.string.e0d);
                    }
                    C9738o.m28697a(context3, str2);
                }
                return;
            }
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (TextUtils.isEmpty(curUser.getBindPhone())) {
                C6861a.m21335d().bindMobile(this.f107672c.getActivity(), "", null, null);
                return;
            }
            ICommerceService a2 = C24436a.m80356a();
            Context activity = this.f107672c.getActivity();
            IAccountUserService a3 = C21115b.m71197a();
            C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
            a2.tryCheckRealName(activity, a3.getVerifyStatus(), "video_post_page", "click_add_product", new C24437a(this) {

                /* renamed from: a */
                final /* synthetic */ C41375c f107673a;

                {
                    this.f107673a = r1;
                }
            });
            this.f107670a.mo102007a().mo101659a(false);
            SharePrefCache.inst().setShowAddBusinessGoodsDot(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$d */
    static final class C41377d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41372k f107674a;

        C41377d(C41372k kVar) {
            this.f107674a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41372k kVar = this.f107674a;
                C7573i.m23582a((Object) bool, "it");
                kVar.mo102009a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$e */
    static final class C41378e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41372k f107675a;

        C41378e(C41372k kVar) {
            this.f107675a = kVar;
            super(0);
        }

        /* renamed from: a */
        private void m131969a() {
            this.f107675a.mo102010b();
        }

        public final /* synthetic */ Object invoke() {
            m131969a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.k$f */
    public static final class C41379f implements GoodsPublishModel {

        /* renamed from: a */
        final /* synthetic */ C41372k f107676a;

        public final String getGoodsDraftId() {
            if (this.f107676a.mo102011c()) {
                return this.f107676a.mo102012d();
            }
            return null;
        }

        C41379f(C41372k kVar) {
            this.f107676a = kVar;
        }
    }

    public final String getName() {
        return "GoodsPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
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

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public GoodsPublishModel provideExtensionData() {
        return new C41379f(this);
    }

    /* renamed from: c */
    public final boolean mo102011c() {
        if (this.f107666d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final String mo102012d() {
        BusinessGoodsPublishModel businessGoodsPublishModel = this.f107666d;
        if (businessGoodsPublishModel != null) {
            return businessGoodsPublishModel.draftId;
        }
        return null;
    }

    public final void onEnterChildrenMode() {
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
        if (businessGoodsPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        businessGoodsPublishSettingItem.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m131957e() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f64708a
            java.util.List r0 = r0.mo64313b()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0044
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0040
        L_0x001f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.e r2 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r2
            int r2 = r2.f64760a
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r4 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SHOP
            int r4 = r4.getTYPE()
            if (r2 != r4) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41372k.m131957e():boolean");
    }

    /* renamed from: b */
    public final void mo102010b() {
        String str;
        BusinessGoodsPublishModel businessGoodsPublishModel = this.f107666d;
        if (businessGoodsPublishModel != null) {
            str = businessGoodsPublishModel.videoPath;
        } else {
            str = null;
        }
        C41556j.m132337a(str);
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
        if (businessGoodsPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        businessGoodsPublishSettingItem.setBusinessGoodsInfo(new BusinessGoodsPublishModel("", ""));
        ExtensionDataRepo extensionDataRepo = this.f107664b;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        C0052o isGoodsAdd = extensionDataRepo.isGoodsAdd();
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f107663a;
        if (businessGoodsPublishSettingItem2 == null) {
            C7573i.m23583a("delegate");
        }
        isGoodsAdd.setValue(Boolean.valueOf(businessGoodsPublishSettingItem2.f107019a));
        this.f107666d = null;
        mo102009a(true);
    }

    /* renamed from: f */
    private final boolean m131958f() {
        String str;
        boolean z;
        boolean z2;
        ExtensionMisc extensionMisc = this.f107665c;
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
        ExtensionMisc extensionMisc2 = this.f107665c;
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
        AVPublishContentType aVPublishContentType = this.f107667e;
        if (aVPublishContentType == null) {
            C7573i.m23583a("contentType");
        }
        if (C7573i.m23585a((Object) aVPublishContentType.getContentType(), (Object) AVPublishContentType.Photo.getContentType())) {
            List b = AnchorListManager.f64708a.mo64313b();
            if (b == null) {
                return false;
            }
            Iterable<C24536e> iterable = b;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (C24536e eVar : iterable) {
                if (eVar.f64760a == AnchorBusinessType.SHOP.getTYPE()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        List b2 = AnchorListManager.f64708a.mo64313b();
        if (b2 != null && b2.size() <= 1) {
            Iterable<C24536e> iterable2 = b2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (C24536e eVar2 : iterable2) {
                    if (eVar2.f64760a == AnchorBusinessType.SHOP.getTYPE()) {
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
    public final BusinessGoodsPublishSettingItem mo102007a() {
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
        if (businessGoodsPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        return businessGoodsPublishSettingItem;
    }

    /* renamed from: a */
    public static final /* synthetic */ ExtensionDataRepo m131953a(C41372k kVar) {
        ExtensionDataRepo extensionDataRepo = kVar.f107664b;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onAsyncGoodsInfoEvent(C39322a aVar) {
        if (m131958f() && aVar != null) {
            m131955a(aVar);
        }
    }

    /* renamed from: a */
    private final void m131956a(String str) {
        BusinessGoodsPublishModel businessGoodsPublishModel = this.f107666d;
        if (businessGoodsPublishModel != null) {
            businessGoodsPublishModel.videoPath = str;
            C41556j.m132335a(businessGoodsPublishModel);
        }
    }

    /* renamed from: a */
    private static BusinessGoodsPublishSettingItem m131954a(LinearLayout linearLayout) {
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = new BusinessGoodsPublishSettingItem(linearLayout.getContext(), null);
        linearLayout.addView(businessGoodsPublishSettingItem, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        businessGoodsPublishSettingItem.setGravity(16);
        businessGoodsPublishSettingItem.setOrientation(0);
        return businessGoodsPublishSettingItem;
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
        ExtensionDataRepo extensionDataRepo = this.f107664b;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        if (C7573i.m23585a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(false))) {
            m131956a(publishOutput.getCreationId());
        }
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
        ExtensionDataRepo extensionDataRepo = this.f107664b;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        if (C7573i.m23585a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(false))) {
            m131956a(publishOutput.getCreationId());
        }
    }

    /* renamed from: a */
    private final void m131955a(C39322a aVar) {
        if (aVar != null) {
            this.f107666d = aVar.f102141a;
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
            if (businessGoodsPublishSettingItem == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem.setBusinessGoodsInfo(this.f107666d);
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f107663a;
            if (businessGoodsPublishSettingItem2 == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem2.mo101659a(false);
        }
    }

    /* renamed from: a */
    public final void mo102008a(BusinessGoodsPublishModel businessGoodsPublishModel) {
        if (m131958f() || !m131957e() || businessGoodsPublishModel == null) {
            this.f107666d = businessGoodsPublishModel;
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
            if (businessGoodsPublishSettingItem == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem.setBusinessGoodsInfo(businessGoodsPublishModel);
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f107663a;
            if (businessGoodsPublishSettingItem2 == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem2.mo101659a(false);
            if (businessGoodsPublishModel != null) {
                ExtensionDataRepo extensionDataRepo = this.f107664b;
                if (extensionDataRepo == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo2 = this.f107664b;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo2.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo3 = this.f107664b;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo4 = this.f107664b;
                if (extensionDataRepo4 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo4.getLocationState().setValue(Boolean.valueOf(false));
            }
            return;
        }
        ExtensionDataRepo extensionDataRepo5 = this.f107664b;
        if (extensionDataRepo5 == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        C0052o updateAnchor = extensionDataRepo5.getUpdateAnchor();
        int type = AnchorBusinessType.SHOP.getTYPE();
        String b = new C6600e().mo15979b((Object) C7507ae.m23385a(C7579l.m23633a("shop_draft_id", businessGoodsPublishModel.draftId)));
        C7573i.m23582a((Object) b, "Gson().toJson(mapOf(\n   …Id\n                    ))");
        AnchorTransData anchorTransData = new AnchorTransData(type, b, businessGoodsPublishModel.title, null, null, null, null, 120, null);
        updateAnchor.setValue(anchorTransData);
    }

    /* renamed from: a */
    public final void mo102009a(boolean z) {
        if (z) {
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem = this.f107663a;
            if (businessGoodsPublishSettingItem == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem.setAlpha(1.0f);
            BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem2 = this.f107663a;
            if (businessGoodsPublishSettingItem2 == null) {
                C7573i.m23583a("delegate");
            }
            businessGoodsPublishSettingItem2.setEnable(true);
            return;
        }
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem3 = this.f107663a;
        if (businessGoodsPublishSettingItem3 == null) {
            C7573i.m23583a("delegate");
        }
        businessGoodsPublishSettingItem3.setAlpha(0.5f);
        BusinessGoodsPublishSettingItem businessGoodsPublishSettingItem4 = this.f107663a;
        if (businessGoodsPublishSettingItem4 == null) {
            C7573i.m23583a("delegate");
        }
        businessGoodsPublishSettingItem4.setEnable(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.support.p022v4.app.Fragment r1, android.widget.LinearLayout r2, android.os.Bundle r3, com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType r4, com.p280ss.android.ugc.aweme.services.publish.PublishOutput r5, com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc r6, com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r7) {
        /*
            r0 = this;
            java.lang.String r3 = "fragment"
            kotlin.jvm.internal.C7573i.m23587b(r1, r3)
            java.lang.String r3 = "extensionWidgetContainer"
            kotlin.jvm.internal.C7573i.m23587b(r2, r3)
            java.lang.String r3 = "contentType"
            kotlin.jvm.internal.C7573i.m23587b(r4, r3)
            java.lang.String r3 = "publishOutput"
            kotlin.jvm.internal.C7573i.m23587b(r5, r3)
            java.lang.String r3 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23587b(r6, r3)
            java.lang.String r3 = "callback"
            kotlin.jvm.internal.C7573i.m23587b(r7, r3)
            r0.f107667e = r4
            com.p280ss.android.ugc.aweme.utils.C42961az.m136382c(r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r6.getExtensionDataRepo()
            r0.f107664b = r3
            r0.f107665c = r6
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r0.f107664b
            if (r3 != 0) goto L_0x0034
            java.lang.String r4 = "extensionDataRepo"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.ui.k$a r4 = new com.ss.android.ugc.aweme.shortvideo.ui.k$a
            r4.<init>(r0)
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            r3.setRestoreGoodsPublishModel(r4)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = m131954a(r2)
            r0.f107663a = r2
            java.lang.String r2 = r5.getFilePath()
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r2 = com.p280ss.android.ugc.aweme.shortvideo.util.C41556j.m132338b(r2)
            if (r2 == 0) goto L_0x0058
            java.lang.String r3 = r5.getCreationId()
            r2.videoPath = r3
            r0.mo102008a(r2)
            goto L_0x0063
        L_0x0058:
            java.lang.String r2 = r5.getCreationId()
            com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel r2 = com.p280ss.android.ugc.aweme.shortvideo.util.C41556j.m132338b(r2)
            r0.mo102008a(r2)
        L_0x0063:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x006c
            java.lang.String r3 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.ui.k$b r3 = new com.ss.android.ugc.aweme.shortvideo.ui.k$b
            r3.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem$a r3 = (com.p280ss.android.ugc.aweme.shortvideo.p1617ui.BusinessGoodsPublishSettingItem.C41131a) r3
            r2.setStateChangeCB(r3)
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            boolean r2 = r2.hasCommerceVideoRights()
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r3 = r0.f107663a
            if (r3 != 0) goto L_0x0087
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0087:
            boolean r4 = r0.m131958f()
            r5 = 8
            r7 = 0
            if (r4 == 0) goto L_0x0092
            r4 = 0
            goto L_0x0094
        L_0x0092:
            r4 = 8
        L_0x0094:
            r3.setVisibility(r4)
            com.ss.android.ugc.aweme.port.in.ai$a r3 = r6.getPublishExtensionDataContainer()
            if (r3 == 0) goto L_0x00a2
            java.lang.String r3 = r3.mo88234d()
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            com.ss.android.ugc.aweme.commercialize.model.o r3 = com.p280ss.android.ugc.aweme.commercialize.model.C25006o.m82325a(r3)
            java.lang.String r4 = "PublishExtensionModel.fr…taContainer?.publishData)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo r3 = r3.f65943f
            if (r3 != 0) goto L_0x00fb
            boolean r4 = com.p280ss.android.ugc.aweme.i18n.C30538p.m99745a()
            if (r4 != 0) goto L_0x00fb
            if (r2 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.app.u r2 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            com.ss.android.ugc.aweme.app.bl r2 = r2.mo60042L()
            java.lang.String r4 = "CommonSharePrefCache.inst().enableShoppingTotal"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            java.lang.Object r2 = r2.mo59877d()
            java.lang.String r4 = "CommonSharePrefCache.ins…enableShoppingTotal.cache"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00fb
            boolean r2 = r0.m131958f()
            if (r2 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x00ea
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00ea:
            r2.setVisibility(r7)
            goto L_0x0107
        L_0x00ee:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x00f7
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00f7:
            r2.setVisibility(r5)
            goto L_0x0107
        L_0x00fb:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x0104
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0104:
            r2.setVisibility(r5)
        L_0x0107:
            if (r3 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r0.f107664b
            if (r2 != 0) goto L_0x0112
            java.lang.String r3 = "extensionDataRepo"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0112:
            android.arch.lifecycle.o r2 = r2.getLocationState()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r2.setValue(r3)
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x0126
            java.lang.String r3 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0126:
            r2.mo101592a()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r0.f107664b
            if (r2 != 0) goto L_0x0132
            java.lang.String r3 = "extensionDataRepo"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0132:
            android.arch.lifecycle.o r2 = r2.isGoodsAdd()
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r3 = r0.f107663a
            if (r3 != 0) goto L_0x013f
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x013f:
            boolean r3 = r3.f107019a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.setValue(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r6.getExtensionDataRepo()
            r2.getResetLinkAction()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r6.getExtensionDataRepo()
            android.arch.lifecycle.o r2 = r2.getLinkState()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r2.setValue(r3)
        L_0x015e:
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.app.bl r2 = r2.getShowAddBusinessGoodsDot()
            if (r2 == 0) goto L_0x018c
            java.lang.Object r2 = r2.mo59877d()
            java.lang.String r3 = "needShowDot.cache"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x017f
            goto L_0x018c
        L_0x017f:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x0188
            java.lang.String r3 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0188:
            r2.mo101659a(r7)
            goto L_0x0199
        L_0x018c:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x0195
            java.lang.String r3 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0195:
            r3 = 1
            r2.mo101659a(r3)
        L_0x0199:
            com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem r2 = r0.f107663a
            if (r2 != 0) goto L_0x01a2
            java.lang.String r3 = "delegate"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x01a2:
            com.ss.android.ugc.aweme.shortvideo.ui.k$c r3 = new com.ss.android.ugc.aweme.shortvideo.ui.k$c
            r3.<init>(r0, r6, r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r6.getExtensionDataRepo()
            android.arch.lifecycle.o r2 = r2.getGoodsState()
            android.arch.lifecycle.i r1 = (android.arch.lifecycle.C0043i) r1
            com.ss.android.ugc.aweme.shortvideo.ui.k$d r3 = new com.ss.android.ugc.aweme.shortvideo.ui.k$d
            r3.<init>(r0)
            android.arch.lifecycle.p r3 = (android.arch.lifecycle.C0053p) r3
            r2.observe(r1, r3)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r6.getExtensionDataRepo()
            com.ss.android.ugc.aweme.shortvideo.ui.k$e r2 = new com.ss.android.ugc.aweme.shortvideo.ui.k$e
            r2.<init>(r0)
            kotlin.jvm.a.a r2 = (kotlin.jvm.p357a.C7561a) r2
            r1.setResetGoodsAction(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41372k.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
