package com.bytedance.android.livesdk.feed.live;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.utils.p158a.C3352h;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.C5924a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.C6085q;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.p231f.C5981a;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.utils.C7784a;
import com.bytedance.android.livesdk.feed.utils.C7786c.C7787a;
import com.bytedance.android.livesdk.feed.utils.C7786c.C7795c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.p354j.C7486b;

public abstract class CommonLiveViewHolder extends BaseLiveViewHolder {

    /* renamed from: j */
    TextView f17879j;

    /* renamed from: k */
    protected HSImageView f17880k;

    /* renamed from: l */
    HSImageView f17881l;

    /* renamed from: m */
    View f17882m;

    /* renamed from: n */
    TextView f17883n;

    /* renamed from: o */
    protected View f17884o;

    /* renamed from: p */
    protected TextView f17885p;

    /* renamed from: q */
    ImageView f17886q;

    /* renamed from: r */
    View f17887r;

    /* renamed from: s */
    TextView f17888s;

    /* renamed from: t */
    View f17889t;

    /* renamed from: u */
    String f17890u = C3358ac.m12515a((int) R.string.eko);

    /* renamed from: v */
    C6085q f17891v;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14703a(ImageModel imageModel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14705a(FeedItem feedItem);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo14709g();

    /* renamed from: f */
    public final void mo14708f() {
        String str;
        Room room = this.f17873i;
        if (room != null) {
            TextView textView = this.f17888s;
            if (room.getStatus() == 4) {
                str = C3358ac.m12515a((int) R.string.ekd);
            } else {
                str = C3358ac.m12515a((int) R.string.eks);
            }
            textView.setText(str);
            if (room.getStatus() == 4) {
                this.f17883n.setVisibility(4);
            } else {
                this.f17883n.setVisibility(0);
                this.f17883n.setText(C7784a.m23910a((long) room.getUserCount()));
            }
            this.f17889t.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C7581n mo14707b(FeedItem feedItem) {
        ((C7795c) ((C7795c) ((C7795c) ((C7795c) ((C7795c) ((C7795c) new C7795c(this.itemView.getContext()).mo20468a("Room ID", feedItem, "item/id", null)).mo20468a("User ID", feedItem, "item/owner/id", null)).mo20468a("Nickname", feedItem, "item/owner/nickname", null)).mo20468a("Stream URL", feedItem, "item/stream_url/rtmp_pull_url", null)).mo20467a((Object) feedItem)).mo20472b()).mo20478b(feedItem).mo20477a(new C6062m(feedItem)).mo20470a(this.itemView);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    protected static void m18874a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ C7581n m18873a(FeedItem feedItem, Object obj) {
        C7787a.m23918a(feedItem, obj);
        C7787a.m23918a(feedItem.item, C7787a.m23915a(obj, "item"));
        return C7581n.f20898a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14704a(ImageModel imageModel, final Room room) {
        final String str;
        final long[] jArr = new long[1];
        if (FeedLiveFragment.f17788A != null) {
            str = FeedLiveFragment.f17788A.f17758h;
        } else {
            str = "live_live";
        }
        this.f17891v = new C6085q();
        C3393m.m12613a(imageModel).mo10295b(true).mo10293a(false).mo10291a((int) C34943c.f91128x).mo10292a((C3405a) new C3405a() {
            /* renamed from: a */
            public final void mo10308a(ImageModel imageModel) {
                jArr[0] = SystemClock.currentThreadTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C5982b.m18722a("live_cover_show_start", (Map<String, String>) hashMap);
                CommonLiveViewHolder.this.f17891v.mo14742b();
            }

            /* renamed from: a */
            public final void mo10310a(ImageModel imageModel, Exception exc) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C5982b.m18722a("live_cover_show_finish", (Map<String, String>) hashMap);
                CommonLiveViewHolder.this.f17891v.mo14741a((Throwable) exc, imageModel.getUri());
            }

            /* renamed from: a */
            public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                String str;
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "1");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C5982b.m18722a("live_cover_show_finish", (Map<String, String>) hashMap);
                C6085q qVar = CommonLiveViewHolder.this.f17891v;
                if (imageModel == null) {
                    str = "";
                } else {
                    str = imageModel.getUri();
                }
                qVar.mo14743b(str);
            }
        }).mo10294a(this.f17880k);
        if (C5924a.f17548a) {
            C3352h.m12498a().mo10278a(imageModel.getUrls(), mo14709g());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14706a(FeedItem feedItem, Room room, View view) {
        mo14705a(feedItem);
        C5981a.m18718b().mo14636a(view, room);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14695a(FeedItem feedItem, Room room, int i) {
        ImageModel imageModel;
        m18874a(this.f17887r, 0);
        m18874a(this.f17884o, 8);
        this.f17886q.setVisibility(8);
        if (room.redEnvelopeNumber > 0) {
            this.f17882m.setVisibility(0);
        } else {
            this.f17882m.setVisibility(4);
        }
        User owner = room.getOwner();
        String str = null;
        if (!TextUtils.isEmpty(room.getTitle())) {
            this.f17879j.setText(C3390j.m12609a("#%s", room.getTitle()));
        } else if (owner != null) {
            this.f17879j.setText(owner.getNickName());
        } else {
            this.f17879j.setText(null);
        }
        if (!C5924a.f17550c) {
            imageModel = room.getCover();
        } else if (owner == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarMedium();
        }
        if (imageModel == null || C6311g.m19573a(imageModel.getUrls())) {
            this.f17880k.setImageResource(R.drawable.c19);
            mo14703a(imageModel);
        } else {
            mo14704a(imageModel, room);
        }
        ImageModel feedRoomLabel = room.getFeedRoomLabel();
        if (feedRoomLabel == null || C6311g.m19573a(feedRoomLabel.getUrls())) {
            this.f17881l.setVisibility(8);
        } else {
            this.f17881l.setVisibility(0);
            C3393m.m12622a(this.f17881l, feedRoomLabel, (C3405a) new C3405a() {
                /* renamed from: a */
                public final void mo10308a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo10310a(ImageModel imageModel, Exception exc) {
                }

                /* renamed from: a */
                public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                    LayoutParams layoutParams = CommonLiveViewHolder.this.f17881l.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    CommonLiveViewHolder.this.f17881l.setLayoutParams(layoutParams);
                }
            }, feedRoomLabel.isAnimated());
        }
        mo14708f();
        if (owner != null) {
            str = owner.getCity();
        }
        if (C6319n.m19593a(str)) {
            this.f17885p.setVisibility(8);
            m18874a(this.f17884o, 8);
        } else {
            this.f17885p.setText(str);
            this.f17885p.setVisibility(0);
        }
        this.itemView.setOnClickListener(new C6060k(this, feedItem, room));
        if (C7787a.m23919b()) {
            C7787a.m23916a(this.itemView, (C7561a<C7581n>) new C6061l<C7581n>(this, feedItem));
        }
        room.setLog_pb(feedItem.logPb);
        room.setRequestId(feedItem.resId);
    }

    public CommonLiveViewHolder(View view, C5972a aVar, C5980f fVar, FeedDataKey feedDataKey, C6037j jVar, C9418f fVar2, C7486b<FeedItem> bVar, C7486b<Boolean> bVar2, C7486b<Object> bVar3, C7486b<Object> bVar4) {
        super(view, aVar, fVar, feedDataKey, jVar, fVar2, bVar, bVar2, bVar3, bVar4);
        this.f17879j = (TextView) view.findViewById(R.id.title);
        this.f17880k = (HSImageView) view.findViewById(R.id.bo2);
        this.f17881l = (HSImageView) view.findViewById(R.id.bps);
        this.f17882m = view.findViewById(R.id.cqy);
        this.f17883n = (TextView) view.findViewById(R.id.hk);
        this.f17884o = view.findViewById(R.id.b_y);
        this.f17885p = (TextView) view.findViewById(R.id.buh);
        this.f17886q = (ImageView) view.findViewById(R.id.bq8);
        this.f17887r = view.findViewById(R.id.bq1);
        this.f17888s = (TextView) view.findViewById(R.id.bq0);
        this.f17889t = view.findViewById(R.id.bov);
    }
}
