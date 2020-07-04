package androidx.work.impl.p033a.p035b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.C1642a;

/* renamed from: androidx.work.impl.a.b.c */
public abstract class C1480c<T> extends C1482d<T> {

    /* renamed from: b */
    private final BroadcastReceiver f5690b = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C1480c.this.mo6721a(context, intent);
            }
        }
    };

    /* renamed from: a */
    public abstract IntentFilter mo6720a();

    /* renamed from: a */
    public abstract void mo6721a(Context context, Intent intent);

    /* renamed from: c */
    public final void mo6723c() {
        C1642a.m8034a("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        this.f5692a.registerReceiver(this.f5690b, mo6720a());
    }

    /* renamed from: d */
    public final void mo6724d() {
        C1642a.m8034a("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        this.f5692a.unregisterReceiver(this.f5690b);
    }

    public C1480c(Context context) {
        super(context);
    }
}
