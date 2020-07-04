package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity */
public class ProfileMoreActivity extends AmeSSActivity {

    /* renamed from: a */
    private int f95166a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity$a */
    public interface C36272a {
        /* renamed from: a */
        boolean mo92036a();
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    public void onBackPressed() {
        List<Fragment> f = getSupportFragmentManager().mo2658f();
        if (C6307b.m19566a((Collection<T>) f)) {
            super.onBackPressed();
            return;
        }
        boolean z = true;
        for (Fragment fragment : f) {
            if (fragment instanceof C36272a) {
                z = ((C36272a) fragment).mo92036a();
                if (!z) {
                    break;
                }
            }
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        if (!C6399b.m19944t()) {
            getWindow().setSoftInputMode(48);
        }
        this.f95166a = getIntent().getIntExtra("init_page_type", 0);
        if (this.f95166a == 1) {
            C0633q a = getSupportFragmentManager().mo2645a();
            a.mo2585a((int) R.id.aoy, (Fragment) MultilineInputFragment.m116673a(R.string.ayy, R.string.de_, R.string.cv6, 20, getIntent().getStringExtra("remark"), getIntent().getStringExtra("uid"), getIntent().getExtras()));
            a.mo2604c();
            return;
        }
        C0633q a2 = getSupportFragmentManager().mo2645a();
        a2.mo2585a((int) R.id.aoy, (Fragment) ProfileMoreFragment.m117232a(getIntent().getExtras()));
        a2.mo2604c();
    }
}
