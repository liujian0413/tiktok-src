package com.bytedance.android.livesdk.feed.live;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.common.utility.C9738o;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.p354j.C7486b;

public class LargeLiveViewHolder extends CommonLiveViewHolder {

    /* renamed from: w */
    public static int f17928w = -1;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo14709g() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14705a(FeedItem feedItem) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_big_picture");
        String str = this.f17868d.f17733b;
        if (str.contains("live") && FeedLiveFragment.f17788A != null) {
            this.f17871g = FeedLiveFragment.f17788A;
            str = FeedLiveFragment.f17788A.f17758h;
            TextUtils.isEmpty(str);
        }
        bundle2.putString("subtab", str);
        bundle.putString("source", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.f17871g.f17759i);
        bundle.putString("enter_from", "live");
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        mo14701a(feedItem, true, "big_picture", bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14695a(FeedItem feedItem, Room room, int i) {
        super.mo14695a(feedItem, room, i);
        if (!TextUtils.isEmpty(room.getDistanceCity())) {
            this.f17885p.setText(room.getDistanceCity());
        } else if (!TextUtils.isEmpty(room.getDistance())) {
            this.f17885p.setText(room.getDistance());
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_page", "city");
            hashMap.put("event_type", "show");
            C5982b.m18722a("boost_info_show", (Map<String, String>) hashMap);
        }
        if (f17928w <= 0) {
            f17928w = C9738o.m28691a(this.f17880k.getContext());
        }
        HSImageView hSImageView = this.f17880k;
        int i2 = f17928w;
        hSImageView.setLayoutParams(new LayoutParams(i2, i2));
    }

    public LargeLiveViewHolder(View view, C5972a aVar, C5980f fVar, FeedDataKey feedDataKey, C6037j jVar, C9418f fVar2, C7486b<FeedItem> bVar, C7486b<Boolean> bVar2, C7486b<Object> bVar3, C7486b<Object> bVar4) {
        super(view, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar2, bVar3, bVar4);
    }
}
