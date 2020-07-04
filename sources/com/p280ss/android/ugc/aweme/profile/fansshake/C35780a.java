package com.p280ss.android.ugc.aweme.profile.fansshake;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.profile.model.UrgeStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a */
public final class C35780a {

    /* renamed from: e */
    private static final FansUrgeApi f93787e = ((FansUrgeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FansUrgeApi.class));

    /* renamed from: a */
    public Context f93788a;

    /* renamed from: b */
    public User f93789b;

    /* renamed from: c */
    public C35793f f93790c;

    /* renamed from: d */
    private C35781a f93791d;

    /* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a$a */
    abstract class C35781a {

        /* renamed from: a */
        public int f93792a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo90660a();

        C35781a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a$b */
    class C35782b extends C35781a {
        /* renamed from: a */
        public final void mo90660a() {
            if (this.f93792a == 3) {
                C35780a.this.mo90655a((C35785d) new C35785d() {
                    /* renamed from: a */
                    public final void mo90661a() {
                        C35782b.this.f93792a = 2;
                        C35780a.this.f93790c.mo90663a();
                        C10761a.m31387a(C35780a.this.f93788a, C35780a.this.f93788a.getResources().getString(R.string.b44, new Object[]{C35780a.this.mo90658b()})).mo25750a();
                        if (!(C35780a.this.f93789b == null || C35780a.this.f93789b.getUrgeDetail() == null)) {
                            C35780a.this.f93789b.getUrgeDetail().setUserUrged(1);
                        }
                        C35780a.this.mo90657a(true);
                    }

                    /* renamed from: a */
                    public final void mo90662a(String str, int i) {
                        if (!TextUtils.isEmpty(str)) {
                            C10761a.m31403c(C35780a.this.f93788a, str).mo25750a();
                        }
                        if (i == 5151) {
                            C35782b.this.f93792a = 2;
                            C35780a.this.f93790c.mo90663a();
                            if (C35780a.this.f93789b != null && C35780a.this.f93789b.getUrgeDetail() != null) {
                                C35780a.this.f93789b.getUrgeDetail().setUserUrged(1);
                            }
                        }
                    }
                });
                return;
            }
            C10761a.m31403c(C35780a.this.f93788a, C35780a.this.f93788a.getResources().getString(R.string.b43, new Object[]{C35780a.this.mo90658b()})).mo25750a();
            C35780a.this.mo90657a(false);
        }

        C35782b() {
            super();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a$c */
    class C35784c extends C35781a {
        /* renamed from: a */
        public final void mo90660a() {
            if (this.f93792a == 0) {
                C35780a.this.mo90659c();
                this.f93792a = 1;
                C35780a.this.f93790c.mo90669b();
                C35780a.this.f93790c.mo90667a(false);
                return;
            }
            if (this.f93792a == 1) {
                C35780a.this.mo90659c();
            }
        }

        C35784c() {
            super();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.fansshake.a$d */
    interface C35785d {
        /* renamed from: a */
        void mo90661a();

        /* renamed from: a */
        void mo90662a(String str, int i);
    }

    /* renamed from: a */
    public final void mo90654a() {
        if (this.f93791d != null) {
            m115544a("update_urge_click");
            this.f93791d.mo90660a();
        }
    }

    /* renamed from: d */
    private String m115546d() {
        String str = "";
        if (this.f93791d == null) {
            return str;
        }
        switch (this.f93791d.f93792a) {
            case 0:
                str = "author_has_urge";
                break;
            case 1:
                str = "author_no_urge";
                break;
            case 2:
                str = "check";
                break;
            case 3:
                str = "wish";
                break;
        }
        return str;
    }

    /* renamed from: b */
    public final String mo90658b() {
        int i;
        if (this.f93789b.getGender() == 1) {
            i = R.string.b48;
        } else if (this.f93789b.getGender() == 2) {
            i = R.string.b47;
        } else {
            i = R.string.b46;
        }
        return this.f93788a.getResources().getString(i);
    }

    /* renamed from: c */
    public final void mo90659c() {
        int i;
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser == null || curUser.getUrgeDetail() == null) {
            i = 0;
        } else {
            i = (int) curUser.getUrgeDetail().getUrgeUnreadCount();
            curUser.getUrgeDetail().setUrgeUnreadCount(0);
            m115543a(curUser);
        }
        SmartRouter.buildRoute(this.f93788a, "//notification_urge").withParam("from_where", 21).withParam("unRead_message_count", i).withParam("enter_from", "others_homepage").open();
    }

    /* renamed from: a */
    public final void mo90655a(C35785d dVar) {
        if (this.f93789b != null) {
            f93787e.urge(this.f93789b.getUid()).mo6876a((C1591g<TResult, TContinuationResult>) new C35786b<TResult,TContinuationResult>(dVar), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    private void m115542a(UrgeStruct urgeStruct) {
        this.f93791d = new C35784c();
        if (urgeStruct.shouldHostShowTip()) {
            this.f93790c.mo90667a(true);
            this.f93791d.f93792a = 0;
            return;
        }
        this.f93790c.mo90667a(false);
        this.f93791d.f93792a = 1;
    }

    /* renamed from: b */
    private void m115545b(UrgeStruct urgeStruct) {
        this.f93791d = new C35782b();
        if (urgeStruct.getUserUrged() == 0) {
            this.f93790c.mo90667a(false);
            this.f93791d.f93792a = 3;
            return;
        }
        this.f93790c.mo90667a(false);
        this.f93791d.f93792a = 2;
    }

    /* renamed from: a */
    private static void m115543a(User user) {
        if (user != null && user.getUrgeDetail() != null && TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId())) {
            C7102a noticeSession = C30553b.m99810g().getNoticeSession("urge_notice");
            if (noticeSession != null) {
                int urgeUnreadCount = (int) user.getUrgeDetail().getUrgeUnreadCount();
                if (noticeSession.f19946j != urgeUnreadCount) {
                    noticeSession.f19946j = urgeUnreadCount;
                    C30553b.m99810g().updateNoticeSession(noticeSession);
                }
            }
        }
    }

    /* renamed from: a */
    private void m115544a(String str) {
        if (this.f93789b != null) {
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("author_id", this.f93789b.getUid()).mo59973a("button_status", m115546d()).mo59970a("is_self", TextUtils.equals(C6861a.m21337f().getCurUserId(), this.f93789b.getUid()) ? 1 : 0).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo90657a(boolean z) {
        String str;
        if (this.f93789b != null) {
            String str2 = "update_urge_toast";
            C22984d a = C22984d.m75611a().mo59973a("author_id", this.f93789b.getUid());
            String str3 = "toast_content";
            if (z) {
                str = "urge_success";
            } else {
                str = "have_urged";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m115541a(C35785d dVar, C1592h hVar) throws Exception {
        if (!hVar.mo6889d() && !hVar.mo6887c()) {
            BaseResponse baseResponse = (BaseResponse) hVar.mo6890e();
            if (baseResponse.status_code == 0) {
                if (dVar != null) {
                    dVar.mo90661a();
                }
            } else if (dVar != null) {
                dVar.mo90662a(baseResponse.status_msg, baseResponse.status_code);
            }
        } else if ((hVar.mo6891f() instanceof ApiServerException) && dVar != null) {
            dVar.mo90662a(((ApiServerException) hVar.mo6891f()).getErrorMsg(), ((ApiServerException) hVar.mo6891f()).getErrorCode());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo90656a(User user, int i) {
        this.f93789b = user;
        String curUserId = C6861a.m21337f().getCurUserId();
        UrgeStruct urgeDetail = user.getUrgeDetail();
        if (TextUtils.equals(curUserId, user.getUid())) {
            m115542a(urgeDetail);
            if (i == 0) {
                m115544a("update_urge_show");
            }
        } else {
            m115545b(urgeDetail);
            m115544a("update_urge_show");
        }
        m115543a(user);
    }
}
