package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15323f;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.em */
public final class C16922em extends C16849bv {

    /* renamed from: a */
    private static final String[] f47320a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    private SecureRandom f47321b;

    /* renamed from: c */
    private final AtomicLong f47322c = new AtomicLong(0);

    /* renamed from: d */
    private int f47323d;

    /* renamed from: e */
    private Integer f47324e;

    C16922em(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43602d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo43603e() {
        mo43571c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo43585q().f47490d.mo44160a("Utils falling back to Random for random id");
            }
        }
        this.f47322c.set(nextLong);
    }

    /* renamed from: f */
    public final long mo43912f() {
        long andIncrement;
        long j;
        if (this.f47322c.get() == 0) {
            synchronized (this.f47322c) {
                long nextLong = new Random(System.nanoTime() ^ mo43580l().mo38684a()).nextLong();
                int i = this.f47323d + 1;
                this.f47323d = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f47322c) {
            this.f47322c.compareAndSet(-1, 1);
            andIncrement = this.f47322c.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final SecureRandom mo43914g() {
        mo43571c();
        if (this.f47321b == null) {
            this.f47321b = new SecureRandom();
        }
        return this.f47321b;
    }

    /* renamed from: a */
    static boolean m55963a(String str) {
        C15267r.m44386a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo43896a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(C38347c.f99553h, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo43585q().f47490d.mo44161a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m55961a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43905a(String str, String str2) {
        if (str2 == null) {
            mo43585q().f47487a.mo44161a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo43585q().f47487a.mo44161a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo43585q().f47487a.mo44162a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo43585q().f47487a.mo44162a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m55973d(String str, String str2) {
        if (str2 == null) {
            mo43585q().f47487a.mo44161a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo43585q().f47487a.mo44161a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo43585q().f47487a.mo44162a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo43585q().f47487a.mo44162a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43906a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo43585q().f47487a.mo44161a("Name is required and can't be null. Type", str);
            return false;
        }
        C15267r.m44384a(str2);
        String[] strArr2 = f47320a;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo43585q().f47487a.mo44162a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C15267r.m44384a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m55972c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo43585q().f47487a.mo44162a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43904a(String str, int i, String str2) {
        if (str2 == null) {
            mo43585q().f47487a.mo44161a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo43585q().f47487a.mo44163a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo43907b(String str) {
        if (!m55973d("event", str)) {
            return 2;
        }
        if (!mo43906a("event", C16851bx.f47097a, str)) {
            return 13;
        }
        if (!mo43904a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo43910c(String str) {
        if (!m55973d("user property", str)) {
            return 6;
        }
        if (!mo43906a("user property", C16853bz.f47101a, str)) {
            return 15;
        }
        if (!mo43904a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m55964a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            mo43585q().f47490d.mo44163a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            if ((obj instanceof Parcelable[]) && z) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        mo43585q().f47490d.mo44162a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo43585q().f47490d.mo44162a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo43909b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m55975g(str)) {
                if (this.f47095q.mo43665i()) {
                    mo43585q().f47487a.mo44161a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C16953r.m56340a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f47095q.mo43665i()) {
                mo43585q().f47487a.mo44160a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m55975g(str2)) {
            mo43585q().f47487a.mo44161a("Invalid admob_app_id. Analytics disabled.", C16953r.m56340a(str2));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m55965a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: g */
    private static boolean m55975g(String str) {
        C15267r.m44384a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: a */
    private static Object m55956a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m55958a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m55958a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    static Object m55957a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m55956a(256, obj, true);
        }
        if (!m55974e(str)) {
            i = 100;
        }
        return m55956a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m55967a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo43904a("event param", 40, r14) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (mo43904a("event param", 40, r14) == false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo43898a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r6 = r17
            r7 = r20
            r8 = r21
            r9 = 0
            if (r7 == 0) goto L_0x0170
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r20.keySet()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r13 = 0
        L_0x0018:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0033
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0075
        L_0x0033:
            r1 = 14
            if (r22 == 0) goto L_0x0055
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo43905a(r2, r14)
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r2 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo43906a(r2, r9, r14)
            if (r2 != 0) goto L_0x004c
            r2 = 14
            goto L_0x0056
        L_0x004c:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo43904a(r2, r15, r14)
            if (r2 != 0) goto L_0x0055
            goto L_0x003f
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "event param"
            boolean r2 = r6.m55973d(r2, r14)
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            r1 = 3
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo43906a(r2, r9, r14)
            if (r2 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "event param"
            boolean r1 = r6.mo43904a(r1, r15, r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0060
        L_0x0074:
            r1 = r2
        L_0x0075:
            r5 = 1
            if (r1 == 0) goto L_0x0091
            boolean r2 = m55962a(r10, r1)
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = m55958a(r14, r15, r5)
            java.lang.String r3 = "_ev"
            r10.putString(r3, r2)
            if (r1 != r0) goto L_0x008c
            m55959a(r10, r14)
        L_0x008c:
            r10.remove(r14)
            goto L_0x012b
        L_0x0091:
            java.lang.Object r4 = r7.get(r14)
            r17.mo43571c()
            if (r23 == 0) goto L_0x00cc
            java.lang.String r0 = "param"
            boolean r1 = r4 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00a5
            r1 = r4
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            int r1 = r1.length
            goto L_0x00b0
        L_0x00a5:
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00c5
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        L_0x00b0:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L_0x00c5
            com.google.android.gms.measurement.internal.r r2 = r17.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47490d
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo44163a(r3, r0, r14, r1)
            r0 = 0
            goto L_0x00c6
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            if (r0 != 0) goto L_0x00cc
            r0 = 17
            r9 = 1
            goto L_0x0108
        L_0x00cc:
            com.google.android.gms.measurement.internal.eu r0 = r17.mo43587s()
            r3 = r18
            boolean r0 = r0.mo44058f(r3)
            if (r0 == 0) goto L_0x00de
            boolean r0 = m55974e(r19)
            if (r0 != 0) goto L_0x00e4
        L_0x00de:
            boolean r0 = m55974e(r14)
            if (r0 == 0) goto L_0x00f5
        L_0x00e4:
            java.lang.String r1 = "param"
            r16 = 256(0x100, float:3.59E-43)
            r0 = r17
            r2 = r14
            r3 = r16
            r9 = 1
            r5 = r23
            boolean r0 = r0.m55964a(r1, r2, r3, r4, r5)
            goto L_0x0103
        L_0x00f5:
            r9 = 1
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r17
            r2 = r14
            r5 = r23
            boolean r0 = r0.m55964a(r1, r2, r3, r4, r5)
        L_0x0103:
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0108
        L_0x0107:
            r0 = 4
        L_0x0108:
            if (r0 == 0) goto L_0x012e
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x012e
            boolean r0 = m55962a(r10, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = m55958a(r14, r15, r9)
            java.lang.String r1 = "_ev"
            r10.putString(r1, r0)
            java.lang.Object r0 = r7.get(r14)
            m55959a(r10, r0)
        L_0x0128:
            r10.remove(r14)
        L_0x012b:
            r9 = 0
            goto L_0x0018
        L_0x012e:
            boolean r0 = m55963a(r14)
            if (r0 == 0) goto L_0x016d
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x016d
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.r r1 = r17.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a
            com.google.android.gms.measurement.internal.p r2 = r17.mo43582n()
            r3 = r19
            java.lang.String r2 = r2.mo44153a(r3)
            com.google.android.gms.measurement.internal.p r4 = r17.mo43582n()
            java.lang.String r4 = r4.mo44150a(r7)
            r1.mo44162a(r0, r2, r4)
            r0 = 5
            m55962a(r10, r0)
            r10.remove(r14)
            goto L_0x012b
        L_0x016d:
            r3 = r19
            goto L_0x012b
        L_0x0170:
            r10 = 0
        L_0x0171:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16922em.mo43898a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m55962a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m55959a(Bundle bundle, Object obj) {
        C15267r.m44384a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: h */
    private static int m55976h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo43908b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m55964a("user property referrer", str, m55976h(str), obj, false);
        } else {
            z = m55964a("user property", str, m55976h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* renamed from: c */
    static Object m55970c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m55956a(m55976h(str), obj, true);
        }
        return m55956a(m55976h(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43902a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo43585q().f47492f.mo44162a("Not putting event parameter. Invalid value type. name, type", mo43582n().mo44154b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43900a(int i, String str, String str2, int i2) {
        mo43903a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43903a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m55962a(bundle, i);
        if (mo43587s().mo44054d(str, C16942h.f47428au)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f47095q.mo43661e().mo43731a("auto", "_err", bundle);
    }

    /* renamed from: h */
    static MessageDigest m55977h() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static long m55955a(byte[] bArr) {
        C15267r.m44384a(bArr);
        int i = 0;
        C15267r.m44390a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m55960a(Context context, boolean z) {
        C15267r.m44384a(context);
        if (VERSION.SDK_INT >= 24) {
            return m55969b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m55969b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: b */
    private static boolean m55969b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo43911d(String str) {
        mo43571c();
        if (C15176d.m44159a(mo43581m()).mo38460a(str) == 0) {
            return true;
        }
        mo43585q().f47494h.mo44161a("Permission not granted", str);
        return false;
    }

    /* renamed from: e */
    static boolean m55974e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: c */
    static boolean m55972c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo43913f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo43587s().mo44063j().equals(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo43897a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = m55957a(str, bundle.get(str));
                if (a == null) {
                    mo43585q().f47490d.mo44161a("Param value can't be null", mo43582n().mo44154b(str));
                } else {
                    mo43902a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzag mo43899a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo43907b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            zzag zzag = new zzag(str2, new zzad(mo43897a(mo43898a(str, str2, bundle2, C15323f.m44565a("_o"), false, false))), str3, j);
            return zzag;
        }
        mo43585q().f47487a.mo44161a("Invalid conditional property event name", mo43582n().mo44155c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo43895a(Context context, String str) {
        mo43571c();
        C15267r.m44384a(context);
        C15267r.m44386a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = m55977h();
        if (h == null) {
            mo43585q().f47487a.mo44160a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m55971c(context, str)) {
                    PackageInfo b = C15176d.m44159a(context).mo38467b(mo43581m().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m55955a(h.digest(b.signatures[0].toByteArray()));
                    }
                    mo43585q().f47490d.mo44160a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo43585q().f47487a.mo44161a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: c */
    private final boolean m55971c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C15176d.m44159a(context).mo38467b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo43585q().f47487a.mo44161a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo43585q().f47487a.mo44161a("Package name not found", e2);
        }
        return true;
    }

    /* renamed from: a */
    static byte[] m55966a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m55968b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: i */
    public final int mo43915i() {
        if (this.f47324e == null) {
            this.f47324e = Integer.valueOf(C15167c.getInstance().getApkVersion(mo43581m()) / 1000);
        }
        return this.f47324e.intValue();
    }

    /* renamed from: a */
    public final int mo43894a(int i) {
        return C15167c.getInstance().isGooglePlayServicesAvailable(mo43581m(), C15181e.f39276b);
    }

    /* renamed from: a */
    public static long m55954a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final String mo43916j() {
        byte[] bArr = new byte[16];
        mo43914g().nextBytes(bArr);
        return C1642a.m8035a(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43901a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo43585q().f47490d.mo44161a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
