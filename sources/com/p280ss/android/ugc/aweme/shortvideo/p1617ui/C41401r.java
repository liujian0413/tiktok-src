package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.commercialize.p1125f.C24672a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33337c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.MicroAppPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r */
public final class C41401r implements IAVPublishExtension<MicroAppPublishModel> {

    /* renamed from: a */
    public C24672a f107720a;

    /* renamed from: b */
    public Fragment f107721b;

    /* renamed from: c */
    public ExtensionMisc f107722c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r$a */
    static final class C41402a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107723a;

        /* renamed from: b */
        final /* synthetic */ C41401r f107724b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f107725c;

        C41402a(C24536e eVar, C41401r rVar, ExtensionMisc extensionMisc) {
            this.f107723a = eVar;
            this.f107724b = rVar;
            this.f107725c = extensionMisc;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107723a.f64760a).f60753a);
            if (C41401r.m132006a(this.f107724b).f107118j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f107725c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData == null || anchorTransData.getBusinessType() != AnchorBusinessType.MICRO_APP.getTYPE()) {
                    C33337c.m107792a(C41401r.m132006a(this.f107724b).getContext());
                    return;
                }
                C33471b a = new C33472a().mo85791b("publish_page").mo85792c("201017").mo85790a();
                C6600e eVar = new C6600e();
                AnchorTransData anchorTransData2 = (AnchorTransData) this.f107725c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData2 != null) {
                    str = anchorTransData2.getAnchorContent();
                } else {
                    str = null;
                }
                MicroAppModel microAppModel = (MicroAppModel) eVar.mo15974a(str, MicroAppModel.class);
                C7167b b = C7167b.m22380b();
                C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
                IMiniAppService a2 = b.mo18647a();
                C7573i.m23582a((Object) microAppModel, "microAppModel");
                a2.openMiniApp(C41401r.m132006a(this.f107724b).getContext(), a2.setLaunchModeHostTask(a2.addScene(microAppModel.getSchema(), "201017")), a);
            } else if (C7573i.m23585a((Object) (Boolean) this.f107725c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107725c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107725c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107725c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10761a.m31403c(C41401r.m132006a(this.f107724b).getContext(), C41401r.m132006a(this.f107724b).getContext().getString(R.string.e0d)).mo25750a();
            } else {
                C10761a.m31403c(C41401r.m132006a(this.f107724b).getContext(), C41401r.m132006a(this.f107724b).getContext().getString(R.string.aio, new Object[]{C41401r.m132006a(this.f107724b).getContext().getString(R.string.akt)})).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r$b */
    static final class C41403b<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41401r f107726a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107727b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r$b$a */
        static final class C41404a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107728a;

            /* renamed from: b */
            final /* synthetic */ C41403b f107729b;

            C41404a(AnchorTransData anchorTransData, C41403b bVar) {
                this.f107728a = anchorTransData;
                this.f107729b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m132014a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m132014a() {
                this.f107729b.f107726a.mo102026a(this.f107729b.f107727b);
            }
        }

        C41403b(C41401r rVar, ExtensionMisc extensionMisc) {
            this.f107726a = rVar;
            this.f107727b = extensionMisc;
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
                        Integer source = anchorTransData.getSource();
                        if (source != null && source.intValue() == 4) {
                            C41401r.m132006a(this.f107726a).mo64540a();
                        } else {
                            C24672a a = C41401r.m132006a(this.f107726a);
                            UrlModel anchorIcon = anchorTransData.getAnchorIcon();
                            if (anchorIcon == null) {
                                anchorIcon = eVar.f64764e;
                            }
                            String title = anchorTransData.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            a.mo64541a(anchorIcon, title, new C41404a(anchorTransData, this));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.r$c */
    static final class C41405c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41401r f107730a;

        C41405c(C41401r rVar) {
            this.f107730a = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41401r rVar = this.f107730a;
                C7573i.m23582a((Object) bool, "it");
                rVar.mo102027a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "MicroAppPublishExtension";
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
    private static MicroAppPublishModel m132008b() {
        return new MicroAppPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m132008b();
    }

    public final void onEnterChildrenMode() {
        C24672a aVar = this.f107720a;
        if (aVar == null) {
            C7573i.m23583a("delegate");
        }
        aVar.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m132007a() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107722c;
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
        ExtensionMisc extensionMisc2 = this.f107722c;
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
                    if (eVar.f64760a == AnchorBusinessType.MICRO_APP.getTYPE()) {
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

    /* renamed from: c */
    private final void m132010c(ExtensionMisc extensionMisc) {
        m132009b(extensionMisc);
        mo102027a(true);
    }

    /* renamed from: a */
    public static final /* synthetic */ C24672a m132006a(C41401r rVar) {
        C24672a aVar = rVar.f107720a;
        if (aVar == null) {
            C7573i.m23583a("delegate");
        }
        return aVar;
    }

    /* renamed from: a */
    private static C24672a m132005a(LinearLayout linearLayout) {
        C24672a aVar = new C24672a(linearLayout.getContext());
        linearLayout.addView(aVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        aVar.setGravity(16);
        aVar.setOrientation(0);
        aVar.setVisibility(8);
        return aVar;
    }

    /* renamed from: b */
    private final void m132009b(ExtensionMisc extensionMisc) {
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
        C24672a aVar = this.f107720a;
        if (aVar == null) {
            C7573i.m23583a("delegate");
        }
        aVar.mo64540a();
    }

    /* renamed from: a */
    public final void mo102026a(ExtensionMisc extensionMisc) {
        m132010c(extensionMisc);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* renamed from: a */
    public final void mo102027a(boolean z) {
        if (z) {
            C24672a aVar = this.f107720a;
            if (aVar == null) {
                C7573i.m23583a("delegate");
            }
            aVar.setAlpha(1.0f);
            C24672a aVar2 = this.f107720a;
            if (aVar2 == null) {
                C7573i.m23583a("delegate");
            }
            aVar2.setEnable(true);
            C24672a aVar3 = this.f107720a;
            if (aVar3 == null) {
                C7573i.m23583a("delegate");
            }
            RemoteImageView leftDrawableView = aVar3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C24672a aVar4 = this.f107720a;
        if (aVar4 == null) {
            C7573i.m23583a("delegate");
        }
        aVar4.setAlpha(0.5f);
        C24672a aVar5 = this.f107720a;
        if (aVar5 == null) {
            C7573i.m23583a("delegate");
        }
        aVar5.setEnable(false);
        C24672a aVar6 = this.f107720a;
        if (aVar6 == null) {
            C7573i.m23583a("delegate");
        }
        RemoteImageView leftDrawableView2 = aVar6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "delegate.leftDrawableView");
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
        this.f107722c = extensionMisc;
        this.f107721b = fragment;
        this.f107720a = m132005a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41403b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41405c(this));
        C24672a aVar = this.f107720a;
        if (aVar == null) {
            C7573i.m23583a("delegate");
        }
        if (m132007a()) {
            i = 0;
        } else {
            i = 8;
        }
        aVar.setVisibility(i);
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.MICRO_APP.getTYPE()) {
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
                C24672a aVar2 = this.f107720a;
                if (aVar2 == null) {
                    C7573i.m23583a("delegate");
                }
                aVar2.setOnClickListener(new C41402a(eVar, this, extensionMisc));
            }
        }
    }
}
