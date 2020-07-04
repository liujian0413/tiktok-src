package com.p280ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.aj */
public class C36012aj extends C36003ac {

    /* renamed from: a */
    String f94216a;

    /* renamed from: d */
    String f94217d;

    /* renamed from: e */
    public String f94218e;

    /* renamed from: f */
    public int f94219f;

    public C36012aj() {
        mo91649e();
    }

    /* renamed from: e */
    public final void mo91649e() {
        mo66536a(new C25640a<UserResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length < 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    C22984d a = new C22984d().mo59973a("enter_from", C36012aj.this.f94218e);
                    if (objArr != null) {
                        a.mo59973a("params", TextUtils.join(",", objArr));
                    }
                    C6907h.m21524a("profile_request_request", (Map) a.f60753a);
                    return false;
                }
                C36012aj.this.f94216a = objArr[0];
                C36012aj.this.f94217d = objArr[1];
                String str = null;
                if (objArr.length > 2) {
                    str = (String) objArr[2];
                }
                String str2 = str;
                if (C30199h.m98861a().getSecIdSwitch().intValue() == 0) {
                    C35732h.m115451a().mo90593a(this.mHandler, C36012aj.this.f94216a, C36012aj.this.f94217d, str2, C36012aj.this.mo91650f());
                } else if (!TextUtils.isEmpty(C36012aj.this.f94217d)) {
                    C35732h.m115451a().mo90594b(this.mHandler, C36012aj.this.f94217d, str2, C36012aj.this.mo91650f());
                } else {
                    C35732h.m115451a().mo90592a(this.mHandler, C36012aj.this.f94216a, str2, C36012aj.this.mo91650f());
                }
                C6907h.m21524a("profile_request_request", (Map) new C22984d().mo59973a("enter_from", C36012aj.this.f94218e).mo59973a(C22689a.f60407a, C36012aj.this.f94217d).mo59973a("uid", C36012aj.this.f94216a).f60753a);
                return true;
            }
        });
    }

    /* renamed from: f */
    public final int mo91650f() {
        if (TextUtils.equals(this.f94218e, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(this.f94218e, "prop_page")) {
            return 3;
        }
        if (TextUtils.equals(this.f94218e, "general_search") && this.f94219f == 2) {
            return 2;
        }
        if (!TextUtils.equals(this.f94218e, "general_search") || this.f94219f != 3) {
            return 0;
        }
        return 4;
    }

    /* renamed from: b */
    public void mo56977b() {
        User user;
        String str;
        if (this.f67571b == null || this.f67571b.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f67571b.getData()).getUser();
        }
        if (!(this.f67571b == null || this.f67571b.getData() == null)) {
            C1592h.m7855a((Callable<TResult>) new C36014ak<TResult>((UserResponse) this.f67571b.getData()), (Executor) C6907h.m21516a());
        }
        if (!(this.f67571b == null || this.f67571b.getData() == null)) {
            C28199ae.m92689a().mo71794b(this.f94216a, ((UserResponse) this.f67571b.getData()).getLogPb());
        }
        if (user == null || C21115b.m71197a().isUserEmpty(user)) {
            C6907h.m21524a("profile_request_response", (Map) new C22984d().mo59973a("enter_from", this.f94218e).mo59970a("is_success", 0).mo59973a("fail_info", "user_is_empty").mo59973a("to_user_id", this.f94216a).mo59973a("log_pb", C28199ae.m92689a().mo71793b(this.f94216a)).f60753a);
            return;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            C30553b.m99810g().updateIMUserFollowStatus(C30553b.m99780a(user));
        }
        if (this.f67572c == null || (!TextUtils.isEmpty(((C36041o) this.f67572c).getUserId()) && !TextUtils.equals(user.getUid(), ((C36041o) this.f67572c).getUserId()))) {
            String str2 = "profile_request_response";
            C22984d a = new C22984d().mo59973a("enter_from", this.f94218e).mo59970a("is_success", 1);
            String str3 = "fail_info";
            StringBuilder sb = new StringBuilder();
            sb.append(this.f94216a);
            sb.append(",");
            sb.append(this.f94217d);
            sb.append(",");
            if (this.f67572c == null) {
                str = "";
            } else {
                str = ((C36041o) this.f67572c).getUserId();
            }
            sb.append(str);
            sb.append(",");
            sb.append(user.getUid());
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, sb.toString()).mo59973a("log_pb", C28199ae.m92689a().mo71793b(this.f94216a)).f60753a);
            return;
        }
        ((C36041o) this.f67572c).mo91702a(user);
        mo91623a(user);
        m116014b(user);
    }

    /* renamed from: b */
    private static void m116014b(User user) {
        RoomStatusEvent roomStatusEvent = new RoomStatusEvent();
        roomStatusEvent.f7645b = Long.parseLong(user.getUid());
        roomStatusEvent.f7644a = user.roomId;
        roomStatusEvent.f7646c = !user.isLive();
        C42961az.m136380a(roomStatusEvent);
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        C22984d a = new C22984d().mo59973a("to_user_id", this.f94216a).mo59973a("enter_from", this.f94218e).mo59970a("is_success", 0).mo59973a("fail_info", exc.getMessage());
        if (exc instanceof ApiServerException) {
            a.mo59973a("response", ((ApiServerException) exc).getResponse());
        }
        Map<String, String> map = a.f60753a;
        C6907h.m21524a("profile_request_response", (Map) map);
        C6921a.m21552a(4, "aweme/v1/user", map.toString());
        super.mo57296a(exc);
    }
}
