package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.C1642a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class akw implements C15742hq<aik> {

    /* renamed from: a */
    private boolean f40529a;

    /* renamed from: a */
    private static int m46243a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                return afb.m45721a(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                acd.m45783e(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    private static void m46244a(ahv ahv, Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                ahv.mo39415b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                acd.m45783e(C1642a.m8034a("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            ahv.mo39416c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            ahv.mo39417d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            ahv.mo39418e(Integer.parseInt(str4));
        }
        if (str5 != null) {
            ahv.mo39419f(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        int i;
        String[] split;
        aik aik = (aik) obj;
        String str = (String) map.get("action");
        if (str == null) {
            acd.m45783e("Action missing from video GMSG.");
            return;
        }
        if (acd.m45776a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            acd.m45777b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                acd.m45783e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                aik.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                acd.m45783e("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    acd.m45783e("No MIME types specified for decoder properties inspection.");
                    ahv.m45927a(aik, "missingMimeTypes");
                } else if (VERSION.SDK_INT < 16) {
                    acd.m45783e("Video decoder properties available on API versions >= 16.");
                    ahv.m45927a(aik, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, aez.m45711a(str4.trim()));
                    }
                    ahv.m45928a(aik, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                aib a = aik.mo39458a();
                if (a == null) {
                    acd.m45783e("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = aik.getContext();
                    int a2 = m46243a(context, map, "x", 0);
                    int a3 = m46243a(context, map, "y", 0);
                    int a4 = m46243a(context, map, "w", -1);
                    int a5 = m46243a(context, map, "h", -1);
                    int min = Math.min(a4, aik.mo39474m() - a2);
                    int min2 = Math.min(a5, aik.mo39473l() - a3);
                    try {
                        i = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || a.mo39436a() != null) {
                        a.mo39437a(a2, a3, min, min2);
                        return;
                    }
                    a.mo39438a(a2, a3, min, min2, i, parseBoolean, new aij((String) map.get("flags")));
                    ahv a6 = a.mo39436a();
                    if (a6 != null) {
                        m46244a(a6, map);
                    }
                    return;
                }
                amy b = aik.mo39464b();
                if (b != null) {
                    if ("timeupdate".equals(str)) {
                        String str5 = (String) map.get("currentTime");
                        if (str5 == null) {
                            acd.m45783e("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            b.mo39828a(Float.parseFloat(str5));
                            return;
                        } catch (NumberFormatException unused3) {
                            String str6 = "Could not parse currentTime parameter from timeupdate video GMSG: ";
                            String valueOf = String.valueOf(str5);
                            acd.m45783e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        b.mo39834l();
                        return;
                    }
                }
                ahv a7 = a.mo39436a();
                if (a7 == null) {
                    ahv.m45926a(aik);
                } else if ("click".equals(str)) {
                    Context context2 = aik.getContext();
                    int a8 = m46243a(context2, map, "x", 0);
                    int a9 = m46243a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    a7.mo39412a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map.get("time");
                    if (str7 == null) {
                        acd.m45783e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        a7.mo39410a((int) (Float.parseFloat(str7) * 1000.0f));
                    } catch (NumberFormatException unused4) {
                        String str8 = "Could not parse time parameter from currentTime video GMSG: ";
                        String valueOf2 = String.valueOf(str7);
                        acd.m45783e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.mo39421h();
                } else if ("loadControl".equals(str)) {
                    m46244a(a7, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        a7.mo39424k();
                    } else {
                        a7.mo39425l();
                    }
                } else if ("pause".equals(str)) {
                    a7.mo39422i();
                } else if ("play".equals(str)) {
                    a7.mo39423j();
                } else if ("show".equals(str)) {
                    a7.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str9 = (String) map.get("src");
                    String[] strArr = {str9};
                    String str10 = (String) map.get("demuxed");
                    if (str10 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str10);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                strArr2[i2] = jSONArray.getString(i2);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused5) {
                            String str11 = "Malformed demuxed URL list for playback: ";
                            String valueOf3 = String.valueOf(str10);
                            acd.m45783e(valueOf3.length() != 0 ? str11.concat(valueOf3) : new String(str11));
                            strArr = new String[]{str9};
                        }
                    }
                    a7.mo39413a(str9, strArr);
                } else if ("touchMove".equals(str)) {
                    Context context3 = aik.getContext();
                    a7.mo39409a((float) m46243a(context3, map, "dx", 0), (float) m46243a(context3, map, "dy", 0));
                    if (!this.f40529a) {
                        aik.mo39468f();
                        this.f40529a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str12 = (String) map.get("volume");
                    if (str12 == null) {
                        acd.m45783e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a7.setVolume(Float.parseFloat(str12));
                    } catch (NumberFormatException unused6) {
                        String str13 = "Could not parse volume parameter from volume video GMSG: ";
                        String valueOf4 = String.valueOf(str12);
                        acd.m45783e(valueOf4.length() != 0 ? str13.concat(valueOf4) : new String(str13));
                    }
                } else if ("watermark".equals(str)) {
                    a7.mo39426m();
                } else {
                    String str14 = "Unknown video action: ";
                    String valueOf5 = String.valueOf(str);
                    acd.m45783e(valueOf5.length() != 0 ? str14.concat(valueOf5) : new String(str14));
                }
            }
        }
    }
}
