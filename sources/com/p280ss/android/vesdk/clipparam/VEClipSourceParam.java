package com.p280ss.android.vesdk.clipparam;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipSourceParam */
public class VEClipSourceParam {
    public static final int TEClipSourceType_AVFILE = 0;
    public static final int TEClipSourceType_ClipRef = 2;
    public static final int TEClipSourceType_Color = 1;
    public static final int TEClipSourceType_Unknown = -1;
    public int clipColorValue;
    public String clipFilePath;
    public int clipHeight;
    public int clipRefIndex;
    public int clipWidth;
    public int sourceType;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("sourceType: ");
        sb.append(this.sourceType);
        sb.append(" clipFilePath: ");
        if (this.clipFilePath == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = this.clipFilePath;
        }
        sb.append(str);
        sb.append(" clipRefIndex: ");
        sb.append(this.clipRefIndex);
        sb.append(" clipColorValue: ");
        sb.append(this.clipColorValue);
        sb.append(" clipWidth: ");
        sb.append(this.clipWidth);
        sb.append(" clipHeight: ");
        sb.append(this.clipHeight);
        return sb.toString();
    }
}
