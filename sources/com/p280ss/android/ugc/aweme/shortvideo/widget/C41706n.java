package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p354j.C47846c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.n */
public final class C41706n {

    /* renamed from: b */
    public static final C41709a f108560b = new C41709a(null);

    /* renamed from: a */
    public final int f108561a;

    /* renamed from: c */
    private final C38632c f108562c;

    /* renamed from: d */
    private final C7492s<Pair<Integer, Bitmap>> f108563d;

    /* renamed from: e */
    private final C47846c<Pair<Integer, Bitmap>> f108564e;

    /* renamed from: f */
    private boolean f108565f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.n$a */
    public static final class C41709a {
        private C41709a() {
        }

        public /* synthetic */ C41709a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C7492s<Pair<Integer, Bitmap>> mo102481a() {
        if (!this.f108565f) {
            this.f108563d.mo19189a((C7498y<? super T>) this.f108564e);
            this.f108565f = true;
        }
        return this.f108564e;
    }

    public C41706n(final C38632c cVar, final int i, final int i2, final int i3) {
        C7573i.m23587b(cVar, "generator");
        C47846c<Pair<Integer, Bitmap>> a = C47846c.m148754a();
        C7573i.m23582a((Object) a, "ReplaySubject.create()");
        this.f108564e = a;
        this.f108562c = cVar;
        C7492s<Pair<Integer, Bitmap>> a2 = C7492s.m23282a((C7495v<T>) new C7495v<T>() {
            public final void subscribe(final C47870u<Pair<Integer, Bitmap>> uVar) {
                C7573i.m23587b(uVar, "emitter");
                final AtomicInteger atomicInteger = new AtomicInteger();
                cVar.mo88419a(i, i2, new C38633a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C417071 f108570a;

                    {
                        this.f108570a = r1;
                    }

                    /* renamed from: a */
                    public final void mo96651a(int i, Bitmap bitmap) {
                        uVar.mo19239a((Object) new Pair(Integer.valueOf(i), bitmap));
                        if (atomicInteger.incrementAndGet() == i3) {
                            uVar.mo19238a();
                        }
                    }
                });
            }
        });
        C7573i.m23582a((Object) a2, "Observable.create { emit…}\n            }\n        }");
        this.f108563d = a2;
        this.f108561a = i3;
    }
}
