package dmt.p1861av.video.superentrance;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.superentrance.a */
public final class C47494a {
    /* renamed from: a */
    public static final String m148228a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 463403621) {
            if (hashCode != 1365911975) {
                if (hashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                    return "mic";
                }
            } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return "storage";
            }
        } else if (str.equals("android.permission.CAMERA")) {
            return "camera";
        }
        return "";
    }

    /* renamed from: a */
    public static final void m148229a(Context context) {
        boolean z;
        boolean z2;
        C7573i.m23587b(context, "context");
        boolean z3 = true;
        if (C35563c.f93224F.mo70088c().mo90359b(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C35563c.f93224F.mo70088c().mo90354a(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C35563c.f93224F.mo70088c().mo90360c(context) != 0) {
            z3 = false;
        }
        List arrayList = new ArrayList();
        if (!z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!z2) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!z3) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            for (String a : (String[]) array) {
                C6907h.m21524a("permission_toast_show", (Map) C22984d.m75611a().mo59973a("permission_type", m148228a(a)).mo59973a("enter_from", "video_shoot_page").f60753a);
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final void m148230a(String[] strArr, int[] iArr) {
        boolean z;
        String str;
        if (iArr != null) {
            boolean z2 = true;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && strArr != null) {
                if (strArr.length != 0) {
                    z2 = false;
                }
                if (!z2 && strArr.length == iArr.length) {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str2 = "permission_toast_result";
                        C22984d a = C22984d.m75611a().mo59973a("permission_type", m148228a(strArr[i]));
                        String str3 = "permission_result";
                        if (iArr[i] == 0) {
                            str = "confirm";
                        } else {
                            str = "deny";
                        }
                        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("enter_from", "video_shoot_page").f60753a);
                    }
                }
            }
        }
    }
}
