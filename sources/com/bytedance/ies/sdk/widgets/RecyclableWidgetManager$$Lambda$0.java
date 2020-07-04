package com.bytedance.ies.sdk.widgets;

import android.support.p022v4.view.C0961c.C0966d;
import android.view.View;
import android.view.ViewGroup;

final /* synthetic */ class RecyclableWidgetManager$$Lambda$0 implements C0966d {
    private final RecyclableWidgetManager arg$1;
    private final LiveRecyclableWidget arg$2;
    private final ViewGroup arg$3;

    RecyclableWidgetManager$$Lambda$0(RecyclableWidgetManager recyclableWidgetManager, LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup) {
        this.arg$1 = recyclableWidgetManager;
        this.arg$2 = liveRecyclableWidget;
        this.arg$3 = viewGroup;
    }

    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.arg$1.lambda$load$0$RecyclableWidgetManager(this.arg$2, this.arg$3, view, i, viewGroup);
    }
}
