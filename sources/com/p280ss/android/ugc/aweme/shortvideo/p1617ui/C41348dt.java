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
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.services.publish.WikiPublishModel;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt */
public final class C41348dt implements IAVPublishExtension<WikiPublishModel> {

    /* renamed from: a */
    public C41353du f107622a;

    /* renamed from: b */
    public ExtensionMisc f107623b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt$a */
    static final class C41349a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107624a;

        /* renamed from: b */
        final /* synthetic */ C41348dt f107625b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107626c;

        /* renamed from: d */
        final /* synthetic */ ExtensionMisc f107627d;

        C41349a(C24536e eVar, C41348dt dtVar, Fragment fragment, ExtensionMisc extensionMisc) {
            this.f107624a = eVar;
            this.f107625b = dtVar;
            this.f107626c = fragment;
            this.f107627d = extensionMisc;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107624a.f64760a).f60753a);
            if (this.f107625b.mo101989a().f107118j) {
                if (this.f107624a.f64760a == AnchorBusinessType.WIKIPEDIA.getTYPE()) {
                    Context context = this.f107625b.mo101989a().getContext();
                    C7573i.m23582a((Object) context, "delegate.context");
                    String str2 = this.f107624a.f64763d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = C7579l.m23633a("title", this.f107626c.getString(R.string.akx));
                    String str3 = "shoot_way";
                    String shootWay = this.f107627d.getMobParam().getShootWay();
                    if (shootWay == null) {
                        shootWay = "";
                    }
                    pairArr[1] = C7579l.m23633a(str3, shootWay);
                    String str4 = "creation_id";
                    String creationId = this.f107627d.getMobParam().getCreationId();
                    if (creationId == null) {
                        creationId = "";
                    }
                    pairArr[2] = C7579l.m23633a(str4, creationId);
                    pairArr[3] = C7579l.m23633a("show_keyboard", "true");
                    C43558a.m138079a(context, str2, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr));
                    return;
                }
                if (this.f107624a.f64760a == AnchorBusinessType.YELP.getTYPE()) {
                    str = "Yelp";
                } else {
                    str = "TripAdvisor";
                }
                Context context2 = this.f107625b.mo101989a().getContext();
                C7573i.m23582a((Object) context2, "delegate.context");
                String str5 = this.f107624a.f64763d;
                if (str5 == null) {
                    str5 = "";
                }
                Pair[] pairArr2 = new Pair[6];
                pairArr2[0] = C7579l.m23633a("title", this.f107626c.getString(R.string.akx));
                String str6 = "shoot_way";
                String shootWay2 = this.f107627d.getMobParam().getShootWay();
                if (shootWay2 == null) {
                    shootWay2 = "";
                }
                pairArr2[1] = C7579l.m23633a(str6, shootWay2);
                String str7 = "creation_id";
                String creationId2 = this.f107627d.getMobParam().getCreationId();
                if (creationId2 == null) {
                    creationId2 = "";
                }
                pairArr2[2] = C7579l.m23633a(str7, creationId2);
                pairArr2[3] = C7579l.m23633a("host_filter", "true");
                pairArr2[4] = C7579l.m23633a("anchor_type", str);
                pairArr2[5] = C7579l.m23633a("addButton", "true");
                C43558a.m138079a(context2, str5, C7507ae.m23393a((Pair<? extends K, ? extends V>[]) pairArr2));
            } else if (C7573i.m23585a((Object) (Boolean) this.f107627d.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107627d.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107627d.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107627d.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                C9738o.m28697a(this.f107625b.mo101989a().getContext(), this.f107625b.mo101989a().getContext().getString(R.string.e0d));
            } else {
                C9738o.m28697a(this.f107625b.mo101989a().getContext(), this.f107625b.mo101989a().getContext().getString(R.string.aio, new Object[]{this.f107625b.mo101989a().getContext().getString(R.string.akx)}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt$b */
    static final class C41350b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41348dt f107628a;

        C41350b(C41348dt dtVar) {
            this.f107628a = dtVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41348dt dtVar = this.f107628a;
                C7573i.m23582a((Object) bool, "it");
                dtVar.mo101991a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt$c */
    static final class C41351c<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41348dt f107629a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107630b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt$c$a */
        static final class C41352a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C24536e f107631a;

            /* renamed from: b */
            final /* synthetic */ AnchorTransData f107632b;

            /* renamed from: c */
            final /* synthetic */ C41351c f107633c;

            C41352a(C24536e eVar, AnchorTransData anchorTransData, C41351c cVar) {
                this.f107631a = eVar;
                this.f107632b = anchorTransData;
                this.f107633c = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131918a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131918a() {
                if (!this.f107633c.f107629a.mo101989a().f107118j) {
                    C9738o.m28697a(this.f107633c.f107629a.mo101989a().getContext(), this.f107633c.f107629a.mo101989a().getContext().getString(R.string.aio, new Object[]{this.f107633c.f107629a.mo101989a().getContext().getString(R.string.akx)}));
                    return;
                }
                C6907h.m21524a("delete_label", (Map) new C22984d().mo59973a("enter_from", "video_publish_page").mo59973a("shoot_way", this.f107633c.f107630b.getMobParam().getShootWay()).mo59973a("creation_id", this.f107633c.f107630b.getMobParam().getCreationId()).mo59970a("business_type", this.f107631a.f64760a).f60753a);
                this.f107633c.f107629a.mo101990a(this.f107633c.f107630b);
                this.f107633c.f107630b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f107633c.f107630b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f107633c.f107630b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            }
        }

        C41351c(C41348dt dtVar, ExtensionMisc extensionMisc) {
            this.f107629a = dtVar;
            this.f107630b = extensionMisc;
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
                        C41353du a = this.f107629a.mo101989a();
                        UrlModel urlModel = eVar.f64764e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        a.mo101994a(urlModel, title, new C41352a(eVar, anchorTransData, this));
                    }
                }
            }
        }
    }

    public final String getName() {
        return "WikiPublishExtension";
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

    /* renamed from: c */
    private static WikiPublishModel m131912c() {
        return new WikiPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131912c();
    }

    /* renamed from: a */
    public final C41353du mo101989a() {
        C41353du duVar = this.f107622a;
        if (duVar == null) {
            C7573i.m23583a("delegate");
        }
        return duVar;
    }

    public final void onEnterChildrenMode() {
        C41353du duVar = this.f107622a;
        if (duVar == null) {
            C7573i.m23583a("delegate");
        }
        duVar.setVisibility(8);
    }

    /* renamed from: b */
    private final boolean m131911b() {
        String str;
        boolean z;
        ExtensionMisc extensionMisc = this.f107623b;
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
        ExtensionMisc extensionMisc2 = this.f107623b;
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
                    if (eVar.f64760a == AnchorBusinessType.WIKIPEDIA.getTYPE() || eVar.f64760a == AnchorBusinessType.YELP.getTYPE() || eVar.f64760a == AnchorBusinessType.TRIP_ADVISOR.getTYPE()) {
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
    public final void mo101990a(ExtensionMisc extensionMisc) {
        m131910b(extensionMisc);
        mo101991a(true);
    }

    /* renamed from: a */
    private static C41353du m131909a(LinearLayout linearLayout) {
        C41353du duVar = new C41353du(linearLayout.getContext());
        linearLayout.addView(duVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        duVar.setGravity(16);
        duVar.setOrientation(0);
        duVar.setVisibility(8);
        return duVar;
    }

    /* renamed from: b */
    private final void m131910b(ExtensionMisc extensionMisc) {
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
        C41353du duVar = this.f107622a;
        if (duVar == null) {
            C7573i.m23583a("delegate");
        }
        duVar.mo101993a();
    }

    /* renamed from: a */
    public final void mo101991a(boolean z) {
        if (z) {
            C41353du duVar = this.f107622a;
            if (duVar == null) {
                C7573i.m23583a("delegate");
            }
            duVar.setAlpha(1.0f);
            C41353du duVar2 = this.f107622a;
            if (duVar2 == null) {
                C7573i.m23583a("delegate");
            }
            duVar2.setEnable(true);
            C41353du duVar3 = this.f107622a;
            if (duVar3 == null) {
                C7573i.m23583a("delegate");
            }
            RemoteImageView leftDrawableView = duVar3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C41353du duVar4 = this.f107622a;
        if (duVar4 == null) {
            C7573i.m23583a("delegate");
        }
        duVar4.setAlpha(0.5f);
        C41353du duVar5 = this.f107622a;
        if (duVar5 == null) {
            C7573i.m23583a("delegate");
        }
        duVar5.setEnable(false);
        C41353du duVar6 = this.f107622a;
        if (duVar6 == null) {
            C7573i.m23583a("delegate");
        }
        RemoteImageView leftDrawableView2 = duVar6.getLeftDrawableView();
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
        this.f107623b = extensionMisc;
        this.f107622a = m131909a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41350b(this));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41351c(this, extensionMisc));
        C41353du duVar = this.f107622a;
        if (duVar == null) {
            C7573i.m23583a("delegate");
        }
        if (m131911b()) {
            i = 0;
        } else {
            i = 8;
        }
        duVar.setVisibility(i);
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C24536e eVar = (C24536e) obj;
                if (eVar.f64760a == AnchorBusinessType.WIKIPEDIA.getTYPE() || eVar.f64760a == AnchorBusinessType.YELP.getTYPE() || eVar.f64760a == AnchorBusinessType.TRIP_ADVISOR.getTYPE()) {
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
            C24536e eVar2 = (C24536e) obj;
            if (eVar2 != null) {
                C41353du duVar2 = this.f107622a;
                if (duVar2 == null) {
                    C7573i.m23583a("delegate");
                }
                duVar2.setOnClickListener(new C41349a(eVar2, this, fragment, extensionMisc));
            }
        }
    }
}
