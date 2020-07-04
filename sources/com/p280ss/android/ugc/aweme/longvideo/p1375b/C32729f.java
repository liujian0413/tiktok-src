package com.p280ss.android.ugc.aweme.longvideo.p1375b;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.network.connectionclass.C14143b;
import com.google.gson.C6607f;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.feed.model.BitRate.ExcludeStrategy;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28481d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39849h;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.aweme.video.preload.C43274e;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.networkspeed.C44903d;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.toutiao.proxyserver.C46534r;
import com.toutiao.proxyserver.p1842d.C46474a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.f */
public final class C32729f {

    /* renamed from: a */
    public static final C32730a f85309a = new C32730a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.f$a */
    public static final class C32730a {

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.f$a$a */
        static final class C32731a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44919c f85310a;

            /* renamed from: b */
            final /* synthetic */ Video f85311b;

            /* renamed from: c */
            final /* synthetic */ String f85312c;

            /* renamed from: d */
            final /* synthetic */ int f85313d;

            /* renamed from: e */
            final /* synthetic */ String f85314e;

            /* renamed from: f */
            final /* synthetic */ String f85315f;

            C32731a(C44919c cVar, Video video, String str, int i, String str2, String str3) {
                this.f85310a = cVar;
                this.f85311b = video;
                this.f85312c = str;
                this.f85313d = i;
                this.f85314e = str2;
                this.f85315f = str3;
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:33:0x0126] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "sourceId"
                    com.ss.android.ugc.playerkit.model.c r2 = r7.f85310a     // Catch:{  }
                    java.lang.String r2 = r2.f115522a     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "errorCode"
                    com.ss.android.ugc.playerkit.model.c r2 = r7.f85310a     // Catch:{  }
                    int r2 = r2.f115525d     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "errorExtra"
                    com.ss.android.ugc.playerkit.model.c r2 = r7.f85310a     // Catch:{  }
                    int r2 = r2.f115526e     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "netWorkQuality"
                    com.facebook.network.connectionclass.b r2 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
                    java.lang.String r3 = "ConnectionClassManager.getInstance()"
                    kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{  }
                    com.facebook.network.connectionclass.ConnectionQuality r2 = r2.mo33901b()     // Catch:{  }
                    java.lang.String r2 = r2.toString()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "netWorkSpeed"
                    com.facebook.network.connectionclass.b r2 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
                    java.lang.String r3 = "ConnectionClassManager.getInstance()"
                    kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{  }
                    double r2 = r2.mo33902c()     // Catch:{  }
                    int r2 = (int) r2     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "playUrl"
                    com.ss.android.ugc.aweme.feed.model.Video r2 = r7.f85311b     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getProperPlayAddr()     // Catch:{  }
                    java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "playUrlIsLowBr"
                    com.ss.android.ugc.aweme.feed.model.Video r2 = r7.f85311b     // Catch:{  }
                    boolean r2 = r2.isLowBr()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    com.p280ss.android.ugc.aweme.video.p1700d.C43208c.m137002a(r0)     // Catch:{  }
                    com.ss.android.ugc.playerkit.model.c r1 = r7.f85310a     // Catch:{  }
                    java.lang.Object r1 = r1.f115527f     // Catch:{  }
                    if (r1 == 0) goto L_0x0079
                    java.lang.String r1 = "extraInfo"
                    com.ss.android.ugc.playerkit.model.c r2 = r7.f85310a     // Catch:{  }
                    java.lang.Object r2 = r2.f115527f     // Catch:{  }
                    java.lang.String r2 = r2.toString()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                L_0x0079:
                    java.io.File r1 = com.p280ss.android.ugc.aweme.video.C7276d.m22808b()     // Catch:{  }
                    java.lang.String r2 = "cache"
                    java.io.File r1 = com.p280ss.android.ugc.aweme.video.C7276d.m22801a(r1, r2)     // Catch:{  }
                    java.lang.String r2 = ""
                    com.ss.android.ugc.aweme.feed.model.Video r3 = r7.f85311b     // Catch:{  }
                    com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r3.getProperPlayAddr()     // Catch:{  }
                    if (r3 == 0) goto L_0x0096
                    java.lang.String r2 = r3.getBitRatedRatioUri()     // Catch:{  }
                    java.lang.String r3 = "urlModel.bitRatedRatioUri"
                    kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{  }
                L_0x0096:
                    r3 = r2
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{  }
                    boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{  }
                    if (r3 == 0) goto L_0x00a2
                    java.lang.String r2 = ""
                    goto L_0x00a6
                L_0x00a2:
                    java.lang.String r2 = com.toutiao.proxyserver.p1842d.C46474a.m146102a(r2)     // Catch:{  }
                L_0x00a6:
                    java.lang.String r3 = "file"
                    if (r1 != 0) goto L_0x00ad
                    java.lang.String r1 = ""
                    goto L_0x00d5
                L_0x00ad:
                    com.ss.android.ugc.aweme.shortvideo.f.h r4 = new com.ss.android.ugc.aweme.shortvideo.f.h     // Catch:{  }
                    java.lang.String r5 = "file"
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
                    r6.<init>()     // Catch:{  }
                    java.lang.String r1 = r1.getPath()     // Catch:{  }
                    r6.append(r1)     // Catch:{  }
                    java.lang.String r1 = "/"
                    r6.append(r1)     // Catch:{  }
                    r6.append(r2)     // Catch:{  }
                    java.lang.String r1 = r6.toString()     // Catch:{  }
                    r4.<init>(r5, r1)     // Catch:{  }
                    java.lang.String r1 = r4.toString()     // Catch:{  }
                    java.lang.String r2 = "FileInfo(\"file\",\n       …  + \"/\" + md5).toString()"
                    kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{  }
                L_0x00d5:
                    r0.put(r3, r1)     // Catch:{  }
                    java.lang.String r1 = "play_sdcard_writable"
                    boolean r2 = com.p280ss.android.ugc.aweme.video.C7276d.m22826g()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_network_available"
                    com.ss.android.ugc.aweme.base.utils.g r2 = com.p280ss.android.ugc.aweme.base.utils.C6900g.m21454b()     // Catch:{  }
                    java.lang.String r3 = "NetworkStateManager.getInstance()"
                    kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{  }
                    boolean r2 = r2.mo16943d()     // Catch:{  }
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_free_space"
                    long r2 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136421a()     // Catch:{ Exception -> 0x0105 }
                    r0.put(r1, r2)     // Catch:{ Exception -> 0x0105 }
                    java.lang.String r1 = "play_all_space"
                    long r2 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136429b()     // Catch:{ Exception -> 0x0105 }
                    r0.put(r1, r2)     // Catch:{ Exception -> 0x0105 }
                L_0x0105:
                    java.lang.String r1 = "play_diskcache"
                    com.toutiao.proxyserver.f r2 = com.toutiao.proxyserver.C46534r.m146274f()     // Catch:{  }
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0111
                    r2 = 0
                    goto L_0x0112
                L_0x0111:
                    r2 = 1
                L_0x0112:
                    r0.put(r1, r2)     // Catch:{  }
                    java.lang.String r1 = "play_diskLruCache"
                    com.toutiao.proxyserver.g r2 = com.toutiao.proxyserver.C46534r.m146273e()     // Catch:{  }
                    if (r2 != 0) goto L_0x011e
                    goto L_0x011f
                L_0x011e:
                    r3 = 1
                L_0x011f:
                    r0.put(r1, r3)     // Catch:{  }
                    java.lang.Class<com.toutiao.proxyserver.s> r1 = com.toutiao.proxyserver.C46536s.class
                    java.lang.String r2 = "e"
                    java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0174
                    r1.setAccessible(r4)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    r2 = 0
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x016b
                    com.toutiao.proxyserver.s r1 = (com.toutiao.proxyserver.C46536s) r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0174
                    java.lang.Class<com.toutiao.proxyserver.s> r3 = com.toutiao.proxyserver.C46536s.class
                    java.lang.String r5 = "c"
                    java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r3 == 0) goto L_0x0174
                    r3.setAccessible(r4)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.Object r1 = r3.get(r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    if (r1 == 0) goto L_0x0163
                    java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r3 = "proxyserver_state"
                    if (r1 == 0) goto L_0x015b
                    int r1 = r1.intValue()     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x015b:
                    int r1 = r2.intValue()     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    r0.put(r3, r1)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    goto L_0x0174
                L_0x0163:
                    kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r2 = "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicInteger"
                    r1.<init>(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    throw r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x016b:
                    kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    java.lang.String r2 = "null cannot be cast to non-null type com.toutiao.proxyserver.ProxyServer"
                    r1.<init>(r2)     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                    throw r1     // Catch:{ JSONException -> 0x0173, JSONException -> 0x0173 }
                L_0x0173:
                L_0x0174:
                    com.ss.android.ugc.aweme.base.utils.g r1 = com.p280ss.android.ugc.aweme.base.utils.C6900g.m21454b()
                    java.lang.String r2 = "NetworkStateManager.getInstance()"
                    kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                    boolean r1 = r1.mo16943d()
                    if (r1 == 0) goto L_0x0192
                    java.lang.String r1 = r7.f85312c
                    int r2 = r7.f85313d
                    com.ss.android.ugc.aweme.app.g.c r3 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21382a(r0)
                    org.json.JSONObject r3 = r3.mo16888b()
                    com.p280ss.android.ugc.aweme.app.C6877n.m21444a(r1, r2, r3)
                L_0x0192:
                    java.lang.String r1 = r7.f85314e
                    java.lang.String r2 = r7.f85315f
                    com.ss.android.ugc.aweme.app.g.c r0 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21382a(r0)
                    org.json.JSONObject r0 = r0.mo16888b()
                    com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r1, r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.p1375b.C32729f.C32730a.C32731a.run():void");
            }
        }

        private C32730a() {
        }

        public /* synthetic */ C32730a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m105943a(long j, String str) {
            C7573i.m23587b(str, "serviceName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C6877n.m21447a(str, jSONObject);
        }

        /* renamed from: a */
        private static void m105945a(VideoUrlModel videoUrlModel, JSONObject jSONObject) {
            C43274e k = C43305j.m137386g().mo105093k(videoUrlModel);
            if (k != null) {
                try {
                    jSONObject.put("video_cache_read_time", (double) ((((float) k.f112008a) * 1.0f) / ((float) k.f112010c)));
                    jSONObject.put("video_cache_read_size", (double) ((((float) k.f112009b) * 1.0f) / ((float) k.f112010c)));
                    jSONObject.put("video_cache_read_cnt", k.f112010c);
                    jSONObject.put("video_cache_use_ttnet", C46534r.f119902i);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public static void m105944a(Video video, String str) {
            String str2;
            String str3;
            C7573i.m23587b(str, "rateServiceName");
            if (video != null) {
                JSONObject jSONObject = new JSONObject();
                String str4 = "netWorkQuality";
                try {
                    C14143b a = C14143b.m41756a();
                    C7573i.m23582a((Object) a, "ConnectionClassManager.getInstance()");
                    jSONObject.put(str4, a.mo33901b().toString());
                    C14143b a2 = C14143b.m41756a();
                    C7573i.m23582a((Object) a2, "ConnectionClassManager.getInstance()");
                    jSONObject.put("netWorkSpeed", (int) a2.mo33902c());
                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                    C43208c.m137002a(jSONObject);
                    File a3 = C7276d.m22801a(C7276d.m22808b(), "cache");
                    String str5 = "file";
                    if (a3 == null) {
                        str2 = "";
                    } else {
                        String str6 = "file";
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3.getPath());
                        sb.append("/");
                        if (C6399b.m19944t()) {
                            str3 = video.getPlayAddr().getBitRatedRatioUri();
                        } else {
                            str3 = video.getProperPlayAddr().getUri();
                        }
                        sb.append(C46474a.m146102a(str3));
                        str2 = new C39849h(str6, sb.toString()).toString();
                        C7573i.m23582a((Object) str2, "FileInfo(\"file\",\n       …r().getUri())).toString()");
                    }
                    jSONObject.put(str5, str2);
                } catch (Exception unused) {
                }
                C6877n.m21444a(str, 0, jSONObject);
            }
        }

        /* renamed from: a */
        public static void m105946a(C44919c cVar, Video video, String str, int i, String str2, String str3) {
            C7573i.m23587b(str, "rateServiceName");
            C7573i.m23587b(str2, "logType");
            C7573i.m23587b(str3, "logServiceName");
            if (cVar != null && video != null && video.getPlayAddr() != null) {
                C32731a aVar = new C32731a(cVar, video, str, 1, str2, str3);
                C6726a.m20842a(aVar);
            }
        }

        /* renamed from: a */
        public final void mo84204a(Video video, String str, long j, String str2, String str3, String str4, C43316v vVar) {
            int i;
            C7573i.m23587b(str, "groupId");
            C7573i.m23587b(str2, "endType");
            C7573i.m23587b(str4, "logType");
            if (video != null) {
                VideoUrlModel playAddr = video.getPlayAddr();
                if (playAddr != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("request_id", str3);
                        jSONObject.put("duration", j);
                        jSONObject.put("end_type", str2);
                        if (vVar == null) {
                            C43222g K = C43316v.m137450K();
                            C7573i.m23582a((Object) K, "PlayerManager.inst()");
                            jSONObject.put("player_type", K.mo104901a().toString());
                        } else {
                            jSONObject.put("player_type", vVar.mo104901a().toString());
                        }
                        VideoBitRateABManager c = VideoBitRateABManager.m22786c();
                        C7573i.m23582a((Object) c, "VideoBitRateABManager.getInstance()");
                        if (c.mo19004e()) {
                            Integer a = C28481d.m93602a(playAddr);
                            int b = C28481d.m93603b(playAddr);
                            if (a == null) {
                                List bitRate = video.getBitRate();
                                if (bitRate != null) {
                                    Iterator it = bitRate.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        BitRate bitRate2 = (BitRate) it.next();
                                        if (!(bitRate2 == null || bitRate2.getPlayAddr() == null)) {
                                            UrlModel playAddr2 = bitRate2.getPlayAddr();
                                            C7573i.m23582a((Object) playAddr2, "temp.playAddr");
                                            if (!TextUtils.isEmpty(playAddr2.getUri()) && playAddr.getUri() != null) {
                                                String uri = playAddr.getUri();
                                                C7573i.m23582a((Object) uri, "model.uri");
                                                UrlModel playAddr3 = bitRate2.getPlayAddr();
                                                C7573i.m23582a((Object) playAddr3, "temp.playAddr");
                                                String uri2 = playAddr3.getUri();
                                                C7573i.m23582a((Object) uri2, "temp.playAddr.uri");
                                                if (C7634n.m23721b(uri, uri2, false)) {
                                                    a = Integer.valueOf(bitRate2.getBitRate());
                                                    b = bitRate2.getQualityType();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            String str5 = "video_bitrate";
                            if (a != null) {
                                i = a.intValue();
                            } else {
                                i = -1;
                            }
                            jSONObject.put(str5, i);
                            jSONObject.put("video_quality", b);
                            List bitRate3 = playAddr.getBitRate();
                            if (bitRate3 != null && !bitRate3.isEmpty()) {
                                jSONObject.put("bitrate_set", new JSONArray(new C6607f().mo15987a(new ExcludeStrategy()).mo15992f().mo15979b((Object) bitRate3)));
                            }
                        }
                        jSONObject.put("strategy_status", "-1");
                        jSONObject.put("internet_speed", C44903d.m141656f());
                        jSONObject.put("group_id", str);
                    } catch (Exception e) {
                        C6921a.m21554a(e);
                        jSONObject = new JSONObject();
                    }
                    m105945a(playAddr, jSONObject);
                    C6877n.m21447a(str4, jSONObject);
                }
            }
        }
    }
}
