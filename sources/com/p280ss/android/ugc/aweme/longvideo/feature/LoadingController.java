package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.LoadingController */
public final class LoadingController implements C0042h, C34976f {

    /* renamed from: a */
    public final FragmentActivity f85321a;

    /* renamed from: b */
    public final LineProgressBar f85322b;

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        LineProgressBar lineProgressBar = this.f85322b;
        if (lineProgressBar != null) {
            lineProgressBar.mo74363c();
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        LineProgressBar lineProgressBar = this.f85322b;
        if (lineProgressBar != null) {
            lineProgressBar.mo74362b();
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        LineProgressBar lineProgressBar = this.f85322b;
        if (lineProgressBar != null) {
            lineProgressBar.mo74361a();
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        LineProgressBar lineProgressBar = this.f85322b;
        if (lineProgressBar != null) {
            lineProgressBar.mo74362b();
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        LineProgressBar lineProgressBar = this.f85322b;
        if (lineProgressBar != null) {
            lineProgressBar.mo74362b();
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        if (z) {
            LineProgressBar lineProgressBar = this.f85322b;
            if (lineProgressBar != null) {
                lineProgressBar.mo74361a();
            }
        } else {
            LineProgressBar lineProgressBar2 = this.f85322b;
            if (lineProgressBar2 != null) {
                lineProgressBar2.mo74362b();
            }
        }
    }

    public LoadingController(FragmentActivity fragmentActivity, LineProgressBar lineProgressBar) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f85321a = fragmentActivity;
        this.f85322b = lineProgressBar;
        this.f85321a.getLifecycle().mo55a(this);
        LineProgressBar lineProgressBar2 = this.f85322b;
        if (lineProgressBar2 != null) {
            lineProgressBar2.mo74361a();
        }
    }
}
