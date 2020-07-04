package com.p280ss.android.ugc.aweme.optimize;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.performance.p1250b.C29350a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity */
public final class LayerInfoSettingActivity extends AppCompatActivity {

    /* renamed from: a */
    public SharedPreferences f90483a;

    /* renamed from: b */
    private HashMap f90484b;

    /* renamed from: com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity$a */
    static final class C34699a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LayerInfoSettingActivity f90485a;

        /* renamed from: b */
        final /* synthetic */ SettingItemSwitch f90486b;

        /* renamed from: c */
        final /* synthetic */ String f90487c;

        C34699a(LayerInfoSettingActivity layerInfoSettingActivity, SettingItemSwitch settingItemSwitch, String str) {
            this.f90485a = layerInfoSettingActivity;
            this.f90486b = settingItemSwitch;
            this.f90487c = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90486b.toggle();
            LayerInfoSettingActivity.m112011a(this.f90485a).edit().putBoolean(this.f90487c, this.f90486b.isChecked()).apply();
        }
    }

    /* renamed from: a */
    private View m112012a(int i) {
        if (this.f90484b == null) {
            this.f90484b = new HashMap();
        }
        View view = (View) this.f90484b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f90484b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C29350a.m96320a(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ SharedPreferences m112011a(LayerInfoSettingActivity layerInfoSettingActivity) {
        SharedPreferences sharedPreferences = layerInfoSettingActivity.f90483a;
        if (sharedPreferences == null) {
            C7573i.m23583a("sp");
        }
        return sharedPreferences;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cj);
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "LayerInfoTest", 0);
        C7573i.m23582a((Object) a, "AppContextManager.getApp…t\", Context.MODE_PRIVATE)");
        this.f90483a = a;
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) m112012a((int) R.id.d7f);
        C7573i.m23582a((Object) settingItemSwitch, "sis_open");
        m112013a(settingItemSwitch, "Open", false);
        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) m112012a((int) R.id.d78);
        C7573i.m23582a((Object) settingItemSwitch2, "sis_filter_no_bg");
        m112013a(settingItemSwitch2, "FNoBg", true);
        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) m112012a((int) R.id.d79);
        C7573i.m23582a((Object) settingItemSwitch3, "sis_filter_not_in_frame");
        m112013a(settingItemSwitch3, "FNoInFrame", true);
        SettingItemSwitch settingItemSwitch4 = (SettingItemSwitch) m112012a((int) R.id.d7_);
        C7573i.m23582a((Object) settingItemSwitch4, "sis_filter_size_100");
        m112013a(settingItemSwitch4, "FSize100", true);
        SettingItemSwitch settingItemSwitch5 = (SettingItemSwitch) m112012a((int) R.id.d7a);
        C7573i.m23582a((Object) settingItemSwitch5, "sis_filter_tv");
        m112013a(settingItemSwitch5, "FTv", true);
        SettingItemSwitch settingItemSwitch6 = (SettingItemSwitch) m112012a((int) R.id.d7c);
        C7573i.m23582a((Object) settingItemSwitch6, "sis_lighter_overdraw");
        m112013a(settingItemSwitch6, "LOverdraw", true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onCreate", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m112013a(SettingItemSwitch settingItemSwitch, String str, boolean z) {
        C7573i.m23587b(settingItemSwitch, "$this$bind");
        C7573i.m23587b(str, "name");
        SharedPreferences sharedPreferences = this.f90483a;
        if (sharedPreferences == null) {
            C7573i.m23583a("sp");
        }
        settingItemSwitch.setChecked(sharedPreferences.getBoolean(str, z));
        settingItemSwitch.setOnClickListener(new C34699a(this, settingItemSwitch, str));
    }
}
