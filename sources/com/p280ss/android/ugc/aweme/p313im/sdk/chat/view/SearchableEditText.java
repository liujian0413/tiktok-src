package com.p280ss.android.ugc.aweme.p313im.sdk.chat.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0720f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.SearchableEditText */
public class SearchableEditText extends FixedEditText {

    /* renamed from: c */
    public boolean f81178c;

    /* renamed from: d */
    private Drawable f81179d;

    /* renamed from: e */
    private Drawable f81180e;

    public SearchableEditText(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (VERSION.SDK_INT >= 17) {
                Drawable drawable = getCompoundDrawablesRelative()[2];
                if (C0720f.m3043a(Locale.getDefault()) == 1) {
                    m100875a(drawable, motionEvent);
                } else {
                    m100877b(drawable, motionEvent);
                }
            } else {
                m100877b(getCompoundDrawables()[2], motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSearchable(boolean z) {
        Drawable drawable;
        this.f81178c = z;
        if (this.f81178c) {
            drawable = this.f81180e;
        } else {
            drawable = null;
        }
        if (VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    /* renamed from: a */
    private void m100876a(boolean z) {
        Drawable drawable;
        if (!this.f81178c || !z) {
            drawable = null;
        } else {
            drawable = this.f81179d;
        }
        if (VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m100875a(Drawable drawable, MotionEvent motionEvent) {
        if (drawable != null && motionEvent.getX() >= ((float) (getLeft() + getPaddingLeft())) && motionEvent.getX() <= ((float) (getLeft() + getPaddingLeft() + drawable.getBounds().width()))) {
            setText("");
        }
    }

    /* renamed from: b */
    private void m100877b(Drawable drawable, MotionEvent motionEvent) {
        if (drawable != null && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getX() >= ((float) ((getWidth() - getPaddingRight()) - drawable.getBounds().width()))) {
            setText("");
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        super.onFocusChanged(z, i, rect);
        if (!z || getText().length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        m100876a(z2);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81179d = getResources().getDrawable(R.drawable.a57);
        this.f81180e = getResources().getDrawable(R.drawable.a_l);
        if (VERSION.SDK_INT >= 19) {
            this.f81179d.setAutoMirrored(true);
            this.f81180e.setAutoMirrored(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        if (!isFocused() || charSequence.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        m100876a(z);
    }
}
