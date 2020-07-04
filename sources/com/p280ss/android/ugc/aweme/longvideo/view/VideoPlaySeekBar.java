package com.p280ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar */
public final class VideoPlaySeekBar extends LinearLayout {

    /* renamed from: c */
    public static final C32761a f85418c = new C32761a(null);

    /* renamed from: a */
    public TextView f85419a;

    /* renamed from: b */
    public int f85420b;

    /* renamed from: d */
    private TextView f85421d;

    /* renamed from: e */
    private SeekBar f85422e;

    /* renamed from: f */
    private Float f85423f;

    /* renamed from: g */
    private OnSeekBarChangeListener f85424g;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar$a */
    public static final class C32761a {
        private C32761a() {
        }

        public /* synthetic */ C32761a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar$b */
    public static final class C32762b implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlaySeekBar f85425a;

        C32762b(VideoPlaySeekBar videoPlaySeekBar) {
            this.f85425a = videoPlaySeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f85425a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f85425a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
            C42961az.m136380a(new C32716a());
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f85425a.f85419a;
            if (textView != null) {
                textView.setText(C32727e.f85308a.mo84202a(((float) i) / 100.0f, this.f85425a.f85420b));
            }
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f85425a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }
    }

    public final OnSeekBarChangeListener getMOnSeekBarChangeListener() {
        return this.f85424g;
    }

    public final Float getMProgress() {
        return this.f85423f;
    }

    public final void setMOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f85424g = onSeekBarChangeListener;
    }

    public final void setMProgress(Float f) {
        this.f85423f = f;
    }

    public VideoPlaySeekBar(Context context) {
        this(context, null);
    }

    public final void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        C7573i.m23587b(onSeekBarChangeListener, "listener");
        this.f85424g = onSeekBarChangeListener;
    }

    public final void setProgress(float f) {
        m106037a(f, false);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSecondaryProgress(int i) {
        SeekBar seekBar = this.f85422e;
        if (seekBar != null) {
            seekBar.setSecondaryProgress(i);
        }
    }

    public final void setTotalTime(int i) {
        this.f85420b = i;
        TextView textView = this.f85421d;
        if (textView != null) {
            textView.setText(C32727e.f85308a.mo84203a(i));
        }
    }

    public final void setSeekBarThumb(int i) {
        if (1 == i) {
            SeekBar seekBar = this.f85422e;
            if (seekBar != null) {
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                seekBar.setThumb(context.getResources().getDrawable(R.drawable.bh6));
            }
            return;
        }
        SeekBar seekBar2 = this.f85422e;
        if (seekBar2 != null) {
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            seekBar2.setThumb(context2.getResources().getDrawable(R.drawable.bh5));
        }
    }

    /* renamed from: a */
    private final void m106038a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.b4w, this, true);
        this.f85419a = (TextView) inflate.findViewById(R.id.e00);
        this.f85421d = (TextView) inflate.findViewById(R.id.e42);
        this.f85422e = (SeekBar) inflate.findViewById(R.id.d1y);
        SeekBar seekBar = this.f85422e;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new C32762b(this));
        }
        TextView textView = this.f85419a;
        if (textView != null) {
            textView.setText(C32727e.f85308a.mo84203a(0));
        }
        TextView textView2 = this.f85421d;
        if (textView2 != null) {
            textView2.setText(C32727e.f85308a.mo84203a(0));
        }
    }

    public VideoPlaySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m106037a(float f, boolean z) {
        this.f85423f = Float.valueOf(f);
        if (VERSION.SDK_INT >= 24) {
            SeekBar seekBar = this.f85422e;
            if (seekBar != null) {
                seekBar.setProgress((int) (100.0f * f), false);
            }
        } else {
            SeekBar seekBar2 = this.f85422e;
            if (seekBar2 != null) {
                seekBar2.setProgress((int) (100.0f * f));
            }
        }
        TextView textView = this.f85419a;
        if (textView != null) {
            textView.setText(C32727e.f85308a.mo84202a(f, this.f85420b));
        }
    }

    public VideoPlaySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m106038a(context);
    }
}
