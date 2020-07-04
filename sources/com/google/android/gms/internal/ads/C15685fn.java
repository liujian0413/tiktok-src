package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.formats.C14758g;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.C15349d;
import java.util.WeakHashMap;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.fn */
public final class C15685fn implements C14758g {

    /* renamed from: b */
    private static WeakHashMap<IBinder, C15685fn> f44434b = new WeakHashMap<>();

    /* renamed from: a */
    public final C15682fk f44435a;

    /* renamed from: c */
    private final MediaView f44436c;

    /* renamed from: d */
    private final C14871k f44437d = new C14871k();

    private C15685fn(C15682fk fkVar) {
        Context context;
        this.f44435a = fkVar;
        MediaView mediaView = null;
        try {
            context = (Context) C15349d.m44669a(fkVar.mo41539i());
        } catch (RemoteException | NullPointerException e) {
            afm.m45778b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f44435a.mo41533a(C15349d.m44668a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                afm.m45778b("", e2);
            }
        }
        this.f44436c = mediaView;
    }

    /* renamed from: a */
    public static C15685fn m50846a(C15682fk fkVar) {
        synchronized (f44434b) {
            C15685fn fnVar = (C15685fn) f44434b.get(fkVar.asBinder());
            if (fnVar != null) {
                return fnVar;
            }
            C15685fn fnVar2 = new C15685fn(fkVar);
            f44434b.put(fkVar.asBinder(), fnVar2);
            return fnVar2;
        }
    }

    /* renamed from: a */
    public final String mo37537a() {
        try {
            return this.f44435a.mo41482c();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }
}
