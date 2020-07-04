package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity */
public class DownloadControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: e */
    public final String mo95114e() {
        return "download_setting";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void bJ_() {
        C10761a.m31399c((Context) this, (int) R.string.cjr).mo25750a();
    }

    /* renamed from: c */
    public final void mo95111c() {
        this.f98361a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    /* renamed from: f */
    public final void mo95115f() {
        this.mEveryoneItem.setTag(Integer.valueOf(0));
        this.mOffItem.setTag(Integer.valueOf(3));
        if (!C6399b.m19944t()) {
            this.mFriendsItem.setTag(Integer.valueOf(1));
        }
    }

    /* renamed from: d */
    public final void mo95113d() {
        if (C6399b.m19946v()) {
            this.mTitle.setText(getString(R.string.i4));
            this.mEveryoneItem.setLeftText(getString(R.string.avd));
        } else {
            this.mTitle.setText(getString(R.string.avc));
        }
        if (C6399b.m19944t()) {
            this.mFriendsItem.setVisibility(8);
        }
        if (((Boolean) SharePrefCache.inst().getIsShowAllowDownloadTipSetting().mo59877d()).booleanValue()) {
            mo95108a((CharSequence) getString(R.string.i6));
        }
        int i = this.f98361a;
        if (i != 3) {
            switch (i) {
                case 0:
                    m120668a(this.mEveryoneItem);
                    return;
                case 1:
                    if (!C6399b.m19944t()) {
                        m120668a(this.mFriendsItem);
                        return;
                    }
                    break;
            }
        }
        m120668a(this.mOffItem);
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

    public void onClick(View view) {
        if (view != null) {
            boolean isSecret = C21115b.m71197a().getCurUser().isSecret();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!isSecret || !(intValue == 0 || intValue == 1)) {
                super.onClick(view);
            } else {
                C10761a.m31409e((Context) this, (int) R.string.d4y).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public static final void m120774a(Activity activity, int i) {
        Intent intent = new Intent(activity, DownloadControlSettingActivity.class);
        intent.putExtra("currentSettingsValue", i);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static final void m120775a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, DownloadControlSettingActivity.class);
        intent.putExtra("currentSettingsValue", i);
        activity.startActivityForResult(intent, 4);
    }
}
