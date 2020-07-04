package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationTabViewModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity */
public final class FollowRelationTabActivity extends JediBaseActivity {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f78015b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowRelationTabActivity.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: c */
    public static final C29624a f78016c = new C29624a(null);

    /* renamed from: d */
    private final lifecycleAwareLazy f78017d;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$a */
    public static final class C29624a {
        private C29624a() {
        }

        public /* synthetic */ C29624a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m97195a(Context context, User user, String str) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "relationType");
            if (user != null) {
                C28479b.m93594a(user);
                Intent intent = new Intent(context, FollowRelationTabActivity.class);
                intent.putExtra("uid", user.getUid());
                intent.putExtra(C22689a.f60407a, user.getSecUid());
                intent.putExtra("follow_relation_type", str);
                intent.putExtra("request_id", user.getRequestId());
                intent.putExtra("type", 1);
                intent.putExtra("enter_from", "others_homepage");
                intent.putExtra("extra_previous_page", "others_homepage");
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity$b */
    static final class C29625b extends Lambda implements C7562b<FollowRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowRelationTabActivity f78018a;

        C29625b(FollowRelationTabActivity followRelationTabActivity) {
            this.f78018a = followRelationTabActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97196a((FollowRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97196a(FollowRelationState followRelationState) {
            C7573i.m23587b(followRelationState, "it");
            if (!followRelationState.isSearching() || !followRelationState.isFollowingTab()) {
                FollowRelationTabActivity.super.onBackPressed();
            } else {
                this.f78018a.mo75635g().mo75796a(false);
            }
        }
    }

    /* renamed from: a */
    public static final void m97191a(Context context, User user, String str) {
        C29624a.m97195a(context, user, str);
    }

    /* renamed from: g */
    public final FollowRelationTabViewModel mo75635g() {
        return (FollowRelationTabViewModel) this.f78017d.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FollowRelationTabActivity() {
        C7584c a = C7575l.m23595a(FollowRelationTabViewModel.class);
        this.f78017d = new lifecycleAwareLazy(this, new FollowRelationTabActivity$$special$$inlined$viewModel$2(this, a, FollowRelationTabActivity$$special$$inlined$viewModel$1.INSTANCE, a));
    }

    public final void onBackPressed() {
        mo29066a(mo75635g(), new C29625b(this));
    }

    /* renamed from: h */
    private final void m97193h() {
        Fragment a = getSupportFragmentManager().mo2644a("follow_relation_tab");
        if (a == null) {
            a = new FollowRelationTabFragment();
        }
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        a.setArguments(intent.getExtras());
        C0633q a2 = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a2, "supportFragmentManager.beginTransaction()");
        a2.mo2600b(R.id.aoy, a, "follow_relation_tab").mo2606d();
    }

    public final void setStatusBarColor() {
        Object service = ServiceManager.get().getService(IMainService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
        if (((IMainService) service).isTiktokWhite()) {
            C7212bb.m22498b(this);
        } else {
            C10994a.m32208b(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bs);
        m97193h();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            C43152a.m136868a((Activity) this, i, strArr, iArr);
        }
    }
}
