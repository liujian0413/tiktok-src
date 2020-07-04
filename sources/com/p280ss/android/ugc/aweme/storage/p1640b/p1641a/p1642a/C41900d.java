package com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.p1642a;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.a.a.d */
public final class C41900d extends C41898b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo102937a() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f108977a.f72034c;
        String str3 = null;
        if (photoMovieContext != null) {
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            str = null;
        }
        long a = m133251a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f108977a.f72034c;
        if (photoMovieContext2 != null) {
            str2 = photoMovieContext2.mOutputVideoPath;
        } else {
            str2 = null;
        }
        long a2 = a + m133251a(str2);
        PhotoMovieContext photoMovieContext3 = this.f108977a.f72034c;
        if (photoMovieContext3 != null) {
            str3 = photoMovieContext3.mInputAudioPath;
        }
        return a2 + m133251a(str3);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo102938b() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.draft.model.c r0 = r6.f108977a
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r0.f72034c
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.mMusicPath
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            long r2 = m133251a(r0)
            r4 = 0
            long r2 = r2 + r4
            com.ss.android.ugc.aweme.draft.model.c r0 = r6.f108977a
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r0.f72034c
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.mFilterPath
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r0 = ""
        L_0x001e:
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.storage.b.b.a.b r4 = new com.ss.android.ugc.aweme.storage.b.b.a.b
            r5 = 3
            r4.<init>(r1, r1, r5, r1)
            com.ss.android.ugc.aweme.storage.b.b.a r1 = new com.ss.android.ugc.aweme.storage.b.b.a
            r1.<init>()
            r5 = r4
            com.ss.android.ugc.aweme.storage.b.b.a.c r5 = (com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c) r5
            r1.mo102941a(r5)
            r1.mo102943a(r0)
            long r0 = r4.f108983a
            long r2 = r2 + r0
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.p1642a.C41900d.mo102938b():long");
    }

    public C41900d(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        super(cVar);
    }
}
