package p1896pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: pl.droidsonroids.gif.f */
final class C48435f extends C48436g {
    /* renamed from: a */
    public final void mo123254a() {
        long a = this.f123545c.f123525f.mo123193a(this.f123545c.f123524e);
        if (a >= 0) {
            this.f123545c.f123522c = SystemClock.uptimeMillis() + a;
            if (this.f123545c.isVisible() && this.f123545c.f123521b && !this.f123545c.f123527h) {
                this.f123545c.f123520a.remove(this);
                this.f123545c.f123529j = this.f123545c.f123520a.schedule(this, a, TimeUnit.MILLISECONDS);
            }
            if (!this.f123545c.f123526g.isEmpty() && this.f123545c.mo123225f() == this.f123545c.f123525f.mo123211p() - 1) {
                this.f123545c.f123528i.sendEmptyMessageAtTime(this.f123545c.mo123226g(), this.f123545c.f123522c);
            }
        } else {
            this.f123545c.f123522c = Long.MIN_VALUE;
            this.f123545c.f123521b = false;
        }
        if (this.f123545c.isVisible() && !this.f123545c.f123528i.hasMessages(-1)) {
            this.f123545c.f123528i.sendEmptyMessageAtTime(-1, 0);
        }
    }

    C48435f(C48425a aVar) {
        super(aVar);
    }
}
