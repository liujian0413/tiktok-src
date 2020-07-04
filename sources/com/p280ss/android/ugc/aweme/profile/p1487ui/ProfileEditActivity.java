package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.view.MotionEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity */
public class ProfileEditActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    public ProfileEditFragment f95018b;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity$a */
    public interface C36221a {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        this.f95018b.mo92268h();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.c2, R.anim.cf);
    }

    public void setStatusBarColor() {
        if (!C7212bb.m22494a((Activity) this)) {
            if (C6399b.m19944t()) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setCustomStatusBarInLayout(this);
            } else {
                C10994a.m32208b(this);
            }
        }
    }

    /* renamed from: a */
    private void m117083a() {
        C0633q a = getSupportFragmentManager().mo2645a();
        this.f95018b = (ProfileEditFragment) getSupportFragmentManager().mo2644a("user_profile_edit_fragment");
        if (this.f95018b == null) {
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (iBridgeService != null) {
                this.f95018b = iBridgeService.createUserProfileEditFragment();
            }
            if (this.f95018b == null) {
                this.f95018b = new ProfileEditFragment();
            }
            this.f95018b.setArguments(m117086b());
            a.mo2600b(R.id.aoy, this.f95018b, "user_profile_edit_fragment");
        }
        a.mo2604c();
    }

    /* renamed from: b */
    private Bundle m117086b() {
        Bundle bundle = new Bundle();
        if (getIntent() != null) {
            bundle.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
            bundle.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
            bundle.putString("enter_from", getIntent().getStringExtra("enter_from"));
            bundle.putString("enter_method", getIntent().getStringExtra("enter_method"));
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m117084a(Activity activity) {
        m117085a(activity, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f95018b.mo92251a(motionEvent) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        if (!C6399b.m19944t()) {
            getWindow().setSoftInputMode(48);
        }
        m117083a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m117085a(Activity activity, Bundle bundle) {
        if (activity != null) {
            if (bundle == null) {
                activity.startActivity(new Intent(activity, ProfileEditActivity.class));
                return;
            }
            Intent intent = new Intent(activity, ProfileEditActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f95018b.onActivityResult(i, i2, intent);
    }
}
