package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder_ViewBinding */
public class CategoryViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CategoryViewHolder f69461a;

    public void unbind() {
        CategoryViewHolder categoryViewHolder = this.f69461a;
        if (categoryViewHolder != null) {
            this.f69461a = null;
            categoryViewHolder.mIvType = null;
            categoryViewHolder.mTvTitle = null;
            categoryViewHolder.mTvType = null;
            categoryViewHolder.mTvCount = null;
            categoryViewHolder.mListView = null;
            categoryViewHolder.mRoot = null;
            categoryViewHolder.mViewStubPlaceHolder = null;
            categoryViewHolder.mViewDiscoverBg = null;
            categoryViewHolder.mCategoryCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CategoryViewHolder_ViewBinding(CategoryViewHolder categoryViewHolder, View view) {
        this.f69461a = categoryViewHolder;
        categoryViewHolder.mIvType = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.bda, "field 'mIvType'", RemoteImageView.class);
        categoryViewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'mTvTitle'", TextView.class);
        categoryViewHolder.mTvType = (TextView) Utils.findRequiredViewAsType(view, R.id.e45, "field 'mTvType'", TextView.class);
        categoryViewHolder.mTvCount = (TextView) Utils.findRequiredViewAsType(view, R.id.dsr, "field 'mTvCount'", TextView.class);
        categoryViewHolder.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxi, "field 'mListView'", RecyclerView.class);
        categoryViewHolder.mRoot = Utils.findRequiredView(view, R.id.cwi, "field 'mRoot'");
        categoryViewHolder.mViewStubPlaceHolder = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eew, "field 'mViewStubPlaceHolder'", ViewStub.class);
        categoryViewHolder.mViewDiscoverBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.a9c, "field 'mViewDiscoverBg'", ImageView.class);
        categoryViewHolder.mCategoryCountView = Utils.findRequiredView(view, R.id.bmd, "field 'mCategoryCountView'");
    }
}
