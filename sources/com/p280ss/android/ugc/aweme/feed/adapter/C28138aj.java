package com.p280ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.p612c.C12105c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aj */
public final class C28138aj extends C12105c {

    /* renamed from: a */
    private WeakReference<RemoteImageView> f74210a;

    /* renamed from: a */
    public final void mo29812a(Uri uri, View view, Throwable th) {
    }

    C28138aj(WeakReference<RemoteImageView> weakReference) {
        this.f74210a = weakReference;
    }

    /* renamed from: a */
    public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
        C6857a.m21312e().mo16827b("feed_cover_total", false);
        if (!C6399b.m19946v() && this.f74210a.get() != null) {
            C28170bo.m92472a((SimpleDraweeView) this.f74210a.get(), R.drawable.amw);
        }
    }
}
