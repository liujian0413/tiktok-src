package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.facebook.common.util.C13337d;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.commerce.service.p1106a.C24437a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorPanel;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24534d;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32616a.C32617a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33337c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.poi.IPOIService;
import com.p280ss.android.ugc.aweme.poi.IPOIService.C35002b;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39322a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41519ae;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43014ci;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a */
public final class C41224a implements IAVPublishExtension<AnchorPublishModel> {

    /* renamed from: a */
    public C24534d f107427a;

    /* renamed from: b */
    public ExtensionMisc f107428b;

    /* renamed from: c */
    public Fragment f107429c;

    /* renamed from: d */
    public AVPublishContentType f107430d;

    /* renamed from: e */
    public PublishOutput f107431e;

    /* renamed from: f */
    public C25006o f107432f;

    /* renamed from: g */
    public LinearLayout f107433g;

    /* renamed from: h */
    public Context f107434h;

    /* renamed from: i */
    public MentionEditText f107435i;

    /* renamed from: j */
    public AnchorPanel f107436j;

    /* renamed from: k */
    public List<C24536e> f107437k;

    /* renamed from: l */
    private DmtTextView f107438l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$a */
    public static final class C41225a implements C24437a {

        /* renamed from: a */
        final /* synthetic */ C41224a f107439a;

        C41225a(C41224a aVar) {
            this.f107439a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$b */
    static final class C41226b implements C35002b {

        /* renamed from: a */
        final /* synthetic */ C41224a f107440a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107441b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f107442c;

        C41226b(C41224a aVar, ExtensionMisc extensionMisc, AVPublishContentType aVPublishContentType) {
            this.f107440a = aVar;
            this.f107441b = extensionMisc;
            this.f107442c = aVPublishContentType;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
            if (r3 == null) goto L_0x0078;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88688a(com.p280ss.android.ugc.aweme.poi.IPOIService.ResultType r19, com.p280ss.android.ugc.aweme.poi.model.PoiStruct r20, java.lang.String r21) {
            /*
                r18 = this;
                r0 = r18
                r6 = r20
                java.lang.String r1 = "keyword"
                java.lang.String r2 = com.p280ss.android.ugc.aweme.poi.utils.C35469y.m114572a(r6, r1)
                r1 = r2
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x0016
                java.lang.String r1 = "default_search_poi"
                goto L_0x0018
            L_0x0016:
                java.lang.String r1 = "search_poi"
            L_0x0018:
                java.lang.String r3 = "NULL"
                r4 = 0
                if (r6 == 0) goto L_0x0022
                java.lang.String r5 = r20.getPoiId()
                goto L_0x0023
            L_0x0022:
                r5 = r4
            L_0x0023:
                r7 = 1
                boolean r3 = kotlin.text.C7634n.m23717a(r3, r5, r7)
                if (r3 == 0) goto L_0x002c
                r3 = r4
                goto L_0x002d
            L_0x002c:
                r3 = r6
            L_0x002d:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r5 = r0.f107441b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r5 = r5.getExtensionDataRepo()
                android.arch.lifecycle.o r5 = r5.getUpdateAnchor()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r15 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r8 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.POI
                int r9 = r8.getTYPE()
                com.google.gson.e r8 = new com.google.gson.e
                r8.<init>()
                r10 = 2
                kotlin.Pair[] r10 = new kotlin.Pair[r10]
                r11 = 0
                java.lang.String r12 = "poi_id"
                if (r3 == 0) goto L_0x004f
                java.lang.String r13 = r3.poiId
                goto L_0x0050
            L_0x004f:
                r13 = r4
            L_0x0050:
                kotlin.Pair r12 = kotlin.C7579l.m23633a(r12, r13)
                r10[r11] = r12
                java.lang.String r11 = "poi_name"
                if (r3 == 0) goto L_0x005c
                java.lang.String r4 = r3.poiName
            L_0x005c:
                kotlin.Pair r4 = kotlin.C7579l.m23633a(r11, r4)
                r10[r7] = r4
                java.util.Map r4 = kotlin.collections.C7507ae.m23393a((kotlin.Pair<? extends K, ? extends V>[]) r10)
                java.lang.String r10 = r8.mo15979b(r4)
                java.lang.String r4 = "Gson().toJson(mapOf(\n   …                       ))"
                kotlin.jvm.internal.C7573i.m23582a(r10, r4)
                if (r3 == 0) goto L_0x0078
                java.lang.String r3 = r3.poiName
                if (r3 != 0) goto L_0x0076
                goto L_0x0078
            L_0x0076:
                r11 = r3
                goto L_0x007b
            L_0x0078:
                java.lang.String r3 = ""
                goto L_0x0076
            L_0x007b:
                r12 = 0
                r13 = 0
                r14 = 0
                r3 = 0
                r16 = 120(0x78, float:1.68E-43)
                r17 = 0
                r8 = r15
                r4 = r15
                r15 = r3
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r5.setValue(r4)
                java.lang.String r3 = "order"
                java.lang.String r3 = com.p280ss.android.ugc.aweme.poi.utils.C35469y.m114572a(r6, r3)
                java.lang.String r4 = "keyword"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                r4 = r3
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L_0x00a2
                java.lang.String r3 = "-1"
            L_0x00a2:
                java.lang.String r4 = "if (TextUtils.isEmpty(order)) \"-1\" else order"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                java.lang.String r4 = "logpb"
                java.lang.String r4 = com.p280ss.android.ugc.aweme.poi.utils.C35469y.m114572a(r6, r4)
                java.lang.String r5 = "PoiUtils.getValueFromPoi…ct, POIService.KEY_LOGPB)"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                java.lang.String r5 = "searchRegionType"
                r7 = r21
                kotlin.jvm.internal.C7573i.m23582a(r7, r5)
                if (r6 != 0) goto L_0x00be
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00be:
                java.lang.String r5 = "poiStruct!!"
                kotlin.jvm.internal.C7573i.m23582a(r6, r5)
                com.ss.android.ugc.aweme.services.publish.AVPublishContentType r8 = r0.f107442c
                r5 = r21
                r6 = r20
                r7 = r8
                com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.m131810a(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.C41226b.mo88688a(com.ss.android.ugc.aweme.poi.IPOIService$ResultType, com.ss.android.ugc.aweme.poi.model.PoiStruct, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$c */
    static final class C41227c extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f107443a;

        /* renamed from: b */
        final /* synthetic */ Fragment f107444b;

        C41227c(ExtensionMisc extensionMisc, Fragment fragment) {
            this.f107443a = extensionMisc;
            this.f107444b = fragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m131833a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        private boolean m131833a(int i) {
            if (!(this.f107443a.getExtensionDataRepo().getUpdateAnchor().getValue() == null || this.f107443a.getExtensionDataRepo().getUpdateAnchor().getValue() == null)) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f107443a.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null && anchorTransData.getBusinessType() == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE() && i == 1) {
                    C10741a aVar = new C10741a(this.f107444b.getContext());
                    aVar.mo25657b((int) R.string.d5h).mo25650a((int) R.string.u9, (OnClickListener) new OnClickListener(this) {

                        /* renamed from: a */
                        final /* synthetic */ C41227c f107445a;

                        {
                            this.f107445a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            IPermissionAction iPermissionAction = this.f107445a.f107443a.getExtensionDataRepo().getIPermissionAction();
                            if (iPermissionAction != null) {
                                iPermissionAction.confirm();
                            }
                        }
                    }).mo25658b((int) R.string.u7, (OnClickListener) new OnClickListener(this) {

                        /* renamed from: a */
                        final /* synthetic */ C41227c f107446a;

                        {
                            this.f107446a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            IPermissionAction iPermissionAction = this.f107446a.f107443a.getExtensionDataRepo().getIPermissionAction();
                            if (iPermissionAction != null) {
                                iPermissionAction.cancel();
                            }
                            dialogInterface.dismiss();
                        }
                    });
                    Dialog b = aVar.mo25656a().mo25638b();
                    b.setCancelable(false);
                    b.setCanceledOnTouchOutside(false);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$d */
    static final class C41230d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41224a f107447a;

        C41230d(C41224a aVar) {
            this.f107447a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41224a aVar = this.f107447a;
                C7573i.m23582a((Object) bool, "it");
                aVar.mo101917a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$e */
    static final class C41231e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f107448a;

        C41231e(ExtensionMisc extensionMisc) {
            this.f107448a = extensionMisc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m131835a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131835a() {
            this.f107448a.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            this.f107448a.getExtensionDataRepo().getAnchorState().setValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$f */
    static final class C41232f<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41224a f107449a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107450b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$f$a */
        static final class C41233a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107451a;

            /* renamed from: b */
            final /* synthetic */ C41232f f107452b;

            C41233a(AnchorTransData anchorTransData, C41232f fVar) {
                this.f107451a = anchorTransData;
                this.f107452b = fVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131837a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131837a() {
                if (this.f107451a.getBusinessType() == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE() && this.f107452b.f107449a.mo101914a().getVisibility() == 0) {
                    C41519ae.m132255a(this.f107452b.f107449a.f107435i);
                }
                C6907h.m21524a("delete_label", (Map) new C22984d().mo59973a("enter_from", "video_publish_page").mo59973a("shoot_way", this.f107452b.f107450b.getMobParam().getShootWay()).mo59973a("creation_id", this.f107452b.f107450b.getMobParam().getCreationId()).mo59970a("business_type", this.f107451a.getBusinessType()).f60753a);
                this.f107452b.f107449a.mo101915a(this.f107452b.f107450b);
            }
        }

        C41232f(C41224a aVar, ExtensionMisc extensionMisc) {
            this.f107449a = aVar;
            this.f107450b = extensionMisc;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(AnchorTransData anchorTransData) {
            int i;
            UrlModel urlModel;
            int i2;
            Object obj;
            boolean z;
            if (anchorTransData != null) {
                UrlModel urlModel2 = new UrlModel();
                int businessType = anchorTransData.getBusinessType();
                int type = AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE();
                int i3 = R.drawable.a2l;
                if (businessType != type) {
                    if (businessType == AnchorBusinessType.ARTICLE.getTYPE()) {
                        i3 = R.drawable.a2_;
                    } else if (businessType == AnchorBusinessType.POI.getTYPE()) {
                        i3 = R.drawable.a2j;
                    } else if (businessType != AnchorBusinessType.SHOP.getTYPE()) {
                        i3 = businessType == AnchorBusinessType.MICRO_APP.getTYPE() ? R.drawable.a2h : businessType == AnchorBusinessType.GAME.getTYPE() ? R.drawable.a2d : businessType == AnchorBusinessType.MEDIUM.getTYPE() ? R.drawable.a2f : businessType == AnchorBusinessType.SEEDING.getTYPE() ? R.drawable.a2k : businessType == AnchorBusinessType.WIKIPEDIA.getTYPE() ? R.drawable.a2p : businessType == AnchorBusinessType.YELP.getTYPE() ? R.drawable.a2r : businessType == AnchorBusinessType.TRIP_ADVISOR.getTYPE() ? R.drawable.a2n : R.drawable.a2a;
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(C13337d.m39030a(i3).toString());
                urlModel2.setUrlList(arrayList);
                urlModel2.setWidth(720);
                urlModel2.setHeight(720);
                List<C24536e> list = this.f107449a.f107437k;
                String str = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C24536e) obj).f64760a == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE() && this.f107449a.mo101914a().getVisibility() == 0) {
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
                        C41519ae.m132254a(this.f107449a.f107434h, this.f107449a.f107435i, eVar.f64769j);
                    }
                }
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 4) {
                    this.f107449a.mo101914a().mo64331a();
                } else {
                    C24534d a = this.f107449a.mo101914a();
                    UrlModel anchorIcon = anchorTransData.getAnchorIcon();
                    if (anchorIcon == null) {
                        urlModel = urlModel2;
                    } else {
                        urlModel = anchorIcon;
                    }
                    String title = anchorTransData.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str2 = title;
                    String anchorTag = anchorTransData.getAnchorTag();
                    if (anchorTag == null) {
                        anchorTag = "";
                    }
                    String str3 = anchorTag;
                    Integer source2 = anchorTransData.getSource();
                    if (source2 != null) {
                        i2 = source2.intValue();
                    } else {
                        i2 = 0;
                    }
                    a.mo64332a(urlModel, str2, str3, i2, new C41233a(anchorTransData, this));
                }
                C35542a publishExtensionDataContainer = this.f107450b.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer != null) {
                    str = publishExtensionDataContainer.mo88234d();
                }
                C25006o a2 = C25006o.m82325a(str);
                a2.f65945h = anchorTransData.getBusinessType();
                a2.f65946i = anchorTransData.getAnchorContent();
                a2.f65947j = anchorTransData.getTitle();
                a2.f65955r = anchorTransData.getAnchorTag();
                a2.f65944g = anchorTransData.getId();
                Integer source3 = anchorTransData.getSource();
                if (source3 != null) {
                    i = source3.intValue();
                } else {
                    i = 0;
                }
                a2.f65949l = i;
                a2.f65953p = a2.f65953p;
                C35542a publishExtensionDataContainer2 = this.f107450b.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer2 != null) {
                    publishExtensionDataContainer2.mo88231a(C25006o.m82326a(a2));
                }
                this.f107450b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(false));
                if (anchorTransData.getBusinessType() == AnchorBusinessType.SHOP.getTYPE()) {
                    this.f107450b.getExtensionDataRepo().getRecordLinkAction().invoke();
                    this.f107450b.getExtensionDataRepo().getResetLinkAction().invoke();
                    this.f107450b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(false));
                }
                return;
            }
            this.f107449a.mo101919b(this.f107450b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$g */
    static final class C41234g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41224a f107453a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107454b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107455c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f107456d;

        C41234g(C41224a aVar, ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f107453a = aVar;
            this.f107454b = extensionMisc;
            this.f107455c = fragment;
            this.f107456d = aVPublishContentType;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02eb, code lost:
            if (r0 == null) goto L_0x02ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ab, code lost:
            if (r0 == null) goto L_0x01ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x024a, code lost:
            if (r0 == null) goto L_0x024c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
                r12 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
                android.arch.lifecycle.o r0 = r0.getUpdateAnchor()
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r0 = (com.p280ss.android.ugc.aweme.services.publish.AnchorTransData) r0
                r1 = 2131827026(0x7f111952, float:1.9286953E38)
                r2 = 4
                if (r0 == 0) goto L_0x0054
                java.lang.Integer r3 = r0.getSource()
                if (r3 != 0) goto L_0x0020
                goto L_0x0046
            L_0x0020:
                int r3 = r3.intValue()
                if (r3 != r2) goto L_0x0046
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.a r0 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r0 = r0.mo101914a()
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r13, r0)
                r13.mo25750a()
                return
            L_0x0046:
                java.lang.Integer r0 = r0.getSource()
                if (r0 != 0) goto L_0x004d
                return
            L_0x004d:
                int r0 = r0.intValue()
                if (r0 == 0) goto L_0x0054
                return
            L_0x0054:
                com.ss.android.ugc.aweme.shortvideo.ui.a r0 = r12.f107453a
                java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.e> r0 = r0.f107437k
                r3 = r0
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x0068
                boolean r6 = r3.isEmpty()
                if (r6 == 0) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r6 = 0
                goto L_0x0069
            L_0x0068:
                r6 = 1
            L_0x0069:
                if (r6 == 0) goto L_0x006c
                return
            L_0x006c:
                java.lang.String r6 = "open_label_panel"
                com.ss.android.ugc.aweme.app.g.d r7 = new com.ss.android.ugc.aweme.app.g.d
                r7.<init>()
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r7)
                com.ss.android.ugc.aweme.shortvideo.ui.a r6 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r6 = r6.mo101914a()
                boolean r6 = r6.f107118j
                if (r6 != 0) goto L_0x0143
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getWithStarAtlasAnchor()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                boolean r13 = kotlin.jvm.internal.C7573i.m23585a(r13, r0)
                if (r13 != 0) goto L_0x0123
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getWithStarAtlasOrderGoods()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                boolean r13 = kotlin.jvm.internal.C7573i.m23585a(r13, r0)
                if (r13 != 0) goto L_0x0123
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getWithStarAtlasOrderLink()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                boolean r13 = kotlin.jvm.internal.C7573i.m23585a(r13, r0)
                if (r13 != 0) goto L_0x0123
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getWithStarAtlasOrderPoi()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                boolean r13 = kotlin.jvm.internal.C7573i.m23585a(r13, r0)
                if (r13 == 0) goto L_0x00eb
                goto L_0x0123
            L_0x00eb:
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.a r0 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r0 = r0.mo101914a()
                android.content.Context r0 = r0.getContext()
                r1 = 2131822259(0x7f1106b3, float:1.9277284E38)
                java.lang.Object[] r2 = new java.lang.Object[r5]
                com.ss.android.ugc.aweme.shortvideo.ui.a r3 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r3 = r3.mo101914a()
                android.content.Context r3 = r3.getContext()
                r5 = 2131822335(0x7f1106ff, float:1.9277439E38)
                java.lang.String r3 = r3.getString(r5)
                r2[r4] = r3
                java.lang.String r0 = r0.getString(r1, r2)
                com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r13, r0)
                r13.mo25750a()
                return
            L_0x0123:
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.a r0 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r0 = r0.mo101914a()
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r13, r0)
                r13.mo25750a()
                return
            L_0x0143:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r1 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r1.getExtensionDataRepo()
                android.arch.lifecycle.o r1 = r1.getUpdateAnchor()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = (com.p280ss.android.ugc.aweme.services.publish.AnchorTransData) r1
                r6 = 0
                if (r1 == 0) goto L_0x015f
                int r1 = r1.getBusinessType()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0160
            L_0x015f:
                r1 = r6
            L_0x0160:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r7 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.WIKIPEDIA
                int r7 = r7.getTYPE()
                r8 = 3
                r9 = 2
                if (r1 != 0) goto L_0x016c
                goto L_0x0200
            L_0x016c:
                int r10 = r1.intValue()
                if (r10 != r7) goto L_0x0200
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x0178:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x0195
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.e r1 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r1
                int r1 = r1.f64760a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r3 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.WIKIPEDIA
                int r3 = r3.getTYPE()
                if (r1 != r3) goto L_0x0191
                r1 = 1
                goto L_0x0192
            L_0x0191:
                r1 = 0
            L_0x0192:
                if (r1 == 0) goto L_0x0178
                goto L_0x0196
            L_0x0195:
                r0 = r6
            L_0x0196:
                com.ss.android.ugc.aweme.commercialize.anchor.e r0 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r0
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                kotlin.jvm.internal.C7573i.m23582a(r13, r1)
                if (r0 == 0) goto L_0x01ad
                java.lang.String r0 = r0.f64763d
                if (r0 != 0) goto L_0x01af
            L_0x01ad:
                java.lang.String r0 = ""
            L_0x01af:
                kotlin.Pair[] r1 = new kotlin.Pair[r2]
                java.lang.String r2 = "title"
                android.support.v4.app.Fragment r3 = r12.f107455c
                r6 = 2131822342(0x7f110706, float:1.9277453E38)
                java.lang.String r3 = r3.getString(r6)
                kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
                r1[r4] = r2
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getShootWay()
                if (r3 != 0) goto L_0x01d2
                java.lang.String r3 = ""
            L_0x01d2:
                kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
                r1[r5] = r2
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getCreationId()
                if (r3 != 0) goto L_0x01e8
                java.lang.String r3 = ""
            L_0x01e8:
                kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
                r1[r9] = r2
                java.lang.String r2 = "show_keyboard"
                java.lang.String r3 = "true"
                kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
                r1[r8] = r2
                java.util.Map r1 = kotlin.collections.C7507ae.m23393a((kotlin.Pair<? extends K, ? extends V>[]) r1)
                com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a.m138079a(r13, r0, r1)
                return
            L_0x0200:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r7 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
                int r7 = r7.getTYPE()
                r10 = 5
                if (r1 != 0) goto L_0x020b
                goto L_0x02a2
            L_0x020b:
                int r11 = r1.intValue()
                if (r11 != r7) goto L_0x02a2
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x0217:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x0234
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.e r1 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r1
                int r1 = r1.f64760a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r3 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
                int r3 = r3.getTYPE()
                if (r1 != r3) goto L_0x0230
                r1 = 1
                goto L_0x0231
            L_0x0230:
                r1 = 0
            L_0x0231:
                if (r1 == 0) goto L_0x0217
                goto L_0x0235
            L_0x0234:
                r0 = r6
            L_0x0235:
                com.ss.android.ugc.aweme.commercialize.anchor.e r0 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r0
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                kotlin.jvm.internal.C7573i.m23582a(r13, r1)
                if (r0 == 0) goto L_0x024c
                java.lang.String r0 = r0.f64763d
                if (r0 != 0) goto L_0x024e
            L_0x024c:
                java.lang.String r0 = ""
            L_0x024e:
                kotlin.Pair[] r1 = new kotlin.Pair[r10]
                java.lang.String r3 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r6 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r6 = r6.getMobParam()
                java.lang.String r6 = r6.getShootWay()
                if (r6 != 0) goto L_0x0260
                java.lang.String r6 = ""
            L_0x0260:
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r6)
                r1[r4] = r3
                java.lang.String r3 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r4 = r4.getMobParam()
                java.lang.String r4 = r4.getCreationId()
                if (r4 != 0) goto L_0x0276
                java.lang.String r4 = ""
            L_0x0276:
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r5] = r3
                java.lang.String r3 = "host_filter"
                java.lang.String r4 = "true"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r9] = r3
                java.lang.String r3 = "anchor_type"
                java.lang.String r4 = "Yelp"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r8] = r3
                java.lang.String r3 = "addButton"
                java.lang.String r4 = "true"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r2] = r3
                java.util.Map r1 = kotlin.collections.C7507ae.m23393a((kotlin.Pair<? extends K, ? extends V>[]) r1)
                com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a.m138079a(r13, r0, r1)
                return
            L_0x02a2:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r7 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.TRIP_ADVISOR
                int r7 = r7.getTYPE()
                if (r1 != 0) goto L_0x02ac
                goto L_0x0343
            L_0x02ac:
                int r11 = r1.intValue()
                if (r11 != r7) goto L_0x0343
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x02b8:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x02d5
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.e r1 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r1
                int r1 = r1.f64760a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r3 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.TRIP_ADVISOR
                int r3 = r3.getTYPE()
                if (r1 != r3) goto L_0x02d1
                r1 = 1
                goto L_0x02d2
            L_0x02d1:
                r1 = 0
            L_0x02d2:
                if (r1 == 0) goto L_0x02b8
                goto L_0x02d6
            L_0x02d5:
                r0 = r6
            L_0x02d6:
                com.ss.android.ugc.aweme.commercialize.anchor.e r0 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r0
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                kotlin.jvm.internal.C7573i.m23582a(r13, r1)
                if (r0 == 0) goto L_0x02ed
                java.lang.String r0 = r0.f64763d
                if (r0 != 0) goto L_0x02ef
            L_0x02ed:
                java.lang.String r0 = ""
            L_0x02ef:
                kotlin.Pair[] r1 = new kotlin.Pair[r10]
                java.lang.String r3 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r6 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r6 = r6.getMobParam()
                java.lang.String r6 = r6.getShootWay()
                if (r6 != 0) goto L_0x0301
                java.lang.String r6 = ""
            L_0x0301:
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r6)
                r1[r4] = r3
                java.lang.String r3 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.MobParam r4 = r4.getMobParam()
                java.lang.String r4 = r4.getCreationId()
                if (r4 != 0) goto L_0x0317
                java.lang.String r4 = ""
            L_0x0317:
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r5] = r3
                java.lang.String r3 = "host_filter"
                java.lang.String r4 = "true"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r9] = r3
                java.lang.String r3 = "anchor_type"
                java.lang.String r4 = "TripAdvisor"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r8] = r3
                java.lang.String r3 = "addButton"
                java.lang.String r4 = "true"
                kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
                r1[r2] = r3
                java.util.Map r1 = kotlin.collections.C7507ae.m23393a((kotlin.Pair<? extends K, ? extends V>[]) r1)
                com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a.m138079a(r13, r0, r1)
                return
            L_0x0343:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.GAME
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x034c
                goto L_0x0360
            L_0x034c:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x0360
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b.m107785a(r13)
                return
            L_0x0360:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.MICRO_APP
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x0369
                goto L_0x03d5
            L_0x0369:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x03d5
                com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r13 = new com.ss.android.ugc.aweme.miniapp_api.model.params.b$a
                r13.<init>()
                java.lang.String r0 = "publish_page"
                com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r13 = r13.mo85791b(r0)
                java.lang.String r0 = "201017"
                com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r13 = r13.mo85792c(r0)
                com.ss.android.ugc.aweme.miniapp_api.model.params.b r13 = r13.mo85790a()
                com.google.gson.e r0 = new com.google.gson.e
                r0.<init>()
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r1 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r1.getExtensionDataRepo()
                android.arch.lifecycle.o r1 = r1.getUpdateAnchor()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = (com.p280ss.android.ugc.aweme.services.publish.AnchorTransData) r1
                if (r1 == 0) goto L_0x039f
                java.lang.String r6 = r1.getAnchorContent()
            L_0x039f:
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel.class
                java.lang.Object r0 = r0.mo15974a(r6, r1)
                com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel) r0
                com.ss.android.ugc.aweme.miniapp_api.services.b r1 = com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b.m22380b()
                java.lang.String r2 = "MiniAppServiceProxy.inst()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo18647a()
                java.lang.String r2 = "microAppModel"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r0 = r0.getSchema()
                java.lang.String r2 = "201017"
                java.lang.String r0 = r1.addScene(r0, r2)
                java.lang.String r0 = r1.setLaunchModeHostTask(r0)
                com.ss.android.ugc.aweme.shortvideo.ui.a r2 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r2 = r2.mo101914a()
                android.content.Context r2 = r2.getContext()
                r1.openMiniApp(r2, r0, r13)
                return
            L_0x03d5:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.ARTICLE
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x03de
                goto L_0x040c
            L_0x03de:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x040c
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getUpdateAnchor()
                java.lang.Object r13 = r13.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r13 = (com.p280ss.android.ugc.aweme.services.publish.AnchorTransData) r13
                if (r13 == 0) goto L_0x040b
                java.lang.String r13 = r13.getAnchorContent()
                if (r13 == 0) goto L_0x040b
                android.support.v4.app.Fragment r0 = r12.f107455c
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.commercialize.anchor.a.a$a r13 = com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.m80527a(r13)
                com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.m80528a(r0, r13)
                goto L_0x0581
            L_0x040b:
                return
            L_0x040c:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.POI
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x0415
                goto L_0x0439
            L_0x0415:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x0439
                boolean r13 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r13 == 0) goto L_0x042d
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r12.f107454b
                android.support.v4.app.Fragment r1 = r12.f107455c
                com.ss.android.ugc.aweme.services.publish.AVPublishContentType r2 = r12.f107456d
                r13.mo101920b(r0, r1, r2)
                return
            L_0x042d:
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r12.f107454b
                android.support.v4.app.Fragment r1 = r12.f107455c
                com.ss.android.ugc.aweme.services.publish.AVPublishContentType r2 = r12.f107456d
                r13.mo101916a(r0, r1, r2)
                return
            L_0x0439:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SHOP
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x0442
                goto L_0x044e
            L_0x0442:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x044e
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                r13.mo101925f()
                return
            L_0x044e:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.ANCHOR_SHOP_LINK
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x0458
                goto L_0x04d5
            L_0x0458:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x04d5
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f107454b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.o r13 = r13.getUpdateAnchor()
                java.lang.Object r13 = r13.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r13 = (com.p280ss.android.ugc.aweme.services.publish.AnchorTransData) r13
                if (r13 == 0) goto L_0x04d4
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0476:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0493
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.ss.android.ugc.aweme.commercialize.anchor.e r2 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r2
                int r2 = r2.f64760a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r3 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.ANCHOR_SHOP_LINK
                int r3 = r3.getTYPE()
                if (r2 != r3) goto L_0x048f
                r2 = 1
                goto L_0x0490
            L_0x048f:
                r2 = 0
            L_0x0490:
                if (r2 == 0) goto L_0x0476
                goto L_0x0494
            L_0x0493:
                r1 = r6
            L_0x0494:
                com.ss.android.ugc.aweme.commercialize.anchor.e r1 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r1
                if (r1 == 0) goto L_0x0581
                java.lang.String r0 = r1.f64763d
                if (r0 == 0) goto L_0x04d4
                java.lang.String r0 = r1.f64763d
                com.ss.android.ugc.aweme.music.c.f$a r0 = com.p280ss.android.ugc.aweme.music.p1409c.C33786f.m108941a(r0)
                java.lang.String r1 = "anchor_content"
                java.lang.String r13 = r13.getAnchorContent()
                com.ss.android.ugc.aweme.music.c.f$a r13 = r0.mo86195a(r1, r13)
                java.lang.String r0 = "need_bottom_out"
                java.lang.String r1 = "1"
                com.ss.android.ugc.aweme.music.c.f$a r13 = r13.mo86195a(r0, r1)
                android.net.Uri r13 = r13.mo86194a()
                java.lang.String r13 = r13.toString()
                java.lang.String r0 = "RnSchemeHelper.parseRnSc…              .toString()"
                kotlin.jvm.internal.C7573i.m23582a(r13, r0)
                com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
                android.support.v4.app.Fragment r1 = r12.f107455c
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                boolean r13 = r0.mo18679a(r1, r13)
                java.lang.Boolean.valueOf(r13)
            L_0x04d4:
                return
            L_0x04d5:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SEEDING
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x04de
                goto L_0x04ea
            L_0x04de:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x04ea
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                r13.mo101926g()
                return
            L_0x04ea:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.MEDIUM
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x04f3
                goto L_0x0507
            L_0x04f3:
                int r7 = r1.intValue()
                if (r7 != r2) goto L_0x0507
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.d r13 = r13.mo101914a()
                android.content.Context r13 = r13.getContext()
                com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.m131808a(r13)
                return
            L_0x0507:
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.COUPON
                int r2 = r2.getTYPE()
                if (r1 != 0) goto L_0x0510
                goto L_0x051c
            L_0x0510:
                int r1 = r1.intValue()
                if (r1 != r2) goto L_0x051c
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                r13.mo101927h()
                return
            L_0x051c:
                com.ss.android.ugc.aweme.shortvideo.ui.a r1 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel r1 = r1.f107436j
                if (r1 != 0) goto L_0x0575
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r1.addAll(r3)
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0535:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0552
                java.lang.Object r3 = r1.next()
                r7 = r3
                com.ss.android.ugc.aweme.commercialize.anchor.e r7 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r7
                int r7 = r7.f64760a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r8 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.MICRO_APP
                int r8 = r8.getTYPE()
                if (r7 != r8) goto L_0x054e
                r7 = 1
                goto L_0x054f
            L_0x054e:
                r7 = 0
            L_0x054f:
                if (r7 == 0) goto L_0x0535
                goto L_0x0553
            L_0x0552:
                r3 = r6
            L_0x0553:
                java.util.Collection r1 = kotlin.jvm.internal.C7577n.m23621b(r2)
                r1.remove(r3)
                com.ss.android.ugc.aweme.shortvideo.ui.a r1 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel r2 = new com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel
                java.lang.String r3 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r13, r3)
                android.content.Context r13 = r13.getContext()
                java.lang.String r3 = "it.context"
                kotlin.jvm.internal.C7573i.m23582a(r13, r3)
                android.support.v4.app.Fragment r3 = r12.f107455c
                android.arch.lifecycle.i r3 = (android.arch.lifecycle.C0043i) r3
                r2.<init>(r13, r0, r3)
                r1.f107436j = r2
            L_0x0575:
                com.ss.android.ugc.aweme.shortvideo.ui.a r13 = r12.f107453a
                com.ss.android.ugc.aweme.commercialize.anchor.AnchorPanel r13 = r13.f107436j
                if (r13 != 0) goto L_0x057e
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x057e:
                r13.show()
            L_0x0581:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.C41234g.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$h */
    static final class C41235h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24536e f107457a;

        /* renamed from: b */
        final /* synthetic */ C41224a f107458b;

        C41235h(C24536e eVar, C41224a aVar) {
            this.f107457a = eVar;
            this.f107458b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m131838a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131838a() {
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "label_panel").mo59970a("business_type", this.f107457a.f64760a).f60753a);
            int i = this.f107457a.f64760a;
            if (i == AnchorBusinessType.WIKIPEDIA.getTYPE()) {
                Context context = this.f107458b.mo101914a().getContext();
                C7573i.m23582a((Object) context, "delegate.context");
                String str = this.f107457a.f64763d;
                if (str == null) {
                    str = "";
                }
                Pair[] pairArr = new Pair[4];
                pairArr[0] = C7579l.m23633a("title", this.f107458b.mo101921c().getString(R.string.akx));
                String str2 = "shoot_way";
                String shootWay = this.f107458b.mo101918b().getMobParam().getShootWay();
                if (shootWay == null) {
                    shootWay = "";
                }
                pairArr[1] = C7579l.m23633a(str2, shootWay);
                String str3 = "creation_id";
                String creationId = this.f107458b.mo101918b().getMobParam().getCreationId();
                if (creationId == null) {
                    creationId = "";
                }
                pairArr[2] = C7579l.m23633a(str3, creationId);
                pairArr[3] = C7579l.m23633a("show_keyboard", "true");
                C43558a.m138079a(context, str, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr));
                AnchorPanel anchorPanel = this.f107458b.f107436j;
                if (anchorPanel != null) {
                    anchorPanel.dismiss();
                }
            } else if (i == AnchorBusinessType.YELP.getTYPE()) {
                Context context2 = this.f107458b.mo101914a().getContext();
                C7573i.m23582a((Object) context2, "delegate.context");
                String str4 = this.f107457a.f64763d;
                if (str4 == null) {
                    str4 = "";
                }
                Pair[] pairArr2 = new Pair[5];
                String str5 = "shoot_way";
                String shootWay2 = this.f107458b.mo101918b().getMobParam().getShootWay();
                if (shootWay2 == null) {
                    shootWay2 = "";
                }
                pairArr2[0] = C7579l.m23633a(str5, shootWay2);
                String str6 = "creation_id";
                String creationId2 = this.f107458b.mo101918b().getMobParam().getCreationId();
                if (creationId2 == null) {
                    creationId2 = "";
                }
                pairArr2[1] = C7579l.m23633a(str6, creationId2);
                pairArr2[2] = C7579l.m23633a("host_filter", "true");
                pairArr2[3] = C7579l.m23633a("anchor_type", "Yelp");
                pairArr2[4] = C7579l.m23633a("addButton", "true");
                C43558a.m138079a(context2, str4, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr2));
                AnchorPanel anchorPanel2 = this.f107458b.f107436j;
                if (anchorPanel2 != null) {
                    anchorPanel2.dismiss();
                }
            } else if (i == AnchorBusinessType.TRIP_ADVISOR.getTYPE()) {
                Context context3 = this.f107458b.mo101914a().getContext();
                C7573i.m23582a((Object) context3, "delegate.context");
                String str7 = this.f107457a.f64763d;
                if (str7 == null) {
                    str7 = "";
                }
                Pair[] pairArr3 = new Pair[5];
                String str8 = "shoot_way";
                String shootWay3 = this.f107458b.mo101918b().getMobParam().getShootWay();
                if (shootWay3 == null) {
                    shootWay3 = "";
                }
                pairArr3[0] = C7579l.m23633a(str8, shootWay3);
                String str9 = "creation_id";
                String creationId3 = this.f107458b.mo101918b().getMobParam().getCreationId();
                if (creationId3 == null) {
                    creationId3 = "";
                }
                pairArr3[1] = C7579l.m23633a(str9, creationId3);
                pairArr3[2] = C7579l.m23633a("host_filter", "true");
                pairArr3[3] = C7579l.m23633a("anchor_type", "TripAdvisor");
                pairArr3[4] = C7579l.m23633a("addButton", "true");
                C43558a.m138079a(context3, str7, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr3));
                AnchorPanel anchorPanel3 = this.f107458b.f107436j;
                if (anchorPanel3 != null) {
                    anchorPanel3.dismiss();
                }
            } else {
                if (i == AnchorBusinessType.GAME.getTYPE()) {
                    if (!this.f107457a.f64767h) {
                        C41224a.m131812b(this.f107458b.mo101921c().getContext());
                        AnchorPanel anchorPanel4 = this.f107458b.f107436j;
                        if (anchorPanel4 != null) {
                            anchorPanel4.dismiss();
                        }
                    }
                } else if (i == AnchorBusinessType.MICRO_APP.getTYPE()) {
                    if (!this.f107457a.f64767h) {
                        C41224a.m131813c(this.f107458b.mo101921c().getContext());
                        AnchorPanel anchorPanel5 = this.f107458b.f107436j;
                        if (anchorPanel5 != null) {
                            anchorPanel5.dismiss();
                        }
                    }
                } else if (i == AnchorBusinessType.ARTICLE.getTYPE()) {
                    C41224a.m131809a(this.f107458b.mo101921c().getContext(), this.f107457a.f64763d);
                    AnchorPanel anchorPanel6 = this.f107458b.f107436j;
                    if (anchorPanel6 != null) {
                        anchorPanel6.dismiss();
                    }
                } else if (i == AnchorBusinessType.POI.getTYPE()) {
                    if (C6399b.m19944t()) {
                        this.f107458b.mo101920b(this.f107458b.mo101918b(), this.f107458b.mo101921c(), this.f107458b.mo101923d());
                    } else {
                        this.f107458b.mo101916a(this.f107458b.mo101918b(), this.f107458b.mo101921c(), this.f107458b.mo101923d());
                    }
                    AnchorPanel anchorPanel7 = this.f107458b.f107436j;
                    if (anchorPanel7 != null) {
                        anchorPanel7.dismiss();
                    }
                } else if (i == AnchorBusinessType.SHOP.getTYPE()) {
                    this.f107458b.mo101925f();
                    AnchorPanel anchorPanel8 = this.f107458b.f107436j;
                    if (anchorPanel8 != null) {
                        anchorPanel8.dismiss();
                    }
                } else if (i == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
                    if (!(!C7573i.m23585a((Object) (Boolean) this.f107458b.mo101918b().getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true))) && !(!C7573i.m23585a((Object) (Boolean) this.f107458b.mo101918b().getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true)))) {
                        if (this.f107457a.f64763d != null) {
                            String uri = C33786f.m108941a(this.f107457a.f64763d).mo86195a("need_bottom_out", "1").mo86194a().toString();
                            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…              .toString()");
                            C7195s.m22438a().mo18679a((Activity) this.f107458b.mo101921c().getActivity(), uri);
                        }
                        AnchorPanel anchorPanel9 = this.f107458b.f107436j;
                        if (anchorPanel9 != null) {
                            anchorPanel9.dismiss();
                        }
                    } else if (!C6399b.m19944t() || !C23764b.m77913a(this.f107458b.mo101924e().getMusicId()) || this.f107458b.mo101923d() != AVPublishContentType.Video || this.f107458b.mo101924e().isCommercialMusic() || this.f107458b.mo101924e().isOriginalSound()) {
                        C10761a.m31403c(this.f107458b.mo101914a().getContext(), this.f107458b.mo101914a().getContext().getString(R.string.a3k)).mo25750a();
                    } else {
                        C10761a.m31403c(this.f107458b.mo101914a().getContext(), this.f107458b.mo101914a().getContext().getString(R.string.bzi)).mo25750a();
                    }
                } else if (i == AnchorBusinessType.SEEDING.getTYPE()) {
                    this.f107458b.mo101926g();
                    AnchorPanel anchorPanel10 = this.f107458b.f107436j;
                    if (anchorPanel10 != null) {
                        anchorPanel10.dismiss();
                    }
                } else if (i == AnchorBusinessType.MEDIUM.getTYPE()) {
                    C41224a.m131808a(this.f107458b.mo101921c().getContext());
                    AnchorPanel anchorPanel11 = this.f107458b.f107436j;
                    if (anchorPanel11 != null) {
                        anchorPanel11.dismiss();
                    }
                } else if (i == AnchorBusinessType.COUPON.getTYPE()) {
                    this.f107458b.mo101927h();
                    AnchorPanel anchorPanel12 = this.f107458b.f107436j;
                    if (anchorPanel12 != null) {
                        anchorPanel12.dismiss();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$i */
    static final class C41236i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41224a f107459a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107460b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107461c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f107462d;

        C41236i(C41224a aVar, ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f107459a = aVar;
            this.f107460b = extensionMisc;
            this.f107461c = fragment;
            this.f107462d = aVPublishContentType;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f107459a.mo101922c(this.f107460b, this.f107461c, this.f107462d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$j */
    static final class C41237j implements OnClickListener {

        /* renamed from: a */
        public static final C41237j f107463a = new C41237j();

        C41237j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a$k */
    public static final class C41238k implements C43154a {

        /* renamed from: a */
        final /* synthetic */ C41224a f107464a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107465b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107466c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f107467d;

        /* renamed from: b */
        public final void mo71376b() {
        }

        /* renamed from: a */
        public final void mo71375a() {
            this.f107464a.mo101916a(this.f107465b, this.f107466c, this.f107467d);
        }

        C41238k(C41224a aVar, ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f107464a = aVar;
            this.f107465b = extensionMisc;
            this.f107466c = fragment;
            this.f107467d = aVPublishContentType;
        }
    }

    public final String getName() {
        return "AnchorPublishExtension";
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

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
    }

    /* renamed from: j */
    private static AnchorPublishModel m131816j() {
        return new AnchorPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131816j();
    }

    /* renamed from: a */
    public final C24534d mo101914a() {
        C24534d dVar = this.f107427a;
        if (dVar == null) {
            C7573i.m23583a("delegate");
        }
        return dVar;
    }

    /* renamed from: b */
    public final ExtensionMisc mo101918b() {
        ExtensionMisc extensionMisc = this.f107428b;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        return extensionMisc;
    }

    /* renamed from: c */
    public final Fragment mo101921c() {
        Fragment fragment = this.f107429c;
        if (fragment == null) {
            C7573i.m23583a("fragment");
        }
        return fragment;
    }

    /* renamed from: d */
    public final AVPublishContentType mo101923d() {
        AVPublishContentType aVPublishContentType = this.f107430d;
        if (aVPublishContentType == null) {
            C7573i.m23583a("contentType");
        }
        return aVPublishContentType;
    }

    /* renamed from: e */
    public final PublishOutput mo101924e() {
        PublishOutput publishOutput = this.f107431e;
        if (publishOutput == null) {
            C7573i.m23583a("publishOutput");
        }
        return publishOutput;
    }

    public final void onEnterChildrenMode() {
        C24534d dVar = this.f107427a;
        if (dVar == null) {
            C7573i.m23583a("delegate");
        }
        dVar.setVisibility(8);
    }

    /* renamed from: k */
    private final void m131817k() {
        List<C24536e> list = this.f107437k;
        if (list != null) {
            Iterator it = list.iterator();
            if (it != null) {
                while (it.hasNext()) {
                    if (((C24536e) it.next()).f64767h) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
        List<C24536e> list = this.f107437k;
        if (list != null) {
            for (C24536e eVar : list) {
                ExtensionMisc extensionMisc = this.f107428b;
                if (extensionMisc == null) {
                    C7573i.m23583a("extensionMisc");
                }
                eVar.mo64334a(extensionMisc);
                eVar.mo64335a((C7561a<C7581n>) new C41235h<C7581n>(eVar, this));
            }
        }
    }

    /* renamed from: i */
    private final boolean m131815i() {
        String str;
        ExtensionMisc extensionMisc = this.f107428b;
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
            ExtensionMisc extensionMisc2 = this.f107428b;
            if (extensionMisc2 == null) {
                C7573i.m23583a("extensionMisc");
            }
            extensionMisc2.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            return false;
        }
        ExtensionMisc extensionMisc3 = this.f107428b;
        if (extensionMisc3 == null) {
            C7573i.m23583a("extensionMisc");
        }
        AnchorTransData anchorTransData = (AnchorTransData) extensionMisc3.getExtensionDataRepo().getUpdateAnchor().getValue();
        if (anchorTransData != null) {
            Integer source = anchorTransData.getSource();
            if (source == null || source.intValue() != 0) {
                return true;
            }
        }
        List<C24536e> list = this.f107437k;
        if (list == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo101925f() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
        if (TextUtils.isEmpty(curUser.getBindPhone())) {
            C21643ad d = C6861a.m21335d();
            Fragment fragment = this.f107429c;
            if (fragment == null) {
                C7573i.m23583a("fragment");
            }
            d.bindMobile(fragment.getActivity(), "", null, null);
            return;
        }
        ICommerceService a2 = C24436a.m80356a();
        Fragment fragment2 = this.f107429c;
        if (fragment2 == null) {
            C7573i.m23583a("fragment");
        }
        Context activity = fragment2.getActivity();
        IAccountUserService a3 = C21115b.m71197a();
        C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
        a2.tryCheckRealName(activity, a3.getVerifyStatus(), "video_post_page", "click_add_product", new C41225a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 == null) goto L_0x0041;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101926g() {
        /*
            r8 = this;
            r0 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x0018 }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x0018 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs r1 = r1.getAwemeFeConf()     // Catch:{ NullValueException -> 0x0018 }
            java.lang.String r2 = "SettingsReader.get().awemeFeConf"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x0018 }
            java.lang.String r1 = r1.getSeedLabel()     // Catch:{ NullValueException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = "aweme://webview/?url=https%3A%2F%2Fffh.jinritemai.com%2Ffalcon%2Fe_commerce%2Frn%2Fseed_label%2F%3Fstatus_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder&status_bar_color=ffffff&status_font_dark=1&hide_nav_bar=1&loading_bgcolor=ffffff&video_title=video_title_placeholder&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_lyon_seed_label%26bundle%3Dindex.js%26module_name%3Dpage_seed_label%26status_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder"
        L_0x0024:
            r2 = r1
            if (r2 == 0) goto L_0x004b
            java.lang.String r3 = "video_title_placeholder"
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r8.f107428b
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0032:
            com.ss.android.ugc.aweme.port.in.ai$a r0 = r0.getPublishExtensionDataContainer()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r0.mo88235e()
            if (r0 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = r0
            goto L_0x0044
        L_0x0041:
            java.lang.String r0 = ""
            goto L_0x003f
        L_0x0044:
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r0 = kotlin.text.C7634n.m23711a(r2, r3, r4, false)
        L_0x004b:
            com.ss.android.ugc.aweme.router.s r1 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r1.mo18682a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.mo101926g():void");
    }

    /* renamed from: h */
    public final void mo101927h() {
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
                    SmartRouter.buildRoute(this.f107434h, str).withParam("need_bottom_out", true).withAnimation(R.anim.s, 0).open();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m131808a(Context context) {
        C41513aa.m132239a(context);
    }

    /* renamed from: b */
    public static void m131812b(Context context) {
        C33336b.m107785a(context);
    }

    /* renamed from: c */
    public static void m131813c(Context context) {
        C33337c.m107792a(context);
    }

    /* renamed from: c */
    private final void m131814c(ExtensionMisc extensionMisc) {
        mo101919b(extensionMisc);
        mo101917a(true);
    }

    /* renamed from: a */
    private static C24534d m131807a(LinearLayout linearLayout) {
        C24534d dVar = new C24534d(linearLayout.getContext());
        linearLayout.addView(dVar, -1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f));
        dVar.setGravity(16);
        dVar.setOrientation(1);
        dVar.setSingleLine(true);
        return dVar;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onAsyncAnchor(C24522a aVar) {
        if (aVar != null) {
            ExtensionMisc extensionMisc = this.f107428b;
            if (extensionMisc == null) {
                C7573i.m23583a("extensionMisc");
            }
            extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(aVar.f64725a);
        }
        AnchorPanel anchorPanel = this.f107436j;
        if (anchorPanel != null) {
            anchorPanel.dismiss();
        }
        DmtTextView dmtTextView = this.f107438l;
        if (dmtTextView != null) {
            dmtTextView.setVisibility(8);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onAsyncGoodsInfoEvent(C39322a aVar) {
        boolean z;
        if (aVar != null) {
            BusinessGoodsPublishModel businessGoodsPublishModel = aVar.f102141a;
            C7573i.m23582a((Object) businessGoodsPublishModel, "it.model");
            String str = businessGoodsPublishModel.title;
            C7573i.m23582a((Object) str, "it.model.title");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ExtensionMisc extensionMisc = this.f107428b;
                if (extensionMisc == null) {
                    C7573i.m23583a("extensionMisc");
                }
                mo101915a(extensionMisc);
            } else {
                ExtensionMisc extensionMisc2 = this.f107428b;
                if (extensionMisc2 == null) {
                    C7573i.m23583a("extensionMisc");
                }
                C0052o updateAnchor = extensionMisc2.getExtensionDataRepo().getUpdateAnchor();
                int type = AnchorBusinessType.SHOP.getTYPE();
                C6600e eVar = new C6600e();
                BusinessGoodsPublishModel businessGoodsPublishModel2 = aVar.f102141a;
                C7573i.m23582a((Object) businessGoodsPublishModel2, "it.model");
                String b = eVar.mo15979b((Object) C7507ae.m23385a(C7579l.m23633a("shop_draft_id", businessGoodsPublishModel2.draftId)));
                C7573i.m23582a((Object) b, "Gson().toJson(mapOf(\n   …                       ))");
                BusinessGoodsPublishModel businessGoodsPublishModel3 = aVar.f102141a;
                C7573i.m23582a((Object) businessGoodsPublishModel3, "it.model");
                AnchorTransData anchorTransData = new AnchorTransData(type, b, businessGoodsPublishModel3.title, null, null, null, null, 120, null);
                updateAnchor.setValue(anchorTransData);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) (java.lang.Boolean) r0.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (java.lang.Object) java.lang.Boolean.valueOf(true)) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r3.f65949l == 4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r3 = r2.f107428b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r3 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        kotlin.jvm.internal.C7573i.m23583a("extensionMisc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r3.getExtensionDataRepo().getUpdateAnchor().setValue(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed(com.p280ss.android.ugc.aweme.services.publish.PublishOutput r3) {
        /*
            r2 = this;
            java.lang.String r0 = "publishOutput"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f107428b
            if (r3 != 0) goto L_0x000e
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x000e:
            com.ss.android.ugc.aweme.port.in.ai$a r3 = r3.getPublishExtensionDataContainer()
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r3.mo88234d()
            com.ss.android.ugc.aweme.commercialize.model.o r3 = com.p280ss.android.ugc.aweme.commercialize.model.C25006o.m82325a(r3)
            if (r3 == 0) goto L_0x0064
            int r0 = r3.f65945h
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SHOP
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x004a
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r2.f107428b
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.o r0 = r0.getWithStarAtlasOrderGoods()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            int r3 = r3.f65949l
            r0 = 4
            if (r3 != r0) goto L_0x0064
        L_0x004f:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f107428b
            if (r3 != 0) goto L_0x0058
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0058:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r3.getExtensionDataRepo()
            android.arch.lifecycle.o r3 = r3.getUpdateAnchor()
            r0 = 0
            r3.setValue(r0)
        L_0x0064:
            r2.m131817k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.onBackPressed(com.ss.android.ugc.aweme.services.publish.PublishOutput):void");
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C27994k kVar) {
        C7573i.m23587b(kVar, "broadCastEvent");
        try {
            String string = kVar.f73730b.getString("eventName");
            if (string != null) {
                if (!C7573i.m23585a((Object) string, (Object) "anchor_merch_pick_content")) {
                    string = null;
                }
                if (string != null) {
                    if (!kVar.f73730b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        String string2 = kVar.f73730b.getString("data");
                        ExtensionMisc extensionMisc = this.f107428b;
                        if (extensionMisc == null) {
                            C7573i.m23583a("extensionMisc");
                        }
                        C0052o updateAnchor = extensionMisc.getExtensionDataRepo().getUpdateAnchor();
                        int type = AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE();
                        C7573i.m23582a((Object) string2, "data");
                        AnchorTransData anchorTransData = new AnchorTransData(type, string2, (String) ((HashMap) new C6600e().mo15974a(string2, new HashMap().getClass())).get(POIService.KEY_KEYWORD), null, null, null, null, 120, null);
                        updateAnchor.setValue(anchorTransData);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) (java.lang.Boolean) r0.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (java.lang.Object) java.lang.Boolean.valueOf(true)) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r3.f65949l == 4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r3 = r2.f107428b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r3 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        kotlin.jvm.internal.C7573i.m23583a("extensionMisc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r3.getExtensionDataRepo().getUpdateAnchor().setValue(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveDraft(com.p280ss.android.ugc.aweme.services.publish.PublishOutput r3) {
        /*
            r2 = this;
            java.lang.String r0 = "publishOutput"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f107428b
            if (r3 != 0) goto L_0x000e
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x000e:
            com.ss.android.ugc.aweme.port.in.ai$a r3 = r3.getPublishExtensionDataContainer()
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r3.mo88234d()
            com.ss.android.ugc.aweme.commercialize.model.o r3 = com.p280ss.android.ugc.aweme.commercialize.model.C25006o.m82325a(r3)
            if (r3 == 0) goto L_0x0064
            int r0 = r3.f65945h
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SHOP
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x004a
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r2.f107428b
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.o r0 = r0.getWithStarAtlasOrderGoods()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            int r3 = r3.f65949l
            r0 = 4
            if (r3 != r0) goto L_0x0064
        L_0x004f:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f107428b
            if (r3 != 0) goto L_0x0058
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0058:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r3.getExtensionDataRepo()
            android.arch.lifecycle.o r3 = r3.getUpdateAnchor()
            r0 = 0
            r3.setValue(r0)
        L_0x0064:
            r2.m131817k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.onSaveDraft(com.ss.android.ugc.aweme.services.publish.PublishOutput):void");
    }

    /* renamed from: b */
    private final DmtTextView m131811b(LinearLayout linearLayout) {
        DmtTextView dmtTextView = new DmtTextView(linearLayout.getContext());
        linearLayout.addView(dmtTextView, -2, (int) C9738o.m28708b(linearLayout.getContext(), 20.0f));
        dmtTextView.setTextSize(13.0f);
        StringBuilder sb = new StringBuilder(linearLayout.getContext().getString(R.string.fy));
        C25006o oVar = this.f107432f;
        if (oVar == null) {
            C7573i.m23583a("data");
        }
        List<C24536e> list = oVar.f65961x;
        if (list != null) {
            for (C24536e eVar : list) {
                String str = eVar.f64762c;
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb.append(sb2.toString());
                }
            }
        }
        dmtTextView.setText(sb.toString());
        dmtTextView.setTextColor(dmtTextView.getResources().getColor(R.color.azd));
        dmtTextView.setPadding(45, 0, 0, 0);
        dmtTextView.setMaxEms(18);
        dmtTextView.setMaxLines(1);
        dmtTextView.setSingleLine();
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo101915a(ExtensionMisc extensionMisc) {
        AnchorTransData anchorTransData = (AnchorTransData) extensionMisc.getExtensionDataRepo().getUpdateAnchor().getValue();
        if (anchorTransData != null && anchorTransData.getBusinessType() == AnchorBusinessType.SHOP.getTYPE()) {
            extensionMisc.getExtensionDataRepo().getRevertLinkAction().invoke();
        }
        m131814c(extensionMisc);
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
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r14 = r13.f107428b
            if (r14 != 0) goto L_0x005a
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x005a:
            r13.mo101915a(r14)
            goto L_0x0094
        L_0x005e:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r13.f107428b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a.onAsyncCouponInfoEvent(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    /* renamed from: b */
    public final void mo101919b(ExtensionMisc extensionMisc) {
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            C25006o b = C25006o.m82327b(publishExtensionDataContainer.mo88234d());
            if (b != null) {
                b.f65945h = AnchorBusinessType.NO_TYPE.getTYPE();
                b.f65944g = "";
                b.f65948k = null;
                b.f65946i = "";
                b.f65949l = 0;
                b.f65947j = "";
                b.f65955r = "";
                b.f65956s = "";
                b.f65957t = "";
                publishExtensionDataContainer.mo88231a(C25006o.m82326a(b));
                DmtTextView dmtTextView = this.f107438l;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(0);
                }
                List<C24536e> list = this.f107437k;
                if (list != null && this.f107438l == null && b.f65961x != null && b.f65961x.size() > 0) {
                    List<C24536e> list2 = b.f65961x;
                    if (list2 != null) {
                        for (C24536e eVar : list2) {
                            eVar.f64767h = true;
                        }
                    }
                    Object obj = b.f65961x.get(0);
                    C7573i.m23582a(obj, "recommendAnchor[0]");
                    list.add(0, obj);
                    C24534d dVar = this.f107427a;
                    if (dVar == null) {
                        C7573i.m23583a("delegate");
                    }
                    LinearLayout linearLayout = this.f107433g;
                    if (linearLayout == null) {
                        C7573i.m23583a("container");
                    }
                    dVar.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 40.0f)));
                    LinearLayout linearLayout2 = this.f107433g;
                    if (linearLayout2 == null) {
                        C7573i.m23583a("container");
                    }
                    this.f107438l = m131811b(linearLayout2);
                }
            }
        }
        C24534d dVar2 = this.f107427a;
        if (dVar2 == null) {
            C7573i.m23583a("delegate");
        }
        dVar2.mo64331a();
    }

    /* renamed from: a */
    public final void mo101917a(boolean z) {
        if (z) {
            C24534d dVar = this.f107427a;
            if (dVar == null) {
                C7573i.m23583a("delegate");
            }
            dVar.setAlpha(1.0f);
            C24534d dVar2 = this.f107427a;
            if (dVar2 == null) {
                C7573i.m23583a("delegate");
            }
            dVar2.setEnable(true);
            C24534d dVar3 = this.f107427a;
            if (dVar3 == null) {
                C7573i.m23583a("delegate");
            }
            RemoteImageView leftDrawableView = dVar3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C24534d dVar4 = this.f107427a;
        if (dVar4 == null) {
            C7573i.m23583a("delegate");
        }
        dVar4.setAlpha(0.5f);
        C24534d dVar5 = this.f107427a;
        if (dVar5 == null) {
            C7573i.m23583a("delegate");
        }
        dVar5.setEnable(false);
        C24534d dVar6 = this.f107427a;
        if (dVar6 == null) {
            C7573i.m23583a("delegate");
        }
        RemoteImageView leftDrawableView2 = dVar6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    /* renamed from: a */
    public static void m131809a(Context context, String str) {
        C24523a.m80529a(context, str);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* renamed from: c */
    public final void mo101922c(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        if (fragment != null) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C32617a.m105667a(activity, new C41238k(this, extensionMisc, fragment, aVPublishContentType));
            }
        }
    }

    /* renamed from: b */
    public final void mo101920b(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        Context context;
        if (C43014ci.m136523c()) {
            mo101916a(extensionMisc, fragment, aVPublishContentType);
            return;
        }
        C43014ci.m136522b();
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        C43014ci.m136519a(context, new C41236i(this, extensionMisc, fragment, aVPublishContentType), C41237j.f107463a);
    }

    /* renamed from: a */
    public final void mo101916a(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        FragmentActivity fragmentActivity;
        IPOIService iPOIService = (IPOIService) ServiceManager.get().getService(IPOIService.class);
        if (iPOIService != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(extensionMisc.getCandidateLog())) {
                bundle.putString("candidateloc", extensionMisc.getCandidateLog());
            }
            bundle.putBoolean("enable_global_search", false);
            bundle.putBoolean("is_over_sea", false);
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            iPOIService.getPOISearchDialog(fragmentActivity, bundle, new C41226b(this, extensionMisc, aVPublishContentType)).show();
            C6907h.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    /* renamed from: a */
    public static void m131810a(String str, String str2, String str3, String str4, String str5, PoiStruct poiStruct, AVPublishContentType aVPublishContentType) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", "edit_page").mo59973a("poi_type", String.valueOf(poiStruct.iconType)).mo59973a("poi_id", poiStruct.poiId).mo59973a("enter_method", str).mo59972a("content_type", (Object) aVPublishContentType).mo59973a("log_pb", str4).mo59973a(POIService.KEY_ORDER, str3).mo59973a("key_word", str2).mo59973a("is_media_location", poiStruct.isCandidate()).mo59973a("distance_info", poiStruct.getDistance()).mo59973a("search_region_type", str5);
        C35452k.m114513a(poiStruct, "choose_poi", a);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        MentionEditText mentionEditText;
        boolean z;
        Fragment fragment2 = fragment;
        LinearLayout linearLayout2 = linearLayout;
        AVPublishContentType aVPublishContentType2 = aVPublishContentType;
        PublishOutput publishOutput2 = publishOutput;
        ExtensionMisc extensionMisc2 = extensionMisc;
        C7573i.m23587b(fragment2, "fragment");
        C7573i.m23587b(linearLayout2, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType2, "contentType");
        C7573i.m23587b(publishOutput2, "publishOutput");
        C7573i.m23587b(extensionMisc2, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f107429c = fragment2;
        this.f107430d = aVPublishContentType2;
        this.f107431e = publishOutput2;
        this.f107434h = fragment.getContext();
        View view = fragment.getView();
        if (view != null) {
            mentionEditText = (MentionEditText) view.findViewById(R.id.acs);
        } else {
            mentionEditText = null;
        }
        this.f107435i = mentionEditText;
        C42961az.m136382c(this);
        this.f107428b = extensionMisc2;
        this.f107433g = linearLayout2;
        this.f107427a = m131807a(linearLayout);
        this.f107437k = AnchorListManager.f64708a.mo64313b();
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        int i = 0;
        if (publishExtensionDataContainer != null) {
            C25006o a = C25006o.m82325a(publishExtensionDataContainer.mo88234d());
            C7573i.m23582a((Object) a, "PublishExtensionModel.fr…merceData(it.publishData)");
            this.f107432f = a;
            List<C24536e> list = this.f107437k;
            if (list != null) {
                if ((!list.isEmpty()) && ((C24536e) list.get(0)).f64767h) {
                    list.remove(0);
                }
                C25006o oVar = this.f107432f;
                if (oVar == null) {
                    C7573i.m23583a("data");
                }
                List<C24536e> list2 = oVar.f65961x;
                if (list2 != null && list2.size() > 0) {
                    C25006o oVar2 = this.f107432f;
                    if (oVar2 == null) {
                        C7573i.m23583a("data");
                    }
                    if (oVar2.f65945h == AnchorBusinessType.NO_TYPE.getTYPE()) {
                        for (C24536e eVar : list2) {
                            eVar.f64767h = true;
                        }
                        Object obj = list2.get(0);
                        C7573i.m23582a(obj, "this[0]");
                        list.add(0, obj);
                        C24534d dVar = this.f107427a;
                        if (dVar == null) {
                            C7573i.m23583a("delegate");
                        }
                        LinearLayout linearLayout3 = this.f107433g;
                        if (linearLayout3 == null) {
                            C7573i.m23583a("container");
                        }
                        dVar.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(linearLayout3.getContext(), 40.0f)));
                        LinearLayout linearLayout4 = this.f107433g;
                        if (linearLayout4 == null) {
                            C7573i.m23583a("container");
                        }
                        this.f107438l = m131811b(linearLayout4);
                    }
                }
            }
            C25006o oVar3 = this.f107432f;
            if (oVar3 == null) {
                C7573i.m23583a("data");
            }
            if (oVar3.f65945h == AnchorBusinessType.NO_TYPE.getTYPE()) {
                m131814c(extensionMisc2);
                extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            } else {
                C25006o oVar4 = this.f107432f;
                if (oVar4 == null) {
                    C7573i.m23583a("data");
                }
                if (oVar4.f65945h == AnchorBusinessType.SHOP.getTYPE()) {
                    extensionMisc.getExtensionDataRepo().getRecordLinkAction().invoke();
                    extensionMisc.getExtensionDataRepo().getResetLinkAction().invoke();
                    extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(false));
                }
                C0052o updateAnchor = extensionMisc.getExtensionDataRepo().getUpdateAnchor();
                C25006o oVar5 = this.f107432f;
                if (oVar5 == null) {
                    C7573i.m23583a("data");
                }
                int i2 = oVar5.f65945h;
                C25006o oVar6 = this.f107432f;
                if (oVar6 == null) {
                    C7573i.m23583a("data");
                }
                String str = oVar6.f65946i;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                C25006o oVar7 = this.f107432f;
                if (oVar7 == null) {
                    C7573i.m23583a("data");
                }
                String str3 = oVar7.f65947j;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                C25006o oVar8 = this.f107432f;
                if (oVar8 == null) {
                    C7573i.m23583a("data");
                }
                String str5 = oVar8.f65955r;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                C25006o oVar9 = this.f107432f;
                if (oVar9 == null) {
                    C7573i.m23583a("data");
                }
                Integer valueOf = Integer.valueOf(oVar9.f65949l);
                C25006o oVar10 = this.f107432f;
                if (oVar10 == null) {
                    C7573i.m23583a("data");
                }
                String str7 = oVar10.f65944g;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = str7;
                C25006o oVar11 = this.f107432f;
                if (oVar11 == null) {
                    C7573i.m23583a("data");
                }
                AnchorTransData anchorTransData = r9;
                AnchorTransData anchorTransData2 = new AnchorTransData(i2, str2, str4, str6, valueOf, str8, oVar11.f65948k);
                updateAnchor.setValue(anchorTransData);
            }
        }
        if (C6399b.m19944t() && C23764b.m77913a(publishOutput.getMusicId()) && aVPublishContentType2 == AVPublishContentType.Video && !publishOutput.isCommercialMusic() && !publishOutput.isOriginalSound()) {
            AnchorTransData anchorTransData3 = (AnchorTransData) extensionMisc.getExtensionDataRepo().getUpdateAnchor().getValue();
            if (anchorTransData3 != null) {
                if (anchorTransData3.getBusinessType() == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    anchorTransData3 = null;
                }
                if (anchorTransData3 != null) {
                    extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
                }
            }
            extensionMisc.getExtensionDataRepo().getI18nStarAtlasClosed().setValue(Boolean.valueOf(false));
        }
        extensionMisc.getExtensionDataRepo().setShowPermissionAction(new C41227c(extensionMisc2, fragment2));
        C35542a publishExtensionDataContainer2 = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null && publishExtensionDataContainer2.mo88236f()) {
            MicroAppModel transMicroAppInfo = extensionMisc.getTransMicroAppInfo();
            if (transMicroAppInfo != null) {
                C0052o updateAnchor2 = extensionMisc.getExtensionDataRepo().getUpdateAnchor();
                int type = AnchorBusinessType.MICRO_APP.getTYPE();
                String b = new C6600e().mo15979b((Object) transMicroAppInfo);
                C7573i.m23582a((Object) b, "Gson().toJson(it)");
                AnchorTransData anchorTransData4 = new AnchorTransData(type, b, transMicroAppInfo.getAnchorTitle(), null, null, null, null, 120, null);
                updateAnchor2.setValue(anchorTransData4);
                publishExtensionDataContainer2.mo88237g();
            }
        }
        C0043i iVar = fragment2;
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41230d(this));
        extensionMisc.getExtensionDataRepo().setResetAnchor(new C41231e(extensionMisc2));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41232f(this, extensionMisc2));
        C24534d dVar2 = this.f107427a;
        if (dVar2 == null) {
            C7573i.m23583a("delegate");
        }
        if (!m131815i()) {
            i = 8;
        }
        dVar2.setVisibility(i);
        C24534d dVar3 = this.f107427a;
        if (dVar3 == null) {
            C7573i.m23583a("delegate");
        }
        dVar3.setOnClickListener(new C41234g(this, extensionMisc2, fragment2, aVPublishContentType2));
    }
}
