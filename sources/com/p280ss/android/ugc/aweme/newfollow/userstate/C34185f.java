package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29351a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.f */
public class C34185f extends C29351a<C34180a, C34186g> {

    /* renamed from: o */
    public UserStateFragment f89152o;

    /* renamed from: p */
    public String f89153p;

    /* renamed from: q */
    public String f89154q;

    /* renamed from: l */
    public final String mo63006l() {
        return this.f89153p;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ Fragment mo75080r() {
        return this.f89152o;
    }

    /* renamed from: t */
    public final C34180a mo66539h() {
        return (C34180a) this.f67571b;
    }

    /* renamed from: u */
    private boolean m110352u() {
        if ("personal_homepage".equals(this.f89153p)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo75079q() {
        if (this.f77367i == null) {
            this.f77367i = C29363d.m96452b().mo75020a((Fragment) this.f89152o, hashCode(), (C24222c) this);
        }
        this.f77367i.mo62436f();
    }

    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        if (this.f67571b != null && this.f67572c != null && ((C34186g) this.f67572c).isViewValid()) {
            int i = ((C34180a) this.f67571b).mListQueryType;
            boolean z = true;
            if (i != 1) {
                if (i == 4) {
                    C34186g gVar = (C34186g) this.f67572c;
                    List items = ((C34180a) this.f67571b).getItems();
                    if (!((C34180a) this.f67571b).isHasMore() || ((C34180a) this.f67571b).isNewDataEmpty()) {
                        z = false;
                    }
                    gVar.mo75161b(items, z);
                }
            } else if (((C34180a) this.f67571b).isDataEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (!C7213d.m22500a().mo18778ap() || !m110352u()) {
                    ((C34186g) this.f67572c).mo75133a(3);
                    return;
                }
                FollowFeed followFeed = new FollowFeed();
                followFeed.setFeedType(65287);
                arrayList.add(0, followFeed);
                ((C34180a) this.f67571b).setItems(arrayList);
                ((C34186g) this.f67572c).mo75152a((List<D>) arrayList, ((C34180a) this.f67571b).isHasMore());
            } else {
                List items2 = ((C34180a) this.f67571b).getItems();
                if (C7213d.m22500a().mo18778ap() && m110352u()) {
                    FollowFeed followFeed2 = new FollowFeed();
                    followFeed2.setFeedType(65287);
                    items2.add(0, followFeed2);
                }
                ((C34186g) this.f67572c).mo75152a(items2, ((C34180a) this.f67571b).isHasMore());
            }
        }
    }

    C34185f(UserStateFragment userStateFragment) {
        this.f89152o = userStateFragment;
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f89152o.f89108i;
    }

    /* renamed from: a */
    private boolean m110351a(User user) {
        if (m110352u() || TextUtils.equals(this.f89154q, C21115b.m71197a().getCurUserId()) || user == null || TextUtils.equals(this.f89154q, user.getUid())) {
            return false;
        }
        return true;
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        String str;
        if (aVar != null) {
            if (aVar.f78475d == 1) {
                if (aVar.f78476e == hashCode()) {
                    String a = mo64928a(true);
                    Aweme aweme = aVar.f78474c;
                    String str2 = "list";
                    if (this.f77370l) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    C29893a.m97887a(a, aweme, str2, str, true);
                    if (this.f77367i != null) {
                        this.f77367i.mo62437g();
                    }
                }
                if (this.f89152o != null && this.f89152o.mo86908l()) {
                    ((C34186g) this.f67572c).mo75149a(aVar.f78473b, aVar.f78472a);
                }
            } else if (aVar.f78475d == 2) {
                ((C34186g) this.f67572c).mo75158b(aVar.f78473b);
            }
            this.f77371m = true;
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (this.f67572c != null && ((C34186g) this.f67572c).isViewValid()) {
            int i = anVar.f74631a;
            if (i != 2) {
                if (i == 13) {
                    ((C34186g) this.f67572c).mo75146a((String) anVar.f74632b);
                } else if (i != 15) {
                    if (i == 21 && (anVar.f74632b instanceof Aweme)) {
                        Aweme aweme = (Aweme) anVar.f74632b;
                        ((C34186g) this.f67572c).mo75139a(aweme, anVar.f74635e);
                        ((C34186g) this.f67572c).mo75140a(aweme, !anVar.f74640j, anVar.f74635e, anVar.f74636f);
                    }
                } else if (this.f89152o != null && this.f89152o.mo86908l()) {
                    ((C34186g) this.f67572c).mo86919c((Aweme) anVar.f74632b);
                }
            } else if (this.f89152o != null && this.f89152o.mo86908l()) {
                String str = (String) anVar.f74632b;
                if (!TextUtils.isEmpty(str)) {
                    ((C34186g) this.f67572c).mo75158b(str);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo58087b(View view, View view2, Aweme aweme, User user) {
        if (m110351a(user) && C34110a.m109800b(aweme, user, mo75081s(), mo64928a(true))) {
            C34138b.m110010d(aweme, mo64928a(true));
            C34138b.m109976a(aweme, user.getUid(), "name", mo64928a(true), "list");
        }
    }

    /* renamed from: a */
    public final void mo58079a(View view, View view2, Aweme aweme, User user) {
        if (m110351a(user) && C34110a.m109794a(aweme, user, mo75081s(), mo64928a(true)) && !C21740a.m72684a(user)) {
            C34138b.m110010d(aweme, mo64928a(true));
            C34138b.m109976a(aweme, user.getUid(), "head", mo64928a(true), "list");
        }
    }
}
