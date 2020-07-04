package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItemBase.C10811a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23660c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.livewallpaper.p1370ui.LocalLiveWallPaperActivity;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity */
public final class AccessibilitySettingActivity extends AmeBaseActivity {

    /* renamed from: a */
    private HashMap f98340a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$a */
    static final class C37739a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f98341a;

        C37739a(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f98341a = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98341a.mo58711c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$b */
    static final class C37740b implements C10811a {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f98342a;

        C37740b(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f98342a = accessibilitySettingActivity;
        }

        /* renamed from: a */
        public final void mo26010a(View view) {
            if (!C27326a.m89578a(view)) {
                this.f98342a.mo59893d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$c */
    static final class C37741c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f98343a;

        C37741c(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f98343a = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98343a.finish();
        }
    }

    /* renamed from: a */
    private View m120644a(int i) {
        if (this.f98340a == null) {
            this.f98340a = new HashMap();
        }
        View view = (View) this.f98340a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98340a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.a5;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: j */
    private final void m120646j() {
        CommonItemView commonItemView = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView, "cover_item");
        commonItemView.setChecked(C37656k.m120485a(this));
    }

    /* renamed from: d */
    public final void mo59893d() {
        C6907h.m21524a("live_photo_manage", (Map) C22984d.m75611a().mo59973a("enter_from", "accessibility").f60753a);
        startActivity(new Intent(this, LocalLiveWallPaperActivity.class));
    }

    /* renamed from: c */
    public final void mo58711c() {
        String str;
        CommonItemView commonItemView = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView, "cover_item");
        CommonItemView commonItemView2 = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView2, "cover_item");
        commonItemView.setChecked(!commonItemView2.mo25778c());
        Context context = this;
        String str2 = "dynamic_cover";
        CommonItemView commonItemView3 = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView3, "cover_item");
        if (commonItemView3.mo25778c()) {
            str = "on";
        } else {
            str = "off";
        }
        C19282c.m63182a(context, str2, str);
        CommonItemView commonItemView4 = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView4, "cover_item");
        C37656k.m120484a(context, commonItemView4.mo25778c());
        CommonItemView commonItemView5 = (CommonItemView) m120644a(R.id.a4k);
        C7573i.m23582a((Object) commonItemView5, "cover_item");
        C42961az.m136380a(new C23660c(commonItemView5.mo25778c() ^ true ? 1 : 0));
    }

    /* renamed from: i */
    private final void m120645i() {
        View findViewById = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.c5));
        if (C7188c.m22428a()) {
            CommonItemView commonItemView = (CommonItemView) m120644a(R.id.a4k);
            C7573i.m23582a((Object) commonItemView, "cover_item");
            commonItemView.setVisibility(8);
        }
        if (C6399b.m19944t()) {
            ((CommonItemView) m120644a(R.id.a4k)).setRightIconRes(0);
            View findViewById2 = findViewById(R.id.bbo);
            C7573i.m23582a((Object) findViewById2, "rightIcon");
            findViewById2.setVisibility(8);
        }
        ((CommonItemView) m120644a(R.id.a4k)).setOnClickListener(new C37739a(this));
        if (C32577e.m105506d()) {
            EffectiveSettingItem effectiveSettingItem = (EffectiveSettingItem) m120644a(R.id.bue);
            C7573i.m23582a((Object) effectiveSettingItem, "local_livewallpaper");
            effectiveSettingItem.setVisibility(8);
        } else {
            EffectiveSettingItem effectiveSettingItem2 = (EffectiveSettingItem) m120644a(R.id.bue);
            C7573i.m23582a((Object) effectiveSettingItem2, "local_livewallpaper");
            effectiveSettingItem2.setVisibility(0);
            ((EffectiveSettingItem) m120644a(R.id.bue)).setOnSettingItemClickListener(new C37740b(this));
        }
        findViewById(R.id.jo).setOnClickListener(new C37741c(this));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m120645i();
        m120646j();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onCreate", false);
    }
}
