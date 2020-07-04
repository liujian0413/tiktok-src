package com.twitter.sdk.android.tweetui.internal;

import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.twitter.sdk.android.tweetui.internal.h */
public final class C47075h {

    /* renamed from: a */
    private final View f120803a;

    /* renamed from: b */
    private Layout f120804b = null;

    /* renamed from: c */
    private float f120805c;

    /* renamed from: d */
    private float f120806d;

    /* renamed from: e */
    private C47070d f120807e;

    /* renamed from: a */
    private void m147174a() {
        C47070d dVar = this.f120807e;
        if (dVar != null && dVar.mo118335a()) {
            dVar.mo118334a(false);
            this.f120807e = null;
            m147179b();
        }
    }

    /* renamed from: b */
    private void m147179b() {
        this.f120803a.invalidate((int) this.f120805c, (int) this.f120806d, ((int) this.f120805c) + this.f120804b.getWidth(), ((int) this.f120806d) + this.f120804b.getHeight());
    }

    /* renamed from: a */
    public static void m147175a(TextView textView) {
        textView.setOnTouchListener(new C47076i(new C47075h(textView, null)));
    }

    /* renamed from: a */
    private void m147176a(C47070d dVar) {
        dVar.mo118334a(true);
        this.f120807e = dVar;
        m147179b();
    }

    /* renamed from: a */
    private boolean m147177a(MotionEvent motionEvent) {
        Spanned spanned;
        CharSequence text = this.f120804b.getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned == null) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        int x = (int) (motionEvent.getX() - this.f120805c);
        int y = (int) (motionEvent.getY() - this.f120806d);
        if (x < 0 || x >= this.f120804b.getWidth() || y < 0 || y >= this.f120804b.getHeight()) {
            m147174a();
            return false;
        }
        int lineForVertical = this.f120804b.getLineForVertical(y);
        float f = (float) x;
        if (f < this.f120804b.getLineLeft(lineForVertical) || f > this.f120804b.getLineRight(lineForVertical)) {
            m147174a();
            return false;
        }
        if (action == 0) {
            int offsetForHorizontal = this.f120804b.getOffsetForHorizontal(lineForVertical, f);
            C47070d[] dVarArr = (C47070d[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C47070d.class);
            if (dVarArr.length > 0) {
                m147176a(dVarArr[0]);
                return true;
            }
        } else if (action == 1) {
            C47070d dVar = this.f120807e;
            if (dVar != null) {
                dVar.onClick(this.f120803a);
                m147174a();
                return true;
            }
        }
        return false;
    }

    private C47075h(View view, Layout layout) {
        this.f120803a = view;
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m147178a(C47075h hVar, View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        hVar.f120804b = layout;
        hVar.f120805c = (float) (textView.getTotalPaddingLeft() + textView.getScrollX());
        hVar.f120806d = (float) (textView.getTotalPaddingTop() + textView.getScrollY());
        return hVar.m147177a(motionEvent);
    }
}
