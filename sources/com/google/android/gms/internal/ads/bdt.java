package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class bdt {

    /* renamed from: f */
    private static final String[] f41731f = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    public bdp f41732a;

    /* renamed from: b */
    private String f41733b = "googleads.g.doubleclick.net";

    /* renamed from: c */
    private String f41734c = "/pagead/ads";

    /* renamed from: d */
    private String f41735d = "ad.doubleclick.net";

    /* renamed from: e */
    private String[] f41736e = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    public bdt(bdp bdp) {
        this.f41732a = bdp;
    }

    /* renamed from: c */
    private final boolean m48503c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f41735d);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final boolean mo40535a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f41736e) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                return false;
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final Uri mo40532a(Uri uri, Context context) throws zzdh {
        return m48502a(uri, context, null, false, null, null);
    }

    /* renamed from: a */
    public final void mo40534a(MotionEvent motionEvent) {
        this.f41732a.mo37777a(motionEvent);
    }

    /* renamed from: b */
    public final Uri mo40536b(Uri uri, Context context) throws zzdh {
        return mo40533a(uri, context, null, null);
    }

    /* renamed from: a */
    public final Uri mo40533a(Uri uri, Context context, View view, Activity activity) throws zzdh {
        try {
            return m48502a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzdh("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: b */
    public final boolean mo40537b(Uri uri) {
        if (mo40535a(uri)) {
            for (String endsWith : f41731f) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final Uri m48502a(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws zzdh {
        String str2;
        try {
            boolean c = m48503c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzdh("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzdh("Query parameter already exists: ms");
            }
            if (z) {
                str2 = this.f41732a.mo37775a(context, str, view, activity);
            } else {
                str2 = this.f41732a.mo37773a(context);
            }
            if (c) {
                String str3 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str2);
                    sb.append(";");
                    sb.append(uri2.substring(i));
                    return Uri.parse(sb.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                sb2.append(";");
                sb2.append(str3);
                sb2.append("=");
                sb2.append(str2);
                sb2.append(";");
                sb2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(sb2.toString());
            }
            String str4 = "ms";
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str4, str2).build();
            }
            int i2 = indexOf3 + 1;
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
            sb3.append(str4);
            sb3.append("=");
            sb3.append(str2);
            sb3.append("&");
            sb3.append(uri3.substring(i2));
            return Uri.parse(sb3.toString());
        } catch (UnsupportedOperationException unused) {
            throw new zzdh("Provided Uri is not in a valid state");
        }
    }
}
