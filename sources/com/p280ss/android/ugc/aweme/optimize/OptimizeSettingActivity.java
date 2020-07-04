package com.p280ss.android.ugc.aweme.optimize;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.performance.p1249a.C29347a;
import com.p280ss.android.ugc.aweme.performance.p1249a.C29348b;
import com.p280ss.android.ugc.aweme.performance.p1250b.C29350a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity */
public final class OptimizeSettingActivity extends AppCompatActivity {

    /* renamed from: a */
    private C7321c f90488a;

    /* renamed from: b */
    private HashMap f90489b;

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$a */
    public static final class C34700a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f90490a;

        /* renamed from: b */
        final /* synthetic */ OptimizeSettingActivity f90491b;

        public C34700a(SettingItemSwitch settingItemSwitch, OptimizeSettingActivity optimizeSettingActivity) {
            this.f90490a = settingItemSwitch;
            this.f90491b = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90490a.toggle();
            C7188c.m22426a((Context) this.f90491b, this.f90490a.isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$b */
    public static final class C34701b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f90492a;

        public C34701b(OptimizeSettingActivity optimizeSettingActivity) {
            this.f90492a = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90492a.startActivity(new Intent(this.f90492a, LayerInfoSettingActivity.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$c */
    public static final class C34702c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f90493a;

        public C34702c(SettingItemSwitch settingItemSwitch) {
            this.f90493a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90493a.toggle();
            C34707a.m112020a(this.f90493a.isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$d */
    public static final class C34703d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f90494a;

        /* renamed from: b */
        final /* synthetic */ OptimizeSettingActivity f90495b;

        public C34703d(SettingItemSwitch settingItemSwitch, OptimizeSettingActivity optimizeSettingActivity) {
            this.f90494a = settingItemSwitch;
            this.f90495b = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90494a.toggle();
            SettingItemSwitch settingItemSwitch = this.f90494a;
            C34707a.m112023b(settingItemSwitch.isChecked());
            if (settingItemSwitch.isChecked()) {
                C29348b.m96317a();
                C29347a.m96316a(this.f90495b);
                return;
            }
            C29348b.m96318a(this.f90495b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$e */
    public static final class C34704e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f90496a;

        public C34704e(SettingItemSwitch settingItemSwitch) {
            this.f90496a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90496a.toggle();
            SettingItemSwitch settingItemSwitch = this.f90496a;
            C34707a.m112025c(settingItemSwitch.isChecked());
            settingItemSwitch.isChecked();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$f */
    static final class C34705f<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f90497a;

        C34705f(OptimizeSettingActivity optimizeSettingActivity) {
            this.f90497a = optimizeSettingActivity;
        }

        public final void subscribe(C47870u<String> uVar) {
            String str;
            C7573i.m23587b(uVar, "it");
            Pair a = C7188c.m22424a((Context) this.f90497a);
            StringBuilder sb = new StringBuilder("低端机判断: 本机");
            Object obj = a.first;
            C7573i.m23582a(obj, "p.first");
            if (((Boolean) obj).booleanValue()) {
                StringBuilder sb2 = new StringBuilder("为低端机, 满足条件:\n");
                sb2.append((String) a.second);
                str = sb2.toString();
            } else {
                str = "不为低端机";
            }
            sb.append(str);
            uVar.mo19239a((Object) sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$g */
    static final class C34706g<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f90498a;

        C34706g(OptimizeSettingActivity optimizeSettingActivity) {
            this.f90498a = optimizeSettingActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            DmtTextView dmtTextView = (DmtTextView) this.f90498a.mo88023a(R.id.dzf);
            C7573i.m23582a((Object) dmtTextView, "tv_performance");
            dmtTextView.setText(str);
        }
    }

    /* renamed from: a */
    public final View mo88023a(int i) {
        if (this.f90489b == null) {
            this.f90489b = new HashMap();
        }
        View view = (View) this.f90489b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f90489b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C7321c cVar = this.f90488a;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    private final void m112015a() {
        if (C34707a.m112024b()) {
            C29348b.m96317a();
            C29347a.m96316a(this);
        }
        C29350a.m96320a(this);
        C34707a.m112026c();
    }

    /* renamed from: b */
    private void m112016b() {
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) mo88023a(R.id.d7e);
        C7573i.m23582a((Object) settingItemSwitch, "sis_mock_performance_poor");
        settingItemSwitch.setChecked(C7188c.m22428a());
        settingItemSwitch.setOnClickListener(new C34700a(settingItemSwitch, this));
        SettingItem settingItem = (SettingItem) mo88023a(R.id.d6m);
        C7573i.m23582a((Object) settingItem, "si_layer_setting");
        settingItem.setOnClickListener(new C34701b(this));
        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) mo88023a(R.id.d7d);
        C7573i.m23582a((Object) settingItemSwitch2, "sis_log_open");
        settingItemSwitch2.setChecked(C34707a.m112021a());
        settingItemSwitch2.setOnClickListener(new C34702c(settingItemSwitch2));
        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) mo88023a(R.id.d7b);
        C7573i.m23582a((Object) settingItemSwitch3, "sis_fps_open");
        settingItemSwitch3.setChecked(C34707a.m112024b());
        settingItemSwitch3.setOnClickListener(new C34703d(settingItemSwitch3, this));
        SettingItemSwitch settingItemSwitch4 = (SettingItemSwitch) mo88023a(R.id.d77);
        C7573i.m23582a((Object) settingItemSwitch4, "sis_draw_checker_open");
        settingItemSwitch4.setChecked(C34707a.m112026c());
        settingItemSwitch4.setOnClickListener(new C34704e(settingItemSwitch4));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dn);
        this.f90488a = C7492s.m23282a((C7495v<T>) new C34705f<T>(this)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C34706g<Object>(this));
        m112016b();
        m112015a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onCreate", false);
    }
}
