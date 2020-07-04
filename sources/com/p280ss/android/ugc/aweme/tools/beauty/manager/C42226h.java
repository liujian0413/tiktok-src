package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryExtra;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.tools.beauty.C42188h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.h */
public final class C42226h {
    /* renamed from: a */
    public static final boolean m134341a(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$isNoneOrZeroRes");
        if (composerBeauty.getExtra().isNone() || C42188h.m134212a(composerBeauty) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m134342b(ComposerBeauty composerBeauty) {
        boolean z;
        C7573i.m23587b(composerBeauty, "$this$isAlbum");
        CharSequence parentId = composerBeauty.getParentId();
        if (parentId == null || parentId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m134344d(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$isExclusive");
        if (m134342b(composerBeauty) || m134343c(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m134343c(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$isCategoryExclusive");
        if (!m134342b(composerBeauty)) {
            BeautyCategory category = composerBeauty.getCategory();
            if (category != null) {
                BeautyCategoryExtra beautyCategoryExtra = category.getBeautyCategoryExtra();
                if (beautyCategoryExtra != null && beautyCategoryExtra.getExclusive()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final List<ComposerBeauty> m134340a(Map<BeautyCategory, List<ComposerBeauty>> map) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            return arrayList;
        }
        for (Entry value : map.entrySet()) {
            for (ComposerBeauty composerBeauty : (Iterable) value.getValue()) {
                if (composerBeauty.isCollectionType()) {
                    List childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Collection collection = childList;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(!z)) {
                            childList = null;
                        }
                        if (childList != null) {
                            arrayList.addAll(childList);
                        }
                    }
                } else {
                    arrayList.add(composerBeauty);
                }
            }
        }
        return arrayList;
    }
}
