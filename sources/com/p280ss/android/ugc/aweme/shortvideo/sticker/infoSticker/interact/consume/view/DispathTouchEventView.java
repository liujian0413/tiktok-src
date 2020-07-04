package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41844c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView */
public final class DispathTouchEventView extends ProgressBar {

    /* renamed from: a */
    private C41844c f105993a;

    /* renamed from: b */
    private C40780d f105994b;

    /* renamed from: c */
    private C40762a f105995c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView$a */
    public interface C40762a {
        /* renamed from: a */
        void mo101001a(int i);
    }

    public final C40762a getClickListener() {
        return this.f105995c;
    }

    public final C41844c getListener() {
        return this.f105993a;
    }

    public final C40780d getStatusView() {
        return this.f105994b;
    }

    public final void setClickListener(C40762a aVar) {
        this.f105995c = aVar;
    }

    public final void setListener(C41844c cVar) {
        this.f105993a = cVar;
    }

    public final void setStatusView(C40780d dVar) {
        this.f105994b = dVar;
    }

    public DispathTouchEventView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        setOnClickListener(C407611.f105996a);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        Integer num2 = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C40780d dVar = this.f105994b;
            if (dVar != null) {
                num2 = dVar.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                C41844c cVar = this.f105993a;
                if (cVar != null) {
                    cVar.mo71725a(true);
                }
                return false;
            }
        } else if (num != null && num.intValue() == 1) {
            C40780d dVar2 = this.f105994b;
            if (dVar2 != null) {
                num2 = dVar2.getStatus();
            }
            if (num2 == null || num2.intValue() != 0) {
                return false;
            }
            C41844c cVar2 = this.f105993a;
            if (cVar2 != null) {
                cVar2.mo71725a(false);
            }
            C40762a aVar = this.f105995c;
            if (aVar != null) {
                aVar.mo101001a(getId());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DispathTouchEventView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        setOnClickListener(C407611.f105996a);
    }

    public DispathTouchEventView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        setOnClickListener(C407611.f105996a);
    }
}
