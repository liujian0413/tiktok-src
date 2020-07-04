package com.p280ss.android.ugc.aweme.port.p1479in;

import com.bef.effectsdk.C1942b;
import com.bytedance.common.utility.p254b.C9714c;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.IASPathAdaptor.MediaType;
import com.p280ss.android.ugc.asve.constant.ASMonitorServerLocation;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.asve.context.C15426e.C15427a;
import com.p280ss.android.ugc.asve.context.PreviewSize;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.ugc.aweme.C21684bq;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.filter.C29262br;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.vesdk.C45321i;
import com.p280ss.android.vesdk.VEListener.C45206b;
import dmt.p1861av.video.p1863b.C47450e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.port.in.a */
public final class C35518a implements C15426e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f93199a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35518a.class), "logger", "getLogger()Lcom/ss/android/ugc/asve/IASLogger;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35518a.class), "pathAdaptor", "getPathAdaptor()Lcom/ss/android/ugc/asve/IASPathAdaptor;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35518a.class), "presenterMonitor", "getPresenterMonitor()Lcom/ss/android/ugc/asve/recorder/IRecordPresenterMonitor;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35518a.class), "applogPresenter", "getApplogPresenter()Lcom/ss/android/vesdk/VEListener$VEApplogListener;"))};

    /* renamed from: b */
    private final ExecutorService f93200b;

    /* renamed from: c */
    private final String f93201c = "asve";

    /* renamed from: d */
    private final C7541d f93202d = C7546e.m23569a(C35520b.f93212a);

    /* renamed from: e */
    private final C7541d f93203e = C7546e.m23569a(C35522c.f93213a);

    /* renamed from: f */
    private final C7541d f93204f = C7546e.m23569a(C35524d.f93214a);

    /* renamed from: g */
    private final C7541d f93205g = C7546e.m23569a(new C35519a(this));

    /* renamed from: h */
    private final File f93206h = new File(C6855a.m21308b().getFilesDir(), "vesdk");

    /* renamed from: i */
    private final File f93207i = new File(C29262br.m95996a());

    /* renamed from: j */
    private final C1942b f93208j;

    /* renamed from: k */
    private final boolean f93209k;

    /* renamed from: l */
    private final C45321i f93210l;

    /* renamed from: com.ss.android.ugc.aweme.port.in.a$a */
    static final class C35519a extends Lambda implements C7561a<C21684bq> {

        /* renamed from: a */
        final /* synthetic */ C35518a f93211a;

        C35519a(C35518a aVar) {
            this.f93211a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21684bq invoke() {
            if (!C35563c.f93231M.mo93305a(Property.EnableVEUploadApplog) || !this.f93211a.mo38951h()) {
                return null;
            }
            return new C21684bq();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.a$b */
    static final class C35520b extends Lambda implements C7561a<C355211> {

        /* renamed from: a */
        public static final C35520b f93212a = new C35520b();

        C35520b() {
            super(0);
        }

        /* renamed from: a */
        private static C355211 m114712a() {
            return new C15395c() {
                /* renamed from: a */
                public final void mo38740a(String str) {
                    C7573i.m23587b(str, "message");
                    C41530am.m132284c(str);
                }

                /* renamed from: b */
                public final void mo38741b(String str) {
                    C7573i.m23587b(str, "message");
                    C41530am.m132283b(str);
                }

                /* renamed from: c */
                public final void mo38742c(String str) {
                    C7573i.m23587b(str, "message");
                    C41530am.m132280a(str);
                }

                /* renamed from: d */
                public final void mo38743d(String str) {
                    C7573i.m23587b(str, "message");
                    C41530am.m132285d(str);
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m114712a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.a$c */
    static final class C35522c extends Lambda implements C7561a<C355231> {

        /* renamed from: a */
        public static final C35522c f93213a = new C35522c();

        C35522c() {
            super(0);
        }

        /* renamed from: a */
        private static C355231 m114717a() {
            return new IASPathAdaptor() {
                /* renamed from: a */
                public final String mo38738a(String str, MediaType mediaType) {
                    com.p280ss.android.ugc.aweme.utils.MediaType mediaType2;
                    C7573i.m23587b(str, "path");
                    C7573i.m23587b(mediaType, "type");
                    switch (C35562b.f93218a[mediaType.ordinal()]) {
                        case 1:
                            mediaType2 = com.p280ss.android.ugc.aweme.utils.MediaType.AUDIO;
                            break;
                        case 2:
                            mediaType2 = com.p280ss.android.ugc.aweme.utils.MediaType.IMAGE;
                            break;
                        case 3:
                            mediaType2 = com.p280ss.android.ugc.aweme.utils.MediaType.VIDEO;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    return C43142i.m136842a(str, mediaType2);
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m114717a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.a$d */
    static final class C35524d extends Lambda implements C7561a<C355251> {

        /* renamed from: a */
        public static final C35524d f93214a = new C35524d();

        C35524d() {
            super(0);
        }

        /* renamed from: a */
        private static C355251 m114719a() {
            return new C20675b() {
                /* renamed from: a */
                public final void mo55881a(String str, Map<String, String> map) {
                    C7573i.m23587b(str, "key");
                    C7573i.m23587b(map, "map");
                    C6907h.m21524a(str, (Map) map);
                }

                /* renamed from: a */
                public final void mo56362a(String str, JSONObject jSONObject) {
                    C7573i.m23587b(str, "logType");
                    C7573i.m23587b(jSONObject, "logExtra");
                    C6893q.m21447a(str, jSONObject);
                }

                /* renamed from: a */
                public final void mo55882a(Throwable th, String str) {
                    C7573i.m23587b(th, "throwable");
                    C7573i.m23587b(str, "key");
                    C2077a.m9161a(th, str);
                }

                /* renamed from: a */
                public final void mo55880a(String str, String str2, String str3, String str4) {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    if (str3 != null) {
                        jSONObject = new JSONObject(str3);
                    } else {
                        jSONObject = (JSONObject) str3;
                    }
                    if (str4 != null) {
                        jSONObject2 = new JSONObject(str4);
                    } else {
                        jSONObject2 = (JSONObject) str4;
                    }
                    C6379c.m19828a(str, new JSONObject(str2), jSONObject, jSONObject2);
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m114719a();
        }
    }

    /* renamed from: a */
    public final ExecutorService mo38944a() {
        return this.f93200b;
    }

    /* renamed from: b */
    public final C15395c mo38945b() {
        return (C15395c) this.f93202d.getValue();
    }

    /* renamed from: c */
    public final IASPathAdaptor mo38946c() {
        return (IASPathAdaptor) this.f93203e.getValue();
    }

    /* renamed from: d */
    public final C20675b mo38947d() {
        return (C20675b) this.f93204f.getValue();
    }

    /* renamed from: e */
    public final C45206b mo38948e() {
        return (C45206b) this.f93205g.getValue();
    }

    /* renamed from: f */
    public final C1942b mo38949f() {
        return this.f93208j;
    }

    /* renamed from: l */
    public final File mo38955l() {
        return this.f93206h;
    }

    /* renamed from: q */
    public final File mo38960q() {
        return this.f93207i;
    }

    /* renamed from: w */
    public final boolean mo38966w() {
        return this.f93209k;
    }

    /* renamed from: x */
    public final C45321i mo38967x() {
        return this.f93210l;
    }

    /* renamed from: g */
    public final String mo38950g() {
        return C15427a.m45140b(this);
    }

    /* renamed from: h */
    public final boolean mo38951h() {
        return C47450e.m148163a();
    }

    /* renamed from: n */
    public final boolean mo38957n() {
        return C36964i.m118941q();
    }

    /* renamed from: o */
    public final int mo38958o() {
        return C36964i.m118942r();
    }

    /* renamed from: A */
    public final boolean mo38943A() {
        return C35563c.f93231M.mo93305a(Property.EnableEffectAsyncAPI);
    }

    /* renamed from: i */
    public final ASMonitorServerLocation mo38952i() {
        if (C30538p.m99745a()) {
            return ASMonitorServerLocation.AS_SERVER_LOCATION_OVERSEA;
        }
        return ASMonitorServerLocation.AS_SERVER_LOCATION_CHINA;
    }

    /* renamed from: k */
    public final boolean mo38954k() {
        return C35563c.f93231M.mo93305a(Property.OpenCameraFrameOptimizeSDK);
    }

    /* renamed from: p */
    public final boolean mo38959p() {
        return C35563c.f93231M.mo93305a(Property.EnableTT265Decoder);
    }

    /* renamed from: r */
    public final boolean mo38961r() {
        return C35563c.f93231M.mo93305a(Property.EnableNewEffectEngineForBuiltInEffect);
    }

    /* renamed from: s */
    public final boolean mo38962s() {
        return C35563c.f93231M.mo93305a(Property.VEUseNewEffectAlgorithmApi);
    }

    /* renamed from: t */
    public final int mo38963t() {
        return C35563c.f93230L.mo93343b(AVSettings.Property.WideCameraInfo);
    }

    /* renamed from: u */
    public final boolean mo38964u() {
        return C35563c.f93230L.mo93342a(AVSettings.Property.DefaultWideMode);
    }

    /* renamed from: v */
    public final int mo38965v() {
        return C35563c.f93231M.mo93306b(Property.RecordOutputCategory);
    }

    /* renamed from: z */
    public final String mo38969z() {
        String e = C35563c.f93230L.mo93346e(AVSettings.Property.VERuntimeConfig);
        C7573i.m23582a((Object) e, "AVEnv.SETTINGS.getString…Property.VERuntimeConfig)");
        return e;
    }

    /* renamed from: j */
    public final boolean mo38953j() {
        if (C30538p.m99745a() || C35563c.f93231M.mo93306b(Property.EnableOpenGl3) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo38956m() {
        return C35563c.f93231M.mo93306b(Property.VEConfigOptLevel) | C35563c.f93230L.mo93343b(AVSettings.Property.EnableVESingleGL) | C35563c.f93231M.mo93306b(Property.EnableVECacheGLContext) | C35563c.f93231M.mo93306b(Property.EnableProcessRefactor) | C35563c.f93231M.mo93306b(Property.EnableImportAvSync) | C35563c.f93231M.mo93306b(Property.EnableOpenGLResourceReuse) | C35563c.f93231M.mo93306b(Property.EnableSdkOutputRefactor) | C35563c.f93231M.mo93306b(Property.EnableSdkInputCrossPlatForm) | C35563c.f93231M.mo93306b(Property.EnableGLBase);
    }

    /* renamed from: y */
    public final PreviewSize mo38968y() {
        boolean z;
        Property property = Property.VECameraPreviewSize;
        String e = C35563c.f93231M.mo93309e(property);
        CharSequence charSequence = e;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = C35563c.f93239b.mo15974a(e, PreviewSize.class);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Json AB 配置错误，AB:");
                sb.append(property.name());
                sb.append(" 配置:");
                sb.append(e);
                C41530am.m132283b(sb.toString());
            }
        }
        return (PreviewSize) obj;
    }

    public C35518a(C1942b bVar, boolean z, C45321i iVar) {
        C7573i.m23587b(iVar, "veAppField");
        this.f93208j = bVar;
        this.f93209k = z;
        this.f93210l = iVar;
        ExecutorService a = C9714c.m28650a();
        C7573i.m23582a((Object) a, "TTExecutors.getNormalExecutor()");
        this.f93200b = a;
    }
}
