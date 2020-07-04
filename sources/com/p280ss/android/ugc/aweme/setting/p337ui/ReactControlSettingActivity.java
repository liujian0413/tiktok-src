package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity */
public class ReactControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: e */
    public final String mo95114e() {
        return "react";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo95111c() {
        this.f98361a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    /* renamed from: f */
    public final void mo95115f() {
        this.mEveryoneItem.setTag(Integer.valueOf(0));
        this.mFriendsItem.setTag(Integer.valueOf(1));
        this.mOffItem.setTag(Integer.valueOf(3));
    }

    /* renamed from: d */
    public final void mo95113d() {
        this.mTitle.setText(getString(R.string.fsa));
        if (C21115b.m71197a().getCurUser().isSecret()) {
            mo95108a((CharSequence) getString(R.string.dba));
        }
        int i = this.f98361a;
        if (i != 3) {
            switch (i) {
                case 0:
                    m120668a(this.mEveryoneItem);
                    return;
                case 1:
                    m120668a(this.mFriendsItem);
                    this.mFriendsItem.setLeftText(getString(R.string.cqv));
                    return;
            }
        } else {
            m120668a(this.mOffItem);
        }
    }

    /* renamed from: a */
    public final void mo95107a(int i) {
        if (i != 3) {
            switch (i) {
                case 0:
                    m120668a(this.mEveryoneItem);
                    return;
                case 1:
                    m120668a(this.mFriendsItem);
                    return;
            }
        } else {
            m120668a(this.mOffItem);
        }
    }

    /* renamed from: a */
    public static final void m120947a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, ReactControlSettingActivity.class);
        intent.putExtra("currentSettingsValue", i);
        activity.startActivityForResult(intent, 5);
    }
}
