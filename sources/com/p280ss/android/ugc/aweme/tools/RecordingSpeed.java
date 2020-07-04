package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.RecordingSpeed */
public enum RecordingSpeed {
    EPIC {
        public final String description() {
            return "slowest";
        }

        public final float value() {
            return 0.333333f;
        }
    },
    SLOW {
        public final String description() {
            return "slower";
        }

        public final float value() {
            return 0.5f;
        }
    },
    NORMAL {
        public final String description() {
            return "normal";
        }

        public final float value() {
            return 1.0f;
        }
    },
    STORY_BOOM {
        public final String description() {
            return "story_boom";
        }

        public final float value() {
            return 1.5f;
        }
    },
    FAST {
        public final String description() {
            return "faster";
        }

        public final float value() {
            return 2.0f;
        }
    },
    LAPSE {
        public final String description() {
            return "fastest";
        }

        public final float value() {
            return 3.0f;
        }
    };

    public abstract String description();

    public abstract float value();

    public static RecordingSpeed fromValue(float f) {
        if (f == EPIC.value()) {
            return EPIC;
        }
        if (f == SLOW.value()) {
            return SLOW;
        }
        if (f == NORMAL.value()) {
            return NORMAL;
        }
        if (f == FAST.value()) {
            return FAST;
        }
        if (f == LAPSE.value()) {
            return LAPSE;
        }
        if (f == STORY_BOOM.value()) {
            return STORY_BOOM;
        }
        return null;
    }
}
