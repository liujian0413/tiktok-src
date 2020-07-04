package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.C5992i;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

public class LiveTabViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    LiveTabIndicator f17931b;

    /* renamed from: c */
    private final FeedLiveFragment f17932c;

    /* renamed from: b */
    public final boolean mo10319b() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo14721a(C5989f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "click");
        StringBuilder sb = new StringBuilder("live_");
        sb.append(fVar.f17758h);
        hashMap.put("event_module", sb.toString());
        C5982b.m18722a("subtab_click", (Map<String, String>) hashMap);
        this.f17932c.mo14675a(fVar);
    }

    public LiveTabViewHolder(View view, FeedLiveFragment feedLiveFragment) {
        super(view);
        this.f17931b = (LiveTabIndicator) view.findViewById(R.id.dfi);
        this.f17932c = feedLiveFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        C5992i iVar = (C5992i) feedItem.item;
        this.f17931b.setTitles(iVar.f17765a);
        this.f17931b.setOnTabClickListener(new C6050ac(this));
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "show");
        for (C5989f fVar : iVar.f17765a) {
            if (fVar.f17761k) {
                this.f17931b.mo20519a(fVar);
                String str = fVar.f17758h;
                if (str != null) {
                    StringBuilder sb = new StringBuilder("live_");
                    sb.append(str);
                    hashMap.put("enter_from_merge", sb.toString());
                }
            }
        }
        C5982b.m18722a("subtab_show", (Map<String, String>) hashMap);
    }
}
