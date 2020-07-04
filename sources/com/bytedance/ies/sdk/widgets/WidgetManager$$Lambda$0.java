package com.bytedance.ies.sdk.widgets;

import android.support.p022v4.view.C0961c.C0966d;
import android.view.View;
import android.view.ViewGroup;

final /* synthetic */ class WidgetManager$$Lambda$0 implements C0966d {
    private final WidgetManager arg$1;
    private final Widget arg$2;
    private final ViewGroup arg$3;

    WidgetManager$$Lambda$0(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.arg$1 = widgetManager;
        this.arg$2 = widget;
        this.arg$3 = viewGroup;
    }

    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.arg$1.lambda$load$0$WidgetManager(this.arg$2, this.arg$3, view, i, viewGroup);
    }
}
