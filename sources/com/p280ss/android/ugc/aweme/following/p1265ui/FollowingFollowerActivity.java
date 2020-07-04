package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusMyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import com.p280ss.android.ugc.aweme.viewmodel.Resource.Status;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity */
public class FollowingFollowerActivity extends AmeSlideSSActivity implements C0053p<Resource<NewUserCount>> {

    /* renamed from: b */
    public int f78100b;

    /* renamed from: c */
    private MyProfileViewModel f78101c;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$1 */
    static /* synthetic */ class C296661 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78102a = new int[PageType.values().length];

        static {
            try {
                f78102a[PageType.follower.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity$a */
    public static class C29667a {

        /* renamed from: a */
        private Context f78103a;

        /* renamed from: b */
        private Fragment f78104b;

        /* renamed from: c */
        private FollowingFollowerPageParam f78105c;

        /* renamed from: d */
        private PageType f78106d;

        /* renamed from: e */
        private int f78107e;

        /* renamed from: a */
        public final void mo75665a() {
            Intent intent = new Intent(this.f78103a, FollowingFollowerActivity.class);
            intent.putExtra("following_page_param", this.f78105c);
            intent.putExtra("page_type_const_for_simpleuser", this.f78106d);
            intent.putExtra("following_or_follower_count", this.f78107e);
            if ((this.f78104b instanceof MyProfileFragment) || (this.f78104b instanceof MusMyProfileFragment)) {
                this.f78104b.startActivityForResult(intent, 20001);
            } else {
                this.f78103a.startActivity(intent);
            }
        }

        /* renamed from: a */
        public final C29667a mo75664a(User user) {
            String str;
            FollowingFollowerPageParam followingFollowerPageParam = this.f78105c;
            if (user == null) {
                str = "";
            } else {
                str = user.getSecUid();
            }
            followingFollowerPageParam.setSecUid(str);
            C28479b.m93594a(user);
            return this;
        }

        public C29667a(Context context, Fragment fragment, String str, boolean z, PageType pageType, int i) {
            this.f78103a = context;
            this.f78105c = new FollowingFollowerPageParam(str, z, pageType);
            this.f78106d = pageType;
            this.f78107e = i;
            this.f78104b = fragment;
        }
    }

    /* renamed from: a */
    public final void mo75662a() {
        this.f78100b = 0;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("recommend_count", this.f78100b);
        setResult(-1, intent);
        super.finish();
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
        } else {
            C10994a.m32208b(this);
        }
    }

    /* renamed from: b */
    private void m97297b() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("FRAGMENT_FOLLOWING_LIST");
        PageType pageType = (PageType) getIntent().getSerializableExtra("page_type_const_for_simpleuser");
        if (pageType == null) {
            pageType = PageType.following;
        }
        if (a == null) {
            if (C296661.f78102a[pageType.ordinal()] != 1) {
                a = FollowingListFragment.m97301a(getIntent().getExtras());
            } else {
                a = FollowerListFragment.m97227a(getIntent().getExtras());
            }
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.aoy, a, "FRAGMENT_FOLLOWING_LIST").mo2606d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Resource<NewUserCount> resource) {
        if (!(resource == null || resource.f112150b == null || resource.f112149a != Status.SUCCESS)) {
            int i = ((NewUserCount) resource.f112150b).count;
            if (i > 0) {
                this.f78100b = i;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bs);
        this.f78101c = (MyProfileViewModel) C0069x.m159a((FragmentActivity) this).mo147a(MyProfileViewModel.class);
        this.f78101c.f96537a.observe(this, this);
        this.f78101c.mo93148a();
        m97297b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", "onCreate", false);
    }
}
