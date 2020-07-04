package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39711d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c.C39712a.C39715a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C39761a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.g */
public final class C39750g {

    /* renamed from: a */
    public C39761a f103322a;

    /* renamed from: b */
    public C39711d f103323b;

    /* renamed from: c */
    private final C39712a f103324c = new C39712a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.g$a */
    static final class C39751a implements C39715a {

        /* renamed from: a */
        final /* synthetic */ C39750g f103325a;

        C39751a(C39750g gVar) {
            this.f103325a = gVar;
        }

        /* renamed from: a */
        public final void mo99079a(String str, Bitmap bitmap) {
            View k = C39750g.m127200a(this.f103325a).mo99208k();
            if (k != null) {
                ((RemoteImageView) k).setImageBitmap(bitmap);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.RemoteImageView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.g$b */
    public static final class C39752b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39750g f103326a;

        C39752b(C39750g gVar) {
            this.f103326a = gVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            C39750g.m127200a(this.f103326a).mo99204g();
            C39750g.m127204b(this.f103326a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.g$c */
    public static final class C39753c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39750g f103327a;

        /* renamed from: b */
        final /* synthetic */ boolean f103328b;

        /* renamed from: c */
        final /* synthetic */ boolean f103329c;

        public final void onAnimationEnd(Animator animator) {
            if (animator != null) {
                super.onAnimationEnd(animator);
            }
            C39750g.m127204b(this.f103327a).mo99093a(this.f103328b, this.f103329c);
            C39750g.m127200a(this.f103327a).mo99205h();
            C39750g.m127204b(this.f103327a).mo99094b();
        }

        C39753c(C39750g gVar, boolean z, boolean z2) {
            this.f103327a = gVar;
            this.f103328b = z;
            this.f103329c = z2;
        }
    }

    /* renamed from: a */
    private final void m127201a() {
        C39761a aVar = this.f103322a;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99206i();
    }

    /* renamed from: a */
    public static final /* synthetic */ C39761a m127200a(C39750g gVar) {
        C39761a aVar = gVar.f103322a;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C39711d m127204b(C39750g gVar) {
        C39711d dVar = gVar.f103323b;
        if (dVar == null) {
            C7573i.m23583a("statusChangeListener");
        }
        return dVar;
    }

    /* renamed from: a */
    private final void m127203a(VideoSegment videoSegment) {
        if (videoSegment != null) {
            C39761a aVar = this.f103322a;
            if (aVar == null) {
                C7573i.m23583a("viewManager");
            }
            aVar.mo99207j();
            C39761a aVar2 = this.f103322a;
            if (aVar2 == null) {
                C7573i.m23583a("viewManager");
            }
            View k = aVar2.mo99208k();
            if (k != null) {
                ((RemoteImageView) k).setScaleType(ScaleType.CENTER_CROP);
                this.f103324c.mo99095a(videoSegment.mo96896a(false), new C39751a(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.RemoteImageView");
        }
    }

    /* renamed from: a */
    public final void mo99145a(C39711d dVar) {
        C7573i.m23587b(dVar, "listener");
        this.f103323b = dVar;
    }

    /* renamed from: a */
    public final void mo99146a(C39761a aVar) {
        C7573i.m23587b(aVar, "viewManager");
        this.f103322a = aVar;
    }

    /* renamed from: a */
    private final void m127202a(FragmentActivity fragmentActivity, int i) {
        C39761a aVar = this.f103322a;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99184a(fragmentActivity, i, new C39752b(this));
    }

    /* renamed from: b */
    public final void mo99147b(FragmentActivity fragmentActivity, VideoSegment videoSegment, int i) {
        m127203a(videoSegment);
        C39761a aVar = this.f103322a;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99204g();
        if (this.f103323b == null) {
            C7573i.m23583a("statusChangeListener");
        }
    }

    /* renamed from: a */
    public final void mo99144a(FragmentActivity fragmentActivity, VideoSegment videoSegment, int i) {
        m127203a(videoSegment);
        m127202a(fragmentActivity, i);
        C39711d dVar = this.f103323b;
        if (dVar == null) {
            C7573i.m23583a("statusChangeListener");
        }
        dVar.mo99092a();
    }

    /* renamed from: a */
    public final void mo99143a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2) {
        m127201a();
        m127205b(fragmentActivity, i, z, z2);
    }

    /* renamed from: b */
    private final void m127205b(FragmentActivity fragmentActivity, int i, boolean z, boolean z2) {
        C39761a aVar = this.f103322a;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99185a(fragmentActivity, i, z, z2, new C39753c(this, z, z2));
    }
}
