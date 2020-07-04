package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b */
public final class C40304b {

    /* renamed from: a */
    public final ShortVideoContext f104688a;

    /* renamed from: b */
    private final LinearLayout f104689b;

    /* renamed from: a */
    private final TabItemView m128749a() {
        LinearLayout linearLayout = this.f104689b;
        C7573i.m23582a((Object) linearLayout, "tabContainer");
        return new TabItemView(linearLayout.getContext());
    }

    /* renamed from: a */
    public final int mo100128a(String str) {
        C7573i.m23587b(str, "tag");
        LinearLayout linearLayout = this.f104689b;
        C7573i.m23582a((Object) linearLayout, "tabContainer");
        if (linearLayout.getChildCount() <= 0) {
            return -1;
        }
        LinearLayout linearLayout2 = this.f104689b;
        C7573i.m23582a((Object) linearLayout2, "tabContainer");
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f104689b.getChildAt(i);
            C7573i.m23582a((Object) childAt, "tabContainer.getChildAt(i)");
            if (C7573i.m23585a((Object) str, childAt.getTag())) {
                return i;
            }
        }
        return 0;
    }

    public C40304b(TabHost tabHost, ShortVideoContext shortVideoContext) {
        C7573i.m23587b(tabHost, "tabHost");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        this.f104688a = shortVideoContext;
        this.f104689b = (LinearLayout) tabHost.findViewById(R.id.a19);
    }

    /* renamed from: a */
    public final void mo100130a(int i, String str, String str2) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        mo100129a(i, str, 0, str2);
    }

    /* renamed from: a */
    public final void mo100129a(int i, String str, int i2, String str2) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        TabItemView a = m128749a();
        a.setText(str);
        if (i2 != 0) {
            Context context = a.getContext();
            C7573i.m23582a((Object) context, "item.context");
            Drawable drawable = context.getResources().getDrawable(i2);
            C7573i.m23582a((Object) drawable, "leftDrawable");
            drawable.setBounds(0, 1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + 1);
            a.getTextView().setCompoundDrawables(drawable, null, null, null);
            TextView textView = a.getTextView();
            C7573i.m23582a((Object) textView, "item.textView");
            textView.setCompoundDrawablePadding((int) C9738o.m28708b(a.getContext(), 3.0f));
        }
        a.setTag(str2);
        this.f104689b.addView(a, i);
    }
}
