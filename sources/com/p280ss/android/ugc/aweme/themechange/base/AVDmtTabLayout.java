package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout */
public final class AVDmtTabLayout extends TabLayout {

    /* renamed from: u */
    public static final C42107a f109588u = new C42107a(null);

    /* renamed from: t */
    public C41006c f109589t;

    /* renamed from: v */
    private int f109590v;

    /* renamed from: w */
    private int f109591w;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a */
    public static final class C42107a {
        private C42107a() {
        }

        public /* synthetic */ C42107a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AVDmtTabItemView m134028a(Context context) {
            if (context == null) {
                C7573i.m23580a();
            }
            return new AVDmtTabItemView(context, false);
        }

        /* renamed from: a */
        public static AVDmtTabItemView m134029a(Context context, boolean z) {
            if (context == null) {
                C7573i.m23580a();
            }
            return new AVDmtTabItemView(context, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$b */
    public static final class C42108b implements C41006c {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f109592a;

        C42108b(AVDmtTabLayout aVDmtTabLayout) {
            this.f109592a = aVDmtTabLayout;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
            if (this.f109592a.f109589t != null) {
                C41006c cVar = this.f109592a.f109589t;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                cVar.mo74743a(fVar);
            }
        }

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
            if (this.f109592a.f109589t != null) {
                C41006c cVar = this.f109592a.f109589t;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                cVar.mo74744b(fVar);
            }
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
            if (this.f109592a.f109589t != null) {
                C41006c cVar = this.f109592a.f109589t;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                cVar.mo74745c(fVar);
            }
        }
    }

    public AVDmtTabLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: f */
    public final void mo103530f() {
        if (C6399b.m19944t()) {
            setTabMargin(18);
        } else {
            setTabMargin(0);
        }
    }

    /* renamed from: a */
    public final void mo101335a(C41006c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f109589t = cVar;
    }

    public final void setMaxTabModeForCount(int i) {
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
        }
        if (i > 4 || i <= 1) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    /* renamed from: a */
    private final void m134024a(Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            z = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView).getBoolean(26, false);
        }
        this.f109590v = C42111b.f109618a.mo103541a(z);
        this.f109591w = C42111b.m134049a(this.f109590v);
        setOverScrollMode(2);
        mo101333a(this.f109591w, this.f109590v);
        setSelectedTabIndicatorColor(this.f109590v);
        setTabMargin(16);
        super.mo101335a((C41006c) new C42108b(this));
    }

    /* renamed from: a */
    public final void mo103529a(int i, List<String> list) {
        float f;
        C7573i.m23587b(list, "nameList");
        setMaxTabModeForCount(i);
        if (!C23477d.m77081a((Collection<T>) list)) {
            Paint paint = new Paint();
            paint.setTextSize(C9738o.m28708b(getContext(), 15.0f));
            int i2 = 0;
            for (String str : list) {
                if (str != null) {
                    f = paint.measureText(str);
                } else {
                    f = 0.0f;
                }
                if (f > ((float) i2)) {
                    i2 = (int) f;
                }
            }
            if (((float) i2) > C9738o.m28708b(getContext(), 50.0f) && i > 2) {
                setTabMode(0);
            }
        }
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m134024a(context, attributeSet);
    }

    public /* synthetic */ AVDmtTabLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
