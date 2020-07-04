package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendUserActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView.C36620a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder */
public class RecommendUserViewHolder extends C1293v implements C25663d<RecommendUserCardViewHolder> {

    /* renamed from: a */
    public RecommendCommonUserView f89363a;

    /* renamed from: b */
    public String f89364b;

    /* renamed from: c */
    public String f89365c;

    /* renamed from: d */
    public String f89366d = "empty";

    /* renamed from: e */
    List<String> f89367e;

    /* renamed from: a */
    public final int mo87019a(User user) {
        if (user == null) {
            return 0;
        }
        Integer num = (Integer) this.f89363a.getPosInApiListMap().get(user.getUid());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61737a(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        String str;
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f96181a;
            if (user != null) {
                if (this.f89367e == null) {
                    this.f89367e = new ArrayList();
                }
                if (!this.f89367e.contains(user.getUid())) {
                    C34202f.m110435a().mo86948a(2, user.getUid());
                    if (C6399b.m19944t()) {
                        C34138b.m109980a(user, "impression", mo87019a(user), this.f89365c);
                    } else {
                        String str2 = "impression";
                        int a = mo87019a(user);
                        String str3 = this.f89365c;
                        String str4 = this.f89366d;
                        if (TextUtils.equals("extra_follow_type_friend", this.f89364b)) {
                            str = "homepage_friends";
                        } else {
                            str = "homepage_follow";
                        }
                        C34138b.m109982a(user, str2, a, str3, str4, str);
                    }
                    this.f89367e.add(user.getUid());
                }
            }
        }
    }

    public RecommendUserViewHolder(RecommendCommonUserView recommendCommonUserView) {
        View view;
        super(recommendCommonUserView);
        this.f89363a = recommendCommonUserView;
        if (C7213d.m22500a().mo18809i()) {
            this.f89363a.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(this.f89363a.getContext(), 320.0f)));
            view = this.f89363a.findViewById(R.id.cqp);
        } else {
            this.f89363a.setLayoutParams(new LayoutParams(-1, (int) C9738o.m28708b(this.f89363a.getContext(), 300.0f)));
            view = this.f89363a.findViewById(R.id.cqp);
        }
        View findViewById = this.f89363a.findViewById(R.id.e0b);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = (int) C9738o.m28708b(this.f89363a.getContext(), 28.0f);
        findViewById.setLayoutParams(marginLayoutParams);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.bottomMargin = (int) C9738o.m28708b(this.f89363a.getContext(), 28.0f);
        view.setLayoutParams(marginLayoutParams2);
        this.f89363a.setOnViewAttachedToWindowListener(this);
    }

    /* renamed from: a */
    public final void mo87020a(List<User> list, String str) {
        this.f89365c = str;
        this.f89363a.mo92911a(list, this.f89365c);
        this.f89363a.setOnItemOperationListener(new C36630b() {
            /* renamed from: b */
            public final void mo72051b(User user, int i) {
                C21750a aVar = new C21750a();
                aVar.f58255a = 1;
                aVar.f58256b = RecommendUserViewHolder.this.getAdapterPosition();
                C42961az.m136380a(aVar);
            }

            /* renamed from: a */
            public final void mo72050a(User user, int i) {
                String str;
                C21750a aVar = new C21750a();
                aVar.f58255a = 3;
                aVar.f58257c = user.getUid();
                C42961az.m136380a(aVar);
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "delete", RecommendUserViewHolder.this.mo87019a(user), RecommendUserViewHolder.this.f89365c);
                    return;
                }
                String str2 = "delete";
                int a = RecommendUserViewHolder.this.mo87019a(user);
                String str3 = RecommendUserViewHolder.this.f89365c;
                String str4 = RecommendUserViewHolder.this.f89366d;
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                    str = "homepage_friends";
                } else {
                    str = "homepage_follow";
                }
                C34138b.m109982a(user, str2, a, str3, str4, str);
            }

            /* renamed from: c */
            public final void mo72052c(User user, int i) {
                String str;
                String str2;
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "follow", RecommendUserViewHolder.this.mo87019a(user), RecommendUserViewHolder.this.f89365c);
                    C34138b.m109979a(user);
                    return;
                }
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                String str3 = str;
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                    str2 = "homepage_friends";
                } else {
                    str2 = "homepage_follow";
                }
                String str4 = str2;
                C34138b.m109988a(RecommendUserViewHolder.this.f89365c, user.getUid(), user.getFollowStatus(), str4);
                C34138b.m109982a(user, str3, RecommendUserViewHolder.this.mo87019a(user), RecommendUserViewHolder.this.f89365c, RecommendUserViewHolder.this.f89366d, str4);
            }

            /* renamed from: d */
            public final void mo72053d(User user, int i) {
                String str;
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "enter_profile", RecommendUserViewHolder.this.mo87019a(user), RecommendUserViewHolder.this.f89365c);
                    C34138b.m109986a(RecommendUserViewHolder.this.f89365c, user);
                    return;
                }
                String str2 = "enter_profile";
                int a = RecommendUserViewHolder.this.mo87019a(user);
                String str3 = RecommendUserViewHolder.this.f89365c;
                String str4 = RecommendUserViewHolder.this.f89366d;
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                    str = "homepage_friends";
                } else {
                    str = "homepage_follow";
                }
                C34138b.m109982a(user, str2, a, str3, str4, str);
                C34138b.m110016e(user.getUid(), RecommendUserViewHolder.this.f89365c);
            }
        });
        this.f89363a.setOnLookMoreUserListener(new C36620a() {
            /* renamed from: a */
            public final void mo72054a(String str, boolean z) {
                String str2;
                String str3;
                String str4;
                if (C6399b.m19944t()) {
                    Context context = RecommendUserViewHolder.this.f89363a.getContext();
                    IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                    Context context2 = RecommendUserViewHolder.this.f89363a.getContext();
                    if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                        str4 = "homepage_friends";
                    } else {
                        str4 = "homepage_follow";
                    }
                    context.startActivity(iBridgeService.getAddFriendsActivityIntent(context2, -1, 2, str, str4));
                    C34138b.m110009d();
                    return;
                }
                Context context3 = RecommendUserViewHolder.this.f89363a.getContext();
                String curUserId = C21115b.m71197a().getCurUserId();
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                    str2 = "homepage_friends_more";
                } else {
                    str2 = "homepage_follow_more";
                }
                String str5 = str2;
                if (TextUtils.equals("extra_follow_type_friend", RecommendUserViewHolder.this.f89364b)) {
                    str3 = "homepage_friends";
                } else {
                    str3 = "homepage_follow";
                }
                RecommendUserActivity.m117277a(context3, curUserId, 2, str5, str3, str);
                C34138b.m110001c();
            }
        });
    }
}
