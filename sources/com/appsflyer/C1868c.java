package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.c */
final class C1868c {

    /* renamed from: ˋ */
    private static char[] f6765 = {12953, 46792, 14880, 49040, 9199, 42823, 10408, 44100, 4220, 38355, 6456, 33431, 1760, 35414, 4019, 62228, 30561, 63720, 31792, 57447, 26060, 59691, 21148, 55010, 23111, 57272, 17165, 51039, 18641, 52272, 45469, 13821, 47453, 8852, 36797, '0', 47217, 15407, 45261, 13675, 43357, 11667, 41585, 9911, 39580, 7970, 37883, 2122, 35880, 163, 34113, 31225, 64923, 29292, 'b', 33855, 2270, 36223, 4377, 38323, 6660, 40615, 8905, 42794, 11161, 45113, 13321, 47268, 15645, 49585, 17876, 51800, 20136, 53919, 22380, 56275, 24608, 58434, 26804, 60695, 29117, 62860, 31354, 65174, 33589, 1875, 'a', 33840, 2264, 36200, 4375, 38335, 6736, 40636, 8863, 42813, 11138, 45128, 13321, 47282, 15696, 49639, 17810, 51783, 20177, 53915, 22326, 56279, 24691, 58391, 26786, 'a', 33840, 2264, 36200, 4375, 38335, 6736, 40636, 8856, 42799, 11230, 45166, 13343, 47271, 15702, 49639, 17870, 51821, 20217, 53908, 22315, 56281, 24678, 'a', 33840, 2264, 36200, 4375, 38335, 6736, 40636, 8863, 42813, 11138, 45131, 13339, 47295, 15690, 49633, 17844, 51807, 20207, 53905, 46291, 12418, 48234, 14810, 42405, 8461, 44770, 10766, 38444, 5017, 40810, 1174, 32911, 3078, 35327, '.', '\\', 33904, 'j', 33855, 2250, 36219, 4438, 38335, 6747, 40636, 8836, 42787, 11228, 45166, 13313, 47284, '/', 33853, 2269, 36217, 4368, 38323, '.', 33908, 2195, 36166, 4363, 38396, 6684, 40636, 8922, 42855, 'C', 33846, 2265, 36217, 4371, 38309, 6721, 40703, 8885, 42806, 11215, 45167, 13336, 47282, 15693, 49645, 17806, 'F', 33855, 2261, 36214, 4381, 38322, 6676, 40678, 8863, 42862, 11211, 45167, 13340, 47334, 15687, 49635, 17795, 51798, 20217, 53978, 22312, 56279, 24672, 58394, 26864, 60761, 29157, 62878, 31264, 65158, 33633, 1818, 35747, 4219, 37900, 6318, 40273, 8697, 42394, 10856, 44688, 'g', 33851, 2248, 36179, 4374, 38309, 6720, 40691, 8860, 42786, 11209, 45166, 13353, 47286, 15700, 49646, 17801, 51805, 20221, 53902, 22321, 56281, 24698, 58369, 'C', 33846, 2265, 36217, 4371, 38309, 6721, 40703, 8866, 42795, 11210, 45158, 13325, 47269, 15696, 49607, 17816, 51805, 20217, 53898, 22316, 56287, 24699, 58396, 37970, 4139, 40129, 6498, 34057, 422, 36352, 2799, 46730, 13100, 49111, 9333, 40985, 11506, 43330, 22003, 53650, 24134, 56045, 18061, 49976, 20423, 62564, 28742, 64681, 31071, 58860, 24982, 60979, 27350, 5936, 37633, 8125, 33918, 0, 36078, 2377, 46586, 12675, 48675, 15060, 42862, 8977, 44977, 21586, 53416, 23760};

    /* renamed from: ˎ */
    private static int f6766 = 0;

    /* renamed from: ˏ */
    private static long f6767 = 2406303584873383006L;

    /* renamed from: ॱ */
    private static int f6768 = 1;

    /* renamed from: com.appsflyer.c$a */
    static class C1869a extends HashMap<String, Object> {

        /* renamed from: ʽ */
        private static int f6769 = 1;

        /* renamed from: ˊ */
        private static char[] f6770 = {'a', 33465, 1505, 35049, 2837, 36406, 4447, 37994, 5772, 39350, 7387, 40933, 'b', 33453, 1503, 35059, 2840, 'N', 33424, 1505, 35039, 2862, 36378, 4468, 37981, 13289, 45368, 13914, 4021, 36205, 2564, 34594, 1226, 33260, 7881, 39853, 6478, 38506, 4864, 36916, 11718, 43764, 10120, 42156, 8772, 48956, 15382, 47419, 14041, 46008, 12434, 52671, 19266, 51252, 17666, 49727, 24515, 56568, 22993, 54967, 21579, 53519, 28200, 60382, 26875, 58753, 25254, 57412, 32049, 64068, 1004, 33085, 1631, 35619, 2242, 36325, 4740, 7213, 40701, 6535, 38053, 5955, 37468, 3344, 34855, 2781, 34303, 149, 33690, 15966, 47468, 13340, '4', 33521, 1414, 34995, 2894, 36459, '-', 33453, 1501, 34995, 2902, 65354, 32146, 64251, 30685, 62517, 28947, 60982, 27474, 59825, 26261, 58367, 24779, 56633, 23051, 55159, 21587, 53947, 20419, 52457, 18884, 50726, 17223, 49264, 15684, 48040, 14494, 46575, 12937, 44863, 11270, 43386, 9797, 42220, 8694, 40650, 6962, 38933, 5479, 37442, 4284, 36251, 2805, 34688, 1145, 36258, 3966, 34844, 1336, 34525, 1022, 40138, 6636, 39692, 5159, 37138, 4716, 44933, 10485, 42432, 9953, 40961, 15671, 'a', 33457, 1498, 35055, 2835, 36402, 4446, 37943, 5777, 39353, 7362, 40944, 8730, 42279, 10268, 43888, 11667, 45243, 13255, 46818, 14594, 48229, 16232, 49736, 17596, 51091, 19171, 52695, 20541, 54044, 22113, 55625, 23457, 57073, 25049, 58424, 26392, 't', 33466, 1491, 35053, 2841, 36393, 4443, 37997, 5773, 39333, 7379, 'x', 33511, 1416, 's', 33466, 1488, 35054, 2835, 36393, 'b', '&', 33447, '&', 33452, 15218, 47611, 20017, 52408, 19352, 50938, 17754, 49213, 24349, 55935, 22751, 55218, 21203, 53665, 27723, 60272, 26116, 58667};

        /* renamed from: ˋ */
        private static int f6771;

        /* renamed from: ˏ */
        private static long f6772 = -701580288792034593L;

        /* renamed from: ˎ */
        private final Map<String, Object> f6773;

        /* renamed from: ॱ */
        private final Context f6774;

        /* renamed from: com.appsflyer.c$a$c */
        static class C1870c {

            /* renamed from: ˊ */
            private long f6775;

            /* renamed from: ˏ */
            private final Object f6776;

            /* renamed from: ॱ */
            public String f6777;

            C1870c() {
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6775);
                sb.append(",");
                sb.append(this.f6777);
                return sb.toString();
            }

            C1870c(String str) {
                this(System.currentTimeMillis(), str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: ˏ */
            public final boolean mo7463(C1870c cVar) {
                return m8744(cVar.f6775, cVar.f6777);
            }

            /* renamed from: ˋ */
            static String m8743(String str) throws Exception {
                byte[] bytes = str.getBytes();
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ ((i % 2) + 42));
                }
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bytes) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(String.valueOf(hexString2));
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            /* renamed from: ˏ */
            static C1870c m8745(String str) {
                if (str == null) {
                    return new C1870c(0, "");
                }
                String[] split = str.split(",");
                if (split.length < 2) {
                    return new C1870c(0, "");
                }
                return new C1870c(Long.parseLong(split[0]), split[1]);
            }

            C1870c(long j, String str) {
                this.f6776 = new Object();
                this.f6775 = 0;
                this.f6777 = "";
                this.f6775 = j;
                this.f6777 = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
                return false;
             */
            /* renamed from: ˋ */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m8744(long r9, java.lang.String r11) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f6776
                    monitor-enter(r0)
                    r1 = 0
                    if (r11 == 0) goto L_0x0028
                    java.lang.String r2 = r8.f6777     // Catch:{ all -> 0x0025 }
                    boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0025 }
                    if (r2 != 0) goto L_0x0028
                    long r2 = r8.f6775     // Catch:{ all -> 0x0025 }
                    r4 = 0
                    long r2 = r9 - r2
                    r4 = 2000(0x7d0, double:9.88E-321)
                    r6 = 1
                    int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x001c
                    r2 = 1
                    goto L_0x001d
                L_0x001c:
                    r2 = 0
                L_0x001d:
                    if (r2 == 0) goto L_0x0028
                    r8.f6775 = r9     // Catch:{ all -> 0x0025 }
                    r8.f6777 = r11     // Catch:{ all -> 0x0025 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r6
                L_0x0025:
                    r9 = move-exception
                    monitor-exit(r0)
                    throw r9
                L_0x0028:
                    monitor-exit(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1868c.C1869a.C1870c.m8744(long, java.lang.String):boolean");
            }
        }

        /* renamed from: ˏ */
        private String m8740() {
            boolean z;
            char c;
            try {
                String num = Integer.toString(VERSION.SDK_INT);
                String obj = this.f6773.get(m8739(12, 0, 0).intern()).toString();
                String obj2 = this.f6773.get(m8739(5, 12, 0).intern()).toString();
                if (obj2 == null) {
                    obj2 = m8739(8, 17, 0).intern();
                    int i = f6769 + 119;
                    f6771 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    int i2 = i % 2;
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r2 = m8741(num, obj2, sb.toString());
                int length = r2.length();
                if (length <= 4) {
                    while (length < 4) {
                        int i3 = f6769 + 119;
                        f6771 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                        if (i3 % 2 == 0) {
                            c = ']';
                        } else {
                            c = 16;
                        }
                        if (c != 16) {
                            length++;
                            r2.append('1');
                        } else {
                            length += 66;
                            r2.append('H');
                        }
                        int i4 = f6769 + 109;
                        f6771 = i4 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                        int i5 = i4 % 2;
                    }
                } else {
                    int i6 = f6769 + 65;
                    f6771 = i6 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    if (i6 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        r2.delete(4, length);
                    } else {
                        r2.delete(5, length);
                    }
                }
                r2.insert(0, m8739(3, 25, 13186).intern());
                return r2.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m8739(42, 28, 4051).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return m8739(7, 70, 903).intern();
            }
        }

        /* renamed from: ॱ */
        private String m8742() {
            String str;
            boolean z;
            boolean z2;
            int i;
            boolean z3;
            String str2 = "";
            try {
                String obj = this.f6773.get(m8739(12, 0, 0).intern()).toString();
                String obj2 = this.f6773.get(m8739(15, 77, 7243).intern()).toString();
                String replaceAll = m8739(6, 92, 0).intern().replaceAll(m8739(5, 98, 0).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String r7 = C1898r.m8802(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(r7.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m8739(44, 103, 65324).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(m8739(18, 147, 36288).intern());
                str = sb4.toString();
            }
            try {
                Intent registerReceiver = this.f6774.registerReceiver(null, new IntentFilter(m8739(37, 165, 0).intern()));
                if (registerReceiver == null) {
                    z = false;
                } else {
                    z = true;
                }
                int i2 = -2700;
                if (z) {
                    int i3 = f6769 + 9;
                    f6771 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    if (i3 % 2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i2 = registerReceiver.getIntExtra(m8739(11, 202, 0).intern(), -2700);
                    } else {
                        i2 = registerReceiver.getIntExtra(m8739(26, 19887, 0).intern(), 22337);
                    }
                }
                if (!this.f6774.getApplicationInfo().nativeLibraryDir.contains(m8739(3, 213, 0).intern())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    int i4 = f6771 + 37;
                    f6769 = i4 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    int i5 = i4 % 2;
                    i = 1;
                } else {
                    i = 0;
                }
                int size = ((SensorManager) this.f6774.getSystemService(m8739(6, 216, 0).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m8739(1, 222, 0).intern());
                sb5.append(i2);
                sb5.append(m8739(2, 223, 0).intern());
                sb5.append(i);
                sb5.append(m8739(2, 225, 0).intern());
                sb5.append(size);
                sb5.append(m8739(2, 227, 15188).intern());
                sb5.append(this.f6773.size());
                String obj3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(C1870c.m8743(obj3));
                return sb6.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(m8739(44, 103, 65324).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(m8739(16, 229, 20055).intern());
                return sb8.toString();
            }
        }

        /* renamed from: ˏ */
        private static StringBuilder m8741(String... strArr) throws Exception {
            char c;
            int i;
            char c2;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= 3) {
                    break;
                }
                int i3 = f6771 + 63;
                f6769 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                if (i3 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    arrayList.add(Integer.valueOf(strArr[i2].length()));
                    i2 += 31;
                } else {
                    arrayList.add(Integer.valueOf(strArr[i2].length()));
                    i2++;
                }
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < intValue; i4++) {
                int i5 = f6769 + 99;
                f6771 = i5 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                if (i5 % 2 == 0) {
                    c = 'S';
                } else {
                    c = '9';
                }
                if (c != 'S') {
                    i = 1;
                } else {
                    i = 0;
                }
                Integer num = null;
                int i6 = f6771 + 67;
                f6769 = i6 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                int i7 = i6 % 2;
                while (i < 3) {
                    int i8 = f6771 + 87;
                    f6769 = i8 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    int i9 = i8 % 2;
                    char charAt = strArr[i].charAt(i4);
                    if (num != null) {
                        c2 = '\'';
                    } else {
                        c2 = '\\';
                    }
                    if (c2 != '\'') {
                        int i10 = f6771 + 55;
                        f6769 = i10 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                        int i11 = i10 % 2;
                        int i12 = f6769 + 39;
                        f6771 = i12 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                        int i13 = i12 % 2;
                    } else {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i++;
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        C1869a(Map<String, Object> map, Context context) {
            this.f6773 = map;
            this.f6774 = context;
            put(m8740(), m8742());
        }

        /* renamed from: ˊ */
        private static String m8739(int i, int i2, char c) {
            boolean z;
            char c2;
            int i3 = f6769 + 109;
            f6771 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            int i4 = i3 % 2;
            char[] cArr = new char[i];
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int i6 = f6771 + 13;
                    f6769 = i6 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    if (i6 % 2 != 0) {
                        c2 = '4';
                    } else {
                        c2 = '8';
                    }
                    if (c2 != '8') {
                        cArr[i5] = (char) ((int) ((((long) f6770[i2 + i5]) ^ (((long) i5) * f6772)) ^ ((long) c)));
                        i5++;
                    } else {
                        cArr[i5] = (char) ((int) ((((long) f6770[i2 + i5]) - (((long) i5) ^ f6772)) / ((long) c)));
                        i5 += 73;
                    }
                } else {
                    String str = new String(cArr);
                    int i7 = f6769 + 69;
                    f6771 = i7 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    if (i7 % 2 == 0) {
                    }
                    return str;
                }
            }
        }
    }

    /* renamed from: ˊ */
    private static String m8731(Context context) {
        boolean z;
        PackageInfo packageInfo;
        int i = f6766 + 43;
        f6768 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (NameNotFoundException unused) {
                return null;
            }
        } else {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        }
        String str = packageInfo.packageName;
        int i2 = f6768 + 69;
        f6766 = i2 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        int i3 = i2 % 2;
        return str;
    }

    /* renamed from: ˋ */
    private static boolean m8736(String str) {
        char c;
        int i = f6766 + 39;
        f6768 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        int i2 = i % 2;
        try {
            Class.forName(str);
            int i3 = f6766 + 3;
            f6768 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            if (i3 % 2 != 0) {
                c = 26;
            } else {
                c = 11;
            }
            if (c != 11) {
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ˎ */
    private static String m8737(String str) {
        boolean z;
        char c;
        if (str.contains(m8734(1, 169, 0).intern())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        String[] split = str.split(m8734(2, 170, 0).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i = length - 1;
        sb.append(split[i]);
        sb.append(m8734(1, 169, 0).intern());
        int i2 = f6768 + 67;
        f6766 = i2 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        int i3 = i2 % 2;
        int i4 = 1;
        while (i4 < i) {
            int i5 = f6766 + 27;
            f6768 = i5 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            if (i5 % 2 != 0) {
                c = '?';
            } else {
                c = '>';
            }
            if (c != '?') {
                sb.append(split[i4]);
                sb.append(m8734(1, 4461, 0).intern());
                i4 += 54;
            } else {
                sb.append(split[i4]);
                sb.append(m8734(1, 169, 0).intern());
                i4++;
            }
        }
        sb.append(split[0]);
        return sb.toString();
    }

    /* renamed from: ˏ */
    private static String m8738(Context context) {
        char c;
        String str;
        if (!System.getProperties().containsKey(m8734(14, 172, 0).intern())) {
            c = 'T';
        } else {
            c = 'O';
        }
        if (c != 'T') {
            int i = f6768 + 55;
            f6766 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            int i2 = i % 2;
            try {
                Matcher matcher = Pattern.compile(m8734(10, 192, 0).intern()).matcher(context.getCacheDir().getPath().replace(m8734(6, 186, 0).intern(), ""));
                if (matcher.find()) {
                    str = matcher.group(1);
                    int i3 = f6768 + 53;
                    f6766 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    if (i3 % 2 != 0) {
                    }
                    return str;
                }
            } catch (Exception e) {
                C1899s r0 = C1899s.m8812();
                String intern = m8734(17, 202, 0).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m8734(41, 219, 0).intern());
                sb.append(e);
                r0.mo7509(intern, sb.toString());
                return null;
            }
        }
        str = null;
        return str;
    }

    /* renamed from: ˊ */
    private static String m8733(String str, Long l) {
        char c;
        boolean z;
        char c2;
        char c3;
        boolean z2;
        int i = f6768 + 103;
        f6766 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        int i2 = i % 2;
        if (str == null || l == null || str.length() != 32) {
            return m8734(32, 54, 0).intern();
        }
        StringBuilder sb = new StringBuilder(str);
        String obj = l.toString();
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= obj.length()) {
                c = 28;
            } else {
                c = '[';
            }
            if (c != '[') {
                break;
            }
            i4 += Character.getNumericValue(obj.charAt(i3));
            i3++;
        }
        String hexString = Integer.toHexString(i4);
        sb.replace(7, hexString.length() + 7, hexString);
        int i5 = 0;
        while (true) {
            if (i5 >= sb.length()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            int i6 = f6766 + 71;
            f6768 = i6 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            if (i6 % 2 != 0) {
                j += (long) Character.getNumericValue(sb.charAt(i5));
                i5++;
            } else {
                j /= (long) Character.getNumericValue(sb.charAt(i5));
                i5 += 106;
            }
        }
        while (true) {
            if (j <= 100) {
                c2 = 'D';
            } else {
                c2 = 'S';
            }
            if (c2 == 'D') {
                break;
            }
            j %= 100;
        }
        sb.insert(23, (int) j);
        if (j >= 10) {
            c3 = 31;
        } else {
            c3 = '\\';
        }
        if (c3 != 31) {
            int i7 = f6766 + 89;
            f6768 = i7 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            if (i7 % 2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                sb.insert(23, m8734(1, 35, 0).intern());
            } else {
                sb.insert(40, m8734(0, 86, 0).intern());
            }
        }
        String obj2 = sb.toString();
        int i8 = f6766 + 99;
        f6768 = i8 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        if (i8 % 2 != 0) {
        }
        return obj2;
    }

    /* renamed from: ˋ */
    private static String m8735(Context context, String str) {
        char c;
        char c2;
        PackageManager packageManager = context.getPackageManager();
        Class<PackageManager> cls = PackageManager.class;
        try {
            Iterator it = ((List) cls.getDeclaredMethod(m8734(24, 260, 0).intern(), new Class[]{Integer.TYPE}).invoke(packageManager, new Object[]{Integer.valueOf(0)})).iterator();
            int i = f6768 + 49;
            f6766 = i % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            int i2 = i % 2;
            do {
                if (!it.hasNext()) {
                    c = 23;
                } else {
                    c = 3;
                }
                if (c == 23) {
                    int i3 = f6766 + 57;
                    f6768 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                    int i4 = i3 % 2;
                    return Boolean.FALSE.toString();
                } else if (!((ApplicationInfo) it.next()).packageName.equals(str)) {
                    c2 = 31;
                    continue;
                } else {
                    c2 = 27;
                    continue;
                }
            } while (c2 != 27);
            int i5 = f6768 + 21;
            f6766 = i5 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            int i6 = i5 % 2;
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e) {
            C1899s r12 = C1899s.m8812();
            String intern = m8734(24, 284, 0).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m8734(47, 308, 37908).intern());
            sb.append(e);
            r12.mo7509(intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            C1899s r122 = C1899s.m8812();
            String intern2 = m8734(24, 284, 0).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m8734(47, 308, 37908).intern());
            sb2.append(e2);
            r122.mo7509(intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            C1899s r123 = C1899s.m8812();
            String intern3 = m8734(24, 284, 0).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m8734(47, 308, 37908).intern());
            sb3.append(e3);
            r123.mo7509(intern3, sb3.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c7  */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m8732(android.content.Context r13, long r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 13048(0x32f8, float:1.8284E-41)
            r4 = 34
            r5 = 0
            java.lang.String r3 = m8734(r4, r5, r3)
            java.lang.String r3 = r3.intern()
            boolean r3 = m8736(r3)
            r6 = 2
            r7 = 35
            r8 = 36748(0x8f8c, float:5.1495E-41)
            r9 = 1
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = m8734(r9, r7, r5)
        L_0x002d:
            java.lang.String r3 = r3.intern()
            goto L_0x0040
        L_0x0032:
            int r3 = f6766
            int r3 = r3 + 103
            int r10 = r3 % 128
            f6768 = r10
            int r3 = r3 % r6
            java.lang.String r3 = m8734(r9, r4, r8)
            goto L_0x002d
        L_0x0040:
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r13.getPackageName()
            java.lang.String r11 = m8737(r10)
            java.lang.String r12 = m8734(r9, r4, r8)
            java.lang.String r12 = r12.intern()
            r1.append(r12)
            r3.append(r11)
            java.lang.String r11 = m8738(r13)
            r12 = 90
            if (r11 == 0) goto L_0x0069
            r11 = 33
            goto L_0x006b
        L_0x0069:
            r11 = 90
        L_0x006b:
            if (r11 == r12) goto L_0x007c
            java.lang.String r11 = m8734(r9, r4, r8)
            java.lang.String r11 = r11.intern()
            r1.append(r11)
            r3.append(r10)
            goto L_0x008a
        L_0x007c:
            java.lang.String r11 = m8734(r9, r7, r5)
            java.lang.String r11 = r11.intern()
            r1.append(r11)
            r3.append(r10)
        L_0x008a:
            java.lang.String r11 = m8731(r13)
            if (r11 == 0) goto L_0x009f
            java.lang.String r12 = m8734(r9, r4, r8)
            java.lang.String r12 = r12.intern()
            r1.append(r12)
            r3.append(r11)
            goto L_0x00ad
        L_0x009f:
            java.lang.String r11 = m8734(r9, r7, r5)
            java.lang.String r11 = r11.intern()
            r1.append(r11)
            r3.append(r10)
        L_0x00ad:
            java.lang.String r10 = m8735(r13, r10)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            android.content.pm.PackageManager r3 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0222 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x0222 }
            android.content.pm.PackageInfo r13 = r3.getPackageInfo(r13, r5)     // Catch:{ NameNotFoundException -> 0x0222 }
            long r10 = r13.firstInstallTime     // Catch:{ NameNotFoundException -> 0x0222 }
            r13 = 18
            r3 = 36
            r12 = 47112(0xb808, float:6.6018E-41)
            java.lang.String r13 = m8734(r13, r3, r12)     // Catch:{ NameNotFoundException -> 0x0222 }
            java.lang.String r13 = r13.intern()     // Catch:{ NameNotFoundException -> 0x0222 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ NameNotFoundException -> 0x0222 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0222 }
            r3.<init>(r13, r12)     // Catch:{ NameNotFoundException -> 0x0222 }
            java.lang.String r13 = "UTC"
            java.util.TimeZone r13 = java.util.TimeZone.getTimeZone(r13)     // Catch:{ NameNotFoundException -> 0x0222 }
            r3.setTimeZone(r13)     // Catch:{ NameNotFoundException -> 0x0222 }
            java.util.Date r13 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x0222 }
            r13.<init>(r10)     // Catch:{ NameNotFoundException -> 0x0222 }
            java.lang.String r13 = r3.format(r13)     // Catch:{ NameNotFoundException -> 0x0222 }
            r0.append(r13)     // Catch:{ NameNotFoundException -> 0x0222 }
            r0.append(r14)
            r13 = 25
            r3 = 86
            java.lang.String r13 = m8734(r13, r3, r5)
            java.lang.String r13 = r13.intern()
            boolean r13 = m8736(r13)
            if (r13 != 0) goto L_0x0112
            java.lang.String r13 = m8734(r9, r7, r5)
        L_0x010d:
            java.lang.String r13 = r13.intern()
            goto L_0x012c
        L_0x0112:
            int r13 = f6768
            int r13 = r13 + 13
            int r3 = r13 % 128
            f6766 = r3
            int r13 = r13 % r6
            if (r13 != 0) goto L_0x0122
            java.lang.String r13 = m8734(r9, r4, r8)
            goto L_0x010d
        L_0x0122:
            r13 = 99
            java.lang.String r13 = m8734(r9, r13, r8)
            java.lang.String r13 = r13.intern()
        L_0x012c:
            r2.append(r13)
            r13 = 23
            r3 = 111(0x6f, float:1.56E-43)
            java.lang.String r13 = m8734(r13, r3, r5)
            java.lang.String r13 = r13.intern()
            boolean r13 = m8736(r13)
            r3 = 68
            if (r13 != 0) goto L_0x0146
            r13 = 68
            goto L_0x0148
        L_0x0146:
            r13 = 79
        L_0x0148:
            if (r13 == r3) goto L_0x0169
            int r13 = f6766
            int r13 = r13 + r9
            int r3 = r13 % 128
            f6768 = r3
            int r13 = r13 % r6
            if (r13 == 0) goto L_0x0156
            r13 = 0
            goto L_0x0157
        L_0x0156:
            r13 = 1
        L_0x0157:
            if (r13 == 0) goto L_0x0164
            r13 = 45
            java.lang.String r13 = m8734(r9, r13, r8)
            java.lang.String r13 = r13.intern()
            goto L_0x0171
        L_0x0164:
            java.lang.String r13 = m8734(r9, r4, r8)
            goto L_0x016d
        L_0x0169:
            java.lang.String r13 = m8734(r9, r7, r5)
        L_0x016d:
            java.lang.String r13 = r13.intern()
        L_0x0171:
            r2.append(r13)
            r13 = 20
            r3 = 134(0x86, float:1.88E-43)
            java.lang.String r13 = m8734(r13, r3, r5)
            java.lang.String r13 = r13.intern()
            boolean r13 = m8736(r13)
            if (r13 != 0) goto L_0x018f
            java.lang.String r13 = m8734(r9, r7, r5)
        L_0x018a:
            java.lang.String r13 = r13.intern()
            goto L_0x019d
        L_0x018f:
            int r13 = f6766
            int r13 = r13 + 87
            int r3 = r13 % 128
            f6768 = r3
            int r13 = r13 % r6
            java.lang.String r13 = m8734(r9, r4, r8)
            goto L_0x018a
        L_0x019d:
            r2.append(r13)
            r13 = 15
            r3 = 154(0x9a, float:2.16E-43)
            r10 = 46258(0xb4b2, float:6.4821E-41)
            java.lang.String r13 = m8734(r13, r3, r10)
            java.lang.String r13 = r13.intern()
            boolean r13 = m8736(r13)
            r3 = 72
            if (r13 != 0) goto L_0x01ba
            r13 = 72
            goto L_0x01bc
        L_0x01ba:
            r13 = 41
        L_0x01bc:
            if (r13 == r3) goto L_0x01c7
            java.lang.String r13 = m8734(r9, r4, r8)
        L_0x01c2:
            java.lang.String r13 = r13.intern()
            goto L_0x01cc
        L_0x01c7:
            java.lang.String r13 = m8734(r9, r7, r5)
            goto L_0x01c2
        L_0x01cc:
            r2.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = com.appsflyer.C1898r.m8802(r13)
            java.lang.String r13 = com.appsflyer.C1898r.m8804(r13)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r13 = 17
            int r0 = java.lang.Integer.parseInt(r0, r6)
            r3 = 16
            java.lang.String r0 = java.lang.Integer.toString(r0, r3)
            char r0 = r0.charAt(r5)
            r1.setCharAt(r13, r0)
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r13 = 27
            int r0 = java.lang.Integer.parseInt(r0, r6)
            java.lang.String r0 = java.lang.Integer.toString(r0, r3)
            char r0 = r0.charAt(r5)
            r1.setCharAt(r13, r0)
            java.lang.String r13 = r1.toString()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.String r13 = m8733(r13, r14)
            return r13
        L_0x0222:
            r13 = 32
            r14 = 54
            java.lang.String r13 = m8734(r13, r14, r5)
            java.lang.String r13 = r13.intern()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1868c.m8732(android.content.Context, long):java.lang.String");
    }

    /* renamed from: ˋ */
    private static String m8734(int i, int i2, char c) {
        char c2;
        char c3;
        char[] cArr = new char[i];
        int i3 = f6768 + 91;
        f6766 = i3 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        if (i3 % 2 == 0) {
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                c2 = 7;
            } else {
                c2 = 0;
            }
            if (c2 == 7) {
                return new String(cArr);
            }
            int i5 = f6766 + 73;
            f6768 = i5 % PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            if (i5 % 2 != 0) {
                c3 = 8;
            } else {
                c3 = 10;
            }
            if (c3 != 10) {
                cArr[i4] = (char) ((int) ((((long) f6765[i2 + i4]) ^ (((long) i4) * f6767)) ^ ((long) c)));
                i4++;
            } else {
                cArr[i4] = (char) ((int) ((((long) f6765[i2 - i4]) * (((long) i4) & f6767)) ^ ((long) c)));
                i4 += 119;
            }
        }
    }
}
