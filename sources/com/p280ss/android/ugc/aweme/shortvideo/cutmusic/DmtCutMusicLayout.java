package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView.C39296a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C39297a;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout */
public final class DmtCutMusicLayout extends LinearLayout {

    /* renamed from: a */
    private DmtCutMusicScrollView f102056a;

    /* renamed from: b */
    private DmtBubbleTextView f102057b;

    /* renamed from: c */
    private final int f102058c;

    /* renamed from: d */
    private String f102059d;

    public DmtCutMusicLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final void mo97827b(float f) {
        mo97826a(f, false);
    }

    /* renamed from: a */
    public final void mo97824a() {
        mo97825a(0.0f);
        setTimeBubble(0);
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102056a;
        if (dmtCutMusicScrollView == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollDx(0.0f);
    }

    /* renamed from: a */
    public final void mo97825a(float f) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102056a;
        if (dmtCutMusicScrollView == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.mo97833a(f);
    }

    public final void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102056a;
        if (dmtCutMusicScrollView == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setAudioWaveViewData(aVMusicWaveBean);
    }

    public final void setBubbleText(String str) {
        DmtBubbleTextView dmtBubbleTextView = this.f102057b;
        if (dmtBubbleTextView == null) {
            C7573i.m23583a("bubbleTextView");
        }
        dmtBubbleTextView.setText(str);
    }

    public final void setBubbleTextViewAttrite(C39296a aVar) {
        C7573i.m23587b(aVar, "attrite");
        DmtBubbleTextView dmtBubbleTextView = this.f102057b;
        if (dmtBubbleTextView == null) {
            C7573i.m23583a("bubbleTextView");
        }
        dmtBubbleTextView.setAttribute(aVar);
    }

    public final void setScrollListener(C39297a aVar) {
        C7573i.m23587b(aVar, "scrollListener");
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102056a;
        if (dmtCutMusicScrollView == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.setScrollListener(aVar);
    }

    public final void setTimeBubble(int i) {
        String str = this.f102059d;
        if (str == null) {
            C7573i.m23583a("bubbleText");
        }
        String a = C1642a.m8034a(str, Arrays.copyOf(new Object[]{C39314b.m125638a((long) i)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        setBubbleText(a);
    }

    /* renamed from: a */
    private final void m125565a(Context context) {
        setOrientation(1);
        DmtCutMusicScrollView dmtCutMusicScrollView = new DmtCutMusicScrollView(context, null, 0, 6, null);
        this.f102056a = dmtCutMusicScrollView;
        this.f102057b = new DmtBubbleTextView(context, null, 2, null);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) C9738o.m28708b(context, 8.0f);
        layoutParams.leftMargin = (int) C9738o.m28708b(context, 8.0f);
        layoutParams.gravity = 3;
        DmtBubbleTextView dmtBubbleTextView = this.f102057b;
        if (dmtBubbleTextView == null) {
            C7573i.m23583a("bubbleTextView");
        }
        dmtBubbleTextView.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        DmtCutMusicScrollView dmtCutMusicScrollView2 = this.f102056a;
        if (dmtCutMusicScrollView2 == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView2.setLayoutParams(layoutParams2);
        DmtBubbleTextView dmtBubbleTextView2 = this.f102057b;
        if (dmtBubbleTextView2 == null) {
            C7573i.m23583a("bubbleTextView");
        }
        addView(dmtBubbleTextView2);
        DmtCutMusicScrollView dmtCutMusicScrollView3 = this.f102056a;
        if (dmtCutMusicScrollView3 == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        addView(dmtCutMusicScrollView3);
        DmtCutMusicScrollView dmtCutMusicScrollView4 = this.f102056a;
        if (dmtCutMusicScrollView4 == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView4.setWaveColor(this.f102058c);
        String string = getResources().getString(R.string.amn);
        C7573i.m23582a((Object) string, "resources.getString(R.string.cut_music_start_hint)");
        this.f102059d = string;
    }

    /* renamed from: a */
    public final void mo97826a(float f, boolean z) {
        DmtCutMusicScrollView dmtCutMusicScrollView = this.f102056a;
        if (dmtCutMusicScrollView == null) {
            C7573i.m23583a("cutMusicScrollView");
        }
        dmtCutMusicScrollView.mo97834a(f, z);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i, 0);
        this.f102058c = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        m125565a(context);
    }

    public /* synthetic */ DmtCutMusicLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
