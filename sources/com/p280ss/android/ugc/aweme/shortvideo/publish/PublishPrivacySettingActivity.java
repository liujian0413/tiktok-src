package com.p280ss.android.ugc.aweme.shortvideo.publish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.setting.C37558ak;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity */
public final class PublishPrivacySettingActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f104536a = "";

    /* renamed from: b */
    private boolean f104537b;

    /* renamed from: c */
    private boolean f104538c;

    /* renamed from: d */
    private boolean f104539d;

    /* renamed from: e */
    private HashMap<String, String> f104540e;

    /* renamed from: f */
    private boolean f104541f = true;

    /* renamed from: g */
    private HashMap f104542g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$a */
    static final class C40226a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f104543a;

        C40226a(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f104543a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!C40240f.m128584a()) {
                CommonItemView commonItemView = (CommonItemView) this.f104543a.mo100018a(R.id.fi);
                C7573i.m23582a((Object) commonItemView, "allow_download_setting_item");
                if (!commonItemView.mo25778c()) {
                    C10761a.m31399c((Context) this.f104543a, (int) R.string.avs).mo25750a();
                    return;
                }
            }
            CommonItemView commonItemView2 = (CommonItemView) this.f104543a.mo100018a(R.id.fi);
            C7573i.m23582a((Object) commonItemView2, "allow_download_setting_item");
            CommonItemView commonItemView3 = (CommonItemView) this.f104543a.mo100018a(R.id.fi);
            C7573i.m23582a((Object) commonItemView3, "allow_download_setting_item");
            commonItemView2.setChecked(!commonItemView3.mo25778c());
            String str2 = "click_download_control";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f104543a.f104536a).mo59973a("enter_from", "video_post_page");
            String str3 = "to_status";
            CommonItemView commonItemView4 = (CommonItemView) this.f104543a.mo100018a(R.id.fi);
            C7573i.m23582a((Object) commonItemView4, "allow_download_setting_item");
            if (commonItemView4.mo25778c()) {
                str = "on";
            } else {
                str = "off";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$b */
    static final class C40227b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f104544a;

        C40227b(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f104544a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            C35563c.f93230L.mo93341a(Property.ReactDuetSettingChanged, true);
            AVSettings aVSettings = C35563c.f93230L;
            Property property = Property.ReactDuetSettingCurrent;
            CommonItemView commonItemView = (CommonItemView) this.f104544a.mo100018a(R.id.coa);
            C7573i.m23582a((Object) commonItemView, "react_duet_setting_item");
            if (commonItemView.mo25778c()) {
                i = C37558ak.f97966e;
            } else {
                i = C37558ak.f97967f;
            }
            aVSettings.mo93338a(property, i);
            CommonItemView commonItemView2 = (CommonItemView) this.f104544a.mo100018a(R.id.coa);
            C7573i.m23582a((Object) commonItemView2, "react_duet_setting_item");
            CommonItemView commonItemView3 = (CommonItemView) this.f104544a.mo100018a(R.id.coa);
            C7573i.m23582a((Object) commonItemView3, "react_duet_setting_item");
            commonItemView2.setChecked(!commonItemView3.mo25778c());
            String str2 = "click_react_duet_control";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f104544a.f104536a).mo59973a("enter_from", "video_post_page");
            String str3 = "to_status";
            CommonItemView commonItemView4 = (CommonItemView) this.f104544a.mo100018a(R.id.coa);
            C7573i.m23582a((Object) commonItemView4, "react_duet_setting_item");
            if (commonItemView4.mo25778c()) {
                str = "on";
            } else {
                str = "off";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$c */
    public static final class C40228c implements C10797a {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f104545a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C40228c(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f104545a = publishPrivacySettingActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f104545a.onBackPressed();
        }
    }

    /* renamed from: a */
    public final View mo100018a(int i) {
        if (this.f104542g == null) {
            this.f104542g = new HashMap();
        }
        View view = (View) this.f104542g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104542g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private final void m128541b() {
        m128542c();
        m128543d();
        m128544e();
        m128545f();
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: c */
    private final void m128542c() {
        C35563c.f93257t.mo83276a((CommonItemView) mo100018a(R.id.zp), this.f104537b, this.f104540e);
    }

    /* renamed from: f */
    private final void m128545f() {
        ((ButtonTitleBar) mo100018a(R.id.djz)).setTitle((int) R.string.d4s);
        ((ButtonTitleBar) mo100018a(R.id.djz)).setOnTitleBarClickListener(new C40228c(this));
    }

    public final void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: a */
    private final void m128540a() {
        this.f104537b = getIntent().getBooleanExtra("comment_item_checked", false);
        this.f104538c = getIntent().getBooleanExtra("react_duet_item_checked", false);
        this.f104539d = getIntent().getBooleanExtra("download_item_checked", true);
        this.f104541f = getIntent().getBooleanExtra("can_react_duet", true);
        String stringExtra = getIntent().getStringExtra("creation_id");
        C7573i.m23582a((Object) stringExtra, "intent.getStringExtra(\"creation_id\")");
        this.f104536a = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("mob_data");
        if (serializableExtra != null) {
            this.f104540e = (HashMap) serializableExtra;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
    }

    /* renamed from: d */
    private final void m128543d() {
        if (!C37558ak.m120317a() || !this.f104541f) {
            CommonItemView commonItemView = (CommonItemView) mo100018a(R.id.coa);
            C7573i.m23582a((Object) commonItemView, "react_duet_setting_item");
            commonItemView.setVisibility(8);
            return;
        }
        CommonItemView commonItemView2 = (CommonItemView) mo100018a(R.id.coa);
        C7573i.m23582a((Object) commonItemView2, "react_duet_setting_item");
        commonItemView2.setVisibility(0);
        CommonItemView commonItemView3 = (CommonItemView) mo100018a(R.id.coa);
        C7573i.m23582a((Object) commonItemView3, "react_duet_setting_item");
        commonItemView3.setChecked(this.f104538c);
        ((CommonItemView) mo100018a(R.id.coa)).setOnClickListener(new C40227b(this));
    }

    /* renamed from: e */
    private final void m128544e() {
        if (C40240f.f104570a.mo100037c()) {
            CommonItemView commonItemView = (CommonItemView) mo100018a(R.id.fi);
            C7573i.m23582a((Object) commonItemView, "allow_download_setting_item");
            commonItemView.setVisibility(0);
            CommonItemView commonItemView2 = (CommonItemView) mo100018a(R.id.fi);
            C7573i.m23582a((Object) commonItemView2, "allow_download_setting_item");
            commonItemView2.setChecked(this.f104539d);
            ((CommonItemView) mo100018a(R.id.fi)).setOnClickListener(new C40226a(this));
            return;
        }
        CommonItemView commonItemView3 = (CommonItemView) mo100018a(R.id.fi);
        C7573i.m23582a((Object) commonItemView3, "allow_download_setting_item");
        commonItemView3.setVisibility(8);
    }

    public final void onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        CommonItemView commonItemView = (CommonItemView) mo100018a(R.id.zp);
        C7573i.m23582a((Object) commonItemView, "comment_setting_item");
        bundle.putBoolean("comment_item_checked", commonItemView.mo25778c());
        CommonItemView commonItemView2 = (CommonItemView) mo100018a(R.id.coa);
        C7573i.m23582a((Object) commonItemView2, "react_duet_setting_item");
        bundle.putBoolean("react_duet_item_checked", commonItemView2.mo25778c());
        CommonItemView commonItemView3 = (CommonItemView) mo100018a(R.id.fi);
        C7573i.m23582a((Object) commonItemView3, "allow_download_setting_item");
        bundle.putBoolean("download_item_checked", commonItemView3.mo25778c());
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e_);
        m128540a();
        m128541b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", false);
    }
}
