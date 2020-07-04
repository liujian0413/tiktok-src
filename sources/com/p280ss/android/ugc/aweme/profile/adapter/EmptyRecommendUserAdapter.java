package com.p280ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30151ab;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C47913z;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter */
public final class EmptyRecommendUserAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    public static final C35674a f93559a = new C35674a(null);

    /* renamed from: b */
    private final HashMap<String, Boolean> f93560b = new HashMap<>();

    /* renamed from: c */
    private final Set<String> f93561c = new HashSet();

    /* renamed from: d */
    private final HashMap<String, Integer> f93562d = new HashMap<>();

    /* renamed from: e */
    private int f93563e;

    /* renamed from: f */
    private final C23267h<User> f93564f;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter$a */
    public static final class C35674a {
        private C35674a() {
        }

        public /* synthetic */ C35674a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return i == 0 ? 1 : 2;
    }

    /* renamed from: c */
    public final int mo60557c() {
        int c = super.mo60557c();
        if (c == 0) {
            return 0;
        }
        return c + 1;
    }

    /* renamed from: f */
    public final void mo90535f() {
        this.f93561c.clear();
        this.f93562d.clear();
        this.f93563e = 0;
    }

    /* renamed from: b */
    private final void m115335b(int i) {
        if (i >= 0 && i < this.f67539l.size()) {
            this.f67539l.remove(i);
            notifyItemRemoved(i + 1);
        }
    }

    public EmptyRecommendUserAdapter(C23267h<User> hVar) {
        C7573i.m23587b(hVar, "listener");
        this.f93564f = hVar;
    }

    /* renamed from: c */
    public final void mo62323c(List<User> list) {
        super.mo62323c(list);
        if (list != null) {
            for (C47913z zVar : C7525m.m23521k(list)) {
                Map map = this.f93562d;
                String uid = ((User) zVar.f122771b).getUid();
                C7573i.m23582a((Object) uid, "it.value.uid");
                map.put(uid, Integer.valueOf(this.f93563e + zVar.f122770a));
            }
        }
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            C10803a c2 = dmtStatusView.mo25937c();
            DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
            dmtTextView.setGravity(17);
            dmtTextView.setTextColor(c);
            dmtTextView.setTextSize(13.0f);
            dmtTextView.setText(R.string.cmj);
            dmtStatusView.setBuilder(c2.mo25963b((View) dmtTextView));
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: b */
    public final void mo61577b(List<User> list) {
        super.mo61577b(list);
        if (list != null) {
            for (C47913z zVar : C7525m.m23521k(list)) {
                if (!this.f93562d.containsKey(((User) zVar.f122771b).getUid())) {
                    Map map = this.f93562d;
                    String uid = ((User) zVar.f122771b).getUid();
                    C7573i.m23582a((Object) uid, "it.value.uid");
                    map.put(uid, Integer.valueOf(this.f93563e));
                    this.f93563e++;
                }
            }
        }
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C1293v vVar2;
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof RecommendFriendItemViewV2Holder)) {
            vVar2 = null;
        } else {
            vVar2 = vVar;
        }
        RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder = (RecommendFriendItemViewV2Holder) vVar2;
        if (recommendFriendItemViewV2Holder != null) {
            User a = recommendFriendItemViewV2Holder.mo76579a();
            if (a != null && !this.f93561c.contains(a.getUid())) {
                Set<String> set = this.f93561c;
                String uid = a.getUid();
                C7573i.m23582a((Object) uid, "uid");
                set.add(uid);
                C23267h<User> hVar = this.f93564f;
                Integer num = (Integer) this.f93562d.get(a.getUid());
                if (num == null) {
                    num = Integer.valueOf(0);
                }
                hVar.mo60535a(103, a, num.intValue(), vVar.itemView, "");
                C34202f.m110435a().mo86948a(3, a.getUid());
            }
        }
    }

    /* renamed from: a */
    public final void mo90533a(User user) {
        boolean z;
        C7573i.m23587b(user, "user");
        List list = this.f67539l;
        C7573i.m23582a((Object) list, "mItems");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            User user2 = (User) it.next();
            if (!(user2 instanceof User) || !C7573i.m23585a((Object) user2.getUid(), (Object) user.getUid())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        m115335b(i);
    }

    /* renamed from: a */
    public final void mo58045a(List<User> list) {
        int i;
        super.mo58045a(list);
        if (list != null) {
            for (C47913z zVar : C7525m.m23521k(list)) {
                Map map = this.f93562d;
                String uid = ((User) zVar.f122771b).getUid();
                C7573i.m23582a((Object) uid, "it.value.uid");
                map.put(uid, Integer.valueOf(this.f93563e + zVar.f122770a));
            }
        }
        int i2 = this.f93563e;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.f93563e = i2 + i;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (mo58029a(i) != 1) {
            int i2 = i - 1;
            if (!(vVar instanceof RecommendFriendItemViewV2Holder)) {
                vVar = null;
            }
            RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder = (RecommendFriendItemViewV2Holder) vVar;
            if (recommendFriendItemViewV2Holder != null) {
                Object obj = this.f67539l.get(i2);
                if (obj != null) {
                    recommendFriendItemViewV2Holder.mo76581a((User) obj, i2, false, 1);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            }
        } else {
            if (!(vVar instanceof RecommendHeaderHolder)) {
                vVar = null;
            }
            RecommendHeaderHolder recommendHeaderHolder = (RecommendHeaderHolder) vVar;
            if (recommendHeaderHolder != null) {
                recommendHeaderHolder.mo90556a(0, "");
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != 1) {
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "parent.context");
            C30151ab abVar = new C30151ab(context, this.f93560b, true);
            abVar.setEnterFrom("others_homepage");
            abVar.setListener(this.f93564f);
            abVar.setShowTag(true);
            abVar.setRecommendUserType(1);
            abVar.setBackgroundResource(R.color.a6c);
            return new RecommendFriendItemViewV2Holder(abVar);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a12, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…er_header, parent, false)");
        return new RecommendHeaderHolder(inflate);
    }

    /* renamed from: a */
    public final void mo90534a(User user, int i) {
        C7573i.m23587b(user, "user");
        List list = this.f67539l;
        C7573i.m23582a((Object) list, "mItems");
        Iterator it = C7525m.m23462a((Collection<?>) list).iterator();
        while (it.hasNext()) {
            int a = ((C7506ac) it).mo19392a();
            Object obj = this.f67539l.get(a);
            C7573i.m23582a(obj, "mItems[it]");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f67539l.get(a);
                C7573i.m23582a(obj2, "mItems[it]");
                ((User) obj2).setFollowStatus(i);
                notifyItemChanged(a);
            }
        }
    }
}
