package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct */
public class RoomFeedCellStruct implements Serializable {
    @C6593c(mo15949a = "distance")
    public String distance;
    @C6593c(mo15949a = "icon")
    public UrlModel icon;
    @C6593c(mo15949a = "fans_struct")
    public FansStruct mFansStruct;
    @C6593c(mo15949a = "room")
    public LiveRoomStruct room;
    @C6593c(mo15949a = "tag")
    public String tag;
    @C6593c(mo15949a = "tag_id")
    public long tagId;
    @C6593c(mo15949a = "type")
    public int type;
}
