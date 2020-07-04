package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity */
public class CommentControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: e */
    public final String mo95114e() {
        return "comment";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onWindowFocusChanged", true);
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
        this.mTitle.setText(getString(R.string.a7v));
        String[] stringArray = getResources().getStringArray(R.array.l);
        boolean a = m120702a(stringArray);
        int i = this.f98361a;
        if (i != 3) {
            switch (i) {
                case 0:
                    m120668a(this.mEveryoneItem);
                    if (a) {
                        this.mEveryoneItem.setLeftText(stringArray[0]);
                        return;
                    }
                    break;
                case 1:
                    m120668a(this.mFriendsItem);
                    if (a) {
                        this.mFriendsItem.setLeftText(stringArray[1]);
                        return;
                    }
                    break;
            }
        } else {
            m120668a(this.mOffItem);
            if (a) {
                this.mOffItem.setLeftText(stringArray[3]);
            }
        }
    }

    /* renamed from: a */
    private static boolean m120702a(String[] strArr) {
        if (strArr == null || strArr.length != 4) {
            return false;
        }
        return true;
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
    public static final void m120701a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, CommentControlSettingActivity.class);
        intent.putExtra("currentSettingsValue", i);
        activity.startActivityForResult(intent, 3);
    }
}
