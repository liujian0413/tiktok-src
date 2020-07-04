package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.AssistLineView */
public class AssistLineView extends FrameLayout {

    /* renamed from: a */
    private View f109279a;

    /* renamed from: b */
    private View f109280b;

    /* renamed from: c */
    private int f109281c;

    /* renamed from: d */
    private int f109282d;

    private AssistLineView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo103305a(boolean z) {
        m133775c(false);
        m133774b(false);
    }

    /* renamed from: a */
    public static AssistLineView m133773a(Context context) {
        AssistLineView assistLineView = new AssistLineView(context);
        assistLineView.setLayoutParams(new LayoutParams(-1, -1));
        return assistLineView;
    }

    /* renamed from: b */
    private void m133774b(boolean z) {
        int i;
        View view = this.f109279a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: c */
    private void m133775c(boolean z) {
        int i;
        View view = this.f109280b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public AssistLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109281c = 4;
        this.f109282d = -16717825;
        this.f109281c = (int) C9738o.m28708b(context, 1.5f);
        this.f109279a = new View(context);
        this.f109279a.setBackgroundColor(this.f109282d);
        LayoutParams layoutParams = new LayoutParams(-1, this.f109281c);
        layoutParams.gravity = 16;
        this.f109279a.setLayoutParams(layoutParams);
        this.f109280b = new View(context);
        this.f109280b.setBackgroundColor(this.f109282d);
        LayoutParams layoutParams2 = new LayoutParams(this.f109281c, -1);
        layoutParams2.gravity = 1;
        this.f109280b.setLayoutParams(layoutParams2);
        addView(this.f109279a);
        addView(this.f109280b);
        this.f109279a.setVisibility(8);
        this.f109280b.setVisibility(8);
    }
}
