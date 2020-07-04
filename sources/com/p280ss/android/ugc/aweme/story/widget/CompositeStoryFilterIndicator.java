package com.p280ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39368b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator */
public final class CompositeStoryFilterIndicator extends LinearLayout {

    /* renamed from: a */
    private final StoryFilterIndicator f109483a = new StoryFilterIndicator(getContext());

    /* renamed from: b */
    private final StoryFilterIndicator f109484b = new StoryFilterIndicator(getContext());

    /* renamed from: a */
    public final void mo103466a(C39368b bVar, C39368b bVar2, boolean z) {
        mo103467a(bVar, bVar2, z, false);
    }

    public CompositeStoryFilterIndicator(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        setOrientation(1);
        addView(this.f109483a);
        addView(this.f109484b);
        this.f109484b.setScaleX(0.5f);
        this.f109484b.setScaleY(0.5f);
    }

    public CompositeStoryFilterIndicator(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        setOrientation(1);
        addView(this.f109483a);
        addView(this.f109484b);
        this.f109484b.setScaleX(0.5f);
        this.f109484b.setScaleY(0.5f);
    }

    public CompositeStoryFilterIndicator(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        setOrientation(1);
        addView(this.f109483a);
        addView(this.f109484b);
        this.f109484b.setScaleX(0.5f);
        this.f109484b.setScaleY(0.5f);
    }

    /* renamed from: a */
    public final void mo103467a(C39368b bVar, C39368b bVar2, boolean z, boolean z2) {
        String str;
        String str2;
        C7573i.m23587b(bVar, "pre");
        C7573i.m23587b(bVar2, "cur");
        if (z2) {
            str = "";
        } else {
            str = bVar.f102266a;
        }
        if (z2) {
            str2 = "";
        } else {
            str2 = bVar.f102267b;
        }
        this.f109483a.mo103480a(str, bVar2.f102266a, z);
        this.f109484b.mo103480a(str2, bVar2.f102267b, z);
        setVisibility(0);
    }
}
