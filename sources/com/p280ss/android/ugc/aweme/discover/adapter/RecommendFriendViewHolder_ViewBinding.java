package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendFriendViewHolder_ViewBinding */
public class RecommendFriendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendFriendViewHolder f69613a;

    /* renamed from: b */
    private View f69614b;

    public void unbind() {
        RecommendFriendViewHolder recommendFriendViewHolder = this.f69613a;
        if (recommendFriendViewHolder != null) {
            this.f69613a = null;
            recommendFriendViewHolder.txtFindMore = null;
            recommendFriendViewHolder.txtInterested = null;
            recommendFriendViewHolder.recyclerView = null;
            this.f69614b.setOnClickListener(null);
            this.f69614b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendFriendViewHolder_ViewBinding(final RecommendFriendViewHolder recommendFriendViewHolder, View view) {
        this.f69613a = recommendFriendViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.akz, "field 'txtFindMore' and method 'goAddFriends'");
        recommendFriendViewHolder.txtFindMore = (TextView) Utils.castView(findRequiredView, R.id.akz, "field 'txtFindMore'", TextView.class);
        this.f69614b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendFriendViewHolder.goAddFriends();
            }
        });
        recommendFriendViewHolder.txtInterested = (TextView) Utils.findRequiredViewAsType(view, R.id.ca8, "field 'txtInterested'", TextView.class);
        recommendFriendViewHolder.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cpc, "field 'recyclerView'", RecyclerView.class);
    }
}
