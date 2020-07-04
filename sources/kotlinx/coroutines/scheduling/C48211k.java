package kotlinx.coroutines.scheduling;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.TimeUnit;
import kotlin.p356e.C7551d;
import kotlinx.coroutines.internal.C48179w;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C48211k {

    /* renamed from: a */
    public static final long f123104a = C48179w.m149477a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f123105b = C48179w.m149476a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 4, (Object) null);

    /* renamed from: c */
    public static final int f123106c = C48179w.m149476a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: d */
    public static final int f123107d = C48179w.m149476a("kotlinx.coroutines.scheduler.core.pool.size", C7551d.m23566c(C48179w.m149474a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: e */
    public static final int f123108e = C48179w.m149476a("kotlinx.coroutines.scheduler.max.pool.size", C7551d.m23560a(C48179w.m149474a() * PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, f123107d, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: f */
    public static final long f123109f = TimeUnit.SECONDS.toNanos(C48179w.m149477a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 1, Long.MAX_VALUE));

    /* renamed from: g */
    public static C48212l f123110g = C48206f.f123098a;
}
