package com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar */
public final class VideoSeekBar extends LinearLayout {

    /* renamed from: a */
    public static final C28997a f76376a = new C28997a(null);

    /* renamed from: b */
    private OnTouchDraftSeekBar f76377b;

    /* renamed from: c */
    private SeekBar f76378c;

    /* renamed from: d */
    private ImageView f76379d;

    /* renamed from: e */
    private Float f76380e;

    /* renamed from: f */
    private C28999c f76381f;

    /* renamed from: g */
    private C28998b f76382g;

    /* renamed from: h */
    private int f76383h;

    /* renamed from: i */
    private int f76384i;

    /* renamed from: j */
    private float f76385j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$a */
    public static final class C28997a {
        private C28997a() {
        }

        public /* synthetic */ C28997a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$b */
    public interface C28998b {
        /* renamed from: a */
        void mo74321a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$c */
    public interface C28999c {
        /* renamed from: a */
        void mo74322a(SeekBar seekBar);

        /* renamed from: a */
        void mo74323a(SeekBar seekBar, int i, boolean z);

        /* renamed from: b */
        void mo74324b(SeekBar seekBar);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d */
    public static final class C29000d implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoSeekBar f76386a;

        C29000d(VideoSeekBar videoSeekBar) {
            this.f76386a = videoSeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            C28999c mOnSeekBarChangeListener = this.f76386a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo74322a(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C28999c mOnSeekBarChangeListener = this.f76386a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo74324b(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C28999c mOnSeekBarChangeListener = this.f76386a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.mo74323a(seekBar, i, z);
            }
        }
    }

    public final ImageView getCoverThumbImg() {
        return this.f76379d;
    }

    public final float getMFourDp() {
        return this.f76385j;
    }

    public final C28998b getMOnDispatchTouchEventListener() {
        return this.f76382g;
    }

    public final C28999c getMOnSeekBarChangeListener() {
        return this.f76381f;
    }

    public final Float getMProgress() {
        return this.f76380e;
    }

    public final int getMScreenWidth() {
        return this.f76384i;
    }

    public final int getTwoProgress() {
        return this.f76383h;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void setMFourDp(float f) {
        this.f76385j = f;
    }

    public final void setMOnDispatchTouchEventListener(C28998b bVar) {
        this.f76382g = bVar;
    }

    public final void setMOnSeekBarChangeListener(C28999c cVar) {
        this.f76381f = cVar;
    }

    public final void setMProgress(Float f) {
        this.f76380e = f;
    }

    public final void setMScreenWidth(int i) {
        this.f76384i = i;
    }

    public final void setTwoProgress(int i) {
        this.f76383h = i;
    }

    public VideoSeekBar(Context context) {
        this(context, null);
    }

    public final void setOnDispatchTouchEventListener(C28998b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f76382g = bVar;
    }

    public final void setOnSeekBarChangeListener(C28999c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f76381f = cVar;
    }

    public final void setProgress(float f) {
        m95235a(f, false);
    }

    public final void setPauseStatus(boolean z) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f76377b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setPauseStatus(z);
        }
    }

    public final void setSecondaryProgress(int i) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f76377b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setSecondaryProgress(i);
        }
    }

    public final void setThumb(Drawable drawable) {
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f76377b;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setThumb(drawable);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        C28998b bVar = this.f76382g;
        if (bVar != null) {
            bVar.mo74321a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m95234a(float f) {
        LayoutParams layoutParams;
        float f2 = this.f76385j + ((((float) this.f76384i) - (this.f76385j * 2.0f)) * (f / 100.0f));
        ImageView imageView = this.f76379d;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (VERSION.SDK_INT > 16) {
                layoutParams2.setMarginStart(((int) f2) - ((int) this.f76385j));
            }
            layoutParams2.leftMargin = ((int) f2) - ((int) this.f76385j);
            ImageView imageView2 = this.f76379d;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    private final void m95236a(Context context) {
        this.f76384i = C9738o.m28691a(context);
        this.f76385j = C9738o.m28708b(context, 4.0f);
        this.f76383h = (int) ((this.f76385j / ((float) this.f76384i)) * 10000.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b2f, this, true);
        bringToFront();
        this.f76377b = (OnTouchDraftSeekBar) inflate.findViewById(R.id.d1y);
        this.f76378c = (SeekBar) inflate.findViewById(R.id.d20);
        this.f76379d = (ImageView) inflate.findViewById(R.id.d1z);
        if (VERSION.SDK_INT < 21) {
            try {
                Field declaredField = ProgressBar.class.getDeclaredField("mMaxHeight");
                C7573i.m23582a((Object) declaredField, "declaredField");
                declaredField.setAccessible(true);
                declaredField.set(this.f76377b, Float.valueOf(C9738o.m28708b(context, 8.0f)));
            } catch (Throwable unused) {
            }
            OnTouchDraftSeekBar onTouchDraftSeekBar = this.f76377b;
            if (onTouchDraftSeekBar != null) {
                onTouchDraftSeekBar.setPadding((int) C9738o.m28708b(context, 4.0f), (int) C9738o.m28708b(context, 3.0f), (int) C9738o.m28708b(context, 4.0f), (int) C9738o.m28708b(context, 7.0f));
            }
        }
        OnTouchDraftSeekBar onTouchDraftSeekBar2 = this.f76377b;
        if (onTouchDraftSeekBar2 != null) {
            onTouchDraftSeekBar2.setCustomOnSeekBarChangeListener(new C29000d(this));
        }
    }

    public VideoSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m95235a(float f, boolean z) {
        this.f76380e = Float.valueOf(f);
        if (VERSION.SDK_INT >= 24) {
            OnTouchDraftSeekBar onTouchDraftSeekBar = this.f76377b;
            if (onTouchDraftSeekBar != null) {
                onTouchDraftSeekBar.setProgress((int) (100.0f * f), false);
            }
        } else {
            OnTouchDraftSeekBar onTouchDraftSeekBar2 = this.f76377b;
            if (onTouchDraftSeekBar2 != null) {
                onTouchDraftSeekBar2.setProgress((int) (100.0f * f));
            }
        }
        SeekBar seekBar = this.f76378c;
        if (seekBar != null) {
            seekBar.setProgress(this.f76383h);
        }
        m95234a(f);
    }

    public VideoSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            m95236a(context);
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }
}
