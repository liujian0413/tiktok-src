package com.p280ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.choosemusic.view.SugCompletionView.C23955a;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27015d;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSugAdapter */
public class SearchSugAdapter extends C1262a<C1293v> implements C29748a {

    /* renamed from: a */
    public String f69804a;

    /* renamed from: b */
    public C27015d f69805b;

    /* renamed from: c */
    public SearchIntermediateViewModel f69806c;

    /* renamed from: d */
    private List<SearchSugEntity> f69807d = new ArrayList();

    /* renamed from: e */
    private FragmentActivity f69808e;

    /* renamed from: f */
    private C23955a f69809f;

    public int getItemCount() {
        return this.f69807d.size();
    }

    /* renamed from: a */
    public final void mo68089a(List<SearchSugEntity> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f69807d == null) {
            this.f69807d = new ArrayList();
        }
        this.f69807d.clear();
        this.f69807d.addAll(list);
    }

    public int getItemViewType(int i) {
        if (this.f69807d == null || !((SearchSugEntity) this.f69807d.get(i)).isUserType()) {
            return 0;
        }
        return 1;
    }

    public SearchSugAdapter(FragmentActivity fragmentActivity) {
        this.f69808e = fragmentActivity;
        this.f69806c = (SearchIntermediateViewModel) C0069x.m159a(this.f69808e).mo147a(SearchIntermediateViewModel.class);
        this.f69809f = new C23955a() {
            /* renamed from: a */
            public final void mo62159a() {
                if (SearchSugAdapter.this.f69806c != null) {
                    SearchSugAdapter.this.f69806c.getDismissKeyboard().setValue(Boolean.valueOf(true));
                }
            }

            /* renamed from: a */
            public final void mo62160a(boolean z) {
                if (SearchSugAdapter.this.f69806c != null) {
                    SearchSugAdapter.this.f69806c.getDismissKeyboardOnActionDown().setValue(Boolean.valueOf(z));
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo68090a(User user) {
        String str;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        new C33280v(str).mo85341b("search_sug").mo85343c("follow_button").mo85347f("follow_button").mo85345e("search_sug").mo85348g(user.getUid()).mo85352o(this.f69804a).mo85252e();
        return true;
    }

    /* renamed from: a */
    public final void mo68088a(User user, int i) {
        C26780aa.m87957a((View) null, i, (String) this.f69806c.getSearchKeyword().getValue(), 6, this.f69804a, user.getUid(), "");
        UserProfileActivity.m117388a((Context) this.f69808e, user, "search_sug");
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (getItemViewType(i) == 1) {
            ((SearchUserViewHolder) vVar).mo68094a(((SearchSugEntity) this.f69807d.get(i)).sugUser);
        } else {
            ((SearchSugViewHolder) vVar).mo68092a((SearchSugEntity) this.f69807d.get(i), this.f69804a, i);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return SearchUserViewHolder.m87108a(viewGroup, this);
        }
        return new SearchSugViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2r, viewGroup, false), this.f69805b, this.f69809f);
    }
}
