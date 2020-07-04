package com.p280ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35742a;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35743b;
import com.p280ss.android.ugc.aweme.profile.p1484e.C35745a;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder */
public final class LiveViewHolder extends C1293v implements C0053p<Boolean> {

    /* renamed from: i */
    public static final C35677a f93575i = new C35677a(null);

    /* renamed from: a */
    public final TextView f93576a;

    /* renamed from: b */
    public final RemoteImageView f93577b;

    /* renamed from: c */
    public final FrameLayout f93578c;

    /* renamed from: d */
    public final TextView f93579d;

    /* renamed from: e */
    public final TextView f93580e;

    /* renamed from: f */
    public RoomStruct f93581f;

    /* renamed from: g */
    public final C35743b f93582g;

    /* renamed from: h */
    public final FragmentActivity f93583h;

    /* renamed from: j */
    private final C35745a f93584j = C36074j.f94315a.mainAnimViewModel(this.f93583h);

    /* renamed from: k */
    private boolean f93585k;

    /* renamed from: l */
    private C7326g<C32517b> f93586l;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$a */
    public static final class C35677a {
        private C35677a() {
        }

        public /* synthetic */ C35677a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$b */
    static final class C35678b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveViewHolder f93588a;

        C35678b(LiveViewHolder liveViewHolder) {
            this.f93588a = liveViewHolder;
        }

        public final void run() {
            this.f93588a.f93576a.setVisibility(0);
            this.f93588a.f93578c.setVisibility(0);
            this.f93588a.f93579d.setVisibility(0);
            this.f93588a.f93577b.setVisibility(8);
            this.f93588a.f93580e.setVisibility(8);
            this.f93588a.f93577b.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C35678b f93589a;

                {
                    this.f93589a = r1;
                }

                public final void run() {
                    this.f93589a.f93588a.mo90541a(true);
                }
            }, 1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$c */
    public static final class C35680c implements C35742a {

        /* renamed from: a */
        final /* synthetic */ LiveViewHolder f93590a;

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$c$a */
        static final class C35681a extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35681a f93591a = new C35681a();

            C35681a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115361a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115361a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$c$b */
        static final class C35682b extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35682b f93592a = new C35682b();

            C35682b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115362a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115362a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(8);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$c$c */
        static final class C35683c extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35683c f93593a = new C35683c();

            C35683c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115363a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115363a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(8);
            }
        }

        C35680c(LiveViewHolder liveViewHolder) {
            this.f93590a = liveViewHolder;
        }

        /* renamed from: a */
        public final void mo90547a(PlayerMessage playerMessage, Object obj) {
            C7573i.m23587b(playerMessage, "message");
            switch (C35715h.f93666a[playerMessage.ordinal()]) {
                case 1:
                    LiveViewHolder.m115353a(new View[]{this.f93590a.f93576a, this.f93590a.f93578c, this.f93590a.f93579d}, C35681a.f93591a);
                    LiveViewHolder.m115353a(new View[]{this.f93590a.f93577b, this.f93590a.f93580e}, C35682b.f93592a);
                    return;
                case 2:
                    LiveViewHolder.m115353a(new View[]{this.f93590a.f93576a, this.f93590a.f93578c, this.f93590a.f93579d, this.f93590a.f93580e}, C35683c.f93593a);
                    this.f93590a.f93577b.setVisibility(0);
                    RoomStruct roomStruct = this.f93590a.f93581f;
                    if (roomStruct != null) {
                        UrlModel urlModel = roomStruct.roomCover;
                        if (urlModel != null) {
                            C23323e.m76506a(this.f93590a.f93577b, urlModel, this.f93590a.f93577b.getWidth(), this.f93590a.f93577b.getHeight());
                            break;
                        }
                    }
                    return;
                case 3:
                    this.f93590a.mo90543c();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$d */
    static final class C35684d extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35684d f93594a = new C35684d();

        C35684d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115364a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115364a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$e */
    static final class C35685e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35685e f93595a = new C35685e();

        C35685e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115365a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115365a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$f */
    public static final class C35686f implements C7326g<C32517b> {

        /* renamed from: a */
        final /* synthetic */ LiveViewHolder f93596a;

        /* renamed from: b */
        final /* synthetic */ RoomStruct f93597b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C32517b bVar) {
            C7573i.m23587b(bVar, "liveState");
            CharSequence valueOf = String.valueOf(bVar.f84785a);
            User user = this.f93597b.owner;
            C7573i.m23582a((Object) user, "room.owner");
            if (TextUtils.equals(valueOf, user.getUid())) {
                this.f93597b.f75166id = bVar.f84786b;
                this.f93597b.owner.roomId = this.f93597b.f75166id;
                this.f93596a.f93582g.mo90599a();
                this.f93596a.mo90543c();
            }
        }

        C35686f(LiveViewHolder liveViewHolder, RoomStruct roomStruct) {
            this.f93596a = liveViewHolder;
            this.f93597b = roomStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$g */
    static final class C35687g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlModel f93598a;

        /* renamed from: b */
        final /* synthetic */ LiveViewHolder f93599b;

        C35687g(UrlModel urlModel, LiveViewHolder liveViewHolder) {
            this.f93598a = urlModel;
            this.f93599b = liveViewHolder;
        }

        public final void run() {
            C23323e.m76507a(this.f93599b.f93577b, this.f93598a, this.f93599b.f93577b.getWidth(), this.f93599b.f93577b.getHeight(), C36074j.f94315a.newLiveBlurProcessor(5, (((float) this.f93598a.getWidth()) * 1.0f) / ((float) this.f93599b.f93577b.getWidth()), null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$h */
    static final class C35688h extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35688h f93600a = new C35688h();

        C35688h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115367a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115367a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.LiveViewHolder$i */
    static final class C35689i extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35689i f93601a = new C35689i();

        C35689i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115368a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115368a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo90542b() {
        this.f93584j.mo90602a().removeObserver(this);
    }

    /* renamed from: a */
    public final void mo90539a() {
        this.f93584j.mo90602a().observe(this.f93583h, this);
    }

    /* renamed from: c */
    public final void mo90543c() {
        m115353a(new View[]{this.f93576a, this.f93578c, this.f93579d}, C35688h.f93600a);
        m115353a(new View[]{this.f93577b, this.f93580e}, C35689i.f93601a);
        RoomStruct roomStruct = this.f93581f;
        if (roomStruct != null) {
            UrlModel urlModel = roomStruct.roomCover;
            if (urlModel != null) {
                this.f93577b.post(new C35687g(urlModel, this));
            }
        }
    }

    /* renamed from: a */
    public final void mo90541a(boolean z) {
        this.f93582g.mo90600a(true);
    }

    /* renamed from: a */
    public final void mo90540a(RoomStruct roomStruct) {
        C7573i.m23587b(roomStruct, "room");
        RoomStruct roomStruct2 = this.f93581f;
        if (roomStruct2 == null || roomStruct2.f75166id != roomStruct.f75166id) {
            m115354b(roomStruct);
        }
        this.f93581f = roomStruct;
        if (this.f93585k) {
            this.f93582g.mo90601a(true, roomStruct, this.f93578c);
        }
        this.f93579d.setText(String.valueOf(roomStruct.user_count));
        this.f93584j.mo90602a().observe(this.f93583h, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        RoomStruct roomStruct = this.f93581f;
        if (roomStruct != null) {
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                this.f93582g.mo90601a(true, roomStruct, this.f93578c);
            } else {
                this.f93582g.mo90599a();
                m115353a(new View[]{this.f93576a, this.f93579d}, C35684d.f93594a);
                m115353a(new View[]{this.f93577b}, C35685e.f93595a);
            }
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                m115354b(roomStruct);
            }
            this.f93585k = C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true));
            if (this.f93585k) {
                C7326g<C32517b> gVar = this.f93586l;
                if (gVar == null) {
                    gVar = new C35686f<>(this, roomStruct);
                }
                this.f93586l = gVar;
            }
        }
    }

    /* renamed from: b */
    private static void m115354b(RoomStruct roomStruct) {
        User user = roomStruct.owner;
        C7573i.m23582a((Object) user, "room.owner");
        C6907h.m21524a("livesdk_live_show", (Map) C22984d.m75611a().mo59973a("scene_id", "1009").mo59973a("enter_from_merge", "others_homepage").mo59973a("action_type", "click").mo59973a("anchor_id", user.getUid()).mo59971a("room_id", roomStruct.f75166id).mo59973a("request_id", roomStruct.getRequestId()).mo59973a("enter_method", "live_cover").f60753a);
    }

    /* renamed from: a */
    public static void m115353a(View[] viewArr, C7562b<? super View, C7581n> bVar) {
        for (View invoke : viewArr) {
            bVar.invoke(invoke);
        }
    }

    public LiveViewHolder(View view, FragmentActivity fragmentActivity) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(fragmentActivity, "activity");
        super(view);
        this.f93583h = fragmentActivity;
        View findViewById = view.findViewById(R.id.e3t);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_top)");
        this.f93576a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cts);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.riv_cover)");
        this.f93577b = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.aml);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.fl_live_container)");
        this.f93578c = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.e4r);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_watch_people_count)");
        this.f93579d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.al6);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.finished_status)");
        this.f93580e = (TextView) findViewById5;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ LiveViewHolder f93587a;

            {
                this.f93587a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                RoomStruct roomStruct = this.f93587a.f93581f;
                if (roomStruct != null) {
                    C36074j jVar = C36074j.f94315a;
                    C7573i.m23582a((Object) view, "v");
                    Context context = view.getContext();
                    C7573i.m23582a((Object) context, "v.context");
                    User user = roomStruct.owner;
                    C7573i.m23582a((Object) user, "it.owner");
                    jVar.watchLiveMob(context, user, "others_homepage", "live_cover");
                }
            }
        });
        this.f93582g = C36074j.f94315a.newLivePlayHelper(new C35678b(this), new C35680c(this));
    }
}
