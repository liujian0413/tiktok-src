package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.model.WideSearch */
public class WideSearch extends BaseHotSearchItem {
    @C6593c(mo15949a = "challenge")
    public Challenge challenge;
    @C6593c(mo15949a = "music")
    public Music music;
    public int type;
    @C6593c(mo15949a = "user")
    public User user;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.WideSearch$WideSearchType */
    public interface WideSearchType {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WideSearch{user=");
        sb.append(this.user);
        sb.append(", challenge=");
        sb.append(this.challenge);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", type=");
        sb.append(this.type);
        sb.append('}');
        return sb.toString();
    }
}
