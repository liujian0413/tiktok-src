package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.c */
public final class C42078c {

    /* renamed from: a */
    public View f109432a;

    /* renamed from: b */
    public int f109433b;

    /* renamed from: c */
    public C42080a f109434c;

    /* renamed from: d */
    private OnGlobalLayoutListener f109435d = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            Rect rect = new Rect();
            C42078c.this.f109432a.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (C42078c.this.f109433b != height) {
                StringBuilder sb = new StringBuilder("softKeyBoard old Height:");
                sb.append(C42078c.this.f109433b);
                sb.append(", new Height:");
                sb.append(height);
                C41530am.m132280a(sb.toString());
            }
            if (C42078c.this.f109433b == 0) {
                C42078c.this.f109433b = height;
            } else if (C42078c.this.f109433b != height) {
                if (C42078c.this.f109434c != null) {
                    if (C42078c.this.f109433b - height > 200) {
                        C42078c.this.f109434c.mo96459a(C42078c.this.f109433b - height);
                    } else if (C42078c.this.f109433b > height) {
                        C42078c.this.f109434c.mo96461c(C42078c.this.f109433b - height);
                    } else if (height - C42078c.this.f109433b > 200) {
                        C42078c.this.f109434c.mo96460b(height - C42078c.this.f109433b);
                    }
                }
                C42078c.this.f109433b = height;
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.c$a */
    public interface C42080a {
        /* renamed from: a */
        void mo96459a(int i);

        /* renamed from: b */
        void mo96460b(int i);

        /* renamed from: c */
        void mo96461c(int i);
    }

    /* renamed from: a */
    public final void mo103393a() {
        if (!(this.f109432a == null || this.f109435d == null)) {
            this.f109432a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f109435d);
        }
        this.f109434c = null;
    }

    public C42078c(Activity activity) {
        this.f109432a = activity.getWindow().getDecorView();
    }

    /* renamed from: a */
    public final void mo103394a(C42080a aVar) {
        this.f109434c = aVar;
        if (this.f109432a != null && this.f109435d != null) {
            this.f109432a.getViewTreeObserver().addOnGlobalLayoutListener(this.f109435d);
        }
    }
}
