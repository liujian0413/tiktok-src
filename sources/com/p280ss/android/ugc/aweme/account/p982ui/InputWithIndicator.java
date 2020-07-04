package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p022v4.content.C0683b;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.account.C21173f;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.account.p951l.C21238b;
import com.p280ss.android.ugc.aweme.account.util.C22333l;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator */
public final class InputWithIndicator extends LinearLayout {

    /* renamed from: c */
    public static final C22259a f59439c = new C22259a(null);

    /* renamed from: a */
    public int f59440a;

    /* renamed from: b */
    public OnClickListener f59441b;

    /* renamed from: d */
    private boolean f59442d;

    /* renamed from: e */
    private ClearButton f59443e;

    /* renamed from: f */
    private ImageView f59444f;

    /* renamed from: g */
    private LoadingCircleView f59445g;

    /* renamed from: h */
    private int f59446h;

    /* renamed from: i */
    private HashMap f59447i;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$a */
    public static final class C22259a {
        private C22259a() {
        }

        public /* synthetic */ C22259a(C7571f fVar) {
            this();
        }
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final View mo58666b(int i) {
        if (this.f59447i == null) {
            this.f59447i = new HashMap();
        }
        View view = (View) this.f59447i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59447i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean getEnableAutoHide() {
        return this.f59442d;
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
        return dmtEditText;
    }

    private final ClearButton getClearButton() {
        if (this.f59443e == null) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            ClearButton clearButton = new ClearButton(context, null, 0, 6, null);
            this.f59443e = clearButton;
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ClearButton clearButton2 = this.f59443e;
            if (clearButton2 == null) {
                C7573i.m23580a();
            }
            clearButton2.setLayoutParams(layoutParams);
        }
        ClearButton clearButton3 = this.f59443e;
        if (clearButton3 == null) {
            C7573i.m23580a();
        }
        return clearButton3;
    }

    private final ImageView getImageView() {
        if (this.f59444f == null) {
            this.f59444f = new ImageView(getContext());
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ImageView imageView = this.f59444f;
            if (imageView == null) {
                C7573i.m23580a();
            }
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.f59444f;
        if (imageView2 == null) {
            C7573i.m23580a();
        }
        return imageView2;
    }

    public final String getText() {
        DmtEditText dmtEditText = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
        Editable text = dmtEditText.getText();
        if (text != null) {
            String obj = text.toString();
            if (obj != null) {
                if (obj != null) {
                    String obj2 = C7634n.m23762b(obj).toString();
                    if (obj2 != null) {
                        return obj2;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private final void m73772a() {
        if (this.f59446h <= 0) {
            this.f59446h = C23486n.m77122a(16.0d);
        }
        C22333l.m73936a((FrameLayout) mo58666b(R.id.b1u), this.f59446h, this.f59446h);
        LoadingCircleView loadingCircleView = this.f59445g;
        if (loadingCircleView != null) {
            loadingCircleView.mo58684b();
        }
        switch (this.f59440a) {
            case 1:
                m73773a((View) getClearButton());
                return;
            case 2:
                m73773a((View) getLoadingView());
                return;
            case 3:
                m73774c(R.drawable.a50);
                break;
        }
    }

    private final LoadingCircleView getLoadingView() {
        if (this.f59445g == null) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            LoadingCircleView loadingCircleView = new LoadingCircleView(context, null, 0, 6, null);
            this.f59445g = loadingCircleView;
            LoadingCircleView loadingCircleView2 = this.f59445g;
            if (loadingCircleView2 == null) {
                C7573i.m23580a();
            }
            loadingCircleView2.setLoadingColor(C0683b.m2912c(getContext(), R.color.a_j));
            LoadingCircleView loadingCircleView3 = this.f59445g;
            if (loadingCircleView3 == null) {
                C7573i.m23580a();
            }
            loadingCircleView3.setLineWidth((float) C23486n.m77122a(3.0d));
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            LoadingCircleView loadingCircleView4 = this.f59445g;
            if (loadingCircleView4 == null) {
                C7573i.m23580a();
            }
            loadingCircleView4.setLayoutParams(layoutParams);
        }
        LoadingCircleView loadingCircleView5 = this.f59445g;
        if (loadingCircleView5 == null) {
            C7573i.m23580a();
        }
        loadingCircleView5.mo58683a();
        LoadingCircleView loadingCircleView6 = this.f59445g;
        if (loadingCircleView6 == null) {
            C7573i.m23580a();
        }
        return loadingCircleView6;
    }

    public final void setEnableAutoHide(boolean z) {
        this.f59442d = z;
    }

    public final void setIndicatorSize(int i) {
        this.f59446h = i;
    }

    public final void setIndicatorClickListener(OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "listener");
        this.f59441b = onClickListener;
    }

    /* renamed from: c */
    private void m73774c(int i) {
        ImageView imageView = getImageView();
        imageView.setImageResource(R.drawable.a50);
        m73773a((View) imageView);
    }

    /* renamed from: a */
    public final void mo58665a(int i) {
        if (i != this.f59440a) {
            this.f59440a = i;
            m73772a();
        }
    }

    public final void setContainerPadding(int i) {
        ((FrameLayout) mo58666b(R.id.b1u)).setPadding(i, i, i, i);
    }

    /* renamed from: a */
    private final void m73773a(View view) {
        ((FrameLayout) mo58666b(R.id.b1u)).removeAllViews();
        ((FrameLayout) mo58666b(R.id.b1u)).addView(view);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        C7573i.m23587b(textWatcher, "watcher");
        ((DmtEditText) mo58666b(R.id.b1t)).addTextChangedListener(textWatcher);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        FrameLayout frameLayout = (FrameLayout) mo58666b(R.id.b1s);
        C7573i.m23582a((Object) frameLayout, "inputWithIndicatorClickContainer");
        frameLayout.setVisibility(i);
        FrameLayout frameLayout2 = (FrameLayout) mo58666b(R.id.b1u);
        C7573i.m23582a((Object) frameLayout2, "inputWithIndicatorViewContainer");
        frameLayout2.setVisibility(i);
    }

    public final void setText(CharSequence charSequence) {
        boolean z;
        C7573i.m23587b(charSequence, "text");
        ((DmtEditText) mo58666b(R.id.b1t)).setText(charSequence);
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((DmtEditText) mo58666b(R.id.b1t)).setSelection(charSequence.length());
        }
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59442d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InputWithIndicator);
        this.f59440a = obtainStyledAttributes.getInt(3, 0);
        this.f59446h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        String string = obtainStyledAttributes.getString(6);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 1);
        float f = (float) obtainStyledAttributes.getInt(8, 15);
        int color = obtainStyledAttributes.getColor(5, C0683b.m2912c(context, R.color.l_));
        View.inflate(context, R.layout.si, this);
        int resourceId = obtainStyledAttributes.getResourceId(7, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) mo58666b(R.id.b1t);
            C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (i3 > 0) {
            C21238b.m71493a((DmtEditText) mo58666b(R.id.b1t), i3);
        }
        DmtEditText dmtEditText2 = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText2, "inputWithIndicatorEditText");
        dmtEditText2.setMaxLines(i2);
        DmtEditText dmtEditText3 = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText3, "inputWithIndicatorEditText");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText4, "inputWithIndicatorEditText");
        dmtEditText4.setTextSize(f);
        DmtEditText dmtEditText5 = (DmtEditText) mo58666b(R.id.b1t);
        C7573i.m23582a((Object) dmtEditText5, "inputWithIndicatorEditText");
        dmtEditText5.setInputType(i4);
        ((DmtEditText) mo58666b(R.id.b1t)).setTextColor(color);
        ((DmtEditText) mo58666b(R.id.b1t)).addTextChangedListener(new C21173f(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59448a;

            {
                this.f59448a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (this.f59448a.getEnableAutoHide()) {
                    InputWithIndicator inputWithIndicator = this.f59448a;
                    DmtEditText dmtEditText = (DmtEditText) this.f59448a.mo58666b(R.id.b1t);
                    C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
                    Editable text = dmtEditText.getText();
                    boolean z = false;
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        DmtEditText dmtEditText2 = (DmtEditText) this.f59448a.mo58666b(R.id.b1t);
                        C7573i.m23582a((Object) dmtEditText2, "inputWithIndicatorEditText");
                        if (dmtEditText2.isFocused()) {
                            z = true;
                        }
                    }
                    inputWithIndicator.setIndicatorVisible(z);
                }
            }
        });
        ((DmtEditText) mo58666b(R.id.b1t)).setOnFocusChangeListener(new OnFocusChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59449a;

            {
                this.f59449a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                int i;
                InputWithIndicator inputWithIndicator = this.f59449a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) this.f59449a.mo58666b(R.id.b1t);
                    C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
                    Editable text = dmtEditText.getText();
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        ((FrameLayout) mo58666b(R.id.b1s)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59450a;

            {
                this.f59450a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f59450a.f59440a == 1) {
                    DmtEditText dmtEditText = (DmtEditText) this.f59450a.mo58666b(R.id.b1t);
                    C7573i.m23582a((Object) dmtEditText, "inputWithIndicatorEditText");
                    dmtEditText.setText(null);
                }
                OnClickListener onClickListener = this.f59450a.f59441b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        if (this.f59440a == 1 && this.f59442d) {
            FrameLayout frameLayout = (FrameLayout) mo58666b(R.id.b1u);
            C7573i.m23582a((Object) frameLayout, "inputWithIndicatorViewContainer");
            frameLayout.setVisibility(8);
        }
        m73772a();
    }

    public /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
