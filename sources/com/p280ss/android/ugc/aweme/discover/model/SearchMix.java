package com.p280ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMix */
public class SearchMix extends SearchApiResult {
    @C6593c(mo15949a = "aweme_list")
    public List<Aweme> awemeList;
    @C6593c(mo15949a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "has_top_user")
    public boolean hasTopUser;
    @C6593c(mo15949a = "modules")
    public List<String> modulesList;
    @C6593c(mo15949a = "music_list")
    public List<Music> musicLists;
    @C6593c(mo15949a = "poi_info_list")
    public List<SearchPoi> poiList;
    @C6593c(mo15949a = "user_list")
    public List<SearchUser> users;

    public boolean isAllEmpty() {
        if (!C6307b.m19566a((Collection<T>) this.users) || !C6307b.m19566a((Collection<T>) this.musicLists) || !C6307b.m19566a((Collection<T>) this.challengeList) || !C6307b.m19566a((Collection<T>) this.awemeList)) {
            return false;
        }
        return true;
    }
}
