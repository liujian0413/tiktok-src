package com.squareup.okhttp.internal.framed;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Arrays;

public final class Settings {
    private int persistValue;
    private int persisted;
    private int set;
    private final int[] values = new int[10];

    /* access modifiers changed from: 0000 */
    public final int size() {
        return Integer.bitCount(this.set);
    }

    /* access modifiers changed from: 0000 */
    public final void clear() {
        this.persisted = 0;
        this.persistValue = 0;
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    /* access modifiers changed from: 0000 */
    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isFlowControlDisabled() {
        int i;
        if ((this.set & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            i = this.values[10];
        } else {
            i = 0;
        }
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int get(int i) {
        return this.values[i];
    }

    /* access modifiers changed from: 0000 */
    public final int getClientCertificateVectorSize(int i) {
        if ((this.set & 256) != 0) {
            return this.values[8];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getCurrentCwnd(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getDownloadBandwidth(int i) {
        if ((this.set & 4) != 0) {
            return this.values[2];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getDownloadRetransRate(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getInitialWindowSize(int i) {
        if ((this.set & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            return this.values[7];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getMaxConcurrentStreams(int i) {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getMaxFrameSize(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getMaxHeaderListSize(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getRoundTripTime(int i) {
        if ((this.set & 8) != 0) {
            return this.values[3];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final int getUploadBandwidth(int i) {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPersisted(int i) {
        if (((1 << i) & this.persisted) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isSet(int i) {
        if (((1 << i) & this.set) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean persistValue(int i) {
        if (((1 << i) & this.persistValue) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int flags(int i) {
        int i2;
        if (isPersisted(i)) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (persistValue(i)) {
            return i2 | 1;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean getEnablePush(boolean z) {
        int i;
        if ((this.set & 4) != 0) {
            i = this.values[2];
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void merge(Settings settings) {
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                set(i, settings.flags(i), settings.get(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final Settings set(int i, int i2, int i3) {
        if (i >= this.values.length) {
            return this;
        }
        int i4 = 1 << i;
        this.set |= i4;
        if ((i2 & 1) != 0) {
            this.persistValue |= i4;
        } else {
            this.persistValue &= i4 ^ -1;
        }
        if ((i2 & 2) != 0) {
            this.persisted |= i4;
        } else {
            this.persisted &= i4 ^ -1;
        }
        this.values[i] = i3;
        return this;
    }
}
