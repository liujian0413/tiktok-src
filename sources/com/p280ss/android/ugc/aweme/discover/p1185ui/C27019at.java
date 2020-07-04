package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForChallenge;
import com.p280ss.android.ugc.aweme.discover.alading.SearchAwemeCardForUser;
import com.p280ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchChallengeFragment;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchFeedFragment;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchMusicFragment;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchUserFragment;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.at */
public final class C27019at {
    /* renamed from: a */
    public static int m88771a() {
        return C27029ba.m88789a();
    }

    /* renamed from: a */
    public static SearchIntermediateFragment m88775a(int i) {
        if (i == C27029ba.f71319a) {
            return new MixIntermediateFragment();
        }
        if (i == C27029ba.f71321c) {
            return new UserIntermediateFragment();
        }
        if (i == C27029ba.f71323e) {
            return new MusicIntermediateFragment();
        }
        if (i == C27029ba.f71324f) {
            return new ChallengeIntermediateFragment();
        }
        if (i == C27029ba.f71320b) {
            return new VideoIntermediateFragment();
        }
        return new UserIntermediateFragment();
    }

    /* renamed from: a */
    public static C1293v m88772a(ViewGroup viewGroup, SearchChallenge searchChallenge) {
        return SearchAwemeCardForChallenge.m87268a(viewGroup, searchChallenge);
    }

    /* renamed from: a */
    public static C1293v m88773a(ViewGroup viewGroup, SearchUser searchUser) {
        if (searchUser.cardType() == 1) {
            return SearchAwemeCardForUser.m87277a(viewGroup, searchUser);
        }
        return null;
    }

    /* renamed from: a */
    public static SearchFragment m88774a(SearchResultParam searchResultParam, int i) {
        SearchFragment searchFragment;
        if (i == C27029ba.f71319a) {
            searchFragment = new SearchJediMixFeedFragment();
        } else if (i == C27029ba.f71321c) {
            searchFragment = new SearchUserFragment();
        } else if (i == C27029ba.f71323e) {
            searchFragment = new SearchMusicFragment();
        } else if (i == C27029ba.f71324f) {
            searchFragment = new SearchChallengeFragment();
        } else if (i == C27029ba.f71320b) {
            searchFragment = new SearchFeedFragment();
        } else {
            searchFragment = new SearchUserFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(SearchBaseFragment.f71083r, searchResultParam);
        searchFragment.setArguments(bundle);
        return searchFragment;
    }
}
