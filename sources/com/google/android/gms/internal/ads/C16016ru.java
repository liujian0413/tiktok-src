package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ru */
public final class C16016ru {

    /* renamed from: a */
    private static final Object f44962a = new Object();

    /* renamed from: b */
    private static boolean f44963b = false;

    /* renamed from: c */
    private static boolean f44964c = false;

    /* renamed from: d */
    private aor f44965d;

    /* renamed from: a */
    public final boolean mo41959a(Context context) {
        synchronized (f44962a) {
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
                return false;
            }
            if (f44963b) {
                return true;
            }
            try {
                m52071c(context);
                boolean a = this.f44965d.mo39910a(C15349d.m44668a(context));
                f44963b = a;
                return a;
            } catch (RemoteException | NullPointerException e) {
                afm.m45782d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: c */
    private final void m52071c(Context context) {
        synchronized (f44962a) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue() && !f44964c) {
                try {
                    f44964c = true;
                    this.f44965d = (aor) afn.m45786a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C16017rv.f44966a);
                } catch (zzbgx e) {
                    afm.m45782d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo41960b(Context context) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
            return null;
        }
        try {
            m52071c(context);
            String str = "a.";
            String valueOf = String.valueOf(this.f44965d.mo39908a());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (RemoteException | NullPointerException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final C15345b mo41955a(String str, WebView webView, String str2, String str3, String str4) {
        return mo41956a(str, webView, str2, str3, str4, "Google");
    }

    /* renamed from: a */
    public final C15345b mo41956a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f44962a) {
            try {
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
                    if (f44963b) {
                        try {
                            return this.f44965d.mo39907a(str, C15349d.m44668a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            afm.m45782d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo41957a(C15345b bVar) {
        synchronized (f44962a) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
                if (f44963b) {
                    try {
                        this.f44965d.mo39911b(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        afm.m45782d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo41961b(C15345b bVar) {
        synchronized (f44962a) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
                if (f44963b) {
                    try {
                        this.f44965d.mo39912c(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        afm.m45782d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41958a(C15345b bVar, View view) {
        synchronized (f44962a) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43874cO)).booleanValue()) {
                if (f44963b) {
                    try {
                        this.f44965d.mo39909a(bVar, C15349d.m44668a(view));
                    } catch (RemoteException | NullPointerException e) {
                        afm.m45782d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
