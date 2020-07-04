package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse */
public final class VoteDetailResponse extends BaseResponse {
    @C6593c(mo15949a = "has_more")
    private boolean hasMore;
    @C6593c(mo15949a = "offset")
    private int offset;
    @C6593c(mo15949a = "user_list")
    private List<? extends User> users;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setUsers(List<? extends User> list) {
        this.users = list;
    }
}
