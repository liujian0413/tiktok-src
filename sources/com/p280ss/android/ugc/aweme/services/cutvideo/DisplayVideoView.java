package com.p280ss.android.ugc.aweme.services.cutvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.DisplayVideoView */
public final class DisplayVideoView extends FrameLayout implements IDisplayVideo, IDisplayVideoInternal {
    private HashMap _$_findViewCache;
    private IDisplayVideo proxy;

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final IDisplayVideo getProxy() {
        IDisplayVideo iDisplayVideo = this.proxy;
        if (iDisplayVideo == null) {
            C7573i.m23580a();
        }
        return iDisplayVideo;
    }

    public DisplayVideoView(Context context) {
        super(context);
    }

    public final void setProxy(IDisplayVideo iDisplayVideo) {
        C7573i.m23587b(iDisplayVideo, "proxy");
        this.proxy = iDisplayVideo;
    }

    public final void init(ViewGroup viewGroup) {
        IDisplayVideoInternal iDisplayVideoInternal = (IDisplayVideoInternal) this.proxy;
        if (iDisplayVideoInternal != null) {
            iDisplayVideoInternal.init(this);
        }
    }

    public final void setCutVideoView(CutVideoView cutVideoView) {
        C7573i.m23587b(cutVideoView, "cutVideoView");
        IDisplayVideoInternal iDisplayVideoInternal = (IDisplayVideoInternal) this.proxy;
        if (iDisplayVideoInternal != null) {
            iDisplayVideoInternal.setCutVideoView(cutVideoView);
        }
    }

    public DisplayVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DisplayVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
