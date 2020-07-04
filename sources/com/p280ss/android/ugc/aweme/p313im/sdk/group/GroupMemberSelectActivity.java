package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.C31796c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity */
public final class GroupMemberSelectActivity extends AmeActivity {

    /* renamed from: a */
    public static final C31242a f81910a = new C31242a(null);

    /* renamed from: b */
    private final C31796c f81911b = new C31796c();

    /* renamed from: c */
    private final String f81912c = "GROUP_MEMBER_FRAGMENT_TAG";

    /* renamed from: d */
    private Fragment f81913d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity$a */
    public static final class C31242a {
        private C31242a() {
        }

        public /* synthetic */ C31242a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101792a(Activity activity, int i, String str, int i2) {
            C7573i.m23587b(activity, "activity");
            Intent intent = new Intent(activity, GroupMemberSelectActivity.class);
            intent.putExtra("key_member_list_type", i);
            if (str != null) {
                intent.putExtra("session_id", str);
            }
            activity.startActivityForResult(intent, i2);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void finish() {
        super.finish();
        if (this.f81913d instanceof AtMemberFragment) {
            overridePendingTransition(R.anim.m, R.anim.t);
        }
    }

    public final void onBackPressed() {
        if (this.f81913d instanceof AtMemberFragment) {
            Fragment fragment = this.f81913d;
            if (fragment == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment");
            } else if (!((AtMemberFragment) fragment).be_()) {
                super.onBackPressed();
            }
        }
        if (this.f81913d instanceof GroupMemberRemoveFragment) {
            Fragment fragment2 = this.f81913d;
            if (fragment2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment");
            } else if (!((GroupMemberRemoveFragment) fragment2).be_()) {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    private final void m101791a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        C7573i.m23582a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2644a(this.f81912c);
        if (a2 == null) {
            a2 = C31796c.m103226a(getIntent().getIntExtra("key_member_list_type", 5));
        }
        this.f81913d = a2;
        Fragment fragment = this.f81913d;
        if (fragment != null) {
            Intent intent = getIntent();
            C7573i.m23582a((Object) intent, "intent");
            fragment.setArguments(intent.getExtras());
            a.mo2600b(R.id.ama, fragment, this.f81912c).mo2606d();
        }
        if (this.f81913d instanceof AtMemberFragment) {
            overridePendingTransition(R.anim.s, R.anim.m);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c4);
        C6956a.m21633b().setupStatusBar(this);
        m101791a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f81913d;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
