package com.p280ss.android.ugc.aweme.video.bitrate;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10123a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ttnet.C12961d;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.video.C43264m;
import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44866f;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44871c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44871c.C44874b;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44875d.C44878b;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44879e;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.a */
public final class C43196a {

    /* renamed from: a */
    public static int f111837a = -1;

    /* renamed from: a */
    public static void m136964a() {
        if (((float) f111837a) > 0.0f && C6384b.m19835a().mo15292a(RecordLastNetworkSpeedExperiment.class, true, "is_record_last_network_speed_enabled", C6384b.m19835a().mo15295d().is_record_last_network_speed_enabled, true)) {
            SharePrefCache.inst().getLastUsableNetworkSpeed().mo59871a(Integer.valueOf(f111837a));
        }
    }

    /* renamed from: a */
    private static int m136961a(String str) {
        long c = C43305j.m137386g().mo105088c(str) / 1024;
        if (c > 0) {
            return (int) c;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c m136962a(com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel r26) {
        /*
            r0 = r26
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ss.android.ugc.aweme.commercialize.splash.i r2 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80857g()
            java.lang.String r3 = r26.getSourceId()
            java.lang.String r2 = r2.mo65548a(r3)
            if (r2 == 0) goto L_0x0015
            return r1
        L_0x0015:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.a r2 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80858h()
            java.lang.String r3 = r26.getSourceId()
            java.lang.String r2 = r2.mo65576a(r3)
            if (r2 == 0) goto L_0x0024
            return r1
        L_0x0024:
            java.util.List r2 = r26.getBitRate()
            if (r2 == 0) goto L_0x01ac
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0032
            goto L_0x01ac
        L_0x0032:
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            com.ss.android.ugc.aweme.video.VideoBitRateABManager r4 = com.p280ss.android.ugc.aweme.video.VideoBitRateABManager.m22786c()
            boolean r4 = r4.mo19004e()
            if (r4 == 0) goto L_0x01a1
            com.ss.android.ugc.playerkit.videoview.c.a r4 = com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a.m141816a()
            java.lang.String r5 = r26.getUrlKey()
            com.ss.android.ugc.lib.video.bitrate.regulator.b.e r4 = r4.mo107452e(r5)
            if (r4 != 0) goto L_0x004f
            return r1
        L_0x004f:
            com.ss.android.ugc.networkspeed.d r5 = com.p280ss.android.ugc.networkspeed.C44903d.m141655a()
            double r5 = r5.mo107377b()
            int r5 = (int) r5
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment> r7 = com.p280ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment.class
            r8 = 1
            java.lang.String r9 = "is_record_last_network_speed_enabled"
            com.bytedance.ies.abmock.b r10 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r10 = r10.mo15295d()
            boolean r10 = r10.is_record_last_network_speed_enabled
            r11 = 1
            boolean r6 = r6.mo15292a(r7, r8, r9, r10, r11)
            r7 = 0
            if (r6 == 0) goto L_0x009c
            double r9 = (double) r5
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x009a
            int r5 = f111837a
            if (r5 <= 0) goto L_0x0080
            int r5 = f111837a
            goto L_0x0092
        L_0x0080:
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r5 = r5.getLastUsableNetworkSpeed()
            java.lang.Object r5 = r5.mo59877d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x0092:
            com.ss.android.ugc.networkspeed.d r6 = com.p280ss.android.ugc.networkspeed.C44903d.m141655a()
            double r9 = (double) r5
            r6.f115474a = r9
            goto L_0x009c
        L_0x009a:
            f111837a = r5
        L_0x009c:
            double r9 = (double) r5
            java.util.Map r3 = m136963a(r3, r0, r9, r4)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r3 = r4.mo107322a(r2, r3)
            if (r3 != 0) goto L_0x00a8
            return r1
        L_0x00a8:
            m136965a(r3, r0)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r4 = r3.f115380a
            if (r4 == 0) goto L_0x01a2
            r6 = 0
            com.ss.android.ugc.aweme.feed.model.BitRate[] r11 = new com.p280ss.android.ugc.aweme.feed.model.BitRate[r6]
            java.lang.Object[] r2 = r2.toArray(r11)
            com.ss.android.ugc.aweme.feed.model.BitRate[] r2 = (com.p280ss.android.ugc.aweme.feed.model.BitRate[]) r2
            java.util.Comparator r11 = com.p280ss.android.ugc.aweme.video.bitrate.C43197b.f111838a
            java.util.Arrays.sort(r2, r11)
            com.ss.android.ugc.aweme.video.preload.j r11 = com.p280ss.android.ugc.aweme.video.preload.C43305j.m137386g()
            com.ss.android.ugc.aweme.video.preload.b r11 = r11.mo105091i()
            if (r11 == 0) goto L_0x017a
            double r12 = com.p280ss.android.ugc.aweme.video.experiment.C43220a.m137075d()
            int r14 = r2.length
            r15 = 0
        L_0x00cd:
            if (r15 >= r14) goto L_0x017a
            r16 = r2[r15]
            int r6 = r16.getBitRate()
            int r1 = r4.getBitRate()
            if (r6 == r1) goto L_0x0162
            java.lang.String r1 = r16.getUrlKey()
            long r7 = r11.mo105020a(r1)
            r19 = 0
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0157
            java.lang.String r1 = r16.getUrlKey()
            r21 = r2
            long r1 = r11.mo105027b(r1)
            r22 = r14
            r23 = r15
            long r14 = r1 - r7
            double r14 = (double) r14
            if (r5 <= 0) goto L_0x0134
            int r6 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x0134
            double r19 = r26.getDuration()
            r17 = 0
            int r6 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x0131
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r9)
            double r14 = r14 / r9
            r24 = r9
            double r9 = (double) r7
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r12
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r9 = r9 / r1
            double r1 = r26.getDuration()
            r19 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r19
            double r9 = r9 * r1
            int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0138
            r6 = 1
            goto L_0x0139
        L_0x0131:
            r24 = r9
            goto L_0x0138
        L_0x0134:
            r24 = r9
            r17 = 0
        L_0x0138:
            r6 = 0
        L_0x0139:
            int r1 = r16.getBitRate()
            int r2 = r4.getBitRate()
            if (r1 <= r2) goto L_0x0152
            java.lang.String r1 = r16.getUrlKey()
            long r1 = r11.mo105027b(r1)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0154
            if (r6 == 0) goto L_0x016c
            goto L_0x0154
        L_0x0152:
            if (r6 == 0) goto L_0x016c
        L_0x0154:
            r4 = r16
            goto L_0x017a
        L_0x0157:
            r21 = r2
            r24 = r9
            r22 = r14
            r23 = r15
            r17 = 0
            goto L_0x016c
        L_0x0162:
            r21 = r2
            r17 = r7
            r24 = r9
            r22 = r14
            r23 = r15
        L_0x016c:
            int r15 = r23 + 1
            r7 = r17
            r2 = r21
            r14 = r22
            r9 = r24
            r1 = 0
            r6 = 0
            goto L_0x00cd
        L_0x017a:
            r3.f115380a = r4
            r0.setHitBitrate(r3)
            com.ss.android.ugc.playerkit.session.a r1 = com.p280ss.android.ugc.playerkit.session.C44925a.m141730a()
            java.lang.String r2 = r26.getUri()
            com.ss.android.ugc.playerkit.session.Session r1 = r1.mo107408b(r2)
            if (r1 == 0) goto L_0x01a2
            java.lang.String r0 = r26.getSourceId()
            r1.sourceId = r0
            float r0 = (float) r5
            r1.speed = r0
            int r0 = r4.getBitRate()
            r1.bitrate = r0
            double r4 = r3.f115383d
            r1.calcBitrate = r4
            goto L_0x01a2
        L_0x01a1:
            r3 = 0
        L_0x01a2:
            if (r3 == 0) goto L_0x01aa
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = r3.f115380a
            if (r0 != 0) goto L_0x01a9
            goto L_0x01aa
        L_0x01a9:
            return r3
        L_0x01aa:
            r0 = 0
            return r0
        L_0x01ac:
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.bitrate.C43196a.m136962a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel):com.ss.android.ugc.lib.video.bitrate.regulator.a.c");
    }

    /* renamed from: a */
    static final /* synthetic */ int m136960a(BitRate bitRate, BitRate bitRate2) {
        return bitRate2.getBitRate() - bitRate.getBitRate();
    }

    /* renamed from: a */
    private static void m136965a(C44866f fVar, VideoUrlModel videoUrlModel) {
        try {
            BitrateNotMatchException bitrateNotMatchException = fVar.f115381b;
            if (C43220a.m137076e() && !VideoBitRateABManager.m22786c().f20347b) {
                bitrateNotMatchException = new BitrateNotMatchException(7, "gear config is not init");
            }
            if (bitrateNotMatchException != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bitrate_not_match_code", bitrateNotMatchException.getCode());
                jSONObject.put("bitrate_not_match_msg", bitrateNotMatchException.getMessage());
                if (videoUrlModel != null) {
                    jSONObject.put("group_id", videoUrlModel.getSourceId());
                }
                C6877n.m21447a("video_bitrate_not_match", jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m136963a(Context context, VideoUrlModel videoUrlModel, double d, C44879e eVar) {
        int i;
        if (!(eVar instanceof C44871c)) {
            return C44878b.m141608a().mo107339a((int) d).f115397a;
        }
        C44874b a = C44874b.m141581a();
        a.mo107325b((int) (videoUrlModel.getDuration() / 1000.0d)).mo107323a((int) d);
        try {
            C10123a e = C12961d.m37789e();
            a.mo107328c(e.f27564a).mo107330d(e.f27566c).mo107332e(e.f27565b);
        } catch (Exception unused) {
            a.mo107328c(0).mo107330d(0).mo107332e(0);
        }
        try {
            a.mo107334f(C43264m.m137242a(context).mo105015b(context));
        } catch (Exception unused2) {
            a.mo107334f(Integer.MIN_VALUE);
        }
        try {
            NetworkType networkType = NetworkUtils.getNetworkType(context);
            if (networkType == null) {
                i = 0;
            } else {
                i = networkType.getValue();
            }
            a.mo107336g(i).mo107337h(Integer.valueOf(NetworkUtils.getNetworkOperatorCode(context)).intValue());
        } catch (NumberFormatException unused3) {
            a.mo107337h(0);
        }
        List<Session> a2 = C44925a.m141730a().mo107405a(3, videoUrlModel.getUri());
        if (a2.size() > 0) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ArrayList arrayList4 = new ArrayList(3);
            ArrayList arrayList5 = new ArrayList(3);
            for (Session session : a2) {
                arrayList.add(Integer.valueOf((int) session.speed));
                arrayList2.add(Integer.valueOf(session.blockCnt));
                arrayList3.add(Integer.valueOf(session.blockTime));
                arrayList4.add(Integer.valueOf(session.bitrate));
                arrayList5.add(Integer.valueOf(session.playTime));
            }
            a.mo107324a((List<Integer>) arrayList).mo107326b((List<Integer>) arrayList2).mo107329c((List<Integer>) arrayList3).mo107331d((List<Integer>) arrayList4).mo107333e((List<Integer>) arrayList5);
        } else {
            a.mo107324a(Collections.emptyList()).mo107326b(Collections.emptyList()).mo107329c(Collections.emptyList()).mo107331d(Collections.emptyList()).mo107333e(Collections.emptyList());
        }
        ArrayList arrayList6 = new ArrayList();
        for (BitRate urlKey : videoUrlModel.getBitRate()) {
            arrayList6.add(Integer.valueOf(m136961a(urlKey.getUrlKey())));
        }
        a.mo107335f((List<Integer>) arrayList6);
        return a.mo107327b();
    }
}
