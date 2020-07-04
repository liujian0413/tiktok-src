package com.p280ss.android.ugc.aweme.hotsearch.p1295c;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.helper.C26656d;
import com.p280ss.android.ugc.aweme.hotsearch.p1296d.C30361a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.hotsearch.c.c */
public final class C30357c {
    /* renamed from: a */
    private static ClickableSpan m99187a(final C13365a aVar) {
        return new ClickableSpan() {
            public final void onClick(View view) {
                if (!C27326a.m89578a(view)) {
                    aVar.mo32677i();
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }
        };
    }

    /* renamed from: a */
    private static ClickableSpan m99188a(final String str) {
        return new ClickableSpan() {
            public final void onClick(View view) {
                if (!C27326a.m89578a(view)) {
                    C6907h.m21524a("enter_star_board", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
                    String str = (String) SharePrefCache.inst().getBillboardStarScheme().mo59877d();
                    if (!TextUtils.isEmpty(str)) {
                        C7195s.m22438a().mo18682a(str);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static boolean m99191a(String str, View view) {
        int i;
        if (C43127fh.m136806a(view.getContext())) {
            i = -1;
        } else {
            i = -2;
        }
        return new Bidi(str, i).baseIsLeftToRight();
    }

    /* renamed from: a */
    public static void m99189a(TextView textView, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" T");
        spannableStringBuilder.setSpan(new C30361a(i, "", 4), 0, 2, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public static void m99190a(TextView textView, int i, int i2, String str, C13365a aVar) {
        if (!C6399b.m19944t() && C26656d.m87588b() && i > 0 && i <= 30) {
            String charSequence = textView.getText().toString();
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(" T");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            C30361a aVar2 = new C30361a(i, textView.getContext().getString(R.string.e19), i2);
            if (aVar != null) {
                textView.setOnClickListener(null);
                spannableStringBuilder.setSpan(m99187a(aVar), 0, charSequence.length(), 33);
            }
            int length = charSequence.length() + 1;
            int length2 = charSequence.length() + 2;
            spannableStringBuilder.setSpan(aVar2, length, length2, 33);
            spannableStringBuilder.setSpan(m99188a(str), length, length2, 33);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            float textSize = textView.getTextSize();
            int size = aVar2.getSize(textView.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), textView.getPaint().getFontMetricsInt());
            textView.getPaint().setTextSize(textSize);
            textView.setText(m99184a(spannableStringBuilder, textView.getPaint(), textView.getMaxWidth(), textView.getMaxLines(), 1, size));
            textView.requestLayout();
        }
    }

    /* renamed from: a */
    public static SpannableStringBuilder m99184a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        return m99185a(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    /* renamed from: a */
    private static SpannableStringBuilder m99185a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "... ";
        float measureText = ((float) i) - (textPaint.measureText(str) + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append(str);
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m99186a(SpannableStringBuilder spannableStringBuilder, TextView textView, int i, int i2, int i3, int i4, boolean z, View view, boolean z2) {
        boolean z3;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        boolean z4 = z2;
        while (true) {
            DmtTextView dmtTextView = new DmtTextView(textView.getContext());
            TextPaint paint = textView.getPaint();
            dmtTextView.setTextSize(0, textView.getTextSize());
            dmtTextView.setText(spannableStringBuilder2);
            dmtTextView.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
            Layout layout = dmtTextView.getLayout();
            if (dmtTextView.getLineCount() > i6 && !z4) {
                String str = "... ";
                float measureText = ((float) i5) - (paint.measureText(str) + ((float) i4));
                int lineStart = layout.getLineStart(i6 - 1);
                while (lineStart < spannableStringBuilder2.length() - i7 && 10 != spannableStringBuilder2.charAt(lineStart)) {
                    int i8 = lineStart + 1;
                    measureText -= paint.measureText(spannableStringBuilder2, lineStart, i8);
                    if (measureText <= 0.0f) {
                        break;
                    }
                    lineStart = i8;
                }
                CharSequence subSequence = spannableStringBuilder2.subSequence(spannableStringBuilder2.length() - i7, spannableStringBuilder2.length());
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, lineStart));
                spannableStringBuilder3.append(str);
                spannableStringBuilder3.append(subSequence);
                spannableStringBuilder2 = spannableStringBuilder3;
                z4 = true;
            } else if (!z || spannableStringBuilder2.length() - 1 < i7) {
                return spannableStringBuilder2;
            } else {
                int lineCount = layout.getLineCount();
                if (layout.getLineStart(lineCount - 1) == spannableStringBuilder2.length() - i7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lineCount > i6 && z4) {
                    final int i9 = lineCount;
                    final Layout layout2 = layout;
                    final TextView textView2 = textView;
                    final SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    final View view2 = view;
                    final int i10 = i;
                    C303581 r0 = new Runnable() {
                        public final void run() {
                            float f;
                            int i = i9 - 2;
                            float lineWidth = layout2.getLineWidth(i);
                            int[] iArr = new int[2];
                            textView2.getLocationInWindow(iArr);
                            int i2 = 0;
                            if (iArr[0] > 0 && iArr[0] < C9738o.m28691a(textView2.getContext())) {
                                boolean a = C30357c.m99191a(spannableStringBuilder4.toString(), textView2);
                                float b = C9738o.m28708b(textView2.getContext(), 8.0f);
                                View view = view2;
                                float f2 = (float) iArr[0];
                                if (a) {
                                    f = lineWidth + b;
                                } else {
                                    f = ((((float) i10) - lineWidth) - b) - ((float) view2.getLayoutParams().width);
                                }
                                view.setX(f2 + f);
                                int lineHeight = textView2.getLineHeight() - view2.getLayoutParams().height;
                                View view2 = view2;
                                int lineTop = iArr[1] + layout2.getLineTop(i);
                                if (lineHeight > 0) {
                                    i2 = lineHeight / 2;
                                }
                                view2.setY((float) (lineTop + i2));
                            }
                        }
                    };
                    TextView textView3 = textView;
                    textView.post(r0);
                    return spannableStringBuilder2;
                } else if (!z3) {
                    return spannableStringBuilder2;
                } else {
                    CharSequence subSequence2 = spannableStringBuilder2.subSequence((spannableStringBuilder2.length() - i7) - 1, spannableStringBuilder2.length());
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, (spannableStringBuilder2.length() - i7) - 1));
                    spannableStringBuilder5.append("\n");
                    spannableStringBuilder5.append(subSequence2);
                    return spannableStringBuilder5;
                }
            }
        }
        if (!z) {
        }
        return spannableStringBuilder2;
    }
}
