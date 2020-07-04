package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.friends.p1281a.C30000b;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.AbsSummonFriendActivity */
public class AbsSummonFriendActivity extends AmeSSActivity {

    /* renamed from: a */
    private int f79053a;

    /* renamed from: b */
    private String f79054b;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void finish() {
        super.finish();
        superOverridePendingTransition(R.anim.m, R.anim.t);
    }

    public void setStatusBarColor() {
        if (!C7212bb.m22494a((Activity) this)) {
            C10994a.m32208b(this);
        }
    }

    public void onBackPressed() {
        C25713b.m84474a((Activity) this, findViewById(R.id.a19));
        setResult(0);
        super.onBackPressed();
    }

    /* renamed from: a */
    private void m98543a() {
        Fragment fragment;
        C0633q a = getSupportFragmentManager().mo2645a();
        if (((Integer) SharePrefCache.inst().getAtFriendsShowType().mo59877d()).intValue() == 1) {
            fragment = AtFriendsFragment.m98546a(this.f79054b, this.f79053a);
        } else {
            fragment = SummonFriendsFragment.m98763a(this.f79054b, this.f79053a);
        }
        fragment.setUserVisibleHint(true);
        a.mo2599b(R.id.a19, fragment);
        a.mo2604c();
    }

    @C7709l
    public void onEvent(C30000b bVar) {
        if (bVar != null) {
            Intent intent = new Intent();
            intent.putExtra("extra_data", bVar.f78823a);
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        superOverridePendingTransition(R.anim.s, R.anim.m);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a6i));
        if (VERSION.SDK_INT >= 19) {
            findViewById(R.id.dal).getLayoutParams().height = C10994a.m32204a((Context) this);
        }
        this.f79054b = getIntent().getStringExtra("video_id");
        this.f79053a = getIntent().getIntExtra("source", 0);
        m98543a();
    }

    /* renamed from: a */
    public static void m98544a(Fragment fragment, int i, String str, int i2) {
        Intent intent = new Intent(fragment.getActivity(), SummonFriendActivity.class);
        intent.putExtra("video_id", str);
        intent.putExtra("source", i2);
        fragment.startActivityForResult(intent, i);
    }
}
