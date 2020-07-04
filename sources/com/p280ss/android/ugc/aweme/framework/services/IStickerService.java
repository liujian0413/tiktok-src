package com.p280ss.android.ugc.aweme.framework.services;

import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IStickerService */
public interface IStickerService {

    /* renamed from: com.ss.android.ugc.aweme.framework.services.IStickerService$FaceSticker */
    public static class FaceSticker {
        public String extra;
        public ToolsUrlModel fileUrl;
        public String hint;
        public ToolsUrlModel iconUrl;

        /* renamed from: id */
        public String f78767id;
        public String localPath;
        public String name;
        public String sdkExtra;
        public long stickerId;
        public List<String> tags;
        public List<String> types;
    }
}
