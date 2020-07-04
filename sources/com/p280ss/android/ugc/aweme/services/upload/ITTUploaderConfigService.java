package com.p280ss.android.ugc.aweme.services.upload;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.services.upload.ITTUploaderConfigService */
public interface ITTUploaderConfigService {
    C18253l<VideoCreation> getVideoCreation(UploadVideoType uploadVideoType, LinkedHashMap<String, String> linkedHashMap);
}
