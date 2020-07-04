package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22824e;
import com.p280ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiClassInfoStruct;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiOpTabStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiOpCardStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiRankCardStruct;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35987o;
import com.p280ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedItemList */
public class FeedItemList implements C22824e, C6866d, IFeedItemList {
    public volatile boolean appendCache;
    @C6593c(mo15949a = "block_code")
    public int blockCode;
    public String cityCode;
    @C6593c(mo15949a = "current_city")
    public CityBean currentCity;
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "error_code")
    public int error_code;
    @C6593c(mo15949a = "extra")
    public Extra extra;
    public int fetchType;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "is_hiding_invalid_item")
    public int hidingInvalidItem;
    @C6593c(mo15949a = "guide_word")
    public HotSearchGuideWord hotSearchGuideWord;
    @C6593c(mo15949a = "invalid_item_count")
    public int invalidItemCount;
    @C6593c(mo15949a = "invalid_item_text")
    public String invalidItemText;
    public boolean isFromLocalCache;
    @C6593c(mo15949a = "aweme_list")
    public List<Aweme> items;
    public Map<String, String> localExtra = new HashMap();
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "max_cursor", mo15950b = {"max_time"})
    public long maxCursor;
    @C6593c(mo15949a = "min_cursor", mo15950b = {"min_time"})
    public long minCursor;
    public transient Long networkInfoKey;
    public transient aweme_v2_feed_response pbData;
    @C6593c(mo15949a = "poi_class_info_list")
    public List<PoiClassInfoStruct> poiClassInfoStructList;
    @C6593c(mo15949a = "poi_op_card_list")
    public List<PoiOpCardStruct> poiOpCardStructs;
    @C6593c(mo15949a = "poi_op_tab_list")
    public List<PoiOpTabStruct> poiOpTabStructs;
    @C6593c(mo15949a = "poi_rank_card_list")
    public List<PoiRankCardStruct> poiRankCardStructs;
    @C6593c(mo15949a = "preload_ads")
    public List<Aweme> preloadAds;
    @C6593c(mo15949a = "preload_awemes")
    public List<Aweme> preloadAwemes;
    @C6593c(mo15949a = "refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;
    @C6593c(mo15949a = "rid")
    public String requestId;
    @C6593c(mo15949a = "status_code")
    public int status_code;
    @C6593c(mo15949a = "status_msg")
    public String status_msg;

    public List<Aweme> getItems() {
        return this.items;
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
    }

    public boolean isForceAppend() {
        if (this.replaceFake || this.appendCache) {
            return true;
        }
        return false;
    }

    public int size() {
        if (C6307b.m19566a((Collection<T>) this.items)) {
            return 0;
        }
        return this.items.size();
    }

    public FeedItemList clone() {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        feedItemList.items = C35987o.m115949a(this.items);
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.currentCity = this.currentCity;
        feedItemList.poiClassInfoStructList = this.poiClassInfoStructList;
        feedItemList.poiOpTabStructs = this.poiOpTabStructs;
        feedItemList.poiRankCardStructs = this.poiRankCardStructs;
        feedItemList.poiOpCardStructs = this.poiOpCardStructs;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.cityCode = this.cityCode;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        return feedItemList;
    }

    public void setNetworkInfoKey(Long l) {
        this.networkInfoKey = l;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public boolean isCurrentCity(String str) {
        if (TextUtils.isEmpty(this.cityCode)) {
            return false;
        }
        return this.cityCode.equalsIgnoreCase(str);
    }

    public void setCityCode(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.cityCode = str;
        } else if (this.currentCity != null) {
            this.cityCode = this.currentCity.code;
        }
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
