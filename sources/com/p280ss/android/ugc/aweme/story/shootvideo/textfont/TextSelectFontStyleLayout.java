package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.framwork.core.p523b.C10233a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.DmtAutoCenterScrollView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout */
public class TextSelectFontStyleLayout extends FrameLayout {

    /* renamed from: a */
    public String f109173a;

    /* renamed from: b */
    private List<C42038c> f109174b = new ArrayList();

    /* renamed from: c */
    private C42034a f109175c;

    /* renamed from: d */
    private List<TextFontTypeLayout> f109176d = new ArrayList();

    /* renamed from: e */
    private DmtAutoCenterScrollView f109177e;

    /* renamed from: f */
    private LinearLayout f109178f;

    /* renamed from: g */
    private int f109179g;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout$a */
    public interface C42034a {
        /* renamed from: a */
        void mo103208a(C42038c cVar);
    }

    /* renamed from: a */
    public final void mo103203a() {
        for (TextFontTypeLayout textFontTypeLayout : this.f109176d) {
            String c = C42039d.m133620a().mo103233c(this.f109179g);
            if (TextUtils.isEmpty(c) || !c.equals(textFontTypeLayout.getTag())) {
                textFontTypeLayout.setBackground(0);
            } else if (textFontTypeLayout.mo103196a()) {
                textFontTypeLayout.setBackground(1);
                textFontTypeLayout.mo103197b();
                this.f109177e.mo103317a(textFontTypeLayout);
            }
        }
    }

    public void setClickFontStyleListener(C42034a aVar) {
        this.f109175c = aVar;
    }

    /* renamed from: a */
    public final void mo103205a(C42038c cVar) {
        if (this.f109175c != null) {
            this.f109175c.mo103208a(cVar);
        }
        mo103203a();
    }

    /* renamed from: a */
    private void m133601a(int i) {
        this.f109179g = i;
        this.f109178f = new LinearLayout(getContext());
        this.f109177e = new DmtAutoCenterScrollView(getContext(), null);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f109178f.setPadding((int) C9738o.m28708b(getContext(), 12.0f), 0, 0, 0);
        this.f109177e.addView(this.f109178f, layoutParams);
        this.f109177e.setHorizontalScrollBarEnabled(false);
        addView(this.f109177e, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo103206a(List<C42038c> list) {
        if (!C10233a.m30356a(list) && C10233a.m30356a(this.f109174b)) {
            this.f109174b = list;
            for (int i = 0; i < this.f109174b.size(); i++) {
                if (this.f109174b.get(i) != null) {
                    TextFontTypeLayout a = m133599a((C42038c) this.f109174b.get(i), i);
                    this.f109176d.add(a);
                    this.f109178f.addView(a);
                }
            }
        }
    }

    /* renamed from: a */
    public static TextSelectFontStyleLayout m133600a(Context context, int i) {
        TextSelectFontStyleLayout textSelectFontStyleLayout = new TextSelectFontStyleLayout(context, null, i);
        textSelectFontStyleLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return textSelectFontStyleLayout;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103204a(TextFontTypeLayout textFontTypeLayout, View view) {
        this.f109177e.mo103317a(view);
        if (textFontTypeLayout.getFontData() != null) {
            this.f109173a = textFontTypeLayout.getFontData().f109191i;
        }
        if (textFontTypeLayout.mo103198c()) {
            mo103205a(textFontTypeLayout.getFontData());
        }
    }

    /* renamed from: a */
    private TextFontTypeLayout m133599a(C42038c cVar, int i) {
        TextFontTypeLayout textFontTypeLayout = new TextFontTypeLayout(getContext());
        textFontTypeLayout.mo103193a(cVar);
        textFontTypeLayout.setBackground(0);
        if (!C42039d.m133620a().mo103225a(this.f109179g)) {
            String c = C42039d.m133620a().mo103233c(this.f109179g);
            if (!TextUtils.isEmpty(c) && c.equals(cVar.f109191i) && textFontTypeLayout.mo103196a()) {
                textFontTypeLayout.setBackground(1);
            }
        } else if (i == 0 && cVar != null && textFontTypeLayout.mo103196a()) {
            C42039d.m133620a().mo103223a(cVar.f109191i, this.f109179g);
            textFontTypeLayout.setBackground(1);
        }
        textFontTypeLayout.setTag(cVar.f109191i);
        textFontTypeLayout.setOnClickListener(new C42045h(this, textFontTypeLayout));
        textFontTypeLayout.setDownloadCallback(new C42036a() {
            /* renamed from: a */
            public final void mo103195a(boolean z) {
            }

            /* renamed from: a */
            public final void mo103194a(C42038c cVar, boolean z, boolean z2) {
                if (z && cVar != null && !TextUtils.isEmpty(cVar.f109191i) && cVar.f109191i.equals(TextSelectFontStyleLayout.this.f109173a)) {
                    TextSelectFontStyleLayout.this.mo103205a(cVar);
                }
            }
        });
        return textFontTypeLayout;
    }

    public TextSelectFontStyleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        m133601a(i);
    }
}
