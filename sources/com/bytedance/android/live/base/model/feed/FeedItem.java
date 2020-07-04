package com.bytedance.android.live.base.model.feed;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.C2320b;
import com.bytedance.android.live.base.model.C2335b;
import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.base.model.banner.C2338b;
import com.bytedance.android.live.base.model.banner.C2339c;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedItem {
    public transient JSONObject adJSONObject;
    @C6593c(mo15949a = "ad")
    public String adRawString;
    @C6593c(mo15949a = "banner")
    public C2338b bannerContainer;
    public transient List<C2337a> banners;
    @C6593c(mo15949a = "cate_cell")
    public C2335b cateCell;
    @C6593c(mo15949a = "data")
    C6711m data;
    @C6593c(mo15949a = "is_recommend_card")
    public boolean isRecommendCard;
    public transient C2343f item;
    public transient String logPb;
    public transient Object object;
    @C6593c(mo15949a = "order_type")
    public int orderType;
    @C6593c(mo15949a = "rank_round_banner")
    public C2339c rankRoundBanner;
    public transient boolean repeatDisable;
    @C6593c(mo15949a = "rid")
    public String resId;
    transient Room room;
    public transient String searchId = "";
    public transient String searchReqId = "";
    @C6593c(mo15949a = "tags")
    public List<String> tags;
    @C6593c(mo15949a = "type")
    public int type;

    public C2343f item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public int hashCode() {
        return C2320b.m9936a(this.item);
    }

    public String toString() {
        if (this.item == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        return this.item.toString();
    }

    public Room getRoom() {
        if (this.room != null) {
            return this.room;
        }
        this.room = (Room) C2317a.m9932a().mo15970a((C6709k) this.data, Room.class);
        return this.room;
    }

    public void init() {
        if (this.type == 1 || this.type == 2 || this.type == 4 || this.type == 5) {
            this.item = getRoom();
            return;
        }
        if (this.type == 3) {
            try {
                String str = new String(Base64.decode(this.adRawString, 1));
                if (!TextUtils.isEmpty(str)) {
                    this.adJSONObject = new JSONObject(str);
                    this.item = (C2343f) C2317a.m9932a().mo15974a(str, C9368k.class);
                    long currentTimeMillis = System.currentTimeMillis();
                    ((C9368k) this.item).f25677K = currentTimeMillis;
                    this.adJSONObject.put("subId", currentTimeMillis);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void setRoom(Room room2) {
        this.room = room2;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2320b.m9937a(this.item, ((FeedItem) obj).item);
    }

    public static FeedItem create(int i, C2343f fVar) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = fVar;
        return feedItem;
    }

    public static FeedItem create(int i, C2343f fVar, String str, String str2) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = fVar;
        feedItem.logPb = str;
        feedItem.resId = str2;
        return feedItem;
    }
}
