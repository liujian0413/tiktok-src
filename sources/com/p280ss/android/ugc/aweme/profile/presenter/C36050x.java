package com.p280ss.android.ugc.aweme.profile.presenter;

import android.os.Handler;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.x */
public final class C36050x extends C36003ac {

    /* renamed from: a */
    public String f94286a;

    public C36050x() {
        mo66536a(new C25640a<UserResponse>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C35732h.m115451a().mo90590a((Handler) this.mHandler);
                return true;
            }
        });
    }

    /* renamed from: e */
    private static void m116141e() {
        Keva.getRepoFromSp(AwemeApplication.m21341a(), "user_profile", 0).storeLong("key_last_request_time", System.currentTimeMillis());
    }

    /* renamed from: b */
    public final void mo56977b() {
        User user;
        String str;
        if (this.f67571b == null || this.f67571b.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f67571b.getData()).getUser();
        }
        if (!(this.f67571b == null || this.f67571b.getData() == null)) {
            C1592h.m7855a((Callable<TResult>) new C36052y<TResult>((UserResponse) this.f67571b.getData()), (Executor) C6907h.m21516a());
        }
        if (user == null || C21115b.m71197a().isUserEmpty(user)) {
            String str2 = "profile_request_response";
            C22984d dVar = new C22984d();
            String str3 = "to_user_id";
            if (user != null) {
                str = user.getUid();
            } else {
                str = "";
            }
            C6907h.m21524a(str2, (Map) dVar.mo59973a(str3, str).mo59973a("enter_from", "personal_homepage").mo59970a("is_success", 0).mo59973a("fail_info", "user_is_empty").f60753a);
            return;
        }
        if (!C6399b.m19944t()) {
            m116141e();
        }
        C21115b.m71197a().updateCurUser(user);
        if (this.f67572c != null) {
            ((C36041o) this.f67572c).mo91702a(user);
            mo91623a(user);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        C22984d a = new C22984d().mo59973a("to_user_id", C21115b.m71197a().getCurUserId()).mo59973a("enter_from", "personal_homepage").mo59970a("is_success", 0).mo59973a("fail_info", exc.getMessage());
        if (exc instanceof ApiServerException) {
            a.mo59973a("response", ((ApiServerException) exc).getResponse());
        }
        Map<String, String> map = a.f60753a;
        C6907h.m21524a("profile_request_response", (Map) map);
        C6921a.m21552a(4, "aweme/v1/user", map.toString());
        super.mo57296a(exc);
    }
}
