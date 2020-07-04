package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.LikeListHead;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.LikeListHeadViewHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter */
public final class LikeListAdapter extends BaseAdapter<User> {

    /* renamed from: e */
    public static final C34503a f89996e = new C34503a(null);

    /* renamed from: a */
    public UrlModel f89997a;

    /* renamed from: b */
    public String f89998b;

    /* renamed from: c */
    public C7561a<C7581n> f89999c;

    /* renamed from: d */
    public int f90000d;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter$a */
    public static final class C34503a {
        private C34503a() {
        }

        public /* synthetic */ C34503a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo87814a(int i) {
            m111569a(i, "click");
        }

        /* renamed from: b */
        public final void mo87815b(int i) {
            m111569a(i, "show");
        }

        /* renamed from: a */
        private static void m111569a(int i, String str) {
            C6907h.m21524a("notification_message_folded_message", (Map) C22984d.m75611a().mo59973a("action_type", str).mo59973a("account_type", "like").mo59970a("client_order", i).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter$b */
    static final class C34504b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ LikeListAdapter f90001a;

        /* renamed from: b */
        final /* synthetic */ List f90002b;

        /* renamed from: c */
        final /* synthetic */ List f90003c;

        /* renamed from: d */
        final /* synthetic */ int f90004d;

        /* renamed from: e */
        final /* synthetic */ List f90005e;

        C34504b(LikeListAdapter likeListAdapter, List list, List list2, int i, List list3) {
            this.f90001a = likeListAdapter;
            this.f90002b = list;
            this.f90003c = list2;
            this.f90004d = i;
            this.f90005e = list3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m111572a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111572a() {
            int i = 0;
            while (this.f90003c.size() + i < this.f90001a.f90000d + this.f90004d && i < this.f90002b.size()) {
                this.f90005e.add(this.f90002b.get(i));
                i++;
            }
            if (i < this.f90002b.size()) {
                this.f90005e.add(new MusTimestampTitleItem(1));
                this.f90005e.addAll(this.f90002b.subList(i, this.f90002b.size()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter$c */
    static final class C34505c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C34505c f90006a = new C34505c();

        C34505c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    public LikeListAdapter() {
        this(0, 1, null);
    }

    private LikeListAdapter(int i) {
        this.f90000d = i;
        this.f89999c = C34505c.f90006a;
    }

    /* renamed from: a */
    public final void mo87813a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f89999c = aVar;
    }

    /* renamed from: c */
    public final void mo62323c(List<User> list) {
        super.mo62323c(m111560a(list, true));
    }

    /* renamed from: a */
    public final void mo58045a(List<User> list) {
        List a = m111560a(list, false);
        a.add(0, new LikeListHead());
        super.mo58045a(a);
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof LikeListHolder)) {
            vVar = null;
        }
        LikeListHolder likeListHolder = (LikeListHolder) vVar;
        if (likeListHolder != null) {
            f89996e.mo87815b(likeListHolder.getAdapterPosition());
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (mo62312a().get(i) instanceof LikeListHead) {
            return 15;
        }
        if (mo62312a().get(i) instanceof MusTimestampTitleItem) {
            return 14;
        }
        return super.mo58029a(i);
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.bmc);
        DmtTextView dmtTextView2 = new DmtTextView(viewGroup.getContext());
        dmtTextView2.setGravity(17);
        dmtTextView2.setTextColor(c);
        dmtTextView2.setTextSize(13.0f);
        dmtTextView2.setText(R.string.bnk);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) dmtTextView2));
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final void mo87812a(FollowStatus followStatus) {
        String str;
        C7573i.m23587b(followStatus, "followStatus");
        List a = mo62312a();
        if (a != null) {
            int i = 0;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                User user = (User) it.next();
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (C7573i.m23585a((Object) str, (Object) followStatus.userId)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Object obj = a.get(i);
                C7573i.m23582a(obj, "currentData[index]");
                ((User) obj).setFollowStatus(followStatus.followStatus);
                notifyItemChanged(i);
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 14:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.af8, viewGroup, false);
                C7573i.m23582a((Object) inflate, "view");
                return new MTTimestampTitleHolder(inflate);
            case 15:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x2, viewGroup, false);
                C7573i.m23582a((Object) inflate2, "view");
                return new LikeListHeadViewHolder(inflate2, this.f89997a, this.f89998b, this.f89999c);
            default:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aew, viewGroup, false);
                C7573i.m23582a((Object) inflate3, "view");
                return new LikeListHolder(inflate3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<User> m111560a(List<User> list, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f90000d == 0) {
            if (list == null) {
                list = new ArrayList<>();
            }
            return list;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        } else {
            List a = mo62312a();
            if (a == null) {
                a = new ArrayList();
            }
            List<User> arrayList = new ArrayList<>();
            Iterable iterable = a;
            Iterator a2 = C7525m.m23526p(iterable).mo19416a();
            while (true) {
                if (!a2.hasNext()) {
                    i = 0;
                    break;
                }
                User user = (User) a2.next();
                if (!(user instanceof MusTimestampTitleItem) || ((MusTimestampTitleItem) user).getType() != 0) {
                    z4 = false;
                    continue;
                } else {
                    z4 = true;
                    continue;
                }
                if (z4) {
                    i = 1;
                    break;
                }
            }
            Iterator a3 = C7525m.m23526p(iterable).mo19416a();
            while (true) {
                if (!a3.hasNext()) {
                    z2 = false;
                    break;
                }
                User user2 = (User) a3.next();
                if (!(user2 instanceof MusTimestampTitleItem) || ((MusTimestampTitleItem) user2).getType() != 1) {
                    z3 = false;
                    continue;
                } else {
                    z3 = true;
                    continue;
                }
                if (z3) {
                    z2 = true;
                    break;
                }
            }
            C34504b bVar = new C34504b(this, list, a, i, arrayList);
            C7561a aVar = bVar;
            if (!z) {
                if (i == 0) {
                    arrayList.add(new MusTimestampTitleItem(0));
                }
                aVar.invoke();
            } else if (i != 0 && (z2 || a.size() + list.size() < this.f90000d + i)) {
                arrayList.addAll(list);
                return arrayList;
            } else if (i != 0) {
                aVar.invoke();
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        switch (mo58029a(i)) {
            case 14:
                if (vVar != null) {
                    MTTimestampTitleHolder mTTimestampTitleHolder = (MTTimestampTitleHolder) vVar;
                    Object obj = mo62312a().get(i);
                    if (obj != null) {
                        mTTimestampTitleHolder.mo87877a((MusTimestampTitleItem) obj);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder");
            case 15:
                return;
            default:
                if (vVar != null) {
                    LikeListHolder likeListHolder = (LikeListHolder) vVar;
                    Object obj2 = mo62312a().get(i);
                    C7573i.m23582a(obj2, "data[position]");
                    likeListHolder.mo87865a((User) obj2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder");
        }
    }

    public /* synthetic */ LikeListAdapter(int i, int i2, C7571f fVar) {
        this(0);
    }
}
