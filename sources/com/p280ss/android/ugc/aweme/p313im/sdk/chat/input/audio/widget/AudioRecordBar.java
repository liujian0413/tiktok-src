package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$styleable;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30794k;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.C30797n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar */
public class AudioRecordBar extends DmtTextView implements OnTouchListener {

    /* renamed from: b */
    public boolean f80611b;

    /* renamed from: c */
    public boolean f80612c;

    /* renamed from: d */
    public boolean f80613d;

    /* renamed from: e */
    private int f80614e;

    /* renamed from: f */
    private int f80615f;

    /* renamed from: g */
    private int f80616g;

    /* renamed from: h */
    private int f80617h;

    /* renamed from: i */
    private int f80618i;

    /* renamed from: j */
    private int f80619j;

    /* renamed from: k */
    private int f80620k;

    /* renamed from: l */
    private float f80621l;

    /* renamed from: m */
    private float f80622m;

    /* renamed from: n */
    private float f80623n;

    /* renamed from: o */
    private boolean f80624o;

    /* renamed from: p */
    private AudioRecordStateView f80625p;

    /* renamed from: q */
    private C30794k f80626q;

    /* renamed from: r */
    private long f80627r;

    /* renamed from: d */
    private void m100316d() {
        if (this.f80625p != null) {
            this.f80625p.mo80640b();
        }
    }

    /* renamed from: a */
    public final void mo1061a() {
        this.f80611b = false;
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f80622m, this.f80623n, 0));
    }

    /* renamed from: c */
    private void m100315c() {
        if (this.f80624o) {
            this.f80624o = false;
            setText(this.f80614e);
            setContentDescription(getContext().getResources().getString(this.f80614e));
            setTextColor(getResources().getColor(this.f80616g));
            setBackgroundResource(this.f80618i);
            if (this.f80626q != null) {
                this.f80626q.mo80589b();
            }
        }
    }

    /* renamed from: b */
    private void m100314b() {
        if (!this.f80624o) {
            this.f80624o = true;
            setText(this.f80615f);
            setContentDescription(getContext().getResources().getString(this.f80615f));
            setTextColor(getResources().getColor(this.f80617h));
            setBackgroundResource(this.f80619j);
            if (this.f80625p != null) {
                this.f80625p.mo80638a(0);
            }
            if (this.f80626q != null) {
                this.f80626q.mo80587a();
            }
        }
    }

    public void setListener(C30794k kVar) {
        this.f80626q = kVar;
    }

    public void setStateView(AudioRecordStateView audioRecordStateView) {
        this.f80625p = audioRecordStateView;
    }

    public AudioRecordBar(Context context) {
        super(context);
        m100313a(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(null);
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m100313a(context, attributeSet);
    }

    /* renamed from: a */
    private void m100313a(Context context, AttributeSet attributeSet) {
        setOnTouchListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioRecordBar);
            this.f80614e = obtainStyledAttributes.getResourceId(5, -1);
            this.f80615f = obtainStyledAttributes.getResourceId(6, this.f80614e);
            this.f80616g = obtainStyledAttributes.getResourceId(3, -1);
            this.f80617h = obtainStyledAttributes.getResourceId(4, this.f80616g);
            this.f80618i = obtainStyledAttributes.getResourceId(0, -1);
            this.f80619j = obtainStyledAttributes.getResourceId(1, this.f80618i);
            this.f80620k = obtainStyledAttributes.getDimensionPixelOffset(2, 50);
            obtainStyledAttributes.recycle();
            setText(this.f80614e);
            setContentDescription(getContext().getResources().getString(this.f80614e));
            setTextColor(getResources().getColor(this.f80616g));
            setBackgroundResource(this.f80618i);
            this.f80612c = C30797n.m100311b(context);
            if (C31915n.m103672b()) {
                getPaint().setFakeBoldText(true);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f80612c) {
            this.f80622m = motionEvent.getX();
            this.f80623n = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                if (SystemClock.uptimeMillis() - this.f80627r < 1000) {
                    return true;
                }
                this.f80627r = SystemClock.uptimeMillis();
                this.f80621l = motionEvent.getY();
                m100314b();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                m100315c();
            } else if (motionEvent.getAction() == 2 && this.f80625p != null && this.f80624o) {
                if (!this.f80611b && Math.abs(motionEvent.getY()) - this.f80621l >= ((float) this.f80620k)) {
                    this.f80611b = true;
                    m100316d();
                } else if (this.f80611b && Math.abs(motionEvent.getY()) - this.f80621l < ((float) this.f80620k)) {
                    this.f80625p.mo80637a();
                    this.f80611b = false;
                }
            }
            return true;
        } else if (this.f80613d) {
            return true;
        } else {
            this.f80613d = true;
            C30797n.m100309a((Activity) view.getContext(), new C6892b<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void run(Boolean bool) {
                    AudioRecordBar.this.f80612c = bool.booleanValue();
                    AudioRecordBar.this.f80613d = false;
                }
            });
            return true;
        }
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m100313a(context, attributeSet);
    }
}
