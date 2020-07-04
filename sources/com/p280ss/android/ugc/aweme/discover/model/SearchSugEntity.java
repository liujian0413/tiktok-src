package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSugEntity */
public class SearchSugEntity {
    @C6593c(mo15949a = "content")
    public String content;
    public Map<String, String> extraParam;
    public boolean isMobShow;
    @C6593c(mo15949a = "word_record")
    public Word mWord;
    @C6593c(mo15949a = "pos")
    public List<Position> position;
    @C6593c(mo15949a = "sug_type")
    public String sugType;
    @C6593c(mo15949a = "sug_user")
    public SearchUser sugUser;

    public boolean isUserType() {
        return TextUtils.equals(this.sugType, "user");
    }
}
