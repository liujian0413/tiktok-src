package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.a */
public final class C39567a implements C39579j {

    /* renamed from: a */
    private FixBubbleLayout f102759a;

    /* renamed from: b */
    private TextView f102760b;

    /* renamed from: c */
    private C39568a f102761c;

    /* renamed from: d */
    private final C39581l f102762d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.a$a */
    public interface C39568a {
    }

    /* renamed from: b */
    public final FixBubbleLayout mo98529b() {
        return this.f102759a;
    }

    /* renamed from: a */
    public final void mo98526a() {
        this.f102760b = new DmtTextView(this.f102762d.mo98561p());
        TextView textView = this.f102760b;
        if (textView == null) {
            C7573i.m23580a();
        }
        Activity p = this.f102762d.mo98561p();
        C7573i.m23582a((Object) p, "popupWindow.activity");
        textView.setTextColor(p.getResources().getColor(R.color.a5d));
        TextView textView2 = this.f102760b;
        if (textView2 == null) {
            C7573i.m23580a();
        }
        textView2.setTextSize(13.0f);
        TextView textView3 = this.f102760b;
        if (textView3 == null) {
            C7573i.m23580a();
        }
        textView3.setLayoutParams(new LayoutParams(-2, -2));
        TextView textView4 = this.f102760b;
        if (textView4 == null) {
            C7573i.m23580a();
        }
        textView4.setMaxLines(2);
        TextView textView5 = this.f102760b;
        if (textView5 == null) {
            C7573i.m23580a();
        }
        textView5.setGravity(17);
        mo98527a((View) this.f102760b);
        this.f102762d.mo98559n().mo98550d(true);
        this.f102762d.getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo98528a(C39568a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f102761c = aVar;
    }

    public C39567a(C39581l lVar) {
        C7573i.m23587b(lVar, "popupWindow");
        this.f102762d = lVar;
    }

    /* renamed from: a */
    public final void mo98527a(View view) {
        this.f102759a = new FixBubbleLayout(this.f102762d.mo98561p());
        FixBubbleLayout fixBubbleLayout = this.f102759a;
        if (fixBubbleLayout == null) {
            C7573i.m23580a();
        }
        fixBubbleLayout.setBackgroundColor(0);
        FixBubbleLayout fixBubbleLayout2 = this.f102759a;
        if (fixBubbleLayout2 == null) {
            C7573i.m23580a();
        }
        fixBubbleLayout2.addView(view);
        FixBubbleLayout fixBubbleLayout3 = this.f102759a;
        if (fixBubbleLayout3 == null) {
            C7573i.m23580a();
        }
        fixBubbleLayout3.setGravity(17);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        FixBubbleLayout fixBubbleLayout4 = this.f102759a;
        if (fixBubbleLayout4 == null) {
            C7573i.m23580a();
        }
        fixBubbleLayout4.setLayoutParams(marginLayoutParams);
        FixBubbleLayout fixBubbleLayout5 = this.f102759a;
        if (fixBubbleLayout5 == null) {
            C7573i.m23580a();
        }
        fixBubbleLayout5.setVisibility(8);
        C39580k q = this.f102762d.mo98562q();
        C7573i.m23582a((Object) q, "popupWindow.bubbleParams");
        if (q.mo98538d() != 0) {
            FixBubbleLayout fixBubbleLayout6 = this.f102759a;
            if (fixBubbleLayout6 == null) {
                C7573i.m23580a();
            }
            C39580k q2 = this.f102762d.mo98562q();
            C7573i.m23582a((Object) q2, "popupWindow.bubbleParams");
            fixBubbleLayout6.setBgColor(q2.mo98538d());
        }
        FixBubbleLayout fixBubbleLayout7 = this.f102759a;
        if (fixBubbleLayout7 == null) {
            C7573i.m23580a();
        }
        C39580k q3 = this.f102762d.mo98562q();
        C7573i.m23582a((Object) q3, "popupWindow.bubbleParams");
        fixBubbleLayout7.setNeedPath(q3.mo98541e());
        FixBubbleLayout fixBubbleLayout8 = this.f102759a;
        if (fixBubbleLayout8 == null) {
            C7573i.m23580a();
        }
        C39580k q4 = this.f102762d.mo98562q();
        C7573i.m23582a((Object) q4, "popupWindow.bubbleParams");
        fixBubbleLayout8.setNeedPressFade(q4.mo98543f());
        this.f102762d.setContentView(this.f102759a);
    }
}
