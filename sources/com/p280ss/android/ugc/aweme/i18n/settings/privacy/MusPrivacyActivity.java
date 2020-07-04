package com.p280ss.android.ugc.aweme.i18n.settings.privacy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p337ui.PrivacyActivity;
import com.p280ss.android.ugc.aweme.setting.personalization.PersonalizationActivity;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity */
public class MusPrivacyActivity extends PrivacyActivity {
    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    public final void mo59893d() {
        startActivity(new Intent(this, MusBlackListActivity.class));
        C6907h.onEvent(new MobClick().setEventName("black_list").setLabelName("message"));
    }

    /* renamed from: m */
    private void m99754m() {
        if (C43122ff.m136767b()) {
            this.personalizationDiv.setVisibility(8);
            this.mPersonalizationItem.setVisibility(8);
            this.contactItem.setVisibility(8);
            this.mPrivacyManagerItem.setVisibility(8);
            this.mPrivateAccount.setVisibility(8);
            this.mCommentManagerItem.setVisibility(8);
            this.mReactItem.setVisibility(8);
            this.mDuetItem.setVisibility(8);
            this.mDownloadItem.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo58711c() {
        super.mo58711c();
        m99754m();
        mo80278i();
        if (C21115b.m71197a().getCurUser().isForcePrivateAccount()) {
            this.mPrivateAccount.setAlpha(0.34f);
            this.mPrivateAccount.setOnClickListener(new C30541a(this));
        }
        mo95214k();
    }

    /* renamed from: i */
    public final void mo80278i() {
        if (m99753j()) {
            this.mPersonalizationItem.setVisibility(8);
            this.personalizationDiv.setVisibility(8);
            this.safeDivider.setVisibility(8);
            return;
        }
        this.mPersonalizationItem.setOnClickListener(new C30542b(this));
    }

    /* renamed from: j */
    public static boolean m99753j() {
        if ((((Integer) SharePrefCache.inst().getPersonalizationMode().mo59877d()).intValue() != 2 || PrivacyActivity.m120881l().booleanValue() || C25789b.m84764k() != 0) && C7213d.m22500a().mo18763aa() && ((((Boolean) C23060u.m75742a().mo60060ad().mo59877d()).booleanValue() || PrivacyActivity.m120881l().booleanValue() || C25789b.m84764k() != 0) && !C43122ff.m136767b())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo80277b(View view) {
        C10761a.m31399c((Context) this, (int) R.string.b4w).mo25750a();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80276a(View view) {
        String str;
        Intent intent = new Intent(this, PersonalizationActivity.class);
        intent.putExtra("user_data_download", m120881l());
        startActivity(intent);
        String str2 = "show_personalization_status";
        C22984d dVar = new C22984d();
        String str3 = "initial_status";
        if (((Integer) SharePrefCache.inst().getPersonalizationMode().mo59877d()).intValue() == 0) {
            str = "off";
        } else {
            str = "on";
        }
        C6907h.m21524a(str2, (Map) dVar.mo59973a(str3, str).f60753a);
    }
}
