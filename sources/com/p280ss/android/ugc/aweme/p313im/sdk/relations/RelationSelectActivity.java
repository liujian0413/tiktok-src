package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupCreateFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberAddFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberFansFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.C31796c;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity */
public class RelationSelectActivity extends AmeActivity {

    /* renamed from: b */
    private static C6892b<Boolean> f19830b;

    /* renamed from: a */
    private Fragment f19831a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: c */
    private static C31796c m21883c() {
        return new C31796c();
    }

    public void finish() {
        super.finish();
        if ((this.f19831a instanceof GroupCreateFragment) || ((this.f19831a instanceof RelationMemberSelectFragment) && C6399b.m19945u())) {
            overridePendingTransition(R.anim.m, R.anim.t);
        }
    }

    /* renamed from: a */
    private void m21879a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        this.f19831a = supportFragmentManager.mo2644a("relation_fragment_tag");
        if (this.f19831a == null) {
            this.f19831a = new RelationSelectFragment();
            this.f19831a.setArguments(getIntent().getExtras());
        }
        if (this.f19831a instanceof RelationSelectFragment) {
            ((RelationSelectFragment) this.f19831a).f19832e = f19830b;
        }
        a.mo2600b(R.id.ama, this.f19831a, "relation_fragment_tag").mo2606d();
    }

    /* renamed from: b */
    private void m21882b() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        this.f19831a = supportFragmentManager.mo2644a("member_fragment_tag");
        if (this.f19831a == null) {
            int intExtra = getIntent().getIntExtra("key_member_list_type", 0);
            m21883c();
            this.f19831a = C31796c.m103226a(intExtra);
            this.f19831a.setArguments(getIntent().getExtras());
            if (this.f19831a instanceof RelationMemberSelectFragment) {
                ((RelationMemberSelectFragment) this.f19831a).f82773h = f19830b;
                if (C6399b.m19945u()) {
                    overridePendingTransition(R.anim.s, R.anim.m);
                }
            } else if (this.f19831a instanceof GroupCreateFragment) {
                overridePendingTransition(R.anim.s, R.anim.m);
            }
        }
        a.mo2600b(R.id.ama, this.f19831a, "member_fragment_tag").mo2606d();
    }

    public void onBackPressed() {
        if ((this.f19831a instanceof RelationSelectFragment) && !((RelationSelectFragment) this.f19831a).mo18250a()) {
            super.onBackPressed();
        } else if ((this.f19831a instanceof GroupCreateFragment) && !((GroupCreateFragment) this.f19831a).be_()) {
            super.onBackPressed();
        } else if ((this.f19831a instanceof RelationMemberSelectFragment) && !((RelationMemberSelectFragment) this.f19831a).be_()) {
            super.onBackPressed();
        } else if (!(this.f19831a instanceof GroupMemberAddFragment) || ((GroupMemberAddFragment) this.f19831a).be_()) {
            if ((this.f19831a instanceof GroupMemberFansFragment) && !((GroupMemberFansFragment) this.f19831a).be_()) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.em);
        C6956a.m21633b().setupStatusBar(this);
        if (((IIMService) C6993a.m21773a(IIMService.class)).getAbInterface().mo18356d()) {
            m21882b();
        } else {
            Intent intent = getIntent();
            if (intent == null || intent.getIntExtra("key_member_list_type", 0) != 4) {
                m21879a();
            } else {
                m21882b();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m21880a(Activity activity, Bundle bundle, int i) {
        Intent intent = new Intent(activity, RelationSelectActivity.class);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f19831a != null) {
            this.f19831a.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static void m21881a(Context context, Bundle bundle, C6892b<Boolean> bVar) {
        Intent intent = new Intent(context, RelationSelectActivity.class);
        if (bundle != null) {
            intent.putExtra("key_member_list_type", 1);
            intent.putExtras(bundle);
        } else {
            intent.putExtra("key_member_list_type", 0);
        }
        f19830b = bVar;
        context.startActivity(intent);
    }
}
