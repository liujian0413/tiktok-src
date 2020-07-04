package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.views.MentionTextView */
public class MentionTextView extends ClickSpanWorkaroundTextView {

    /* renamed from: b */
    public boolean f112265b;

    /* renamed from: c */
    public int f112266c = -1;

    /* renamed from: d */
    private C43347e f112267d;

    /* renamed from: e */
    private int f112268e;

    /* renamed from: f */
    private float f112269f;

    /* renamed from: g */
    private int f112270g;

    /* renamed from: h */
    private SpannableString f112271h;

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$a */
    class C43343a extends C43345c {

        /* renamed from: d */
        private C43347e f112273d;

        /* renamed from: e */
        private TextExtraStruct f112274e;

        /* renamed from: f */
        private int f112275f;

        public final void onClick(View view) {
            if (!C27326a.m89578a(view) && this.f112273d != null) {
                this.f112273d.mo62358a(view, this.f112274e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = MentionTextView.this.f112266c;
            if (i == -1) {
                i = this.f112275f;
            }
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f112281b) {
                i = MentionTextView.m137590a(i, 0.75f);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f112265b);
        }

        C43343a(C43347e eVar, TextExtraStruct textExtraStruct, int i) {
            TextPaint textPaint;
            int i2;
            super();
            this.f112273d = eVar;
            this.f112274e = textExtraStruct;
            this.f112275f = i;
            if (MentionTextView.this.f112266c != -1) {
                textPaint = MentionTextView.this.getPaint();
                i2 = MentionTextView.this.f112266c;
            } else {
                textPaint = MentionTextView.this.getPaint();
                if (this.f112275f == 0) {
                    i2 = MentionTextView.this.getPaint().linkColor;
                } else {
                    i2 = this.f112275f;
                }
            }
            textPaint.setColor(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$b */
    class C43344b extends C43345c {

        /* renamed from: d */
        private C43347e f112277d;

        /* renamed from: e */
        private TextExtraStruct f112278e;

        /* renamed from: f */
        private int f112279f;

        /* renamed from: g */
        private boolean f112280g;

        public final void onClick(View view) {
            if (!C27326a.m89578a(view) && this.f112277d != null) {
                this.f112277d.mo62358a(view, this.f112278e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = this.f112279f;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f112281b) {
                i = MentionTextView.m137590a(i, 0.75f);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f112265b);
            textPaint.setFakeBoldText(this.f112280g);
        }

        C43344b(C43347e eVar, TextExtraStruct textExtraStruct, int i) {
            super();
            this.f112277d = eVar;
            this.f112278e = textExtraStruct;
            this.f112279f = i;
            this.f112280g = textExtraStruct.isBoldText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$c */
    public abstract class C43345c extends ClickableSpan {

        /* renamed from: b */
        public boolean f112281b;

        public C43345c() {
        }

        /* renamed from: a */
        public final void mo105198a(boolean z) {
            this.f112281b = z;
            MentionTextView.this.invalidate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$d */
    public interface C43346d {
        /* renamed from: a */
        boolean mo102311a(TextExtraStruct textExtraStruct);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$e */
    public interface C43347e {
        /* renamed from: a */
        void mo62358a(View view, TextExtraStruct textExtraStruct);
    }

    public int getSpanColor() {
        return this.f112270g;
    }

    public float getSpanSize() {
        return this.f112269f;
    }

    public int getSpanStyle() {
        return this.f112268e;
    }

    /* renamed from: a */
    private void m137591a() {
        this.f112265b = false;
        this.f112268e = 0;
        this.f112269f = getTextSize();
        this.f112270g = getCurrentTextColor();
        setHighlightColor(0);
    }

    public void setOnSpanClickListener(C43347e eVar) {
        this.f112267d = eVar;
    }

    public void setShowUnderline(boolean z) {
        this.f112265b = z;
    }

    public void setSpanColor(int i) {
        this.f112266c = i;
    }

    public void setSpanSize(float f) {
        this.f112269f = f;
    }

    public void setSpanStyle(int i) {
        this.f112268e = i;
    }

    public MentionTextView(Context context) {
        super(context);
        m137591a();
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    public MentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m137591a();
    }

    /* renamed from: a */
    public static int m137590a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.75f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public final void mo105184a(List<TextExtraStruct> list, C43346d dVar) {
        int i;
        int i2;
        if (list != null && !list.isEmpty()) {
            SpannableString spannableString = new SpannableString(getText());
            if (!TextUtils.isEmpty(spannableString.toString())) {
                int length = spannableString.length();
                for (TextExtraStruct textExtraStruct : list) {
                    if (!dVar.mo102311a(textExtraStruct) && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                        if (textExtraStruct.getStart() < 0) {
                            i = 0;
                        } else {
                            i = textExtraStruct.getStart();
                        }
                        if (textExtraStruct.getEnd() > length) {
                            i2 = length;
                        } else {
                            i2 = textExtraStruct.getEnd();
                        }
                        if (i2 > i) {
                            if (textExtraStruct.getType() == 65281) {
                                spannableString.setSpan(textExtraStruct.getCustomSpan(), i, i2, 33);
                            } else if (textExtraStruct.getType() == 65282) {
                                spannableString.setSpan(new C43344b(this.f112267d, textExtraStruct, textExtraStruct.getColor()), i, i2, 33);
                            } else {
                                if (textExtraStruct.getType() == 2) {
                                    this.f112270g = getResources().getColor(R.color.a5d);
                                } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1) {
                                    this.f112270g = getResources().getColor(R.color.a71);
                                } else if (textExtraStruct.getType() == 3) {
                                    this.f112270g = getResources().getColor(R.color.a5d);
                                }
                                spannableString.setSpan(new C43343a(this.f112267d, textExtraStruct, this.f112270g), i, i2, 33);
                                if (textExtraStruct.getType() == 3) {
                                    spannableString.setSpan(new StyleSpan(1), i, i2, 33);
                                } else {
                                    spannableString.setSpan(new StyleSpan(this.f112268e), i, i2, 33);
                                }
                                spannableString.setSpan(new AbsoluteSizeSpan((int) this.f112269f), i, i2, 33);
                            }
                        }
                    }
                }
                this.f112271h = spannableString;
                setText(spannableString);
            }
        }
    }

    public MentionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m137591a();
    }

    /* renamed from: a */
    public final void mo105183a(int i, int i2, Object obj) {
        if (this.f112271h != null) {
            int length = this.f112271h.length();
            if (i <= length && i2 <= length && i <= i2) {
                this.f112271h.setSpan(obj, i, i2, 33);
                setText(this.f112271h);
            }
        }
    }
}
