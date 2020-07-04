package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Arrays;
import org.webrtc.EglBase.Context;

public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() {
        private String[] prefixWhitelist;

        public Predicate and(Predicate predicate) {
            return Predicate$$CC.and(this, predicate);
        }

        public Predicate negate() {
            return Predicate$$CC.negate(this);
        }

        /* renamed from: or */
        public Predicate mo122514or(Predicate predicate) {
            return Predicate$$CC.m150059or(this, predicate);
        }

        {
            String[] strArr = MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES;
            this.prefixWhitelist = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean test(MediaCodecInfo mediaCodecInfo) {
            String name = mediaCodecInfo.getName();
            for (String startsWith : this.prefixWhitelist) {
                if (name.startsWith(startsWith)) {
                    return true;
                }
            }
            return false;
        }
    };

    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public PlatformSoftwareVideoDecoderFactory(Context context) {
        super(context, defaultAllowedPredicate);
    }

    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }
}
