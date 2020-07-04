package com.p280ss.android.ugc.aweme.movie.p1403b;

import android.os.Handler;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33645c;
import com.p280ss.android.ugc.aweme.movie.view.C33665a;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.b.a */
public final class C33647a extends C25652b<C25640a<C33645c>, C33665a> {

    /* renamed from: a */
    public static final C33649a f87815a = new C33649a(null);

    /* renamed from: com.ss.android.ugc.aweme.movie.b.a$a */
    public static final class C33649a {
        private C33649a() {
        }

        public /* synthetic */ C33649a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.b.a$b */
    static final class C33650b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f87817a;

        C33650b(String str) {
            this.f87817a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33645c call() {
            return MovieDetailAPi.f87814b.mo86028a(this.f87817a);
        }
    }

    public C33647a() {
        mo66536a(new C25640a<C33645c>(this) {

            /* renamed from: a */
            final /* synthetic */ C33647a f87816a;

            public final boolean checkParams(Object... objArr) {
                C7573i.m23587b(objArr, "params");
                return true;
            }

            {
                this.f87816a = r1;
            }

            public final boolean sendRequest(Object... objArr) {
                C7573i.m23587b(objArr, "params");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C6309f fVar = this.mHandler;
                C7573i.m23582a((Object) fVar, "mHandler");
                Handler handler = fVar;
                String str = objArr[1];
                if (str != null) {
                    C33647a.m108580a(handler, str);
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            C33665a aVar = (C33665a) this.f67572c;
            C25640a aVar2 = this.f67571b;
            C7573i.m23582a((Object) aVar2, "mModel");
            Object data = aVar2.getData();
            C7573i.m23582a(data, "mModel.data");
            aVar.mo86054a((C33645c) data);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (this.f67572c != null) {
            ((C33665a) this.f67572c).mo86055a(exc);
        }
    }

    /* renamed from: a */
    public static void m108580a(Handler handler, String str) {
        C23397p.f61597b.mo60807a(handler, new C33650b(str), 0);
    }
}
