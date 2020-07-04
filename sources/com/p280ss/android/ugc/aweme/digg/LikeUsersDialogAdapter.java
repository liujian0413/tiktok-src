package com.p280ss.android.ugc.aweme.digg;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.digg.LikeUsersViewHolder.C26347a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42953aw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersDialogAdapter */
public final class LikeUsersDialogAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    private String f69322a = "";

    /* renamed from: b */
    private String f69323b = "";

    /* renamed from: c */
    public final int mo60557c() {
        List list = this.f67539l;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo67844a(String str) {
        C7573i.m23587b(str, "previousPage");
        this.f69322a = str;
    }

    /* renamed from: b */
    public final void mo67845b(String str) {
        C7573i.m23587b(str, "enterFrom");
        this.f69323b = str;
    }

    /* renamed from: e */
    public final void mo67846e(List<? extends User> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List arrayList = new ArrayList();
            List list2 = this.f67539l;
            C7573i.m23582a((Object) list2, "mItems");
            arrayList.addAll(list2);
            this.f67539l.addAll(collection);
            C1262a aVar = this;
            List list3 = this.f67539l;
            C7573i.m23582a((Object) list3, "mItems");
            C42953aw.m136346a(aVar, arrayList, list3);
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return C26347a.m86677a(viewGroup, this.f69322a, this.f69323b);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof LikeUsersViewHolder) {
            LikeUsersViewHolder likeUsersViewHolder = (LikeUsersViewHolder) vVar;
            Object obj = this.f67539l.get(i);
            C7573i.m23582a(obj, "mItems[position]");
            likeUsersViewHolder.mo67852a((User) obj, i);
        }
    }
}
