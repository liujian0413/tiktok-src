package com.p280ss.android.ugc.aweme.mix;

import com.C1642a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.r */
public final class C33564r {
    /* renamed from: a */
    public static final String m108441a(long j) {
        String a = C1642a.m8034a("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))}, 2));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        return a;
    }
}
