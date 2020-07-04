package com.bytedance.android.livesdk.feed.live;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.C5924a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.common.utility.C9738o;
import p346io.reactivex.p354j.C7486b;

public class SmallLiveViewHolder extends CommonLiveViewHolder {

    /* renamed from: w */
    public static int f17933w = -1;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo14709g() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14703a(ImageModel imageModel) {
        if (imageModel == null) {
            m18940a(0, 0);
        } else {
            m18940a(imageModel.width, imageModel.height);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14705a(FeedItem feedItem) {
        Bundle bundle = new Bundle();
        String str = this.f17868d.f17733b;
        if (str.contains("live") && FeedLiveFragment.f17788A != null) {
            this.f17871g = FeedLiveFragment.f17788A;
            str = FeedLiveFragment.f17788A.f17758h;
            TextUtils.isEmpty(str);
        }
        bundle.putString("source", str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_small_picture");
        bundle2.putString("subtab", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putString("enter_from", "live");
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.f17871g.f17759i);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        mo14701a(feedItem, true, "small_picture", bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14704a(ImageModel imageModel, Room room) {
        m18940a(imageModel.getWidth(), imageModel.getHeight());
        super.mo14704a(imageModel, room);
        if (C5924a.f17550c) {
            m18874a((View) this.f17885p, 8);
            m18874a(this.f17884o, 8);
        }
    }

    /* renamed from: a */
    private void m18940a(int i, int i2) {
        int i3;
        if (f17933w <= 0) {
            f17933w = (C9738o.m28691a(this.itemView.getContext()) - 3) / 2;
        }
        if (i <= 0 || i2 <= 0) {
            i3 = f17933w;
        } else {
            i3 = (f17933w * i2) / i;
        }
        LayoutParams layoutParams = this.f17880k.getLayoutParams();
        if (layoutParams.width != f17933w || layoutParams.height != i3) {
            layoutParams.width = f17933w;
            layoutParams.height = i3;
            this.f17880k.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14695a(FeedItem feedItem, Room room, int i) {
        super.mo14695a(feedItem, room, i);
        m18874a(this.f17884o, 8);
    }

    public SmallLiveViewHolder(View view, C5972a aVar, C5980f fVar, FeedDataKey feedDataKey, C6037j jVar, C9418f fVar2, C7486b<FeedItem> bVar, C7486b<Boolean> bVar2, C7486b<Object> bVar3, C7486b<Object> bVar4) {
        super(view, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar2, bVar3, bVar4);
    }
}
