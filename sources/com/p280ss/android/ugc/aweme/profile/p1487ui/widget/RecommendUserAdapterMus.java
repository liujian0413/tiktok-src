package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus.C36635a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus.C36636b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapterMus */
public final class RecommendUserAdapterMus extends BaseAdapter<User> {

    /* renamed from: a */
    public C36631a f96172a;

    /* renamed from: b */
    public String f96173b;

    /* renamed from: c */
    public int f96174c;

    /* renamed from: d */
    private int f96175d;

    /* renamed from: e */
    private C25663d<RecommendUserCardViewHolderMus> f96176e;

    /* renamed from: f */
    private C36636b f96177f;

    /* renamed from: g */
    private final HashMap<String, Integer> f96178g = new HashMap<>();

    /* renamed from: h */
    private final C36632b f96179h = new C36632b(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapterMus$a */
    public interface C36631a {
        /* renamed from: a */
        void mo92144a(User user, int i);

        /* renamed from: b */
        void mo92145b(User user, int i);

        /* renamed from: c */
        void mo92146c(User user, int i);

        /* renamed from: d */
        void mo92147d(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapterMus$b */
    public static final class C36632b implements C36635a {

        /* renamed from: a */
        final /* synthetic */ RecommendUserAdapterMus f96180a;

        C36632b(RecommendUserAdapterMus recommendUserAdapterMus) {
            this.f96180a = recommendUserAdapterMus;
        }

        /* renamed from: a */
        public final void mo92951a(User user, int i) {
            C7573i.m23587b(user, "user");
            if (i >= 0 && i < this.f96180a.f67539l.size()) {
                this.f96180a.f67539l.remove(i);
                this.f96180a.notifyItemRemoved(i);
                if (this.f96180a.f96172a != null) {
                    C36631a aVar = this.f96180a.f96172a;
                    if (aVar != null) {
                        aVar.mo92144a(user, i);
                    }
                    if (this.f96180a.f67539l.isEmpty()) {
                        C36631a aVar2 = this.f96180a.f96172a;
                        if (aVar2 != null) {
                            aVar2.mo92145b(user, i);
                        }
                    }
                }
                if (i != this.f96180a.f67539l.size()) {
                    RecommendUserAdapterMus recommendUserAdapterMus = this.f96180a;
                    recommendUserAdapterMus.notifyItemRangeChanged(i, recommendUserAdapterMus.f67539l.size() - i);
                }
            }
        }
    }

    /* renamed from: a */
    public final List<User> mo62312a() {
        List<User> list = this.f67539l;
        C7573i.m23582a((Object) list, "mItems");
        return list;
    }

    /* renamed from: f */
    public final Map<String, Integer> mo92950f() {
        return this.f96178g;
    }

    /* renamed from: a */
    public final void mo92947a(C25663d<RecommendUserCardViewHolderMus> dVar) {
        C7573i.m23587b(dVar, "onViewAttachedToWindowListener");
        this.f96176e = dVar;
    }

    /* renamed from: b */
    private User m118194b(int i) {
        if (this.f67539l == null || i < 0 || i >= this.f67539l.size()) {
            return null;
        }
        return (User) this.f67539l.get(i);
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof RecommendUserCardViewHolderMus) {
            C25663d<RecommendUserCardViewHolderMus> dVar = this.f96176e;
            if (dVar != null) {
                dVar.mo61737a(vVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo92948a(C36631a aVar) {
        C7573i.m23587b(aVar, "onItemOperationListener");
        this.f96172a = aVar;
    }

    /* renamed from: a */
    public final void mo92949a(C36636b bVar) {
        C7573i.m23587b(bVar, "onItemFollowListener");
        this.f96177f = bVar;
    }

    /* renamed from: a */
    public final void mo58045a(List<? extends User> list) {
        C7573i.m23587b(list, "list");
        this.f67539l = list;
        List list2 = this.f67539l;
        C7573i.m23582a((Object) list2, "mItems");
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f67539l.get(i);
            Map map = this.f96178g;
            C7573i.m23582a((Object) user, "item");
            String uid = user.getUid();
            C7573i.m23582a((Object) uid, "item.uid");
            map.put(uid, Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        ((RecommendUserCardViewHolderMus) vVar).mo92958a(m118194b(i), i, this.f96179h, this.f96177f, this.f96172a, this.f96175d, this.f96173b);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1o, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…er_card_m, parent, false)");
        return new RecommendUserCardViewHolderMus(inflate, this.f96174c);
    }
}
