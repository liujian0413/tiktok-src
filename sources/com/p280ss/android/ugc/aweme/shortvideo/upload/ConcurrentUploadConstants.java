package com.p280ss.android.ugc.aweme.shortvideo.upload;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants */
public final class ConcurrentUploadConstants {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants$ConsumeStatus */
    public enum ConsumeStatus {
        CONSUME_DONE,
        CONSUME_WAIT_DATA,
        CONSUME_FAIL,
        CONSUME_END
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants$GetHeaderSizeStatus */
    public enum GetHeaderSizeStatus {
        GET_HEADER_SIZE_WAIT,
        GET_HEADER_SIZE_DONE
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ConcurrentUploadConstants$UploadStatus */
    public enum UploadStatus {
        UPLOAD_FINISH,
        UPLOAD_CANCEL,
        UPLOADING
    }
}
