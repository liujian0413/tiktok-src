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
import com.bytedance.common.utility.C9738o;
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
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.services.publish.SeedPublishModel;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae */
public final class C41244ae implements IAVPublishExtension<SeedPublishModel> {

    /* renamed from: b */
    public static final C41245a f107475b = new C41245a(null);

    /* renamed from: a */
    public SeedingPublishSettingItem f107476a;

    /* renamed from: c */
    private String f107477c;

    /* renamed from: d */
    private String f107478d;

    /* renamed from: e */
    private ExtensionMisc f107479e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae$a */
    public static final class C41245a {
        private C41245a() {
        }

        public /* synthetic */ C41245a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae$b */
    static final class C41246b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41244ae f107480a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107481b;

        C41246b(C41244ae aeVar, ExtensionMisc extensionMisc) {
            this.f107480a = aeVar;
            this.f107481b = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C41244ae.m131853a(this.f107480a).f107118j) {
                this.f107480a.mo101939a();
            } else if (C7573i.m23585a((Object) (Boolean) this.f107481b.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107481b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107481b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107481b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C9738o.m28697a(C41244ae.m131853a(this.f107480a).getContext(), C41244ae.m131853a(this.f107480a).getContext().getString(R.string.e0d));
            } else {
                C9738o.m28697a(C41244ae.m131853a(this.f107480a).getContext(), C41244ae.m131853a(this.f107480a).getContext().getString(R.string.aio, new Object[]{C41244ae.m131853a(this.f107480a).getContext().getString(R.string.a_f)}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae$c */
    static final class C41247c<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41244ae f107482a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107483b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae$c$a */
        static final class C41248a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107484a;

            /* renamed from: b */
            final /* synthetic */ C41247c f107485b;

            C41248a(AnchorTransData anchorTransData, C41247c cVar) {
                this.f107484a = anchorTransData;
                this.f107485b = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131861a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131861a() {
                this.f107485b.f107482a.mo101940a(this.f107485b.f107483b);
                this.f107485b.f107483b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f107485b.f107483b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f107485b.f107483b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            }
        }

        C41247c(C41244ae aeVar, ExtensionMisc extensionMisc) {
            this.f107482a = aeVar;
            this.f107483b = extensionMisc;
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
                        SeedingPublishSettingItem a = C41244ae.m131853a(this.f107482a);
                        UrlModel urlModel = eVar.f64764e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        String anchorTag = anchorTransData.getAnchorTag();
                        if (anchorTag == null) {
                            anchorTag = "";
                        }
                        a.mo101684a(urlModel, title, anchorTag, new C41248a(anchorTransData, this));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ae$d */
    static final class C41249d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41244ae f107486a;

        C41249d(C41244ae aeVar) {
            this.f107486a = aeVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41244ae aeVar = this.f107486a;
                C7573i.m23582a((Object) bool, "it");
                aeVar.mo101941a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "SeedingPublishExtension";
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

    public final void onEnterChildrenMode() {
        SeedingPublishSettingItem seedingPublishSettingItem = this.f107476a;
        if (seedingPublishSettingItem == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        seedingPublishSettingItem.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public SeedPublishModel provideExtensionData() {
        String str;
        ExtensionMisc extensionMisc = this.f107479e;
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
        SeedPublishModel seedPublishModel = new SeedPublishModel();
        seedPublishModel.setSeedId(a.f65956s);
        seedPublishModel.setSeedName(a.f65957t);
        seedPublishModel.setReferSeedId(a.f65958u);
        seedPublishModel.setReferSeedName(a.f65959v);
        seedPublishModel.setDataType(a.f65960w);
        return seedPublishModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 == null) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101939a() {
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
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r8.f107479e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41244ae.mo101939a():void");
    }

    /* renamed from: c */
    private final boolean m131856c() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107479e;
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
        ExtensionMisc extensionMisc2 = this.f107479e;
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
                    if (eVar.f64760a == AnchorBusinessType.SEEDING.getTYPE()) {
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
    public final void mo101940a(ExtensionMisc extensionMisc) {
        m131855b(extensionMisc);
        mo101941a(true);
    }

    /* renamed from: a */
    public static final /* synthetic */ SeedingPublishSettingItem m131853a(C41244ae aeVar) {
        SeedingPublishSettingItem seedingPublishSettingItem = aeVar.f107476a;
        if (seedingPublishSettingItem == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        return seedingPublishSettingItem;
    }

    /* renamed from: a */
    private static SeedingPublishSettingItem m131852a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        C7573i.m23582a((Object) context, "container.context");
        SeedingPublishSettingItem seedingPublishSettingItem = new SeedingPublishSettingItem(context, null);
        linearLayout.addView(seedingPublishSettingItem, new LayoutParams(-1, (int) C20505c.m68010a(linearLayout.getContext(), 52.0f)));
        seedingPublishSettingItem.setGravity(16);
        seedingPublishSettingItem.setOrientation(0);
        seedingPublishSettingItem.setVisibility(8);
        return seedingPublishSettingItem;
    }

    /* renamed from: b */
    private final void m131855b(ExtensionMisc extensionMisc) {
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
        SeedingPublishSettingItem seedingPublishSettingItem = this.f107476a;
        if (seedingPublishSettingItem == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        seedingPublishSettingItem.mo101683a();
    }

    /* renamed from: a */
    public final void mo101941a(boolean z) {
        if (z) {
            SeedingPublishSettingItem seedingPublishSettingItem = this.f107476a;
            if (seedingPublishSettingItem == null) {
                C7573i.m23583a("seedingPublishSettingItem");
            }
            seedingPublishSettingItem.setAlpha(1.0f);
            SeedingPublishSettingItem seedingPublishSettingItem2 = this.f107476a;
            if (seedingPublishSettingItem2 == null) {
                C7573i.m23583a("seedingPublishSettingItem");
            }
            seedingPublishSettingItem2.setEnable(true);
            SeedingPublishSettingItem seedingPublishSettingItem3 = this.f107476a;
            if (seedingPublishSettingItem3 == null) {
                C7573i.m23583a("seedingPublishSettingItem");
            }
            RemoteImageView leftDrawableView = seedingPublishSettingItem3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "seedingPublishSettingItem.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        SeedingPublishSettingItem seedingPublishSettingItem4 = this.f107476a;
        if (seedingPublishSettingItem4 == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        seedingPublishSettingItem4.setAlpha(0.5f);
        SeedingPublishSettingItem seedingPublishSettingItem5 = this.f107476a;
        if (seedingPublishSettingItem5 == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        seedingPublishSettingItem5.setEnable(false);
        SeedingPublishSettingItem seedingPublishSettingItem6 = this.f107476a;
        if (seedingPublishSettingItem6 == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        RemoteImageView leftDrawableView2 = seedingPublishSettingItem6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "seedingPublishSettingItem.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    @org.greenrobot.eventbus.C7709l(mo20400a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncGoodsSeedInfoEvent(com.p280ss.android.ugc.aweme.p1216fe.method.C27994k r15) {
        /*
            r14 = this;
            java.lang.String r0 = "broadCastEvent"
            kotlin.jvm.internal.C7573i.m23587b(r15, r0)
            org.json.JSONObject r0 = r15.f73730b
            if (r0 == 0) goto L_0x00c6
            org.json.JSONObject r1 = r15.f73730b
            java.lang.String r2 = "eventName"
            boolean r1 = r1.has(r2)
            if (r1 == 0) goto L_0x002f
            org.json.JSONObject r1 = r15.f73730b
            java.lang.String r2 = "eventName"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "asyncGoodsSeedAnchorInfo"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x002f
            org.json.JSONObject r1 = r15.f73730b
            java.lang.String r2 = "data"
            boolean r1 = r1.has(r2)
            if (r1 == 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            r2 = 0
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            if (r0 != 0) goto L_0x0039
            goto L_0x00c6
        L_0x0039:
            org.json.JSONObject r0 = r15.f73730b     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "data"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "draft_id"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0076 }
            org.json.JSONObject r15 = r15.f73730b     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "data"
            org.json.JSONObject r15 = r15.getJSONObject(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "seed"
            org.json.JSONObject r15 = r15.getJSONObject(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "title"
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r3 = "seed_tag"
            java.lang.String r3 = r15.getString(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "seed_id"
            java.lang.String r2 = r15.getString(r2)     // Catch:{ Exception -> 0x0079 }
            r14.f107477c = r2     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "title"
            java.lang.String r15 = r15.getString(r2)     // Catch:{ Exception -> 0x0079 }
            r14.f107478d = r15     // Catch:{ Exception -> 0x0079 }
            goto L_0x0079
        L_0x0072:
            r3 = r2
            goto L_0x0079
        L_0x0074:
            r1 = r2
            goto L_0x0078
        L_0x0076:
            r0 = r2
            r1 = r0
        L_0x0078:
            r3 = r1
        L_0x0079:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r15 = r14.f107479e
            if (r15 != 0) goto L_0x0082
            java.lang.String r2 = "extensionMisc"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0082:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r15 = r15.getExtensionDataRepo()
            android.arch.lifecycle.o r15 = r15.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r2 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r4 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.SEEDING
            int r5 = r4.getTYPE()
            com.google.gson.e r4 = new com.google.gson.e
            r4.<init>()
            java.lang.String r6 = "shop_seeding_draft_id"
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = ""
        L_0x009d:
            kotlin.Pair r0 = kotlin.C7579l.m23633a(r6, r0)
            java.util.Map r0 = kotlin.collections.C7507ae.m23385a(r0)
            java.lang.String r6 = r4.mo15979b(r0)
            java.lang.String r0 = "Gson().toJson(mapOf(\n   …?: \"\")\n                ))"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = ""
        L_0x00b2:
            r7 = r1
            if (r3 != 0) goto L_0x00b7
            java.lang.String r3 = ""
        L_0x00b7:
            r8 = r3
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            r13 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.setValue(r2)
            return
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41244ae.onAsyncGoodsSeedInfoEvent(com.ss.android.ugc.aweme.fe.method.k):void");
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
        this.f107479e = extensionMisc;
        this.f107476a = m131852a(linearLayout);
        SeedingPublishSettingItem seedingPublishSettingItem = this.f107476a;
        if (seedingPublishSettingItem == null) {
            C7573i.m23583a("seedingPublishSettingItem");
        }
        if (m131856c()) {
            i = 0;
        } else {
            i = 8;
        }
        seedingPublishSettingItem.setVisibility(i);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41247c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41249d(this));
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.SEEDING.getTYPE()) {
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
                SeedingPublishSettingItem seedingPublishSettingItem2 = this.f107476a;
                if (seedingPublishSettingItem2 == null) {
                    C7573i.m23583a("seedingPublishSettingItem");
                }
                seedingPublishSettingItem2.setOnClickListener(new C41246b(this, extensionMisc));
            }
        }
    }
}
