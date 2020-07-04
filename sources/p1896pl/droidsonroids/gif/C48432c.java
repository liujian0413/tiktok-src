package p1896pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: pl.droidsonroids.gif.c */
final class C48432c extends Handler {

    /* renamed from: a */
    private final WeakReference<C48425a> f123543a;

    C48432c(C48425a aVar) {
        super(Looper.getMainLooper());
        this.f123543a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        C48425a aVar = (C48425a) this.f123543a.get();
        if (aVar != null) {
            if (message.what == -1) {
                aVar.invalidateSelf();
                return;
            }
            Iterator it = aVar.f123526g.iterator();
            while (it.hasNext()) {
                it.next();
                int i = message.what;
            }
        }
    }
}
