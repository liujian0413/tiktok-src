package kotlin.p1884io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.sequences.C7604g;

/* renamed from: kotlin.io.l */
final class C47989l implements C7604g<String> {

    /* renamed from: a */
    public final BufferedReader f122830a;

    /* renamed from: kotlin.io.l$a */
    public static final class C47990a implements Iterator<String>, C7565a {

        /* renamed from: a */
        final /* synthetic */ C47989l f122831a;

        /* renamed from: b */
        private String f122832b;

        /* renamed from: c */
        private boolean f122833c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f122832b;
                this.f122832b = null;
                if (str == null) {
                    C7573i.m23580a();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.f122832b == null && !this.f122833c) {
                this.f122832b = this.f122831a.f122830a.readLine();
                if (this.f122832b == null) {
                    this.f122833c = true;
                }
            }
            if (this.f122832b != null) {
                return true;
            }
            return false;
        }

        C47990a(C47989l lVar) {
            this.f122831a = lVar;
        }
    }

    /* renamed from: a */
    public final Iterator<String> mo19416a() {
        return new C47990a<>(this);
    }

    public C47989l(BufferedReader bufferedReader) {
        C7573i.m23587b(bufferedReader, "reader");
        this.f122830a = bufferedReader;
    }
}
