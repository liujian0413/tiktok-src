package com.p280ss.android.ugc.aweme.setting.personalization;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.compliance.p1149a.C25785a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1524b.C37681a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a.C37687a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37694b;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity */
public final class PersonalizationActivity extends AmeBaseActivity implements C0053p<C23083a>, C37694b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98137a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PersonalizationActivity.class), "pushSettingPresenter", "getPushSettingPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PersonalizationActivity.class), "mDataCenter", "getMDataCenter()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PersonalizationActivity.class), "mModel", "getMModel()Lcom/ss/android/ugc/aweme/setting/personalization/model/PersonalizationModel;"))};

    /* renamed from: e */
    public static final C37666a f98138e = new C37666a(null);

    /* renamed from: w */
    private static final boolean f98139w = C7163a.m22363a();

    /* renamed from: b */
    public CommonItemView f98140b;

    /* renamed from: c */
    public CommonItemView f98141c;

    /* renamed from: d */
    public final OnClickListener f98142d = new C37676j(this);

    /* renamed from: q */
    private CommonItemView f98143q;

    /* renamed from: r */
    private final C7541d f98144r = C7546e.m23569a(new C37677k(this));

    /* renamed from: s */
    private boolean f98145s;

    /* renamed from: t */
    private boolean f98146t;

    /* renamed from: u */
    private final C7541d f98147u = C7546e.m23569a(new C37673g(this));

    /* renamed from: v */
    private final C7541d f98148v = C7546e.m23569a(new C37674h(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$a */
    public static final class C37666a {
        private C37666a() {
        }

        public /* synthetic */ C37666a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$b */
    public static final class C37667b implements C37709b {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98149a;

        /* renamed from: c_ */
        public final void mo83182c_(Exception exc) {
        }

        C37667b(PersonalizationActivity personalizationActivity) {
            this.f98149a = personalizationActivity;
        }

        /* renamed from: a */
        public final void mo83181a(C37723b bVar) {
            CommonItemView a = PersonalizationActivity.m120499a(this.f98149a);
            int i = 0;
            boolean z = true;
            if (bVar == null || bVar.f98250H != 1) {
                z = false;
            }
            a.setChecked(z);
            C25785a a2 = C25789b.m84753a();
            if (bVar != null) {
                i = bVar.f98250H;
            }
            a2.mo66970a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$c */
    static final class C37668c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98150a;

        C37668c(PersonalizationActivity personalizationActivity) {
            this.f98150a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10761a.m31409e((Context) this.f98150a, (int) R.string.dr6).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$d */
    static final class C37669d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98151a;

        C37669d(PersonalizationActivity personalizationActivity) {
            this.f98151a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (PersonalizationActivity.m120499a(this.f98151a).mo25778c()) {
                new C10741a(this.f98151a).mo25657b((int) R.string.dr9).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C37669d f98152a;

                    {
                        this.f98152a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f98152a.f98151a.mo95008i();
                    }
                }).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
            } else {
                this.f98151a.mo95008i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$e */
    static final class C37671e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98153a;

        C37671e(PersonalizationActivity personalizationActivity) {
            this.f98153a = personalizationActivity;
        }

        public final void onClick(View view) {
            C19290j jVar;
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent(this.f98153a, CrossPlatformActivity.class);
            if (C6399b.m19947w()) {
                jVar = new C19290j("https://www.tiktok.com/falcon/rn/export_data/?enter_from=settings&hide_nav_bar=1");
            } else {
                jVar = new C19290j("https://m.tiktok.com/falcon/rn/export_data/?enter_from=settings&hide_nav_bar=1");
            }
            intent.setData(Uri.parse(jVar.toString()));
            intent.putExtra("hide_nav_bar", true);
            this.f98153a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$f */
    static final class C37672f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98154a;

        C37672f(PersonalizationActivity personalizationActivity) {
            this.f98154a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98154a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$g */
    static final class C37673g extends Lambda implements C7561a<DataCenter> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98155a;

        C37673g(PersonalizationActivity personalizationActivity) {
            this.f98155a = personalizationActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DataCenter invoke() {
            return DataCenter.m75849a(C23087c.m75888a((FragmentActivity) this.f98155a), (C0043i) this.f98155a).mo60132a("set_status", (C0053p<C23083a>) this.f98155a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$h */
    static final class C37674h extends Lambda implements C7561a<C37681a> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98156a;

        C37674h(PersonalizationActivity personalizationActivity) {
            this.f98156a = personalizationActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37681a invoke() {
            return new C37681a(this.f98156a.mo58711c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$i */
    static final class C37675i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98157a;

        C37675i(PersonalizationActivity personalizationActivity) {
            this.f98157a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10761a.m31409e((Context) this.f98157a, (int) R.string.cr_).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$j */
    static final class C37676j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98158a;

        C37676j(PersonalizationActivity personalizationActivity) {
            this.f98158a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (PersonalizationActivity.m120501b(this.f98158a).mo25778c()) {
                this.f98158a.mo59893d().mo95032a(0, false);
                PersonalizationActivity.m120501b(this.f98158a).setChecked(false);
                C6907h.m21524a("change_personalization_status", (Map) new C22984d().mo59973a("initial_status", "on").mo59973a("final_status", "off").f60753a);
                return;
            }
            this.f98158a.mo59893d().mo95032a(1, false);
            PersonalizationActivity.m120501b(this.f98158a).setChecked(true);
            C6907h.m21524a("change_personalization_status", (Map) new C22984d().mo59973a("initial_status", "off").mo59973a("final_status", "on").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$k */
    static final class C37677k extends Lambda implements C7561a<C37713d> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f98159a;

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$k$a */
        public static final class C37678a implements C37708a {

            /* renamed from: a */
            final /* synthetic */ C37677k f98160a;

            public final void bI_() {
            }

            public final void bJ_() {
                PersonalizationActivity.m120499a(this.f98160a.f98159a).setChecked(!PersonalizationActivity.m120499a(this.f98160a.f98159a).mo25778c());
                C25789b.m84753a().mo66970a(PersonalizationActivity.m120499a(this.f98160a.f98159a).mo25778c() ^ true ? 1 : 0);
            }

            C37678a(C37677k kVar) {
                this.f98160a = kVar;
            }
        }

        C37677k(PersonalizationActivity personalizationActivity) {
            this.f98159a = personalizationActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37713d invoke() {
            C37713d dVar = new C37713d();
            dVar.mo66537a(new C37678a(this));
            return dVar;
        }
    }

    /* renamed from: j */
    private final C37713d m120502j() {
        return (C37713d) this.f98144r.getValue();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.f124298do;
    }

    /* renamed from: c */
    public final DataCenter mo58711c() {
        return (DataCenter) this.f98147u.getValue();
    }

    /* renamed from: d */
    public final C37681a mo59893d() {
        return (C37681a) this.f98148v.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onResume", true);
        super.onResume();
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl I = a.mo60039I();
        C7573i.m23582a((Object) I, "CommonSharePrefCache.ins…eedFollowGoogleAdsSetting");
        Object d = I.mo59877d();
        C7573i.m23582a(d, "CommonSharePrefCache.ins…lowGoogleAdsSetting.cache");
        if (((Boolean) d).booleanValue()) {
            C37687a.m120525a(this, this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        if (C6399b.m19947w()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
        }
    }

    /* renamed from: n */
    private final void m120506n() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        int i = 8;
        if (!a.isLogin()) {
            CommonItemView commonItemView = this.f98143q;
            if (commonItemView == null) {
                C7573i.m23583a("mDownloadDataItem");
            }
            commonItemView.setVisibility(8);
            return;
        }
        if (this.f98145s) {
            i = 0;
        }
        CommonItemView commonItemView2 = this.f98143q;
        if (commonItemView2 == null) {
            C7573i.m23583a("mDownloadDataItem");
        }
        commonItemView2.setVisibility(i);
        if (this.f98145s) {
            CommonItemView commonItemView3 = this.f98143q;
            if (commonItemView3 == null) {
                C7573i.m23583a("mDownloadDataItem");
            }
            commonItemView3.setOnClickListener(new C37671e(this));
        }
    }

    /* renamed from: i */
    public final void mo95008i() {
        CommonItemView commonItemView = this.f98141c;
        if (commonItemView == null) {
            C7573i.m23583a("mDoNotSellItem");
        }
        CommonItemView commonItemView2 = this.f98141c;
        if (commonItemView2 == null) {
            C7573i.m23583a("mDoNotSellItem");
        }
        commonItemView.setChecked(!commonItemView2.mo25778c());
        CommonItemView commonItemView3 = this.f98141c;
        if (commonItemView3 == null) {
            C7573i.m23583a("mDoNotSellItem");
        }
        boolean z = !commonItemView3.mo25778c();
        C25789b.m84753a().mo66970a(z ? 1 : 0);
        m120502j().mo56976a("allow_sell_data", Integer.valueOf(z));
    }

    /* renamed from: k */
    private void m120503k() {
        CharSequence charSequence;
        View findViewById = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        TextView textView = (TextView) findViewById;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            charSequence = getString(R.string.dpg);
        } else {
            charSequence = getString(R.string.dp6);
        }
        textView.setText(charSequence);
        ((ImageView) findViewById(R.id.jo)).setOnClickListener(new C37672f(this));
        View findViewById2 = findViewById(R.id.cal);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.personalization_ads_item)");
        this.f98140b = (CommonItemView) findViewById2;
        View findViewById3 = findViewById(R.id.can);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.person…ation_download_data_item)");
        this.f98143q = (CommonItemView) findViewById3;
        View findViewById4 = findViewById(R.id.a_5);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.do_not_sell_item)");
        this.f98141c = (CommonItemView) findViewById4;
        this.f98146t = getIntent().getBooleanExtra(C22704b.f60414c, false);
        m120505m();
        m120506n();
        m120504l();
    }

    /* renamed from: l */
    private final void m120504l() {
        if (C25789b.m84764k() > 0) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                CommonItemView commonItemView = this.f98141c;
                if (commonItemView == null) {
                    C7573i.m23583a("mDoNotSellItem");
                }
                boolean z = false;
                commonItemView.setVisibility(0);
                if (C25789b.m84764k() == 2) {
                    CommonItemView commonItemView2 = this.f98141c;
                    if (commonItemView2 == null) {
                        C7573i.m23583a("mDoNotSellItem");
                    }
                    commonItemView2.setAlpha(0.34f);
                    CommonItemView commonItemView3 = this.f98141c;
                    if (commonItemView3 == null) {
                        C7573i.m23583a("mDoNotSellItem");
                    }
                    commonItemView3.setOnClickListener(new C37668c(this));
                    CommonItemView commonItemView4 = this.f98141c;
                    if (commonItemView4 == null) {
                        C7573i.m23583a("mDoNotSellItem");
                    }
                    commonItemView4.setChecked(true);
                    return;
                }
                CommonItemView commonItemView5 = this.f98141c;
                if (commonItemView5 == null) {
                    C7573i.m23583a("mDoNotSellItem");
                }
                commonItemView5.setAlpha(1.0f);
                CommonItemView commonItemView6 = this.f98141c;
                if (commonItemView6 == null) {
                    C7573i.m23583a("mDoNotSellItem");
                }
                commonItemView6.setOnClickListener(new C37669d(this));
                new C37716e().mo66537a(new C37667b(this));
                CommonItemView commonItemView7 = this.f98141c;
                if (commonItemView7 == null) {
                    C7573i.m23583a("mDoNotSellItem");
                }
                if (C25789b.m84765l() == 0) {
                    z = true;
                }
                commonItemView7.setChecked(z);
                return;
            }
        }
        CommonItemView commonItemView8 = this.f98141c;
        if (commonItemView8 == null) {
            C7573i.m23583a("mDoNotSellItem");
        }
        commonItemView8.setVisibility(8);
    }

    /* renamed from: m */
    private final void m120505m() {
        if (C6399b.m19947w()) {
            CommonItemView commonItemView = this.f98140b;
            if (commonItemView == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView.setVisibility(8);
            return;
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl personalizationMode = inst.getPersonalizationMode();
        C7573i.m23582a((Object) personalizationMode, "SharePrefCache.inst().personalizationMode");
        Integer num = (Integer) personalizationMode.mo59877d();
        if ((num != null && num.intValue() == 2) || !C37687a.m120530b()) {
            CommonItemView commonItemView2 = this.f98140b;
            if (commonItemView2 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView2.setVisibility(8);
            return;
        }
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl H = a.mo60038H();
        C7573i.m23582a((Object) H, "CommonSharePrefCache.ins…izationSettingDescription");
        String str = (String) H.mo59877d();
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.dp5);
        }
        CommonItemView commonItemView3 = this.f98140b;
        if (commonItemView3 == null) {
            C7573i.m23583a("mAdSettingItem");
        }
        commonItemView3.setDesc(str);
        boolean z = false;
        if (this.f98146t) {
            CommonItemView commonItemView4 = this.f98140b;
            if (commonItemView4 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView4.setChecked(true);
            mo59893d().mo95032a(1, false);
        } else {
            CommonItemView commonItemView5 = this.f98140b;
            if (commonItemView5 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            if (num != null && num.intValue() == 1) {
                z = true;
            }
            commonItemView5.setChecked(z);
        }
        CommonItemView commonItemView6 = this.f98140b;
        if (commonItemView6 == null) {
            C7573i.m23583a("mAdSettingItem");
        }
        commonItemView6.setOnClickListener(this.f98142d);
    }

    /* renamed from: a */
    public static final /* synthetic */ CommonItemView m120499a(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f98141c;
        if (commonItemView == null) {
            C7573i.m23583a("mDoNotSellItem");
        }
        return commonItemView;
    }

    /* renamed from: b */
    public static final /* synthetic */ CommonItemView m120501b(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f98140b;
        if (commonItemView == null) {
            C7573i.m23583a("mAdSettingItem");
        }
        return commonItemView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        Integer num;
        if (aVar != null) {
            num = (Integer) aVar.mo60161a();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            Intent intent = new Intent();
            intent.putExtra("result", 0);
            setResult(10, intent);
            return;
        }
        if (num != null && num.intValue() == 1) {
            CommonItemView commonItemView = this.f98140b;
            if (commonItemView == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            CommonItemView commonItemView2 = this.f98140b;
            if (commonItemView2 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView.setChecked(!commonItemView2.mo25778c());
            C10761a.m31392b((Context) this, (int) R.string.b33, 1).mo25750a();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        Boolean bool;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent().hasExtra("user_data_download")) {
            z = getIntent().getBooleanExtra("user_data_download", false);
        } else {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                bool = a.getEnableDownloadTtData();
            } catch (NullValueException unused) {
                bool = Boolean.valueOf(false);
            }
            C7573i.m23582a((Object) bool, "try {\n                Se…      false\n            }");
            z = bool.booleanValue();
        }
        this.f98145s = z;
        m120503k();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo95007a(boolean z) {
        if (z) {
            CommonItemView commonItemView = this.f98140b;
            if (commonItemView == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            if (commonItemView.mo25778c()) {
                CommonItemView commonItemView2 = this.f98140b;
                if (commonItemView2 == null) {
                    C7573i.m23583a("mAdSettingItem");
                }
                commonItemView2.setChecked(false);
                mo59893d().mo95032a(0, false);
            }
            CommonItemView commonItemView3 = this.f98140b;
            if (commonItemView3 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView3.setAlpha(0.34f);
            CommonItemView commonItemView4 = this.f98140b;
            if (commonItemView4 == null) {
                C7573i.m23583a("mAdSettingItem");
            }
            commonItemView4.setOnClickListener(new C37675i(this));
            return;
        }
        CommonItemView commonItemView5 = this.f98140b;
        if (commonItemView5 == null) {
            C7573i.m23583a("mAdSettingItem");
        }
        commonItemView5.setAlpha(1.0f);
        CommonItemView commonItemView6 = this.f98140b;
        if (commonItemView6 == null) {
            C7573i.m23583a("mAdSettingItem");
        }
        commonItemView6.setOnClickListener(this.f98142d);
    }
}
