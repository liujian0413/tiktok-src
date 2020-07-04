package kotlin.text;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public enum RegexOption implements C7630f {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 0, 2, null);
    
    private final int mask;
    private final int value;

    public final int getMask() {
        return this.mask;
    }

    public final int getValue() {
        return this.value;
    }

    private RegexOption(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }
}
