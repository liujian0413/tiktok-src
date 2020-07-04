package com.p280ss.android.ugc.aweme.beauty;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeauty */
public final class ComposerBeauty {
    private C23530a add2Nodes;
    private final ComposerBeautyExtraBeautify beautifyExtra;
    private BeautyCategory category;
    private List<ComposerBeauty> childList;
    private final Effect effect;
    private boolean enable;
    private final ComposerBeautyExtra extra;
    private boolean isCollectionType;
    private String parentId;
    private String parentName;
    private int progressValue;
    private boolean selected;
    private boolean showDot;

    public final C23530a getAdd2Nodes() {
        return this.add2Nodes;
    }

    public final ComposerBeautyExtraBeautify getBeautifyExtra() {
        return this.beautifyExtra;
    }

    public final BeautyCategory getCategory() {
        return this.category;
    }

    public final List<ComposerBeauty> getChildList() {
        return this.childList;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ComposerBeautyExtra getExtra() {
        return this.extra;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final int getProgressValue() {
        return this.progressValue;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowDot() {
        return this.showDot;
    }

    public final boolean isCollectionType() {
        return this.isCollectionType;
    }

    public final int hashCode() {
        return C23538h.m77304a(this.effect.getEffectId());
    }

    public final void setCategory(BeautyCategory beautyCategory) {
        this.category = beautyCategory;
    }

    public final void setChildList(List<ComposerBeauty> list) {
        this.childList = list;
    }

    public final void setCollectionType(boolean z) {
        this.isCollectionType = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setParentName(String str) {
        this.parentName = str;
    }

    public final void setProgressValue(int i) {
        this.progressValue = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowDot(boolean z) {
        this.showDot = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeauty)) {
            return false;
        }
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        if (!C7573i.m23585a((Object) composerBeauty.effect.getEffectId(), (Object) this.effect.getEffectId()) || !C7573i.m23585a((Object) this.category, (Object) composerBeauty.category) || !C7573i.m23585a((Object) this.parentId, (Object) composerBeauty.parentId)) {
            return false;
        }
        return true;
    }

    public final void setAdd2Nodes(C23530a aVar) {
        C7573i.m23587b(aVar, "value");
        this.add2Nodes = aVar;
        if (this.add2Nodes.f62104b) {
            if (aVar.f62103a) {
                C23539i n = C35574k.m114859a().mo70099n();
                String effectId = this.effect.getEffectId();
                C7573i.m23582a((Object) effectId, "effect.effectId");
                n.mo61326a(new C23534e(effectId, 1), true);
                return;
            }
            C23539i n2 = C35574k.m114859a().mo70099n();
            String effectId2 = this.effect.getEffectId();
            C7573i.m23582a((Object) effectId2, "effect.effectId");
            n2.mo61326a(new C23534e(effectId2, 1), false);
        }
    }

    public ComposerBeauty(Effect effect2, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, BeautyCategory beautyCategory, String str, String str2, boolean z, List<ComposerBeauty> list, boolean z2, boolean z3, int i, boolean z4) {
        C7573i.m23587b(effect2, "effect");
        C7573i.m23587b(composerBeautyExtra, "extra");
        C7573i.m23587b(composerBeautyExtraBeautify, "beautifyExtra");
        this.effect = effect2;
        this.extra = composerBeautyExtra;
        this.beautifyExtra = composerBeautyExtraBeautify;
        this.category = beautyCategory;
        this.parentId = str;
        this.parentName = str2;
        this.isCollectionType = z;
        this.childList = list;
        this.selected = z2;
        this.showDot = z3;
        this.progressValue = i;
        this.enable = z4;
        this.add2Nodes = new C23530a(false, false, 1, null);
    }

    public /* synthetic */ ComposerBeauty(Effect effect2, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, BeautyCategory beautyCategory, String str, String str2, boolean z, List list, boolean z2, boolean z3, int i, boolean z4, int i2, C7571f fVar) {
        BeautyCategory beautyCategory2;
        String str3;
        String str4;
        boolean z5;
        List list2;
        boolean z6;
        boolean z7;
        int i3;
        boolean z8;
        int i4 = i2;
        if ((i4 & 8) != 0) {
            beautyCategory2 = null;
        } else {
            beautyCategory2 = beautyCategory;
        }
        if ((i4 & 16) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i4 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i4 & 64) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i4 & 256) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 512) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i4 & 2048) != 0) {
            z8 = true;
        } else {
            z8 = z4;
        }
        this(effect2, composerBeautyExtra, composerBeautyExtraBeautify, beautyCategory2, str3, str4, z5, list2, z6, z7, i3, z8);
    }
}
