package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.MediaPreviewSettings */
public final class MediaPreviewSettings implements Serializable {
    public static final C31457a Companion = new C31457a(null);
    public static final MediaPreviewSettings DEFAULT = new MediaPreviewSettings(0, false, 3, null);
    private final int mode;
    private final boolean sendRaw;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.model.MediaPreviewSettings$a */
    public static final class C31457a {
        private C31457a() {
        }

        /* renamed from: a */
        public static MediaPreviewSettings m102301a() {
            return MediaPreviewSettings.DEFAULT;
        }

        public /* synthetic */ C31457a(C7571f fVar) {
            this();
        }
    }

    public MediaPreviewSettings() {
        this(0, false, 3, null);
    }

    public static final MediaPreviewSettings getDEFAULT() {
        return DEFAULT;
    }

    public final int getMode() {
        return this.mode;
    }

    public final boolean getSendRaw() {
        return this.sendRaw;
    }

    public final boolean isChooseMode() {
        if (this.mode == 1) {
            return true;
        }
        return false;
    }

    public MediaPreviewSettings(int i, boolean z) {
        this.mode = i;
        this.sendRaw = z;
    }

    public /* synthetic */ MediaPreviewSettings(int i, boolean z, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        this(i, z);
    }
}
