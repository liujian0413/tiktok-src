package com.p280ss.android.ugc.aweme.tools.beauty;

import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p280ss.android.ugc.aweme.tools.beauty.C42186g.C42187a;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.h */
public final class C42188h {
    /* renamed from: a */
    public static final int m134212a(ComposerBeauty composerBeauty) {
        boolean z;
        C7573i.m23587b(composerBeauty, "$this$getSeekBarProgress");
        List items = composerBeauty.getBeautifyExtra().getItems();
        Collection collection = items;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            items = null;
        }
        if (items == null) {
            return 0;
        }
        C42187a aVar = new C42187a(((ItemsBean) items.get(0)).getDoubleDirectionin(), 100, 0, 0, ((ItemsBean) items.get(0)).getMax(), ((ItemsBean) items.get(0)).getMin(), C42194c.f109764a.mo103637b(composerBeauty, ((ItemsBean) items.get(0)).getTag(), ((ItemsBean) items.get(0)).getValue()), 0, 140, null);
        return C42186g.m134211b(aVar).f109758h;
    }
}
