package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMovie */
public final class SearchMovie implements Serializable {
    @C6593c(mo15949a = "cover_video")
    private Aweme aweme;
    @C6593c(mo15949a = "banner")
    private MovieBanner banner;
    @C6593c(mo15949a = "bg_color")
    private String bgColor;
    @C6593c(mo15949a = "center_color")
    private String centerColor;
    @C6593c(mo15949a = "movie")
    private Movie movie;

    public static /* synthetic */ SearchMovie copy$default(SearchMovie searchMovie, Movie movie2, Aweme aweme2, MovieBanner movieBanner, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            movie2 = searchMovie.movie;
        }
        if ((i & 2) != 0) {
            aweme2 = searchMovie.aweme;
        }
        Aweme aweme3 = aweme2;
        if ((i & 4) != 0) {
            movieBanner = searchMovie.banner;
        }
        MovieBanner movieBanner2 = movieBanner;
        if ((i & 8) != 0) {
            str = searchMovie.bgColor;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = searchMovie.centerColor;
        }
        return searchMovie.copy(movie2, aweme3, movieBanner2, str3, str2);
    }

    public final Movie component1() {
        return this.movie;
    }

    public final Aweme component2() {
        return this.aweme;
    }

    public final MovieBanner component3() {
        return this.banner;
    }

    public final String component4() {
        return this.bgColor;
    }

    public final String component5() {
        return this.centerColor;
    }

    public final SearchMovie copy(Movie movie2, Aweme aweme2, MovieBanner movieBanner, String str, String str2) {
        C7573i.m23587b(movie2, "movie");
        SearchMovie searchMovie = new SearchMovie(movie2, aweme2, movieBanner, str, str2);
        return searchMovie;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.centerColor, (java.lang.Object) r3.centerColor) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchMovie
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.discover.model.SearchMovie r3 = (com.p280ss.android.ugc.aweme.discover.model.SearchMovie) r3
            com.ss.android.ugc.aweme.discover.model.Movie r0 = r2.movie
            com.ss.android.ugc.aweme.discover.model.Movie r1 = r3.movie
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.aweme
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.aweme
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.discover.model.MovieBanner r0 = r2.banner
            com.ss.android.ugc.aweme.discover.model.MovieBanner r1 = r3.banner
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.bgColor
            java.lang.String r1 = r3.bgColor
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.centerColor
            java.lang.String r3 = r3.centerColor
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.SearchMovie.equals(java.lang.Object):boolean");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final MovieBanner getBanner() {
        return this.banner;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final Movie getMovie() {
        return this.movie;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchMovie(movie=");
        sb.append(this.movie);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", bgColor=");
        sb.append(this.bgColor);
        sb.append(", centerColor=");
        sb.append(this.centerColor);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.movie.hashCode();
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setBanner(MovieBanner movieBanner) {
        this.banner = movieBanner;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setCenterColor(String str) {
        this.centerColor = str;
    }

    public final void setMovie(Movie movie2) {
        C7573i.m23587b(movie2, "<set-?>");
        this.movie = movie2;
    }

    public SearchMovie(Movie movie2, Aweme aweme2, MovieBanner movieBanner, String str, String str2) {
        C7573i.m23587b(movie2, "movie");
        this.movie = movie2;
        this.aweme = aweme2;
        this.banner = movieBanner;
        this.bgColor = str;
        this.centerColor = str2;
    }
}
