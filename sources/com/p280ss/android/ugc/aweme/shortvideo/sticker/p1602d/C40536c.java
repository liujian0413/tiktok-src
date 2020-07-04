package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.p280ss.android.medialib.jni.PhotoFaceDetection;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43055dg;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.c */
public final class C40536c {

    /* renamed from: f */
    private static final String f105340f;

    /* renamed from: a */
    public boolean f105341a = true;

    /* renamed from: b */
    public C40541a f105342b;

    /* renamed from: c */
    public C40533b f105343c = C40533b.m129595a();

    /* renamed from: d */
    public PhotoFaceDetection f105344d;

    /* renamed from: e */
    public int f105345e;

    /* renamed from: g */
    private long f105346g;

    /* renamed from: h */
    private long f105347h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.c$a */
    public interface C40541a {
        /* renamed from: a */
        void mo100618a(List<Face> list, List<Face> list2, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.c$b */
    static class C40542b {

        /* renamed from: a */
        public long f105353a;

        /* renamed from: b */
        public long f105354b;

        C40542b(long j, long j2) {
            this.f105353a = j;
            this.f105354b = j2;
        }
    }

    /* renamed from: a */
    public static File m129605a() {
        m129610f();
        return new File(f105340f);
    }

    /* renamed from: j */
    private static String m129614j() {
        return C35574k.m114859a().mo70091f().mo93346e(Property.FolderInfo);
    }

    /* renamed from: b */
    public final void mo100611b() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                List b = C40536c.this.f105343c.mo100605b();
                C40536c.this.mo100608a(b);
                C40536c.this.mo100609a(b, null, C40536c.this.f105341a);
            }
        });
    }

    /* renamed from: e */
    public final void mo100614e() {
        if (this.f105344d != null) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (C40536c.this.f105344d != null) {
                        C40536c.this.f105344d.stop();
                    }
                    C40536c.this.f105345e = 0;
                    C40536c.this.f105341a = false;
                    C40536c.this.mo100609a(null, null, C40536c.this.f105341a);
                }
            });
        }
    }

    /* renamed from: f */
    private static void m129610f() {
        if (!C42973bg.m136427a(f105340f)) {
            new File(f105340f).mkdirs();
        }
    }

    /* renamed from: h */
    private void m129612h() {
        C43055dg.m136598a();
        m129606a(C35574k.m114859a().mo70085S().mo15979b((Object) new C40542b(0, 0)));
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C35574k.m114861b().getExternalCacheDir());
        sb.append(File.separator);
        sb.append("faces");
        f105340f = sb.toString();
    }

    /* renamed from: g */
    private C40542b m129611g() {
        C43055dg.m136598a();
        String j = m129614j();
        if (!TextUtils.isEmpty(j)) {
            return (C40542b) C35574k.m114859a().mo70085S().mo15974a(j, C40542b.class);
        }
        return new C40542b(0, 0);
    }

    /* renamed from: i */
    private void m129613i() {
        C43055dg.m136598a();
        if (this.f105347h > 0 && this.f105346g > 0) {
            m129606a(C35574k.m114859a().mo70085S().mo15979b((Object) new C40542b(this.f105346g, this.f105347h)));
        }
    }

    /* renamed from: c */
    public final void mo100612c() {
        C43055dg.m136598a();
        List<Face> b = this.f105343c.mo100605b();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Face face : b) {
            if (!m129608a(face)) {
                arrayList.add(face);
                hashSet.add(face.origin_path);
            }
        }
        if (hashSet.size() > 0) {
            this.f105343c.mo100604a((Set<String>) hashSet);
            mo100609a(null, arrayList, this.f105341a);
        }
        if (arrayList.size() > 0 && arrayList.size() == b.size()) {
            m129612h();
        }
    }

    /* renamed from: d */
    public final void mo100613d() {
        C43055dg.m136598a();
        System.currentTimeMillis();
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
        C40542b g = m129611g();
        List a = C40532a.m129592a(g.f105353a, g.f105354b, absolutePath, 1000);
        if ("VIVO".equals(Build.BRAND.toUpperCase())) {
            a.addAll(C40532a.m129592a(g.f105353a, g.f105354b, Environment.getExternalStoragePublicDirectory("相机").getAbsolutePath(), 1000));
        }
        Collections.sort(a, new Comparator<C40544e>() {
            /* renamed from: a */
            private static int m129622a(C40544e eVar, C40544e eVar2) {
                return Long.signum(eVar2.f105359b - eVar.f105359b);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m129622a((C40544e) obj, (C40544e) obj2);
            }
        });
        Map b = m129609b(a);
        if (a.isEmpty()) {
            this.f105341a = false;
            mo100609a(null, null, this.f105341a);
            return;
        }
        String[] strArr = new String[b.size()];
        b.keySet().toArray(strArr);
        m129607a(strArr, b);
    }

    /* renamed from: a */
    private static void m129606a(String str) {
        C35574k.m114859a().mo70091f().mo93340a(Property.FolderInfo, str);
    }

    /* renamed from: a */
    private static boolean m129608a(Face face) {
        if (!C42973bg.m136427a(face.origin_path) || !C42973bg.m136427a(face.path)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private Map<String, C40544e> m129609b(List<C40544e> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C40544e eVar : list) {
            linkedHashMap.put(eVar.f105358a, eVar);
        }
        for (String remove : this.f105343c.mo100606c()) {
            linkedHashMap.remove(remove);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo100608a(List<Face> list) {
        C43055dg.m136598a();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Face face = (Face) it.next();
            if (!m129608a(face)) {
                hashSet.add(face.origin_path);
                it.remove();
            }
        }
        if (hashSet.size() > 0) {
            this.f105343c.mo100604a((Set<String>) hashSet);
        }
    }

    /* renamed from: a */
    private void m129607a(final String[] strArr, Map<String, C40544e> map) {
        if (this.f105344d != null) {
            this.f105344d.stop();
            m129613i();
        }
        this.f105344d = new PhotoFaceDetection();
        this.f105344d.setListener(new C40543d(this, map, strArr));
        List detectModelList = PhotoFaceDetection.getDetectModelList();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchResourcesNeededByRequirements((String[]) detectModelList.toArray(new String[detectModelList.size()]), new IFetchResourcesListener() {
            public final void onFailed(Exception exc) {
            }

            public final void onSuccess(String[] strArr) {
                C40536c.this.f105344d.startDetect(strArr);
            }
        });
    }

    /* renamed from: a */
    public final void mo100609a(List<Face> list, List<Face> list2, boolean z) {
        if (this.f105342b != null) {
            this.f105342b.mo100618a(list, list2, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100610a(Map map, String[] strArr, CoverInfo coverInfo, int i) {
        long j;
        long j2 = ((C40544e) map.get(strArr[i])).f105359b;
        this.f105347h = Math.max(Math.max(this.f105346g, j2), this.f105347h);
        if (this.f105346g == 0) {
            j = j2;
        } else {
            j = Math.min(this.f105346g, j2);
        }
        this.f105346g = j;
        if (!(coverInfo == null || coverInfo.getData() == null)) {
            m129610f();
            Bitmap createBitmap = Bitmap.createBitmap(coverInfo.getData(), coverInfo.getWidth(), coverInfo.getHeight(), Config.ARGB_8888);
            StringBuilder sb = new StringBuilder();
            sb.append(f105340f);
            sb.append(File.separator);
            sb.append(System.currentTimeMillis());
            sb.append(".jpg");
            File file = new File(sb.toString());
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
            C42341f.m134636a(createBitmap, file, 100, CompressFormat.JPEG);
            Face face = new Face(file.getAbsolutePath(), strArr[i], coverInfo.getWidth(), coverInfo.getHeight(), j2);
            this.f105343c.mo100603a(face);
            C42341f.m134634a(createBitmap);
            ArrayList arrayList = new ArrayList();
            arrayList.add(face);
            mo100609a(arrayList, null, this.f105341a);
            int i2 = this.f105345e + 1;
            this.f105345e = i2;
            if (i2 >= 60) {
                mo100614e();
                m129613i();
                this.f105345e = 0;
            }
        }
        if (i == strArr.length - 1) {
            m129613i();
            mo100614e();
        }
    }
}
