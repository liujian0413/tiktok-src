package com.p280ss.android.ugc.aweme.out;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.filter.C29248bh;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.IMedialibConfigService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.out.MedialibConfigService */
public class MedialibConfigService implements IMedialibConfigService {
    public String getMusicEffectName(int i) {
        return "";
    }

    public String getMusicEffectPath(int i) {
        return "";
    }

    public String getMusicEffectPngPath(int i) {
        return "";
    }

    public String getSenseMeLic() {
        return null;
    }

    public boolean isOwnFaceDetectEnabled() {
        return true;
    }

    public String getStickerDir() {
        return C29248bh.m95936a();
    }

    public String getFaceReshapePath() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterFaceReshapeDir();
    }

    public List<C29296g> getFilterList() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74860b();
    }

    public void refreshFilterData() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
    }

    public String getBeautyFacePath(int i) {
        return C29248bh.m95942c(i);
    }

    public String getBeautyFacePath1_1(int i) {
        return C29248bh.m95943d(i);
    }

    public String getFilterPath(int i) {
        return C29248bh.m95937a(i);
    }

    public String getFilterPngPath(int i) {
        return C29248bh.m95939b(i);
    }

    public String getFilterEnName(int i) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74866g(i);
    }

    public String getFilterFileFolder(int i) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74861c(i);
    }

    public String getFilterFilePath(int i) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74859b(i);
    }

    public String getFilterName(int i) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74865f(i);
    }

    public Uri getFilterThumbnailUri(int i) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74864e(i);
    }
}
