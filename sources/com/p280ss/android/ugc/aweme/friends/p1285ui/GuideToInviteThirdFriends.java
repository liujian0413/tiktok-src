package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22731a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends */
public final class GuideToInviteThirdFriends extends AmeSSActivity {

    /* renamed from: b */
    public static final C30099a f79144b = new C30099a(null);

    /* renamed from: a */
    public String f79145a;

    /* renamed from: c */
    private HashMap f79146c;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends$a */
    public static final class C30099a {
        private C30099a() {
        }

        public /* synthetic */ C30099a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo76501a(Activity activity) {
            if (activity != null) {
                C21643ad d = C6861a.m21335d();
                if (d == null || !d.isPlatformBound("facebook")) {
                    C7213d a = C7213d.m22500a();
                    C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
                    if (a.mo18724R() && C6861a.m21334c().disableFtcAgeGate()) {
                        IAccountUserService a2 = C21115b.m71197a();
                        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                        User curUser = a2.getCurUser();
                        C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
                        if (curUser.getUserMode() != 2) {
                            Intent intent = new Intent(activity, GuideToInviteThirdFriends.class);
                            intent.putExtra("platform_name", "facebook");
                            activity.startActivity(intent);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends$b */
    static final class C30100b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GuideToInviteThirdFriends f79147a;

        C30100b(GuideToInviteThirdFriends guideToInviteThirdFriends) {
            this.f79147a = guideToInviteThirdFriends;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("find_fb_friend_skip", (Map) new HashMap());
            this.f79147a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends$c */
    static final class C30101c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GuideToInviteThirdFriends f79148a;

        C30101c(GuideToInviteThirdFriends guideToInviteThirdFriends) {
            this.f79148a = guideToInviteThirdFriends;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (TextUtils.equals(this.f79148a.f79145a, "facebook")) {
                Intent a = InviteUserListActivity.m98688a((Context) this.f79148a, 3);
                a.putExtra("enter_from", "guide_to_invite_third_friends");
                this.f79148a.startActivityForResult(a, 0);
            }
            C6907h.m21524a("find_fb_friend_click", (Map) new HashMap());
        }
    }

    /* renamed from: a */
    private View m98614a(int i) {
        if (this.f79146c == null) {
            this.f79146c = new HashMap();
        }
        View view = (View) this.f79146c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79146c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public static final boolean m98615a(Activity activity) {
        return f79144b.mo76501a(activity);
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        C22731a.f60422c.mo59804b((Bundle) null);
        super.finish();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c5);
        this.f79145a = getIntent().getStringExtra("platform_name");
        View findViewById = ((TextTitleBar) m98614a((int) R.id.djr)).findViewById(R.id.di4);
        C7573i.m23582a((Object) findViewById, "titleBar.findViewById(R.id.text_right)");
        TextView textView = (TextView) findViewById;
        textView.setTextColor(getResources().getColor(R.color.ab4));
        textView.setOnClickListener(new C30100b(this));
        ((FrameLayout) m98614a((int) R.id.akr)).setOnClickListener(new C30101c(this));
        C6907h.m21524a("find_fb_friend_show", (Map) new HashMap());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.GuideToInviteThirdFriends", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            finish();
        }
    }
}
