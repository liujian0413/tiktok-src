package com.p280ss.android.ugc.aweme.discover.model;

import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMixUserData */
public class SearchMixUserData {

    /* renamed from: ad */
    public SearchAdData f70742ad;
    public boolean hasTopUser;
    public List<SearchUser> users;

    public SearchMixUserData setAd(SearchAdData searchAdData) {
        this.f70742ad = searchAdData;
        return this;
    }

    public SearchMixUserData setHasTopUser(boolean z) {
        this.hasTopUser = z;
        return this;
    }

    public SearchMixUserData setUsers(List<SearchUser> list) {
        this.users = list;
        return this;
    }
}
