package com.p280ss.android.ugc.aweme.profile;

import android.text.Editable;
import android.text.Selection;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.profile.j */
public final class C35818j {
    /* renamed from: a */
    public static final boolean m115643a(Editable editable, int i) {
        String str;
        String str2;
        C7573i.m23587b(editable, "$this$limitToMaxInput");
        CharSequence charSequence = editable;
        if (Character.codePointCount(charSequence, 0, editable.length()) <= 20) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(charSequence);
        if (selectionEnd == 0) {
            str = "";
        } else {
            str = charSequence.subSequence(0, selectionEnd).toString();
        }
        if (selectionEnd == editable.length()) {
            str2 = "";
        } else {
            str2 = charSequence.subSequence(selectionEnd, charSequence.length()).toString();
        }
        int codePointCount = Character.codePointCount(str2, 0, str2.length());
        StringBuilder sb = new StringBuilder();
        int i2 = 20 - codePointCount;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
        }
        sb.append(str2);
        Selection.setSelection(editable, C7551d.m23567d(editable.length() - str2.length(), editable.length()));
        return true;
    }
}
