package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31887b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31922w;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l */
public final class C31042l extends C31029h {

    /* renamed from: g */
    public View f81475g;

    /* renamed from: h */
    public View f81476h;

    /* renamed from: i */
    public View f81477i;

    /* renamed from: j */
    private View f81478j;

    /* renamed from: k */
    private RemoteImageView f81479k;

    /* renamed from: l */
    private RemoteImageView f81480l;

    /* renamed from: m */
    private RemoteImageView f81481m;

    /* renamed from: n */
    private Animation f81482n;

    /* renamed from: o */
    private final C31043a f81483o = new C31043a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l$a */
    public static final class C31043a implements C31922w {

        /* renamed from: a */
        final /* synthetic */ C31042l f81484a;

        /* renamed from: b */
        private int f81485b;

        /* renamed from: c */
        private int f81486c;

        /* renamed from: a */
        public final void mo81512a() {
            this.f81486c++;
            this.f81485b++;
            m101309c();
        }

        /* renamed from: b */
        public final void mo81513b() {
            this.f81486c++;
            m101309c();
        }

        /* renamed from: c */
        private final void m101309c() {
            if (this.f81486c == 3) {
                C31042l.m101300a(this.f81484a).setVisibility(8);
                C31887b.m103598a(C31042l.m101300a(this.f81484a));
                if (this.f81485b != this.f81486c) {
                    C31042l.m101301b(this.f81484a).setVisibility(8);
                    C31042l.m101302c(this.f81484a).setVisibility(0);
                } else {
                    C31042l.m101301b(this.f81484a).setVisibility(0);
                    C31042l.m101302c(this.f81484a).setVisibility(8);
                }
                this.f81486c = 0;
                this.f81485b = 0;
            }
        }

        C31043a(C31042l lVar) {
            this.f81484a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l$b */
    static final class C31044b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31042l f81487a;

        C31044b(C31042l lVar) {
            this.f81487a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81487a.mo81511g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l$c */
    static final class C31045c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31042l f81488a;

        C31045c(C31042l lVar) {
            this.f81488a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81488a.mo81490a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l$d */
    static final class C31046d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31042l f81489a;

        C31046d(C31042l lVar) {
            this.f81489a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81489a.mo81490a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.l$e */
    static final class C31047e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31042l f81490a;

        C31047e(C31042l lVar) {
            this.f81490a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81490a.mo81490a(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<Emoji> mo81496d() {
        List<Emoji> emoji = mo81494b().getEmoji();
        C7573i.m23582a((Object) emoji, "content.emoji");
        return emoji;
    }

    /* renamed from: g */
    public final void mo81511g() {
        View view = this.f81475g;
        if (view == null) {
            C7573i.m23583a("reloadLayout");
        }
        view.setVisibility(8);
        View view2 = this.f81476h;
        if (view2 == null) {
            C7573i.m23583a("loadingIv");
        }
        view2.setVisibility(0);
        View view3 = this.f81477i;
        if (view3 == null) {
            C7573i.m23583a("emojiLayout");
        }
        view3.setVisibility(0);
        View view4 = this.f81476h;
        if (view4 == null) {
            C7573i.m23583a("loadingIv");
        }
        Animation animation = this.f81482n;
        if (animation == null) {
            C7573i.m23583a("animation");
        }
        view4.startAnimation(animation);
        m101303h();
    }

    /* renamed from: h */
    private final void m101303h() {
        if (mo81496d().size() >= 3) {
            RemoteImageView remoteImageView = this.f81479k;
            if (remoteImageView == null) {
                C7573i.m23583a("emojiIvFirst");
            }
            C31892bd.m103613a(remoteImageView, ((Emoji) mo81496d().get(0)).getAnimateUrl(), (C31922w) this.f81483o);
            RemoteImageView remoteImageView2 = this.f81480l;
            if (remoteImageView2 == null) {
                C7573i.m23583a("emojiIvSecond");
            }
            C31892bd.m103613a(remoteImageView2, ((Emoji) mo81496d().get(1)).getAnimateUrl(), (C31922w) this.f81483o);
            RemoteImageView remoteImageView3 = this.f81481m;
            if (remoteImageView3 == null) {
                C7573i.m23583a("emojiIvThird");
            }
            C31892bd.m103613a(remoteImageView3, ((Emoji) mo81496d().get(2)).getAnimateUrl(), (C31922w) this.f81483o);
        }
    }

    /* renamed from: e */
    public final void mo81497e() {
        super.mo81497e();
        this.f81478j = mo81493b(R.id.bip);
        this.f81476h = mo81493b(R.id.btd);
        this.f81475g = mo81493b(R.id.b53);
        this.f81477i = mo81493b(R.id.b52);
        this.f81479k = (RemoteImageView) mo81493b(R.id.a1r);
        this.f81480l = (RemoteImageView) mo81493b(R.id.a1s);
        this.f81481m = (RemoteImageView) mo81493b(R.id.a1t);
        RotateAnimation a = C31887b.m103596a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, null);
        C7573i.m23582a((Object) a, "AnimationUtils.getRotateAnimation(400, null)");
        this.f81482n = a;
        View view = this.f81476h;
        if (view == null) {
            C7573i.m23583a("loadingIv");
        }
        Animation animation = this.f81482n;
        if (animation == null) {
            C7573i.m23583a("animation");
        }
        view.startAnimation(animation);
        View view2 = this.f81475g;
        if (view2 == null) {
            C7573i.m23583a("reloadLayout");
        }
        view2.setOnClickListener(new C31044b(this));
        RemoteImageView remoteImageView = this.f81479k;
        if (remoteImageView == null) {
            C7573i.m23583a("emojiIvFirst");
        }
        remoteImageView.setOnClickListener(new C31045c(this));
        RemoteImageView remoteImageView2 = this.f81480l;
        if (remoteImageView2 == null) {
            C7573i.m23583a("emojiIvSecond");
        }
        remoteImageView2.setOnClickListener(new C31046d(this));
        RemoteImageView remoteImageView3 = this.f81481m;
        if (remoteImageView3 == null) {
            C7573i.m23583a("emojiIvThird");
        }
        remoteImageView3.setOnClickListener(new C31047e(this));
    }

    public C31042l(SayHelloViewHolder sayHelloViewHolder) {
        C7573i.m23587b(sayHelloViewHolder, "parent");
        super(sayHelloViewHolder);
    }

    /* renamed from: a */
    public static final /* synthetic */ View m101300a(C31042l lVar) {
        View view = lVar.f81476h;
        if (view == null) {
            C7573i.m23583a("loadingIv");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m101301b(C31042l lVar) {
        View view = lVar.f81477i;
        if (view == null) {
            C7573i.m23583a("emojiLayout");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m101302c(C31042l lVar) {
        View view = lVar.f81475g;
        if (view == null) {
            C7573i.m23583a("reloadLayout");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo81492a(boolean z) {
        int i;
        View view = this.f81478j;
        if (view == null) {
            C7573i.m23583a("rootLayout");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo81491a(Message message, Message message2, SayHelloContent sayHelloContent, int i) {
        C7573i.m23587b(message, "msg");
        C7573i.m23587b(sayHelloContent, C38347c.f99553h);
        super.mo81491a(message, message2, sayHelloContent, i);
        mo81492a(true);
        m101303h();
    }
}
