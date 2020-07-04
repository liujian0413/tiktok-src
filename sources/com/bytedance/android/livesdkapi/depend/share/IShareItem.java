package com.bytedance.android.livesdkapi.depend.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.share.IShareAble.SharePlatform;
import java.io.Serializable;

public interface IShareItem extends Serializable {
    boolean canShare();

    String getDisplayName();

    String getDotName();

    ImageModel getImageModel();

    String getKey();

    int getResId();

    SharePlatform getSharePlatform();

    boolean showRedDot();
}
