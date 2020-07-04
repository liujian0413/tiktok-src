package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30179z;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendsTitleHolder;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33228ab.C33229a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendFriendListAdapter */
public class RecommendFriendListAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    public int f78938a;

    /* renamed from: b */
    public String f78939b = "";

    /* renamed from: c */
    public int f78940c = -1;

    /* renamed from: d */
    public boolean f78941d;

    /* renamed from: e */
    public C30016a f78942e;

    /* renamed from: f */
    private AbsActivity f78943f;

    /* renamed from: g */
    private boolean f78944g;

    /* renamed from: h */
    private C23267h<User> f78945h;

    /* renamed from: i */
    private int f78946i;

    /* renamed from: j */
    private HashMap<String, Boolean> f78947j = new HashMap<>();

    /* renamed from: k */
    private List<String> f78948k;

    /* renamed from: c */
    public final int mo60557c() {
        int i;
        int c = super.mo60557c();
        if (c > 0) {
            i = 3;
            if (this.f78946i > 0) {
                i = 4;
            }
        } else {
            i = 2;
        }
        return c + i;
    }

    /* renamed from: a */
    public final void mo76230a(boolean z) {
        this.f78944g = z;
        notifyItemChanged(0);
    }

    /* renamed from: b */
    public final void mo76231b(int i) {
        if (i > 5) {
            i = 5;
        }
        this.f78946i = i;
    }

    /* renamed from: e */
    public final void mo76232e(List<User> list) {
        mo61577b(m98433f(list));
    }

    /* renamed from: c */
    private int m98432c(int i) {
        if (this.f78946i <= 0 || i <= this.f78946i + 3) {
            return i - 3;
        }
        return i - 4;
    }

    /* renamed from: f */
    private static List<User> m98433f(List<User> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        list.clear();
        list.addAll(arrayList);
        return list;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        boolean z;
        if (this.f78946i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            if (z) {
                this.f78940c = i;
            }
            if (z) {
                return 3;
            }
            return 2;
        } else if (!z || i != this.f78946i + 3) {
            return 4;
        } else {
            return 2;
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        String str;
        super.onViewAttachedToWindow(vVar);
        if (vVar != null && (vVar instanceof RecommendFriendItemViewV2Holder)) {
            RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder = (RecommendFriendItemViewV2Holder) vVar;
            User a = recommendFriendItemViewV2Holder.mo76579a();
            if (a != null) {
                if (this.f78948k == null) {
                    this.f78948k = new ArrayList();
                }
                if (!this.f78948k.contains(a.getUid())) {
                    C33229a b = C33228ab.m107200a("follow_card").mo85057b("rec_uid", a.getUid()).mo85057b("enter_from", "find_friends").mo85057b("event_type", "impression").mo85057b("rec_reason", a.getRecommendReason()).mo85057b("impr_order", String.valueOf(mo62312a().indexOf(a))).mo85057b("req_id", a.getRequestId()).mo85057b("trigger_reason", "friend_rec_message").mo85057b("rec_reason", a.getRecommendReason());
                    String str2 = "card_type";
                    if (a.isNewRecommend()) {
                        str = "new";
                    } else {
                        str = "past";
                    }
                    b.mo85057b(str2, str).mo85252e();
                    C34202f.m110435a().mo86948a(3, recommendFriendItemViewV2Holder.mo76579a().getUid());
                    this.f78948k.add(a.getUid());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo76229a(FollowStatus followStatus) {
        if (followStatus != null && !C6319n.m19593a(followStatus.userId)) {
            List a = mo62312a();
            if (a != null) {
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    User user = (User) it.next();
                    if (followStatus.userId.equals(user.getUid())) {
                        user.setFollowStatus(followStatus.followStatus);
                        break;
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public RecommendFriendListAdapter(AbsActivity absActivity, C23267h<User> hVar) {
        this.f78943f = absActivity;
        this.f78945h = hVar;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new AddFriendsItemsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a4i, viewGroup, false), this.f78943f, this.f78939b);
            case 1:
                return new RecommendTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ako, viewGroup, false));
            case 2:
            case 3:
                return new RecommendFriendsTitleHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w7, viewGroup, false));
            case 4:
                C30179z zVar = new C30179z(viewGroup.getContext(), this.f78947j);
                zVar.setEnterFrom(this.f78939b);
                zVar.setListener(this.f78945h);
                zVar.setRecommendAwemeClickListener(this.f78942e);
                return new RecommendFriendItemViewV2Holder(zVar);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z;
        switch (mo58029a(i)) {
            case 0:
                ((AddFriendsItemsViewHolder) vVar).mo76198a(this.f78944g);
                return;
            case 1:
                return;
            case 2:
                if (vVar instanceof RecommendFriendsTitleHolder) {
                    ((RecommendFriendsTitleHolder) vVar).mo76584a(false, this.f78938a, this.f78946i, false, "");
                    return;
                }
                break;
            case 3:
                if (vVar instanceof RecommendFriendsTitleHolder) {
                    RecommendFriendsTitleHolder recommendFriendsTitleHolder = (RecommendFriendsTitleHolder) vVar;
                    recommendFriendsTitleHolder.mo76584a(true, this.f78938a, this.f78946i, false, "");
                    if (this.f78941d) {
                        recommendFriendsTitleHolder.mo76583a();
                    }
                    return;
                }
                break;
            case 4:
                if (vVar instanceof RecommendFriendItemViewV2Holder) {
                    int c = m98432c(i);
                    if ((this.f78946i <= 0 || i <= this.f78946i + 3) && this.f78946i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((RecommendFriendItemViewV2Holder) vVar).mo76581a((User) this.f67539l.get(c), c, z, this.f78938a);
                    break;
                }
                break;
        }
    }
}
