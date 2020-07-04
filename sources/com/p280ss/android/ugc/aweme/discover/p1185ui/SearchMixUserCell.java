package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.commercialize.views.SearchAdView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26741a;
import com.p280ss.android.ugc.aweme.discover.mob.C26775a;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell */
public class SearchMixUserCell extends C27022aw<SearchMixUserData> implements C0042h {

    /* renamed from: h */
    public SearchResultParam f71191h;

    /* renamed from: i */
    RecyclerView f71192i;

    /* renamed from: j */
    private final ViewGroup f71193j;

    /* renamed from: k */
    private final LinearLayout f71194k;

    /* renamed from: l */
    private final C26964a f71195l;

    /* renamed from: m */
    private SearchUserAdapter f71196m;

    /* renamed from: n */
    private View f71197n;

    /* renamed from: o */
    private SearchAdView f71198o;

    /* renamed from: p */
    private ViewStub f71199p;

    /* renamed from: q */
    private SearchMixUserData f71200q;

    /* renamed from: r */
    private boolean f71201r;

    /* renamed from: s */
    private C26741a f71202s;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell$a */
    class C26964a implements C29748a {
        private C26964a() {
        }

        /* renamed from: a */
        public final boolean mo68090a(User user) {
            String str;
            String str2;
            String str3;
            boolean a = SearchMixUserCell.this.mo69745a(user);
            MobClick obtain = MobClick.obtain();
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            C6907h.onEvent(obtain.setEventName(str).setLabelName("general_search").setValue(user.getUid()));
            if (a) {
                str2 = "aladdin_card";
            } else {
                str2 = "follow_button";
            }
            if (user.getFollowStatus() == 0) {
                str3 = "follow";
            } else {
                str3 = "follow_cancel";
            }
            new C33280v(str3).mo85341b("general_search").mo85343c(str2).mo85347f("follow_button").mo85345e("general_search").mo85348g(user.getUid()).mo85352o(user.getRequestId()).mo85252e();
            if (a) {
                C26775a.m87934a("follow", user.getUid(), SearchMixUserCell.this.f71309b);
            }
            return true;
        }

        /* renamed from: a */
        public final void mo68088a(User user, int i) {
            String str;
            String a;
            String str2;
            boolean a2 = SearchMixUserCell.this.mo69745a(user);
            if (SearchMixUserCell.this.f71191h == null) {
                str = "";
            } else {
                str = SearchMixUserCell.this.f71191h.getKeyword();
            }
            View view = SearchMixUserCell.this.f71309b;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            if (a2) {
                a = "aladdin_card";
            } else {
                a = C26780aa.m87952a(str);
            }
            C26780aa.m87957a(view, i, str, 3, requestId, uid, a);
            SmartRoute withParam = SmartRouter.buildRoute(SearchMixUserCell.this.f71308a, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head");
            String str3 = "enter_method";
            if (a2) {
                str2 = "aladdin_card";
            } else {
                str2 = C26780aa.m87952a(str);
            }
            withParam.withParam(str3, str2).withParam("general_search_card_type", SearchMixUserCell.this.mo69742a(user.getUid())).open();
            if (a2) {
                C26775a.m87934a("user_information", user.getUid(), SearchMixUserCell.this.f71309b);
            }
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    public final void mo69746b(boolean z) {
        this.f71201r = z;
        if (z) {
            this.f71311d.setText(R.string.fpn);
        }
    }

    /* renamed from: a */
    public final int mo69742a(String str) {
        if (this.f71200q == null || this.f71200q.users == null) {
            return 0;
        }
        for (SearchUser searchUser : this.f71200q.users) {
            if (TextUtils.equals(searchUser.user.getUid(), str)) {
                return searchUser.cardType();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo69745a(User user) {
        if (this.f71200q.users != null) {
            for (SearchUser searchUser : this.f71200q.users) {
                if (searchUser.isAladdin() && searchUser.user.getUid().contains(user.getUid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m88658a(List<SearchUser> list) {
        List<SearchUser> list2;
        if (this.f71193j != null && this.f71194k != null) {
            if (list == null || list.size() <= 1) {
                this.f71193j.setVisibility(8);
                return;
            }
            if (list.size() > 6) {
                list2 = list.subList(1, 7);
            } else {
                list2 = list.subList(1, list.size());
            }
            this.f71194k.removeAllViews();
            for (SearchUser searchUser : list2) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f71308a).inflate(R.layout.a_x, this.f71194k, false);
                C23323e.m76524b((AvatarImageView) viewGroup.findViewById(R.id.jc), searchUser.user.getAvatarThumb());
                this.f71194k.addView(viewGroup);
            }
            LayoutInflater.from(this.f71308a).inflate(R.layout.a_y, this.f71194k, true);
            this.f71193j.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    SearchMixUserCell.this.f71314g.mo68509a();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo69744a(SearchMixUserData searchMixUserData, SearchResultParam searchResultParam, boolean z) {
        this.f71192i.removeAllViews();
        this.f71200q = searchMixUserData;
        if (!C6307b.m19566a((Collection<T>) this.f71200q.users)) {
            this.f71191h = searchResultParam;
            this.f71196m = new SearchUserAdapter(new C26501r(true, this.f71191h), searchResultParam.getKeyword(), this.f71195l);
            this.f71196m.f69824g = searchMixUserData.f70742ad;
            this.f71192i.setAdapter(this.f71196m);
            this.f71196m.mo66516d(false);
            if (searchMixUserData.hasTopUser) {
                this.f71196m.mo58045a(Collections.singletonList((SearchUser) searchMixUserData.users.get(0)));
                this.f71312e.setVisibility(8);
                m88658a(searchMixUserData.users);
            } else {
                this.f71196m.mo58045a(searchMixUserData.users);
                if (this.f71193j != null) {
                    this.f71193j.setVisibility(8);
                }
                mo69797a(z);
            }
            this.f71197n.setVisibility(0);
            if (searchMixUserData.f70742ad != null) {
                if (this.f71198o == null) {
                    this.f71198o = (SearchAdView) this.f71199p.inflate();
                } else {
                    this.f71198o.setVisibility(0);
                }
                this.f71198o.setup(searchMixUserData.f70742ad);
                if (searchMixUserData.f70742ad.adType == 1) {
                    this.f71197n.setVisibility(8);
                } else if (this.f71193j == null || this.f71193j.getVisibility() == 8) {
                    this.f71198o.mo66241a();
                    this.f71197n.setVisibility(8);
                } else {
                    this.f71198o.mo66243b();
                }
            } else {
                if (this.f71198o != null) {
                    this.f71198o.setVisibility(8);
                }
            }
        }
    }

    public SearchMixUserCell(View view, Context context, C27024a aVar, C26741a aVar2) {
        int i;
        super(view, context, aVar);
        DmtTextView dmtTextView = this.f71310c;
        if (C6399b.m19947w()) {
            i = R.string.fmt;
        } else {
            i = R.string.flk;
        }
        dmtTextView.setText(i);
        if (!C6399b.m19944t()) {
            this.f71311d.setText(R.string.hz);
        }
        this.f71193j = (ViewGroup) view.findViewById(R.id.d1_);
        this.f71194k = (LinearLayout) view.findViewById(R.id.d19);
        this.f71197n = view.findViewById(R.id.b54);
        this.f71199p = (ViewStub) view.findViewById(R.id.czr);
        this.f71195l = new C26964a();
        this.f71192i = new RecyclerView(this.f71308a);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.f71308a);
        wrapLinearLayoutManager.mo5427b(1);
        this.f71192i.setLayoutManager(wrapLinearLayoutManager);
        this.f71192i.getItemAnimator().f4943l = 0;
        this.f71313f.addView(this.f71192i);
        this.f71202s = aVar2;
    }
}
