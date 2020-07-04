package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SuggestUserViewModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.UserIntermediateFragment */
public final class UserIntermediateFragment extends SearchIntermediateFragment<SuggestUser> {

    /* renamed from: e */
    private SuggestUserViewModel f71269e;

    /* renamed from: f */
    private final C0053p<C26568a<List<SuggestUser>>> f71270f = new C26992a(this);

    /* renamed from: g */
    private HashMap f71271g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.UserIntermediateFragment$a */
    static final class C26992a<T> implements C0053p<C26568a<List<? extends SuggestUser>>> {

        /* renamed from: a */
        final /* synthetic */ UserIntermediateFragment f71272a;

        C26992a(UserIntermediateFragment userIntermediateFragment) {
            this.f71272a = userIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26568a<List<SuggestUser>> aVar) {
            if (this.f71272a.isViewValid()) {
                List list = null;
                if (aVar != null && aVar.f70088a) {
                    list = aVar.f70089b;
                }
                this.f71272a.mo69721o().mo68079c(list);
                this.f71272a.mo69782a(list);
            }
        }
    }

    /* renamed from: a */
    public final String mo69547a() {
        return "user";
    }

    /* renamed from: d */
    public final int mo69549d() {
        return C27029ba.f71321c;
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f71271g != null) {
            this.f71271g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: e */
    public final void mo69550e() {
        super.mo69550e();
        if (C37380c.m119975b()) {
            SuggestUserViewModel suggestUserViewModel = this.f71269e;
            if (suggestUserViewModel == null) {
                C7573i.m23583a("mSuggestUserViewModel");
            }
            suggestUserViewModel.mo70001a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0063u a = C0069x.m157a((Fragment) this).mo147a(SuggestUserViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…serViewModel::class.java)");
        this.f71269e = (SuggestUserViewModel) a;
        SuggestUserViewModel suggestUserViewModel = this.f71269e;
        if (suggestUserViewModel == null) {
            C7573i.m23583a("mSuggestUserViewModel");
        }
        suggestUserViewModel.f71769a.observe(this, this.f71270f);
    }

    /* renamed from: a */
    public final void mo69782a(List<SuggestUser> list) {
        Collection collection = list;
        if (!C6307b.m19566a(collection)) {
            StringBuilder sb = new StringBuilder();
            if (list == null) {
                C7573i.m23580a();
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                User user = ((SuggestUser) list.get(i)).user;
                if (user != null) {
                    sb.append(user.getUid());
                    if (i < list.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            C6907h.m21524a("search_for_you_show", (Map) C22984d.m75611a().mo59973a("search_type", mo69547a()).mo59973a("user_list", sb.toString()).f60753a);
        }
    }
}
