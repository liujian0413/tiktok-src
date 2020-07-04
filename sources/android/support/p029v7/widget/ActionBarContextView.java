package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.MenuBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: g */
    public boolean f4464g;

    /* renamed from: h */
    private CharSequence f4465h;

    /* renamed from: i */
    private CharSequence f4466i;

    /* renamed from: j */
    private View f4467j;

    /* renamed from: k */
    private View f4468k;

    /* renamed from: l */
    private LinearLayout f4469l;

    /* renamed from: m */
    private TextView f4470m;

    /* renamed from: n */
    private TextView f4471n;

    /* renamed from: o */
    private int f4472o;

    /* renamed from: p */
    private int f4473p;

    /* renamed from: q */
    private int f4474q;

    public CharSequence getSubtitle() {
        return this.f4466i;
    }

    public CharSequence getTitle() {
        return this.f4465h;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    /* renamed from: a */
    public final boolean mo4968a() {
        if (this.f4446d != null) {
            return this.f4446d.mo5058e();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo4996b() {
        if (this.f4467j == null) {
            mo4997c();
        }
    }

    /* renamed from: c */
    public final void mo4997c() {
        removeAllViews();
        this.f4468k = null;
        this.f4445c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4446d != null) {
            this.f4446d.mo5059f();
            this.f4446d.mo5061h();
        }
    }

    /* renamed from: d */
    private void m5455d() {
        int i;
        if (this.f4469l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a, this);
            this.f4469l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4470m = (TextView) this.f4469l.findViewById(R.id.a_);
            this.f4471n = (TextView) this.f4469l.findViewById(R.id.a9);
            if (this.f4472o != 0) {
                this.f4470m.setTextAppearance(getContext(), this.f4472o);
            }
            if (this.f4473p != 0) {
                this.f4471n.setTextAppearance(getContext(), this.f4473p);
            }
        }
        this.f4470m.setText(this.f4465h);
        this.f4471n.setText(this.f4466i);
        boolean z = !TextUtils.isEmpty(this.f4465h);
        boolean z2 = !TextUtils.isEmpty(this.f4466i);
        TextView textView = this.f4471n;
        int i2 = 8;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f4469l;
        if (z || z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (this.f4469l.getParent() == null) {
            addView(this.f4469l);
        }
    }

    public void setContentHeight(int i) {
        this.f4447e = i;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4466i = charSequence;
        m5455d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4465h = charSequence;
        m5455d();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f4464g) {
            requestLayout();
        }
        this.f4464g = z;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f4465h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setCustomView(View view) {
        if (this.f4468k != null) {
            removeView(this.f4468k);
        }
        this.f4468k = view;
        if (!(view == null || this.f4469l == null)) {
            removeView(this.f4469l);
            this.f4469l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void mo4995a(final C1153b bVar) {
        if (this.f4467j == null) {
            this.f4467j = LayoutInflater.from(getContext()).inflate(this.f4474q, this, false);
            addView(this.f4467j);
        } else if (this.f4467j.getParent() == null) {
            addView(this.f4467j);
        }
        this.f4467j.findViewById(R.id.am).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                bVar.mo4402c();
            }
        });
        MenuBuilder menuBuilder = (MenuBuilder) bVar.mo4399b();
        if (this.f4446d != null) {
            this.f4446d.mo5060g();
        }
        this.f4446d = new ActionMenuPresenter(getContext());
        this.f4446d.mo5056c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        menuBuilder.mo4705a((C1188i) this.f4446d, this.f4444b);
        this.f4445c = (ActionMenuView) this.f4446d.mo4669a((ViewGroup) this);
        C0991u.m4185a((View) this.f4445c, (Drawable) null);
        addView(this.f4445c, layoutParams);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0998y mo4967a(int i, long j) {
        return super.mo4967a(i, j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            if (this.f4447e > 0) {
                i3 = this.f4447e;
            } else {
                i3 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i3 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            if (this.f4467j != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f4467j.getLayoutParams();
                paddingLeft = m5443a(this.f4467j, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f4445c != null && this.f4445c.getParent() == this) {
                paddingLeft = m5443a(this.f4445c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f4469l != null && this.f4468k == null) {
                if (this.f4464g) {
                    this.f4469l.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f4469l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout = this.f4469l;
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout.setVisibility(i5);
                } else {
                    paddingLeft = m5443a(this.f4469l, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f4468k != null) {
                LayoutParams layoutParams = this.f4468k.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i7 = Math.min(layoutParams.height, i7);
                }
                this.f4468k.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i4), MeasureSpec.makeMeasureSpec(i7, i6));
            }
            if (this.f4447e <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i8);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1365av a = C1365av.m6744a(context, attributeSet, R$styleable.ActionMode, i, 0);
        C0991u.m4185a((View) this, a.mo6392a(0));
        this.f4472o = a.mo6405g(5, 0);
        this.f4473p = a.mo6405g(4, 0);
        this.f4447e = a.mo6403f(3, 0);
        this.f4474q = a.mo6405g(2, R.layout.f);
        a.mo6393a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = C1385bc.m6839a(this);
        if (a) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f4467j == null || this.f4467j.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f4467j.getLayoutParams();
            if (a) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int a2 = m5442a(i5, i7, a);
            i5 = m5442a(a2 + m5444a(this.f4467j, a2, paddingTop, paddingTop2, a), i8, a);
        }
        if (!(this.f4469l == null || this.f4468k != null || this.f4469l.getVisibility() == 8)) {
            i5 += m5444a(this.f4469l, i5, paddingTop, paddingTop2, a);
        }
        if (this.f4468k != null) {
            m5444a(this.f4468k, i5, paddingTop, paddingTop2, a);
        }
        if (a) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        if (this.f4445c != null) {
            m5444a(this.f4445c, i6, paddingTop, paddingTop2, !a);
        }
    }
}
