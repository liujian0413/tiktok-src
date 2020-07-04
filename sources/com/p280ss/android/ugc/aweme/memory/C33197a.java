package com.p280ss.android.ugc.aweme.memory;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.example.leakinterface.C13072a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.memory.a */
public final class C33197a extends Dialog {

    /* renamed from: com.ss.android.ugc.aweme.memory.a$a */
    static final class C33198a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f86383a;

        C33198a(SettingItemSwitch settingItemSwitch) {
            this.f86383a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SettingItemSwitch settingItemSwitch = this.f86383a;
            C7573i.m23582a((Object) settingItemSwitch, "itemSwitch");
            SettingItemSwitch settingItemSwitch2 = this.f86383a;
            C7573i.m23582a((Object) settingItemSwitch2, "itemSwitch");
            settingItemSwitch.setChecked(!settingItemSwitch2.mo26028a());
            SettingItemSwitch settingItemSwitch3 = this.f86383a;
            C7573i.m23582a((Object) settingItemSwitch3, "itemSwitch");
            C13072a.m38217a(settingItemSwitch3.mo26028a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.memory.a$b */
    static final class C33199b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33197a f86384a;

        /* renamed from: b */
        final /* synthetic */ DmtEditText f86385b;

        /* renamed from: c */
        final /* synthetic */ DmtEditText f86386c;

        /* renamed from: d */
        final /* synthetic */ DmtEditText f86387d;

        C33199b(C33197a aVar, DmtEditText dmtEditText, DmtEditText dmtEditText2, DmtEditText dmtEditText3) {
            this.f86384a = aVar;
            this.f86385b = dmtEditText;
            this.f86386c = dmtEditText2;
            this.f86387d = dmtEditText3;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = this.f86385b;
            if (dmtEditText != null) {
                Editable text = dmtEditText.getText();
                if (text != null) {
                    try {
                        long parseLong = Long.parseLong(text.toString());
                        if (parseLong > 0) {
                            C13072a.m38216a(parseLong);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            DmtEditText dmtEditText2 = this.f86386c;
            if (dmtEditText2 != null) {
                Editable text2 = dmtEditText2.getText();
                if (text2 != null) {
                    try {
                        int parseInt = Integer.parseInt(text2.toString());
                        if (parseInt > 0) {
                            C13072a.m38215a(parseInt);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            DmtEditText dmtEditText3 = this.f86387d;
            if (dmtEditText3 != null) {
                Editable text3 = dmtEditText3.getText();
                if (text3 != null) {
                    try {
                        int parseInt2 = Integer.parseInt(text3.toString());
                        if (parseInt2 > 0) {
                            C13072a.m38219b(parseInt2);
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            this.f86384a.dismiss();
        }
    }

    public C33197a(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        setContentView(R.layout.k8);
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) findViewById(R.id.aj2);
        DmtEditText dmtEditText = (DmtEditText) findViewById(R.id.b2o);
        DmtEditText dmtEditText2 = (DmtEditText) findViewById(R.id.dn4);
        DmtEditText dmtEditText3 = (DmtEditText) findViewById(R.id.d71);
        settingItemSwitch.setChecked(C13072a.m38218a());
        settingItemSwitch.setOnClickListener(new C33198a(settingItemSwitch));
        Button button = (Button) findViewById(R.id.a10);
        if (button != null) {
            button.setOnClickListener(new C33199b(this, dmtEditText, dmtEditText2, dmtEditText3));
        }
        setCanceledOnTouchOutside(true);
    }
}
