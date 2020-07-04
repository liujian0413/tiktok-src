package com.p280ss.android.ugc.aweme.services.cutvideo;

import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.IDisplayVideoInternal */
public interface IDisplayVideoInternal {
    IDisplayVideo getProxy();

    void init(ViewGroup viewGroup);

    void setCutVideoView(CutVideoView cutVideoView);

    void setProxy(IDisplayVideo iDisplayVideo);
}
