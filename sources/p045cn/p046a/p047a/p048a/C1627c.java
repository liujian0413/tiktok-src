package p045cn.p046a.p047a.p048a;

import android.media.MediaPlayer.TrackInfo;

/* renamed from: cn.a.a.a.c */
public interface C1627c {

    /* renamed from: cn.a.a.a.c$a */
    public interface C1628a {
        /* renamed from: a */
        void mo7019a(C1627c cVar, int i);
    }

    /* renamed from: cn.a.a.a.c$b */
    public interface C1629b {
        /* renamed from: a */
        void mo7020a(C1627c cVar);
    }

    /* renamed from: cn.a.a.a.c$c */
    public interface C1630c {
        /* renamed from: a */
        boolean mo7021a(C1627c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$d */
    public interface C1631d {
        /* renamed from: a */
        boolean mo7022a(C1627c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$e */
    public interface C1632e {
        /* renamed from: a */
        void mo7023a(C1627c cVar);
    }

    /* renamed from: cn.a.a.a.c$f */
    public interface C1633f {
        /* renamed from: a */
        void mo7024a(C1627c cVar);
    }

    /* renamed from: cn.a.a.a.c$g */
    public interface C1634g {
        /* renamed from: a */
        void mo7025a(C1627c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$h */
    public static class C1635h {

        /* renamed from: a */
        public C1626b f6055a;

        /* renamed from: b */
        public int f6056b;

        /* renamed from: c */
        public String f6057c;

        public C1635h(TrackInfo trackInfo) {
            this.f6056b = trackInfo.getTrackType();
            this.f6057c = trackInfo.getLanguage();
            if (this.f6056b == 2) {
                this.f6055a = C1626b.m7972a(trackInfo.getFormat());
            } else if (this.f6056b == 1) {
                this.f6055a = C1626b.m7976c(trackInfo.getFormat());
            } else {
                if (this.f6056b == 4) {
                    this.f6055a = C1626b.m7975b(trackInfo.getFormat());
                }
            }
        }
    }
}
