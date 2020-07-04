package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.bytedance.p509f.C10052a;
import com.example.leakinterface.C13074c;
import com.example.leakinterface.C13076e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.memory.C33197a;
import com.p280ss.android.ugc.aweme.memory.C33202b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.PrintStream;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity */
public final class MemoryTestActivity extends AppCompatActivity {

    /* renamed from: a */
    public SettingItemSwitch f98448a;

    /* renamed from: b */
    public SettingItemSwitch f98449b;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity$a */
    static final class C37785a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MemoryTestActivity f98450a;

        C37785a(MemoryTestActivity memoryTestActivity) {
            this.f98450a = memoryTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f98450a.f98448a;
            if (settingItemSwitch == null) {
                C7573i.m23580a();
            }
            SettingItemSwitch settingItemSwitch2 = this.f98450a.f98448a;
            if (settingItemSwitch2 == null) {
                C7573i.m23580a();
            }
            settingItemSwitch.setChecked(!settingItemSwitch2.mo26028a());
            Context context = this.f98450a;
            SettingItemSwitch settingItemSwitch3 = this.f98450a.f98448a;
            if (settingItemSwitch3 == null) {
                C7573i.m23580a();
            }
            C13076e.m38224a(context, settingItemSwitch3.mo26028a());
            SettingItemSwitch settingItemSwitch4 = this.f98450a.f98448a;
            if (settingItemSwitch4 == null) {
                C7573i.m23580a();
            }
            C13074c.m38220a(settingItemSwitch4.mo26028a());
            C10761a.m31387a((Context) this.f98450a, "冷启后配置生效").mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity$b */
    static final class C37786b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MemoryTestActivity f98451a;

        C37786b(MemoryTestActivity memoryTestActivity) {
            this.f98451a = memoryTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f98451a.f98449b;
            if (settingItemSwitch == null) {
                C7573i.m23580a();
            }
            SettingItemSwitch settingItemSwitch2 = this.f98451a.f98449b;
            if (settingItemSwitch2 == null) {
                C7573i.m23580a();
            }
            settingItemSwitch.setChecked(!settingItemSwitch2.mo26028a());
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("nativeMemoryItem");
            SettingItemSwitch settingItemSwitch3 = this.f98451a.f98449b;
            if (settingItemSwitch3 == null) {
                C7573i.m23580a();
            }
            sb.append(settingItemSwitch3.isChecked());
            printStream.println(sb.toString());
            C33202b bVar = (C33202b) C23336d.m76560a(this.f98451a, C33202b.class);
            SettingItemSwitch settingItemSwitch4 = this.f98451a.f98449b;
            if (settingItemSwitch4 == null) {
                C7573i.m23580a();
            }
            bVar.mo60489b(Boolean.valueOf(settingItemSwitch4.mo26028a()));
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private final void m120800a() {
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) findViewById(R.id.bkq);
        settingItemSwitch.setChecked(C13074c.m38221a());
        this.f98448a = settingItemSwitch;
        SettingItemSwitch settingItemSwitch2 = this.f98448a;
        if (settingItemSwitch2 != null) {
            settingItemSwitch2.setOnClickListener(new C37785a(this));
        }
    }

    /* renamed from: b */
    private final void m120801b() {
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) findViewById(R.id.c3_);
        Boolean a = ((C33202b) C23336d.m76560a(this, C33202b.class)).mo60488a(Boolean.valueOf(true));
        C7573i.m23582a((Object) a, "SharedPreferencesHelper.…NativeMemoryMonitor(true)");
        settingItemSwitch.setChecked(a.booleanValue());
        this.f98449b = settingItemSwitch;
        SettingItemSwitch settingItemSwitch2 = this.f98449b;
        if (settingItemSwitch2 != null) {
            settingItemSwitch2.setOnClickListener(new C37786b(this));
        }
    }

    public final void triggerOOM(View view) {
        C7573i.m23587b(view, "v");
        C10052a.m29856a();
    }

    public final void configFdLeak(View view) {
        C7573i.m23587b(view, "v");
        new C33197a(this).show();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d9);
        m120800a();
        m120801b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MemoryTestActivity", "onCreate", false);
    }

    public final void startLeakActivity(View view) {
        C7573i.m23587b(view, "v");
        startActivity(new Intent(this, LeakTestActivity.class));
    }
}
