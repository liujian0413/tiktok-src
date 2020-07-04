package com.p280ss.android.ugc.aweme.beauty;

import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautyCategory */
public final class BeautyCategory {
    private final BeautyCategoryExtra beautyCategoryExtra;
    private final EffectCategoryResponse categoryResponse;
    private boolean selected;

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int hashCode() {
        String str = this.categoryResponse.f113500id;
        if (str != null) {
            return str.hashCode();
        }
        return this.categoryResponse.hashCode();
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BeautyCategory) {
            return C7573i.m23585a((Object) ((BeautyCategory) obj).categoryResponse.f113500id, (Object) this.categoryResponse.f113500id);
        }
        return false;
    }

    public BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, boolean z) {
        C7573i.m23587b(effectCategoryResponse, "categoryResponse");
        C7573i.m23587b(beautyCategoryExtra2, "beautyCategoryExtra");
        this.categoryResponse = effectCategoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra2;
        this.selected = z;
    }

    public /* synthetic */ BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, boolean z, int i, C7571f fVar) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(effectCategoryResponse, beautyCategoryExtra2, z);
    }
}
