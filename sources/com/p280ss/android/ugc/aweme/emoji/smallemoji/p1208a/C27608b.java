package com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.views.C27681a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.a.b */
public final class C27608b {

    /* renamed from: a */
    static Pattern f72766a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static boolean f72767b = false;

    /* renamed from: a */
    public static int m90500a(String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            while (f72766a.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m90502a(TextView textView) {
        int i;
        boolean z;
        if (!f72767b) {
            f72767b = true;
            CharSequence text = textView.getText();
            List a = m90501a(textView.getContext(), text.toString());
            int size = a.size();
            if (TextUtils.isEmpty(text) || size <= 0) {
                f72767b = false;
                return;
            }
            SpannableString spannableString = new SpannableString(text);
            C27681a[] aVarArr = (C27681a[]) spannableString.getSpans(0, text.length(), C27681a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                if (aVarArr.length != size) {
                    z = true;
                } else {
                    z = false;
                }
                int length = aVarArr.length;
                boolean z2 = z;
                for (int i2 = 0; i2 < length; i2++) {
                    C27681a aVar = aVarArr[i2];
                    spannableString.removeSpan(aVar);
                    if (i2 < size && !z2 && !TextUtils.equals(aVar.mo71113a(), (CharSequence) a.get(i2))) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    f72767b = false;
                    return;
                }
            }
            boolean z3 = textView instanceof EditText;
            if (z3) {
                i = textView.getSelectionStart();
            } else {
                i = 0;
            }
            C27606a b = C27606a.m90489b(textView.getContext());
            Matcher matcher = f72766a.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                Drawable a2 = b.mo70930a(textView.getContext(), group);
                if (a2 != null) {
                    int lineHeight = textView.getLineHeight();
                    a2.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a2.getIntrinsicWidth()) + 0.0f) / ((float) a2.getIntrinsicHeight()))) + 0.5f), lineHeight);
                    spannableString.setSpan(new C27681a(a2, Integer.valueOf(end - start), group), start, end, 33);
                    if (i > start && i < end && z3) {
                        ((EditText) textView).setSelection(end);
                    }
                }
            }
            if (z3) {
                Editable editableText = textView.getEditableText();
                if (editableText != null) {
                    editableText.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            f72767b = false;
        }
    }

    /* renamed from: a */
    public static void m90503a(RemoteImageView remoteImageView, C27517a aVar) {
        C27606a.m90489b(remoteImageView.getContext()).mo70933a(remoteImageView, aVar);
    }

    /* renamed from: a */
    private static List<String> m90501a(Context context, String str) {
        if (context == null) {
            context = C6405d.m19984g();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f72766a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (C27606a.m90489b(context).mo70930a((Context) C6405d.m19984g(), group) != null) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String[] m90504a(String str, String str2, int i) {
        return str.split(str2, 2);
    }
}
