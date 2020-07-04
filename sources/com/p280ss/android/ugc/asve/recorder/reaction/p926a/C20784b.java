package com.p280ss.android.ugc.asve.recorder.reaction.p926a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b */
public final class C20784b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56088a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20784b.class), "windowBoundaryView", "getWindowBoundaryView()Landroid/view/View;"))};

    /* renamed from: b */
    private final C7541d f56089b;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.b$a */
    static final class C20785a extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C20779a f56090a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f56091b;

        /* renamed from: c */
        final /* synthetic */ View f56092c;

        C20785a(C20779a aVar, ViewGroup viewGroup, View view) {
            this.f56090a = aVar;
            this.f56091b = viewGroup;
            this.f56092c = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            int[] c = this.f56090a.mo56159c();
            if (c == null) {
                return null;
            }
            View view = new View(this.f56091b.getContext());
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.topMargin = this.f56092c.getTop() + c[0];
            layoutParams.height = (this.f56092c.getHeight() - c[0]) - c[1];
            layoutParams.leftMargin = this.f56092c.getLeft() + c[2];
            layoutParams.width = (this.f56092c.getWidth() - c[2]) - c[3];
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
            layoutParams.gravity = 0;
            view.setBackgroundResource(this.f56090a.mo56154a().mo38981g());
            this.f56091b.addView(view, layoutParams);
            return view;
        }
    }

    /* renamed from: c */
    private final View m69370c() {
        return (View) this.f56089b.getValue();
    }

    /* renamed from: a */
    public final void mo56175a() {
        View c = m69370c();
        if (c != null) {
            c.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo56176b() {
        View c = m69370c();
        if (c != null) {
            c.setVisibility(8);
        }
    }

    public C20784b(ViewGroup viewGroup, View view, C20779a aVar) {
        C7573i.m23587b(viewGroup, "rootView");
        C7573i.m23587b(view, "presentView");
        C7573i.m23587b(aVar, "reactionCtrl");
        this.f56089b = C7546e.m23569a(new C20785a(aVar, viewGroup, view));
    }
}
