package com.bytedance.android.live.broadcast.p134e;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.e.e */
public final class C2567e {

    /* renamed from: a */
    public static final C2568a f8241a = new C2568a(null);

    /* renamed from: com.bytedance.android.live.broadcast.e.e$a */
    public static final class C2568a {
        private C2568a() {
        }

        public /* synthetic */ C2568a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m10552a(LiveMode liveMode) {
            C7573i.m23587b(liveMode, "liveMode");
            switch (C2569f.f8242a[liveMode.ordinal()]) {
                case 1:
                    return "video_live";
                case 2:
                    return "game";
                case 3:
                    return "third_party";
                case 4:
                    return "voice_live";
                default:
                    return "";
            }
        }

        /* renamed from: a */
        public static String m10553a(Integer num) {
            if (num != null && num.intValue() == 0) {
                return "default";
            }
            if (num != null && num.intValue() == 1) {
                return "writing";
            }
            if (num != null && num.intValue() == 2) {
                return "none";
            }
            return "";
        }
    }
}
