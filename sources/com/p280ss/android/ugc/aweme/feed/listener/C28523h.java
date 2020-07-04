package com.p280ss.android.ugc.aweme.feed.listener;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.p612c.C12105c;
import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.feed.listener.h */
public final class C28523h extends C12105c {

    /* renamed from: a */
    public WeakReference<VideoViewHolder> f75147a;

    /* renamed from: b */
    public Aweme f75148b;

    /* renamed from: c */
    public Video f75149c;

    /* renamed from: d */
    private long f75150d;

    /* renamed from: a */
    public final boolean mo72229a() {
        if (this.f75147a.get() == null || this.f75148b == null || this.f75149c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo29801a(Uri uri) {
        this.f75147a.clear();
        this.f75148b = null;
        this.f75149c = null;
    }

    public C28523h(VideoViewHolder videoViewHolder) {
        this.f75147a = new WeakReference<>(videoViewHolder);
        this.f75148b = videoViewHolder.mo65711h();
    }

    /* renamed from: a */
    public final void mo29802a(Uri uri, View view) {
        this.f75150d = System.currentTimeMillis();
        if (C6399b.m19944t()) {
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    if (C28523h.this.mo72229a()) {
                        return null;
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("image_request").setValue(C28523h.this.f75148b.getAid()).setLabelName("perf_monitor").setJsonObject(new C6909j().mo16966a("request_id", ((VideoViewHolder) C28523h.this.f75147a.get()).f74131k.optString("request_id")).mo16967a()));
                    return null;
                }
            }, (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: a */
    public final void mo29812a(Uri uri, View view, Throwable th) {
        if (!mo72229a() && C6399b.m19944t()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f75150d;
            final boolean Z = ((VideoViewHolder) this.f75147a.get()).mo71653Z();
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    int i;
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C28523h.this.f75148b.getAid()).setLabelName("perf_monitor");
                    C6909j a = new C6909j().mo16966a("request_id", ((VideoViewHolder) C28523h.this.f75147a.get()).f74131k.optString("request_id"));
                    String str = "is_success";
                    if (!Z) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    C6907h.onEvent(labelName.setJsonObject(a.mo16966a(str, String.valueOf(i)).mo16966a("duration", String.valueOf(currentTimeMillis)).mo16966a("internet_speed", String.valueOf((int) C14143b.m41756a().mo33902c())).mo16966a("is_cache", String.valueOf(C23323e.m76518a(Uri.parse((String) C28523h.this.f75149c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo16967a()));
                    return null;
                }
            }, (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: a */
    public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
        C6857a.m21312e().mo16827b("feed_cover_total", false);
        if (!mo72229a() && C6399b.m19944t()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f75150d;
            final boolean Z = ((VideoViewHolder) this.f75147a.get()).mo71653Z();
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    int i;
                    if (C28523h.this.mo72229a()) {
                        return null;
                    }
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C28523h.this.f75148b.getAid()).setLabelName("perf_monitor");
                    C6909j a = new C6909j().mo16966a("request_id", ((VideoViewHolder) C28523h.this.f75147a.get()).f74131k.optString("request_id"));
                    String str = "is_success";
                    if (!Z) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    C6907h.onEvent(labelName.setJsonObject(a.mo16966a(str, String.valueOf(i)).mo16966a("duration", String.valueOf(currentTimeMillis)).mo16966a("internet_speed", String.valueOf((int) C14143b.m41756a().mo33902c())).mo16966a("is_cache", String.valueOf(C23323e.m76518a(Uri.parse((String) C28523h.this.f75149c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo16967a()));
                    return null;
                }
            }, (Executor) C6907h.m21516a());
        }
    }
}
