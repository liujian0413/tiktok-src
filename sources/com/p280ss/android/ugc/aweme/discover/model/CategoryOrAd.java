package com.p280ss.android.ugc.aweme.discover.model;

import com.C1642a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryOrAd */
public final class CategoryOrAd implements Serializable {
    private static final long serialVersionUID = 42;

    /* renamed from: ad */
    public final CategoryListAdInfo f70737ad;
    public final Category category;

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isAd() {
        if (this.f70737ad != null) {
            return true;
        }
        return false;
    }

    public final boolean isCategory() {
        if (this.category != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isAd()) {
            return C1642a.m8034a("CategoryOrAd[Ad %d]", new Object[]{this.f70737ad.getAdId()});
        } else if (this.category.getChallenge() != null) {
            return C1642a.m8034a("CategoryOrAd[Category.challenge %s]", new Object[]{this.category.getChallenge().getDesc()});
        } else if (this.category.getMusic() != null) {
            return C1642a.m8034a("CategoryOrAd[Category.music %s]", new Object[]{this.category.getMusic().getAlbum()});
        } else if (this.category.getItems() == null) {
            return "CategoryOrAd[Category.unknown]";
        } else {
            return C1642a.m8034a("CategoryOrAd[Category.items %d]", new Object[]{Integer.valueOf(this.category.getItems().size())});
        }
    }

    public CategoryOrAd(Category category2) {
        this.category = category2;
    }

    public CategoryOrAd(CategoryListAdInfo categoryListAdInfo) {
        this.f70737ad = categoryListAdInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryOrAd)) {
            return false;
        }
        CategoryOrAd categoryOrAd = (CategoryOrAd) obj;
        if (!isCategory() || !categoryOrAd.isCategory()) {
            if (isAd() && categoryOrAd.isAd()) {
                return equals(this.f70737ad, categoryOrAd.f70737ad);
            }
        } else if (this.category.getChallenge() != null && categoryOrAd.category.getChallenge() != null) {
            return this.category.getChallenge().getCid().equals(categoryOrAd.category.getChallenge().getCid());
        } else {
            if (!(this.category.getMusic() == null || categoryOrAd.category.getMusic() == null)) {
                return this.category.getMusic().equals(categoryOrAd.category.getMusic());
            }
        }
        return false;
    }

    private boolean equals(Long l, Long l2) {
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    private boolean equals(CategoryListAdInfo categoryListAdInfo, CategoryListAdInfo categoryListAdInfo2) {
        if (categoryListAdInfo == categoryListAdInfo2) {
            return true;
        }
        if (categoryListAdInfo == null || categoryListAdInfo2 == null) {
            return false;
        }
        return equals(categoryListAdInfo.getAdId(), categoryListAdInfo2.getAdId());
    }
}
