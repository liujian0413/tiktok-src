package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.ugc.aweme.app.p305g.C22983b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.app.DownloadMessageMonitorUtils */
public final class DownloadMessageMonitorUtils {

    /* renamed from: com.ss.android.ugc.aweme.app.DownloadMessageMonitorUtils$ForbidType */
    public enum ForbidType {
        PRIVATE,
        AUDITING,
        SDCARD,
        AWEME,
        NETWORK,
        DOWNLOAD_URL,
        SUFFIX_LOGO_DOWNLOAD_URL,
        PLAY_URL,
        PREVENT_DOWNLOAD,
        UI_ALIKE_WATERMARK_DOWNLOAD_URL
    }

    /* renamed from: a */
    private static void m74934a(String str) {
        m74935a(str, "");
    }

    /* renamed from: a */
    private static void m74935a(String str, String str2) {
        C22983b.m75610a("aweme_movie_download_error_message", "download", str, str2);
    }

    /* renamed from: a */
    public static final void m74932a(ForbidType forbidType, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:");
        sb.append("ForbidType:");
        sb.append(forbidType);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id");
            sb.append(aweme.getAid());
        }
        m74934a(sb.toString());
    }

    /* renamed from: a */
    public static final void m74933a(Aweme aweme, BaseException baseException, String str) {
        StringBuilder sb = new StringBuilder("DownloaderError:");
        if (baseException != null) {
            sb.append("error_code:");
            sb.append(baseException.getErrorCode());
            sb.append(",");
            sb.append("error_message:");
            sb.append(baseException.getMessage());
        }
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id:");
            sb.append(aweme.getAid());
        }
        m74935a(sb.toString(), str);
    }

    /* renamed from: a */
    public static final void m74936a(String str, String str2, Aweme aweme) {
        StringBuilder sb = new StringBuilder("WaterMark:");
        sb.append("inputPath:");
        sb.append(str);
        sb.append(",");
        sb.append("outputPath:");
        sb.append(str2);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id:");
            sb.append(aweme.getAid());
        }
        m74934a(sb.toString());
    }
}
