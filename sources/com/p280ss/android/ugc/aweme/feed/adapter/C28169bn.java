package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.video.C43310q;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bn */
public final class C28169bn {

    /* renamed from: d */
    private static boolean f74269d;

    /* renamed from: a */
    KeepSurfaceTextureView f74270a;

    /* renamed from: b */
    SurfaceView f74271b;

    /* renamed from: c */
    public boolean f74272c;

    /* renamed from: d */
    private static boolean m92467d() {
        return C43310q.m137426d();
    }

    /* renamed from: a */
    public final View mo71767a() {
        if (this.f74270a != null) {
            return this.f74270a;
        }
        if (this.f74271b != null) {
            return this.f74271b;
        }
        return null;
    }

    /* renamed from: b */
    public final Surface mo71768b() {
        if (this.f74270a != null) {
            return this.f74270a.getSurface();
        }
        if (this.f74271b != null) {
            return this.f74271b.getHolder().getSurface();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo71769c() {
        if (this.f74270a != null) {
            return this.f74270a.f115577m;
        }
        if (this.f74271b != null) {
            return this.f74272c;
        }
        return false;
    }

    /* renamed from: a */
    public static C28169bn m92466a(FrameLayout frameLayout) {
        View view;
        f74269d = m92467d();
        C28169bn bnVar = new C28169bn();
        if (f74269d) {
            bnVar.f74271b = new SurfaceView(frameLayout.getContext());
            view = bnVar.f74271b;
        } else {
            bnVar.f74270a = new KeepSurfaceTextureView(frameLayout.getContext());
            view = bnVar.f74270a;
        }
        frameLayout.addView(view, 0, new LayoutParams(-1, -1, 17));
        return bnVar;
    }
}
