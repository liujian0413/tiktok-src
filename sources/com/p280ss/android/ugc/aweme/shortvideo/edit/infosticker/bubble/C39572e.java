package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40364b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c.C40367a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.e */
public final class C39572e implements C39582m {

    /* renamed from: a */
    public final C39581l f102779a;

    /* renamed from: b */
    private C40366c f102780b;

    /* renamed from: c */
    private boolean f102781c;

    /* renamed from: d */
    private long f102782d = 800;

    /* renamed from: e */
    private long f102783e = 200;

    /* renamed from: f */
    private long f102784f = 7000;

    /* renamed from: g */
    private boolean f102785g;

    /* renamed from: h */
    private Runnable f102786h = new C39574b(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.e$a */
    public static final class C39573a implements C40367a {

        /* renamed from: a */
        final /* synthetic */ C39572e f102787a;

        /* renamed from: a */
        public final void mo98567a() {
        }

        /* renamed from: b */
        public final void mo98568b() {
            this.f102787a.mo98566a();
        }

        C39573a(C39572e eVar) {
            this.f102787a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.e$b */
    static final class C39574b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39572e f102788a;

        C39574b(C39572e eVar) {
            this.f102788a = eVar;
        }

        public final void run() {
            C39572e eVar = this.f102788a;
            C39580k q = this.f102788a.f102779a.mo98562q();
            C7573i.m23582a((Object) q, "popupWindow.bubbleParams");
            eVar.mo98547a(false, q.bO_());
        }
    }

    /* renamed from: r */
    public final long mo98563r() {
        return this.f102784f;
    }

    /* renamed from: s */
    public final Runnable mo98564s() {
        return this.f102786h;
    }

    public final void dismiss() {
        this.f102779a.dismiss();
    }

    /* renamed from: a */
    public final void mo98566a() {
        C40366c cVar = this.f102780b;
        if (cVar != null) {
            cVar.mo100360a();
        }
    }

    /* renamed from: h */
    public final void mo98553h() {
        if (!this.f102781c) {
            C39580k q = this.f102779a.mo98562q();
            C7573i.m23582a((Object) q, "popupWindow.bubbleParams");
            mo98547a(false, q.bO_());
            this.f102779a.getContentView().removeCallbacks(this.f102786h);
            this.f102779a.mo98562q().mo98539d(0);
            this.f102779a.mo98562q().mo98540e(0);
        }
    }

    /* renamed from: i */
    public final void mo98554i() {
        if (!this.f102781c) {
            C39579j o = this.f102779a.mo98560o();
            C7573i.m23582a((Object) o, "popupWindow.bubbleLayout");
            FixBubbleLayout b = o.mo98529b();
            if (b != null) {
                b.setVisibility(8);
            }
            mo98566a();
            this.f102779a.getContentView().removeCallbacks(this.f102786h);
            this.f102779a.mo98562q().mo98539d(0);
            this.f102779a.mo98562q().mo98540e(0);
            this.f102779a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo98545a(long j) {
        this.f102782d = j;
    }

    /* renamed from: b */
    public final void mo98548b(long j) {
        this.f102784f = j;
    }

    /* renamed from: c */
    public final void mo98549c(boolean z) {
        this.f102785g = z;
    }

    /* renamed from: e */
    public final void mo98552e(boolean z) {
        this.f102781c = z;
    }

    /* renamed from: a */
    public final void mo98546a(C40366c cVar) {
        this.f102780b = cVar;
    }

    public C39572e(C39581l lVar) {
        C7573i.m23587b(lVar, "popupWindow");
        this.f102779a = lVar;
    }

    /* renamed from: a */
    public final void mo98547a(boolean z, int i) {
        if (!z) {
            this.f102781c = true;
        }
        if (this.f102780b == null) {
            C40364b bVar = new C40364b(this.f102785g, this.f102782d, this.f102783e, this.f102779a);
            this.f102780b = bVar;
        }
        if (z) {
            C40366c cVar = this.f102780b;
            if (cVar == null) {
                C7573i.m23580a();
            }
            C39579j o = this.f102779a.mo98560o();
            C7573i.m23582a((Object) o, "popupWindow.bubbleLayout");
            FixBubbleLayout b = o.mo98529b();
            C7573i.m23582a((Object) b, "popupWindow.bubbleLayout.bubbleView");
            cVar.mo100361a(b, i, null);
            return;
        }
        C40366c cVar2 = this.f102780b;
        if (cVar2 == null) {
            C7573i.m23580a();
        }
        C39579j o2 = this.f102779a.mo98560o();
        C7573i.m23582a((Object) o2, "popupWindow.bubbleLayout");
        FixBubbleLayout b2 = o2.mo98529b();
        C7573i.m23582a((Object) b2, "popupWindow.bubbleLayout.bubbleView");
        cVar2.mo100362b(b2, i, new C39573a(this));
    }
}
