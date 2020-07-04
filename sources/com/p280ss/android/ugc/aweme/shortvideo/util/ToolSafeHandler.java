package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler */
public class ToolSafeHandler extends SafeHandler {

    /* renamed from: a */
    private boolean f107940a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler$1 */
    static /* synthetic */ class C415041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f107941a = new int[Event.values().length];

        static {
            try {
                f107941a[Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ToolSafeHandler(C0043i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final void mo102164a(Runnable runnable) {
        if (!this.f107940a) {
            post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (C415041.f107941a[event.ordinal()] == 1) {
            mo96136a();
            this.f107940a = true;
        }
    }
}
