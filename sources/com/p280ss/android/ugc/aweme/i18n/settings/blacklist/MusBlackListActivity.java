package com.p280ss.android.ugc.aweme.i18n.settings.blacklist;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.setting.adapter.BlackListAdapter;
import com.p280ss.android.ugc.aweme.setting.p337ui.BlackListActivity;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity */
public class MusBlackListActivity extends BlackListActivity {
    RecyclerView mRecyclerView;

    /* renamed from: j */
    public final void mo80272j() {
        super.mo80272j();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: k */
    public final BlackListAdapter mo80273k() {
        return new MusBlackListAdapter(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity", "onCreate", false);
    }
}
