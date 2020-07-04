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
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.GamePublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i */
public final class C41364i implements IAVPublishExtension<GamePublishModel> {

    /* renamed from: d */
    public static final C41365a f107649d = new C41365a(null);

    /* renamed from: a */
    public C41370j f107650a;

    /* renamed from: b */
    public Fragment f107651b;

    /* renamed from: c */
    public ExtensionMisc f107652c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i$a */
    public static final class C41365a {
        private C41365a() {
        }

        public /* synthetic */ C41365a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i$b */
    static final class C41366b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107653a;

        /* renamed from: b */
        final /* synthetic */ C41364i f107654b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f107655c;

        C41366b(C24536e eVar, C41364i iVar, ExtensionMisc extensionMisc) {
            this.f107653a = eVar;
            this.f107654b = iVar;
            this.f107655c = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107653a.f64760a).f60753a);
            if (C41364i.m131942a(this.f107654b).f107118j) {
                C33336b.m107785a(C41364i.m131942a(this.f107654b).getContext());
            } else if (C7573i.m23585a((Object) (Boolean) this.f107655c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107655c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107655c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107655c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10761a.m31403c(C41364i.m131942a(this.f107654b).getContext(), C41364i.m131942a(this.f107654b).getContext().getString(R.string.e0d)).mo25750a();
            } else {
                C10761a.m31403c(C41364i.m131942a(this.f107654b).getContext(), C41364i.m131942a(this.f107654b).getContext().getString(R.string.aio, new Object[]{C41364i.m131942a(this.f107654b).getContext().getString(R.string.aks)})).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i$c */
    static final class C41367c<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41364i f107656a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107657b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i$c$a */
        static final class C41368a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107658a;

            /* renamed from: b */
            final /* synthetic */ C41367c f107659b;

            C41368a(AnchorTransData anchorTransData, C41367c cVar) {
                this.f107658a = anchorTransData;
                this.f107659b = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131949a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131949a() {
                this.f107659b.f107656a.mo102001a(this.f107659b.f107657b);
            }
        }

        C41367c(C41364i iVar, ExtensionMisc extensionMisc) {
            this.f107656a = iVar;
            this.f107657b = extensionMisc;
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
                            C41364i.m131942a(this.f107656a).mo102004a();
                        } else {
                            C41370j a = C41364i.m131942a(this.f107656a);
                            UrlModel urlModel = eVar.f64764e;
                            String title = anchorTransData.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            a.mo102005a(urlModel, title, new C41368a(anchorTransData, this));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.i$d */
    static final class C41369d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41364i f107660a;

        C41369d(C41364i iVar) {
            this.f107660a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41364i iVar = this.f107660a;
                C7573i.m23582a((Object) bool, "it");
                iVar.mo102002a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "GamePublishExtension";
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

    /* renamed from: a */
    private static GamePublishModel m131940a() {
        return new GamePublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131940a();
    }

    public final void onEnterChildrenMode() {
        C41370j jVar = this.f107650a;
        if (jVar == null) {
            C7573i.m23583a("delegate");
        }
        jVar.setVisibility(8);
    }

    /* renamed from: b */
    private final boolean m131944b() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107652c;
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
        ExtensionMisc extensionMisc2 = this.f107652c;
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
                    if (eVar.f64760a == AnchorBusinessType.GAME.getTYPE()) {
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
    private final void m131945c(ExtensionMisc extensionMisc) {
        m131943b(extensionMisc);
        mo102002a(true);
    }

    /* renamed from: a */
    public static final /* synthetic */ C41370j m131942a(C41364i iVar) {
        C41370j jVar = iVar.f107650a;
        if (jVar == null) {
            C7573i.m23583a("delegate");
        }
        return jVar;
    }

    /* renamed from: a */
    private static C41370j m131941a(LinearLayout linearLayout) {
        C41370j jVar = new C41370j(linearLayout.getContext());
        linearLayout.addView(jVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        jVar.setGravity(16);
        jVar.setOrientation(0);
        jVar.setVisibility(8);
        return jVar;
    }

    /* renamed from: b */
    private final void m131943b(ExtensionMisc extensionMisc) {
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
        C41370j jVar = this.f107650a;
        if (jVar == null) {
            C7573i.m23583a("delegate");
        }
        jVar.mo102004a();
    }

    /* renamed from: a */
    public final void mo102001a(ExtensionMisc extensionMisc) {
        m131945c(extensionMisc);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* renamed from: a */
    public final void mo102002a(boolean z) {
        if (z) {
            C41370j jVar = this.f107650a;
            if (jVar == null) {
                C7573i.m23583a("delegate");
            }
            jVar.setAlpha(1.0f);
            C41370j jVar2 = this.f107650a;
            if (jVar2 == null) {
                C7573i.m23583a("delegate");
            }
            jVar2.setEnable(true);
            C41370j jVar3 = this.f107650a;
            if (jVar3 == null) {
                C7573i.m23583a("delegate");
            }
            RemoteImageView leftDrawableView = jVar3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C41370j jVar4 = this.f107650a;
        if (jVar4 == null) {
            C7573i.m23583a("delegate");
        }
        jVar4.setAlpha(0.5f);
        C41370j jVar5 = this.f107650a;
        if (jVar5 == null) {
            C7573i.m23583a("delegate");
        }
        jVar5.setEnable(false);
        C41370j jVar6 = this.f107650a;
        if (jVar6 == null) {
            C7573i.m23583a("delegate");
        }
        RemoteImageView leftDrawableView2 = jVar6.getLeftDrawableView();
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
        this.f107652c = extensionMisc;
        this.f107651b = fragment;
        this.f107650a = m131941a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41367c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41369d(this));
        C41370j jVar = this.f107650a;
        if (jVar == null) {
            C7573i.m23583a("delegate");
        }
        if (m131944b()) {
            i = 0;
        } else {
            i = 8;
        }
        jVar.setVisibility(i);
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.GAME.getTYPE()) {
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
                C41370j jVar2 = this.f107650a;
                if (jVar2 == null) {
                    C7573i.m23583a("delegate");
                }
                jVar2.setOnClickListener(new C41366b(eVar, this, extensionMisc));
            }
        }
    }
}
