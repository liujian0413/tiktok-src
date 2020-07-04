package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
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
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder */
public final class JediLiveVideoViewHolder extends JediBaseViewHolder<JediLiveVideoViewHolder, Object> implements C0053p<Boolean> {

    /* renamed from: g */
    public final TextView f94099g;

    /* renamed from: j */
    public final RemoteImageView f94100j;

    /* renamed from: k */
    public final FrameLayout f94101k;

    /* renamed from: l */
    public final TextView f94102l;

    /* renamed from: m */
    public final TextView f94103m;

    /* renamed from: n */
    public RoomStruct f94104n;

    /* renamed from: o */
    public final C35743b f94105o;

    /* renamed from: p */
    public final FragmentActivity f94106p;

    /* renamed from: q */
    private final C35745a f94107q = C36074j.f94315a.mainAnimViewModel(this.f94106p);

    /* renamed from: r */
    private boolean f94108r;

    /* renamed from: s */
    private C7326g<C32517b> f94109s;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$a */
    static final class C35941a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JediLiveVideoViewHolder f94111a;

        C35941a(JediLiveVideoViewHolder jediLiveVideoViewHolder) {
            this.f94111a = jediLiveVideoViewHolder;
        }

        public final void run() {
            this.f94111a.f94099g.setVisibility(0);
            this.f94111a.f94101k.setVisibility(0);
            this.f94111a.f94102l.setVisibility(0);
            this.f94111a.f94100j.setVisibility(8);
            this.f94111a.f94103m.setVisibility(8);
            this.f94111a.f94100j.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C35941a f94112a;

                {
                    this.f94112a = r1;
                }

                public final void run() {
                    this.f94112a.f94111a.mo90888a(true);
                }
            }, 1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$b */
    public static final class C35943b implements C35742a {

        /* renamed from: a */
        final /* synthetic */ JediLiveVideoViewHolder f94113a;

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$b$a */
        static final class C35944a extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35944a f94114a = new C35944a();

            C35944a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115878a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115878a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$b$b */
        static final class C35945b extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35945b f94115a = new C35945b();

            C35945b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115879a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115879a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(8);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$b$c */
        static final class C35946c extends Lambda implements C7562b<View, C7581n> {

            /* renamed from: a */
            public static final C35946c f94116a = new C35946c();

            C35946c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m115880a((View) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m115880a(View view) {
                C7573i.m23587b(view, "$receiver");
                view.setVisibility(8);
            }
        }

        C35943b(JediLiveVideoViewHolder jediLiveVideoViewHolder) {
            this.f94113a = jediLiveVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo90547a(PlayerMessage playerMessage, Object obj) {
            C7573i.m23587b(playerMessage, "message");
            switch (C35991s.f94172a[playerMessage.ordinal()]) {
                case 1:
                    JediLiveVideoViewHolder.m115873a(new View[]{this.f94113a.f94099g, this.f94113a.f94101k, this.f94113a.f94102l}, C35944a.f94114a);
                    JediLiveVideoViewHolder.m115873a(new View[]{this.f94113a.f94100j, this.f94113a.f94103m}, C35945b.f94115a);
                    return;
                case 2:
                    JediLiveVideoViewHolder.m115873a(new View[]{this.f94113a.f94099g, this.f94113a.f94101k, this.f94113a.f94102l, this.f94113a.f94103m}, C35946c.f94116a);
                    this.f94113a.f94100j.setVisibility(0);
                    RoomStruct roomStruct = this.f94113a.f94104n;
                    if (roomStruct != null) {
                        UrlModel urlModel = roomStruct.roomCover;
                        if (urlModel != null) {
                            C23323e.m76506a(this.f94113a.f94100j, urlModel, this.f94113a.f94100j.getWidth(), this.f94113a.f94100j.getHeight());
                            break;
                        }
                    }
                    return;
                case 3:
                    this.f94113a.mo62390p();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$c */
    static final class C35947c extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35947c f94117a = new C35947c();

        C35947c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115881a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115881a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$d */
    static final class C35948d extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35948d f94118a = new C35948d();

        C35948d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115882a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115882a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$e */
    public static final class C35949e implements C7326g<C32517b> {

        /* renamed from: a */
        final /* synthetic */ JediLiveVideoViewHolder f94119a;

        /* renamed from: b */
        final /* synthetic */ RoomStruct f94120b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C32517b bVar) {
            C7573i.m23587b(bVar, "liveState");
            CharSequence valueOf = String.valueOf(bVar.f84785a);
            User user = this.f94120b.owner;
            C7573i.m23582a((Object) user, "room.owner");
            if (TextUtils.equals(valueOf, user.getUid())) {
                this.f94120b.f75166id = bVar.f84786b;
                this.f94120b.owner.roomId = this.f94120b.f75166id;
                this.f94119a.f94105o.mo90599a();
                this.f94119a.mo62390p();
            }
        }

        C35949e(JediLiveVideoViewHolder jediLiveVideoViewHolder, RoomStruct roomStruct) {
            this.f94119a = jediLiveVideoViewHolder;
            this.f94120b = roomStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$f */
    static final class C35950f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlModel f94121a;

        /* renamed from: b */
        final /* synthetic */ JediLiveVideoViewHolder f94122b;

        C35950f(UrlModel urlModel, JediLiveVideoViewHolder jediLiveVideoViewHolder) {
            this.f94121a = urlModel;
            this.f94122b = jediLiveVideoViewHolder;
        }

        public final void run() {
            C23323e.m76507a(this.f94122b.f94100j, this.f94121a, this.f94122b.f94100j.getWidth(), this.f94122b.f94100j.getHeight(), (C13842b) new C9092w(5, (((float) this.f94121a.getWidth()) * 1.0f) / ((float) this.f94122b.f94100j.getWidth()), null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$g */
    static final class C35951g extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35951g f94123a = new C35951g();

        C35951g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115884a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115884a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediLiveVideoViewHolder$h */
    static final class C35952h extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C35952h f94124a = new C35952h();

        C35952h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115885a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115885a(View view) {
            C7573i.m23587b(view, "$receiver");
            view.setVisibility(0);
        }
    }

    public final void bA_() {
        super.bA_();
        Object o = mo29309o();
        if (o != null) {
            m115871a((RoomStruct) o);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.follow.presenter.RoomStruct");
    }

    /* renamed from: p */
    public final void mo62390p() {
        m115873a(new View[]{this.f94099g, this.f94101k, this.f94102l}, C35951g.f94123a);
        m115873a(new View[]{this.f94100j, this.f94103m}, C35952h.f94124a);
        RoomStruct roomStruct = this.f94104n;
        if (roomStruct != null) {
            UrlModel urlModel = roomStruct.roomCover;
            if (urlModel != null) {
                this.f94100j.post(new C35950f(urlModel, this));
            }
        }
    }

    /* renamed from: a */
    public final void mo90888a(boolean z) {
        this.f94105o.mo90600a(true);
    }

    /* renamed from: a */
    private void m115871a(RoomStruct roomStruct) {
        C7573i.m23587b(roomStruct, "room");
        RoomStruct roomStruct2 = this.f94104n;
        if (roomStruct2 == null || roomStruct2.f75166id != roomStruct.f75166id) {
            m115874b(roomStruct);
        }
        this.f94104n = roomStruct;
        if (this.f94108r) {
            this.f94105o.mo90601a(true, roomStruct, this.f94101k);
        }
        this.f94102l.setText(String.valueOf(roomStruct.user_count));
        this.f94107q.mo90602a().observe(this.f94106p, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        RoomStruct roomStruct = this.f94104n;
        if (roomStruct != null) {
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                this.f94105o.mo90601a(true, roomStruct, this.f94101k);
            } else {
                this.f94105o.mo90599a();
                m115873a(new View[]{this.f94099g, this.f94102l}, C35947c.f94117a);
                m115873a(new View[]{this.f94100j}, C35948d.f94118a);
            }
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                m115874b(roomStruct);
            }
            this.f94108r = C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true));
            if (this.f94108r) {
                C7326g<C32517b> gVar = this.f94109s;
                if (gVar == null) {
                    gVar = new C35949e<>(this, roomStruct);
                }
                this.f94109s = gVar;
            }
        }
    }

    /* renamed from: b */
    private static void m115874b(RoomStruct roomStruct) {
        User user = roomStruct.owner;
        C7573i.m23582a((Object) user, "room.owner");
        C6907h.m21524a("livesdk_live_show", (Map) C22984d.m75611a().mo59973a("scene_id", "1009").mo59973a("enter_from_merge", "others_homepage").mo59973a("action_type", "click").mo59973a("anchor_id", user.getUid()).mo59971a("room_id", roomStruct.f75166id).mo59973a("request_id", roomStruct.getRequestId()).mo59973a("enter_method", "live_cover").f60753a);
    }

    /* renamed from: a */
    public static void m115873a(View[] viewArr, C7562b<? super View, C7581n> bVar) {
        for (View invoke : viewArr) {
            bVar.invoke(invoke);
        }
    }

    public JediLiveVideoViewHolder(ViewGroup viewGroup, FragmentActivity fragmentActivity) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(fragmentActivity, "activity");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a11, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…file_live, parent, false)");
        super(inflate);
        this.f94106p = fragmentActivity;
        View findViewById = this.itemView.findViewById(R.id.e3t);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_top)");
        this.f94099g = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.cts);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.riv_cover)");
        this.f94100j = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.aml);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.fl_live_container)");
        this.f94101k = (FrameLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.e4r);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_watch_people_count)");
        this.f94102l = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.al6);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.finished_status)");
        this.f94103m = (TextView) findViewById5;
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ JediLiveVideoViewHolder f94110a;

            {
                this.f94110a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                RoomStruct roomStruct = this.f94110a.f94104n;
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
        this.f94105o = C36074j.f94315a.newLivePlayHelper(new C35941a(this), new C35943b(this));
    }
}
