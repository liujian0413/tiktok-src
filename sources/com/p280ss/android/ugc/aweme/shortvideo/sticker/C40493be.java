package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.be */
public final class C40493be implements OnTouchListener {

    /* renamed from: a */
    public final long f105238a = 150;

    /* renamed from: b */
    private final float f105239b = 1.2f;

    /* renamed from: c */
    private final View f105240c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f105240c.animate().scaleX(this.f105239b).scaleY(this.f105239b).setDuration(this.f105238a).start();
                    break;
                case 1:
                    break;
            }
        }
        this.f105240c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f105238a).start();
        return false;
    }

    public C40493be(float f, long j, View view) {
        C7573i.m23587b(view, "animateView");
        this.f105240c = view;
    }
}
