package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C39297a;
import com.p280ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView */
public class MusicDragView implements OnTouchListener {

    /* renamed from: a */
    ImageView f102070a;

    /* renamed from: b */
    public int f102071b;

    /* renamed from: c */
    public int f102072c;
    @BindView(2131493046)
    DmtCutMusicLayout cutMusicLayout;

    /* renamed from: d */
    public C39301b f102073d;

    /* renamed from: e */
    private View f102074e;

    /* renamed from: f */
    private int f102075f;

    /* renamed from: g */
    private float f102076g;

    /* renamed from: h */
    private float f102077h;

    /* renamed from: i */
    private boolean f102078i;

    /* renamed from: j */
    private C39300a f102079j;
    @BindView(2131493357)
    KTVView mKTVView;
    @BindView(2131493933)
    TextView mTextViewTimeStart;
    @BindView(2131493900)
    TextView mTextViewTotalTime;
    @BindString(2132083549)
    String mTimeString;
    @BindView(2131493720)
    RelativeLayout slideContainer;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView$a */
    public interface C39300a {
        /* renamed from: c */
        void mo97850c(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView$b */
    public interface C39301b {
        /* renamed from: b */
        void mo97851b(int i);
    }

    @OnClick({2131493319})
    public void next() {
        if (this.f102079j != null) {
            this.f102079j.mo97850c(this.f102071b);
        }
    }

    /* renamed from: b */
    private void m125581b() {
        int x = (int) ((this.f102070a.getX() + ((float) (this.f102070a.getWidth() / 2))) - this.mKTVView.getX());
        if (x < 0 || this.f102078i) {
            x = 0;
        }
        this.mKTVView.setStart(x);
        this.mKTVView.setLength(m125582c());
        this.mTextViewTimeStart.setText(C43109eu.m136730a(m125584d()));
    }

    /* renamed from: c */
    private int m125582c() {
        if (this.f102075f >= this.f102072c || this.f102078i) {
            return this.mKTVView.getWidth();
        }
        double width = (double) this.mKTVView.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f102075f;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f102072c;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: f */
    private int m125587f() {
        if (this.f102075f >= this.f102072c) {
            return (int) (((((float) this.mKTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f102072c));
        }
        double width = (double) this.mKTVView.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f102075f;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f102072c;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: d */
    private int m125584d() {
        double x = (double) this.f102070a.getX();
        Double.isNaN(x);
        double d = x * 1.0d;
        double x2 = (double) this.mKTVView.getX();
        Double.isNaN(x2);
        double d2 = d - x2;
        double width = (double) (this.f102070a.getWidth() / 2);
        Double.isNaN(width);
        double d3 = d2 + width;
        double width2 = (double) this.mKTVView.getWidth();
        Double.isNaN(width2);
        double d4 = d3 / width2;
        double d5 = (double) this.f102072c;
        Double.isNaN(d5);
        int i = (int) (d4 * d5);
        if (i < 0) {
            i = 0;
        }
        if (i > this.f102072c) {
            return 0;
        }
        return i;
    }

    /* renamed from: e */
    private void m125586e() {
        this.mTextViewTotalTime.setText(C43109eu.m136730a(this.f102072c));
        this.mTextViewTimeStart.setText(this.mTimeString);
        this.f102070a = new ImageView(this.f102074e.getContext());
        this.f102070a.setImageResource(R.drawable.a48);
        this.f102070a.setScaleType(ScaleType.FIT_XY);
        this.slideContainer.addView(this.f102070a);
        this.f102070a.setX(this.mKTVView.getX() - ((float) (this.f102070a.getWidth() / 2)));
        this.mKTVView.setLength(m125582c());
        this.f102070a.setOnTouchListener(this);
        this.cutMusicLayout.setBubbleTextViewAttrite(C39312e.m125629c(this.cutMusicLayout.getContext()));
        this.cutMusicLayout.setScrollListener(new C39297a() {
            /* renamed from: b */
            public final void mo97841b(float f) {
                MusicDragView.this.cutMusicLayout.setTimeBubble((int) (f * ((float) MusicDragView.this.f102072c)));
            }

            /* renamed from: a */
            public final void mo97840a(float f) {
                MusicDragView.this.f102071b = (int) (f * ((float) MusicDragView.this.f102072c));
                if (MusicDragView.this.f102073d != null) {
                    MusicDragView.this.f102073d.mo97851b(MusicDragView.this.f102071b);
                }
            }
        });
        this.cutMusicLayout.mo97825a((((float) this.f102071b) * 1.0f) / ((float) this.f102072c));
        this.cutMusicLayout.setTimeBubble(this.f102071b);
    }

    /* renamed from: a */
    public final void mo97845a() {
        if (this.f102070a != null && this.mKTVView != null) {
            double d = (double) this.f102071b;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double width = (double) this.mKTVView.getWidth();
            Double.isNaN(width);
            double d3 = d2 * width;
            double d4 = (double) this.f102072c;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            this.f102070a.setX((this.mKTVView.getX() + ((float) i)) - ((float) (this.f102070a.getWidth() / 2)));
            this.mKTVView.setStart(i);
            this.mKTVView.setLength(m125582c());
            this.mTextViewTimeStart.setText(C43109eu.m136730a(this.f102071b));
        }
    }

    /* renamed from: b */
    private MusicDragView m125580b(int i) {
        this.f102072c = i;
        return this;
    }

    /* renamed from: c */
    private MusicDragView m125583c(int i) {
        this.f102071b = i;
        return this;
    }

    /* renamed from: d */
    private MusicDragView m125585d(int i) {
        this.f102075f = i;
        return this;
    }

    /* renamed from: a */
    public final MusicDragView mo97843a(C39300a aVar) {
        this.f102079j = aVar;
        return this;
    }

    /* renamed from: a */
    public final MusicDragView mo97844a(C39301b bVar) {
        this.f102073d = bVar;
        return this;
    }

    /* renamed from: a */
    public final void mo97846a(int i) {
        if (this.cutMusicLayout != null && this.cutMusicLayout.getVisibility() == 0) {
            this.cutMusicLayout.mo97827b((((float) i) * 1.0f) / ((float) this.f102072c));
        }
    }

    /* renamed from: a */
    private MusicDragView m125577a(View view) {
        this.f102074e = view;
        ButterKnife.bind((Object) this, this.f102074e);
        m125586e();
        this.f102074e.bringToFront();
        if (this.f102072c > this.f102075f && this.f102072c < this.f102075f + 1000) {
            this.f102078i = true;
        }
        return this;
    }

    /* renamed from: a */
    private void m125579a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = this.f102070a;
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        KTVView kTVView = this.mKTVView;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        kTVView.setVisibility(i2);
        TextView textView = this.mTextViewTimeStart;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.mTextViewTotalTime;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        DmtCutMusicLayout dmtCutMusicLayout = this.cutMusicLayout;
        if (!z) {
            i5 = 0;
        }
        dmtCutMusicLayout.setVisibility(i5);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f102076g = motionEvent.getRawX();
                this.f102077h = this.f102070a.getX();
                break;
            case 1:
                int x = (int) ((this.f102070a.getX() - this.mKTVView.getX()) + ((float) (this.f102070a.getWidth() / 2)));
                if (x < 0) {
                    x = 0;
                }
                double d = (double) x;
                Double.isNaN(d);
                double d2 = d * 1.0d;
                double width = (double) this.mKTVView.getWidth();
                Double.isNaN(width);
                double d3 = d2 / width;
                double d4 = (double) this.f102072c;
                Double.isNaN(d4);
                this.f102071b = (int) (d3 * d4);
                if (this.f102073d != null) {
                    this.f102073d.mo97851b(this.f102071b);
                    break;
                }
                break;
            case 2:
                if (!this.f102078i) {
                    float rawX = this.f102077h + (motionEvent.getRawX() - this.f102076g);
                    if (rawX < this.mKTVView.getX() - ((float) (this.f102070a.getWidth() / 2))) {
                        rawX = this.mKTVView.getX() - ((float) (this.f102070a.getWidth() / 2));
                    }
                    if ((rawX - this.mKTVView.getX()) + ((float) (this.f102070a.getWidth() / 2)) >= ((float) (this.mKTVView.getWidth() - m125587f()))) {
                        rawX = ((this.mKTVView.getX() - ((float) (this.f102070a.getWidth() / 2))) + ((float) this.mKTVView.getWidth())) - ((float) m125587f());
                    }
                    float f = 0.0f;
                    if (rawX >= 0.0f) {
                        f = rawX;
                    }
                    this.f102070a.animate().x(f).setDuration(0).start();
                    m125581b();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo97847a(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        C39312e.m125623a().mo97876a(aVMusicWaveBean, (long) i, (long) i2);
        C39312e.m125628b(aVMusicWaveBean);
        if (aVMusicWaveBean == null || this.cutMusicLayout == null) {
            m125579a(true);
            return;
        }
        m125579a(false);
        this.cutMusicLayout.setAudioWaveViewData(aVMusicWaveBean);
    }

    /* renamed from: a */
    public static MusicDragView m125578a(View view, int i, int i2, int i3) {
        MusicDragView musicDragView = new MusicDragView();
        musicDragView.m125585d(i).m125583c(i3).m125580b(i2).m125577a(view);
        musicDragView.getClass();
        view.post(C39311d.m125619a(musicDragView));
        if (musicDragView.f102073d != null) {
            musicDragView.f102073d.mo97851b(i3);
        }
        return musicDragView;
    }
}
