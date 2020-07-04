package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ahs.C15480a;
import com.google.android.gms.internal.ads.zzbo.C16243d;
import com.google.android.gms.internal.ads.zzbo.zza;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import com.google.android.gms.internal.ads.zzbo.zza.C16248b;
import com.google.android.gms.internal.ads.zzbo.zza.C16248b.C16249a;
import com.google.android.gms.internal.ads.zzbo.zza.zzd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class bdr extends bdq {

    /* renamed from: s */
    private static final Object f41724s = new Object();

    /* renamed from: t */
    private static final String f41725t = bdr.class.getSimpleName();

    /* renamed from: u */
    private static boolean f41726u = false;

    /* renamed from: v */
    private static long f41727v = 0;

    /* renamed from: r */
    protected boolean f41728r;

    /* renamed from: w */
    private String f41729w;

    /* renamed from: x */
    private bes f41730x;

    /* renamed from: a */
    protected static synchronized void m48490a(Context context, boolean z) {
        synchronized (bdr.class) {
            if (!f41726u) {
                f41727v = System.currentTimeMillis() / 1000;
                f41704a = m48492b(context, z);
                f41726u = true;
            }
        }
    }

    protected bdr(Context context, String str, boolean z) {
        super(context);
        this.f41729w = str;
        this.f41728r = z;
    }

    /* renamed from: b */
    private static beh m48492b(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (f41704a == null) {
            synchronized (f41724s) {
                if (f41704a == null) {
                    beh a = beh.m48529a(context, "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", z);
                    if (a.f41770k) {
                        try {
                            z2 = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43858bz)).booleanValue();
                        } catch (IllegalStateException unused) {
                            z2 = false;
                        }
                        if (z2) {
                            a.mo40554a("K5wwdM8iz8mAAoB1ZEL0/WelqLOVbmUKX2FOjKTd7XksfgJTw3SESwwZFTHnLk6D", "U3CsIeStq4zhCq0CtDyp7613iRyjSaX5gHXCXG5e1EQ=", new Class[0]);
                        }
                        a.mo40554a("qFtd4C5d0KtcWzWeFLmuiEXghbgUuLNC6Ve2ufc1M4U3XrnmTraQBUqm3xNwgk3c", "CKWARAW2rIlqCmo31AsybLnBFwRJcX2Vc+m6JImxUIM=", Context.class);
                        a.mo40554a("DrRLUBZRv5J2Lv1m+YXfx8im/cu9TP8LGt7hHPrAmBOuIcqODsdEGFExAshmfneS", "1YpGOn7Hd1CkbYui5lpCxExt0/rhfQJtu9UHr8sBA74=", Context.class);
                        a.mo40554a("huHVFTRY+lN8I+eIgy0NwaQRrZ+6gtOYs+x9g6cC2xuMmc8gprNzN8EMk47VQRdQ", "7fYLC2EMeD1SdxI3OsdFkTYSrXYQaT+OkSmoRr0R2NE=", Context.class);
                        a.mo40554a("iIPU9ISRBdOnHclpDn4xdsSCNLwgLWQgFudxmUDQkRjY4EHWKm7GS32gyjgN6Ffe", "Td+YbSEAhp7F/YLX6hbq3lkmb7FbxNyDt8f2ICiIwO4=", Context.class);
                        a.mo40554a("9Grizry2ogEc785kj8Vl1FfA8MnqboZGMz+Q/xQD8tNoXM+Wjf1DNBULhEqpTKaP", "LVdcl6SzG0jH7HWlHiwjtlxjMsjoTYdpp1chcmRyEkI=", Context.class);
                        a.mo40554a("zPWyi5jU+DA6ZACYDnEUud/d+N/pb3IV51xf/34plRk8gMgYgb48oLIx0/VJ6y7b", "tCiNoeiCN5e0/E2/LurLolsDGzjSPwyYgd8htOkAB7Y=", Context.class);
                        a.mo40554a("gfWP0RYDcSCETqUTE2g3eBoeM4p7j7qvdIE+W5+hDCTBLlnhtt2EKQwpC7vXxZx0", "sQVUgIHkWZ0xZxiWHLL+Z3JY0C2mPXbrP2qshcc/wcI=", Context.class);
                        a.mo40554a("qTP53ysrLbDGAQVj6/Zcc1lvlsjUWD87lvYWoBkqohfJzKO3NjDKaEB3A8bgGOUR", "YFXxghpE1Ztl/NevvUrgbwr1YZMfl+sAULlxeze6d20=", Context.class);
                        a.mo40554a("HGPiyDpEvkFiaIQJ7X3RRvDzLKHMcvXMzmeC8Bz6e0qjAGrxZKYXctTcCyUaxOhB", "HcPc5EVbh4WKhukZq0ReRvCzxUUrbzy6wJE12WKnSkg=", MotionEvent.class, DisplayMetrics.class);
                        a.mo40554a("4UGr6YhPnwjALzAXCIgZCUlHJZloZzNANm8d44v6av6ZcyB7RvbUzloAP0XVY1fS", "MD3X7z5OYR+8cKRMRCpNlEaVLmq1ab4kWhheNXFQF9o=", MotionEvent.class, DisplayMetrics.class);
                        a.mo40554a("ZGVQ2ZoORBVQMDOSECIyCMviI/CR9W3El4Yp+QRZoi3xwP2CCc1y/r+JmFBWuXJ+", "2HjS59bX16mqgnAJQmCuoos7BNXUHIlQqBFPqiNjIBk=", new Class[0]);
                        a.mo40554a("v9TxlW9aHzDnwcmNHy7+DPiSGOPpP3cETwIqXxag8syaL5FGU5XGsmQeSpEDg9+5", "92frEobGaOfGZPjYxO0Dide7CvnUqK+DGW50Oyvc3P0=", new Class[0]);
                        a.mo40554a("Fr2Y/+yVsrrHqKcO8V6t4y/A/6xlpjwjNRydvzdd/o/C4XmybBAES9Y03dqI3sne", "P8xsMz9o5Ar44oU4n7P33OMmB8VY2W41WE00s15PwOg=", new Class[0]);
                        a.mo40554a("0r4fbKSCtqhjRXPqvEOtTujoMwjR+fFmFtFj5tCC8AETmOiDnqGOyAovU875FDg/", "Ai7P/FkP/genjxsxZTcPxkBguSzfKbaocOZrpfBRSVU=", new Class[0]);
                        a.mo40554a("UBMZcyjyD/uvnoDTNErukMhVPEHw3WYnhdULCFJ5dG7LopHZlA7cwSj4XF8aTltu", "QAo5ceIHQyUNAOzxc8iTsCsWhqYHeqEAywzCMCDdTh8=", new Class[0]);
                        a.mo40554a("akrTIZkWXy6HzM+C9/7y1Fgb92jWpysJq9vGGUUTz0BkKCvUlMxHqhMp5i02Efts", "m6vu+9ijYQnzntcaZsIIO5zHyCAbis3Th3DphUrr8FA=", new Class[0]);
                        a.mo40554a("hCRUll5b6QVdPNpZdVU2CGBmLGRz1PW1mr4jfo9+Ip4MfazJ/olsGFG3VXbpz2XV", "wUBmpNpisRVe77hveuFPoTPa39okeLRn7toySvJhVsE=", Context.class, Boolean.TYPE, Boolean.TYPE);
                        a.mo40554a("q/2qqOlprfBV+5DnfgOaZ+yfPq/WjGfigb+7Vg8zSbbBv1o1N8nnAPF50ZOOs8Wy", "L0dPVMzq/5L4P8Kxm6tGBwVTUFbV4klI3lIA4MMILW0=", StackTraceElement[].class);
                        a.mo40554a("ZTtWSCi0SAWGGT5xcYz50/ji6LhrqB6kroOPIyuq9WH5oLEWOLUBGbigMOFBfANb", "zIRXrzQb29YAIrc55d3zyaPImf3te7cAWrGIiibrtNA=", View.class, DisplayMetrics.class, Boolean.TYPE);
                        a.mo40554a("PlW3ztyw5x1V7e3rf+U9Daz54p/bqMFZhZdStSarUh2g5DxAJM065tyZxUWk/8dv", "EAw0UR4ysCkwUeuuoN8S7rfhBv///W3L2kYBG4rijF4=", Context.class, Boolean.TYPE);
                        a.mo40554a("Rt1STOJiFuOMxpMEjnBwDecMHNVnNiAw/zQBzmT08Jl04kuwPrQNQuBxiU9szvfL", "eP9zyprXvDS7xSPaOtCOI9Bxt5+P36hzwpbFhGmzcAs=", View.class, Activity.class, Boolean.TYPE);
                        a.mo40554a("cYaGgecLCFRY2V7Y9Tl78mhrvhHHAirLomgyTc+Na6nciVD7VG6zNl8b3oxtzUhy", "6BQYZY0uuPSohJi+qj+JORTUKOuqVMCCh1hBagbVK6M=", Long.TYPE);
                        try {
                            z3 = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43811bE)).booleanValue();
                        } catch (IllegalStateException unused2) {
                            z3 = false;
                        }
                        if (z3) {
                            a.mo40554a("ZauyytzZd663JCdzysGWPZ5kOxqjM4pKg97Lc27ZmXwWo+BZ0x7W9lX+wlwvtPFU", "67rmj+/kacXdmSGLstOfMCPKQUB6qZtgo4An3ttSPhs=", Context.class);
                        }
                        try {
                            z4 = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43812bF)).booleanValue();
                        } catch (IllegalStateException unused3) {
                            z4 = false;
                        }
                        if (z4) {
                            a.mo40554a("JiG6qxw1Yf73JNFwCB/14z7vm4q0e+zUXVA4WE2bbn825/FOdXUFmpVrTL9qNb1Y", "fvR2PR8KVUU7FNBzJgP5YtrSr1sOJT/F9MQaT5WvXYs=", Context.class);
                        }
                    }
                    f41704a = a;
                }
            }
        }
        return f41704a;
    }

    /* renamed from: a */
    private static bep m48489a(beh beh, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzdu {
        Method a = beh.mo40552a("HGPiyDpEvkFiaIQJ7X3RRvDzLKHMcvXMzmeC8Bz6e0qjAGrxZKYXctTcCyUaxOhB", "HcPc5EVbh4WKhukZq0ReRvCzxUUrbzy6wJE12WKnSkg=");
        if (a == null || motionEvent == null) {
            throw new zzdu();
        }
        try {
            return new bep((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzdu(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16247a mo40529a(Context context, C15480a aVar) {
        C16247a d = zza.m52760d();
        if (!TextUtils.isEmpty(this.f41729w)) {
            d.mo42217b(this.f41729w);
        }
        m48493b(m48492b(context, this.f41728r), context, d, aVar);
        if (aVar != null && aVar.mo39399c()) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43855bw)).booleanValue() && !beq.m48556b(aVar.mo39400d().zzen)) {
                d.mo42207a((C16243d) ((axu) C16243d.m52696a().mo42191a(aVar.mo39400d().zzen).mo40293e()));
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16247a mo40528a(Context context, View view, Activity activity) {
        List list;
        Long l;
        C16247a d = zza.m52760d();
        if (!TextUtils.isEmpty(this.f41729w)) {
            d.mo42217b(this.f41729w);
        }
        beh b = m48492b(context, this.f41728r);
        if (!b.f41770k) {
            d.mo42234j((long) zzd.PSN_INITIALIZATION_FAIL.zzac());
            list = Arrays.asList(new Callable[]{new bfe(b, d)});
        } else {
            try {
                bep a = m48489a(b, this.f41705b, this.f41720q);
                if (a.f41789a != null) {
                    d.mo42226f(a.f41789a.longValue());
                }
                if (a.f41790b != null) {
                    d.mo42228g(a.f41790b.longValue());
                }
                if (a.f41791c != null) {
                    d.mo42230h(a.f41791c.longValue());
                }
                if (this.f41719p) {
                    if (a.f41792d != null) {
                        d.mo42241q(a.f41792d.longValue());
                    }
                    if (a.f41793e != null) {
                        d.mo42242r(a.f41793e.longValue());
                    }
                }
            } catch (zzdu unused) {
            }
            C16249a a2 = C16248b.m52880a();
            if (this.f41707d > 0 && beq.m48555a(this.f41720q)) {
                a2.mo42263k(beq.m48551a(this.f41714k, this.f41720q));
                a2.mo42264l(beq.m48551a((double) (this.f41717n - this.f41715l), this.f41720q)).mo42265m(beq.m48551a((double) (this.f41718o - this.f41716m), this.f41720q)).mo42268p(beq.m48551a((double) this.f41715l, this.f41720q)).mo42269q(beq.m48551a((double) this.f41716m, this.f41720q));
                if (this.f41719p && this.f41705b != null) {
                    long a3 = beq.m48551a((double) (((this.f41715l - this.f41717n) + this.f41705b.getRawX()) - this.f41705b.getX()), this.f41720q);
                    if (a3 != 0) {
                        a2.mo42266n(a3);
                    }
                    long a4 = beq.m48551a((double) (((this.f41716m - this.f41718o) + this.f41705b.getRawY()) - this.f41705b.getY()), this.f41720q);
                    if (a4 != 0) {
                        a2.mo42267o(a4);
                    }
                }
            }
            try {
                bep b2 = mo40530b(this.f41705b);
                if (b2.f41789a != null) {
                    a2.mo42251a(b2.f41789a.longValue());
                }
                if (b2.f41790b != null) {
                    a2.mo42253b(b2.f41790b.longValue());
                }
                a2.mo42259g(b2.f41791c.longValue());
                if (this.f41719p) {
                    if (b2.f41793e != null) {
                        a2.mo42255c(b2.f41793e.longValue());
                    }
                    if (b2.f41792d != null) {
                        a2.mo42257e(b2.f41792d.longValue());
                    }
                    if (b2.f41794f != null) {
                        a2.mo42252a(b2.f41794f.longValue() != 0 ? zzby.ENUM_TRUE : zzby.ENUM_FALSE);
                    }
                    if (this.f41708e > 0) {
                        if (beq.m48555a(this.f41720q)) {
                            double d2 = (double) this.f41713j;
                            double d3 = (double) this.f41708e;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            l = Long.valueOf(Math.round(d2 / d3));
                        } else {
                            l = null;
                        }
                        if (l != null) {
                            a2.mo42256d(l.longValue());
                        } else {
                            a2.mo42205a();
                        }
                        double d4 = (double) this.f41712i;
                        double d5 = (double) this.f41708e;
                        Double.isNaN(d4);
                        Double.isNaN(d5);
                        a2.mo42258f(Math.round(d4 / d5));
                    }
                    if (b2.f41797i != null) {
                        a2.mo42261i(b2.f41797i.longValue());
                    }
                    if (b2.f41798j != null) {
                        a2.mo42260h(b2.f41798j.longValue());
                    }
                    if (b2.f41799k != null) {
                        a2.mo42254b(b2.f41799k.longValue() != 0 ? zzby.ENUM_TRUE : zzby.ENUM_FALSE);
                    }
                }
            } catch (zzdu unused2) {
            }
            if (this.f41711h > 0) {
                a2.mo42262j(this.f41711h);
            }
            d.mo42208a((C16248b) ((axu) a2.mo40293e()));
            if (this.f41707d > 0) {
                d.mo42245u(this.f41707d);
            }
            if (this.f41708e > 0) {
                d.mo42244t(this.f41708e);
            }
            if (this.f41709f > 0) {
                d.mo42243s(this.f41709f);
            }
            if (this.f41710g > 0) {
                d.mo42246v(this.f41710g);
            }
            try {
                int size = this.f41706c.size() - 1;
                if (size > 0) {
                    d.mo42205a();
                    for (int i = 0; i < size; i++) {
                        bep a5 = m48489a(f41704a, (MotionEvent) this.f41706c.get(i), this.f41720q);
                        d.mo42215b((C16248b) ((axu) C16248b.m52880a().mo42251a(a5.f41789a.longValue()).mo42253b(a5.f41790b.longValue()).mo40293e()));
                    }
                }
            } catch (zzdu unused3) {
                d.mo42205a();
            }
            list = new ArrayList();
            if (b.f41761b != null) {
                int b3 = b.mo40555b();
                list.add(new bfe(b, d));
                beh beh = b;
                C16247a aVar = d;
                bfi bfi = new bfi(beh, "Fr2Y/+yVsrrHqKcO8V6t4y/A/6xlpjwjNRydvzdd/o/C4XmybBAES9Y03dqI3sne", "P8xsMz9o5Ar44oU4n7P33OMmB8VY2W41WE00s15PwOg=", aVar, b3, 1);
                list.add(bfi);
                bfc bfc = new bfc(beh, "ZGVQ2ZoORBVQMDOSECIyCMviI/CR9W3El4Yp+QRZoi3xwP2CCc1y/r+JmFBWuXJ+", "2HjS59bX16mqgnAJQmCuoos7BNXUHIlQqBFPqiNjIBk=", aVar, f41727v, b3, 25);
                list.add(bfc);
                int i2 = b3;
                bfb bfb = new bfb(beh, "0r4fbKSCtqhjRXPqvEOtTujoMwjR+fFmFtFj5tCC8AETmOiDnqGOyAovU875FDg/", "Ai7P/FkP/genjxsxZTcPxkBguSzfKbaocOZrpfBRSVU=", aVar, i2, 44);
                list.add(bfb);
                bfh bfh = new bfh(beh, "9Grizry2ogEc785kj8Vl1FfA8MnqboZGMz+Q/xQD8tNoXM+Wjf1DNBULhEqpTKaP", "LVdcl6SzG0jH7HWlHiwjtlxjMsjoTYdpp1chcmRyEkI=", aVar, i2, 12);
                list.add(bfh);
                bfj bfj = new bfj(beh, "zPWyi5jU+DA6ZACYDnEUud/d+N/pb3IV51xf/34plRk8gMgYgb48oLIx0/VJ6y7b", "tCiNoeiCN5e0/E2/LurLolsDGzjSPwyYgd8htOkAB7Y=", aVar, i2, 3);
                list.add(bfj);
                bff bff = new bff(beh, "UBMZcyjyD/uvnoDTNErukMhVPEHw3WYnhdULCFJ5dG7LopHZlA7cwSj4XF8aTltu", "QAo5ceIHQyUNAOzxc8iTsCsWhqYHeqEAywzCMCDdTh8=", aVar, i2, 22);
                list.add(bff);
                bfa bfa = new bfa(beh, "iIPU9ISRBdOnHclpDn4xdsSCNLwgLWQgFudxmUDQkRjY4EHWKm7GS32gyjgN6Ffe", "Td+YbSEAhp7F/YLX6hbq3lkmb7FbxNyDt8f2ICiIwO4=", aVar, i2, 5);
                list.add(bfa);
                bfs bfs = new bfs(beh, "gfWP0RYDcSCETqUTE2g3eBoeM4p7j7qvdIE+W5+hDCTBLlnhtt2EKQwpC7vXxZx0", "sQVUgIHkWZ0xZxiWHLL+Z3JY0C2mPXbrP2qshcc/wcI=", aVar, i2, 48);
                list.add(bfs);
                bew bew = new bew(beh, "qTP53ysrLbDGAQVj6/Zcc1lvlsjUWD87lvYWoBkqohfJzKO3NjDKaEB3A8bgGOUR", "YFXxghpE1Ztl/NevvUrgbwr1YZMfl+sAULlxeze6d20=", aVar, i2, 49);
                list.add(bew);
                bfp bfp = new bfp(beh, "akrTIZkWXy6HzM+C9/7y1Fgb92jWpysJq9vGGUUTz0BkKCvUlMxHqhMp5i02Efts", "m6vu+9ijYQnzntcaZsIIO5zHyCAbis3Th3DphUrr8FA=", aVar, i2, 51);
                list.add(bfp);
                bfo bfo = new bfo(beh, "q/2qqOlprfBV+5DnfgOaZ+yfPq/WjGfigb+7Vg8zSbbBv1o1N8nnAPF50ZOOs8Wy", "L0dPVMzq/5L4P8Kxm6tGBwVTUFbV4klI3lIA4MMILW0=", aVar, i2, 45, new Throwable().getStackTrace());
                list.add(bfo);
                bft bft = new bft(beh, "ZTtWSCi0SAWGGT5xcYz50/ji6LhrqB6kroOPIyuq9WH5oLEWOLUBGbigMOFBfANb", "zIRXrzQb29YAIrc55d3zyaPImf3te7cAWrGIiibrtNA=", aVar, i2, 57, view);
                list.add(bft);
                bfn bfn = new bfn(beh, "PlW3ztyw5x1V7e3rf+U9Daz54p/bqMFZhZdStSarUh2g5DxAJM065tyZxUWk/8dv", "EAw0UR4ysCkwUeuuoN8S7rfhBv///W3L2kYBG4rijF4=", aVar, i2, 61);
                list.add(bfn);
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43852bt)).booleanValue()) {
                    bev bev = new bev(b, "Rt1STOJiFuOMxpMEjnBwDecMHNVnNiAw/zQBzmT08Jl04kuwPrQNQuBxiU9szvfL", "eP9zyprXvDS7xSPaOtCOI9Bxt5+P36hzwpbFhGmzcAs=", d, b3, 62, view, activity);
                    list.add(bev);
                }
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43854bv)).booleanValue()) {
                    bfq bfq = new bfq(b, "cYaGgecLCFRY2V7Y9Tl78mhrvhHHAirLomgyTc+Na6nciVD7VG6zNl8b3oxtzUhy", "6BQYZY0uuPSohJi+qj+JORTUKOuqVMCCh1hBagbVK6M=", d, b3, 53, this.f41730x);
                    list.add(bfq);
                }
            }
        }
        m48491a(list);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<Callable<Void>> mo40531a(beh beh, Context context, C16247a aVar, C15480a aVar2) {
        int b = beh.mo40555b();
        ArrayList arrayList = new ArrayList();
        if (!beh.f41770k) {
            aVar.mo42234j((long) zzd.PSN_INITIALIZATION_FAIL.zzac());
            return arrayList;
        }
        C16247a aVar3 = aVar;
        beh beh2 = beh;
        C16247a aVar4 = aVar;
        bey bey = new bey(beh2, "hCRUll5b6QVdPNpZdVU2CGBmLGRz1PW1mr4jfo9+Ip4MfazJ/olsGFG3VXbpz2XV", "wUBmpNpisRVe77hveuFPoTPa39okeLRn7toySvJhVsE=", aVar4, b, 27, context, aVar2);
        arrayList.add(bey);
        bfc bfc = new bfc(beh2, "ZGVQ2ZoORBVQMDOSECIyCMviI/CR9W3El4Yp+QRZoi3xwP2CCc1y/r+JmFBWuXJ+", "2HjS59bX16mqgnAJQmCuoos7BNXUHIlQqBFPqiNjIBk=", aVar4, f41727v, b, 25);
        arrayList.add(bfc);
        int i = b;
        bfi bfi = new bfi(beh2, "Fr2Y/+yVsrrHqKcO8V6t4y/A/6xlpjwjNRydvzdd/o/C4XmybBAES9Y03dqI3sne", "P8xsMz9o5Ar44oU4n7P33OMmB8VY2W41WE00s15PwOg=", aVar4, i, 1);
        arrayList.add(bfi);
        bfl bfl = new bfl(beh2, "huHVFTRY+lN8I+eIgy0NwaQRrZ+6gtOYs+x9g6cC2xuMmc8gprNzN8EMk47VQRdQ", "7fYLC2EMeD1SdxI3OsdFkTYSrXYQaT+OkSmoRr0R2NE=", aVar4, i, 31);
        arrayList.add(bfl);
        bfr bfr = new bfr(beh2, "v9TxlW9aHzDnwcmNHy7+DPiSGOPpP3cETwIqXxag8syaL5FGU5XGsmQeSpEDg9+5", "92frEobGaOfGZPjYxO0Dide7CvnUqK+DGW50Oyvc3P0=", aVar4, i, 33);
        arrayList.add(bfr);
        bex bex = new bex(beh2, "DrRLUBZRv5J2Lv1m+YXfx8im/cu9TP8LGt7hHPrAmBOuIcqODsdEGFExAshmfneS", "1YpGOn7Hd1CkbYui5lpCxExt0/rhfQJtu9UHr8sBA74=", aVar4, i, 29, context);
        arrayList.add(bex);
        bfa bfa = new bfa(beh2, "iIPU9ISRBdOnHclpDn4xdsSCNLwgLWQgFudxmUDQkRjY4EHWKm7GS32gyjgN6Ffe", "Td+YbSEAhp7F/YLX6hbq3lkmb7FbxNyDt8f2ICiIwO4=", aVar4, i, 5);
        arrayList.add(bfa);
        bfh bfh = new bfh(beh2, "9Grizry2ogEc785kj8Vl1FfA8MnqboZGMz+Q/xQD8tNoXM+Wjf1DNBULhEqpTKaP", "LVdcl6SzG0jH7HWlHiwjtlxjMsjoTYdpp1chcmRyEkI=", aVar4, i, 12);
        arrayList.add(bfh);
        bfj bfj = new bfj(beh2, "zPWyi5jU+DA6ZACYDnEUud/d+N/pb3IV51xf/34plRk8gMgYgb48oLIx0/VJ6y7b", "tCiNoeiCN5e0/E2/LurLolsDGzjSPwyYgd8htOkAB7Y=", aVar4, i, 3);
        arrayList.add(bfj);
        bfb bfb = new bfb(beh2, "0r4fbKSCtqhjRXPqvEOtTujoMwjR+fFmFtFj5tCC8AETmOiDnqGOyAovU875FDg/", "Ai7P/FkP/genjxsxZTcPxkBguSzfKbaocOZrpfBRSVU=", aVar4, i, 44);
        arrayList.add(bfb);
        bff bff = new bff(beh2, "UBMZcyjyD/uvnoDTNErukMhVPEHw3WYnhdULCFJ5dG7LopHZlA7cwSj4XF8aTltu", "QAo5ceIHQyUNAOzxc8iTsCsWhqYHeqEAywzCMCDdTh8=", aVar4, i, 22);
        arrayList.add(bff);
        bfs bfs = new bfs(beh2, "gfWP0RYDcSCETqUTE2g3eBoeM4p7j7qvdIE+W5+hDCTBLlnhtt2EKQwpC7vXxZx0", "sQVUgIHkWZ0xZxiWHLL+Z3JY0C2mPXbrP2qshcc/wcI=", aVar4, i, 48);
        arrayList.add(bfs);
        bew bew = new bew(beh2, "qTP53ysrLbDGAQVj6/Zcc1lvlsjUWD87lvYWoBkqohfJzKO3NjDKaEB3A8bgGOUR", "YFXxghpE1Ztl/NevvUrgbwr1YZMfl+sAULlxeze6d20=", aVar4, i, 49);
        arrayList.add(bew);
        bfp bfp = new bfp(beh2, "akrTIZkWXy6HzM+C9/7y1Fgb92jWpysJq9vGGUUTz0BkKCvUlMxHqhMp5i02Efts", "m6vu+9ijYQnzntcaZsIIO5zHyCAbis3Th3DphUrr8FA=", aVar4, i, 51);
        arrayList.add(bfp);
        bfn bfn = new bfn(beh2, "PlW3ztyw5x1V7e3rf+U9Daz54p/bqMFZhZdStSarUh2g5DxAJM065tyZxUWk/8dv", "EAw0UR4ysCkwUeuuoN8S7rfhBv///W3L2kYBG4rijF4=", aVar4, i, 61);
        arrayList.add(bfn);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43812bF)).booleanValue()) {
            bfg bfg = new bfg(beh, "JiG6qxw1Yf73JNFwCB/14z7vm4q0e+zUXVA4WE2bbn825/FOdXUFmpVrTL9qNb1Y", "fvR2PR8KVUU7FNBzJgP5YtrSr1sOJT/F9MQaT5WvXYs=", aVar, b, 11);
            arrayList.add(bfg);
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43811bE)).booleanValue()) {
            bfk bfk = new bfk(beh, "ZauyytzZd663JCdzysGWPZ5kOxqjM4pKg97Lc27ZmXwWo+BZ0x7W9lX+wlwvtPFU", "67rmj+/kacXdmSGLstOfMCPKQUB6qZtgo4An3ttSPhs=", aVar, b, 73);
            arrayList.add(bfk);
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m48493b(beh beh, Context context, C16247a aVar, C15480a aVar2) {
        if (beh.f41761b != null) {
            m48491a(mo40531a(beh, context, aVar, aVar2));
        }
    }

    /* renamed from: a */
    private static void m48491a(List<Callable<Void>> list) {
        if (f41704a != null) {
            ExecutorService executorService = f41704a.f41761b;
            if (executorService != null && !list.isEmpty()) {
                try {
                    executorService.invokeAll(list, ((Long) bym.m50299d().mo41272a(C15585bw.f43851bs)).longValue(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bep mo40530b(MotionEvent motionEvent) throws zzdu {
        Method a = f41704a.mo40552a("4UGr6YhPnwjALzAXCIgZCUlHJZloZzNANm8d44v6av6ZcyB7RvbUzloAP0XVY1fS", "MD3X7z5OYR+8cKRMRCpNlEaVLmq1ab4kWhheNXFQF9o=");
        if (a == null || motionEvent == null) {
            throw new zzdu();
        }
        try {
            return new bep((String) a.invoke(null, new Object[]{motionEvent, this.f41720q}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzdu(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo40527a(StackTraceElement[] stackTraceElementArr) throws zzdu {
        Method a = f41704a.mo40552a("q/2qqOlprfBV+5DnfgOaZ+yfPq/WjGfigb+7Vg8zSbbBv1o1N8nnAPF50ZOOs8Wy", "L0dPVMzq/5L4P8Kxm6tGBwVTUFbV4klI3lIA4MMILW0=");
        if (a == null || stackTraceElementArr == null) {
            throw new zzdu();
        }
        try {
            return new C15564bef((String) a.invoke(null, new Object[]{stackTraceElementArr})).f41754a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzdu(e);
        }
    }

    /* renamed from: a */
    public final void mo37778a(View view) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43854bv)).booleanValue()) {
            if (this.f41730x == null) {
                this.f41730x = new bes(f41704a, view);
            } else {
                this.f41730x.mo40564a(view);
            }
        }
    }
}
