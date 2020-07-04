package com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a */
public final class C39293a {

    /* renamed from: e */
    public static final C39294a f102018e = new C39294a(null);

    /* renamed from: a */
    public SEEK_MODE f102019a;

    /* renamed from: b */
    public long f102020b;

    /* renamed from: c */
    public final int f102021c;

    /* renamed from: d */
    public boolean f102022d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a$a */
    public static final class C39294a {
        private C39294a() {
        }

        public /* synthetic */ C39294a(C7571f fVar) {
            this();
        }
    }

    public C39293a(int i, boolean z) {
        this.f102021c = i;
        this.f102022d = z;
        this.f102019a = SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
    }

    public C39293a(int i, long j, SEEK_MODE seek_mode) {
        C7573i.m23587b(seek_mode, "seekMode");
        this(3, false, 2, null);
        this.f102020b = j;
        this.f102019a = seek_mode;
    }

    public /* synthetic */ C39293a(int i, boolean z, int i2, C7571f fVar) {
        this(i, true);
    }
}
