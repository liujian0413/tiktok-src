package com.bytedance.android.livesdk.feed.live;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.live.C2350a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.p230e.C5975a;
import com.bytedance.android.livesdk.feed.p231f.C5982b;
import com.bytedance.android.livesdk.feed.tab.p364b.C7771n;
import com.bytedance.android.livesdk.feed.utils.C7785b;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.live.C9332f;
import com.bytedance.android.livesdkapi.depend.live.C9339m;
import com.bytedance.android.livesdkapi.depend.live.EntryType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.p534b.C10296b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

public abstract class BaseLiveViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    protected final C5972a f17866b;

    /* renamed from: c */
    protected final C5980f f17867c;

    /* renamed from: d */
    protected final FeedDataKey f17868d;

    /* renamed from: e */
    protected final boolean f17869e;

    /* renamed from: f */
    protected final C9418f f17870f;

    /* renamed from: g */
    protected C5989f f17871g;

    /* renamed from: h */
    protected boolean f17872h;

    /* renamed from: i */
    public Room f17873i;

    /* renamed from: j */
    private final C7486b<FeedItem> f17874j;

    /* renamed from: k */
    private final C7486b<Boolean> f17875k;

    /* renamed from: l */
    private final C7486b<Object> f17876l;

    /* renamed from: m */
    private final C7486b<Object> f17877m;

    /* renamed from: n */
    private C6037j f17878n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14695a(FeedItem feedItem, Room room, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14700a(View view) {
        boolean b = m18861b(this.f17873i);
        if (b) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14701a(FeedItem feedItem, boolean z, String str, Bundle bundle) {
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return false;
        }
        Room room = (Room) feedItem.item;
        if (!room.isPullUrlValid()) {
            return false;
        }
        room.setLog_pb(feedItem.logPb);
        room.setRequestId(feedItem.resId);
        Context context = this.itemView.getContext();
        if (!C6059j.m18950a(context)) {
            C3517a.m12960a(context, (int) R.string.ekm);
            return false;
        }
        m18855a(context, feedItem, true, str, bundle);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14699a(Throwable th) throws Exception {
        C7785b.m23913a(this.itemView.getContext(), th);
    }

    /* renamed from: c */
    public final void mo10320c() {
        super.mo10320c();
        m18858a(this.f17873i);
    }

    /* renamed from: e */
    public final void mo14702e() {
        if (this.f17869e) {
            C10296b a = C10296b.m30493a(this.itemView.getContext());
            long a2 = a.mo25020a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0);
            if (a2 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > a2 && currentTimeMillis - a2 <= 5500) {
                    a.mo25021a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) Long.valueOf(-1)).mo25023a();
                    mo14708f();
                }
            }
        }
    }

    /* renamed from: f */
    private void mo14708f() {
        int[] iArr = new int[2];
        this.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view = (View) this.itemView.getParent();
        if (view != null) {
            view.getLocationInWindow(iArr2);
            int max = Math.max(0, iArr2[1] - iArr[1]);
            int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
            int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.ok);
            View inflate = View.inflate(this.itemView.getContext(), R.layout.auz, null);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.gd);
            ((LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - (((float) dimensionPixelSize) / 2.0f)) - ((float) max));
            PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
            inflate.setOnClickListener(new C6053d(popupWindow));
            popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
            lottieAnimationView.getClass();
            popupWindow.setOnDismissListener(C6054e.m18948a(lottieAnimationView));
            lottieAnimationView.setAnimation("dislike_live_tips.json");
            lottieAnimationView.mo7082c(true);
            lottieAnimationView.mo7078b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14698a(Boolean bool) throws Exception {
        if (bool.booleanValue() && this.f10222a) {
            m18858a(this.f17873i);
        }
    }

    /* renamed from: a */
    private void m18858a(Room room) {
        long j;
        String str;
        String str2;
        if (room != null) {
            if (room.getOwner() == null) {
                j = 0;
            } else {
                j = room.getOwner().getId();
            }
            HashMap hashMap = new HashMap();
            if (FeedLiveFragment.f17788A != null) {
                TextUtils.isEmpty(FeedLiveFragment.f17788A.f17758h);
            }
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
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
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            hashMap.put("event_type", "core");
            hashMap.put("event_module", "live");
            hashMap.put("action_type", "click");
            if (this.f17872h) {
                hashMap.put("live_window_mode", "small_picture");
            }
            C5982b.m18723a((Map<String, String>) hashMap, this.itemView.getContext());
            C5982b.m18722a("live_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: b */
    private boolean m18861b(Room room) {
        if (room == null || room.getOwner() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view = (View) this.itemView.getParent();
        view.getLocationInWindow(iArr2);
        int a = C3358ac.m12510a(78.0f);
        int max = Math.max(0, iArr2[1] - iArr[1]);
        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
        float f = ((float) a) / 2.0f;
        if (((float) height) < (((float) this.itemView.getHeight()) / 2.0f) + f) {
            return false;
        }
        View inflate = View.inflate(this.itemView.getContext(), R.layout.av0, null);
        View findViewById = inflate.findViewById(R.id.a97);
        ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - f) - ((float) max));
        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
        inflate.setOnClickListener(new C6055f(popupWindow));
        findViewById.setOnClickListener(new C6056g(this, room, popupWindow));
        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14697a(Room room, C2350a aVar) throws Exception {
        this.f17867c.mo14612a(this.f17868d, String.valueOf(room.getId()));
        C3517a.m12960a(this.itemView.getContext(), (int) R.string.eka);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            this.itemView.setOnLongClickListener(null);
            this.f17873i = null;
            return;
        }
        this.f17873i = (Room) feedItem.item;
        if (this.f17869e) {
            this.itemView.setOnLongClickListener(new C6047a(this));
        } else {
            this.itemView.setOnLongClickListener(null);
        }
        mo14695a(feedItem, this.f17873i, i);
        if (this.f17875k != null) {
            mo10318a(this.f17875k.mo19280a((C7326g<? super T>) new C6051b<Object>(this), C6052c.f17938a));
        }
    }

    /* renamed from: a */
    private void m18859a(Room room, String str) {
        mo10318a(this.f17866b.mo14621a(room.getId(), room.getOwnerUserId(), room.getRequestId(), str, room.getLog_pb()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6057h<Object>(this, room), (C7326g<? super Throwable>) new C6058i<Object>(this)));
        String str2 = this.f17868d.f17733b;
        if (str2.contains("live") && FeedLiveFragment.f17788A != null) {
            this.f17871g = FeedLiveFragment.f17788A;
            str2 = FeedLiveFragment.f17788A.f17758h;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_merge");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("log_pb", room.getLog_pb());
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "core");
        hashMap.put("event_module", str2);
        C5982b.m18722a("live_dislike", (Map<String, String>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14696a(Room room, PopupWindow popupWindow, View view) {
        m18859a(room, this.f17868d.f17733b);
        C6059j.m18949a(popupWindow);
    }

    /* renamed from: a */
    private void m18855a(Context context, FeedItem feedItem, boolean z, String str, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (C9469i.m27992d() == null || C9469i.m27992d().mo22019e() == null) {
            C5982b.m18722a("livesdk_rd_plugin_init_failed", (Map<String, String>) new HashMap<String,String>());
            C3517a.m12960a(context, (int) R.string.ekc);
            return;
        }
        C9332f fVar = (C9332f) C3596c.m13172a(C9332f.class);
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        if (fVar != null) {
            if (!C9469i.m27992d().mo22019e().mo21795g() || !TextUtils.equals(C9469i.m27992d().mo22019e().mo21797i(), this.f17873i.buildPullUrl())) {
                fVar.recordEnterStart(EntryType.FEED);
            } else {
                fVar.recordEnterStart(EntryType.FEED_WITH_PREVIEW);
            }
        }
        if (z) {
            C5975a aVar = new C5975a(this.f17868d, this.f17867c);
            int b = aVar.mo14630b(this.f17873i.getId());
            this.f17870f.mo23117a(aVar);
            Bundle a = C9339m.m27770a(context, b, "live_cover", str, 1, this.f17869e, bundle);
            hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap.put("location", "before start activity");
            if (a.get("live.intent.extra.USER_ID") == null) {
                a.putString("live.intent.extra.USER_ID", String.valueOf(this.f17873i.getOwnerUserId()));
            }
            if (this.f17871g != null && this.f17871g.mo14647c()) {
                a.putString("double_stream_feed_url", this.f17868d.f17732a);
            }
            C5982b.m18722a("feed_enter_room", (Map<String, String>) hashMap);
            if (!(C9469i.m27993e() == null || C9469i.m27993e().mo14570j() == null)) {
                C5982b.m18721a(context, bundle2);
                C9469i.m27993e().mo14570j().mo23270a(context, this.f17873i.getId(), a);
            }
            if (this.f17869e) {
                C10296b a2 = C10296b.m30493a(context);
                if (a2.mo25020a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0) >= 0) {
                    a2.mo25021a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) Long.valueOf(System.currentTimeMillis())).mo25023a();
                }
            }
            hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap.put("location", "after sp");
            C5982b.m18722a("feed_enter_room", (Map<String, String>) hashMap);
        } else {
            Bundle a3 = C9339m.m27772a(context, this.f17873i, this.f17868d.f17733b, bundle2);
            if (!(C9469i.m27993e() == null || C9469i.m27993e().mo14570j() == null)) {
                a3.putAll(C9412a.m27916a(this.f17873i));
                if (a3.get("live.intent.extra.USER_ID") == null) {
                    a3.putString("live.intent.extra.USER_ID", String.valueOf(this.f17873i.getOwnerUserId()));
                }
                if (this.f17872h) {
                    a3.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
                    a3.putString("live.intent.extra.WINDOW_MODE", "small_picture");
                    List c = C7771n.m23888d().mo14693c();
                    if (!C6311g.m19573a(c) && c.get(0) != null) {
                        a3.putString("live.intent.extra.FEED_URL", ((C5989f) c.get(0)).f17754d);
                    }
                }
                C5982b.m18721a(context, bundle2);
                C9469i.m27993e().mo14570j().mo23270a(context, this.f17873i.getId(), a3);
            }
        }
        FeedItem feedItem2 = feedItem;
        this.f17874j.onNext(feedItem);
        ((C3450b) C3596c.m13172a(C3450b.class)).warmUp(this.f17873i, context);
    }

    public BaseLiveViewHolder(View view, C5972a aVar, C5980f fVar, FeedDataKey feedDataKey, C6037j jVar, C9418f fVar2, C7486b<FeedItem> bVar, C7486b<Boolean> bVar2, C7486b<Object> bVar3, C7486b<Object> bVar4) {
        boolean z;
        super(view);
        this.f17866b = aVar;
        this.f17867c = fVar;
        this.f17868d = feedDataKey;
        if (feedDataKey == null || jVar == null || !jVar.mo14692b(feedDataKey.f17734c)) {
            z = false;
        } else {
            z = true;
        }
        this.f17869e = z;
        this.f17870f = fVar2;
        this.f17874j = bVar;
        this.f17875k = bVar2;
        this.f17876l = bVar4;
        this.f17877m = bVar3;
        if (feedDataKey.f17733b.equals("live")) {
            this.f17871g = FeedLiveFragment.f17788A;
        } else {
            this.f17871g = jVar.mo14689a(feedDataKey.f17734c);
        }
        this.f17878n = jVar;
    }
}
