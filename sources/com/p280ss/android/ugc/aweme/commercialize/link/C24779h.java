package com.p280ss.android.ugc.aweme.commercialize.link;

import android.app.Activity;
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
import com.p280ss.android.ugc.aweme.commercialize.model.C24999h;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.LinkPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.h */
public final class C24779h implements IAVPublishExtension<LinkPublishModel> {

    /* renamed from: c */
    public static final C24780a f65272c = new C24780a(null);

    /* renamed from: a */
    public C24776e f65273a;

    /* renamed from: b */
    public ExtensionMisc f65274b;

    /* renamed from: d */
    private String f65275d = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$a */
    public static final class C24780a {
        private C24780a() {
        }

        public /* synthetic */ C24780a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$b */
    static final class C24781b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24779h f65276a;

        /* renamed from: b */
        final /* synthetic */ Fragment f65277b;

        /* renamed from: c */
        final /* synthetic */ ExtensionMisc f65278c;

        C24781b(C24779h hVar, Fragment fragment, ExtensionMisc extensionMisc) {
            this.f65276a = hVar;
            this.f65277b = fragment;
            this.f65278c = extensionMisc;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f65276a.mo64802a().f107118j) {
                C24775d.m81306b("video_post_page");
                C24769b.m81283a((Activity) this.f65277b.getActivity(), "publish");
                return;
            }
            if (C7573i.m23585a((Object) (Boolean) this.f65278c.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f65278c.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f65278c.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                Context context = this.f65277b.getContext();
                Context context2 = this.f65277b.getContext();
                if (context2 != null) {
                    str = context2.getString(R.string.e0d);
                } else {
                    str = null;
                }
                C9738o.m28697a(context, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$c */
    public static final class C24782c implements C24999h {

        /* renamed from: a */
        final /* synthetic */ C35542a f65279a;

        /* renamed from: a */
        public final String mo64821a() {
            return this.f65279a.mo88234d();
        }

        /* renamed from: b */
        public final boolean mo64823b() {
            return this.f65279a.mo88236f();
        }

        C24782c(C35542a aVar) {
            this.f65279a = aVar;
        }

        /* renamed from: a */
        public final void mo64822a(String str) {
            C7573i.m23587b(str, "value");
            this.f65279a.mo88231a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$d */
    static final class C24783d<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65280a;

        C24783d(C24779h hVar) {
            this.f65280a = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C24779h hVar = this.f65280a;
                C7573i.m23582a((Object) bool, "it");
                hVar.mo64803a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$e */
    static final class C24784e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65281a;

        C24784e(C24779h hVar) {
            this.f65281a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81323a() {
            this.f65281a.mo64804b();
        }

        public final /* synthetic */ Object invoke() {
            m81323a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$f */
    static final class C24785f extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65282a;

        C24785f(C24779h hVar) {
            this.f65282a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m81324a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81324a(String str) {
            if (str != null) {
                this.f65282a.mo64802a().setLinkData(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$g */
    static final class C24786g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65283a;

        C24786g(C24779h hVar) {
            this.f65283a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81325a() {
            this.f65283a.mo64805c();
        }

        public final /* synthetic */ Object invoke() {
            m81325a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$h */
    static final class C24787h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65284a;

        C24787h(C24779h hVar) {
            this.f65284a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81326a() {
            this.f65284a.mo64806d();
        }

        public final /* synthetic */ Object invoke() {
            m81326a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$i */
    static final class C24788i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65285a;

        C24788i(C24779h hVar) {
            this.f65285a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81327a() {
            this.f65285a.mo64804b();
        }

        public final /* synthetic */ Object invoke() {
            m81327a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$j */
    static final class C24789j extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65286a;

        C24789j(C24779h hVar) {
            this.f65286a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m81328a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81328a(String str) {
            if (str != null) {
                this.f65286a.mo64802a().setLinkData(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$k */
    static final class C24790k extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65287a;

        C24790k(C24779h hVar) {
            this.f65287a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81329a() {
            this.f65287a.mo64805c();
        }

        public final /* synthetic */ Object invoke() {
            m81329a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.h$l */
    static final class C24791l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24779h f65288a;

        C24791l(C24779h hVar) {
            this.f65288a = hVar;
            super(0);
        }

        /* renamed from: a */
        private void m81330a() {
            this.f65288a.mo64806d();
        }

        public final /* synthetic */ Object invoke() {
            m81330a();
            return C7581n.f20898a;
        }
    }

    public final String getName() {
        return "LinkPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
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

    /* renamed from: f */
    private static LinkPublishModel m81313f() {
        return new LinkPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m81313f();
    }

    /* renamed from: a */
    public final C24776e mo64802a() {
        C24776e eVar = this.f65273a;
        if (eVar == null) {
            C7573i.m23583a("delegate");
        }
        return eVar;
    }

    /* renamed from: c */
    public final void mo64805c() {
        C24776e eVar = this.f65273a;
        if (eVar == null) {
            C7573i.m23583a("delegate");
        }
        this.f65275d = eVar.getLinkData();
    }

    public final void onEnterChildrenMode() {
        C24776e eVar = this.f65273a;
        if (eVar == null) {
            C7573i.m23583a("delegate");
        }
        eVar.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo64804b() {
        C24776e eVar = this.f65273a;
        if (eVar == null) {
            C7573i.m23583a("delegate");
        }
        eVar.setLinkData("");
        mo64803a(true);
    }

    /* renamed from: d */
    public final void mo64806d() {
        C24776e eVar = this.f65273a;
        if (eVar == null) {
            C7573i.m23583a("delegate");
        }
        eVar.setLinkData(this.f65275d);
        this.f65275d = "";
    }

    /* renamed from: e */
    private final boolean m81312e() {
        String str;
        ExtensionMisc extensionMisc = this.f65274b;
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
        return true;
    }

    public final void onCreateFinish() {
        ExtensionMisc extensionMisc = this.f65274b;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        extensionMisc.getExtensionDataRepo().setResetLinkAction(new C24788i(this));
        ExtensionMisc extensionMisc2 = this.f65274b;
        if (extensionMisc2 == null) {
            C7573i.m23583a("extensionMisc");
        }
        extensionMisc2.getExtensionDataRepo().setUpdateLink(new C24789j(this));
        ExtensionMisc extensionMisc3 = this.f65274b;
        if (extensionMisc3 == null) {
            C7573i.m23583a("extensionMisc");
        }
        extensionMisc3.getExtensionDataRepo().setRecordLinkAction(new C24790k(this));
        ExtensionMisc extensionMisc4 = this.f65274b;
        if (extensionMisc4 == null) {
            C7573i.m23583a("extensionMisc");
        }
        extensionMisc4.getExtensionDataRepo().setRevertLinkAction(new C24791l(this));
    }

    /* renamed from: a */
    private static C24776e m81311a(LinearLayout linearLayout) {
        C24776e eVar = new C24776e(linearLayout.getContext());
        linearLayout.addView(eVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        eVar.setGravity(16);
        eVar.setOrientation(0);
        eVar.setVisibility(8);
        return eVar;
    }

    /* renamed from: a */
    public final void mo64803a(boolean z) {
        if (z) {
            C24776e eVar = this.f65273a;
            if (eVar == null) {
                C7573i.m23583a("delegate");
            }
            eVar.setAlpha(1.0f);
            C24776e eVar2 = this.f65273a;
            if (eVar2 == null) {
                C7573i.m23583a("delegate");
            }
            eVar2.setEnable(true);
            return;
        }
        C24776e eVar3 = this.f65273a;
        if (eVar3 == null) {
            C7573i.m23583a("delegate");
        }
        eVar3.setAlpha(0.5f);
        C24776e eVar4 = this.f65273a;
        if (eVar4 == null) {
            C7573i.m23583a("delegate");
        }
        eVar4.setEnable(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f65274b = extensionMisc;
        this.f65273a = m81311a(linearLayout);
        int i = 8;
        if (C24769b.m81285a()) {
            C24776e eVar = this.f65273a;
            if (eVar == null) {
                C7573i.m23583a("delegate");
            }
            if (m81312e()) {
                i = 0;
            }
            eVar.setVisibility(i);
            C24776e eVar2 = this.f65273a;
            if (eVar2 == null) {
                C7573i.m23583a("delegate");
            }
            eVar2.setOnClickListener(new C24781b(this, fragment, extensionMisc));
            C24775d.m81305a("video_post_page");
        } else {
            C24776e eVar3 = this.f65273a;
            if (eVar3 == null) {
                C7573i.m23583a("delegate");
            }
            eVar3.setVisibility(8);
        }
        C24999h hVar = null;
        if (fragment instanceof C24999h) {
            hVar = (C24999h) fragment;
        } else if (fragment instanceof C35542a) {
            hVar = new C24782c((C35542a) fragment);
        }
        if (hVar != null) {
            C24776e eVar4 = this.f65273a;
            if (eVar4 == null) {
                C7573i.m23583a("delegate");
            }
            eVar4.setCommerceDataContainer(hVar);
        }
        extensionMisc.getExtensionDataRepo().getLinkState().observe(fragment, new C24783d(this));
        extensionMisc.getExtensionDataRepo().setResetLinkAction(new C24784e(this));
        extensionMisc.getExtensionDataRepo().setUpdateLink(new C24785f(this));
        extensionMisc.getExtensionDataRepo().setRecordLinkAction(new C24786g(this));
        extensionMisc.getExtensionDataRepo().setRevertLinkAction(new C24787h(this));
    }
}
