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
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.commercialize.p1125f.C24674b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PostPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v */
public final class C41423v implements IAVPublishExtension<PostPublishModel> {

    /* renamed from: a */
    public C24674b f107769a;

    /* renamed from: b */
    private Fragment f107770b;

    /* renamed from: c */
    private ExtensionMisc f107771c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$a */
    static final class C41424a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107772a;

        /* renamed from: b */
        final /* synthetic */ C41423v f107773b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f107774c;

        /* renamed from: d */
        final /* synthetic */ Fragment f107775d;

        C41424a(C24536e eVar, C41423v vVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f107772a = eVar;
            this.f107773b = vVar;
            this.f107774c = extensionMisc;
            this.f107775d = fragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107772a.f64760a).f60753a);
            boolean z = false;
            if (C41423v.m132056a(this.f107773b).f107118j) {
                AnchorTransData anchorTransData = (AnchorTransData) this.f107774c.getExtensionDataRepo().getUpdateAnchor().getValue();
                if (anchorTransData != null) {
                    if (anchorTransData.getBusinessType() == AnchorBusinessType.ARTICLE.getTYPE()) {
                        z = true;
                    }
                    if (!z) {
                        anchorTransData = null;
                    }
                    if (anchorTransData != null) {
                        C24523a.m80528a(this.f107775d.getContext(), C24523a.m80527a(anchorTransData.getAnchorContent()));
                        return;
                    }
                }
                C24523a.m80529a(this.f107775d.getContext(), this.f107772a.f64763d);
            } else if (C7573i.m23585a((Object) (Boolean) this.f107774c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107774c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107774c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107774c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C9738o.m28697a(C41423v.m132056a(this.f107773b).getContext(), C41423v.m132056a(this.f107773b).getContext().getString(R.string.e0d));
            } else {
                C9738o.m28697a(C41423v.m132056a(this.f107773b).getContext(), C41423v.m132056a(this.f107773b).getContext().getString(R.string.aio, new Object[]{C41423v.m132056a(this.f107773b).getContext().getString(R.string.akw)}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$b */
    static final class C41425b<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41423v f107776a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107777b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$b$a */
        static final class C41426a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107778a;

            /* renamed from: b */
            final /* synthetic */ C41425b f107779b;

            C41426a(AnchorTransData anchorTransData, C41425b bVar) {
                this.f107778a = anchorTransData;
                this.f107779b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m132063a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m132063a() {
                this.f107779b.f107776a.mo102048a(this.f107779b.f107777b);
                this.f107779b.f107777b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f107779b.f107777b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f107779b.f107777b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            }
        }

        C41425b(C41423v vVar, ExtensionMisc extensionMisc) {
            this.f107776a = vVar;
            this.f107777b = extensionMisc;
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
                        C24674b a = C41423v.m132056a(this.f107776a);
                        UrlModel urlModel = eVar.f64764e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        a.mo64544a(urlModel, title, new C41426a(anchorTransData, this));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.v$c */
    static final class C41427c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41423v f107780a;

        C41427c(C41423v vVar) {
            this.f107780a = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41423v vVar = this.f107780a;
                C7573i.m23582a((Object) bool, "it");
                vVar.mo102049a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "PostPublishExtension";
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
    private static PostPublishModel m132058b() {
        return new PostPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m132058b();
    }

    public final void onEnterChildrenMode() {
        C24674b bVar = this.f107769a;
        if (bVar == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        bVar.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m132057a() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107771c;
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
        ExtensionMisc extensionMisc2 = this.f107771c;
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
                    if (eVar.f64760a == AnchorBusinessType.ARTICLE.getTYPE()) {
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
    public final void mo102048a(ExtensionMisc extensionMisc) {
        m132059b(extensionMisc);
        mo102049a(true);
    }

    /* renamed from: a */
    public static final /* synthetic */ C24674b m132056a(C41423v vVar) {
        C24674b bVar = vVar.f107769a;
        if (bVar == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        return bVar;
    }

    /* renamed from: a */
    private static C24674b m132055a(LinearLayout linearLayout) {
        C24674b bVar = new C24674b(linearLayout.getContext());
        linearLayout.addView(bVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        bVar.setGravity(16);
        bVar.setOrientation(0);
        bVar.setVisibility(8);
        return bVar;
    }

    /* renamed from: b */
    private final void m132059b(ExtensionMisc extensionMisc) {
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
        C24674b bVar = this.f107769a;
        if (bVar == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        bVar.mo64543a();
    }

    /* renamed from: a */
    public final void mo102049a(boolean z) {
        if (z) {
            C24674b bVar = this.f107769a;
            if (bVar == null) {
                C7573i.m23583a("postPublishSettingItem");
            }
            bVar.setAlpha(1.0f);
            C24674b bVar2 = this.f107769a;
            if (bVar2 == null) {
                C7573i.m23583a("postPublishSettingItem");
            }
            bVar2.setEnable(true);
            C24674b bVar3 = this.f107769a;
            if (bVar3 == null) {
                C7573i.m23583a("postPublishSettingItem");
            }
            RemoteImageView leftDrawableView = bVar3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "postPublishSettingItem.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C24674b bVar4 = this.f107769a;
        if (bVar4 == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        bVar4.setAlpha(0.5f);
        C24674b bVar5 = this.f107769a;
        if (bVar5 == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        bVar5.setEnable(false);
        C24674b bVar6 = this.f107769a;
        if (bVar6 == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        RemoteImageView leftDrawableView2 = bVar6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "postPublishSettingItem.leftDrawableView");
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
        this.f107770b = fragment;
        this.f107771c = extensionMisc;
        this.f107769a = m132055a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41425b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41427c(this));
        C24674b bVar = this.f107769a;
        if (bVar == null) {
            C7573i.m23583a("postPublishSettingItem");
        }
        if (m132057a()) {
            i = 0;
        } else {
            i = 8;
        }
        bVar.setVisibility(i);
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.ARTICLE.getTYPE()) {
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
                C24674b bVar2 = this.f107769a;
                if (bVar2 == null) {
                    C7573i.m23583a("postPublishSettingItem");
                }
                bVar2.setOnClickListener(new C41424a(eVar, this, extensionMisc, fragment));
            }
        }
    }
}
