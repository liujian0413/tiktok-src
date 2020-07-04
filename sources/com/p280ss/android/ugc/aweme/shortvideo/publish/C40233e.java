package com.p280ss.android.ugc.aweme.shortvideo.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37558ak;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41554h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e */
public final class C40233e {

    /* renamed from: h */
    public static final C40234a f104549h = new C40234a(null);

    /* renamed from: a */
    public boolean f104550a = true;

    /* renamed from: b */
    public boolean f104551b;

    /* renamed from: c */
    public boolean f104552c;

    /* renamed from: d */
    public CommonItemView f104553d;

    /* renamed from: e */
    public final boolean f104554e;

    /* renamed from: f */
    public final Fragment f104555f;

    /* renamed from: g */
    public final int f104556g = 5;

    /* renamed from: i */
    private boolean f104557i;

    /* renamed from: j */
    private View f104558j;

    /* renamed from: k */
    private final boolean f104559k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$a */
    public static final class C40234a {
        private C40234a() {
        }

        /* renamed from: a */
        public static boolean m128579a() {
            Boolean bool;
            if (!C36964i.m118940p()) {
                return false;
            }
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                bool = a.getSilentShareConfigurable();
                C7573i.m23582a((Object) bool, "SettingsReader.get().silentShareConfigurable");
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(C6399b.m19944t());
            }
            return bool.booleanValue();
        }

        public /* synthetic */ C40234a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$b */
    static final class C40235b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40233e f104560a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f104561b;

        C40235b(C40233e eVar, LinearLayout linearLayout) {
            this.f104560a = eVar;
            this.f104561b = linearLayout;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickInstrumentation.onClick(view);
            m128580a(view);
        }

        /* renamed from: a */
        private void m128580a(View view) {
            if (!C41554h.m132329a()) {
                C10761a.m31410e(this.f104561b.getContext(), this.f104561b.getContext().getString(R.string.ae8, new Object[]{C41554h.m132330b()})).mo25750a();
            } else if (C40233e.m128566b()) {
                C10761a.m31388a(this.f104561b.getContext(), this.f104561b.getContext().getString(R.string.diu), 0).mo25750a();
            } else {
                CommonItemView commonItemView = this.f104560a.f104553d;
                if (commonItemView != null) {
                    commonItemView.setChecked(!commonItemView.mo25778c());
                    C35563c.f93252o.mo83227c().mo83239a(Boolean.valueOf(commonItemView.mo25778c()));
                    if (commonItemView.mo25778c()) {
                        Object service = ServiceManager.get().getService(IAVService.class);
                        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
                        ((IAVService) service).getPublishService().cancelSynthetise(commonItemView.getContext());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$c */
    static final class C40236c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40233e f104562a;

        /* renamed from: b */
        final /* synthetic */ boolean f104563b;

        /* renamed from: c */
        final /* synthetic */ String f104564c;

        /* renamed from: d */
        final /* synthetic */ HashMap f104565d;

        C40236c(C40233e eVar, boolean z, String str, HashMap hashMap) {
            this.f104562a = eVar;
            this.f104563b = z;
            this.f104564c = str;
            this.f104565d = hashMap;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Fragment fragment = this.f104562a.f104555f;
            Intent intent = new Intent(this.f104562a.f104555f.getContext(), PublishPrivacySettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("comment_item_checked", this.f104562a.f104550a);
            bundle.putBoolean("react_duet_item_checked", this.f104562a.f104551b);
            bundle.putBoolean("download_item_checked", this.f104562a.f104552c);
            bundle.putBoolean("can_react_duet", this.f104563b);
            bundle.putString("creation_id", this.f104564c);
            bundle.putSerializable("mob_data", this.f104565d);
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, this.f104562a.f104556g);
            C6907h.m21524a("click_advanced_settings", (Map) C22984d.m75611a().mo59973a("creation_id", this.f104564c).mo59973a("enter_from", "video_post_page").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$d */
    static final class C40237d<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C40237d f104566a = new C40237d();

        C40237d() {
        }

        public final /* synthetic */ Object call() {
            return m128581a();
        }

        /* renamed from: a */
        private static C22200c m128581a() {
            C21164d dVar = C35563c.f93260w;
            return dVar.mo57084a(dVar.mo57091d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$e */
    static final class C40238e<TTaskResult, TContinuationResult> implements C1591g<C22200c, Object> {

        /* renamed from: a */
        final /* synthetic */ C40233e f104567a;

        C40238e(C40233e eVar) {
            this.f104567a = eVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m128582a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m128582a(C1592h<C22200c> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            C22200c cVar = (C22200c) hVar.mo6890e();
            if (cVar != null) {
                if (this.f104567a.f104552c && (!cVar.mo58568k() || !cVar.mo58569l())) {
                    this.f104567a.f104552c = false;
                }
                C40240f.m128583a(cVar.mo58568k());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$f */
    static final class C40239f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f104568a;

        /* renamed from: b */
        final /* synthetic */ String f104569b;

        C40239f(CommonItemView commonItemView, String str) {
            this.f104568a = commonItemView;
            this.f104569b = str;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C35563c.f93230L.mo93341a(Property.ReactDuetSettingChanged, true);
            if (this.f104568a.mo25778c()) {
                C35563c.f93230L.mo93338a(Property.ReactDuetSettingCurrent, C37558ak.f97966e);
            } else {
                C35563c.f93230L.mo93338a(Property.ReactDuetSettingCurrent, C37558ak.f97967f);
            }
            this.f104568a.setChecked(!this.f104568a.mo25778c());
            String str2 = "click_react_duet_control";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f104569b).mo59973a("enter_from", "video_post_page");
            String str3 = "to_status";
            if (this.f104568a.mo25778c()) {
                str = "on";
            } else {
                str = "off";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: f */
    public static final boolean m128568f() {
        return C40234a.m128579a();
    }

    /* renamed from: a */
    public final boolean mo100028a() {
        CommonItemView commonItemView = this.f104553d;
        if (commonItemView != null) {
            return commonItemView.mo25778c();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo100027a(BaseShortVideoContext baseShortVideoContext) {
        C7573i.m23587b(baseShortVideoContext, "model");
        if (C40240f.f104570a.mo100037c()) {
            baseShortVideoContext.allowDownloadSetting = mo100030c();
        }
    }

    /* renamed from: c */
    public final int mo100030c() {
        if (this.f104552c || !C6399b.m19944t()) {
            return 0;
        }
        return 3;
    }

    /* renamed from: b */
    public static boolean m128566b() {
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b == null || !b.isPreventDownload()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo100032e() {
        CommonItemView commonItemView = this.f104553d;
        if (commonItemView != null) {
            commonItemView.setChecked(false);
        }
        CommonItemView commonItemView2 = this.f104553d;
        if (commonItemView2 != null) {
            commonItemView2.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo100031d() {
        if (C40240f.f104570a.mo100037c()) {
            C22200c e = C35563c.f93260w.mo57092e();
            if (e != null) {
                if (!e.mo58569l()) {
                    this.f104552c = false;
                } else if (!this.f104557i) {
                    this.f104552c = e.mo58568k();
                } else if (this.f104552c && !e.mo58568k()) {
                    this.f104552c = false;
                    C10761a.m31399c(this.f104555f.getContext(), (int) R.string.avs).mo25750a();
                }
            }
        }
    }

    /* renamed from: a */
    private final int m128561a(float f) {
        return (int) C9738o.m28708b(this.f104555f.getContext(), f);
    }

    /* renamed from: b */
    private final void m128565b(BaseShortVideoContext baseShortVideoContext) {
        boolean z;
        if (baseShortVideoContext.commentSetting == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f104550a = z;
    }

    /* renamed from: c */
    private final void m128567c(BaseShortVideoContext baseShortVideoContext) {
        if (C40240f.f104570a.mo100037c()) {
            boolean z = true;
            if (!C35563c.f93260w.mo57090c()) {
                this.f104552c = true;
                return;
            }
            if (this.f104559k) {
                if (baseShortVideoContext.allowDownloadSetting != 0) {
                    z = false;
                }
                this.f104552c = z;
            }
            C1592h.m7853a((Callable<TResult>) C40237d.f104566a).mo6876a((C1591g<TResult, TContinuationResult>) new C40238e<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: b */
    public final int mo100029b(CommonItemView commonItemView) {
        C7573i.m23587b(commonItemView, "reactDuetSettingItem");
        if (C40240f.m128585b()) {
            switch (C35563c.f93231M.mo93306b(AVAB.Property.EnablePublishPrivacySetting)) {
                case 1:
                case 2:
                    if (this.f104551b) {
                        return 0;
                    }
                    return 1;
                default:
                    if (commonItemView.mo25778c()) {
                        return 0;
                    }
                    return 1;
            }
        } else if (commonItemView.mo25778c()) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public final int mo100023a(CommonItemView commonItemView) {
        C7573i.m23587b(commonItemView, "commentSettingItem");
        if (C40240f.m128585b()) {
            switch (C35563c.f93231M.mo93306b(AVAB.Property.EnablePublishPrivacySetting)) {
                case 1:
                case 2:
                    if (this.f104550a) {
                        return 0;
                    }
                    return 3;
                default:
                    if (commonItemView.mo25778c()) {
                        return 0;
                    }
                    return 3;
            }
        } else if (!C6399b.m19944t() || commonItemView.mo25778c()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: a */
    public final void mo100025a(LinearLayout linearLayout) {
        C7573i.m23587b(linearLayout, "parent");
        if (this.f104554e) {
            boolean z = false;
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.a5w, linearLayout, false);
            if (inflate != null) {
                this.f104553d = (CommonItemView) inflate;
                CommonItemView commonItemView = this.f104553d;
                if (commonItemView != null) {
                    if (C41554h.m132329a() && !m128566b()) {
                        Object a = C35563c.f93252o.mo83227c().mo83238a();
                        C7573i.m23582a(a, "AVEnv.SP_SERIVCE.autoSaveVideo().get()");
                        if (((Boolean) a).booleanValue()) {
                            z = true;
                        }
                    }
                    commonItemView.setChecked(z);
                }
                linearLayout.addView(this.f104553d, new LayoutParams(-1, m128561a(52.0f)));
                CommonItemView commonItemView2 = this.f104553d;
                if (commonItemView2 != null) {
                    commonItemView2.setOnClickListener(new C40235b(this, linearLayout));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        }
    }

    /* renamed from: a */
    private static void m128564a(CommonItemView commonItemView, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap) {
        boolean z;
        C35541ai aiVar = C35563c.f93257t;
        if (baseShortVideoContext.commentSetting == 0) {
            z = true;
        } else {
            z = false;
        }
        aiVar.mo83276a(commonItemView, z, hashMap);
    }

    public C40233e(Fragment fragment, boolean z, int i) {
        boolean z2;
        C7573i.m23587b(fragment, "fragment");
        this.f104555f = fragment;
        this.f104559k = z;
        if (C35563c.f93230L.mo93343b(Property.ReactDuetSettingCurrent) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f104551b = z2;
        this.f104552c = true;
        this.f104554e = C40234a.m128579a();
    }

    /* renamed from: a */
    private static void m128563a(CommonItemView commonItemView, BaseShortVideoContext baseShortVideoContext, String str) {
        if (!C37558ak.m120317a() || !C37558ak.m120318a(baseShortVideoContext)) {
            commonItemView.setVisibility(8);
            return;
        }
        boolean z = false;
        commonItemView.setVisibility(0);
        if (C35563c.f93230L.mo93343b(Property.ReactDuetSettingCurrent) == 0) {
            z = true;
        }
        commonItemView.setChecked(z);
        commonItemView.setOnClickListener(new C40239f(commonItemView, str));
    }

    /* renamed from: a */
    public final void mo100024a(int i, int i2, Intent intent) {
        if (i == this.f104556g && i2 == -1 && intent != null) {
            this.f104550a = intent.getBooleanExtra("comment_item_checked", true);
            this.f104551b = intent.getBooleanExtra("react_duet_item_checked", true);
            this.f104552c = intent.getBooleanExtra("download_item_checked", false);
            this.f104557i = true;
        }
    }

    /* renamed from: a */
    private final void m128562a(LinearLayout linearLayout, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap, boolean z, String str) {
        this.f104558j = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.a_2, linearLayout, false);
        linearLayout.addView(this.f104558j, new LayoutParams(-1, m128561a(56.0f)));
        View view = this.f104558j;
        if (view != null) {
            view.setOnClickListener(new C40236c(this, z, str, hashMap));
        }
        m128565b(baseShortVideoContext);
        m128567c(baseShortVideoContext);
    }

    /* renamed from: a */
    public final void mo100026a(LinearLayout linearLayout, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap, String str, CommonItemView commonItemView, CommonItemView commonItemView2) {
        C7573i.m23587b(linearLayout, "viewContainer");
        C7573i.m23587b(baseShortVideoContext, "model");
        C7573i.m23587b(commonItemView, "reactDuetSettingItem");
        C7573i.m23587b(commonItemView2, "commentSettingItem");
        if (!C35563c.f93260w.mo57088a()) {
            int b = C35563c.f93231M.mo93306b(AVAB.Property.EnablePublishPrivacySetting);
            if (!C40240f.m128585b() || !(b == 2 || b == 1)) {
                m128563a(commonItemView, baseShortVideoContext, str);
                m128564a(commonItemView2, baseShortVideoContext, hashMap);
                return;
            }
            m128562a(linearLayout, baseShortVideoContext, hashMap, C37558ak.m120318a(baseShortVideoContext), str);
            C23487o.m77146a(false, commonItemView, commonItemView2);
        }
    }
}
