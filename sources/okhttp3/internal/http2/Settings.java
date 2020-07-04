package okhttp3.internal.http2;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Arrays;

public final class Settings {
    private int set;
    private final int[] values = new int[10];

    /* access modifiers changed from: 0000 */
    public final int size() {
        return Integer.bitCount(this.set);
    }

    /* access modifiers changed from: 0000 */
    public final void clear() {
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
    public final int getInitialWindowSize() {
        if ((this.set & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    public final int get(int i) {
        return this.values[i];
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
    public final boolean isSet(int i) {
        if (((1 << i) & this.set) != 0) {
            return true;
        }
        return false;
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
                set(i, settings.get(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final Settings set(int i, int i2) {
        if (i < 0 || i >= this.values.length) {
            return this;
        }
        this.set = (1 << i) | this.set;
        this.values[i] = i2;
        return this;
    }
}
