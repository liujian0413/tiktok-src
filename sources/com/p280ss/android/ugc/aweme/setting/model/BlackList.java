package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.BlackList */
public class BlackList extends BaseResponse {
    @C6593c(mo15949a = "block_list")
    public List<User> blockList;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "index")
    public int index;
}
