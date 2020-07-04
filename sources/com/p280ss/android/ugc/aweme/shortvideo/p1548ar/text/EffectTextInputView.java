package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.EffectTextInputView */
public class EffectTextInputView extends FrameLayout {

    /* renamed from: a */
    protected EditText f100044a;

    /* renamed from: b */
    protected View f100045b;

    /* renamed from: c */
    protected View f100046c;

    /* renamed from: d */
    protected View f100047d;

    /* renamed from: e */
    protected InputMethodManager f100048e;

    /* renamed from: f */
    protected C38474a f100049f;

    /* renamed from: g */
    protected String f100050g;

    /* renamed from: h */
    protected int f100051h;

    /* renamed from: i */
    protected String f100052i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.EffectTextInputView$a */
    public interface C38474a {
        /* renamed from: a */
        void mo96434a(String str);

        /* renamed from: b */
        void mo96435b(String str);
    }

    /* renamed from: a */
    public void mo96416a() {
        mo96426b();
    }

    /* renamed from: a */
    public void mo96405a(int i) {
    }

    /* access modifiers changed from: 0000 */
    public int getLayout() {
        return R.layout.a_7;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public void setHintText(String str) {
    }

    public void dismiss() {
        setVisibility(8);
    }

    /* renamed from: d */
    public final void mo96429d() {
        this.f100044a.requestFocus();
        setVisibility(0);
    }

    /* renamed from: b */
    public final void mo96426b() {
        if (this.f100044a != null && this.f100048e != null) {
            this.f100048e.hideSoftInputFromWindow(this.f100044a.getWindowToken(), 0);
        }
    }

    /* renamed from: c */
    public final void mo96428c() {
        if (this.f100044a != null && this.f100048e != null) {
            this.f100044a.requestFocus();
            this.f100048e.showSoftInput(this.f100044a, 0);
        }
    }

    public String getText() {
        if (this.f100044a == null || this.f100044a.getEditableText() == null) {
            return null;
        }
        return this.f100044a.getEditableText().toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo96427b(View view) {
        mo96416a();
    }

    public void setEffectTextChangeListener(C38474a aVar) {
        this.f100049f = aVar;
    }

    public void setMaxTextCount(int i) {
        this.f100051h = i;
    }

    private EffectTextInputView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96425a(View view) {
        mo96426b();
    }

    public void setText(String str) {
        if (this.f100044a != null && str != null) {
            this.f100044a.setText(str);
            int length = str.length();
            if (length < this.f100044a.getText().length()) {
                this.f100044a.setSelection(length);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96417a(Context context) {
        setVisibility(8);
        this.f100046c = LayoutInflater.from(context).inflate(getLayout(), this);
        this.f100044a = (EditText) findViewById(R.id.act);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.f100044a.addTextChangedListener(textWatcher);
        }
        this.f100045b = findViewById(R.id.ddl);
        this.f100045b.setOnClickListener(new C38487k(this));
        this.f100047d = findViewById(R.id.dke);
        setOnClickListener(new C38488l(this));
    }

    public EffectTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo96417a(context);
        this.f100048e = (InputMethodManager) context.getSystemService("input_method");
        this.f100050g = context.getResources().getString(R.string.dca);
    }

    /* renamed from: a */
    public static EffectTextInputView m122999a(int i, Context context) {
        switch (i) {
            case 0:
                return new ARTextInputView(context);
            case 1:
                return new BubbleTextInputView(context);
            default:
                return new EffectTextInputView(context);
        }
    }
}
