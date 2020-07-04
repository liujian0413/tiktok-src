package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordStateView */
public class AudioRecordStateView extends LinearLayout {

    /* renamed from: a */
    private TextView f80629a;

    /* renamed from: b */
    private TextView f80630b;

    /* renamed from: c */
    private ImageView f80631c;

    /* renamed from: d */
    private int f80632d;

    /* renamed from: e */
    private int f80633e;

    /* renamed from: f */
    private int f80634f;

    /* renamed from: g */
    private int f80635g;

    /* renamed from: h */
    private int f80636h;

    /* renamed from: i */
    private int f80637i;

    /* renamed from: j */
    private int f80638j;

    /* renamed from: k */
    private int f80639k;

    /* renamed from: l */
    private int f80640l;

    /* renamed from: m */
    private int f80641m;

    /* renamed from: n */
    private int f80642n;

    /* renamed from: o */
    private int f80643o;

    /* renamed from: p */
    private int f80644p;

    /* renamed from: q */
    private long f80645q;

    /* renamed from: r */
    private Handler f80646r = new Handler() {
        public final void handleMessage(Message message) {
            if (1 == message.what) {
                AudioRecordStateView.this.setVisibility(4);
            }
        }
    };

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: f */
    private void m100321f() {
        this.f80646r.removeMessages(1);
        setVisibility(0);
    }

    /* renamed from: g */
    private void m100322g() {
        this.f80646r.removeMessages(1);
        this.f80646r.sendEmptyMessageDelayed(1, 1500);
    }

    /* renamed from: a */
    public final void mo80637a() {
        if (this.f80645q > 0) {
            mo80639a(this.f80645q);
        } else {
            mo80638a(this.f80644p);
        }
    }

    /* renamed from: b */
    public final void mo80640b() {
        if (this.f80633e != -1) {
            this.f80629a.setText(this.f80633e);
        } else {
            this.f80629a.setText("");
        }
        this.f80630b.setVisibility(4);
        if (this.f80637i != -1) {
            this.f80631c.setImageResource(this.f80637i);
            this.f80631c.setVisibility(0);
        } else {
            this.f80631c.setVisibility(4);
        }
        m100321f();
    }

    /* renamed from: c */
    public final void mo80641c() {
        if (this.f80634f != -1) {
            this.f80629a.setText(this.f80634f);
        } else {
            this.f80629a.setText("");
        }
        this.f80630b.setVisibility(4);
        if (this.f80636h != -1) {
            this.f80631c.setImageResource(this.f80636h);
            this.f80631c.setVisibility(0);
        } else {
            this.f80631c.setVisibility(4);
        }
        m100321f();
        m100322g();
    }

    /* renamed from: d */
    public final void mo80642d() {
        if (this.f80635g != -1) {
            this.f80629a.setText(this.f80635g);
        } else {
            this.f80629a.setText("");
        }
        this.f80630b.setVisibility(4);
        if (this.f80636h != -1) {
            this.f80631c.setImageResource(this.f80636h);
            this.f80631c.setVisibility(0);
        } else {
            this.f80631c.setVisibility(4);
        }
        m100321f();
        m100322g();
    }

    /* renamed from: e */
    private void m100320e() {
        if (this.f80632d != -1) {
            this.f80629a.setText(this.f80632d);
        } else {
            this.f80629a.setText("");
        }
        this.f80630b.setVisibility(4);
        if (this.f80642n != -1) {
            this.f80631c.setImageResource(this.f80642n);
            this.f80631c.setVisibility(0);
        } else {
            this.f80631c.setVisibility(4);
        }
        this.f80630b.setTextColor(getResources().getColor(this.f80643o));
        this.f80629a.setTextColor(getResources().getColor(this.f80643o));
        this.f80644p = 0;
        this.f80645q = 0;
        setVisibility(4);
    }

    public void setVolumeLevel(int i) {
        this.f80644p = i;
    }

    public AudioRecordStateView(Context context) {
        super(context);
        m100319a(context, null);
    }

    public void setSecondsRemain(long j) {
        this.f80645q = j;
        double d = (double) j;
        Double.isNaN(d);
        this.f80630b.setText(String.valueOf((int) Math.ceil(d / 1000.0d)));
    }

    /* renamed from: a */
    public final void mo80639a(long j) {
        setSecondsRemain(j);
        this.f80630b.setVisibility(0);
        this.f80631c.setVisibility(4);
        m100321f();
    }

    /* renamed from: a */
    public final void mo80638a(int i) {
        m100320e();
        setVolumeLevel(i);
        switch (Math.min(i, 5)) {
            case 2:
                this.f80631c.setImageResource(this.f80641m);
                break;
            case 3:
                this.f80631c.setImageResource(this.f80640l);
                break;
            case 4:
                this.f80631c.setImageResource(this.f80639k);
                break;
            case 5:
                this.f80631c.setImageResource(this.f80638j);
                break;
            default:
                this.f80631c.setImageResource(this.f80642n);
                break;
        }
        m100321f();
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m100319a(context, attributeSet);
    }

    /* renamed from: a */
    private void m100319a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.ak5, this);
        this.f80629a = (TextView) findViewById(R.id.e2e);
        this.f80630b = (TextView) findViewById(R.id.dwo);
        this.f80631c = (ImageView) findViewById(R.id.bcg);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioRecordStateView);
            this.f80632d = obtainStyledAttributes.getResourceId(2, -1);
            this.f80633e = obtainStyledAttributes.getResourceId(1, this.f80632d);
            this.f80634f = obtainStyledAttributes.getResourceId(6, -1);
            this.f80635g = obtainStyledAttributes.getResourceId(5, -1);
            this.f80636h = obtainStyledAttributes.getResourceId(3, -1);
            this.f80637i = obtainStyledAttributes.getResourceId(0, -1);
            this.f80638j = obtainStyledAttributes.getResourceId(11, -1);
            this.f80639k = obtainStyledAttributes.getResourceId(10, this.f80638j);
            this.f80640l = obtainStyledAttributes.getResourceId(9, this.f80639k);
            this.f80641m = obtainStyledAttributes.getResourceId(8, this.f80640l);
            this.f80642n = obtainStyledAttributes.getResourceId(7, this.f80641m);
            this.f80643o = obtainStyledAttributes.getResourceId(4, -1);
            obtainStyledAttributes.recycle();
            m100320e();
        }
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m100319a(context, attributeSet);
    }
}
