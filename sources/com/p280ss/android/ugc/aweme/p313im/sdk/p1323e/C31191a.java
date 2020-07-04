package com.p280ss.android.ugc.aweme.p313im.sdk.p1323e;

import android.graphics.Paint.FontMetricsInt;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.util.Pair;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30918l.C30919a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EPlatformCardContent.LinkItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.e.a */
public final class C31191a {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.e.a$a */
    public static class C31192a implements LineHeightSpan {

        /* renamed from: a */
        int f81820a;

        /* renamed from: b */
        int f81821b;

        /* renamed from: c */
        int f81822c;

        /* renamed from: d */
        int f81823d;

        /* renamed from: e */
        int f81824e;

        C31192a(int i, int i2, int i3) {
            this.f81820a = i;
            this.f81823d = i2;
            this.f81824e = i3;
        }

        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, FontMetricsInt fontMetricsInt) {
            if (this.f81821b == 0 && this.f81822c == 0) {
                this.f81821b = fontMetricsInt.ascent;
                this.f81822c = fontMetricsInt.ascent - this.f81820a;
            }
            if (i == this.f81823d) {
                fontMetricsInt.ascent = this.f81822c;
            } else {
                fontMetricsInt.ascent = this.f81821b;
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ int m101658a(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    /* renamed from: a */
    public static void m101659a(TextView textView, String str, Map<String, LinkItem> map, String str2, long j, int i) {
        boolean z;
        Map<String, LinkItem> map2 = map;
        if (map2 == null || map.isEmpty()) {
            TextView textView2 = textView;
            String str3 = str;
            ((MarginLayoutParams) textView.getLayoutParams()).bottomMargin = 0;
            textView.setText(str);
            return;
        }
        ((MarginLayoutParams) textView.getLayoutParams()).bottomMargin = (int) C9738o.m28708b(textView.getContext(), 5.0f);
        ArrayList<Pair> arrayList = new ArrayList<>();
        TreeMap treeMap = new TreeMap(C31193b.f81825a);
        for (String str4 : map.keySet()) {
            String str5 = str;
            treeMap.put(Integer.valueOf(str.indexOf(str4)), str4);
        }
        String str6 = str;
        for (String str7 : treeMap.values()) {
            LinkItem linkItem = (LinkItem) map2.get(str7);
            StringBuilder sb = new StringBuilder("{{");
            sb.append(str7);
            sb.append("}}");
            String sb2 = sb.toString();
            int indexOf = str6.indexOf(sb2);
            if (linkItem != null) {
                arrayList.add(new Pair(Integer.valueOf(indexOf), linkItem));
                str6 = str6.replace(sb2, linkItem.name);
            }
        }
        SpannableString spannableString = new SpannableString(str6);
        for (Pair pair : arrayList) {
            if (((LinkItem) pair.second).extraParams == null || !TextUtils.equals(((LinkItem) pair.second).extraParams.showMoreButton, "0")) {
                z = true;
            } else {
                z = false;
            }
            C30919a aVar = new C30919a(textView.getContext(), str2, j, (LinkItem) pair.second, i, z);
            spannableString.setSpan(aVar, ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length(), 33);
            spannableString.setSpan(new C31192a((int) C9738o.m28708b(textView.getContext(), 12.0f), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length()), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length(), 33);
        }
        TextView textView3 = textView;
        textView.setText(spannableString);
    }
}
