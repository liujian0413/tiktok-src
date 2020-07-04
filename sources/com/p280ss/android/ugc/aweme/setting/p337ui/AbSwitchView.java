package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37618a;
import com.p280ss.android.ugc.aweme.setting.p336a.C7204b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AbSwitchView */
public class AbSwitchView extends FrameLayout {

    /* renamed from: a */
    public SettingItemSwitch f98329a;

    /* renamed from: b */
    private Field f98330b;

    /* renamed from: a */
    private void m120635a() {
        this.f98329a = (SettingItemSwitch) findViewById(R.id.b37);
    }

    public AbSwitchView(Context context) {
        this(context, null);
    }

    public AbSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo95091a(final Field field, final Object obj) {
        if (field.getType().equals(Boolean.TYPE)) {
            this.f98330b = field;
            this.f98330b.setAccessible(true);
            try {
                mo95092b(field, obj);
                this.f98329a.setOnSettingItemClickListener(new C10813a() {
                    public final void OnSettingItemClick(View view) {
                        try {
                            if (AbSwitchView.this.f98329a.mo26028a()) {
                                field.set(obj, Boolean.valueOf(false));
                            } else {
                                field.set(obj, Boolean.valueOf(true));
                            }
                            AbSwitchView.this.mo95092b(field, obj);
                            C42961az.m136380a(new C37618a());
                        } catch (IllegalAccessException unused) {
                        }
                    }
                });
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo95092b(Field field, Object obj) throws IllegalAccessException {
        String str;
        SettingItemSwitch settingItemSwitch;
        boolean booleanValue = ((Boolean) field.get(obj)).booleanValue();
        C7204b bVar = (C7204b) field.getAnnotation(C7204b.class);
        this.f98329a.setChecked(booleanValue);
        if (!TextUtils.isEmpty(bVar.mo18697b()) || !TextUtils.isEmpty(bVar.mo18696a())) {
            settingItemSwitch = this.f98329a;
            if (booleanValue) {
                str = bVar.mo18696a();
            } else {
                str = bVar.mo18697b();
            }
        } else {
            SettingItemSwitch settingItemSwitch2 = this.f98329a;
            str = field.getName();
            settingItemSwitch = settingItemSwitch2;
        }
        settingItemSwitch.setStartText(str);
    }

    public AbSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a4g, this, true);
        m120635a();
    }
}
