package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model._CateCell_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _FeedItem_ProtoDecoder implements C2265b<FeedItem> {
    public final FeedItem decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FeedItem decodeStatic(C2272g gVar) throws Exception {
        FeedItem feedItem = new FeedItem();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        feedItem.type = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        feedItem.resId = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        feedItem.room = _Room_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (feedItem.tags == null) {
                            feedItem.tags = new ArrayList();
                        }
                        feedItem.tags.add(C2273h.m9787e(gVar));
                        break;
                    case 5:
                        feedItem.adRawString = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        feedItem.bannerContainer = _FeedBannerContainer_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        feedItem.rankRoundBanner = _RankRoundBanner_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        feedItem.cateCell = _CateCell_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        feedItem.isRecommendCard = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                feedItem.init();
                return feedItem;
            }
        }
    }
}
