package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView */
public final class SearchResultView extends LinearLayout {

    /* renamed from: a */
    private C23951a f63283a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView$a */
    public interface C23951a {
        /* renamed from: a */
        void mo62142a(MotionEvent motionEvent);
    }

    public SearchResultView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOnDispatchTouchEventListener(C23951a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f63283a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C23951a aVar = this.f63283a;
        if (aVar != null) {
            aVar.mo62142a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    public SearchResultView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ SearchResultView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
