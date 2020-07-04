package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.support.p029v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText */
public class VoteEditText extends AppCompatEditText {

    /* renamed from: a */
    public long f103049a;

    /* renamed from: b */
    private boolean f103050b;

    public VoteEditText(Context context) {
        super(context);
    }

    public void setMode(boolean z) {
        this.f103050b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f103050b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f103049a = System.currentTimeMillis();
        return false;
    }

    public VoteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
