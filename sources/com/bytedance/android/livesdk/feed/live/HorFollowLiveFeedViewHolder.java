package com.bytedance.android.livesdk.feed.live;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C5912a;
import com.bytedance.android.livesdk.feed.feed.C5986c;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.p230e.C5979d;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.live.C9339m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9414c;
import com.bytedance.android.livesdkapi.p452h.C9415d;
import com.bytedance.android.livesdkapi.p452h.C9421i;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorFollowLiveFeedViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    public List<FeedItem> f17897b;

    /* renamed from: c */
    public Context f17898c;

    /* renamed from: d */
    private RecyclerView f17899d = ((RecyclerView) this.itemView.findViewById(R.id.dod));

    /* renamed from: e */
    private C5912a f17900e;

    /* renamed from: com.bytedance.android.livesdk.feed.live.HorFollowLiveFeedViewHolder$a */
    class C6043a extends C1262a<BaseViewHolder> {
        public final int getItemCount() {
            return HorFollowLiveFeedViewHolder.this.f17897b.size();
        }

        private C6043a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onViewAttachedToWindow(BaseViewHolder baseViewHolder) {
            long j;
            String str;
            String str2;
            super.onViewAttachedToWindow(baseViewHolder);
            int position = baseViewHolder.getPosition();
            if (position >= 0 && position < HorFollowLiveFeedViewHolder.this.f17897b.size() && ((FeedItem) HorFollowLiveFeedViewHolder.this.f17897b.get(position)) != null && (((FeedItem) HorFollowLiveFeedViewHolder.this.f17897b.get(position)).item instanceof Room)) {
                Room room = (Room) ((FeedItem) HorFollowLiveFeedViewHolder.this.f17897b.get(position)).item;
                if (room.getOwner() == null) {
                    j = 0;
                } else {
                    j = room.getOwner().getId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(j));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("show_type", "stay");
                String str3 = "live_type";
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                String str4 = "streaming_type";
                if (room.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put(str4, str2);
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "follow_live");
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", "live");
                hashMap.put("action_type", "click");
                C5982b.m18722a("live_show", (Map<String, String>) hashMap);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6044b(R.layout.apr, viewGroup, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
            if (i >= 0 && i < HorFollowLiveFeedViewHolder.this.f17897b.size() && HorFollowLiveFeedViewHolder.this.f17897b.get(i) != null) {
                baseViewHolder.mo10072a(HorFollowLiveFeedViewHolder.this.f17897b.get(i), i);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.live.HorFollowLiveFeedViewHolder$b */
    class C6044b extends BaseViewHolder<FeedItem> {

        /* renamed from: c */
        private HSImageView f17903c = ((HSImageView) this.itemView.findViewById(R.id.dob));

        /* renamed from: d */
        private TextView f17904d = ((TextView) this.itemView.findViewById(R.id.doe));

        /* renamed from: e */
        private View f17905e;

        /* renamed from: f */
        private C9414c f17906f;

        /* renamed from: g */
        private OnAttachStateChangeListener f17907g = new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
            }
        };

        /* renamed from: c */
        public final void mo10320c() {
            super.mo10320c();
        }

        /* renamed from: d */
        public final void mo10321d() {
            super.mo10321d();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo10072a(FeedItem feedItem, int i) {
            if (feedItem != null && (feedItem.item instanceof Room)) {
                User owner = ((Room) feedItem.item).getOwner();
                if (owner != null) {
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null && !C6311g.m19573a(avatarThumb.getUrls())) {
                        this.f17903c.setImageURI((String) avatarThumb.getUrls().get(0));
                    }
                    this.f17904d.setText(owner.getNickName());
                }
                this.f17903c.setVisibility(8);
                this.f17903c.setVisibility(0);
                this.f17906f = C5951b.m18637b().mo14563c().avatarBorderController();
                if (this.f17906f != null) {
                    this.f17903c.addOnAttachStateChangeListener(this.f17907g);
                }
                this.itemView.setOnClickListener(new C6064o(this, feedItem));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14711a(FeedItem feedItem, View view) {
            if (!C6065p.m18951a(HorFollowLiveFeedViewHolder.this.f17898c)) {
                C3517a.m12960a(HorFollowLiveFeedViewHolder.this.f17898c, (int) R.string.ekm);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem2 : HorFollowLiveFeedViewHolder.this.f17897b) {
                if (feedItem2.item instanceof Room) {
                    Room room = (Room) feedItem2.item;
                    room.setRequestId(feedItem2.requestId());
                    room.setLog_pb(feedItem2.logPb());
                    arrayList.add(room);
                }
            }
            int max = Math.max(arrayList.indexOf(feedItem.item), 0);
            C9421i.m27940b().mo23117a(C5979d.m18709a(arrayList));
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live");
            bundle.putString("source", "");
            bundle.putLong("live.intent.extra.USER_FROM", 2);
            bundle.putString("request_id", ((Room) arrayList.get(max)).getRequestId());
            bundle.putString("log_pb", ((Room) arrayList.get(max)).getLog_pb());
            bundle.putString("enter_from_merge", "live_merge");
            bundle.putString("enter_method", "follow_live");
            Bundle a = C9339m.m27770a(HorFollowLiveFeedViewHolder.this.f17898c, max, "live", null, 2, false, bundle);
            if (a.get("live.intent.extra.USER_ID") == null) {
                a.putString("live.intent.extra.USER_ID", String.valueOf(((Room) arrayList.get(max)).getOwnerUserId()));
            }
            C5951b.m18637b().mo14570j().mo23270a(HorFollowLiveFeedViewHolder.this.f17898c, ((Room) arrayList.get(max)).getId(), a);
        }

        C6044b(int i, ViewGroup viewGroup, int i2) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.apr, viewGroup, false));
            C9415d liveCircleView = C9469i.m27993e().mo14563c().liveCircleView(viewGroup.getContext());
            if (liveCircleView instanceof View) {
                this.f17905e = (View) liveCircleView;
                this.f17905e.setLayoutParams(this.itemView.findViewById(R.id.doc).getLayoutParams());
                int b = (int) C9738o.m28708b(viewGroup.getContext(), 3.0f);
                this.f17905e.setPadding(b, b, b, b);
                ((FrameLayout) this.itemView.findViewById(R.id.dnt)).addView(this.f17905e, 0);
                this.itemView.findViewById(R.id.axw).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        if (feedItem instanceof C5986c) {
            this.f17897b = ((C5986c) feedItem).f17740a;
            this.f17899d.setAdapter(new C6043a());
        }
    }

    public HorFollowLiveFeedViewHolder(View view, C5912a aVar) {
        super(view);
        this.f17898c = view.getContext();
        this.f17900e = aVar;
        this.f17899d.setLayoutManager(new SSLinearLayoutManager(this.f17898c, 0, false));
        this.f17899d.setOnTouchListener(new C6063n(this));
        this.f17900e.mo14447a(this.f17899d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14710a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            this.f17899d.getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            this.f17899d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
