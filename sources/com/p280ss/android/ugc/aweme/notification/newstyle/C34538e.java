package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.e */
public final class C34538e {

    /* renamed from: a */
    public static final C34538e f90108a = new C34538e();

    /* renamed from: b */
    private static final int f90109b = C23486n.m77122a(10.0d);

    /* renamed from: c */
    private static final boolean f90110c = C6399b.m19946v();

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.e$a */
    static final class C34539a implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f90111a;

        C34539a(View view) {
            this.f90111a = view;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i2 > C34538e.m111684a()) {
                this.f90111a.setTop(C34538e.m111684a());
            }
        }
    }

    private C34538e() {
    }

    /* renamed from: a */
    public static int m111684a() {
        return f90109b;
    }

    /* renamed from: b */
    public static boolean m111691b() {
        return f90110c;
    }

    /* renamed from: d */
    public static boolean m111693d() {
        return f90110c;
    }

    /* renamed from: c */
    public static boolean m111692c() {
        if (f90110c || C27688b.m90838b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m111689a(View view) {
        C7573i.m23587b(view, "view");
        view.addOnLayoutChangeListener(new C34539a(view));
    }

    /* renamed from: b */
    public static void m111690b(View view) {
        C7573i.m23587b(view, "view");
        C32266b.m104782a(view);
    }

    /* renamed from: a */
    public final void mo87841a(Context context) {
        C7573i.m23587b(context, "context");
        if (context instanceof Activity) {
            m111686a((Activity) context);
        }
    }

    /* renamed from: a */
    public static String m111685a(User user) {
        C7573i.m23587b(user, "user");
        if (f90110c) {
            String a = C34637f.m111896a(user);
            C7573i.m23582a((Object) a, "NoticeUserUtils.getHandle(user)");
            return a;
        } else if (!TextUtils.isEmpty(user.getRemarkName())) {
            String remarkName = user.getRemarkName();
            C7573i.m23582a((Object) remarkName, "user.remarkName");
            return remarkName;
        } else {
            String nickname = user.getNickname();
            C7573i.m23582a((Object) nickname, "user.nickname");
            return nickname;
        }
    }

    /* renamed from: a */
    public static void m111686a(Activity activity) {
        C7573i.m23587b(activity, "mActivity");
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
            String stringExtra = intent.getStringExtra("rule_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                C7573i.m23582a((Object) stringExtra, "ruleId");
                ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logVideoPlayFromPush("video_play_from_push", stringExtra);
            }
        }
    }

    /* renamed from: a */
    public static void m111687a(Context context, FollowNotice followNotice) {
        C7573i.m23587b(context, "context");
        if ((context instanceof Activity) && followNotice != null) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    User user = followNotice.getUser();
                    C7573i.m23582a((Object) user, "followNotice.user");
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "followNotice.user.uid");
                    C7573i.m23582a((Object) stringExtra, "ruleId");
                    ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logFollowUserEventPush("follow_from_push", "message", uid, "previous_page", "other_places", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m111688a(Context context, String str, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "accountType");
        if (context instanceof Activity) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C6907h.m21524a("enter_personal_detail_backup_from_push", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("account_type", str).mo59973a("client_order", String.valueOf(i)).mo59973a("rule_id", stringExtra).mo59975b().f60753a);
                }
            }
        }
    }
}
