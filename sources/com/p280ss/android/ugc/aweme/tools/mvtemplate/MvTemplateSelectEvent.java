package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent */
public final class MvTemplateSelectEvent {

    /* renamed from: a */
    public final SelectState f110453a;

    /* renamed from: b */
    public final Producer f110454b;

    /* renamed from: c */
    public final int f110455c;

    /* renamed from: d */
    public final float f110456d;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent$Producer */
    public enum Producer {
        MAIN_TEMPLATE,
        ICON_LIST
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent$SelectState */
    public enum SelectState {
        START,
        SCROLL
    }

    public MvTemplateSelectEvent(SelectState selectState, Producer producer) {
        this(selectState, producer, 0, 0.0f, 12, null);
    }

    public MvTemplateSelectEvent(SelectState selectState, Producer producer, int i, float f) {
        C7573i.m23587b(selectState, "state");
        C7573i.m23587b(producer, "producer");
        this.f110453a = selectState;
        this.f110454b = producer;
        this.f110455c = i;
        this.f110456d = f;
    }

    public /* synthetic */ MvTemplateSelectEvent(SelectState selectState, Producer producer, int i, float f, int i2, C7571f fVar) {
        this(selectState, producer, 0, 0.0f);
    }
}
