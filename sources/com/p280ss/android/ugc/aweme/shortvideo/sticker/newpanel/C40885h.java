package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.LinkedList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.h */
public final class C40885h {

    /* renamed from: b */
    public static float f106327b = 0.04f;

    /* renamed from: c */
    public static final C40886a f106328c = new C40886a(null);

    /* renamed from: a */
    public boolean f106329a;

    /* renamed from: d */
    private boolean f106330d = true;

    /* renamed from: e */
    private float f106331e;

    /* renamed from: f */
    private final LinkedList<C40884g> f106332f = new LinkedList<>();

    /* renamed from: g */
    private final StickerSmoothScroller$mScroller$1 f106333g = new StickerSmoothScroller$mScroller$1(this);

    /* renamed from: h */
    private final Context f106334h;

    /* renamed from: i */
    private final RecyclerView f106335i;

    /* renamed from: j */
    private final int f106336j = 112;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.h$a */
    public static final class C40886a {
        private C40886a() {
        }

        /* renamed from: a */
        public static float m130657a() {
            if (C40885h.f106327b <= 0.0f) {
                C40885h.f106327b = 0.04f;
            }
            return C40885h.f106327b;
        }

        /* renamed from: a */
        public static void m130658a(float f) {
            C40885h.f106327b = f;
        }

        public /* synthetic */ C40886a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.h$b */
    static final class C40887b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40885h f106337a;

        C40887b(C40885h hVar) {
            this.f106337a = hVar;
        }

        public final void run() {
            this.f106337a.mo101158a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.h$c */
    static final class C40888c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40885h f106338a;

        C40888c(C40885h hVar) {
            this.f106338a = hVar;
        }

        public final void run() {
            this.f106338a.mo101158a();
        }
    }

    /* renamed from: b */
    private final void m130653b() {
        this.f106331e = C40886a.m130657a();
        f106327b = 0.04f;
    }

    /* renamed from: c */
    private final void m130654c() {
        if (this.f106331e > 0.0f) {
            f106327b = this.f106331e;
        }
    }

    /* renamed from: a */
    public final void mo101158a() {
        if (!this.f106332f.isEmpty()) {
            C40884g gVar = (C40884g) this.f106332f.poll();
            int i = gVar.f106325a;
            int i2 = gVar.f106326b;
            if (1 == i) {
                this.f106335i.mo5541b(i2);
                this.f106335i.post(new C40887b(this));
            } else if (i == 0) {
                this.f106335i.mo5561d(i2);
            } else {
                if (2 == i) {
                    float b = C9738o.m28708b(this.f106334h, 8.0f);
                    C1273i layoutManager = this.f106335i.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.mo5417a(i2, (int) b);
                    }
                    this.f106335i.post(new C40888c(this));
                }
            }
        } else {
            this.f106335i.mo5545b((C1281m) this.f106333g);
            this.f106329a = false;
            m130654c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int m130652b(int i) {
        return Math.min(C9738o.m28714c(this.f106334h, ((float) i) / 0.04f) / this.f106336j, 20);
    }

    /* renamed from: a */
    public final void mo101159a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C1273i layoutManager = this.f106335i.getLayoutManager();
        if (!(layoutManager instanceof StickerCenterLayoutManager)) {
            layoutManager = null;
        }
        StickerCenterLayoutManager stickerCenterLayoutManager = (StickerCenterLayoutManager) layoutManager;
        if (stickerCenterLayoutManager != null) {
            i2 = stickerCenterLayoutManager.mo5445j();
        } else {
            i2 = 0;
        }
        if (stickerCenterLayoutManager != null) {
            i3 = stickerCenterLayoutManager.mo5446k();
        } else {
            i3 = 0;
        }
        if (!this.f106329a && i >= 0 && i3 != i) {
            this.f106329a = true;
            if (!this.f106332f.isEmpty()) {
                this.f106332f.clear();
            }
            m130653b();
            int a = m130652b(C34943c.f91128x);
            if (Math.abs(i2 - i) <= a) {
                this.f106332f.offer(new C40884g(0, i));
                if (this.f106330d) {
                    this.f106332f.offer(new C40884g(2, i));
                }
                this.f106335i.mo5545b((C1281m) this.f106333g);
                this.f106335i.mo5528a((C1281m) this.f106333g);
                mo101158a();
                return;
            }
            if (i2 > i) {
                int i6 = a / 2;
                i4 = i2 - i6;
                i5 = i6 + i;
            } else {
                int i7 = a / 2;
                i4 = i2 + i7;
                i5 = i - i7;
            }
            C40884g gVar = new C40884g(0, i4);
            C40884g gVar2 = new C40884g(1, i5);
            C40884g gVar3 = new C40884g(0, i);
            this.f106332f.offer(gVar);
            this.f106332f.offer(gVar2);
            this.f106332f.offer(gVar3);
            if (this.f106330d) {
                this.f106332f.offer(new C40884g(2, i));
            }
            this.f106335i.mo5545b((C1281m) this.f106333g);
            this.f106335i.mo5528a((C1281m) this.f106333g);
            mo101158a();
        }
    }

    public C40885h(Context context, RecyclerView recyclerView, int i) {
        C7573i.m23587b(context, "mHost");
        C7573i.m23587b(recyclerView, "mScrollerList");
        this.f106334h = context;
        this.f106335i = recyclerView;
    }
}
