package com.facebook.ads.internal.api;

import android.view.View;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

public interface MediaViewApi {
    void bringChildToFront(View view);

    void destroy();

    View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView, MediaViewParentApi mediaViewParentApi);

    void setListener(MediaViewListener mediaViewListener);

    void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer);
}
