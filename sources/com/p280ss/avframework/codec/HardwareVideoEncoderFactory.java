package com.p280ss.avframework.codec;

import com.p280ss.avframework.engine.VideoEncoder;
import com.p280ss.avframework.engine.VideoEncoderFactory;

/* renamed from: com.ss.avframework.codec.HardwareVideoEncoderFactory */
public class HardwareVideoEncoderFactory extends VideoEncoderFactory {
    public String GetSupportedFormats() {
        return "video_type=video/avc,video_enable_accelera=true:video_type=video/hevc,video_enable_accelera=true";
    }

    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        HardwareVideoEncoder h265HWVideoEncoder;
        HardwareVideoEncoder hardwareVideoEncoder = null;
        if (!z) {
            return null;
        }
        String[] split = str.split(":");
        String str2 = "";
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str3 = split[i];
            if (str3.contains("video_type")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1) {
                    str2 = split2[1];
                }
            } else {
                i++;
            }
        }
        if (str2.equalsIgnoreCase("video/avc")) {
            h265HWVideoEncoder = new H264HWVideoEncoder();
            if (!h265HWVideoEncoder.setupCodecName()) {
                h265HWVideoEncoder.release();
                return hardwareVideoEncoder;
            }
        } else {
            if (str2.equalsIgnoreCase("video/hevc")) {
                h265HWVideoEncoder = new H265HWVideoEncoder();
                if (!h265HWVideoEncoder.setupCodecName()) {
                    h265HWVideoEncoder.release();
                }
            }
            return hardwareVideoEncoder;
        }
        hardwareVideoEncoder = h265HWVideoEncoder;
        return hardwareVideoEncoder;
    }
}
