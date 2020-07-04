package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36012aj;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p280ss.android.ugc.aweme.story.model.Story;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.live.h */
public final class C41994h {

    /* renamed from: a */
    public static boolean f109084a;

    /* renamed from: a */
    public static boolean m133526a(User user) {
        if (user == null || user.isBlock()) {
            return false;
        }
        if (!C43122ff.m136769b(user, false) || user.getFollowStatus() == 2 || user.getFollowStatus() == 1 || C21115b.m71197a().getCurUserId().equals(user.getUid())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m133522a(Context context, User user, C36040n nVar) {
        if (context != null && user != null) {
            new C41998k(context).mo103125a(user);
        }
    }

    /* renamed from: a */
    public static void m133523a(Context context, User user, String str) {
        if (context != null && user != null) {
            if (!m133526a(user)) {
                C10761a.m31409e(context, (int) R.string.d52).mo25750a();
                return;
            }
            C41989d.m133474a(context, str, user.getRequestId(), user.getUid(), user.roomId);
            new C41998k(context).mo103128a(user, str, (C36040n) null);
        }
    }

    /* renamed from: b */
    public static void m133527b(final Context context, User user, C36040n nVar) {
        if (context != null && user != null && !f109084a) {
            if (!m133526a(user)) {
                C419951 r5 = new C36012aj() {
                    /* renamed from: b */
                    public final void mo56977b() {
                        C41994h.f109084a = false;
                        UserResponse userResponse = (UserResponse) this.f67571b.getData();
                        if (userResponse != null) {
                            User user = userResponse.getUser();
                            if (user != null) {
                                if (!C41994h.m133526a(user)) {
                                    C10761a.m31409e(context, (int) R.string.d52).mo25750a();
                                } else {
                                    new C41998k(context).mo103129b(user);
                                }
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo57296a(Exception exc) {
                        C41994h.f109084a = false;
                        super.mo57296a(exc);
                    }
                };
                f109084a = true;
                r5.mo91649e();
                r5.mo56976a(user.getUid(), user.getSecUid());
                return;
            }
            new C41998k(context).mo103129b(user);
        }
    }

    /* renamed from: a */
    public static void m133525a(Context context, User user, boolean z, C36040n nVar) {
        if (context != null && user != null) {
            if (!m133526a(user)) {
                C10761a.m31409e(context, (int) R.string.d52).mo25750a();
                return;
            }
            C41989d.m133476a(context, false, 1, user.getRequestId(), user.getUid(), user.roomId);
            new C41998k(context).mo103127a(user, nVar);
        }
    }

    /* renamed from: a */
    public static void m133524a(Context context, User user, String str, boolean z, HashMap hashMap) {
        if (context != null && user != null) {
            if (!m133526a(user)) {
                C10761a.m31409e(context, (int) R.string.d52).mo25750a();
                return;
            }
            C41989d.m133476a(context, true, 1, user.getRequestId(), user.getUid(), user.roomId);
            new C41998k(context).mo103127a(user, null);
        }
    }

    /* renamed from: a */
    public static void m133521a(Context context, User user, Rect rect, List<Story> list, String str, int i, boolean z, int i2) {
        if (context != null && user != null) {
            C41989d.m133470a(context, 1, user.getRequestId(), user.getUid(), user.roomId, str);
            new C41998k(context).mo103126a(user, rect, (C36040n) null);
        }
    }
}
