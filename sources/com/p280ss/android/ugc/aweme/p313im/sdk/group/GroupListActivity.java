package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.C31796c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity */
public class GroupListActivity extends AmeActivity {

    /* renamed from: a */
    public static C6892b<Boolean> f81851a;

    /* renamed from: b */
    public static final C31210a f81852b = new C31210a(null);

    /* renamed from: c */
    private final C31796c f81853c = new C31796c();

    /* renamed from: d */
    private final String f81854d = "GROUP_FRAGMENT_TAG";

    /* renamed from: e */
    private Fragment f81855e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity$a */
    public static final class C31210a {
        private C31210a() {
        }

        public /* synthetic */ C31210a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo81765a(Activity activity, int i, int i2) {
            C7573i.m23587b(activity, "activity");
            m101696a(activity, 2, null, null, 224);
        }

        /* renamed from: a */
        public static void m101696a(Activity activity, int i, Bundle bundle, C6892b<Boolean> bVar, int i2) {
            C7573i.m23587b(activity, "activity");
            Intent intent = new Intent(activity, GroupListActivity.class);
            intent.putExtra("key_member_list_type", i);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            GroupListActivity.f81851a = bVar;
            activity.startActivityForResult(intent, i2);
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onBackPressed() {
        if (this.f81855e instanceof GroupListFragment) {
            Fragment fragment = this.f81855e;
            if (fragment == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
            } else if (!((GroupListFragment) fragment).be_()) {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    private final void m101695a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        C7573i.m23582a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2644a(this.f81854d);
        if (a2 == null) {
            a2 = C31796c.m103226a(getIntent().getIntExtra("key_member_list_type", 5));
        }
        this.f81855e = a2;
        Fragment fragment = this.f81855e;
        if (fragment != null) {
            Intent intent = getIntent();
            C7573i.m23582a((Object) intent, "intent");
            fragment.setArguments(intent.getExtras());
            a.mo2600b(R.id.ama, fragment, this.f81854d).mo2606d();
        }
        if (this.f81855e instanceof GroupListFragment) {
            Fragment fragment2 = this.f81855e;
            if (fragment2 != null) {
                ((GroupListFragment) fragment2).f81860i = f81851a;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c3);
        C6956a.m21633b().setupStatusBar(this);
        m101695a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f81855e;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
