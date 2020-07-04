package net.jpountz.lz4;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

enum LZ4Utils {
    ;

    static class Match {
        int len;
        int ref;
        int start;

        Match() {
        }

        /* access modifiers changed from: 0000 */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: 0000 */
        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    static int hash(int i) {
        return (i * -1640531535) >>> 20;
    }

    static int hash64k(int i) {
        return (i * -1640531535) >>> 19;
    }

    static int hashHC(int i) {
        return (i * -1640531535) >>> 17;
    }

    static int maxCompressedLength(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("length must be >= 0, got ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 2113929216) {
            return i + (i / NormalGiftView.ALPHA_255) + 16;
        } else {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }
}
