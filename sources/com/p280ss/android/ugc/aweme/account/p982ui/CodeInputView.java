package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Rect;
import android.support.p022v4.content.C0683b;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.account.p951l.C21238b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView */
public final class CodeInputView extends DmtEditText implements TextWatcher {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59411a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CodeInputView.class), "linePaint", "getLinePaint()Landroid/graphics/Paint;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CodeInputView.class), "cursorPaint", "getCursorPaint()Landroid/graphics/Paint;"))};

    /* renamed from: c */
    public static final C22249b f59412c = new C22249b(null);

    /* renamed from: b */
    public OnClickListener f59413b;

    /* renamed from: d */
    private boolean f59414d;

    /* renamed from: e */
    private boolean f59415e;

    /* renamed from: f */
    private int f59416f;

    /* renamed from: g */
    private float f59417g;

    /* renamed from: h */
    private float f59418h;

    /* renamed from: i */
    private float f59419i;

    /* renamed from: j */
    private Integer f59420j;

    /* renamed from: k */
    private int f59421k;

    /* renamed from: l */
    private int f59422l;

    /* renamed from: m */
    private int f59423m;

    /* renamed from: n */
    private int f59424n;

    /* renamed from: o */
    private int f59425o;

    /* renamed from: p */
    private int f59426p;

    /* renamed from: q */
    private int f59427q;

    /* renamed from: r */
    private int f59428r;

    /* renamed from: s */
    private int f59429s;

    /* renamed from: t */
    private final C7541d f59430t;

    /* renamed from: u */
    private final C7541d f59431u;

    /* renamed from: v */
    private Rect f59432v;

    /* renamed from: w */
    private C22248a f59433w;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$a */
    public interface C22248a {
        /* renamed from: a */
        void mo57821a(String str);

        /* renamed from: b */
        void mo57823b(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$b */
    public static final class C22249b {
        private C22249b() {
        }

        public /* synthetic */ C22249b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$c */
    static final class C22250c extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        public static final C22250c f59434a = new C22250c();

        C22250c() {
            super(0);
        }

        /* renamed from: a */
        private static Paint m73767a() {
            return new Paint();
        }

        public final /* synthetic */ Object invoke() {
            return m73767a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$d */
    public static final class C22251d implements Callback {
        C22251d() {
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$e */
    static final class C22252e extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        public static final C22252e f59435a = new C22252e();

        C22252e() {
            super(0);
        }

        /* renamed from: a */
        private static Paint m73768a() {
            return new Paint();
        }

        public final /* synthetic */ Object invoke() {
            return m73768a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$f */
    static final class C22253f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CodeInputView f59436a;

        C22253f(CodeInputView codeInputView) {
            this.f59436a = codeInputView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            CodeInputView codeInputView = this.f59436a;
            Editable text = this.f59436a.getText();
            if (text == null) {
                C7573i.m23580a();
            }
            codeInputView.setSelection(text.length());
            OnClickListener onClickListener = this.f59436a.f59413b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public CodeInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getCursorPaint() {
        return (Paint) this.f59431u.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.f59430t.getValue();
    }

    public final C22248a getCallback() {
        return this.f59433w;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final void mo58644a() {
        super.setOnClickListener(new C22253f(this));
    }

    /* renamed from: b */
    public final void mo58646b() {
        super.setCustomSelectionActionModeCallback(new C22251d());
    }

    /* renamed from: c */
    public final void mo58648c() {
        getLinePaint().setColor(this.f59424n);
        invalidate();
    }

    /* renamed from: d */
    public final void mo58649d() {
        getLinePaint().setColor(this.f59422l);
        invalidate();
    }

    public final void setCallback(C22248a aVar) {
        this.f59433w = aVar;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f59413b = onClickListener;
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.f59414d = true;
        setText(charSequence);
        this.f59414d = false;
    }

    public final void setInputLength(int i) {
        if (i > 0) {
            this.f59428r = 0;
            this.f59427q = i;
            C21238b.m71493a(this, i);
            invalidate();
        }
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        if (this.f59433w != null) {
            boolean z = false;
            if (editable != null) {
                i = editable.length();
            } else {
                i = 0;
            }
            if (this.f59416f > 0 && i >= 0 && this.f59416f > i) {
                C22248a aVar = this.f59433w;
                if (aVar != null) {
                    aVar.mo57823b(String.valueOf(editable));
                }
            }
            if (this.f59415e || this.f59414d) {
                z = true;
            }
            if (z && i > 0 && i == this.f59427q) {
                C22248a aVar2 = this.f59433w;
                if (aVar2 != null) {
                    String valueOf = String.valueOf(editable);
                    if (valueOf != null) {
                        String obj = C7634n.m23762b(valueOf).toString();
                        if (obj != null) {
                            String lowerCase = obj.toLowerCase();
                            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                            aVar2.mo57821a(lowerCase);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r2 = android.support.p022v4.view.C0991u.m4229k(r1)
            int r3 = android.support.p022v4.view.C0991u.m4232l(r1)
            int r1 = android.support.p022v4.view.C0991u.m4220h(r1)
            r8 = 0
            r9 = 1
            if (r1 != r9) goto L_0x0017
            r10 = 1
            goto L_0x0018
        L_0x0017:
            r10 = 0
        L_0x0018:
            int r1 = r0.f59428r
            if (r1 != 0) goto L_0x003a
            int r1 = r18.getWidth()
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r3 = r0.f59426p
            if (r3 >= 0) goto L_0x002d
            int r3 = r0.f59427q
            int r3 = r3 * 2
            int r3 = r3 - r9
            int r1 = r1 / r3
            goto L_0x0038
        L_0x002d:
            int r3 = r0.f59426p
            int r4 = r0.f59427q
            int r4 = r4 - r9
            int r3 = r3 * r4
            int r1 = r1 - r3
            int r3 = r0.f59427q
            int r1 = r1 / r3
        L_0x0038:
            r0.f59428r = r1
        L_0x003a:
            float r1 = r0.f59417g
            r11 = 0
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0074
            android.text.Editable r1 = r18.getText()
            if (r1 == 0) goto L_0x0074
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 != r9) goto L_0x0074
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x005d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005d:
            int r1 = r1.length()
            float[] r3 = new float[r1]
            android.text.TextPaint r4 = r18.getPaint()
            android.text.Editable r5 = r18.getText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.getTextWidths(r5, r8, r1, r3)
            r1 = r3[r8]
            r0.f59417g = r1
        L_0x0074:
            android.graphics.Rect r1 = r0.f59432v
            if (r1 != 0) goto L_0x00ed
            android.text.Editable r1 = r18.getText()
            if (r1 == 0) goto L_0x00ed
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0088
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            if (r1 != r9) goto L_0x00ed
            android.text.Editable r1 = r18.getText()
            java.lang.String r3 = "0"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.f59432v = r3
            android.text.TextPaint r3 = r18.getPaint()
            android.text.Editable r4 = r18.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            android.text.Editable r5 = r18.getText()
            if (r5 != 0) goto L_0x00b2
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b2:
            int r5 = r5.length()
            android.graphics.Rect r6 = r0.f59432v
            r3.getTextBounds(r4, r8, r5, r6)
            android.graphics.Rect r3 = r0.f59432v
            r4 = 0
            if (r3 == 0) goto L_0x00c7
            int r3 = r3.bottom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00c8
        L_0x00c7:
            r3 = r4
        L_0x00c8:
            if (r3 != 0) goto L_0x00cd
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00cd:
            int r3 = r3.intValue()
            android.graphics.Rect r5 = r0.f59432v
            if (r5 == 0) goto L_0x00db
            int r4 = r5.top
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x00db:
            if (r4 != 0) goto L_0x00e0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00e0:
            int r4 = r4.intValue()
            int r3 = r3 - r4
            float r3 = (float) r3
            r0.f59418h = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x00ed:
            if (r10 == 0) goto L_0x00f8
            int r1 = r18.getWidth()
            int r1 = r1 - r2
            int r2 = r0.f59428r
            int r2 = r1 - r2
        L_0x00f8:
            float r1 = (float) r2
            int r2 = r18.getHeight()
            int r3 = r18.getPaddingBottom()
            int r2 = r2 - r3
            float r12 = (float) r2
            int r13 = r0.f59427q
            r15 = r1
            r14 = 0
        L_0x0107:
            if (r14 >= r13) goto L_0x01f1
            if (r19 == 0) goto L_0x011c
            int r1 = r0.f59428r
            float r1 = (float) r1
            float r4 = r15 + r1
            android.graphics.Paint r6 = r18.getLinePaint()
            r1 = r19
            r2 = r15
            r3 = r12
            r5 = r12
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x011c:
            int r1 = r0.f59428r
            int r1 = r1 / 2
            float r1 = (float) r1
            float r16 = r15 + r1
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x012c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x012c:
            int r1 = r1.length()
            r17 = 1073741824(0x40000000, float:2.0)
            if (r1 <= r14) goto L_0x0170
            if (r1 <= r9) goto L_0x014d
            if (r10 == 0) goto L_0x014d
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x0141
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0141:
            java.lang.String r2 = "text!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.C7634n.m23789j(r1)
            goto L_0x0153
        L_0x014d:
            android.text.Editable r1 = r18.getText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0153:
            r2 = r1
            if (r19 == 0) goto L_0x0170
            int r4 = r14 + 1
            float r1 = r0.f59417g
            float r1 = r1 / r17
            float r5 = r16 - r1
            int r1 = r0.f59429s
            float r1 = (float) r1
            float r6 = r12 - r1
            android.text.TextPaint r1 = r18.getPaint()
            r7 = r1
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r1 = r19
            r3 = r14
            r1.drawText(r2, r3, r4, r5, r6, r7)
        L_0x0170:
            int r1 = r0.f59427q
            int r1 = r1 - r9
            if (r14 != r1) goto L_0x0188
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x017e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x017e:
            int r1 = r1.length()
            int r2 = r0.f59427q
            if (r1 != r2) goto L_0x0188
            r1 = 1
            goto L_0x0189
        L_0x0188:
            r1 = 0
        L_0x0189:
            boolean r2 = r18.isFocused()
            if (r2 == 0) goto L_0x01d4
            int r2 = r18.getSelectionStart()
            int r3 = r18.getSelectionEnd()
            if (r2 != r3) goto L_0x01d4
            int r2 = r18.getSelectionStart()
            if (r14 == r2) goto L_0x01a1
            if (r1 == 0) goto L_0x01d4
        L_0x01a1:
            int r2 = r0.f59429s
            float r2 = (float) r2
            float r2 = r12 - r2
            float r3 = r0.f59418h
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r3 * r4
            if (r1 == 0) goto L_0x01bb
            float r1 = r0.f59417g
            float r1 = r1 / r17
            float r4 = r0.f59417g
            r5 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r5
            float r1 = r1 + r4
            goto L_0x01bc
        L_0x01bb:
            r1 = 0
        L_0x01bc:
            float r4 = r0.f59418h
            float r4 = r2 - r4
            float r4 = r4 - r3
            float r5 = r2 + r3
            if (r19 == 0) goto L_0x01d4
            float r6 = r16 + r1
            android.graphics.Paint r7 = r18.getCursorPaint()
            r1 = r19
            r2 = r6
            r3 = r4
            r4 = r6
            r6 = r7
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x01d4:
            if (r10 == 0) goto L_0x01d8
            r1 = -1
            goto L_0x01d9
        L_0x01d8:
            r1 = 1
        L_0x01d9:
            int r2 = r0.f59426p
            if (r2 >= 0) goto L_0x01e4
            int r2 = r0.f59428r
            int r1 = r1 * r2
            int r1 = r1 * 2
            goto L_0x01eb
        L_0x01e4:
            int r2 = r0.f59428r
            int r3 = r0.f59426p
            int r2 = r2 + r3
            int r1 = r1 * r2
        L_0x01eb:
            float r1 = (float) r1
            float r15 = r15 + r1
            int r14 = r14 + 1
            goto L_0x0107
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p982ui.CodeInputView.onDraw(android.graphics.Canvas):void");
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Integer num;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59420j = Integer.valueOf(17170444);
        this.f59430t = C7546e.m23569a(C22252e.f59435a);
        this.f59431u = C7546e.m23569a(C22250c.f59434a);
        setBackgroundResource(0);
        if (attributeSet != null) {
            i2 = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        } else {
            i2 = 4;
        }
        this.f59427q = i2;
        if (attributeSet != null) {
            num = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", 17170444));
        } else {
            num = null;
        }
        this.f59420j = num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CodeInputView);
        this.f59422l = obtainStyledAttributes.getColor(4, -16777216);
        this.f59423m = obtainStyledAttributes.getColor(0, -65536);
        this.f59424n = obtainStyledAttributes.getColor(2, -65536);
        this.f59421k = obtainStyledAttributes.getDimensionPixelSize(1, C23486n.m77122a(2.0d));
        this.f59425o = obtainStyledAttributes.getDimensionPixelSize(5, C23486n.m77122a(1.0d));
        this.f59426p = obtainStyledAttributes.getDimensionPixelSize(3, C23486n.m77122a(10.0d));
        this.f59429s = obtainStyledAttributes.getDimensionPixelSize(6, C23486n.m77122a(5.0d));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        C7573i.m23582a((Object) paint, "paint");
        Integer num2 = this.f59420j;
        if (num2 == null) {
            C7573i.m23580a();
        }
        paint.setColor(C0683b.m2912c(context, num2.intValue()));
        getLinePaint().setColor(this.f59422l);
        getLinePaint().setStrokeWidth((float) this.f59425o);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(this.f59423m);
        getCursorPaint().setStrokeWidth((float) this.f59421k);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Cap.ROUND);
        this.f59419i = getCursorPaint().getStrokeWidth() / 2.0f;
        setCursorVisible(false);
        addTextChangedListener(this);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.f59416f = i4;
        boolean z = true;
        if (i3 > 1) {
            z = false;
        }
        this.f59415e = z;
    }

    public /* synthetic */ CodeInputView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = R.attr.jk;
        }
        this(context, attributeSet, i);
    }
}
