package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import com.facebook.ads.AdError;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager */
public final class MultiEditRecyleViewLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private final VideoSmoothScroller f103347a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager$VideoSmoothScroller */
    public final class VideoSmoothScroller extends LinearSmoothScroller {
        /* renamed from: a */
        public final float mo5464a(DisplayMetrics displayMetrics) {
            C7573i.m23587b(displayMetrics, "displayMetrics");
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: b */
        public final int mo5472b(int i) {
            if (i > 2000) {
                i = AdError.SERVER_ERROR_CODE;
            }
            return super.mo5472b(i);
        }

        public VideoSmoothScroller(Context context) {
            super(context);
        }
    }

    public MultiEditRecyleViewLayoutManager(Context context) {
        super(context, 0, false);
        this.f103347a = new VideoSmoothScroller(context);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        VideoSmoothScroller videoSmoothScroller = this.f103347a;
        videoSmoothScroller.f4993g = i;
        mo5755a((C1287r) videoSmoothScroller);
    }
}
