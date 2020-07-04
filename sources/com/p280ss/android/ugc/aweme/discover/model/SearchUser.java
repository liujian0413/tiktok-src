package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchUser */
public class SearchUser {
    @C6593c(mo15949a = "items")
    public List<Aweme> awemeCards;
    @C6593c(mo15949a = "effects")
    public List<NewFaceSticker> effectCards;
    @C6593c(mo15949a = "musics")
    public List<Music> musicCards;
    @C6593c(mo15949a = "position")
    public List<Position> position;
    @C6593c(mo15949a = "remark_position")
    public List<Position> remarkPosition;
    @C6593c(mo15949a = "uniqid_position")
    public List<Position> uniqidPosition;
    @C6593c(mo15949a = "user_info")
    public User user;

    public boolean isAladdin() {
        if (cardType() != 0) {
            return true;
        }
        return false;
    }

    public int cardType() {
        if (!C6307b.m19566a((Collection<T>) this.awemeCards)) {
            return 1;
        }
        if (!C6307b.m19566a((Collection<T>) this.musicCards)) {
            return 2;
        }
        if (!C6307b.m19566a((Collection<T>) this.effectCards)) {
            return 3;
        }
        return 0;
    }

    public int hashCode() {
        if (this.user.getUid() != null) {
            return this.user.getUid().hashCode();
        }
        return 0;
    }

    public SearchUser setUser(User user2) {
        this.user = user2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        return TextUtils.equals(this.user.getUid(), ((SearchUser) obj).user.getUid());
    }
}
