package com.p280ss.android.ugc.aweme.colortemplate;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7625a;

/* renamed from: com.ss.android.ugc.aweme.colortemplate.ColorVH */
public final class ColorVH extends C1293v {

    /* renamed from: a */
    private final TextView f63518a;

    /* renamed from: b */
    private final View f63519b;

    /* renamed from: c */
    private final TextView f63520c;

    public ColorVH(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f63518a = (TextView) view.findViewById(R.id.text);
        this.f63519b = view.findViewById(R.id.vz);
        this.f63520c = (TextView) view.findViewById(R.id.cst);
    }

    /* renamed from: a */
    private static String m78836a(int i) {
        boolean z;
        String num = Integer.toString(i, C7625a.m23676a(16));
        C7573i.m23582a((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        if (num != null) {
            String upperCase = num.toUpperCase();
            C7573i.m23582a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            if (upperCase.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "00";
            }
            if (upperCase.length() != 1) {
                return upperCase;
            }
            StringBuilder sb = new StringBuilder("0");
            sb.append(upperCase);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private String m78837a(int i, boolean z) {
        int i2 = (i >> 16) & NormalGiftView.ALPHA_255;
        int i3 = (i >> 8) & NormalGiftView.ALPHA_255;
        int i4 = i & NormalGiftView.ALPHA_255;
        int i5 = (i >> 24) & NormalGiftView.ALPHA_255;
        if (z) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(m78836a(i5));
            sb.append(m78836a(i2));
            sb.append(m78836a(i3));
            sb.append(m78836a(i4));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("#");
        sb2.append(m78836a(i2));
        sb2.append(m78836a(i3));
        sb2.append(m78836a(i4));
        sb2.append(' ');
        double d = (double) i5;
        Double.isNaN(d);
        sb2.append((int) Math.rint((d / 255.0d) * 100.0d));
        sb2.append('%');
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo62289a(String str, boolean z) {
        C7573i.m23587b(str, "color");
        TextView textView = this.f63518a;
        C7573i.m23582a((Object) textView, "mTextView");
        textView.setText(str);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context2 = view2.getContext();
        C7573i.m23582a((Object) context2, "itemView.context");
        int identifier = context.getResources().getIdentifier(str, "color", context2.getPackageName());
        if (identifier != 0) {
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            Context context3 = view3.getContext();
            C7573i.m23582a((Object) context3, "itemView.context");
            int color = context3.getResources().getColor(identifier);
            this.f63519b.setBackgroundColor(color);
            TextView textView2 = this.f63520c;
            C7573i.m23582a((Object) textView2, "mRgbView");
            textView2.setText(m78837a(color, z));
        }
    }
}
