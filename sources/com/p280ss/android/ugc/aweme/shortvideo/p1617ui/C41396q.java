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
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.MediumPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q */
public final class C41396q implements IAVPublishExtension<MediumPublishModel> {

    /* renamed from: a */
    public MediumPublishSettingItem f107710a;

    /* renamed from: b */
    private ExtensionMisc f107711b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q$a */
    static final class C41397a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107712a;

        /* renamed from: b */
        final /* synthetic */ C41396q f107713b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f107714c;

        C41397a(C24536e eVar, C41396q qVar, ExtensionMisc extensionMisc) {
            this.f107712a = eVar;
            this.f107713b = qVar;
            this.f107714c = extensionMisc;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C41396q.m131995a(this.f107713b).f107118j) {
                C41513aa.m132239a(C41396q.m131995a(this.f107713b).getContext());
                C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107712a.f64760a).f60753a);
            } else if (C7573i.m23585a((Object) (Boolean) this.f107714c.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107714c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107714c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107714c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C10761a.m31403c(C41396q.m131995a(this.f107713b).getContext(), C41396q.m131995a(this.f107713b).getContext().getString(R.string.e0d)).mo25750a();
            } else {
                C10761a.m31403c(C41396q.m131995a(this.f107713b).getContext(), C41396q.m131995a(this.f107713b).getContext().getString(R.string.aio, new Object[]{"影视综艺"})).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q$b */
    static final class C41398b<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41396q f107715a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107716b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q$b$a */
        static final class C41399a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107717a;

            /* renamed from: b */
            final /* synthetic */ C41398b f107718b;

            C41399a(AnchorTransData anchorTransData, C41398b bVar) {
                this.f107717a = anchorTransData;
                this.f107718b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m132003a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m132003a() {
                this.f107718b.f107715a.mo102023a(this.f107718b.f107716b);
            }
        }

        C41398b(C41396q qVar, ExtensionMisc extensionMisc) {
            this.f107715a = qVar;
            this.f107716b = extensionMisc;
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
                            C41396q.m131995a(this.f107715a).mo101634a();
                        } else {
                            MediumPublishSettingItem a = C41396q.m131995a(this.f107715a);
                            UrlModel urlModel = eVar.f64764e;
                            String title = anchorTransData.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            a.mo101635a(urlModel, title, new C41399a(anchorTransData, this));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.q$c */
    static final class C41400c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41396q f107719a;

        C41400c(C41396q qVar) {
            this.f107719a = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41396q qVar = this.f107719a;
                C7573i.m23582a((Object) bool, "it");
                qVar.mo102024a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "MediumPublishExtension";
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
    private static MediumPublishModel m131997b() {
        return new MediumPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131997b();
    }

    public final void onEnterChildrenMode() {
        MediumPublishSettingItem mediumPublishSettingItem = this.f107710a;
        if (mediumPublishSettingItem == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m131996a() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107711b;
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
        ExtensionMisc extensionMisc2 = this.f107711b;
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
                    if (eVar.f64760a == AnchorBusinessType.MEDIUM.getTYPE()) {
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
    public static final /* synthetic */ MediumPublishSettingItem m131995a(C41396q qVar) {
        MediumPublishSettingItem mediumPublishSettingItem = qVar.f107710a;
        if (mediumPublishSettingItem == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        return mediumPublishSettingItem;
    }

    /* renamed from: b */
    private final void m131998b(ExtensionMisc extensionMisc) {
        m131999c(extensionMisc);
        mo102024a(true);
    }

    /* renamed from: a */
    private static MediumPublishSettingItem m131994a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        C7573i.m23582a((Object) context, "container.context");
        MediumPublishSettingItem mediumPublishSettingItem = new MediumPublishSettingItem(context, null);
        linearLayout.addView(mediumPublishSettingItem, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        mediumPublishSettingItem.setGravity(16);
        mediumPublishSettingItem.setOrientation(0);
        mediumPublishSettingItem.setVisibility(8);
        return mediumPublishSettingItem;
    }

    /* renamed from: c */
    private final void m131999c(ExtensionMisc extensionMisc) {
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
        MediumPublishSettingItem mediumPublishSettingItem = this.f107710a;
        if (mediumPublishSettingItem == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem.mo101634a();
    }

    /* renamed from: a */
    public final void mo102023a(ExtensionMisc extensionMisc) {
        m131998b(extensionMisc);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* renamed from: a */
    public final void mo102024a(boolean z) {
        if (z) {
            MediumPublishSettingItem mediumPublishSettingItem = this.f107710a;
            if (mediumPublishSettingItem == null) {
                C7573i.m23583a("mediumPublishSettingItem");
            }
            mediumPublishSettingItem.setAlpha(1.0f);
            MediumPublishSettingItem mediumPublishSettingItem2 = this.f107710a;
            if (mediumPublishSettingItem2 == null) {
                C7573i.m23583a("mediumPublishSettingItem");
            }
            mediumPublishSettingItem2.setEnable(true);
            MediumPublishSettingItem mediumPublishSettingItem3 = this.f107710a;
            if (mediumPublishSettingItem3 == null) {
                C7573i.m23583a("mediumPublishSettingItem");
            }
            RemoteImageView leftDrawableView = mediumPublishSettingItem3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "mediumPublishSettingItem.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        MediumPublishSettingItem mediumPublishSettingItem4 = this.f107710a;
        if (mediumPublishSettingItem4 == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem4.setAlpha(0.5f);
        MediumPublishSettingItem mediumPublishSettingItem5 = this.f107710a;
        if (mediumPublishSettingItem5 == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        mediumPublishSettingItem5.setEnable(false);
        MediumPublishSettingItem mediumPublishSettingItem6 = this.f107710a;
        if (mediumPublishSettingItem6 == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        RemoteImageView leftDrawableView2 = mediumPublishSettingItem6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "mediumPublishSettingItem.leftDrawableView");
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
        this.f107711b = extensionMisc;
        this.f107710a = m131994a(linearLayout);
        MediumPublishSettingItem mediumPublishSettingItem = this.f107710a;
        if (mediumPublishSettingItem == null) {
            C7573i.m23583a("mediumPublishSettingItem");
        }
        if (m131996a()) {
            i = 0;
        } else {
            i = 8;
        }
        mediumPublishSettingItem.setVisibility(i);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41398b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41400c(this));
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.MEDIUM.getTYPE()) {
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
                MediumPublishSettingItem mediumPublishSettingItem2 = this.f107710a;
                if (mediumPublishSettingItem2 == null) {
                    C7573i.m23583a("mediumPublishSettingItem");
                }
                mediumPublishSettingItem2.setOnClickListener(new C41397a(eVar, this, extensionMisc));
            }
        }
    }
}
