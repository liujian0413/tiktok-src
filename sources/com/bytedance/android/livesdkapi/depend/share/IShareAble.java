package com.bytedance.android.livesdkapi.depend.share;

import java.io.Serializable;

public interface IShareAble extends Serializable {

    public enum SharePlatform {
        QQ,
        QZONE,
        WEIBO,
        WEIXIN,
        WEIXIN_MOMENT,
        ROCKET,
        ROCKET_TIMELINE,
        I18N
    }

    int getDefaultTumb();

    String getSSLocalUrl();

    String getShareDesc(SharePlatform sharePlatform);

    long getShareGroupId(SharePlatform sharePlatform);

    ShareScene getShareScene();

    String getShareTargetUrl();

    String getShareThumbUrl(SharePlatform sharePlatform);

    String getShareTitle(SharePlatform sharePlatform);

    boolean isWeiBoTopic();

    boolean needVideoPlayIcon();
}
