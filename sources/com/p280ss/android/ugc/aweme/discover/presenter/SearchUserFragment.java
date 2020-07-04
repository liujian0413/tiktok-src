package com.p280ss.android.ugc.aweme.discover.presenter;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchOriginalFragment;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchUserFragment */
public final class SearchUserFragment extends SearchOriginalFragment<SearchUser> implements C25675c<SearchUser>, C36040n {

    /* renamed from: H */
    private HashMap f70761H;

    /* renamed from: e */
    public C36031j f70762e;

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchUserFragment$a */
    final class C26812a implements C29748a {
        public C26812a() {
        }

        /* renamed from: a */
        public final boolean mo68090a(User user) {
            String str;
            String str2;
            String str3;
            C7573i.m23587b(user, "user");
            JSONObject jSONObject = new JSONObject();
            String str4 = "enter_from";
            try {
                if (SearchUserFragment.this.f71093l == 1) {
                    str3 = "search_history";
                } else {
                    str3 = "search_recommend";
                }
                jSONObject.put(str4, str3);
            } catch (Exception unused) {
            }
            if (user.getFollowStatus() != 0) {
                C6907h.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            } else {
                try {
                    jSONObject.put("follow_from", "search_result");
                } catch (JSONException unused2) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            }
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            new C33280v(str).mo85341b("search_result").mo85343c("follow_button").mo85348g(user.getUid()).mo85345e("search_result").mo85347f("follow_button").mo85352o(user.getRequestId()).mo85252e();
            C26807z zVar = C26807z.f70733a;
            if (user.getFollowStatus() == 0) {
                str2 = "search_follow";
            } else {
                str2 = "search_follow_cancel";
            }
            String str5 = str2;
            String uid = user.getUid();
            C7573i.m23582a((Object) uid, "user.uid");
            zVar.mo68584a(str5, uid, "search_user", true, "");
            return true;
        }

        /* renamed from: a */
        public final void mo68088a(User user, int i) {
            C7573i.m23587b(user, "user");
            C26780aa.m87957a(SearchUserFragment.this.getView(), i, SearchUserFragment.this.f71090i, 0, user.getRequestId(), user.getUid(), C26780aa.m87952a(SearchUserFragment.this.f71090i));
            SmartRouter.buildRoute((Context) SearchUserFragment.this.getActivity(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "search_result").withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchUserFragment$b */
    public static final class C26813b implements C23637b {

        /* renamed from: a */
        final /* synthetic */ SearchUserFragment f70764a;

        /* renamed from: b */
        final /* synthetic */ Exception f70765b;

        /* renamed from: a */
        public final void mo57592a() {
            C36031j jVar = this.f70764a.f70762e;
            if (jVar == null) {
                C7573i.m23580a();
            }
            jVar.mo56975R_();
        }

        /* renamed from: b */
        public final void mo57593b() {
            C22814a.m75245a(this.f70764a.getContext(), this.f70765b, R.string.b82);
        }

        C26813b(SearchUserFragment searchUserFragment, Exception exc) {
            this.f70764a = searchUserFragment;
            this.f70765b = exc;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70761H == null) {
            this.f70761H = new HashMap();
        }
        View view = (View) this.f70761H.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70761H.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return z;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70761H != null) {
            this.f70761H.clear();
        }
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "user";
    }

    /* renamed from: n */
    public final void mo68440n() {
        mo69686a((BaseAdapter<D>) new SearchUserAdapter<D>(new C26501r(false), this.f71090i, new C26812a()));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f70762e != null) {
            C36031j jVar = this.f70762e;
            if (jVar == null) {
                C7573i.m23580a();
            }
            jVar.mo59134U_();
        }
        mo68430g();
    }

    /* renamed from: m */
    public final void mo68439m() {
        mo69750a((C26827i<?>) new C26847t<Object>());
        C25672e eVar = this;
        mo69749N().mo66537a(eVar);
        this.f70762e = new C36031j();
        C36031j jVar = this.f70762e;
        if (jVar == null) {
            C7573i.m23580a();
        }
        jVar.mo66537a(eVar);
    }

    /* renamed from: a */
    private final void m88078a(FollowStatus followStatus) {
        if (isViewValid() && mo69704y() != null) {
        }
    }

    @C7709l
    public final void onFollowStatus(FollowStatus followStatus) {
        C7573i.m23587b(followStatus, "status");
        m88078a(followStatus);
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C7573i.m23587b(followStatus, "followStatus");
        if (isViewValid()) {
            m88078a(followStatus);
        }
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (mo69704y() != null) {
            BaseAdapter y = mo69704y();
            if (y != null) {
                ((SearchUserAdapter) y).f69666f = str;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter");
        }
    }

    public final void onFollowFail(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            if (C6903bc.m21483b().mo61553a(exc)) {
                C6903bc.m21483b().mo61552a(getChildFragmentManager(), (ApiServerException) exc, new C26813b(this, exc));
            } else {
                C22814a.m75245a(getContext(), exc, R.string.b82);
            }
        }
    }

    @C7709l
    public final void onProfileFollowEvent(C23661d dVar) {
        C7573i.m23587b(dVar, "event");
        if (dVar.f62380b instanceof User) {
            Object obj = dVar.f62380b;
            if (obj != null) {
                User user = (User) obj;
                FollowStatus followStatus = new FollowStatus();
                followStatus.userId = user.getUid();
                followStatus.followStatus = dVar.f62379a;
                m88078a(followStatus);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<? extends SearchUser> list, boolean z) {
        if (C6399b.m19944t()) {
            if (mo69749N() != null) {
                C26827i N = mo69749N();
                if (N == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchUserPresenter");
                } else if (((C26847t) N).mo69507e()) {
                    z = true;
                }
            }
            z = false;
        }
        super.mo59108b(list, z);
    }
}
