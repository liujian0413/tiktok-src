package com.p280ss.android.ugc.aweme.app.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p336a.C37539h;
import com.p280ss.android.ugc.aweme.setting.p336a.C7204b;
import com.p280ss.android.ugc.aweme.setting.p336a.C7206i;
import com.p280ss.android.ugc.aweme.setting.p337ui.AbStateView;
import com.p280ss.android.ugc.aweme.setting.p337ui.AbSwitchView;
import java.lang.reflect.Field;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity */
public class AbTestSettingActivity extends AbsABActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58711c() {
        this.f60662d = C7213d.m22500a().mo18803bo();
        Field[] declaredFields = this.f60662d.getClass().getDeclaredFields();
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        for (Field field : declaredFields) {
            if (((C7204b) field.getAnnotation(C7204b.class)) != null && field.getType().equals(Boolean.TYPE)) {
                treeMap2.put(field.getName(), field);
            } else if (((C7206i) field.getAnnotation(C7206i.class)) != null && field.getType().equals(Integer.TYPE)) {
                treeMap.put(new C37539h(field, this.f60662d).mo94824b(), field);
            }
        }
        for (Field field2 : treeMap2.values()) {
            AbSwitchView abSwitchView = new AbSwitchView(this);
            abSwitchView.mo95091a(field2, this.f60662d);
            this.f60661c.addView(abSwitchView);
        }
        for (Field field3 : treeMap.values()) {
            AbStateView abStateView = new AbStateView(this);
            abStateView.mo95088a(field3, (Object) this.f60662d);
            this.f60661c.addView(abStateView);
        }
    }

    /* renamed from: a */
    public static void m75419a(Context context, AbTestSettingPageParam abTestSettingPageParam) {
        Intent intent = new Intent(context, AbTestSettingActivity.class);
        intent.putExtra("paeg_param", abTestSettingPageParam);
        context.startActivity(intent);
    }
}
