package com.p280ss.android.download.api.model;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.ss.android.download.api.model.c */
public final class C19394c {

    /* renamed from: a */
    public Context f52450a;

    /* renamed from: b */
    public String f52451b;

    /* renamed from: c */
    public String f52452c;

    /* renamed from: d */
    public String f52453d;

    /* renamed from: e */
    public String f52454e;

    /* renamed from: f */
    public boolean f52455f;

    /* renamed from: g */
    public Drawable f52456g;

    /* renamed from: h */
    public C19397b f52457h;

    /* renamed from: i */
    public View f52458i;

    /* renamed from: j */
    public int f52459j;

    /* renamed from: com.ss.android.download.api.model.c$a */
    public static final class C19396a {

        /* renamed from: a */
        public Context f52460a;

        /* renamed from: b */
        public String f52461b;

        /* renamed from: c */
        public String f52462c;

        /* renamed from: d */
        public String f52463d;

        /* renamed from: e */
        public String f52464e;

        /* renamed from: f */
        public boolean f52465f;

        /* renamed from: g */
        public Drawable f52466g;

        /* renamed from: h */
        public C19397b f52467h;

        /* renamed from: i */
        public View f52468i;

        /* renamed from: j */
        public int f52469j;

        /* renamed from: a */
        public final C19394c mo51394a() {
            return new C19394c(this);
        }

        /* renamed from: a */
        public final C19396a mo51389a(int i) {
            this.f52469j = i;
            return this;
        }

        /* renamed from: b */
        public final C19396a mo51395b(String str) {
            this.f52462c = str;
            return this;
        }

        /* renamed from: c */
        public final C19396a mo51396c(String str) {
            this.f52463d = str;
            return this;
        }

        /* renamed from: d */
        public final C19396a mo51397d(String str) {
            this.f52464e = str;
            return this;
        }

        public C19396a(Context context) {
            this.f52460a = context;
        }

        /* renamed from: a */
        public final C19396a mo51390a(Drawable drawable) {
            this.f52466g = drawable;
            return this;
        }

        /* renamed from: a */
        public final C19396a mo51391a(C19397b bVar) {
            this.f52467h = bVar;
            return this;
        }

        /* renamed from: a */
        public final C19396a mo51392a(String str) {
            this.f52461b = str;
            return this;
        }

        /* renamed from: a */
        public final C19396a mo51393a(boolean z) {
            this.f52465f = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.download.api.model.c$b */
    public interface C19397b {
        /* renamed from: a */
        void mo51398a(DialogInterface dialogInterface);

        /* renamed from: b */
        void mo51399b(DialogInterface dialogInterface);

        /* renamed from: c */
        void mo51400c(DialogInterface dialogInterface);
    }

    private C19394c(C19396a aVar) {
        this.f52455f = true;
        this.f52450a = aVar.f52460a;
        this.f52451b = aVar.f52461b;
        this.f52452c = aVar.f52462c;
        this.f52453d = aVar.f52463d;
        this.f52454e = aVar.f52464e;
        this.f52455f = aVar.f52465f;
        this.f52456g = aVar.f52466g;
        this.f52457h = aVar.f52467h;
        this.f52458i = aVar.f52468i;
        this.f52459j = aVar.f52469j;
    }
}
