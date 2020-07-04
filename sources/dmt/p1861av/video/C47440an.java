package dmt.p1861av.video;

import com.p280ss.android.ttve.nativePort.TEVideoUtils;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.vesdk.VEUtils;

/* renamed from: dmt.av.video.an */
public final class C47440an {
    /* renamed from: a */
    public static int[] m148109a(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr;
        }
        return null;
    }

    /* renamed from: b */
    public static int m148110b(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr[7];
        }
        return 0;
    }

    /* renamed from: c */
    public static int m148111c(String str) {
        int[] iArr = new int[10];
        if (TEVideoUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr[6];
        }
        return 0;
    }

    /* renamed from: d */
    public static int m148112d(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr[3];
        }
        return 0;
    }

    /* renamed from: e */
    public static int m148113e(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr[2];
        }
        return 0;
    }
}
