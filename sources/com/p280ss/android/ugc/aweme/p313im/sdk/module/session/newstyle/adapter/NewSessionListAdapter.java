package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31256a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListNewViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.RecommendTitle;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend.RecommendTitleHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31511a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31517b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7018d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32001c;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.adapter.NewSessionListAdapter */
public final class NewSessionListAdapter extends BaseAdapter<Object> implements C31494a {

    /* renamed from: d */
    public static final C31495a f82472d = new C31495a(null);

    /* renamed from: a */
    public List<User> f82473a = new ArrayList();

    /* renamed from: b */
    public List<C7102a> f82474b = new ArrayList();

    /* renamed from: c */
    public C32001c<User> f82475c;

    /* renamed from: e */
    private View f82476e;

    /* renamed from: f */
    private final HashMap<String, Boolean> f82477f = new HashMap<>();

    /* renamed from: g */
    private final Map<String, Integer> f82478g = new LinkedHashMap();

    /* renamed from: h */
    private final Set<String> f82479h = new HashSet();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.adapter.NewSessionListAdapter$a */
    public static final class C31495a {
        private C31495a() {
        }

        public /* synthetic */ C31495a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.adapter.NewSessionListAdapter$b */
    static final class C31496b extends Lambda implements C7563m<RecommendContact, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ NewSessionListAdapter f82480a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f82481b;

        C31496b(NewSessionListAdapter newSessionListAdapter, ViewGroup viewGroup) {
            this.f82480a = newSessionListAdapter;
            this.f82481b = viewGroup;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m102415a((RecommendContact) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102415a(RecommendContact recommendContact, Integer num) {
            C32001c<User> cVar = this.f82480a.f82475c;
            if (cVar != null) {
                C7573i.m23582a((Object) recommendContact, "contact");
                C7573i.m23582a((Object) num, "position");
                cVar.mo82195a(102, recommendContact, num.intValue(), this.f82481b, "");
            }
        }
    }

    /* renamed from: f */
    public final int mo82187f() {
        if (this.f82476e == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    public final boolean mo82190k() {
        return this.f82473a.isEmpty();
    }

    /* renamed from: o */
    private final int m102398o() {
        List<Object> list = this.f67539l;
        if (list == null) {
            return -1;
        }
        int i = 0;
        for (Object obj : list) {
            if (obj instanceof RecommendTitle) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo60557c() {
        return super.mo60557c() + mo82187f();
    }

    /* renamed from: j */
    public final boolean mo82189j() {
        if (C6307b.m19566a((Collection<T>) this.f67539l) || (this.f67539l.size() == 1 && (this.f67539l.get(0) instanceof C31497a))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo82191l() {
        if (!C6307b.m19566a((Collection<T>) this.f67539l)) {
            List list = this.f67539l;
            C7573i.m23582a((Object) list, "mItems");
            for (Object next : list) {
                if (next instanceof C7102a) {
                    ((C7102a) next).f19950n = false;
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    public final int mo82193n() {
        boolean z;
        Iterable iterable = this.f82474b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            C7102a aVar = (C7102a) next;
            if ((!(aVar instanceof ChatSession) || (aVar instanceof C7018d)) && !(aVar instanceof C31517b)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).size();
    }

    public NewSessionListAdapter() {
        mo66506d(R.string.bmh);
    }

    /* renamed from: p */
    private final void m102399p() {
        if (!C31915n.m103671a()) {
            int size = mo62312a().size();
            for (int i = 0; i < size; i++) {
                Object obj = mo62312a().get(i);
                if ((obj instanceof User) && !(obj instanceof RecommendTitle) && !(obj instanceof RecommendContact)) {
                    Map<String, Integer> map = this.f82478g;
                    String uid = ((User) obj).getUid();
                    C7573i.m23582a((Object) uid, "item.uid");
                    map.put(uid, Integer.valueOf((i - m102398o()) - 1));
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo82192m() {
        boolean z;
        List arrayList = new ArrayList();
        if (C31915n.m103671a()) {
            arrayList.addAll(this.f82474b);
        } else {
            if (this.f82474b.isEmpty()) {
                arrayList.add(new C31497a());
            } else {
                arrayList.addAll(this.f82474b);
            }
            Iterable iterable = this.f82473a;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (((User) next).getFollowStatus() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll((List) arrayList2);
        }
        mo58045a(arrayList);
        m102399p();
    }

    /* renamed from: e */
    public final void mo82186e(List<User> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f82473a = list;
    }

    /* renamed from: b */
    private final boolean m102395b(int i) {
        if (i < mo82187f()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m102396c(int i) {
        notifyItemChanged(i + mo82187f());
    }

    /* renamed from: f */
    public final void mo82188f(List<C7102a> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f82474b = list;
    }

    /* renamed from: a */
    private static boolean m102394a(C7102a aVar) {
        if (aVar == null || (aVar instanceof C31511a) || (aVar.mo18115b() == 20 && C31256a.m101859a(aVar.bf_()))) {
            return false;
        }
        return true;
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof SessionListNewViewHolder) {
            ((SessionListNewViewHolder) vVar).mo82173a();
        }
    }

    public final void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof SessionListNewViewHolder) {
            ((SessionListNewViewHolder) vVar).mo82175b();
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (m102395b(i)) {
            return 10001;
        }
        Object obj = this.f67539l.get(i - mo82187f());
        if (obj instanceof C31497a) {
            return 10005;
        }
        if (obj instanceof C7102a) {
            return 10002;
        }
        if (obj instanceof RecommendTitle) {
            return 10003;
        }
        if (obj instanceof RecommendContact) {
            return 10006;
        }
        return 10004;
    }

    /* renamed from: c */
    public final void mo82185c(View view) {
        C7573i.m23587b(view, "view");
        if (!C7573i.m23585a((Object) view, (Object) this.f82476e)) {
            this.f82476e = view;
        }
        notifyDataSetChanged();
    }

    /* renamed from: e */
    private final void m102397e(int i) {
        if (i >= 0 && i < this.f67539l.size()) {
            Object obj = this.f67539l.get(i);
            if (obj instanceof User) {
                this.f82473a.remove(obj);
                if (this.f82473a.size() == 1 && (this.f82473a.get(0) instanceof RecommendTitle)) {
                    this.f82473a.clear();
                }
            }
            this.f67539l.remove(i);
            notifyItemRemoved(i + mo82187f());
            List list = this.f67539l;
            C7573i.m23582a((Object) list, "mItems");
            if (!list.isEmpty()) {
                List list2 = this.f67539l;
                C7573i.m23582a((Object) list2, "mItems");
                if (C7525m.m23515h(list2) instanceof RecommendTitle) {
                    this.f67539l.remove(this.f67539l.size() - 1);
                    notifyItemRemoved((this.f67539l.size() - 1) + mo82187f());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82184a(User user) {
        boolean z;
        C7573i.m23587b(user, "user");
        if (user instanceof RecommendContact) {
            m102397e(this.f67539l.indexOf(user));
            return;
        }
        List list = this.f67539l;
        C7573i.m23582a((Object) list, "mItems");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (!(next instanceof User) || !C7573i.m23585a((Object) ((User) next).getUid(), (Object) user.getUid())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        m102397e(i);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 10001:
                View view = this.f82476e;
                if (view == null) {
                    C7573i.m23580a();
                }
                return new HeaderViewHolder(view);
            case 10002:
                return new SessionListNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a33, viewGroup, false), this);
            case 10003:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a32, viewGroup, false);
                C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…end_title, parent, false)");
                return new RecommendTitleHolder(inflate);
            case 10005:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a31, viewGroup, false);
                C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…ty_status, parent, false)");
                return new EmptySessionStatusViewHolder(inflate2);
            case 10006:
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                C1293v createRecommendContactItemView = a.mo18009f().createRecommendContactItemView(viewGroup, new C31496b(this, viewGroup));
                C7573i.m23582a((Object) createRecommendContactItemView, "AwemeImManager.instance(…nt, \"\")\n                }");
                return createRecommendContactItemView;
            default:
                C6956a a2 = C6956a.m21632a();
                C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
                C1293v createRecommendViewHolder = a2.mo18009f().createRecommendViewHolder(viewGroup.getContext(), this.f82477f, this.f82475c);
                C7573i.m23582a((Object) createRecommendViewHolder, "AwemeImManager.instance(…FollowClickMap, listener)");
                return createRecommendViewHolder;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int i2;
        int i3;
        C7573i.m23587b(vVar, "holder");
        int f = i - mo82187f();
        int i4 = 0;
        switch (mo58029a(i)) {
            case 10002:
                if (vVar instanceof SessionListNewViewHolder) {
                    SessionListNewViewHolder sessionListNewViewHolder = (SessionListNewViewHolder) vVar;
                    Object obj = this.f67539l.get(f);
                    if (obj != null) {
                        sessionListNewViewHolder.mo82172a((C7102a) obj, f);
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.session.BaseSession");
                    }
                }
                break;
            case 10003:
                if (vVar instanceof RecommendTitleHolder) {
                    ((RecommendTitleHolder) vVar).mo82211a(i);
                    break;
                }
                break;
            case 10004:
                Object obj2 = this.f67539l.get(f);
                if (obj2 instanceof User) {
                    C6956a a = C6956a.m21632a();
                    C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                    C7103h f2 = a.mo18009f();
                    User user = (User) obj2;
                    Integer num = (Integer) this.f82478g.get(user.getUid());
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    f2.bindRecommendViewHolder(vVar, user, i2, false, 10);
                    if (!this.f82479h.contains(user.getUid())) {
                        Set<String> set = this.f82479h;
                        String uid = user.getUid();
                        C7573i.m23582a((Object) uid, "uid");
                        set.add(uid);
                        C32001c<User> cVar = this.f82475c;
                        if (cVar != null) {
                            Integer num2 = (Integer) this.f82478g.get(user.getUid());
                            if (num2 != null) {
                                i3 = num2.intValue();
                            } else {
                                i3 = 0;
                            }
                            View view = vVar.itemView;
                            C7573i.m23582a((Object) view, "holder.itemView");
                            cVar.mo82195a(103, user, i3, view, "");
                        }
                        C6956a a2 = C6956a.m21632a();
                        C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
                        a2.mo18009f().addImpressionId(3, user.getUid());
                        break;
                    }
                }
                break;
            case 10006:
                Object obj3 = this.f67539l.get(f);
                if (obj3 instanceof RecommendContact) {
                    C6956a a3 = C6956a.m21632a();
                    C7573i.m23582a((Object) a3, "AwemeImManager.instance()");
                    a3.mo18009f().bindRecommendContactItemView(vVar, (RecommendContact) obj3, i);
                    break;
                }
                break;
        }
        View view2 = vVar.itemView;
        C7573i.m23582a((Object) view2, "holder.itemView");
        LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            if ((f == 0 && !(vVar instanceof EmptySessionStatusViewHolder)) || ((vVar instanceof RecommendTitleHolder) && (!this.f82474b.isEmpty()))) {
                i4 = (int) C9738o.m28708b(C6399b.m19921a(), 8.0f);
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* renamed from: a */
    public final void mo82171a(Context context, int i, C7102a aVar, int i2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "session");
        switch (i2) {
            case 0:
                C32013b bVar = aVar.f19952p;
                if (bVar != null) {
                    bVar.mo18117a(context, aVar, i2);
                    return;
                }
                break;
            case 1:
            case 2:
                if (aVar.f19949m == null) {
                    aVar.f19949m = new HashMap<>();
                }
                HashMap<String, String> hashMap = aVar.f19949m;
                C7573i.m23582a((Object) hashMap, "session.extraParams");
                hashMap.put("position", String.valueOf(i));
                boolean a = m102394a(aVar);
                if (i2 == 2 && (aVar instanceof ChatSession)) {
                    C6425b.m20074a(aVar.bf_());
                    a = false;
                }
                C32013b bVar2 = aVar.f19952p;
                if (bVar2 != null) {
                    bVar2.mo18117a(context, aVar, i2);
                }
                if (a) {
                    aVar.f19946j = 0;
                }
                m102396c(i);
                return;
        }
    }
}
