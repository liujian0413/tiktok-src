package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e */
public final class C39654e {

    /* renamed from: a */
    public static int f103118a = 200;

    /* renamed from: b */
    public static int f103119b = 0;

    /* renamed from: c */
    public static int f103120c = 1;

    /* renamed from: d */
    public static int f103121d = 2;

    /* renamed from: e */
    public static int f103122e = 3;

    /* renamed from: f */
    public static int f103123f;

    /* renamed from: b */
    public static final void m126975b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            KeyboardUtils.m77056b(editText);
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: a */
    public static final int m126971a(EditText editText) {
        int i;
        if (editText == null) {
            return 0;
        }
        try {
            if (editText.getLayout() == null) {
                StaticLayout staticLayout = new StaticLayout(editText.getText(), editText.getPaint(), editText.getMaxWidth(), Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                i = staticLayout.getLineCount();
            } else {
                Layout layout = editText.getLayout();
                C7573i.m23582a((Object) layout, "layout");
                i = layout.getLineCount();
            }
        } catch (Exception unused) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public static final void m126972a(EditText editText, double d) {
        if (editText != null) {
            if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                editText.setGravity(17);
                m126974a(editText, C23486n.m77122a(d), 0, C23486n.m77122a(d), 0);
                return;
            }
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
            if (measureText < 0) {
                m126974a(editText, 0, 0, 0, 0);
                editText.setGravity(8388659);
                return;
            }
            m126974a(editText, measureText, 0, 0, 0);
            editText.setGravity(8388627);
        }
    }

    /* renamed from: a */
    public static final void m126973a(EditText editText, int i) {
        boolean z;
        if (editText != null) {
            CharSequence text = editText.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && m126971a(editText) > i) {
                String obj = editText.getText().toString();
                int i2 = i * 50;
                if (obj.length() >= i2) {
                    if (obj != null) {
                        obj = obj.substring(0, i2);
                        C7573i.m23582a((Object) obj, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                int length = obj.length() - 1;
                if (obj != null) {
                    String substring = obj.substring(0, length);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int length2 = substring.length() - 1;
                    while (length2 >= 0 && Character.isHighSurrogate(substring.charAt(length2))) {
                        if (substring != null) {
                            substring = substring.substring(0, length2);
                            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            length2--;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    editText.setText(substring);
                    editText.setSelection(editText.getText().length());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m126974a(EditText editText, int i, int i2, int i3, int i4) {
        if (editText != null) {
            if (VERSION.SDK_INT >= 17) {
                editText.setPaddingRelative(i, 0, i3, 0);
            } else if (!C43127fh.m136806a(editText.getContext())) {
                editText.setPadding(i, 0, i3, 0);
            } else {
                editText.setPadding(i3, 0, i, 0);
            }
        }
    }
}
