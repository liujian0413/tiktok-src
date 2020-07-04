package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.b */
public final class C39569b implements C39580k {

    /* renamed from: a */
    private boolean f102763a = true;

    /* renamed from: b */
    private boolean f102764b;

    /* renamed from: c */
    private int f102765c;

    /* renamed from: d */
    private int f102766d;

    /* renamed from: e */
    private int f102767e;

    /* renamed from: f */
    private int f102768f;

    /* renamed from: g */
    private int f102769g;

    /* renamed from: h */
    private final C39581l f102770h;

    /* renamed from: b */
    public final int mo98532b(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i == 48) {
                return 3;
            }
            if (i == 80) {
                return 0;
            }
        }
        return 1;
    }

    public final int bO_() {
        return this.f102768f;
    }

    public final int bP_() {
        return this.f102766d;
    }

    /* renamed from: c */
    public final int mo98536c() {
        return this.f102767e;
    }

    /* renamed from: d */
    public final int mo98538d() {
        return this.f102765c;
    }

    /* renamed from: g */
    public final int mo98544g() {
        return this.f102769g;
    }

    /* renamed from: e */
    public final boolean mo98541e() {
        return this.f102763a;
    }

    /* renamed from: f */
    public final boolean mo98543f() {
        return this.f102764b;
    }

    /* renamed from: b */
    public final void mo98533b(boolean z) {
        this.f102764b = z;
    }

    /* renamed from: e */
    public final void mo98540e(int i) {
        this.f102767e = i;
    }

    /* renamed from: f */
    public final void mo98542f(int i) {
        this.f102769g = i;
    }

    /* renamed from: d */
    public final void mo98539d(int i) {
        this.f102766d = i;
    }

    public C39569b(C39581l lVar) {
        C7573i.m23587b(lVar, "popupWindow");
        this.f102770h = lVar;
    }

    /* renamed from: a */
    public final void mo98530a(int i) {
        this.f102765c = i;
        C39579j o = this.f102770h.mo98560o();
        C7573i.m23582a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo98529b();
        if (b != null) {
            b.setBgColor(i);
        }
    }

    /* renamed from: c */
    public final void mo98537c(int i) {
        this.f102768f = i;
        C39579j o = this.f102770h.mo98560o();
        C7573i.m23582a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo98529b();
        if (b != null) {
            b.setBubbleOrientation(mo98532b(this.f102768f));
        }
    }

    /* renamed from: a */
    public final void mo98531a(boolean z) {
        this.f102763a = z;
        C39579j o = this.f102770h.mo98560o();
        C7573i.m23582a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo98529b();
        if (b != null) {
            b.setNeedPath(z);
        }
    }
}
