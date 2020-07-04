package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.MediaPreviewLifecycleObserver */
public final class MediaPreviewLifecycleObserver implements C0042h {

    /* renamed from: a */
    private final C23084b<Event> f82366a;

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        this.f82366a.setValue(Event.ON_CREATE);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f82366a.setValue(Event.ON_DESTROY);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        this.f82366a.setValue(Event.ON_PAUSE);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f82366a.setValue(Event.ON_RESUME);
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onStart() {
        this.f82366a.setValue(Event.ON_START);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        this.f82366a.setValue(Event.ON_STOP);
    }

    public MediaPreviewLifecycleObserver(C23084b<Event> bVar) {
        C7573i.m23587b(bVar, "liveData");
        this.f82366a = bVar;
    }
}
