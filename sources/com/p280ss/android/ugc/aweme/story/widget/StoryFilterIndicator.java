package com.p280ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.story.widget.StoryFilterIndicator */
public class StoryFilterIndicator extends RelativeLayout {

    /* renamed from: a */
    public static final String f109511a = "StoryFilterIndicator";

    /* renamed from: b */
    TextView f109512b;

    /* renamed from: c */
    TextView f109513c;

    /* renamed from: d */
    public float f109514d;

    /* renamed from: e */
    public Runnable f109515e;

    /* renamed from: f */
    private C42102a f109516f;

    /* renamed from: com.ss.android.ugc.aweme.story.widget.StoryFilterIndicator$a */
    class C42102a implements Runnable {

        /* renamed from: a */
        CharSequence f109519a;

        /* renamed from: b */
        CharSequence f109520b;

        /* renamed from: c */
        boolean f109521c;

        public final void run() {
            float f;
            TextView textView;
            TextView textView2;
            float f2;
            if (StoryFilterIndicator.this.f109512b != null && StoryFilterIndicator.this.f109513c != null) {
                StoryFilterIndicator.this.animate().cancel();
                StoryFilterIndicator.this.f109512b.animate().cancel();
                StoryFilterIndicator.this.f109513c.animate().cancel();
                StoryFilterIndicator.this.removeCallbacks(StoryFilterIndicator.this.f109515e);
                StoryFilterIndicator.this.setAlpha(1.0f);
                StoryFilterIndicator.this.setVisibility(0);
                if (this.f109521c) {
                    f = StoryFilterIndicator.this.f109514d;
                } else {
                    f = 0.0f;
                }
                if (this.f109521c) {
                    textView = StoryFilterIndicator.this.f109512b;
                } else {
                    textView = StoryFilterIndicator.this.f109513c;
                }
                if (this.f109521c) {
                    textView2 = StoryFilterIndicator.this.f109513c;
                } else {
                    textView2 = StoryFilterIndicator.this.f109512b;
                }
                if (this.f109521c) {
                    f2 = 0.0f;
                } else {
                    f2 = StoryFilterIndicator.this.f109514d;
                }
                textView.setTranslationX(f2);
                textView2.setTranslationX(f2);
                textView.setAlpha(1.0f);
                textView2.setAlpha(0.0f);
                textView.setText(this.f109519a);
                textView2.setText(this.f109520b);
                textView.animate().translationX(f).alpha(0.0f).withEndAction(new Runnable() {
                    public final void run() {
                        StoryFilterIndicator.this.postDelayed(StoryFilterIndicator.this.f109515e, 600);
                    }
                }).setDuration(300).start();
                textView2.animate().translationX(f).alpha(1.0f).setDuration(300).start();
            }
        }

        public C42102a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.f109519a = charSequence;
            this.f109520b = charSequence2;
            this.f109521c = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* renamed from: a */
    private boolean m133974a() {
        if (this.f109514d != 0.0f) {
            return true;
        }
        return false;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public StoryFilterIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m133973a(Context context) {
        inflate(getContext(), R.layout.ab9, this);
        this.f109512b = (TextView) findViewById(R.id.alc);
        this.f109513c = (TextView) findViewById(R.id.d1q);
        this.f109512b.setAlpha(1.0f);
        this.f109513c.setAlpha(1.0f);
        this.f109513c.setVisibility(0);
        this.f109512b.setVisibility(0);
    }

    public StoryFilterIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoryFilterIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f109515e = new Runnable() {
            public final void run() {
                StoryFilterIndicator.this.animate().alpha(0.0f).withEndAction(new Runnable() {
                    public final void run() {
                        StoryFilterIndicator.this.setVisibility(8);
                    }
                }).setDuration(300).start();
            }
        };
        m133973a(context);
    }

    /* renamed from: a */
    public final void mo103480a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C42102a aVar = new C42102a(charSequence, charSequence2, z);
        if (m133974a()) {
            aVar.run();
        } else {
            this.f109516f = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!(this.f109512b == null || this.f109513c == null)) {
            this.f109514d = this.f109512b.getX() - this.f109513c.getX();
        }
        if (this.f109516f != null) {
            this.f109516f.run();
            this.f109516f = null;
        }
    }
}
