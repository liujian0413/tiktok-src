package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.utils.C23478e;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost */
public class TabHost extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    public static final String f108391a = "TabHost";

    /* renamed from: b */
    public boolean f108392b;

    /* renamed from: c */
    List<Integer> f108393c;

    /* renamed from: d */
    Scroller f108394d;

    /* renamed from: e */
    public LinearLayout f108395e;

    /* renamed from: f */
    public int f108396f;

    /* renamed from: g */
    public View f108397g;

    /* renamed from: h */
    private int f108398h;

    /* renamed from: i */
    private GestureDetector f108399i;

    /* renamed from: j */
    private C41670a f108400j;

    /* renamed from: k */
    private C41671b f108401k;

    /* renamed from: l */
    private float f108402l;

    /* renamed from: m */
    private float f108403m;

    /* renamed from: n */
    private float f108404n;

    /* renamed from: o */
    private float f108405o;

    /* renamed from: p */
    private int f108406p;

    /* renamed from: q */
    private int f108407q;

    /* renamed from: r */
    private int f108408r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$a */
    public interface C41670a {
        /* renamed from: a */
        void mo102409a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$b */
    public interface C41671b {
    }

    public int getCurrentIndex() {
        return this.f108398h;
    }

    /* renamed from: c */
    private void m132689c() {
        setIndex(m132687b());
    }

    public int getTabCount() {
        if (this.f108395e == null) {
            return 0;
        }
        return this.f108395e.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f108395e = (LinearLayout) findViewById(R.id.a19);
    }

    /* renamed from: a */
    private void m132684a() {
        this.f108408r = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f108393c = new ArrayList();
        setOnTouchListener(this);
        this.f108394d = new Scroller(getContext());
        this.f108399i = new GestureDetector(getContext(), new OnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (TabHost.this.equals(TabHost.this.f108397g) || TabHost.this.f108395e.equals(TabHost.this.f108397g)) {
                    return false;
                }
                TabHost.this.setIndex(TabHost.this.f108396f);
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (TabHost.this.f108392b && f2 < 20.0f) {
                    TabHost.this.f108394d.fling(TabHost.this.f108394d.getFinalX(), TabHost.this.f108394d.getFinalY(), (int) f2, 0, VETransitionFilterParam.TransitionDuration_DEFAULT, (int) f, 0, TabHost.this.getHeight());
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!TabHost.this.f108392b) {
                    return false;
                }
                if (f2 < 20.0f) {
                    f2 = 20.0f;
                }
                TabHost.this.f108395e.scrollBy((int) ((f * 20.0f) / f2), 0);
                TabHost.this.invalidate();
                return true;
            }
        });
    }

    /* renamed from: b */
    private int m132687b() {
        boolean z;
        int i;
        int i2 = 0;
        if (this.f108402l < this.f108403m) {
            z = true;
        } else {
            z = false;
        }
        float scrollX = ((float) this.f108395e.getScrollX()) + ((float) ((Integer) this.f108393c.get(0)).intValue());
        int size = this.f108393c.size();
        if (z) {
            int i3 = size - 1;
            i = 0;
            while (i3 >= 0) {
                if (((float) ((Integer) this.f108393c.get(i3)).intValue()) < scrollX) {
                    return i3;
                }
                int i4 = i3;
                i3--;
                i = i4;
            }
        } else {
            int i5 = 0;
            while (i2 < size) {
                if (((float) ((Integer) this.f108393c.get(i2)).intValue()) >= scrollX) {
                    return i2;
                }
                int i6 = i2;
                i2++;
                i5 = i6;
            }
        }
        return i;
    }

    public void setOnIndexChangedListener(C41670a aVar) {
        this.f108400j = aVar;
    }

    public void setScrollEnabled(boolean z) {
        this.f108392b = z;
    }

    public void setTouchEventWrapper(C41671b bVar) {
        this.f108401k = bVar;
    }

    public TabHost(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final Object mo102391a(int i) {
        if (this.f108395e == null) {
            return null;
        }
        View childAt = this.f108395e.getChildAt(i);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag();
    }

    public void setIndexWithoutAnim(int i) {
        m132686a(this.f108398h, this.f108407q);
        m132686a(i, this.f108406p);
        if (!(this.f108398h == i || this.f108400j == null)) {
            this.f108400j.mo102409a(this.f108398h, i);
        }
        StringBuilder sb = new StringBuilder("the set index is ");
        sb.append(i);
        sb.append(" mCurIndex:");
        sb.append(this.f108398h);
        C42880h.m136156a(sb.toString());
        this.f108398h = i;
        requestLayout();
    }

    public void setIndex(int i) {
        m132686a(this.f108398h, this.f108407q);
        m132686a(i, this.f108406p);
        if (!(this.f108398h == i || this.f108400j == null)) {
            this.f108400j.mo102409a(this.f108398h, i);
        }
        StringBuilder sb = new StringBuilder("withoutAnim the set index is ");
        sb.append(i);
        sb.append(" mCurIndex:");
        sb.append(this.f108398h);
        C42880h.m136156a(sb.toString());
        this.f108398h = i;
        if (!this.f108393c.isEmpty() && i >= 0 && i < this.f108393c.size()) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f108395e.getScrollX(), ((Integer) this.f108393c.get(i)).intValue() - ((Integer) this.f108393c.get(0)).intValue()});
            ofInt.setDuration(150);
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabHost.this.f108395e.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
            ofInt.start();
        }
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m132685a(float f, float f2) {
        if (this.f108395e != null) {
            int childCount = this.f108395e.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = this.f108395e.getChildAt(i);
                if (f >= ((float) (childAt.getRight() - this.f108395e.getScrollX())) || f <= ((float) (childAt.getLeft() - this.f108395e.getScrollX())) || f2 >= ((float) childAt.getBottom()) || f2 <= ((float) childAt.getTop())) {
                    i++;
                } else {
                    this.f108396f = i;
                    this.f108397g = childAt;
                    return;
                }
            }
            this.f108397g = this.f108395e;
        }
    }

    /* renamed from: a */
    private void m132686a(int i, int i2) {
        if (this.f108395e != null) {
            View childAt = this.f108395e.getChildAt(i);
            if (childAt != null) {
                int i3 = 0;
                if (childAt instanceof TabItemView) {
                    TabItemView tabItemView = (TabItemView) childAt;
                    tabItemView.setTextColor(i2);
                    int alpha = Color.alpha(i2);
                    Drawable[] compoundDrawables = tabItemView.getTextView().getCompoundDrawables();
                    int length = compoundDrawables.length;
                    while (i3 < length) {
                        Drawable drawable = compoundDrawables[i3];
                        if (drawable != null) {
                            drawable.setAlpha(alpha);
                            i3++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(i2);
                    int alpha2 = Color.alpha(i2);
                    Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                    int length2 = compoundDrawables2.length;
                    while (i3 < length2) {
                        Drawable drawable2 = compoundDrawables2[i3];
                        if (drawable2 != null) {
                            drawable2.setAlpha(alpha2);
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f108402l = motionEvent.getX();
            this.f108404n = motionEvent.getY();
            m132685a(motionEvent.getX(), motionEvent.getY());
        }
        switch (motionEvent.getAction()) {
            case 1:
                this.f108403m = motionEvent.getX();
                this.f108405o = motionEvent.getY();
                if (Math.abs(this.f108403m - this.f108402l) >= ((float) (this.f108408r * 2)) && Math.abs(this.f108405o - this.f108404n) <= ((float) (C23482j.m77095a(getContext()) / 4))) {
                    m132689c();
                    break;
                } else {
                    setIndex(this.f108398h);
                    break;
                }
                break;
            case 2:
                float x = motionEvent.getX() - this.f108402l;
                float y = motionEvent.getY() - this.f108404n;
                if (Math.abs(x) > ((float) this.f108408r) && Math.abs(x) > Math.abs(y)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        return this.f108399i.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m132688b(int i, int i2) {
        int childCount = this.f108395e.getChildCount();
        this.f108393c.clear();
        int i3 = i;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f108395e.getChildAt(i4);
            if (childAt != null) {
                if (i4 == 0) {
                    i3 = (i3 + ((i2 - i) / 2)) - (childAt.getWidth() / 2);
                }
                if (childAt instanceof TabItemView) {
                    TabItemView tabItemView = (TabItemView) childAt;
                    this.f108393c.add(Integer.valueOf(tabItemView.getTextView().getPaddingLeft() + i3 + (((tabItemView.getTextView().getWidth() - tabItemView.getTextView().getPaddingLeft()) - tabItemView.getTextView().getPaddingRight()) / 2)));
                } else if (childAt instanceof TextView) {
                    this.f108393c.add(Integer.valueOf((childAt.getWidth() / 2) + i3));
                }
                childAt.layout(i3, childAt.getTop(), childAt.getWidth() + i3, childAt.getBottom());
                i3 += childAt.getWidth();
            }
        }
        StringBuilder sb = new StringBuilder("the xPivots size is ");
        sb.append(childCount);
        sb.append(" mCurIndex:");
        sb.append(this.f108398h);
        C42880h.m136156a(sb.toString());
        int a = C23478e.m77084a(this.f108398h, 0, childCount - 1);
        try {
            this.f108395e.scrollTo(((Integer) this.f108393c.get(a)).intValue() - ((Integer) this.f108393c.get(0)).intValue(), 0);
            if (this.f108398h > a) {
                StringBuilder sb2 = new StringBuilder("mCurIndex is dangerous， modify it !!! safeIndex: ");
                sb2.append(a);
                sb2.append(" mCurIndex:");
                sb2.append(this.f108398h);
                C42880h.m136156a(sb2.toString());
                this.f108398h = a;
            }
        } catch (IndexOutOfBoundsException e) {
            StringBuilder sb3 = new StringBuilder();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = this.f108395e.getChildAt(i5);
                sb3.append("index ");
                sb3.append(i5);
                sb3.append(' ');
                sb3.append(childAt2.getClass());
                sb3.append(' ');
                sb3.append(childAt2.getTag());
                sb3.append(10);
            }
            StringBuilder sb4 = new StringBuilder("Inconsistency detected. children are ");
            sb4.append(sb3);
            throw new IllegalStateException(sb4.toString(), e);
        }
    }

    public TabHost(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108392b = true;
        this.f108406p = C0683b.m2912c(getContext(), R.color.zg);
        this.f108407q = C0683b.m2912c(getContext(), R.color.yr);
        m132684a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m132688b(i, i3);
    }
}
