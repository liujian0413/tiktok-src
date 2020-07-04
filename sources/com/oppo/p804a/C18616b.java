package com.oppo.p804a;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Pair;
import android.util.Size;
import android.util.Slog;
import com.oppo.p804a.C18613a.C18614a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.oppo.a.b */
public class C18616b {

    /* renamed from: a */
    public static C18613a f50300a;

    /* renamed from: d */
    private static C18616b f50301d;

    /* renamed from: b */
    public IBinder f50302b;

    /* renamed from: c */
    public DeathRecipient f50303c = new DeathRecipient() {
        public final void binderDied() {
            Slog.w("OMediaManager", "omedia server die.");
            if (C18616b.this.f50302b != null) {
                C18616b.this.f50302b.unlinkToDeath(C18616b.this.f50303c, 0);
                C18616b.this.f50302b = null;
            }
            C18616b.f50300a = null;
        }
    };

    private C18616b() {
        m61069c();
    }

    /* renamed from: a */
    public static C18616b m61064a() {
        if (f50300a == null) {
            synchronized (C18616b.class) {
                if (f50300a == null) {
                    f50301d = new C18616b();
                }
            }
        }
        return f50301d;
    }

    /* renamed from: b */
    public final String mo48806b() {
        if (f50300a == null && !m61069c()) {
            return null;
        }
        try {
            return f50300a.mo48799a();
        } catch (RemoteException unused) {
            f50300a = null;
            return null;
        }
    }

    /* renamed from: c */
    private boolean m61069c() {
        this.f50302b = ServiceManager.checkService("omedia");
        C18613a a = C18614a.m61059a(this.f50302b);
        f50300a = a;
        if (a == null) {
            return false;
        }
        try {
            this.f50302b.linkToDeath(this.f50303c, 0);
            return true;
        } catch (RemoteException unused) {
            f50300a = null;
            this.f50302b = null;
            return false;
        }
    }

    /* renamed from: c */
    public final String mo48808c(String str) {
        if (f50300a == null && !m61069c()) {
            return null;
        }
        try {
            return f50300a.mo48800a(str);
        } catch (RemoteException unused) {
            f50300a = null;
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo48805a(String str) {
        if (f50300a == null && !m61069c()) {
            return false;
        }
        try {
            return f50300a.mo48802b(str);
        } catch (RemoteException unused) {
            f50300a = null;
            return false;
        }
    }

    /* renamed from: b */
    public final String mo48807b(String str) {
        if (f50300a == null && !m61069c()) {
            return null;
        }
        try {
            String a = f50300a.mo48801a("1.1:2019-03-27", str);
            if (a == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":1.1");
            return sb.toString();
        } catch (RemoteException unused) {
            f50300a = null;
            return null;
        }
    }

    /* renamed from: a */
    private static List<Size> m61065a(String str, String str2) {
        String[] strArr;
        Size size;
        List<Size> list = null;
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("StreamSize");
            String sb2 = sb.toString();
            if (jSONObject.has(sb2)) {
                String string = jSONObject.getString(sb2);
                if (!string.isEmpty()) {
                    if (string.isEmpty()) {
                        strArr = null;
                    } else {
                        strArr = string.split(",");
                    }
                    if (strArr != null) {
                        if (strArr.length != 0) {
                            for (String str3 : strArr) {
                                if (str3.isEmpty()) {
                                    size = new Size(0, 0);
                                } else {
                                    size = Size.parseSize(str3);
                                }
                                if (size.getHeight() > 0 && size.getWidth() > 0) {
                                    arrayList.add(size);
                                }
                            }
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("stream split fail.");
                    sb3.append(string);
                    Slog.w("OMediaManager", sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("capabiliyJson:");
                sb4.append(jSONObject);
                sb4.append("key:");
                sb4.append(sb2);
                Slog.w("OMediaManager", sb4.toString());
            }
            list = arrayList;
        } catch (JSONException unused) {
            Slog.w("OMediaManager", "got a json exception.");
        } catch (NumberFormatException unused2) {
            StringBuilder sb5 = new StringBuilder("capablity format is invalid.");
            sb5.append(str);
            sb5.append(" ");
            sb5.append(str2);
            Slog.w("OMediaManager", sb5.toString());
        }
        return list;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m61068b(String str, String str2) {
        String[] strArr;
        Pair<Integer, Integer> create = Pair.create(Integer.valueOf(0), Integer.valueOf(0));
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return create;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("StreamCount");
            String sb2 = sb.toString();
            if (jSONObject.has(sb2)) {
                String string = jSONObject.getString(sb2);
                if (string.isEmpty()) {
                    strArr = null;
                } else {
                    strArr = string.split(":");
                }
                if (2 == strArr.length) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[0]));
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                    if (valueOf2.intValue() >= valueOf.intValue() && valueOf.intValue() > 0) {
                        create = Pair.create(valueOf, valueOf2);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("capablity format is invalid.");
                    sb3.append(str);
                    sb3.append(" ");
                    sb3.append(str2);
                    Slog.w("OMediaManager", sb3.toString());
                }
            }
        } catch (JSONException unused) {
            StringBuilder sb4 = new StringBuilder("capablity format is invalid.");
            sb4.append(str);
            sb4.append(" ");
            sb4.append(str2);
            Slog.w("OMediaManager", sb4.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb5 = new StringBuilder("capablity format is invalid.");
            sb5.append(str);
            sb5.append(" ");
            sb5.append(str2);
            Slog.w("OMediaManager", sb5.toString());
        }
        return create;
    }

    /* renamed from: a */
    public static boolean m61066a(String str, String str2, int i) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        Pair b = m61068b(str, str2);
        Integer num = new Integer(i);
        if (((Integer) b.first).intValue() <= 0 || ((Integer) b.second).intValue() <= 0 || num.intValue() < ((Integer) b.first).intValue() || num.intValue() > ((Integer) b.second).intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m61067a(String str, String str2, Size size) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        List<Size> a = m61065a(str, str2);
        if (a == null || a.size() == 0) {
            Slog.w("OMediaManager", "feature size is empty.");
            return false;
        }
        for (Size equals : a) {
            if (size.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
