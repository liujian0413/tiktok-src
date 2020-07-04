package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.p220ui.C5283dp;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.android.livesdk.widget.C9243g;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9506g;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.C9508i;
import com.bytedance.android.livesdkapi.message.C9510k;
import com.bytedance.android.livesdkapi.message.C9511l;
import com.bytedance.android.livesdkapi.message.PieceType;
import com.bytedance.common.utility.C9738o;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.z */
public final class C4374z {

    /* renamed from: a */
    public static final Spannable f12668a = new SpannableString("");

    /* renamed from: a */
    private static String m14755a(C9507h hVar) {
        String str = null;
        if (hVar == null) {
            return null;
        }
        int i = hVar.f26020a;
        if (i == PieceType.STRING.getPieceType()) {
            str = hVar.f26022c;
        } else if (i == PieceType.USER.getPieceType()) {
            str = m14758a(hVar.f26023d);
        } else if (i == PieceType.GIFT.getPieceType()) {
            str = m14756a(hVar.f26024e);
        } else if (hVar.f26020a == PieceType.HEART.getPieceType()) {
            str = " ";
        } else if (i == PieceType.PATTERN_REF.getPieceType()) {
            str = m14757a(hVar.f26026g);
        }
        return str;
    }

    /* renamed from: a */
    private static String m14758a(C9511l lVar) {
        if (lVar == null || lVar.f26032a == null) {
            return null;
        }
        String str = "";
        if (lVar.f26033b) {
            str = " :";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8471f.m25743a(lVar.f26032a));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m14756a(C9508i iVar) {
        if (iVar == null) {
            return null;
        }
        String str = " . ";
        if (iVar.f26028b == null || iVar.f26028b.f26004a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3358ac.m12515a((int) R.string.ess));
            sb.append(str);
            return sb.toString();
        }
        String str2 = "";
        if (iVar.f26028b.f26004a != null) {
            str2 = C8317b.m25387a().mo21482a(iVar.f26028b.f26004a);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = iVar.f26028b.f26005b;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C3358ac.m12515a((int) R.string.ess);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static String m14757a(C9510k kVar) {
        if (kVar == null) {
            return "";
        }
        String str = "";
        if (!TextUtils.isEmpty(kVar.f26030a) && !TextUtils.isEmpty(C8317b.m25387a().mo21482a(kVar.f26030a))) {
            str = C8317b.m25387a().mo21482a(kVar.f26030a);
        } else if (!TextUtils.isEmpty(kVar.f26031b)) {
            str = kVar.f26031b;
        }
        return str;
    }

    /* renamed from: a */
    public static CharSequence m14754a(C9505f fVar) {
        String a = !TextUtils.isEmpty(fVar.f26013a) ? C8317b.m25387a().mo21482a(fVar.f26013a) : null;
        String str = fVar.f26014b;
        if (TextUtils.isEmpty(a)) {
            a = str;
        }
        return m14751a(a, fVar);
    }

    /* renamed from: a */
    private static void m14759a(String str, List<C9507h> list, List<String> list2, Map<Integer, C9507h> map) {
        String str2;
        if (str != null && list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(list2);
            arrayList.add(map);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (charAt != ':') {
                    if (charAt == '{') {
                        i++;
                        if (i == 1) {
                            i3 = i5 + 1;
                            if (sb.length() > 0 && sb.length() > 0) {
                                list2.add(sb.toString());
                                map.put(Integer.valueOf(list2.size() - 1), new C4364q());
                                sb.delete(0, sb.length());
                            }
                        } else {
                            return;
                        }
                    } else if (charAt == '}') {
                        if (i2 != -1) {
                            str2 = str.subSequence(i2, i5).toString();
                        } else {
                            str2 = "string";
                            i4 = Integer.valueOf(str.subSequence(i3, i5).toString()).intValue();
                        }
                        if (i4 != -1) {
                            if (sb.length() > 0) {
                                sb.delete(0, sb.length());
                            }
                            C9507h a = m14753a(i4, str2, list);
                            if (a != null) {
                                list2.add(m14755a(a));
                                map.put(Integer.valueOf(list2.size() - 1), a);
                            }
                            i--;
                            i2 = -1;
                            i4 = -1;
                        } else {
                            return;
                        }
                    }
                } else if (i == 0) {
                    continue;
                } else if (i == 1) {
                    i4 = Integer.valueOf(str.subSequence(i3, i5).toString()).intValue();
                    i2 = i5 + 1;
                    i3 = -1;
                } else {
                    return;
                }
                if (charAt != '}') {
                    sb.append(charAt);
                }
            }
            if (sb.length() > 0) {
                list2.add(sb.toString());
                map.put(Integer.valueOf(list2.size() - 1), new C4364q());
                sb.delete(0, sb.length());
            }
        }
    }

    /* renamed from: a */
    private static C9507h m14753a(int i, String str, List<C9507h> list) {
        if (i < 0 || i >= list.size() || TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        C9507h hVar = (C9507h) list.get(i);
        if (m14752a(hVar.f26020a).getTag().equals(str)) {
            return hVar;
        }
        return null;
    }

    /* renamed from: a */
    private static int m14746a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return C3358ac.m12521b((int) R.color.as5);
        }
    }

    /* renamed from: a */
    private static PieceType m14752a(int i) {
        if (i == PieceType.HEART.getPieceType()) {
            return PieceType.HEART;
        }
        if (i == PieceType.USER.getPieceType()) {
            return PieceType.USER;
        }
        if (i == PieceType.STRING.getPieceType()) {
            return PieceType.STRING;
        }
        if (i == PieceType.GIFT.getPieceType()) {
            return PieceType.GIFT;
        }
        if (i == PieceType.PATTERN_REF.getPieceType()) {
            return PieceType.PATTERN_REF;
        }
        return PieceType.UNKNOWN;
    }

    /* renamed from: a */
    public static Spannable m14747a(Spannable spannable, Bitmap bitmap) {
        if (bitmap == null || ((bitmap.isRecycled() && spannable == null) || spannable.length() == 0)) {
            return spannable;
        }
        int b = (int) C9738o.m28708b(C3358ac.m12528e(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C3358ac.m12528e().getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, b, b);
        spannable.setSpan(new C9238b(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
        return spannable;
    }

    /* renamed from: a */
    public static Spannable m14749a(C9505f fVar, String str) {
        String str2;
        if (fVar == null && TextUtils.isEmpty(str)) {
            return f12668a;
        }
        if (fVar == null) {
            return new SpannableString(str);
        }
        if (fVar.f26013a == null || TextUtils.isEmpty(C8317b.m25387a().mo21482a(fVar.f26013a))) {
            str2 = fVar.f26014b;
        } else {
            str2 = C8317b.m25387a().mo21482a(fVar.f26013a);
        }
        Spannable a = m14751a(str2, fVar);
        if (a != f12668a) {
            return a;
        }
        if (TextUtils.isEmpty(str)) {
            return f12668a;
        }
        return new SpannableString(str);
    }

    /* renamed from: a */
    public static Spannable m14751a(String str, C9505f fVar) {
        if (TextUtils.isEmpty(str) || fVar == null) {
            return f12668a;
        }
        if (fVar.f26016d == null || fVar.f26016d.size() == 0) {
            SpannableString spannableString = new SpannableString(str);
            if (fVar.f26015c != null) {
                C9506g gVar = fVar.f26015c;
                if (!TextUtils.isEmpty(gVar.f26017a)) {
                    spannableString.setSpan(new ForegroundColorSpan(m14746a(gVar.f26017a)), 0, spannableString.length(), 18);
                }
            }
            return spannableString;
        }
        try {
            List<C9507h> list = fVar.f26016d;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m14759a(str, list, (List<String>) arrayList, (Map<Integer, C9507h>) linkedHashMap);
            if (arrayList.size() <= 0 || arrayList.size() != linkedHashMap.size()) {
                return f12668a;
            }
            return m14750a(fVar, (List<String>) arrayList, (Map<Integer, C9507h>) linkedHashMap);
        } catch (Exception e) {
            C3166a.m11955a(6, "ttlive_exception", e.getStackTrace());
            StringWriter stringWriter = new StringWriter();
            C6497a.m20180a((Throwable) e, new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("stack_trace", stringWriter.toString());
            C3172e.m12001a(C3171d.m11993b("ttlive_parse_text_status"), 1, (Map<String, Object>) hashMap);
            return f12668a;
        }
    }

    /* renamed from: a */
    private static Spannable m14750a(C9505f fVar, List<String> list, Map<Integer, C9507h> map) {
        int i;
        C9506g gVar;
        if (list.size() == 0 || map.size() == 0) {
            return f12668a;
        }
        if (list.size() != map.size()) {
            return f12668a;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
        }
        Spannable spannableString = new SpannableString(sb);
        if (fVar.f26015c != null) {
            C9506g gVar2 = fVar.f26015c;
            if (!TextUtils.isEmpty(gVar2.f26017a)) {
                spannableString.setSpan(new ForegroundColorSpan(m14746a(gVar2.f26017a)), 0, spannableString.length(), 18);
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            if (str == null) {
                str = "";
            }
            C9507h hVar = (C9507h) map.get(Integer.valueOf(i3));
            if (hVar == null || (hVar instanceof C4364q)) {
                i = str.length();
            } else {
                if (!((hVar.f26020a == PieceType.STRING.getPieceType() && hVar.f26021b == null) || (hVar.f26020a == PieceType.PATTERN_REF.getPieceType() && hVar.f26021b == null))) {
                    if (hVar.f26021b == null) {
                        gVar = fVar.f26015c;
                    } else {
                        gVar = hVar.f26021b;
                    }
                    if (hVar.f26020a == PieceType.STRING.getPieceType() || hVar.f26020a == PieceType.PATTERN_REF.getPieceType()) {
                        spannableString.setSpan(new ForegroundColorSpan(m14746a(gVar.f26017a)), i2, str.length() + i2, 17);
                    } else if (hVar.f26020a == PieceType.USER.getPieceType() && hVar.f26023d != null) {
                        int a = m14746a(gVar.f26017a);
                        spannableString.setSpan(new C5283dp(hVar.f26023d.f26032a, a, false), i2, str.length() + i2, 17);
                        spannableString.setSpan(new ForegroundColorSpan(a), i2, str.length() + i2, 17);
                    } else if ((hVar.f26020a != PieceType.GIFT.getPieceType() || hVar.f26024e == null) && hVar.f26020a == PieceType.HEART.getPieceType() && hVar.f26025f != null) {
                        Context e = C3358ac.m12528e();
                        spannableString = m14747a(spannableString, C9243g.m27497a(e, m14746a(hVar.f26025f.f26029a), e.getResources().getDimensionPixelSize(R.dimen.ra), e.getResources().getDimensionPixelSize(R.dimen.r_)));
                    }
                    if (gVar.f26019c >= 700) {
                        spannableString.setSpan(new StyleSpan(1), i2, str.length() + i2, 33);
                    } else if (gVar.f26019c > 0) {
                        spannableString.setSpan(new StyleSpan(0), i2, str.length() + i2, 33);
                    }
                }
                i = str.length();
            }
            i2 += i;
        }
        return spannableString;
    }

    /* renamed from: a */
    public static Spannable m14748a(Spannable spannable, Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.isRecycled() || spannable == null || spannable.length() == 0 || i < 0 || i > spannable.length() || i > i2) {
            return spannable;
        }
        int b = (int) C9738o.m28708b(C3358ac.m12528e(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C3358ac.m12528e().getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, b, b);
        spannable.setSpan(new C9238b(bitmapDrawable), i, i2, 33);
        return spannable;
    }
}
