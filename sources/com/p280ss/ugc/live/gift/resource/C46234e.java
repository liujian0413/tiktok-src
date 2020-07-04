package com.p280ss.ugc.live.gift.resource;

import android.content.Context;
import com.p280ss.ugc.live.gift.resource.p1827a.C46210a;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1829c.C46221a;
import com.p280ss.ugc.live.gift.resource.p1829c.C46226e;

/* renamed from: com.ss.ugc.live.gift.resource.e */
public final class C46234e {

    /* renamed from: a */
    public final C46211b f118833a;

    /* renamed from: b */
    public final C46221a f118834b;

    /* renamed from: c */
    public final int f118835c;

    /* renamed from: d */
    public final int f118836d;

    /* renamed from: e */
    public final int f118837e;

    /* renamed from: f */
    private final int f118838f;

    /* renamed from: com.ss.ugc.live.gift.resource.e$a */
    public static class C46236a {

        /* renamed from: a */
        public C46211b f118839a;

        /* renamed from: b */
        public C46221a f118840b;

        /* renamed from: c */
        public int f118841c = 2;

        /* renamed from: d */
        public int f118842d = 5;

        /* renamed from: e */
        public int f118843e = 3;

        /* renamed from: f */
        public int f118844f;

        /* renamed from: g */
        private final Context f118845g;

        /* renamed from: a */
        public final C46234e mo114180a() {
            if (this.f118839a == null) {
                this.f118839a = new C46210a(this.f118845g);
            }
            if (this.f118840b == null) {
                this.f118840b = new C46226e();
            }
            return new C46234e(this);
        }

        /* renamed from: a */
        public final C46236a mo114177a(int i) {
            this.f118843e = 3;
            return this;
        }

        /* renamed from: b */
        public final C46236a mo114181b(int i) {
            this.f118844f = 5;
            return this;
        }

        /* renamed from: a */
        public final C46236a mo114178a(C46211b bVar) {
            this.f118839a = bVar;
            return this;
        }

        public C46236a(Context context) {
            this.f118845g = context;
        }

        /* renamed from: a */
        public final C46236a mo114179a(C46221a aVar) {
            this.f118840b = aVar;
            return this;
        }
    }

    /* renamed from: a */
    public final int mo114176a() {
        return this.f118838f * 1000;
    }

    private C46234e(C46236a aVar) {
        this.f118833a = aVar.f118839a;
        this.f118834b = aVar.f118840b;
        this.f118835c = aVar.f118841c;
        this.f118838f = aVar.f118842d;
        this.f118836d = aVar.f118843e;
        this.f118837e = aVar.f118844f;
    }
}
