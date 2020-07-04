package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1337b;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C7007f;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.adapter.NewSessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31503b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31505d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31506e;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31510f;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.p1335a.C31483a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31083h;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j.C6989a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32001c;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.b.a */
public final class C31498a implements C31483a<C7102a>, C31503b, C32001c<User> {

    /* renamed from: c */
    public static final C31499a f82482c = new C31499a(null);

    /* renamed from: a */
    public String f82483a = "";

    /* renamed from: b */
    public final C31510f f82484b = new C31510f();

    /* renamed from: e */
    private boolean f82485e = true;

    /* renamed from: f */
    private boolean f82486f = true;

    /* renamed from: g */
    private boolean f82487g;

    /* renamed from: h */
    private final NewSessionListAdapter f82488h;

    /* renamed from: i */
    private final DmtStatusView f82489i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.b.a$a */
    public static final class C31499a {
        private C31499a() {
        }

        public /* synthetic */ C31499a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo82168a(List<C7102a> list) {
        this.f82488h.mo82188f(list == null ? new ArrayList<>() : list);
        this.f82488h.mo82192m();
        m102422e();
        if (this.f82485e) {
            this.f82485e = false;
            C31083h.m101381a(list);
        }
    }

    /* renamed from: a */
    public final void mo82194a() {
        this.f82488h.ag_();
    }

    /* renamed from: b */
    public final void mo82199b() {
        this.f82488h.ag_();
    }

    /* renamed from: c */
    public final void mo82202c() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
        C7023c.m21847a().mo18124b();
    }

    /* renamed from: f */
    private final void m102423f() {
        if (this.f82488h.mo82189j() || !this.f82488h.mo82190k()) {
            this.f82488h.mo66516d(false);
            this.f82488h.ah_();
            return;
        }
        this.f82488h.mo66516d(true);
        this.f82488h.ah_();
    }

    /* renamed from: g */
    private final boolean m102424g() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        C32025c iMSetting = f.getIMSetting();
        C7573i.m23582a((Object) iMSetting, "AwemeImManager.instance().proxy.imSetting");
        int i = iMSetting.f83748k;
        if (C31915n.m103671a() || !C6978j.f19703a || this.f82488h.mo82193n() > i) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final void m102422e() {
        if (!C31915n.m103671a()) {
            this.f82489i.mo25939d();
            this.f82489i.setVisibility(8);
            this.f82488h.mo66516d(this.f82488h.mo82190k());
        } else if (this.f82488h.mo82189j()) {
            this.f82489i.mo25939d();
            this.f82489i.setVisibility(0);
            this.f82489i.mo25943g();
        } else {
            this.f82489i.mo25939d();
            this.f82489i.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo82203d() {
        this.f82486f = false;
        if (!C31915n.m103671a()) {
            if (m102424g()) {
                if (this.f82488h.f82473a.isEmpty()) {
                    this.f82484b.mo82220e();
                    this.f82487g = false;
                    this.f82488h.ag_();
                    return;
                }
                if (this.f82487g) {
                    this.f82488h.mo82192m();
                }
            } else if (!this.f82488h.f82473a.isEmpty()) {
                this.f82488h.f82473a.clear();
                this.f82488h.mo82192m();
                m102423f();
            }
        }
    }

    /* renamed from: a */
    public final void mo82197a(Exception exc) {
        m102423f();
    }

    /* renamed from: b */
    public final void mo82201b(Exception exc) {
        m102423f();
    }

    @C7709l
    public final void onEvent(C7007f fVar) {
        C7573i.m23587b(fVar, "event");
        C6978j.m21717a().mo18058i();
    }

    /* renamed from: a */
    public final void mo82198a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f82483a = str;
    }

    /* renamed from: b */
    public final void mo82200b(C31505d dVar) {
        if (dVar != null) {
            List<User> list = this.f82488h.f82473a;
            List a = dVar.mo82213a();
            C7573i.m23582a((Object) a, "this.userList");
            list.addAll(a);
            this.f82488h.mo82192m();
            if (dVar.f82498d) {
                this.f82488h.ai_();
            } else {
                m102423f();
            }
        }
    }

    /* renamed from: a */
    public final void mo82167a(C6989a aVar) {
        C7573i.m23587b(aVar, "bundle");
        NewSessionListAdapter newSessionListAdapter = this.f82488h;
        List<C7102a> list = aVar.f19729b;
        C7573i.m23582a((Object) list, "bundle.imList");
        newSessionListAdapter.mo82188f(list);
        this.f82488h.mo82192m();
        m102422e();
        if (this.f82485e) {
            this.f82485e = false;
            if (C7063bg.m22053b()) {
                C31083h.m101381a(aVar.f19729b);
            }
        }
        if (this.f82486f && aVar.f19731d) {
            mo82203d();
        }
    }

    /* renamed from: a */
    public final void mo82196a(C31505d dVar) {
        if (dVar != null) {
            NewSessionListAdapter newSessionListAdapter = this.f82488h;
            List a = dVar.mo82213a();
            C7573i.m23582a((Object) a, "this.userList");
            newSessionListAdapter.mo82186e(a);
            this.f82488h.mo82192m();
            if (dVar.f82498d) {
                this.f82488h.ai_();
            } else {
                m102423f();
            }
        }
    }

    /* renamed from: b */
    private final void m102420b(User user, int i) {
        m102419a(user, i, "impression");
    }

    public C31498a(NewSessionListAdapter newSessionListAdapter, DmtStatusView dmtStatusView) {
        C7573i.m23587b(newSessionListAdapter, "mSessionListAdapter");
        C7573i.m23587b(dmtStatusView, "mStatusView");
        this.f82488h = newSessionListAdapter;
        this.f82489i = dmtStatusView;
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        this.f82489i.mo25942f();
        this.f82484b.mo66536a(new C31506e());
        this.f82484b.mo66537a(this);
        this.f82488h.f82475c = this;
    }

    /* renamed from: c */
    private final void m102421c(User user, int i) {
        boolean z;
        if (!C31500b.m102437a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjs).mo25750a();
            return;
        }
        if (user.getFollowStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m102419a(user, i, "follow");
            C6907h.m21524a("follow", (Map) new C22984d().mo59973a("enter_from", "message").mo59973a("previous_page", this.f82483a).mo59973a("to_user_id", user.getUid()).f60753a);
        } else {
            m102419a(user, i, "follow_cancel");
            C6907h.m21524a("follow_cancel", (Map) new C22984d().mo59973a("enter_from", "message").mo59973a("to_user_id", user.getUid()).f60753a);
        }
        this.f82487g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0052, code lost:
        if (r3 == null) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102418a(com.p280ss.android.ugc.aweme.profile.model.User r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "aweme://user/profile/"
            r1.<init>(r2)
            java.lang.String r2 = r5.getUid()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.ugc.aweme.router.u r1 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r1)
            java.lang.String r2 = "sec_user_id"
            java.lang.String r3 = r5.getSecUid()
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "previous_page_position"
            java.lang.String r3 = "other_places"
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "enter_from_request_id"
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r3 = r4.f82484b
            com.ss.android.ugc.aweme.common.a r3 = r3.mo66539h()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31506e) r3
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r3.getData()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31505d) r3
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = r3.f82496b
            if (r3 != 0) goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "recommend_from_type"
            java.lang.String r3 = "list"
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r2 = "from_recommend_card"
            r3 = 1
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18693a(r2, r3)
            java.lang.String r1 = r1.mo18695a()
            r0.mo18682a(r1)
            java.lang.String r0 = "enter_profile"
            r4.m102419a(r5, r6, r0)
            java.lang.String r6 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "to_user_id"
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.app.g.d r5 = r0.mo59973a(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1337b.C31498a.m102418a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* renamed from: a */
    private final void m102417a(Context context, User user, int i) {
        if (!C31500b.m102437a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjs).mo25750a();
            return;
        }
        this.f82488h.mo82184a(user);
        this.f82484b.mo82219a(user);
        if (!(user instanceof RecommendContact)) {
            C10761a.m31409e(context, (int) R.string.tu).mo25750a();
            m102419a(user, i, "delete");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102419a(com.p280ss.android.ugc.aweme.profile.model.User r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r0 = r4.f82484b
            com.ss.android.ugc.aweme.common.a r0 = r0.mo66539h()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31506e) r0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.C31505d) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.f82496b
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            java.lang.String r1 = "follow_card"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.lang.String r2 = "event_type"
            com.ss.android.ugc.aweme.app.g.d r7 = r0.mo59973a(r2, r7)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r2)
            java.lang.String r0 = "previous_page"
            java.lang.String r2 = r4.f82483a
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r2)
            java.lang.String r0 = "rec_reason"
            java.lang.String r2 = r5.getRecommendReason()
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r2)
            java.lang.String r0 = "rec_uid"
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.app.g.d r5 = r7.mo59973a(r0, r5)
            java.lang.String r7 = "impr_order"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59970a(r7, r6)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1337b.C31498a.m102419a(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo82195a(int i, User user, int i2, View view, String str) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(str, "enterMethod");
        switch (i) {
            case 100:
                m102421c(user, i2);
                return;
            case BaseNotice.HASHTAG /*101*/:
                m102418a(user, i2);
                return;
            case 102:
                Context context = view.getContext();
                C7573i.m23582a((Object) context, "view.context");
                m102417a(context, user, i2);
                break;
            case 103:
                m102420b(user, i2);
                return;
        }
    }
}
