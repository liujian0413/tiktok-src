package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.facebook.ads.AdError;
import com.p280ss.android.ttve.model.VEMusicWaveBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView.C39296a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e */
public final class C39312e {

    /* renamed from: f */
    public static volatile C39312e f102114f = new C39312e();

    /* renamed from: g */
    public static final C39314b f102115g = new C39314b(null);

    /* renamed from: a */
    public int f102116a;

    /* renamed from: b */
    public int f102117b;

    /* renamed from: c */
    public int f102118c;

    /* renamed from: d */
    public int f102119d;

    /* renamed from: e */
    public int f102120e;

    /* renamed from: h */
    private int f102121h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$a */
    public interface C39313a {
        /* renamed from: a */
        void mo96524a(AVMusicWaveBean aVMusicWaveBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$b */
    public static final class C39314b {
        private C39314b() {
        }

        /* renamed from: a */
        public static C39312e m125637a() {
            return C39312e.f102114f;
        }

        public /* synthetic */ C39314b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m125640a(float[] fArr) {
            boolean z;
            if (fArr != null) {
                if (fArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static void m125639a(VEMusicWaveBean vEMusicWaveBean) {
            boolean z;
            if (vEMusicWaveBean != null) {
                float[] waveBean = vEMusicWaveBean.getWaveBean();
                if (waveBean != null) {
                    C7573i.m23582a((Object) waveBean, "it");
                    if (waveBean.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int length = waveBean.length;
                        for (int i = 0; i < length; i++) {
                            if (Float.isNaN(waveBean[i])) {
                                waveBean[i] = 0.0f;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static C39296a m125636a(Context context) {
            C39296a aVar = new C39296a();
            if (context == null) {
                return aVar;
            }
            aVar.f102049c = (int) C9738o.m28708b(context, 16.0f);
            aVar.f102048b = (int) C9738o.m28708b(context, 6.0f);
            aVar.f102047a = (int) C9738o.m28708b(context, 10.0f);
            aVar.f102054h = -1073741824;
            aVar.f102053g = -1;
            aVar.f102051e = (int) C9738o.m28708b(context, 4.0f);
            aVar.f102052f = (int) C9738o.m28708b(context, 2.0f);
            aVar.f102055i = (int) C9738o.m28708b(context, 11.0f);
            aVar.f102050d = (int) C9738o.m28708b(context, 8.0f);
            return aVar;
        }

        /* renamed from: a */
        public static String m125638a(long j) {
            try {
                long j2 = j / 1000;
                long j3 = j2 % 60;
                long j4 = j2 / 60;
                Locale locale = Locale.CHINA;
                C7573i.m23582a((Object) locale, "Locale.CHINA");
                String a = C1642a.m8035a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3)}, 2));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                return a;
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("cut music duration:");
                sb.append(j);
                C41530am.m132283b(sb.toString());
                return "00:00";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$c */
    static final class C39315c implements MusicWaveDataListener {

        /* renamed from: a */
        final /* synthetic */ C39313a f102122a;

        C39315c(C39313a aVar) {
            this.f102122a = aVar;
        }

        public final void onFinish(Object obj) {
            boolean z;
            StringBuilder sb = new StringBuilder("OLD_DRAFT AudioWaveDataIsNull:");
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C41530am.m132280a(sb.toString());
            if (this.f102122a != null) {
                if (obj == null || !(obj instanceof AVMusicWaveBean)) {
                    this.f102122a.mo96524a(null);
                } else {
                    this.f102122a.mo96524a((AVMusicWaveBean) obj);
                }
            }
        }
    }

    /* renamed from: a */
    public static final C39312e m125623a() {
        return C39314b.m125637a();
    }

    /* renamed from: a */
    public static final boolean m125626a(float[] fArr) {
        return C39314b.m125640a(fArr);
    }

    /* renamed from: c */
    public static final C39296a m125629c(Context context) {
        return C39314b.m125636a(context);
    }

    /* renamed from: a */
    public final void mo97875a(Context context) {
        C7573i.m23587b(context, "context");
        this.f102116a = (int) C9738o.m28708b(context, 3.0f);
        this.f102117b = (int) C9738o.m28708b(context, 2.0f);
        this.f102118c = (int) C9738o.m28708b(context, 90.0f);
        this.f102119d = (int) C9738o.m28708b(context, 2.0f);
        this.f102121h = C9738o.m28691a(context);
    }

    /* renamed from: a */
    public final void mo97876a(AVMusicWaveBean aVMusicWaveBean, long j, long j2) {
        if (j > 0) {
            this.f102120e = (int) j;
        }
        int a = C39314b.m125637a().mo97874a((int) j2, false);
        if (aVMusicWaveBean != null && C39314b.m125640a(aVMusicWaveBean.getMusicWavePointArray()) && a > 0) {
            float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C7573i.m23580a();
            }
            if (musicWavePointArray.length > a) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, a);
                C39314b.m125639a(resampleMusicWaveData);
                if (resampleMusicWaveData != null && C39314b.m125640a(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    C7573i.m23582a((Object) waveBean, "musicWaveBean.waveBean");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                    aVMusicWaveBean.setMusicWavePointArray(copyOf);
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo97878b(Context context) {
        C7573i.m23587b(context, "context");
        return ((C9738o.m28691a(context) - ((int) C9738o.m28708b(context, 20.0f))) + this.f102119d) / (this.f102119d + this.f102117b);
    }

    /* renamed from: a */
    public static AVMusicWaveBean m125620a(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean == null || !C39314b.m125640a(vEMusicWaveBean.getWaveBean())) {
            return null;
        }
        C39314b.m125639a(vEMusicWaveBean);
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        float[] waveBean = vEMusicWaveBean.getWaveBean();
        C7573i.m23582a((Object) waveBean, "veMusicWaveBean.waveBean");
        float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        aVMusicWaveBean.setMusicWavePointArray(copyOf);
        return aVMusicWaveBean;
    }

    /* renamed from: b */
    public static AVMusicWaveBean m125627b(AVMusic aVMusic) {
        if (aVMusic == null || !C39314b.m125640a(aVMusic.getMusicWaveData())) {
            return null;
        }
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        float[] musicWaveData = aVMusic.getMusicWaveData();
        C7573i.m23582a((Object) musicWaveData, "music.musicWaveData");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        aVMusicWaveBean.setMusicWavePointArray(copyOf);
        return aVMusicWaveBean;
    }

    /* renamed from: a */
    public static AVMusicWaveBean m125621a(AVMusic aVMusic) {
        if (aVMusic == null || !C39314b.m125640a(aVMusic.getMusicWaveData())) {
            return null;
        }
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        float[] musicWaveData = aVMusic.getMusicWaveData();
        C7573i.m23582a((Object) musicWaveData, "bean.musicWaveData");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        aVMusicWaveBean.setMusicWavePointArray(copyOf);
        return aVMusicWaveBean;
    }

    /* renamed from: b */
    public static void m125628b(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C39314b.m125640a(aVMusicWaveBean.getMusicWavePointArray())) {
            int length = aVMusicWaveBean.getMusicWavePointArray().length;
            for (int i = 0; i < length; i++) {
                if (aVMusicWaveBean.getMusicWavePointArray()[i] < 0.1f) {
                    aVMusicWaveBean.getMusicWavePointArray()[i] = 0.1f;
                }
            }
        }
    }

    /* renamed from: a */
    public static AVMusicWaveBean m125622a(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean == null || !C39314b.m125640a(aVMusicWaveBean.getMusicWavePointArray())) {
            return aVMusicWaveBean;
        }
        AVMusicWaveBean aVMusicWaveBean2 = new AVMusicWaveBean();
        float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
        float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        aVMusicWaveBean2.setMusicWavePointArray(copyOf);
        return aVMusicWaveBean2;
    }

    /* renamed from: a */
    public final void mo97877a(String str, C39313a aVar) {
        m125625a(str, 6, aVar);
    }

    /* renamed from: a */
    public final int mo97874a(int i, boolean z) {
        if (this.f102120e <= 0) {
            return AdError.SERVER_ERROR_CODE;
        }
        int i2 = (int) (((float) ((this.f102121h + this.f102117b) / (this.f102116a + this.f102117b))) * 1.0f * ((((float) i) * 1.0f) / ((float) this.f102120e)));
        if (z && i2 < 2000) {
            i2 = AdError.SERVER_ERROR_CODE;
        }
        return i2;
    }

    /* renamed from: a */
    public static void m125625a(String str, int i, C39313a aVar) {
        if (!TextUtils.isEmpty(str)) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getAvMusicWaveBean(str, false, new C39315c(aVar));
        } else if (aVar != null) {
            aVar.mo96524a(null);
        }
    }

    /* renamed from: a */
    public static void m125624a(AVMusicWaveBean aVMusicWaveBean, int i, int i2, int i3) {
        if (aVMusicWaveBean != null) {
            float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C7573i.m23580a();
            }
            float length = ((float) musicWavePointArray.length) * 1.0f * ((float) i);
            float f = (float) i3;
            int i4 = (int) (length / f);
            float[] musicWavePointArray2 = aVMusicWaveBean.getMusicWavePointArray();
            if (musicWavePointArray2 == null) {
                C7573i.m23580a();
            }
            int length2 = (int) (((((float) musicWavePointArray2.length) * 1.0f) * ((float) i2)) / f);
            if (length2 > 0) {
                float[] fArr = new float[length2];
                float[] musicWavePointArray3 = aVMusicWaveBean.getMusicWavePointArray();
                if (musicWavePointArray3 == null) {
                    C7573i.m23580a();
                }
                int length3 = musicWavePointArray3.length;
                int i5 = length2 + i4;
                int i6 = i4;
                boolean z = false;
                while (i6 < i5 && i6 < length3) {
                    fArr[i6 - i4] = aVMusicWaveBean.getMusicWavePointArray()[i6];
                    i6++;
                    z = true;
                }
                if (C39314b.m125640a(fArr) && z) {
                    aVMusicWaveBean.setMusicWavePointArray(fArr);
                }
            }
        }
    }
}
