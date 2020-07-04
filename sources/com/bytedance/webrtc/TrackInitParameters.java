package com.bytedance.webrtc;

import java.util.ArrayList;
import java.util.List;

public class TrackInitParameters {
    public List<Encoding> encodings = new ArrayList();

    public static class Encoding {
        public Integer height;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer maxPlayoutDelay;
        public Integer minPlayoutDelay;
        public ScaleMode scaleMode;
        public Integer width;

        /* access modifiers changed from: 0000 */
        public Integer getHeight() {
            return this.height;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMaxPlayoutdelay() {
            return this.maxPlayoutDelay;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMinPlayoutdelay() {
            return this.minPlayoutDelay;
        }

        /* access modifiers changed from: 0000 */
        public ScaleMode getScaleMode() {
            return this.scaleMode;
        }

        /* access modifiers changed from: 0000 */
        public Integer getWidth() {
            return this.width;
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        /* access modifiers changed from: 0000 */
        public final int getIntValue() {
            return this.value;
        }

        static ScaleMode fromValue(int i) {
            switch (i) {
                case 0:
                    return AUTO;
                case 1:
                    return STRETCH;
                case 2:
                    return FIT_WITH_CROPPING;
                case 3:
                    return FIT_WITH_FILLING;
                default:
                    return AUTO;
            }
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    private static native long nativeCreateParameters(List<Encoding> list);

    public long getNativeParameters() {
        return nativeCreateParameters(this.encodings);
    }
}
