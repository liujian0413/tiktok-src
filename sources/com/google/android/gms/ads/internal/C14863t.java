package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.C15658en;
import com.google.android.gms.internal.ads.C15659eo;
import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.C15922oh;
import com.google.android.gms.internal.ads.C15945pd;
import com.google.android.gms.internal.ads.C15948pg;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.anq;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.t */
public final class C14863t {
    /* renamed from: a */
    public static View m43168a(abj abj) {
        if (abj == null) {
            acd.m45779c("AdState is null");
            return null;
        } else if (m43180b(abj) && abj.f39862b != null) {
            return abj.f39862b.getView();
        } else {
            try {
                C15345b a = abj.f39876p != null ? abj.f39876p.mo41815a() : null;
                if (a != null) {
                    return (View) C15349d.m44669a(a);
                }
                acd.m45783e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                acd.m45780c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m43177a(ami ami, C15922oh ohVar, CountDownLatch countDownLatch) {
        ami ami2 = ami;
        C15922oh ohVar2 = ohVar;
        CountDownLatch countDownLatch2 = countDownLatch;
        boolean z = false;
        try {
            View view = ami.getView();
            if (view == null) {
                acd.m45783e("AdWebView is null");
            } else {
                view.setVisibility(4);
                List<String> list = ohVar2.f44786b.f44734t;
                if (list != null) {
                    if (!list.isEmpty()) {
                        ami2.mo39721a("/nativeExpressAssetsLoaded", (C15742hq<? super ami>) new C14866w<Object>(countDownLatch2));
                        ami2.mo39721a("/nativeExpressAssetsLoadingFailed", (C15742hq<? super ami>) new C14867x<Object>(countDownLatch2));
                        C15945pd h = ohVar2.f44787c.mo41836h();
                        C15948pg i = ohVar2.f44787c.mo41837i();
                        View view2 = null;
                        if (list.contains("2") && h != null) {
                            String a = h.mo41845a();
                            List b = h.mo41848b();
                            String c = h.mo41850c();
                            C15658en d = h.mo41852d();
                            String e = h.mo41853e();
                            double f = h.mo41854f();
                            String g = h.mo41855g();
                            String h2 = h.mo41856h();
                            Bundle l = h.mo41860l();
                            if (h.mo41864p() != null) {
                                view2 = (View) C15349d.m44669a(h.mo41864p());
                            }
                            C15621de deVar = new C15621de(a, b, c, d, e, f, g, h2, null, l, null, view2, h.mo41865q(), null);
                            ami.mo39761w().mo39771a((anq) new C14864u(deVar, ohVar2.f44786b.f44733s, ami2));
                        } else if (!list.contains("1") || i == null) {
                            acd.m45783e("No matching template id and mapper");
                        } else {
                            String a2 = i.mo41866a();
                            List b2 = i.mo41869b();
                            String c2 = i.mo41871c();
                            C15658en d2 = i.mo41873d();
                            String e2 = i.mo41874e();
                            String f2 = i.mo41875f();
                            Bundle j = i.mo41879j();
                            if (i.mo41883n() != null) {
                                view2 = (View) C15349d.m44669a(i.mo41883n());
                            }
                            C15623dg dgVar = new C15623dg(a2, b2, c2, d2, e2, f2, null, j, null, view2, i.mo41884o(), null);
                            ami.mo39761w().mo39771a((anq) new C14865v(dgVar, ohVar2.f44786b.f44733s, ami2));
                        }
                        String str = ohVar2.f44786b.f44731q;
                        String str2 = ohVar2.f44786b.f44732r;
                        if (str2 != null) {
                            ami.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            ami2.loadData(str, "text/html", "UTF-8");
                        }
                        z = true;
                    }
                }
                acd.m45783e("No template ids present in mediation response");
            }
        } catch (RemoteException e3) {
            acd.m45780c("Unable to invoke load assets", e3);
        } catch (RuntimeException e4) {
            countDownLatch.countDown();
            throw e4;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m43180b(abj abj) {
        return (abj == null || !abj.f39874n || abj.f39875o == null || abj.f39875o.f44731q == null) ? false : true;
    }

    /* renamed from: a */
    static C15742hq<ami> m43170a(C15945pd pdVar, C15948pg pgVar, C14822d dVar) {
        return new C14868y(pdVar, dVar, pgVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m43179b(ami ami) {
        OnClickListener onClickListener = ami.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(ami.getView());
        }
    }

    /* renamed from: a */
    private static JSONObject m43173a(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, m43171a((Bitmap) obj));
                    } else {
                        acd.m45783e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    acd.m45783e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static String m43172a(C15658en enVar) {
        if (enVar == null) {
            acd.m45783e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = enVar.mo41492b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            acd.m45783e("Unable to get image uri. Trying data uri next");
        }
        return m43178b(enVar);
    }

    /* renamed from: b */
    private static String m43178b(C15658en enVar) {
        try {
            C15345b a = enVar.mo41491a();
            if (a == null) {
                acd.m45783e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C15349d.m44669a(a);
            if (drawable instanceof BitmapDrawable) {
                return m43171a(((BitmapDrawable) drawable).getBitmap());
            }
            acd.m45783e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            acd.m45783e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* renamed from: a */
    private static String m43171a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            acd.m45783e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private static C15658en m43169a(Object obj) {
        if (obj instanceof IBinder) {
            return C15659eo.m50701a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m43176a(C15623dg dgVar, String str, ami ami, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", dgVar.mo41515a());
            jSONObject.put("body", dgVar.mo41521i());
            jSONObject.put("call_to_action", dgVar.mo41523k());
            jSONObject.put("advertiser", dgVar.mo41524l());
            jSONObject.put("logo", m43172a(dgVar.mo41522j()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = dgVar.mo41500f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(m43172a(m43169a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m43173a(dgVar.mo41527o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            ami.mo39814b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            acd.m45780c("Exception occurred when loading assets", e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m43175a(C15621de deVar, String str, ami ami, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", deVar.mo41496a());
            jSONObject.put("body", deVar.mo41501g());
            jSONObject.put("call_to_action", deVar.mo41503i());
            jSONObject.put("price", deVar.mo41506l());
            jSONObject.put("star_rating", String.valueOf(deVar.mo41504j()));
            jSONObject.put("store", deVar.mo41505k());
            jSONObject.put("icon", m43172a(deVar.mo41502h()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = deVar.mo41500f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(m43172a(m43169a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m43173a(deVar.mo41509o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            ami.mo39814b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            acd.m45780c("Exception occurred when loading assets", e);
        }
    }
}
