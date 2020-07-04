package com.twitter.sdk.android.tweetui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.twitter.sdk.android.core.models.C46954k;
import com.twitter.sdk.android.tweetui.internal.C47068b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.twitter.sdk.android.tweetui.an */
final class C47025an {

    /* renamed from: a */
    static final Pattern f120666a = Pattern.compile("^https?://twitter\\.com(/#!)?/\\w+/status/\\d+$");

    /* renamed from: b */
    static final Pattern f120667b = Pattern.compile("^https?://vine\\.co(/#!)?/v/\\w+$");

    /* renamed from: a */
    private static boolean m147031a(C47085l lVar) {
        return (lVar instanceof C47083j) && "photo".equals(((C47083j) lVar).f120820a);
    }

    /* renamed from: b */
    private static boolean m147032b(C47085l lVar) {
        return f120666a.matcher(lVar.f120832g).find();
    }

    /* renamed from: c */
    private static boolean m147033c(C47085l lVar) {
        return f120667b.matcher(lVar.f120832g).find();
    }

    /* renamed from: a */
    private static CharSequence m147027a(CharSequence charSequence) {
        int length = charSequence.length();
        while (length > 0 && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (length < charSequence.length()) {
            return charSequence.subSequence(0, length);
        }
        return charSequence;
    }

    /* renamed from: a */
    private static String m147028a(String str) {
        if (str.endsWith(Character.toString(8206))) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    static final /* synthetic */ int m147024a(C47085l lVar, C47085l lVar2) {
        if (lVar == null && lVar2 != null) {
            return -1;
        }
        if (lVar != null && lVar2 == null) {
            return 1;
        }
        if (lVar == null && lVar2 == null) {
            return 0;
        }
        if (lVar.f120828c < lVar2.f120828c) {
            return -1;
        }
        if (lVar.f120828c > lVar2.f120828c) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static C47085l m147025a(String str, List<C47085l> list, boolean z, boolean z2) {
        if (list.isEmpty()) {
            return null;
        }
        C47085l lVar = (C47085l) list.get(list.size() - 1);
        if (!m147028a(str).endsWith(lVar.f120831f) || (!m147031a(lVar) && ((!z || !m147032b(lVar)) && (!z2 || !m147033c(lVar))))) {
            return null;
        }
        return lVar;
    }

    /* renamed from: a */
    private static List<C47085l> m147029a(List<C47085l> list, List<C47083j> list2, List<C47085l> list3, List<C47085l> list4, List<C47085l> list5) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list4);
        arrayList.addAll(list5);
        Collections.sort(arrayList, C47027ao.f120670a);
        return arrayList;
    }

    /* renamed from: a */
    static CharSequence m147026a(C47084k kVar, C47091q qVar, int i, int i2, boolean z, boolean z2) {
        if (kVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(kVar.f120822a)) {
            return kVar.f120822a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kVar.f120822a);
        List a = m147029a(C46954k.m146830a(kVar.f120823b), C46954k.m146830a(kVar.f120824c), C46954k.m146830a(kVar.f120825d), C46954k.m146830a(kVar.f120826e), C46954k.m146830a(kVar.f120827f));
        m147030a(spannableStringBuilder, a, m147025a(kVar.f120822a, a, z, z2), qVar, i, i2);
        return m147027a((CharSequence) spannableStringBuilder);
    }

    /* renamed from: a */
    private static void m147030a(SpannableStringBuilder spannableStringBuilder, List<C47085l> list, C47085l lVar, C47091q qVar, int i, int i2) {
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            for (C47085l lVar2 : list) {
                int i4 = lVar2.f120828c - i3;
                int i5 = lVar2.f120829d - i3;
                if (i4 >= 0 && i5 <= spannableStringBuilder.length()) {
                    if (lVar != null && lVar.f120828c == lVar2.f120828c) {
                        spannableStringBuilder.replace(i4, i5, "");
                        i3 += i5 - i4;
                    } else if (!TextUtils.isEmpty(lVar2.f120830e)) {
                        spannableStringBuilder.replace(i4, i5, lVar2.f120830e);
                        int length = i5 - (lVar2.f120830e.length() + i4);
                        int i6 = i5 - length;
                        i3 += length;
                        C470261 r2 = new C47068b(i2, i, false, qVar, lVar2) {

                            /* renamed from: a */
                            final /* synthetic */ C47091q f120668a;

                            /* renamed from: b */
                            final /* synthetic */ C47085l f120669b;

                            public final void onClick(View view) {
                                if (this.f120668a != null) {
                                    this.f120668a.mo118238a(this.f120669b.f120831f);
                                }
                            }

                            {
                                this.f120668a = r4;
                                this.f120669b = r5;
                            }
                        };
                        spannableStringBuilder.setSpan(r2, i4, i6, 33);
                    }
                }
            }
        }
    }
}
