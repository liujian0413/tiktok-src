package com.p280ss.android.ugc.asve.context;

import android.view.SurfaceHolder;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE;
import com.p280ss.android.ugc.asve.context.C15422c.C15423a;
import com.p280ss.android.ugc.asve.context.C15424d.C15425a;
import com.p280ss.android.ugc.asve.context.C15428f.C15429a;
import com.p280ss.android.ugc.asve.context.C15430g.C15431a;
import com.p280ss.android.ugc.asve.recorder.C20733d;
import com.p280ss.android.ugc.asve.sandbox.C21053p;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.asve.context.h */
public interface C15432h {

    /* renamed from: com.ss.android.ugc.asve.context.h$a */
    public static final class C15433a {

        /* renamed from: com.ss.android.ugc.asve.context.h$a$a */
        public static final class C15435a implements C15422c {
            C15435a() {
            }

            /* renamed from: d */
            public final boolean mo38913d() {
                return true;
            }

            /* renamed from: f */
            public final boolean mo38915f() {
                return false;
            }

            /* renamed from: g */
            public final int mo38916g() {
                return R.drawable.a0t;
            }

            /* renamed from: a */
            public final AS_CAMERA_LENS_FACING mo38910a() {
                return C15423a.m45097a(this);
            }

            /* renamed from: b */
            public final ASCameraType mo38911b() {
                return C15423a.m45098b(this);
            }

            /* renamed from: c */
            public final ASCameraHardwareSupportLevel mo38912c() {
                return C15423a.m45099c(this);
            }

            /* renamed from: e */
            public final byte mo38914e() {
                return C15423a.m45100d(this);
            }

            /* renamed from: h */
            public final int[] mo38917h() {
                return C15423a.m45101e(this);
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$b */
        public static final class C15436b implements C15428f {
            C15436b() {
            }

            /* renamed from: a */
            public final boolean mo38970a() {
                return false;
            }

            /* renamed from: d */
            public final int mo38973d() {
                return 0;
            }

            /* renamed from: e */
            public final int mo38974e() {
                return 0;
            }

            /* renamed from: b */
            public final String mo38971b() {
                return C15429a.m45146a(this);
            }

            /* renamed from: c */
            public final String mo38972c() {
                return C15429a.m45147b(this);
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$c */
        public static final class C15437c implements C15430g {
            C15437c() {
            }

            /* renamed from: c */
            public final float mo38977c() {
                return 0.66f;
            }

            /* renamed from: d */
            public final boolean mo38978d() {
                return true;
            }

            /* renamed from: e */
            public final int mo38979e() {
                return R.array.a7;
            }

            /* renamed from: f */
            public final int mo38980f() {
                return R.array.a6;
            }

            /* renamed from: g */
            public final int mo38981g() {
                return R.drawable.bg4;
            }

            /* renamed from: a */
            public final String mo38975a() {
                return C15431a.m45155a(this);
            }

            /* renamed from: b */
            public final String mo38976b() {
                return C15431a.m45156b(this);
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$d */
        public static final class C15438d implements C20733d {

            /* renamed from: a */
            private final File f39725a = C6855a.m21306a().mo38955l();

            /* renamed from: b */
            private final File f39726b = new File(C6855a.m21306a().mo38955l(), "segs");

            /* renamed from: c */
            private final File f39727c = new File(mo38984b(), "video");

            /* renamed from: d */
            private final File f39728d = new File(mo38984b(), "audio");

            /* renamed from: e */
            private final File f39729e = new File(mo38982a(), "photo");

            /* renamed from: a */
            public final File mo38982a() {
                return this.f39725a;
            }

            /* renamed from: b */
            public final File mo38984b() {
                return this.f39726b;
            }

            /* renamed from: c */
            public final File mo38986c() {
                return this.f39727c;
            }

            /* renamed from: d */
            public final File mo38987d() {
                return this.f39728d;
            }

            /* renamed from: e */
            public final File mo38988e() {
                return this.f39729e;
            }

            C15438d() {
            }

            /* renamed from: a */
            public final String mo38983a(int i) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(i);
                sb.append(".v");
                return sb.toString();
            }

            /* renamed from: b */
            public final String mo38985b(int i) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(i);
                sb.append(".a");
                return sb.toString();
            }
        }

        /* renamed from: a */
        public static C20733d m45174a(C15432h hVar) {
            return new C15438d();
        }

        /* renamed from: c */
        public static C15428f m45176c(C15432h hVar) {
            return new C15436b();
        }

        /* renamed from: d */
        public static C15430g m45177d(C15432h hVar) {
            return new C15437c();
        }

        /* renamed from: e */
        public static C15424d m45178e(C15432h hVar) {
            return new C15424d() {
                /* renamed from: a */
                public final float mo38935a() {
                    return 1.0f;
                }

                /* renamed from: b */
                public final boolean mo38936b() {
                    return false;
                }

                /* renamed from: c */
                public final float mo38937c() {
                    return 4.0f;
                }

                /* renamed from: d */
                public final boolean mo38938d() {
                    return false;
                }

                /* renamed from: e */
                public final int mo38939e() {
                    return 15;
                }

                /* renamed from: g */
                public final boolean mo38941g() {
                    return false;
                }

                /* renamed from: f */
                public final AS_ENCODE_PROFILE mo38940f() {
                    return C15425a.m45110a(this);
                }

                /* renamed from: h */
                public final String mo38942h() {
                    return C15425a.m45111b(this);
                }
            };
        }

        /* renamed from: f */
        public static C15422c m45179f(C15432h hVar) {
            return new C15435a();
        }

        /* renamed from: b */
        public static Pair<Integer, Integer> m45175b(C15432h hVar) {
            return new Pair<>(Integer.valueOf(576), Integer.valueOf(PreloadTask.BYTE_UNIT_NUMBER));
        }
    }

    /* renamed from: a */
    Boolean mo38918a();

    /* renamed from: b */
    boolean mo38919b();

    /* renamed from: c */
    SurfaceHolder mo38920c();

    /* renamed from: d */
    C20733d mo38921d();

    /* renamed from: e */
    Pair<Integer, Integer> mo38922e();

    /* renamed from: f */
    boolean mo38923f();

    /* renamed from: g */
    boolean mo38924g();

    /* renamed from: h */
    boolean mo38925h();

    /* renamed from: i */
    boolean mo38926i();

    /* renamed from: j */
    C15428f mo38927j();

    /* renamed from: k */
    C15430g mo38928k();

    /* renamed from: l */
    C15424d mo38929l();

    /* renamed from: m */
    C15422c mo38930m();

    /* renamed from: n */
    boolean mo38931n();

    /* renamed from: o */
    C21053p mo38932o();

    /* renamed from: p */
    boolean mo38933p();

    /* renamed from: q */
    boolean mo38934q();
}
