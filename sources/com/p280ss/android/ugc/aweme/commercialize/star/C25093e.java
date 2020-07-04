package com.p280ss.android.ugc.aweme.commercialize.star;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41519ae;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.e */
public final class C25093e implements IAVPublishExtension<StarAtlasPublishModel> {

    /* renamed from: e */
    public static final C25094a f66235e = new C25094a(null);

    /* renamed from: a */
    public C25101f f66236a;

    /* renamed from: b */
    public MentionEditText f66237b;

    /* renamed from: c */
    public Context f66238c;

    /* renamed from: d */
    public ExtensionMisc f66239d;

    /* renamed from: f */
    private Fragment f66240f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$a */
    public static final class C25094a {
        private C25094a() {
        }

        public /* synthetic */ C25094a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$b */
    static final class C25095b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C25093e f66241a;

        C25095b(C25093e eVar) {
            this.f66241a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82643a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82643a() {
            C41519ae.m132254a(this.f66241a.f66238c, this.f66241a.f66237b, this.f66241a.mo65599a().getStarAtlasHashTag());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$c */
    static final class C25096c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C25093e f66242a;

        C25096c(C25093e eVar) {
            this.f66242a = eVar;
            super(0);
        }

        /* renamed from: a */
        private void m82644a() {
            C41519ae.m132255a(this.f66242a.f66237b);
        }

        public final /* synthetic */ Object invoke() {
            m82644a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$d */
    static final class C25097d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25093e f66243a;

        /* renamed from: b */
        final /* synthetic */ PublishOutput f66244b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f66245c;

        /* renamed from: d */
        final /* synthetic */ Fragment f66246d;

        C25097d(C25093e eVar, PublishOutput publishOutput, AVPublishContentType aVPublishContentType, Fragment fragment) {
            this.f66243a = eVar;
            this.f66244b = publishOutput;
            this.f66245c = aVPublishContentType;
            this.f66246d = fragment;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (C25093e.m82639a(this.f66244b, this.f66245c)) {
                try {
                    IESSettingsProxy a = C30199h.m98861a();
                    C7573i.m23582a((Object) a, "SettingsReader.get()");
                    str = a.getTcmNameCtry();
                } catch (Exception unused) {
                    str = "TCM";
                }
                Context context = this.f66246d.getContext();
                Context context2 = this.f66246d.getContext();
                if (context2 != null) {
                    String string = context2.getString(R.string.e0i);
                    if (string != null) {
                        str2 = C1642a.m8034a(string, Arrays.copyOf(new Object[]{str}, 1));
                        C7573i.m23582a((Object) str2, "java.lang.String.format(format, *args)");
                        C9738o.m28697a(context, str2);
                        return;
                    }
                }
                str2 = null;
                C9738o.m28697a(context, str2);
                return;
            }
            C25091d.m82634a(this.f66246d.getActivity(), this.f66243a.mo65599a().getStarAtlasContent());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$e */
    static final class C25098e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25093e f66247a;

        /* renamed from: b */
        final /* synthetic */ Fragment f66248b;

        C25098e(C25093e eVar, Fragment fragment) {
            this.f66247a = eVar;
            this.f66248b = fragment;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!this.f66247a.mo65599a().f107118j) {
                Context context = this.f66248b.getContext();
                Context context2 = this.f66248b.getContext();
                if (context2 != null) {
                    str = context2.getString(R.string.fc);
                } else {
                    str = null;
                }
                C9738o.m28697a(context, str);
                return;
            }
            String uri = C33786f.m108941a(C25088b.m82630b()).mo86195a("order_id", String.valueOf(this.f66247a.mo65599a().getStarAtlasOrderId())).mo86194a().toString();
            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…              .toString()");
            C7195s.m22438a().mo18682a(uri);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$f */
    static final class C25099f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C25093e f66249a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f66250b;

        /* renamed from: c */
        final /* synthetic */ PublishOutput f66251c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f66252d;

        C25099f(C25093e eVar, ExtensionMisc extensionMisc, PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
            this.f66249a = eVar;
            this.f66250b = extensionMisc;
            this.f66251c = publishOutput;
            this.f66252d = aVPublishContentType;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82645a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82645a() {
            String str;
            if (C25093e.m82638a(this.f66250b)) {
                this.f66249a.mo65599a().setVisibility(8);
                return;
            }
            if (C25093e.m82639a(this.f66251c, this.f66252d)) {
                this.f66249a.mo65599a().setAlpha(0.5f);
            } else if (this.f66249a.mo65599a().f107118j) {
                this.f66249a.mo65599a().setAlpha(1.0f);
            }
            boolean z = false;
            this.f66249a.mo65599a().setVisibility(0);
            this.f66249a.mo65599a().mo65606c();
            C35542a publishExtensionDataContainer = this.f66250b.getPublishExtensionDataContainer();
            if (publishExtensionDataContainer != null) {
                str = publishExtensionDataContainer.mo88234d();
            } else {
                str = null;
            }
            C25006o b = C25006o.m82327b(str);
            if (C6399b.m19944t()) {
                C25101f a = this.f66249a.mo65599a();
                C7573i.m23582a((Object) b, "model");
                a.setHasStarAtlasOrder(b.f65941d);
            } else {
                C25101f a2 = this.f66249a.mo65599a();
                C7573i.m23582a((Object) b, "model");
                a2.setStarAtlasOrderId(b.mo65435a());
            }
            CharSequence charSequence = b.f65954q;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                this.f66249a.mo65599a().mo65604a(new JSONObject(b.f65954q));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$g */
    static final class C25100g<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C25093e f66253a;

        C25100g(C25093e eVar) {
            this.f66253a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C25093e eVar = this.f66253a;
                C7573i.m23582a((Object) bool, "it");
                eVar.mo65600a(bool.booleanValue());
            }
        }
    }

    public final String getName() {
        return "StarAtlasPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
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

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
    }

    /* renamed from: b */
    private static StarAtlasPublishModel m82640b() {
        return new StarAtlasPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m82640b();
    }

    /* renamed from: a */
    public final C25101f mo65599a() {
        C25101f fVar = this.f66236a;
        if (fVar == null) {
            C7573i.m23583a("delegate");
        }
        return fVar;
    }

    public final void onEnterChildrenMode() {
        C25101f fVar = this.f66236a;
        if (fVar == null) {
            C7573i.m23583a("delegate");
        }
        fVar.setVisibility(8);
    }

    /* renamed from: a */
    public static boolean m82638a(ExtensionMisc extensionMisc) {
        String str;
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo88234d();
        } else {
            str = null;
        }
        C25006o a = C25006o.m82325a(str);
        C7573i.m23582a((Object) a, "PublishExtensionModel.fr…taContainer?.publishData)");
        if (a.f65943f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C25101f m82637a(LinearLayout linearLayout) {
        C25101f fVar = new C25101f(linearLayout.getContext());
        linearLayout.addView(fVar, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        fVar.setGravity(16);
        fVar.setOrientation(0);
        fVar.setVisibility(8);
        return fVar;
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        String str;
        C7573i.m23587b(publishOutput, "publishOutput");
        ExtensionMisc extensionMisc = this.f66239d;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo88234d();
        } else {
            str = null;
        }
        C25006o b = C25006o.m82327b(str);
        C7573i.m23582a((Object) b, "model");
        b.mo65436a(false);
        b.f65942e = "";
        b.f65940c = 0;
        ExtensionMisc extensionMisc2 = this.f66239d;
        if (extensionMisc2 == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo88231a(new C6600e().mo15979b((Object) b));
        }
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        String str;
        C7573i.m23587b(publishOutput, "publishOutput");
        ExtensionMisc extensionMisc = this.f66239d;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo88234d();
        } else {
            str = null;
        }
        C25006o b = C25006o.m82327b(str);
        b.f65954q = "";
        C7573i.m23582a((Object) b, "model");
        b.mo65436a(false);
        b.f65942e = "";
        b.f65940c = 0;
        ExtensionMisc extensionMisc2 = this.f66239d;
        if (extensionMisc2 == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo88231a(new C6600e().mo15979b((Object) b));
        }
    }

    /* renamed from: a */
    public final void mo65600a(boolean z) {
        float f;
        C25101f fVar = this.f66236a;
        if (fVar == null) {
            C7573i.m23583a("delegate");
        }
        fVar.setEnable(z);
        C25101f fVar2 = this.f66236a;
        if (fVar2 == null) {
            C7573i.m23583a("delegate");
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fVar2.setAlpha(f);
    }

    /* renamed from: a */
    public static boolean m82639a(PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
        if (!C6399b.m19944t() || !C23764b.m77913a(publishOutput.getMusicId()) || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
            return false;
        }
        return true;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        MentionEditText mentionEditText;
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f66239d = extensionMisc;
        this.f66238c = fragment.getContext();
        this.f66240f = fragment;
        View view = fragment.getView();
        if (view != null) {
            mentionEditText = (MentionEditText) view.findViewById(R.id.acs);
        } else {
            mentionEditText = null;
        }
        this.f66237b = mentionEditText;
        this.f66236a = m82637a(linearLayout);
        extensionMisc.getExtensionDataRepo().setAddStarAtlasTag(new C25095b(this));
        extensionMisc.getExtensionDataRepo().setRemoveStarAtlasTag(new C25096c(this));
        C25101f fVar = this.f66236a;
        if (fVar == null) {
            C7573i.m23583a("delegate");
        }
        fVar.setExtensionDataRepo(extensionMisc.getExtensionDataRepo());
        C25101f fVar2 = this.f66236a;
        if (fVar2 == null) {
            C7573i.m23583a("delegate");
        }
        fVar2.setPublishExtensionDataContainer(extensionMisc.getPublishExtensionDataContainer());
        if (C6399b.m19944t()) {
            C25101f fVar3 = this.f66236a;
            if (fVar3 == null) {
                C7573i.m23583a("delegate");
            }
            fVar3.mo65603a();
            C25101f fVar4 = this.f66236a;
            if (fVar4 == null) {
                C7573i.m23583a("delegate");
            }
            fVar4.setOnClickListener(new C25097d(this, publishOutput, aVPublishContentType, fragment));
        } else {
            C25101f fVar5 = this.f66236a;
            if (fVar5 == null) {
                C7573i.m23583a("delegate");
            }
            fVar5.aq_();
            C25101f fVar6 = this.f66236a;
            if (fVar6 == null) {
                C7573i.m23583a("delegate");
            }
            fVar6.setOnClickListener(new C25098e(this, fragment));
        }
        C25088b.f66224a.mo65597a(new C25099f(this, extensionMisc, publishOutput, aVPublishContentType));
        if (m82638a(extensionMisc)) {
            C25101f fVar7 = this.f66236a;
            if (fVar7 == null) {
                C7573i.m23583a("delegate");
            }
            fVar7.setVisibility(8);
        }
        C25101f fVar8 = this.f66236a;
        if (fVar8 == null) {
            C7573i.m23583a("delegate");
        }
        fVar8.getExtensionDataRepo().getStarAtlasState().observe(fragment, new C25100g(this));
    }
}
