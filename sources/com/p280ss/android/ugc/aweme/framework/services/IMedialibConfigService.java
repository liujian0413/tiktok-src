package com.p280ss.android.ugc.aweme.framework.services;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IMedialibConfigService */
public interface IMedialibConfigService {
    String getBeautyFacePath(int i);

    String getBeautyFacePath1_1(int i);

    String getFaceReshapePath();

    String getFilterEnName(int i);

    String getFilterFileFolder(int i);

    String getFilterFilePath(int i);

    List<C29296g> getFilterList();

    String getFilterName(int i);

    String getFilterPath(int i);

    String getFilterPngPath(int i);

    Uri getFilterThumbnailUri(int i);

    String getMusicEffectName(int i);

    String getMusicEffectPath(int i);

    String getMusicEffectPngPath(int i);

    String getSenseMeLic();

    String getStickerDir();

    boolean isOwnFaceDetectEnabled();

    void refreshFilterData();
}
