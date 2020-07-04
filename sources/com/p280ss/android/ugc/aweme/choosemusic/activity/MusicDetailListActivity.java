package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.C23938n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity */
public class MusicDetailListActivity extends AmeSSActivity {
    /* renamed from: b */
    private static String m78050b(int i) {
        switch (i) {
            case 1:
                return "hot_music_list";
            case 2:
                return "music_class_sheet";
            case 3:
                return "local_music_list";
            case 4:
                return "tag_music_sheet";
            case 5:
                return "local_music_list_shoot";
            case 6:
                return "local_music_list_edit";
            default:
                return "";
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    private void m78049a(int i) {
        String b = m78050b(i);
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a(b);
        if (a == null) {
            a = C23938n.m78570a(i, getIntent());
        }
        C0633q a2 = supportFragmentManager.mo2645a();
        a2.mo2600b(R.id.aoy, a, b);
        a2.mo2606d();
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dg);
        if (getIntent() != null) {
            if (!TextUtils.isEmpty(getIntent().getStringExtra("cid"))) {
                i = 2;
            } else {
                i = getIntent().getIntExtra("music_type", 1);
            }
            if (C6399b.m19946v()) {
                ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a71).statusBarDarkFont(true).init();
            } else {
                ImmersionBar.with((Activity) this).statusBarColor((int) R.color.az3).statusBarDarkFont(true).init();
            }
            m78049a(i);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", false);
    }
}
