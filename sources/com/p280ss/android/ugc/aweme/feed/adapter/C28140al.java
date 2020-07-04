package com.p280ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.al */
public final class C28140al implements C13401d<C13648f> {

    /* renamed from: a */
    public volatile long f74214a;

    /* renamed from: b */
    public volatile long f74215b;

    /* renamed from: c */
    public volatile int f74216c;

    /* renamed from: d */
    public volatile String f74217d;

    /* renamed from: e */
    private WeakReference<SmartImageView> f74218e;

    /* renamed from: f */
    private DataCenter f74219f;

    /* renamed from: g */
    private volatile long f74220g;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    /* renamed from: a */
    public final C28416d mo71743a() {
        if (this.f74215b == 0) {
            return null;
        }
        C28416d dVar = new C28416d(this.f74216c, this.f74215b, this.f74214a, this.f74217d);
        return dVar;
    }

    C28140al(WeakReference<SmartImageView> weakReference, DataCenter dataCenter) {
        this.f74218e = weakReference;
        this.f74219f = dataCenter;
        if (C7163a.m22363a()) {
            this.f74220g = SystemClock.elapsedRealtime();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
        C6857a.m21312e().mo16827b("feed_cover_total", false);
        if (C7163a.m22363a() && this.f74219f != null) {
            this.f74219f.mo60134a("poster_processor_end", (Object) "封面图片设置成功");
            if (fVar instanceof C13646d) {
                C13646d dVar = (C13646d) fVar;
                StringBuilder sb = new StringBuilder("封面图片设置成功:");
                sb.append(dVar.getHeight());
                sb.append("X");
                sb.append(dVar.getWidth());
                this.f74219f.mo60134a("poster_processor_end", (Object) sb.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f74220g;
            StringBuilder sb2 = new StringBuilder("totalTime:");
            sb2.append(elapsedRealtime);
            sb2.append(",SRTime:");
            sb2.append(this.f74214a);
            sb2.append(",");
            double d = (double) this.f74214a;
            double d2 = (double) elapsedRealtime;
            Double.isNaN(d);
            Double.isNaN(d2);
            sb2.append(C1642a.m8034a("%.2f", new Object[]{Double.valueOf(d / d2)}));
            this.f74219f.mo60134a("poster_processor_time", (Object) sb2.toString());
        }
        if (!C6399b.m19946v() && this.f74218e.get() != null) {
            C28170bo.m92472a((SimpleDraweeView) this.f74218e.get(), R.drawable.amw);
        }
    }
}
