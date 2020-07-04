package com.p280ss.android.ugc.aweme.tools.music.lrc;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.tools.music.R$styleable;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42450a.C42451a;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.LrcView */
public final class LrcView extends HorizontalScrollView {

    /* renamed from: a */
    private float f110341a;

    /* renamed from: b */
    private float f110342b;

    /* renamed from: c */
    private float f110343c;

    /* renamed from: d */
    private float f110344d;

    /* renamed from: e */
    private List<C42450a> f110345e;

    /* renamed from: f */
    private DmtTextView f110346f;

    /* renamed from: g */
    private final AttributeSet f110347g;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.LrcView$a */
    static final class C42449a<T> implements Comparator<C42450a> {

        /* renamed from: a */
        public static final C42449a f110348a = new C42449a();

        C42449a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m134908a((C42450a) obj, (C42450a) obj2);
        }

        /* renamed from: a */
        private static int m134908a(C42450a aVar, C42450a aVar2) {
            float f = aVar.f110350a - aVar2.f110350a;
            if (f > 0.0f) {
                return 1;
            }
            if (f < 0.0f) {
                return -1;
            }
            return 0;
        }
    }

    public LrcView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LrcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    private final void m134906b() {
        m134907c();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "ev");
        return false;
    }

    public final AttributeSet getAttrs() {
        return this.f110347g;
    }

    /* renamed from: a */
    private final void m134905a() {
        this.f110346f = new DmtTextView(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f110347g, R$styleable.LrcView);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 45);
        DmtTextView dmtTextView = this.f110346f;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        dmtTextView.setTextSize(0, (float) dimensionPixelOffset);
        int color = obtainStyledAttributes.getColor(1, -1);
        DmtTextView dmtTextView2 = this.f110346f;
        if (dmtTextView2 == null) {
            C7573i.m23580a();
        }
        dmtTextView2.setTextColor(color);
        obtainStyledAttributes.recycle();
        addView(this.f110346f, new LayoutParams(-2, -2));
    }

    /* renamed from: c */
    private final void m134907c() {
        boolean z;
        float f;
        Collection collection = this.f110345e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = 0;
            while (true) {
                List<C42450a> list = this.f110345e;
                if (list == null) {
                    C7573i.m23580a();
                }
                if (i >= list.size() - 1) {
                    break;
                }
                float f2 = this.f110343c;
                List<C42450a> list2 = this.f110345e;
                if (list2 == null) {
                    C7573i.m23580a();
                }
                int i2 = i + 1;
                if (f2 < ((C42450a) list2.get(i2)).f110350a) {
                    break;
                }
                i = i2;
            }
            DmtTextView dmtTextView = this.f110346f;
            if (dmtTextView == null) {
                C7573i.m23580a();
            }
            List<C42450a> list3 = this.f110345e;
            if (list3 == null) {
                C7573i.m23580a();
            }
            dmtTextView.setText(((C42450a) list3.get(i)).f110351b);
            List<C42450a> list4 = this.f110345e;
            if (list4 == null) {
                C7573i.m23580a();
            }
            float f3 = ((C42450a) list4.get(i)).f110350a;
            List<C42450a> list5 = this.f110345e;
            if (list5 == null) {
                C7573i.m23580a();
            }
            if (i == list5.size() - 1) {
                f = this.f110341a;
            } else {
                List<C42450a> list6 = this.f110345e;
                if (list6 == null) {
                    C7573i.m23580a();
                }
                f = ((C42450a) list6.get(i + 1)).f110350a;
            }
            float f4 = this.f110343c - f3;
            float f5 = f - f3;
            float f6 = 0.0f;
            if (f4 >= 0.0f && f5 >= f4 && f5 > 0.0f) {
                List<C42450a> list7 = this.f110345e;
                if (list7 == null) {
                    C7573i.m23580a();
                }
                int measuredWidth = (int) (((C42450a) list7.get(i)).f110352c - ((float) getMeasuredWidth()));
                if (measuredWidth > 0) {
                    f6 = (((float) measuredWidth) * f4) / f5;
                }
                smoothScrollTo((int) f6, 0);
            }
        }
    }

    public final void setDuration(float f) {
        this.f110341a = f;
    }

    public final void setPreviewStartTime(float f) {
        this.f110344d = f;
    }

    public final void setCurrentTime(int i) {
        if (i >= 0) {
            this.f110343c = this.f110344d + this.f110342b + (((float) i) / 1000.0f);
            m134907c();
        }
    }

    public final void setStartTime(int i) {
        this.f110342b = ((float) i) / 1000.0f;
        if (!C6307b.m19566a((Collection<T>) this.f110345e)) {
            List<C42450a> list = this.f110345e;
            if (list == null) {
                C7573i.m23580a();
            }
            if (list.size() == 1) {
                setVisibility(8);
            }
        }
    }

    public final void setLrcInfos(List<C42450a> list) {
        boolean z;
        C7573i.m23587b(list, "lrcInfos");
        this.f110345e = list;
        Collection collection = this.f110345e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            setVisibility(0);
            List<C42450a> list2 = this.f110345e;
            if (list2 == null) {
                C7573i.m23580a();
            }
            C7525m.m23474a(list2, C42449a.f110348a);
            List<C42450a> list3 = this.f110345e;
            DmtTextView dmtTextView = this.f110346f;
            if (dmtTextView == null) {
                C7573i.m23580a();
            }
            TextPaint paint = dmtTextView.getPaint();
            C7573i.m23582a((Object) paint, "mTvwLrc!!.paint");
            this.f110345e = C42451a.m134909a(list3, paint);
            List<C42450a> list4 = this.f110345e;
            if (list4 == null) {
                C7573i.m23580a();
            }
            if (list4.size() == 1) {
                if (this.f110341a <= 0.0f) {
                    this.f110341a = 70.0f;
                }
                if (this.f110342b != 0.0f) {
                    setVisibility(8);
                    return;
                }
            } else {
                List<C42450a> list5 = this.f110345e;
                if (list5 == null) {
                    C7573i.m23580a();
                }
                float f = ((C42450a) C7525m.m23515h(list5)).f110350a;
                if (f >= this.f110341a) {
                    this.f110341a = f + 20.0f;
                }
            }
            m134906b();
        }
    }

    public LrcView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f110347g = attributeSet;
        m134905a();
    }

    public /* synthetic */ LrcView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
