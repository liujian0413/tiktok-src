package com.bytedance.ies.uikit.recyclerview;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.recyclerview.LoadingStatusView.Builder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {
    public ILoadMore mLoadMoreListener;
    private LoadMoreViewHolder mLoadMoreViewHolder;

    public interface ILoadMore {
        void loadMore(boolean z);
    }

    class LoadMoreViewHolder extends C1293v {
        public void reset() {
            ((LoadingStatusView) this.itemView).reset();
        }

        public void showError() {
            ((LoadingStatusView) this.itemView).showError();
        }

        public void showLoading() {
            ((LoadingStatusView) this.itemView).showLoading();
        }

        public void bind() {
            if (((LoadingStatusView) this.itemView).isReset() && LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(false);
            }
        }

        public LoadMoreViewHolder(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: protected */
    public int getErrorLayoutForLoadMore() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getLoadingLayoutForLoadMore() {
        return R.layout.a89;
    }

    public final int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public void resetLoadMoreState() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.reset();
        }
    }

    public void showLoadMoreError() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.showError();
        }
    }

    public void showLoadMoreLoading() {
        if (this.mLoadMoreViewHolder != null) {
            this.mLoadMoreViewHolder.showLoading();
        }
    }

    public void setLoadMoreListener(ILoadMore iLoadMore) {
        this.mLoadMoreListener = iLoadMore;
    }

    /* access modifiers changed from: protected */
    public int getFooterHeight(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.en);
    }

    public void onBindFooterViewHolder(C1293v vVar) {
        if (vVar instanceof LoadMoreViewHolder) {
            ((LoadMoreViewHolder) vVar).bind();
            LayoutParams layoutParams = (LayoutParams) this.mLoadMoreViewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
            }
            this.mLoadMoreViewHolder.itemView.setLayoutParams(layoutParams);
        }
    }

    public C1293v onCreateFooterViewHolder(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int footerHeight = getFooterHeight(viewGroup);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.eo);
        loadingStatusView.setLayoutParams(getFooterLayoutParams(-1, footerHeight));
        Builder builder = new Builder(viewGroup.getContext());
        builder.setUseProgressBar(dimensionPixelSize).setErrorText(R.string.c46, new OnClickListener() {
            public void onClick(View view) {
                if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                    LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                }
            }
        });
        if (getErrorLayoutForLoadMore() > 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(getErrorLayoutForLoadMore(), viewGroup, false);
            inflate.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
                        LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore(true);
                    }
                }
            });
            builder.setErrorView(inflate);
        }
        builder.setLoadingView(LayoutInflater.from(viewGroup.getContext()).inflate(getLoadingLayoutForLoadMore(), viewGroup, false));
        loadingStatusView.setBuilder(builder);
        this.mLoadMoreViewHolder = new LoadMoreViewHolder(loadingStatusView);
        return this.mLoadMoreViewHolder;
    }

    /* access modifiers changed from: protected */
    public LayoutParams getFooterLayoutParams(int i, int i2) {
        return new LayoutParams(i, i2);
    }
}
