package com.p280ss.android.ugc.aweme.filter;

import android.support.p029v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;

/* renamed from: com.ss.android.ugc.aweme.filter.bd */
public interface C29241bd {

    /* renamed from: com.ss.android.ugc.aweme.filter.bd$a */
    public static class C29242a {

        /* renamed from: a */
        private C29208ah f77160a;

        /* renamed from: a */
        public final C29241bd mo74876a() {
            return new FilterViewImpl(this.f77160a);
        }

        /* renamed from: a */
        public final C29242a mo74870a(C23258e eVar) {
            this.f77160a.f77106d = eVar;
            return this;
        }

        /* renamed from: b */
        public final C29242a mo74877b(boolean z) {
            this.f77160a.f77109g = true;
            return this;
        }

        /* renamed from: a */
        public final C29242a mo74871a(C29240bc bcVar) {
            this.f77160a.f77107e = bcVar;
            return this;
        }

        /* renamed from: a */
        public final C29242a mo74872a(C39370d dVar) {
            if (dVar != null) {
                this.f77160a.f77111i = true;
                this.f77160a.f77112j = dVar;
            }
            return this;
        }

        /* renamed from: a */
        public final C29242a mo74873a(C39376h hVar) {
            this.f77160a.f77105c = hVar;
            return this;
        }

        /* renamed from: a */
        public final C29242a mo74874a(AVETParameter aVETParameter) {
            this.f77160a.f77110h = aVETParameter;
            return this;
        }

        /* renamed from: a */
        public final C29242a mo74875a(boolean z) {
            this.f77160a.f77108f = z;
            return this;
        }

        public C29242a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
            this.f77160a = new C29208ah(appCompatActivity);
            this.f77160a.f77103a = frameLayout;
        }

        public C29242a(AppCompatActivity appCompatActivity, FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.f77160a = new C29208ah(appCompatActivity);
            this.f77160a.f77103a = frameLayout;
            this.f77160a.f77104b = frameLayout2;
        }
    }

    /* renamed from: a */
    void mo74749a();

    /* renamed from: a */
    void mo74751a(C29296g gVar);

    /* renamed from: b */
    void mo74755b();
}
