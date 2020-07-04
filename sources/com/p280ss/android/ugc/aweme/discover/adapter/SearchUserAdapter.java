package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter */
public class SearchUserAdapter extends SearchBaseAdapter<SearchUser> {

    /* renamed from: g */
    public SearchAdData f69824g;

    /* renamed from: h */
    private C29748a f69825h;

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        SearchUserViewHolder a = SearchUserViewHolder.m87108a(viewGroup, this.f69825h);
        a.mo67896a(this.f69665e);
        a.f69827d = this.f69824g;
        return a;
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        ((SearchUserViewHolder) vVar).mo68094a((SearchUser) this.f67539l.get(i));
    }

    public SearchUserAdapter(C26501r rVar, String str, C29748a aVar) {
        super(rVar, str);
        this.f69825h = aVar;
    }
}
