package com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar;

import android.content.Context;
import android.support.p029v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar */
public final class OnTouchDraftSeekBar extends AppCompatSeekBar implements OnSeekBarChangeListener {

    /* renamed from: a */
    public static final C28996a f76371a = new C28996a(null);

    /* renamed from: b */
    private OnSeekBarChangeListener f76372b;

    /* renamed from: c */
    private boolean f76373c;

    /* renamed from: d */
    private boolean f76374d;

    /* renamed from: e */
    private Float f76375e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar$a */
    public static final class C28996a {
        private C28996a() {
        }

        public /* synthetic */ C28996a(C7571f fVar) {
            this();
        }
    }

    public final boolean getHasActionMove() {
        return this.f76373c;
    }

    public final Float getMDownEventRawX() {
        return this.f76375e;
    }

    public final boolean getMPauseStatus() {
        return this.f76374d;
    }

    /* renamed from: a */
    private final void m95233a() {
        super.setOnSeekBarChangeListener(this);
    }

    public final void setHasActionMove(boolean z) {
        this.f76373c = z;
    }

    public final void setMDownEventRawX(Float f) {
        this.f76375e = f;
    }

    public final void setMPauseStatus(boolean z) {
        this.f76374d = z;
    }

    public final void setPauseStatus(boolean z) {
        this.f76374d = z;
    }

    public OnTouchDraftSeekBar(Context context) {
        this(context, null);
    }

    public final void setCustomOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        C7573i.m23587b(onSeekBarChangeListener, C38566l.f100205a);
        this.f76372b = onSeekBarChangeListener;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f76372b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f76372b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f76373c = false;
            this.f76375e = Float.valueOf(motionEvent.getRawX());
            super.onTouchEvent(motionEvent);
        } else if (num != null && num.intValue() == 2) {
            Float f = this.f76375e;
            if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.f76373c = true;
                super.onTouchEvent(motionEvent);
            }
        } else if (num != null && num.intValue() == 1) {
            if (this.f76373c || this.f76374d) {
                super.onTouchEvent(motionEvent);
            } else {
                SeekBar seekBar = this;
                onStartTrackingTouch(seekBar);
                onStopTrackingTouch(seekBar);
            }
            this.f76373c = false;
        } else if (num != null && num.intValue() == 3) {
            super.onTouchEvent(motionEvent);
            this.f76373c = false;
        }
        return true;
    }

    public OnTouchDraftSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f76372b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public OnTouchDraftSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95233a();
    }
}
