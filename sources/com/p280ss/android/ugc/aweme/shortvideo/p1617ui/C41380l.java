package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
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
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.I18nShopPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41519ae;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l */
public final class C41380l implements IAVPublishExtension<I18nShopPublishModel> {

    /* renamed from: a */
    public I18nShopPublishSettingItem f107677a;

    /* renamed from: b */
    public MentionEditText f107678b;

    /* renamed from: c */
    public Context f107679c;

    /* renamed from: d */
    private Fragment f107680d;

    /* renamed from: e */
    private ExtensionMisc f107681e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$a */
    static final class C41381a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f107682a;

        /* renamed from: b */
        final /* synthetic */ C41380l f107683b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107684c;

        /* renamed from: d */
        final /* synthetic */ ExtensionMisc f107685d;

        /* renamed from: e */
        final /* synthetic */ AVPublishContentType f107686e;

        /* renamed from: f */
        final /* synthetic */ PublishOutput f107687f;

        C41381a(C24536e eVar, C41380l lVar, Fragment fragment, ExtensionMisc extensionMisc, AVPublishContentType aVPublishContentType, PublishOutput publishOutput) {
            this.f107682a = eVar;
            this.f107683b = lVar;
            this.f107684c = fragment;
            this.f107685d = extensionMisc;
            this.f107686e = aVPublishContentType;
            this.f107687f = publishOutput;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("add_label", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59970a("business_type", this.f107682a.f64760a).f60753a);
            if (C41380l.m131971a(this.f107683b).f107118j) {
                if (this.f107682a.f64763d != null) {
                    String uri = C33786f.m108941a(this.f107682a.f64763d).mo86195a("need_bottom_out", "1").mo86194a().toString();
                    C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…              .toString()");
                    C7195s.m22438a().mo18679a((Activity) this.f107684c.getActivity(), uri);
                }
                return;
            }
            if ((!C7573i.m23585a((Object) (Boolean) this.f107685d.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true))) || (!C7573i.m23585a((Object) (Boolean) this.f107685d.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true)))) {
                if (!C6399b.m19944t() || !C23764b.m77913a(this.f107687f.getMusicId()) || this.f107686e != AVPublishContentType.Video || this.f107687f.isCommercialMusic() || this.f107687f.isOriginalSound()) {
                    C9738o.m28697a(C41380l.m131971a(this.f107683b).getContext(), C41380l.m131971a(this.f107683b).getContext().getString(R.string.a3k));
                } else {
                    C9738o.m28697a(C41380l.m131971a(this.f107683b).getContext(), C41380l.m131971a(this.f107683b).getContext().getString(R.string.bzi));
                }
            }
            if (C7573i.m23585a((Object) (Boolean) this.f107685d.getExtensionDataRepo().getAnchorState().getValue(), (Object) Boolean.valueOf(false))) {
                C9738o.m28697a(C41380l.m131971a(this.f107683b).getContext(), C41380l.m131971a(this.f107683b).getContext().getString(R.string.aio, new Object[]{C41380l.m131971a(this.f107683b).getContext().getString(R.string.a3l)}));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$b */
    static final class C41382b<T> implements C0053p<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C41380l f107688a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107689b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$b$a */
        static final class C41383a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f107690a;

            /* renamed from: b */
            final /* synthetic */ C41382b f107691b;

            C41383a(AnchorTransData anchorTransData, C41382b bVar) {
                this.f107690a = anchorTransData;
                this.f107691b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m131978a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m131978a() {
                if (C41380l.m131971a(this.f107691b.f107688a).getVisibility() == 0) {
                    C41519ae.m132255a(this.f107691b.f107688a.f107678b);
                }
                this.f107691b.f107688a.mo102015a(this.f107691b.f107689b);
                this.f107691b.f107689b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
                this.f107691b.f107689b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
                this.f107691b.f107689b.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            }
        }

        C41382b(C41380l lVar, ExtensionMisc extensionMisc) {
            this.f107688a = lVar;
            this.f107689b = extensionMisc;
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
                        I18nShopPublishSettingItem a = C41380l.m131971a(this.f107688a);
                        UrlModel urlModel = eVar.f64764e;
                        String title = anchorTransData.getTitle();
                        if (title == null) {
                            title = "";
                        }
                        a.mo101619a(urlModel, title, new C41383a(anchorTransData, this));
                        if (C41380l.m131971a(this.f107688a).getVisibility() == 0) {
                            C41519ae.m132254a(this.f107688a.f107679c, this.f107688a.f107678b, eVar.f64769j);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$c */
    static final class C41384c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41380l f107692a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107693b;

        C41384c(C41380l lVar, ExtensionMisc extensionMisc) {
            this.f107692a = lVar;
            this.f107693b = extensionMisc;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                if (!bool.booleanValue() || !C7573i.m23585a((Object) (Boolean) this.f107693b.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107693b.getExtensionDataRepo().getAnchorState().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107693b.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true))) {
                    this.f107692a.mo102016a(false);
                    return;
                }
                this.f107692a.mo102016a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$d */
    static final class C41385d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41380l f107694a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107695b;

        C41385d(C41380l lVar, ExtensionMisc extensionMisc) {
            this.f107694a = lVar;
            this.f107695b = extensionMisc;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                if (!bool.booleanValue() || !C7573i.m23585a((Object) (Boolean) this.f107695b.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107695b.getExtensionDataRepo().getAnchorState().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107695b.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true))) {
                    this.f107694a.mo102016a(false);
                    return;
                }
                this.f107694a.mo102016a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.l$e */
    static final class C41386e<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41380l f107696a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107697b;

        C41386e(C41380l lVar, ExtensionMisc extensionMisc) {
            this.f107696a = lVar;
            this.f107697b = extensionMisc;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                if (!bool.booleanValue() || !C7573i.m23585a((Object) (Boolean) this.f107697b.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107697b.getExtensionDataRepo().getAnchorState().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f107697b.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true))) {
                    this.f107696a.mo102016a(false);
                    return;
                }
                this.f107696a.mo102016a(true);
            }
        }
    }

    public final String getName() {
        return "I18nShopPublishExtension";
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
    private static I18nShopPublishModel m131973b() {
        return new I18nShopPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131973b();
    }

    public final void onEnterChildrenMode() {
        I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f107677a;
        if (i18nShopPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        i18nShopPublishSettingItem.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m131972a() {
        boolean z;
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null && b.size() <= 1) {
            Iterable<C24536e> iterable = b;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C24536e eVar : iterable) {
                    if (eVar.f64760a == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
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
    public final void mo102015a(ExtensionMisc extensionMisc) {
        m131974b(extensionMisc);
        mo102016a(true);
    }

    /* renamed from: a */
    public static final /* synthetic */ I18nShopPublishSettingItem m131971a(C41380l lVar) {
        I18nShopPublishSettingItem i18nShopPublishSettingItem = lVar.f107677a;
        if (i18nShopPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        return i18nShopPublishSettingItem;
    }

    /* renamed from: a */
    private static I18nShopPublishSettingItem m131970a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        C7573i.m23582a((Object) context, "container.context");
        I18nShopPublishSettingItem i18nShopPublishSettingItem = new I18nShopPublishSettingItem(context, null, 0, 6, null);
        linearLayout.addView(i18nShopPublishSettingItem, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        i18nShopPublishSettingItem.setGravity(16);
        i18nShopPublishSettingItem.setOrientation(0);
        i18nShopPublishSettingItem.setVisibility(8);
        return i18nShopPublishSettingItem;
    }

    /* renamed from: b */
    private final void m131974b(ExtensionMisc extensionMisc) {
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
        I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f107677a;
        if (i18nShopPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        i18nShopPublishSettingItem.mo101618a();
    }

    /* renamed from: a */
    public final void mo102016a(boolean z) {
        if (z) {
            I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f107677a;
            if (i18nShopPublishSettingItem == null) {
                C7573i.m23583a("delegate");
            }
            i18nShopPublishSettingItem.setAlpha(1.0f);
            I18nShopPublishSettingItem i18nShopPublishSettingItem2 = this.f107677a;
            if (i18nShopPublishSettingItem2 == null) {
                C7573i.m23583a("delegate");
            }
            i18nShopPublishSettingItem2.setEnable(true);
            I18nShopPublishSettingItem i18nShopPublishSettingItem3 = this.f107677a;
            if (i18nShopPublishSettingItem3 == null) {
                C7573i.m23583a("delegate");
            }
            RemoteImageView leftDrawableView = i18nShopPublishSettingItem3.getLeftDrawableView();
            C7573i.m23582a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        I18nShopPublishSettingItem i18nShopPublishSettingItem4 = this.f107677a;
        if (i18nShopPublishSettingItem4 == null) {
            C7573i.m23583a("delegate");
        }
        i18nShopPublishSettingItem4.setAlpha(0.5f);
        I18nShopPublishSettingItem i18nShopPublishSettingItem5 = this.f107677a;
        if (i18nShopPublishSettingItem5 == null) {
            C7573i.m23583a("delegate");
        }
        i18nShopPublishSettingItem5.setEnable(false);
        I18nShopPublishSettingItem i18nShopPublishSettingItem6 = this.f107677a;
        if (i18nShopPublishSettingItem6 == null) {
            C7573i.m23583a("delegate");
        }
        RemoteImageView leftDrawableView2 = i18nShopPublishSettingItem6.getLeftDrawableView();
        C7573i.m23582a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        MentionEditText mentionEditText;
        int i;
        Object obj;
        boolean z;
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f107680d = fragment;
        this.f107679c = fragment.getContext();
        View view = fragment.getView();
        if (view != null) {
            mentionEditText = (MentionEditText) view.findViewById(R.id.acs);
        } else {
            mentionEditText = null;
        }
        this.f107678b = mentionEditText;
        this.f107681e = extensionMisc;
        this.f107677a = m131970a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().observe(iVar, new C41382b(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getAnchorState().observe(iVar, new C41384c(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getI18nPrivacy().observe(iVar, new C41385d(this, extensionMisc));
        extensionMisc.getExtensionDataRepo().getI18nStarAtlasClosed().observe(iVar, new C41386e(this, extensionMisc));
        I18nShopPublishSettingItem i18nShopPublishSettingItem = this.f107677a;
        if (i18nShopPublishSettingItem == null) {
            C7573i.m23583a("delegate");
        }
        if (m131972a()) {
            i = 0;
        } else {
            i = 8;
        }
        i18nShopPublishSettingItem.setVisibility(i);
        List b = AnchorListManager.f64708a.mo64313b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24536e) obj).f64760a == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
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
                I18nShopPublishSettingItem i18nShopPublishSettingItem2 = this.f107677a;
                if (i18nShopPublishSettingItem2 == null) {
                    C7573i.m23583a("delegate");
                }
                C41381a aVar = new C41381a(eVar, this, fragment, extensionMisc, aVPublishContentType, publishOutput);
                i18nShopPublishSettingItem2.setOnClickListener(aVar);
            }
        }
    }
}
