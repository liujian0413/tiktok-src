package com.p280ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.services.video.IImVideoCompileService */
public interface IImVideoCompileService {

    /* renamed from: com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileParam */
    public static final class CompileParam {
        private final String rawVideoPath;
        private int videoHeight;
        private int videoWidth;

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompileParam{rawVideoPath=");
            sb.append(this.rawVideoPath);
            sb.append(", videoWidth=");
            sb.append(this.videoWidth);
            sb.append(", videoHeight=");
            sb.append(this.videoHeight);
            sb.append('}');
            return sb.toString();
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }

        public CompileParam(String str, int i, int i2) {
            C7573i.m23587b(str, "rawVideoPath");
            this.rawVideoPath = str;
            this.videoWidth = i;
            this.videoHeight = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileResult */
    public static final class CompileResult {
        private String checkPic;
        private String thumbnailPath;
        private int videoHeight = -1;
        private String videoMd5;
        private String videoPath;
        private int videoWidth = -1;

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompileResult{videoPath=");
            sb.append(this.videoPath);
            sb.append(", videoMd5=");
            sb.append(this.videoMd5);
            sb.append(", checkPic=");
            sb.append(this.checkPic);
            sb.append(", thumbnailPath=");
            sb.append(this.thumbnailPath);
            sb.append(", width=");
            sb.append(this.videoWidth);
            sb.append(", height=");
            sb.append(this.videoHeight);
            sb.append('}');
            return sb.toString();
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }
    }

    C7492s<CompileResult> compileImVideo(CompileParam compileParam);

    Bitmap fetchThumbnailByVBoostOpt(long j, long j2, boolean z, Options options);

    boolean getVideoFileInfoWithRotation(String str, int[] iArr);
}
