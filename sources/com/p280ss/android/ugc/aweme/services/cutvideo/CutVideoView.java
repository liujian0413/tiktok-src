package com.p280ss.android.ugc.aweme.services.cutvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.CutVideoView */
public final class CutVideoView extends FrameLayout implements ICutVideo, ICutViewInternal {
    private HashMap _$_findViewCache;
    private ICutVideo proxy;

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

    public final ICutVideo getProxy() {
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo == null) {
            C7573i.m23580a();
        }
        return iCutVideo;
    }

    public final void compile() {
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo != null) {
            iCutVideo.compile();
        }
    }

    public final void restore() {
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo != null) {
            iCutVideo.restore();
        }
    }

    public CutVideoView(Context context) {
        super(context);
    }

    public final void setProxy(ICutVideo iCutVideo) {
        C7573i.m23587b(iCutVideo, "proxy");
        this.proxy = iCutVideo;
    }

    public final void initInternal(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        ICutViewInternal iCutViewInternal = (ICutViewInternal) this.proxy;
        if (iCutViewInternal != null) {
            iCutViewInternal.initInternal(viewGroup);
        }
    }

    public final void setListener(ICutVideoListener iCutVideoListener) {
        C7573i.m23587b(iCutVideoListener, "listener");
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo != null) {
            iCutVideo.setListener(iCutVideoListener);
        }
    }

    public final void attachDisplayView(DisplayVideoView displayVideoView) {
        C7573i.m23587b(displayVideoView, "displayView");
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo != null) {
            iCutVideo.attachDisplayView(displayVideoView);
        }
        displayVideoView.setCutVideoView(this);
        displayVideoView.init(null);
    }

    public CutVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CutVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void init(String str, String str2, long j, long j2) {
        C7573i.m23587b(str, "inputPath");
        C7573i.m23587b(str2, "outputPath");
        ICutVideo iCutVideo = this.proxy;
        if (iCutVideo != null) {
            iCutVideo.init(str, str2, j, j2);
        }
        ICutViewInternal iCutViewInternal = (ICutViewInternal) this.proxy;
        if (iCutViewInternal != null) {
            iCutViewInternal.initInternal(this);
        }
    }
}
