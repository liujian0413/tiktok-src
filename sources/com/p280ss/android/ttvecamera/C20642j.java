package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ttm.player.MediaPlayer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j */
public final class C20642j {

    /* renamed from: a */
    static final ArrayList<TEFrameSizei> f55755a = new ArrayList<>(Arrays.asList(new TEFrameSizei[]{new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(PreloadTask.BYTE_UNIT_NUMBER, 576), new TEFrameSizei(PreloadTask.BYTE_UNIT_NUMBER, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, PreloadTask.BYTE_UNIT_NUMBER), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)}));

    /* renamed from: b */
    private static int f55756b = 1920;

    /* renamed from: c */
    private static String f55757c;

    /* renamed from: d */
    private static boolean f55758d = true;

    /* renamed from: e */
    private static String[] f55759e = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* renamed from: f */
    private static String[] f55760f = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* renamed from: g */
    private static boolean f55761g = true;

    /* renamed from: h */
    private static Class f55762h;

    /* renamed from: i */
    private static Field f55763i;

    /* renamed from: j */
    private static Method f55764j;

    /* renamed from: a */
    public static int m68407a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static boolean m68414a() {
        return f55761g;
    }

    /* renamed from: a */
    public static int[] m68418a(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* renamed from: a */
            private int m68421a(int[] iArr) {
                int i;
                int i2;
                if (iArr[0] > iArr[0]) {
                    i = (iArr[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr[0]) * 3;
                }
                if (iArr[1] > iArr[1]) {
                    i2 = (iArr[1] - iArr[1]) * 4;
                } else {
                    i2 = (iArr[1] - iArr[1]) * 1;
                }
                return i + i2;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public int compare(int[] iArr, int[] iArr2) {
                return m68421a(iArr) - m68421a(iArr2);
            }
        });
    }

    /* renamed from: a */
    public static boolean m68416a(Object obj) {
        try {
            if (f55762h == null || f55763i == null || f55764j == null) {
                f55762h = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f55763i = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f55762h.getDeclaredMethod("finalize", new Class[0]);
                f55764j = declaredMethod;
                declaredMethod.setAccessible(true);
                f55763i.setAccessible(true);
            }
            f55764j.invoke(f55763i.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            C20652m.m68436c("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (NoSuchMethodException unused2) {
            C20652m.m68436c("TECameraUtils", "finalize method not found");
            return false;
        } catch (NoSuchFieldException unused3) {
            C20652m.m68436c("TECameraUtils", "mResults field not found");
            return false;
        } catch (IllegalAccessException unused4) {
            C20652m.m68436c("TECameraUtils", "illegal access");
            return false;
        } catch (InvocationTargetException unused5) {
            C20652m.m68436c("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C20652m.m68436c("TECameraUtils", "unknown error");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m68417a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048 A[SYNTHETIC, Splitter:B:27:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004e A[SYNTHETIC, Splitter:B:33:0x004e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m68420b() {
        /*
            java.lang.String r0 = f55757c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = f55757c
            return r0
        L_0x000b:
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
        L_0x0018:
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = "Hardware"
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r3 = 1
            if (r1 <= r3) goto L_0x0018
            r0 = r0[r3]     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            f55757c = r0     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r2.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return r0
        L_0x003c:
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x0040:
            r0 = move-exception
            goto L_0x0046
        L_0x0042:
            r1 = r2
            goto L_0x004c
        L_0x0044:
            r0 = move-exception
            r2 = r1
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            java.lang.String r0 = android.os.Build.HARDWARE
            f55757c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.C20642j.m68420b():java.lang.String");
    }

    static {
        int i = 0;
        String b = m68420b();
        if (!TextUtils.isEmpty(b)) {
            b = b.toUpperCase();
            String[] strArr = f55759e;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (b.contains(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
            String[] strArr2 = f55760f;
            int length2 = strArr2.length;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (strArr2[i].equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("cpuHardware: ");
        sb.append(b);
        sb.append(", isHighPerformanceCpu: ");
        sb.append(f55758d);
        sb.append("model: ");
        sb.append(str);
        sb.append(", isInAbortCapturesBlackList: ");
        sb.append(f55761g);
        C20652m.m68434a("TECameraUtils", sb.toString());
    }

    /* renamed from: a */
    public static int m68406a(int i) {
        return m68407a(i, -1000, 1000);
    }

    /* renamed from: a */
    public static boolean m68415a(Rect rect) {
        if (rect == null || rect.isEmpty() || rect.left < 0 || rect.right < 0 || rect.top < 0 || rect.bottom < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m68408a(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return NormalGiftView.ALPHA_180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    private static TEFrameSizei m68419b(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (tEFrameSizei3.f55535a >= tEFrameSizei.f55535a && tEFrameSizei3.f55536b >= tEFrameSizei.f55536b) {
                if (tEFrameSizei2 == null || tEFrameSizei3.f55535a < tEFrameSizei2.f55535a) {
                    tEFrameSizei2 = tEFrameSizei3;
                }
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    /* renamed from: a */
    public static TEFrameSizei m68409a(List<TEFrameSizei> list, float f) {
        TEFrameSizei tEFrameSizei = null;
        if (f <= 0.0f) {
            return null;
        }
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei2 : list) {
                if (Float.compare(f, ((float) tEFrameSizei2.f55535a) / ((float) tEFrameSizei2.f55536b)) == 0) {
                    arrayList.add(tEFrameSizei2);
                } else {
                    arrayList2.add(tEFrameSizei2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.contains(f55755a.get(14))) {
                    return (TEFrameSizei) f55755a.get(14);
                }
                if (arrayList.contains(f55755a.get(16))) {
                    return (TEFrameSizei) f55755a.get(16);
                }
                Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                    /* renamed from: a */
                    private static int m68427a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                        return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        return m68427a((TEFrameSizei) obj, (TEFrameSizei) obj2);
                    }
                });
                tEFrameSizei = (TEFrameSizei) arrayList.get(0);
            } else if (arrayList2.contains(f55755a.get(14))) {
                return (TEFrameSizei) f55755a.get(14);
            } else {
                if (arrayList.contains(f55755a.get(16))) {
                    return (TEFrameSizei) f55755a.get(16);
                }
                Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
                    /* renamed from: a */
                    private static int m68428a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                        return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        return m68428a((TEFrameSizei) obj, (TEFrameSizei) obj2);
                    }
                });
                tEFrameSizei = (TEFrameSizei) arrayList.get(arrayList.size() / 2);
            }
        }
        return tEFrameSizei;
    }

    /* renamed from: a */
    public static TEFrameSizei m68410a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i = tEFrameSizei.f55535a;
        int i2 = tEFrameSizei.f55536b;
        float f = ((float) i) / ((float) i2);
        ArrayList<TEFrameSizei> arrayList = new ArrayList<>();
        ArrayList<TEFrameSizei> arrayList2 = new ArrayList<>();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f, ((float) tEFrameSizei3.f55535a) / ((float) tEFrameSizei3.f55536b)) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                /* renamed from: a */
                private static int m68425a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                    return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m68425a((TEFrameSizei) obj, (TEFrameSizei) obj2);
                }
            });
            for (TEFrameSizei tEFrameSizei4 : arrayList) {
                if (tEFrameSizei2 != null) {
                    if (tEFrameSizei4.f55535a == i && tEFrameSizei4.f55536b == i2) {
                        return tEFrameSizei4;
                    }
                    if (tEFrameSizei4.f55535a <= i || tEFrameSizei4.f55535a >= tEFrameSizei2.f55535a) {
                        if (tEFrameSizei4.f55535a < i) {
                            return tEFrameSizei2;
                        }
                    }
                }
                tEFrameSizei2 = tEFrameSizei4;
            }
            return tEFrameSizei2;
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            /* renamed from: a */
            private static int m68426a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m68426a((TEFrameSizei) obj, (TEFrameSizei) obj2);
            }
        });
        for (TEFrameSizei tEFrameSizei5 : arrayList2) {
            if (tEFrameSizei2 == null || (tEFrameSizei5.f55535a >= i && tEFrameSizei5.f55536b >= i2)) {
                tEFrameSizei2 = tEFrameSizei5;
            } else if (tEFrameSizei5.f55535a < i && tEFrameSizei5.f55536b < i2) {
                return tEFrameSizei2;
            }
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public static TEFrameSizei m68411a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, int i) {
        if (tEFrameSizei != null && tEFrameSizei.mo55603a()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) it.next();
                if (tEFrameSizei2.f55535a * tEFrameSizei.f55536b != tEFrameSizei2.f55536b * tEFrameSizei.f55535a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* renamed from: a */
            private static int m68424a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m68424a((TEFrameSizei) obj, (TEFrameSizei) obj2);
            }
        });
        TEFrameSizei tEFrameSizei3 = null;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TEFrameSizei tEFrameSizei4 = (TEFrameSizei) it2.next();
            if (tEFrameSizei4.f55535a <= i) {
                tEFrameSizei3 = tEFrameSizei4;
                break;
            }
        }
        if (tEFrameSizei3 == null || tEFrameSizei3.f55535a < tEFrameSizei.f55535a || tEFrameSizei3.f55536b < tEFrameSizei.f55536b) {
            tEFrameSizei3 = m68419b(list, tEFrameSizei);
        }
        if (tEFrameSizei3 == null) {
            C20652m.m68437d("TECameraUtils", "unsupport high quality~~");
        }
        return tEFrameSizei3;
    }

    /* renamed from: a */
    public static TEFrameSizei m68412a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.mo55603a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it.next();
                if (tEFrameSizei3.f55535a * tEFrameSizei.f55536b != tEFrameSizei3.f55536b * tEFrameSizei.f55535a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* renamed from: a */
            private static int m68423a(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                return (tEFrameSizei2.f55535a * tEFrameSizei2.f55536b) - (tEFrameSizei.f55535a * tEFrameSizei.f55536b);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m68423a((TEFrameSizei) obj, (TEFrameSizei) obj2);
            }
        });
        TEFrameSizei tEFrameSizei4 = null;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TEFrameSizei tEFrameSizei5 = (TEFrameSizei) it2.next();
            if (tEFrameSizei4 != null) {
                if (tEFrameSizei5.f55535a != tEFrameSizei2.f55535a || tEFrameSizei5.f55536b != tEFrameSizei2.f55536b) {
                    if (tEFrameSizei5.f55536b <= tEFrameSizei2.f55536b || tEFrameSizei5.f55536b >= tEFrameSizei4.f55536b) {
                        if (tEFrameSizei5.f55536b < tEFrameSizei2.f55536b) {
                            break;
                        }
                    }
                } else {
                    tEFrameSizei4 = tEFrameSizei5;
                    break;
                }
            }
            tEFrameSizei4 = tEFrameSizei5;
        }
        return tEFrameSizei4;
    }

    /* renamed from: a */
    public static void m68413a(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }
}
