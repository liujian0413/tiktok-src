package com.p280ss.android.ugc.aweme.lancet.network;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.network.LocalApiChecker */
public class LocalApiChecker {

    /* renamed from: a */
    public static Map<String, String> f19980a;

    /* renamed from: b */
    public static C6600e f19981b;

    /* renamed from: c */
    public static Map<String, ApiCheckRecord> f19982c;

    /* renamed from: d */
    private static volatile Executor f19983d;

    /* renamed from: e */
    private static OkHttpClient f19984e;

    /* renamed from: f */
    private static List<String> f19985f;

    /* renamed from: g */
    private static List<String> f19986g;

    /* renamed from: com.ss.android.ugc.aweme.lancet.network.LocalApiChecker$ApiCheckRecord */
    static class ApiCheckRecord {
        @C6593c(mo15949a = "app_id")
        public String appId;
        @C6593c(mo15949a = "app_version")
        public String appVersion = C6399b.m19940p();
        @C6593c(mo15949a = "build_number")
        public String buildNumber = C6399b.m19937m();
        @C6593c(mo15949a = "content_type")
        public String contentType;
        @C6593c(mo15949a = "enter_from")
        public String enterFrom;
        @C6593c(mo15949a = "filter_type")
        public String filterType;
        @C6593c(mo15949a = "host")
        public String host;
        @C6593c(mo15949a = "path")
        public String path;
        @C6593c(mo15949a = "source_type")
        public String sourceType;

        ApiCheckRecord(String str, String str2, String str3, String str4, String str5, String str6) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19935k());
            this.appId = sb.toString();
            this.enterFrom = str;
            this.sourceType = str2;
            this.filterType = str3;
            this.host = str4;
            this.path = str5;
            this.contentType = str6;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.network.LocalApiChecker$a */
    static class C7115a implements Serializable {

        /* renamed from: a */
        public String f19993a;

        C7115a() {
        }
    }

    /* renamed from: b */
    private static void m22216b() {
        f19985f = Arrays.asList(new String[]{"0pbxmo.xzcs3zlph.com", "182.176.138.28", "9pwigjmwo.xzcs3zlph.com", "ad.doubleclick.net", "ads.w55c.net", "adsd.amanad.adtdp.com", "api2-21-h2.musical.ly", "api-h2.tiktokv.com", "api-m.tiktok.com", "api-t.tiktok.com", "api-tt.hypstar.com", "assets.dspunion.com", "attr.appsflyer.com", "cdn.smassets.net", "data.viettel.vn", "dm16.tiktokv.com", "ets-ap-southeast-1.track.smaato.net", "external.xx.fbcdn.net", "fb-s-b-a.akamaihd.net", "hotapi-va.isnssdk.com", "i.singular.net", "ibn.adreach.co", "imapihotsoon.isnssdk.com", "imapi-mu.isnssdk.com", "img.macromill.com", "imp.control.kochava.com", "impression.appsflyer.com", "instagram.fakl1-1.fna.fbcdn.net", "instagram.fala4-1.fna.fbcdn.net", "instagram.fbkk8-2.fna.fbcdn.net", "instagram.fbtz1-5.fna.fbcdn.net", "instagram.fdmm1-2.fna.fbcdn.net", "instagram.feoh2-1.fna.fbcdn.net", "instagram.fevn2-1.fna.fbcdn.net", "instagram.ffjr1-3.fna.fbcdn.net", "instagram.fgru5-1.fna.fbcdn.net", "instagram.fhel4-1.fna.fbcdn.net", "instagram.fjed6-1.fna.fbcdn.net", "instagram.fkiv1-1.fna.fbcdn.net", "instagram.fkul1-1.fna.fbcdn.net", "instagram.fmia1-2.fna.fbcdn.net", "instagram.fpnq1-2.fna.fbcdn.net", "instagram.fsaw1-6.fna.fbcdn.net", "instagram.fsdv2-1.fna.fbcdn.net", "instagram.fsyd8-1.fna.fbcdn.net", "instagram.fzag3-1.fna.fbcdn.net", "jsb-sg.byteoversea.com", "k.kakaocdn.net", "lf16-muse-va.ibytedtos.com", "lf-tk-sg.ibytedtos.com", "lh4.googleusercontent.com", "log.tiktokv.com", "log.xzcs3zlph.com", "log2.musical.ly", "media1.giphy.com", "mon.byteoversea.com", "mon.musical.ly", "mon.sgsnssdk.com", "mon-va.byteoversea.com", "mpak-ainw1.akamaized.net", "musically.muscdn.com", "mus-lib-oss.muscdn.com", "m-v16.akamaized.net", "open-api.tiktok.com", "otk.pinduoduo.com", "p0.ipstatp.com", "p16.hypstarcdn.com", "p16.muscdn.com", "p16.tiktokcdn.com", "p16-hypstarcdn-com.akamaized.net", "p16-sg.hypstarcdn.com", "p16-va-default.akamaized.net", "p16-webcast-hypstarcdn.byteimg.com", "p3.pstatp.com", "p8u-l.tlnk.io", "pp.userapi.com", "profile.line-scdn.net", "px.moatads.com", "raw.githubusercontent.com", "rtlog.musical.ly", "s.ipstatp.com", "scontent-amt2-1.cdninstagram.com", "scontent-gru2-1.cdninstagram.com", "scontent-ort2-1.cdninstagram.com", "scontent-sin6-1.cdninstagram.com", "sf16-muse-va.ibytedtos.com", "sf16-security-sg.ibytedtos.com", "sf-tb-sg.ibytedtos.com", "sg.snssdk.com", "sg-effect.byteoversea.com", "static.rtbstack.co", "sun6-1.userapi.com", "sun9-17.userapi.com", "sun9-57.userapi.com", "sun9-69.userapi.com", "tos-awsfr.muscdn.com", "tps.doubleverify.com", "tracking.lenzmx.com", "track-us.bidease.com", "v16.akamaized.net", "v16.toutiao50.com", "v16.xzcs3zlph.com", "v16-tiktokcdn-com.akamaized.net", "v21.muscdn.com", "v32.muscdn.com", "webcast.tiktokv.com", "www.facebook.com", "www.tiktok.com", "xlog.byteoversea.com", "zqug0vx1ji.execute-api.ap-northeast-1.amazonaws.com", "instagram.fhel6-1.fna.fbcdn.net", "instagram.fbeg5-1.fna.fbcdn.net", "scontent-mxp1-1.cdninstagram.com", "cdn.ravenjs.com", "182.190.3.162", "stor.adstailor.com", "tos-awsfr16-up.muscdn.com", "gecko-sg.tiktokv.com", "api-21-h2.hypstar.com", "api21-h2.tiktokv.com", "api.instagram.com", "lf-hs-sg.ibytedtos.com", "instagram.fala2-1.fna.fbcdn.net", "cdn.adsmoloco.com", "log.toutiao50.com", "sun9-10.userapi.com", "p19-webcast-hypstarcdn.byteimg.com", "www.instagram.com", "cgicol.amap.com", "vas-maliva16.byteoversea.com", "tkimpdsp.mobvista.com", "instagram.ffln2-1.fna.fbcdn.net", "cdn.dogakun.club", "e.zapr.in", "sun9-3.userapi.com", "instagram.fhyd6-1.fna.fbcdn.net", "sun9-43.userapi.com", "an.yandex.ru", "v19-vcheckout.muscdn.com", "cdn.appnext.com", "instagram.fhhr1-2.fna.fbcdn.net", "sf21-webcast.muscdn.com", "play.googleapis.com", "is1-ssl.mzstatic.com", "artwork-cdn.7static.com", "sso.bytedance.com", "open-api.musical.ly", "bs-metadsp.yandex.ru", "us01.rayjump.com", "dm.byteoversea.com", "abs.twimg.com", "mphw-suse1.muscdn.com", "p16.toutiao50.com", "sf16-webcast.muscdn.com", "api-sg.toutiao50.com", "sf16-webcast-hypstarcdn.byteimg.com", "imapi-16.musical.ly", "scontent-frt3-1.cdninstagram.com", "sun9-28.userapi.com", "sf19-webcast-hypstarcdn.byteimg.com", "platform-lookaside.fbsbx.com", "smr-sg.byteoversea.com", "v23.muscdn.com", "cdn.liftoff.io", "scontent-nrt1-1.cdninstagram.com", "tps30.doubleverify.com", "api21.tiktokv.com", "instagram.fcgk1-1.fna.fbcdn.net", "instagram.ffjr1-4.fna.fbcdn.net", "m.facebook.com", "m-p16.akamaized.net", "p0.sgpstatp.com", "p16.flipagramcdn.com", "instagram.ffor12-1.fna.fbcdn.net", "p16.pstatp.com", "audio-ssl.itunes.apple.com", "imgs.uvwill.com", "instagram.fyto1-1.fna.fbcdn.net", "kuotahabis.tri.co.id", "scontent-sjc3-1.cdninstagram.com", "sun9-9.userapi.com", "developer.toutiao.com", "lh5.googleusercontent.com", "va.musical.ly", "sf16-sg.muscdn.com", "mpak-ssgc1.akamaized.net", "instagram.fevn1-2.fna.fbcdn.net", "instagram.fyyz1-1.fna.fbcdn.net", "sf16-passport-sg.ibytedtos.com", "ets-us-east-1.track.smaato.net", "sun9-6.userapi.com", "log-16.toutiao50.com", "static.xx.fbcdn.net", "staticxx.facebook.com", "www.tiktokv.com", "p16-sg.toutiao50.com", "cloudapi.bytedance.net", "v16-vcheckout.muscdn.com", "fb-s-a-a.akamaihd.net", "mpaw-sinc1.muscdn.com", "servedby.flashtalking.com", "instagram.fsin3-1.fna.fbcdn.net", "video.turncdn.com", "scontent-lax3-1.cdninstagram.com", "wifi.ais.co.th", "analytics.dspunion.com", "api2.musical.ly", "api30.tiktokv.com", "sf-tk-sg.ibytedtos.com", "bs.serving-sys.com", "instagram.fsgn5-3.fna.fbcdn.net", "sg01.rayjump.com", "media3.giphy.com", "mpal-ocne1.muscdn.com", "instagram.fesb1-2.fna.fbcdn.net", "webcast.musical.ly", "mpak-odec1.akamaized.net", "scontent-lga3-1.cdninstagram.com", "track.tenjin.io", "www.google-analytics.com", "p16-sg.xzcs3zlph.com", "instagram.fcpt1-1.fna.fbcdn.net", "instagram.fbey5-2.fna.fbcdn.net", "impression-east.liftoff.io", "apads.mspremium.io", "z-p3-external.xx.fbcdn.net", "sf16-sg-default.akamaized.net", "media.tenor.com", "abtest-sg.byteoversea.com", "c1.flipagramcdn.com", "sgali-mcs.byteoversea.com", "mphw-ssgc1.muscdn.com", "voffline.byted.org", "d32wf7rjmiohyx.cloudfront.net", "byteoversea", "imapi-16.tiktokv.com", "v3.muscdn.com", "media0.giphy.com", "media2.giphy.com", "sun9-4.userapi.com", "sf16-security-va.ibytedtos.com", "e.crashlytics.com", "tiktokcdn.com", "api2-16-h2.musical.ly", "svastx.moatads.com", "v16.flipagramcdn.com", "www.google.com", "scontent-mad1-1.cdninstagram.com", "bsch.serving-sys.com", "instagram.ffjr1-1.fna.fbcdn.net", "p15.hypstarcdn.com/obj/maliva-live-admin-node", "p15.hypstarcdn.com", "lh6.googleusercontent.com", "api2-1.musical.ly", "www.airtel.in", "mon.tiktokv.com", "mpak-suse1.akamaized.net", "instagram.fgyd1-1.fna.fbcdn.net", "verify-sg.tiktokv.com", "instagram.fcgk2-1.fna.fbcdn.net", "scontent-vie1-1.cdninstagram.com", "mpal-odec1.muscdn.com", "maps.googleapis.com", "music.musical.ly", "sun9-45.userapi.com", "fbcdn.net", "smr-aliva.byteoversea.com", "d2br548mr8rnz3.cloudfront.net", "is4.mzstatic.com", "activity.tiktok.com", "p16.xzcs3zlph.com", "hotapi.sgsnssdk.com", "sf16-sg.hypstarcdn.com", "presentation-hkg1.turn.com", "instagram.fbkk4-1.fna.fbcdn.net", "api2-16.musical.ly", "api2-t2.musical.ly", "giphy-analytics.giphy.com", "tosv.byted.org", "api2-h2.musical.ly", "syndication.twitter.com", "t.appsflyer.com", "instagram.fevn1-3.fna.fbcdn.net", "dm16.musical.ly", "p16-va.tiktokcdn.com", "instagram.fala5-1.fna.fbcdn.net", "m-v16.toutiao50.com", "mpak-sinc1.akamaized.net", "is5.mzstatic.com", "v16.muscdn.com", "v35.muscdn.com", "dns.google.com", "tntph.com", "view.adjust.com", "nnh-m.tlnk.io", "scontent-syd2-1.cdninstagram.com", "scontent-iad3-1.cdninstagram.com", "lf-tb-sg.ibytedtos.com", "www.gstatic.com", "www.google.cn", "va-effect.byteoversea.com", "yastatic.net", "p16-tiktokcdn-com.akamaized.net", "instagram.fbel2-1.fna.fbcdn.net", "smart.com.ph", "sun6-13.userapi.com", "instagram.fevn1-1.fna.fbcdn.net", "api2-22-h2.musical.ly", "p16-webcast.muscdn.com", "is2.mzstatic.com", "lh3.googleusercontent.com", "dsptrack-jp.rtblab.net", "tosc.byted.org", "10.93.236.145", "impression-asia.liftoff.io", "advideo.dsp.yandexadexchange.net", "sun6-2.userapi.com", "agrostar.app.link", "dm16.byteoversea.com", "stats.g.doubleclick.net", "instagram.fudi1-2.fna.fbcdn.net", "fbsbx.com", "instagram.fsyd7-1.fna.fbcdn.net", "mercusuar.uzone.id", "api.hypstar.com", "v16.hypstarcdn.com", "sdfp-sg.byteoversea.com", "kauth.kakao.com", "scontent-arn2-1.cdninstagram.com", "v34.muscdn.com", "instagram.fcgk18-1.fna.fbcdn.net", "xlog.tiktokv.com", "api16.hypstar.com", "api2-19-h2.musical.ly", "is2-ssl.mzstatic.com", "p16-sg-default.akamaized.net", "scontent-atl3-1.cdninstagram.com", "p16-va.hypstarcdn.com", "is3-ssl.mzstatic.com", "dzyh5s117pl2x.cloudfront.net", "api.tiktokv.com", "data.bytedance.net", "graph.instagram.com", "facebook.com", "badungfreewifi.bali.iconpln.co.id", "api2-30.musical.ly", "instagram.fiev14-1.fna.fbcdn.net", "an.facebook.com", "scontent.xx.fbcdn.net", "fb-s-d-a.akamaihd.net", "instagram.fplm1-1.fna.fbcdn.net", "instagram.fjed4-3.fna.fbcdn.net", "instagram.fgau1-1.fna.fbcdn.net", "api16.tiktokv.com", "i.sgsnssdk.com", "v1-hp.ixigua.com", "money91.app.link", "graph.accountkit.com", "p16-sg.muscdn.com", "i.w55c.net", "instagram.fcgk9-2.fna.fbcdn.net", "scontent-lhr3-1.cdninstagram.com", "log16.byteoversea.com", "instagram.fruh4-5.fna.fbcdn.net", "instagram.fhel5-1.fna.fbcdn.net", "sf-hs-sg.ibytedtos.com", "v31.muscdn.com", "sun6-6.userapi.com", "l9bclvbns.xzcs3zlph.com", "pbs.twimg.com", "api-t2.tiktokv.com", "sf19-webcast.muscdn.com", "imapi-sg.isnssdk.com", "m.tiktok.com", "v33.muscdn.com", "scontent-ort2-2.cdninstagram.com", "creative.bidease.com", "frontier.byteoversea.com", "i18nbranding.bytedance.com", "sun9-1.userapi.com", "log.byteoversea.com", "x.adstailor.com", "gecko-sg.byteoversea.com", "tr-asia.adsmoloco.com", "res01.musical.ly", "scontent-hkg3-2.xx.fbcdn.net", "lookaside.facebook.com", "sf21-webcast-hypstarcdn.byteimg.com", "events.appsflyer.com", "i.byteoversea.com", "v.adsrvr.org", "aps.amap.com", "ref.ad-brix.com", "t.tiktok.com", "v19.muscdn.com", "api2-19.musical.ly", "3dokby.toutiao50.com", "webcast.hypstar.com", "vet-us-east-1.track.smaato.net", "settings.crashlytics.com", "client_monitor.isnssdk.com", "musigain.com", "p19-webcast.muscdn.com", "graph.facebook.com", "instagram.faqa1-1.fna.fbcdn.net", "v19-hwp.muscdn.com", "s16.ipstatp.com", "api.twitter.com", "sun9-18.userapi.com", "instagram.fjed2-2.fna.fbcdn.net", "instagram.fkul7-1.fna.fbcdn.net", "app-measurement.com", "sf16-passport-va.ibytedtos.com", "instagram.faep6-1.fna.fbcdn.net", "kuota.axisnet.id", "p1.pstatp.com", "instagram.fgyn11-1.fna.fbcdn.net", "app.appsflyer.com", "is5-ssl.mzstatic.com", "d.xfinfr.com", "is4-ssl.mzstatic.com", "mpak-sinc1a.akamaized.net", "log15.byteoversea.com", "clients4.google.com", "impression.link", "scontent-frx5-1.cdninstagram.com", "cdn-f.adsmoloco.com", "scontent-dfw5-1.cdninstagram.com", "dsp-india.appnxt.net", "vk.com", "v16.tiktokcdn.com", "instagram.fhmo2-2.fna.fbcdn.net", "music.muscdn.com", "scontent.cdninstagram.com", "scontent-frt3-2.cdninstagram.com", "instagram.fcgh15-1.fna.fbcdn.net", "instagram.fhrk1-1.fna.fbcdn.net", "s2s.adjust.com", "naptien.vinaphone.com.vn", "sun9-5.userapi.com", "zerobalance.smart.com.kh", "secure-gl.imrworldwide.com", "instagram.fevn1-4.fna.fbcdn.net", "rtlog.byteoversea.com", "s0.ipstatp.com", "api.toutiao50.com", "instagram.fmcz4-1.fna.fbcdn.net", "connect.facebook.net", "scontent-icn1-1.cdninstagram.com", "video.xx.fbcdn.net", "activity.byted.org", "www.google.com", "voffline.byted.org", "dns.google.com", "tosv.byted.org", "sso.bytedance.com", "pj.cydialmg.cc", "mon.tiktokv.com", "127.0.0.4", "dl.profile.line-cdn.net", "mus-lib-oss.muscdn.com", "api2-16-h2.musical.ly", "music.musical.ly", "fb-s-b-a.akamaihd.net", "fb-s-d-a.akamaihd.net", "media.tenor.com", "scontent-nrt1-1.cdninstagram.com", "abtest-sg-tiktok.byteoversea.com", "ads.airbridge.io", "mpaw-ssgc1.muscdn.com", "img.vim-cn.com", "mpaw-sinc1.muscdn.com", "api-s1-quic.tiktokv.com", "api-s1-h2.tiktokv.com", "insight.adsrvr.org", "fb-s-c-a.akamaihd.net", "vas-alisg16.byteoversea.com", "dm-maliva16.byteoversea.com", "cdn-adn.rayjump.com", "fb-s-a-a.akamaihd.net", "newcommers.toopsguardian.com", "s.update.adsrvr.org", "mphw-ssgc1.muscdn.com", "dm16.musical.ly", "musically.muscdn.com", "sg2-bid.adsrvr.org", "api-t1.tiktokv.com", "musically-prod.oss.aliyuncs.com", "a662.phobos.apple.com", "122.2.176.151", "zonnia.com.vn", "61.26.74.206", "webcast21.tiktokv.com", "61.26.74.242", "211.76.123.82", "122.2.177.19", "61.26.74.250", "182.176.139.125", "122.2.177.20", "122.2.176.214", "220.152.35.182", "61.25.0.70", "122.2.176.217", "61.26.74.234", "122.2.177.18", "122.2.176.210", "122.2.176.148", "220.152.35.82", "220.152.42.162", "i.isnssdk.com", "220.152.35.98", "thongbao.mobifone.vn", "113.197.108.201", "220.152.35.106", "122.2.177.218", "122.2.176.213", "61.26.74.202", "webcast16.tiktokv.com", "v16m-default.akamaized.net", "122.2.176.150", "220.152.35.154", "220.152.42.74", "221.159.233.202", "61.26.74.58", "122.2.177.153", "220.152.35.66", "219.100.238.250", "wificp.fpt.vn", "122.2.176.87", "122.2.176.23", "www.hutech.edu.vn", "220.152.35.90", "122.2.176.216", "122.2.177.150", "218.223.216.103", "122.2.177.152", "giahan.fpt.vn", "219.85.80.217", "220.152.35.70", "220.152.35.178", "61.58.159.25", "124.109.125.6", "122.2.176.22", "122.2.177.148", "220.152.35.58", "61.26.74.226", "mflix.vnptvas.vn", "210.202.63.109", "naptien.vietteltelecom.vn", "me.metfone.com.kh", "61.25.0.34", "220.152.35.26", "dns.google", "api.tenor.com", "220.152.35.94", "122.2.176.18", "122.2.177.86", "220.152.35.186", "220.152.35.110", "61.25.0.30", "61.26.74.170", "220.152.35.74", "61.26.74.222", "123.110.247.161", "220.152.35.166", "122.2.176.19", "122.2.176.83", "220.152.35.86", "topup.metfone.com.kh", "122.2.176.153", "casttt1.xzcs3zlph.com", "124.9.64.102", "142.129.4.87", "61.26.74.230", "portal.trueinternet.co.th", "142.129.4.143", "220.208.128.209", "203.165.0.254", "123.110.111.213", "122.2.177.146", "203.165.0.2", "122.2.176.212", "122.2.176.149", "61.26.74.214", "103.225.0.6", "103.225.0.2", "124.109.125.5", "launches.appsflyer.com", "122.2.177.84", "122.2.177.214", "support.unitel.com.la", "61.60.212.178", "61.26.74.246", "61.58.64.177", "61.57.159.54", "122.2.177.83", "122.2.176.215", "106.105.105.93", "122.2.176.147", "220.152.35.162", "secure.screentimelabs.com", "122.2.177.21", "122.2.177.212", "210.202.63.105", "landing.dtac.co.th", "151.205.4.5", "freedoo.vnpt.vn", "noloadbalance.globe.com.ph", "220.152.35.130", "110.164.252.137", "220.152.35.158", "220.152.35.174", "122.2.177.87", "220.208.128.205", "61.56.190.210", "122.2.177.217", "180.189.173.178", "122.2.176.21", "122.2.176.152", "142.129.4.89", "103.5.142.193", "220.152.35.50", "122.2.176.82", "220.152.35.54", "122.2.177.210", "www.wi-five.jp", "122.2.177.82", "61.56.190.214", "122.2.177.213", "49.158.221.250", "122.2.177.216", "142.129.4.83", "61.58.159.17", "122.2.176.84", "122.2.177.151", "122.2.176.86", "122.2.177.149", "61.26.74.210", "220.152.35.78", "220.152.35.170", "223.27.232.68", "219.85.80.221", "122.2.176.20", "61.58.64.181", "220.152.35.138", "123.110.247.165", "61.26.74.218", "220.152.35.134", "122.2.177.85", "182.190.3.98", "220.152.35.190", "122.2.176.146", "211.76.117.82", "122.2.176.211", "220.152.35.102", "122.2.177.211", "www.ustraa.com", "rukminim1.flixcart.com", "cdn.speedcurve.com", "www.epicgames.com", "dpm.demdex.net", "ichannel.musical.ly", "v16-muscdn.toutiao50.com", "www.flipkart.com", "s2.go-mpulse.net", "applog.musical.ly", "www.googleapis.com", "flipkart.d1.sc.omtrdc.net", "assorted.downloads.oppo.com", "www.sephora.fr", "cdn.cquotient.com", "img1a.flixcart.com", "platform.twitter.com", ".*.mzstatic.com", "cache-ssl.celtra.com", "track.celtra.com", "sdfp-sg.tiktokv.com", "ap-notify.bidagent.xad.com", "d1pvdv1exgrgzw.cloudfront.net", "v16-mcheckout.muscdn.com", "v16-mcheckout.muscdn.com", "p16-mt-va.ibyteimg.com", "p16-mt-va.ibyteimg.com", "v16-mcheckout.muscdn.com", "sun9-48.userapi.com", "healofy.app.link", "scontent-dfw5-2.cdninstagram.com", "p16-mt-va.ibyteimg.com", "p16-mt-va.ibyteimg.com", "scontent-cdt1-1.cdninstagram.com", "dm16-test.musical.ly", "scontent-lht6-1.cdninstagram.com", "impression.ads.wish.com", "reginaclinic.jp", "inapps.appsflyer.com", "scontent-cdg2-1.cdninstagram.com", "music-lib.oss.aliyuncs.com", "104.115.39.43", "grameenphone.filter.ncnd.mobi", "23.76.156.32", "s16-hypstarcdn-com.akamaized.net", "189.40.212.21", "s16-hypstarcdn-com.akamaized.net", "jio.com", "111.119.161.155", "s16-hypstarcdn-com.akamaized.net", "94.97.232.217", "184.25.108.41", "p16hypstarcdn-a.akamaihd.net", "49.44.179.153", "www.giffgaff.com", "s16-hypstarcdn-com.akamaized.net", "2.16.103.96", "104.115.39.16", "www.jio.com", "104.115.39.41", "49.44.50.51", "49.44.179.200", "49.44.114.24", "184.51.114.120", "s16-hypstarcdn-com.akamaized.net", "104.115.39.26", "104.115.39.72", "13.249.236.95", "23.200.239.65", "104.112.227.49", "13.35.227.105", "13.35.227.111", "s16-hypstarcdn-com.akamaized.net", "giffgaff.com", "104.115.39.41", "184.85.220.42", "23.11.235.59", "182.176.154.217", "www.vigovideo.net", "49.44.177.104", "51.39.178.18", "103.211.150.40", "www.hypstar.com", "184.51.198.106", "223.196.43.8", "86.51.94.81", "23.57.69.80", "s16-hypstarcdn-com.akamaized.net", "23.12.144.165", "130.193.149.26", "104.115.39.26", "p16a.hypstarcdn.com", "13.35.130.10", "23.11.214.11", "www.iam.ma", "123.108.240.99", "51.39.178.19", "13.227.143.10", "115.112.0.7", "201.0.218.25", "13.35.202.96", "23.216.55.130", "104.115.39.67", "13.33.169.119", "104.115.39.72", "119.30.105.90", "23.200.238.10", "23.15.37.33", "v16hypstarcdn-a.akamaihd.net", "96.17.72.64", "api-t2.hypstar.com", "104.123.50.91", "13.35.130.92", "96.17.150.107", "auth1.tim.com.br", "99.86.47.49", "104.116.245.11", "104.115.39.11", "104.115.39.16", "104.115.39.41", "201.159.159.49", "104.94.18.176", "13.224.21.44", "54.192.102.118", "49.44.50.145", "2.21.90.112", "49.44.200.88", "104.86.183.147", "104.94.19.73", "23.215.215.10", "223.196.17.18", "myattwg.att.com", "v16-tls.muscdn.com", "v16-tls.muscdn.com", "developer-sg.toutiao.com", "sun9-63.userapi.com", "v16-tls.muscdn.com", "vast-pixel.ad.smaato.net", "api.snapkit.com", "sun9-8.userapi.com", "sun9-16.userapi.com", "sun9-72.userapi.com", "scontent-lax3-2.cdninstagram.com", "reports.crashlytics.com", "frontier.musical.ly", "mon.isnssdk.com", "ip-api.com", "internet.vodafone.com.eg", "frontier.tiktokv.com", "filter.ncnd.tele2.ru", "m.orange.be", "freeapi.ipip.net", "action.newapigenapplication.com", "52.52.80.126", "uphe.demdex.net", "business.instagram.com", "business.instagram.com", "business.instagram.com", "www.catsmovie.com", "tp-paymva.snssdk.com", "internet.tigo.com.gt", "r.miclaro.com.ec", "165.227.90.27", "portal.tsmb.encapto.com", "ajax.googleapis.com", "www.narscosmetics.com", "wurfl.io", "www.narscosmetics.com", "www.narscosmetics.com", "www.narscosmetics.com", "www.narscosmetics.com", "dd6zx4ibq538k.cloudfront.net", "bit.ly", "kapi.kakao.com", "scontent-hkg3-2.cdninstagram.com", "music.line.me", "scontent-hkg3-2.cdninstagram.com", "cx.atdmt.com", "help.instagram.com", "help.instagram.com", "euro.net", "data.smartfren.com", "world-s3-ap-a.allimgcloud.com", "vastpixel2.adsafeprotected.com", "th-p.talk.kakao.co.kr", "static.adsafeprotected.com", "appvast.adsafeprotected.com", "vastlog.adsafeprotected.com", "p.placed.com", "sun9-68.userapi.com", "sun9-29.userapi.com", "thirdwx.qlogo.cn", "img.mindastore.com", "wx.qlogo.cn", "scontent-sit4-1.cdninstagram.com", "scontent-sit4-1.cdninstagram.com", "thirdwx.qlogo.cn", "external.fbkk24-1.fna.fbcdn.net", "fna.fbcdn.net", "v9.tiktokcdn.com", "v30.tiktokcdn.com", "v19.tiktokcdn.com", "v21.tiktokcdn.com", "sf19-webcast.tiktokcdn.com", "p16a.tiktokcdn.com", "v16m.tiktokcdn.com", "api.line.me", "lk.ttk.ru", "naptien.viettel.vn", "router.hicity.vn", "imasdk.googleapis.com", "googleads.g.doubleclick.net", "masinternet.personal.com.ar", "complianceomsdk.iabtechlab.com", "123.xl.co.id", "csi.gstatic.com", "access.line.me", "www.mobily.com.sa", "napthe.com", "filter.ncnd.telenor.com.pk", "vt.tiktok.com", "starling-va.byteoversea.com", "action.newapigenapplication.com", "tp-paymva.snssdk.com", "verification-va.musical.ly", "free.facebook.com", "jsb-va.byteoversea.com", "starling-sg.byteoversea.com", "verify-sg.byteoversea.com", "sdfp-va.byteoversea.com", "xlog-va.musical.ly", "abtest-va-tiktok.byteoversea.com", "gecko-va.musical.ly", "taobao.com", "mfg04.family-wifi.jp", "192.168.", "10.224.23.88", "myinternet.digi.com.my", "10", "asset.dspunion.com", "recharger.m.sfr.fr", "first.wifi.olleh.com", "welcome2.wifi.id", "odatos.telcel.com", "mfg02.family-wifi.jp", "choices.trustarc.com", "vm.tiktok.com", "sdfp-va.musical.ly", "v16-common.muscdn.com", "v16-common.muscdn.com", "sdk.appsflyer.com", "sun9-23.userapi.com", "v16-common.muscdn.com", "vast.doubleverify.com", "vtrk.doubleverify.com", "rs.mail.ru", "www.tns-counter.ru", ".bidderstack.com", "r.mradx.net", ".cdninstagram.com", "sun9-44.userapi.com", "sun6-14.userapi.com", ".userapi.com", "api-s1-quic.musical.ly", "www.comotopshop.cn", "v16-common.tiktokcdn.com", "sf16-webcast.tiktokcdn.com", "api2-t1.musical.ly", "ad.adriver.ru", "k2dshop.vn", "ad.mail.ru", "ar.tns-counter.ru", "kata.vn", "tiktok.dsp.yandexadexchange.net", "metadiet.pro", "www.kuronekoyamato.co.jp", "pixel.adlooxtracking.com", "wcm-ru.frontend.weborama.fr", "top-fwz1.mail.ru", "seer-sandbox.bytedance.net", "proxy-track-us.bidease.com", "v26.tiktokcdn.com", "p16-tiktokcdn-com.toutiao50.com", "rs.mail.ru", "phobos.apple.com", "wifizone.net", "topup.halotel.co.tz", "oren.wifi.domru.ru", "portalrecarga.vivo.com.br", "www.safaricom.com", "api21-quic.tiktokv.com", "www.recargafacil.claro.com.br", "182.190.3.67", "wcm.solution.weborama.fr", "internet.djezzy.dz", "agnet.net", "wifilogin.google.com", "services.trueinternet.co.th", "choof.ooredoo.dz", "wap.oi.com.br", "mytel.com.mm", "mq-shop.ru", "n85.network-auth.com", "notification.etisalat.com.eg", "mpaw-suse1-up.muscdn.com", "meu.vm.co.mz", "www.passorange.sn", "s16.tiktokcdn.com", "s16a.tiktokcdn.com", "s16b.tiktokcdn.com", "jsb-va.musical.ly", "video-va.musical.ly", "v16a.tiktokcdn.com", "47.252.102.112", "tp-paysg.snssdk.com", "jsb-sg.tiktokv.com", "161.117.93.65", "bewakoof.app.link", "proxy-track-eu.bidease.com", "tos-maliva16-up.muscdn.com", "tos-awsin21-up.muscdn.com", "tos-awsin.muscdn.com", "tos-maliva16-up.muscdn.com", "bkbd-maliva16-up.muscdn.com", "video-sg.musical.ly", "tp-pay.byteoversea.com", "dm-maliva-quic.byteoversea.com", "dm-sg-quic.byteoversea.com", "status.net", "naptien.viettel.vn", "auth3.s-wifi.vn", "118.68.13.116:8880", "123.xl.co.id", "acehlink.id", "rian.net", "megaplusredirection.tedata.net", "119.160.112.50", "hello-b2b.yota.ru", "free.wifi.rt.ru", "unblock.mts.ru", "connectu.vodacom.co.za", "nofunds2.mtn.co.za", "xlog-va.byteoversea.com", "nofunds.mtn.co.za", "197.155.141.120", "verification-va.byteoversea.com", "redirect1.bbportal.bsnl.co.in", "getlantern.org", "notification.orange.tn", "www31.netcombowifi.com.br", "www.volumeepuise.inwi.ma", "tos-useast2a.muscdn.com", "tos-maliva19-up.muscdn.com", "bintang.net", "nino.net", "jdn.id", "adib.net", "xspeed.net", "skepa.net", "bal.smart.com.ph", "unblock.sberbank-tele.com", "180.179.77.11", "welcome1.bsnlfi.bsnl.co.in", "empire.net", "ccd.shouut.com", "wrongurl.mts.ru", "wifi.iam.ma", "filter.ncnd.telenor.com.mm", "11.11.11.1", "ecarrier.claro.com.co", "balance.beeline.ru", "n213.network-auth.com", "spb.wifi.domru.ru", "notify.ais.co.th", "tos-awsjp16-up.muscdn.com"});
    }

    /* renamed from: c */
    private static void m22217c() {
        f19986g = Arrays.asList(new String[]{"opp.skynet.shangdejigou.cn", "v2.reachmax.cn", "v6-hs.ixigua.com", "tvax2.sinaimg.cn", "media.91sd.com", "g.ads.cn.miaozhen.com", "mo.open.taobao.com", "a.appsimg.com", "zos.alipayobjects.com", "tos-hl-x.douyin.com", "p99.pstatp.com", "df.tanx.com", "v9-dy-y.ixigua.com", "pb.sogou.com", "alogs.umeng.com", "at.alicdn.com", "ib-lq.snssdk.com", "static.smartisanos.cn", "p98.pstatp.com", "gm.mmstat.com", "p0.meituan.net", "open.weibo.cn", "v28-hs.ixigua.com", "adtrack.zlyhd.cn", "hotsoon.snssdk.com", "hotsoon-a-lq.snssdk.com", "is3.snssdk.com", "p9-hs.bytecdn.cn", "mon.toutiaocloud.net", "1111.tmall.com", "security-lq.snssdk.com", "v3-tt.ixigua.com", "cdn.bootcss.com", "mim-x.jd.com", "v9-dy-x.ixigua.com", "t-abi.hypers.com.cn", "hm.baidu.com", "p3-webcast-hscdn.byteimg.com", "v9-default.ixigua.com", "zhituokeji-alicdn.oss-cn-beijing.aliyuncs.com", "img-x.jd.com", "api.map.baidu.com", "webcast-i.amemv.com", "v6-default.ixigua.com", "m.dcdapp.com", "login.sina.com.cn", "v3-hs.ixiguavideo.com", "v29-tt.ixigua.com", "market.wacai.com", "v6-dy-4-x.ixigua.com", "p3-hs.byteimg.com", "v29-hs.ixigua.com", "vt.ipinyou.com", "v9-dy-ipv6.ixigua.com", "openapi.lianxinapp.com", "p3-tt.byteimg.com", "app-beta.snssdk.com", "p3-dy.byteimg.com", "v5-hs.ixigua.com", "v6-dy-ipv6.ixigua.com", "wifiapi02.51y5.net", "verify.snssdk.com", "ggtf.sunland.org.cn", "unidesk.alicdn.com", "v6-dy.ixigua.com", "ad.yshizr.cn", "td.yoyi.com.cn", "ydtg.6711img.com", "lnk0.com", "v6-dy.ixiguavideo.com", "i.ulmdb.cn", "f10.baidu.com", "api.amemv.com", "sc.appvipshop.com", "v9-tt.ixiguavideo.com", "toufang.liquidnetwork.com", "sf9-webcast-dycdn.byteimg.com", "s3a.openlanguage.com", "game.9dwork.com", "gw.alipayobjects.com", "ichannel.snssdk.com", "huatuocode.huatuo.qq.com", "nbsdk-baichuan.alicdn.com", "is-hl.snssdk.com", "p3.pstatp.com", "v1-tt.ixigua.com", "v5-dy-1-x.ixigua.com", "tos-nc2.douyin.com", "mkt.4399sy.com", "effect.snssdk.com", "p1-webcast-hscdn.byteimg.com", "api.weibo.com", "opencloud.wostore.cn", "mon.snssdk.com", "tos-cu-hl.douyin.com", "app001api.huixiaoer.com", "s3.bytecdn.cn", "ydtg.63yx.com", "thirdwx.qlogo.cn", "ad.xuegaogame.com:8001", "v96-tt.ixigua.com", "sf6-hscdn-tos.pstatp.com", "recieve.pilaipiwang.com", "ssl.captcha.qq.com", "tos-cm-hl.douyin.com", "gecko.snssdk.com", "rest2.dsp.daikuan.360.cn", "partner.ppdai.com", "webcast-hl.huoshan.com", "bigdata.hapi123.net", "p6-webcast-hscdn.byteimg.com", "sf3-ttcdn-tos.pstatp.com", "ib-hl.snssdk.com", "s.trafficjam.cn", "v1-dy-a-x.ixigua.com", "imggen.alicdn.com", "www.douyin.com", "gw.alicdn.com", "v1-xg.ixigua.com", "is.snssdk.com", "v1-default.ixigua.com", "m.360buyimg.com", "aweme.snssdk.com", "p3-webcast-dycdn.byteimg.com", "v3-dy-n.ixigua.com", "callback.api.89yoo.com", "h5.m.taobao.com", "v9-dy-a-x.ixigua.com", "47.92.82.21", "v26-tt.ixigua.com", "dw2.aoshitang.com", "d.alipay.com", "open.douyin.com", "rds.alipay.com", "rtlog.snssdk.com", "lf1-hscdn-tos.pstatp.com", "v6-dy-2-x.ixigua.com", "at.umeng.com", "ef-dongfeng.tanx.com", "wap.cmpassport.com", "rest.dsp.daikuan.360.cn", "a.vpimg3.com", "www.xiaohongshu.com", "appsupport.qq.com", "id6.me", "thor.dsp.com", "bsp.babytree.com", "lp.pinduoduo.com", "v27-dy-ipv6.ixigua.com", "api.ad.btshidai.com", "v1-hs.ixiguavideo.com", "tos-lf-x.douyin.com", "d.jeten.cn", "119.29.29.29", "sempage.guazi.com", "img1.360buyimg.com", "mapi.loveshangke.com", "s.360buyimg.com", "weixin.vip.com", "pb3.pstatp.com", "lianmengapi.snssdk.com", "e.cn.miaozhen.com", "wx.maoyan.com", "v1-dy.ixiguavideo.com", "i.alipayobjects.com", "t1.chinavivaki.com", "v6-dy-a-x.ixigua.com", "api.union.vip.com", "open.e.189.cn", "v3-default.ixigua.com", "i-hl.snssdk.com", "hotsoon-hl.snssdk.com", "tunion-api.m.taobao.com", "dot.xy.360.cn", "pic.rmb.bdstatic.com", "v6-dy-1-x.ixigua.com", "www.toutiao.com", "p9.pstatp.com", "handycam.alicdn.com", "p1-hs.byteimg.com", "v3-dy-a-x.ixigua.com", "p1-dy.bytecdn.cn", "dmptrack.dmp.mcdonalds.com.cn", "v6-dy-3-x.ixigua.com", "sycm.mmstat.com", "p9-webcast-hscdn.byteimg.com", "webmap1.bdimg.com", "dm.toutiao.com", "thirdqq.qlogo.cn", "openapi.api.lattebank.com", "res.wx.qq.com", "m.ctrip.com", "pic.sogou.com", "tp-pay.snssdk.com", "p0.pstatp.com", "www.dulakids.com", "v3-tt-m.bytecdn.cn", "ad-impression.cootekservice.com", "openland.zhulang.com", "v1-hp.ixiguavideo.com", "show.toufang.liquidnetwork.com", "t.alipayobjects.com", "pingtas.qq.com", "api.huoshan.com", "i.snssdk.com", "catfront.dianping.com", "v5-dy-3-x.ixigua.com", "dzy.r147emh.com", "sf3-hscdn-tos.pstatp.com", "gtrace.gimcyun.com", "dpprofile.snssdk.com", "wgo.mmstat.com", "down.alicdn.com", "v3-dy-y.ixigua.com", "fms.ipinyou.com", "v6-dy-y.ixigua.com", "sf1-ttcdn-tos.pstatp.com", "wx.qlogo.cn", "p22-dy.bytecdn.cn", "v5-dy.ixigua.com", "api.ibreader.com", "v6-dy-x.ixigua.com", "p1-webcast-dycdn.byteimg.com", "www.cmpassport.com", "v6-xg.ixigua.com", "rc.snssdk.com", "www.googletagmanager.com", "log.mmstat.com", "log.tlsy.cy.com", "developer.toutiao.com", "mbd.baidu.com", "pstatp.com", "detail.m.tmall.com", "v1.cloud-cube.net", "f11.baidu.com", "mclient.alipay.com", "dmp-data.vip.com", "gma.alicdn.com", "img.alicdn.com", "sqwtg.6711img.com", "s.bdstatic.com", "sqwtg3.6711img.com", "cddp-track.aligames.com", "abn.snssdk.com", "data.ads.oppomobile.com", "lrhc.24u7tos.com", "frontier.snssdk.com", "cloudapi.bytedance.net", "assets.alicdn.com", "dm-hl.toutiao.com", "sapi.pphaitun.com", "hotsoon-a.snssdk.com", "onecardyingxiaouat.9fbank.com", "c.gridsumdissector.com", "exp.a135.net", "www.toutiaopage.com", "qzs.qq.com", "timg01.bdimg.com", "i-lq.snssdk.com", "toutiao.hfbeta.com", "www.taobao.com", "fourier.alibaba.com", "imapihotsoon.snssdk.com", "dm.pstatp.com", "qzone.qq.com", "log-hl.snssdk.com", "im-x.jd.com", "u.api.ad.mobygame.cn", "mdi.ipinyou.com", "api-eagle-hl.amemv.com", "is-lq.snssdk.com", "adash.man.aliyuncs.com", "hhytrace.sogoucdn.com", "xlog.snssdk.com", "crm.bytedance.com", "aweme-beta.bytedance.net", "isub.snssdk.com", "v1-dy.ixigua.com", "api.x7sy.com", "img02.sogoucdn.com", "adcallback.jaadee.net", "sf3-webcast-dycdn.byteimg.com", "rta.cootekservice.com", "open.snssdk.com", "report.meituan.com", "static-alias-1.360buyimg.com", "sf6-ttcdn-tos.pstatp.com", "hotsoon-lq.snssdk.com", "tgky.aiyinghun.com", "m.suning.com", "p9-hs.byteimg.com", "g.alicdn.com", "api.xiaoxiangyoupin.com", "dcs.pepsico.com.cn", "sf6-webcast-dycdn.byteimg.com", "api-lq.huoshan.com", "aldcdn.tmall.com", "manhattan.activity.xiaojukeji.com", "c.ulmdb.cn", "s.click.tmall.com", "v.admaster.com.cn", "ryqb.7a31jmf.com", "abtest-ch.snssdk.com", "tj.ibingniao.com", "lf6-hscdn-tos.pstatp.com", "ipv6-v3.ixigua.com", "hotcloud.moqikaka.com", "openmobile.qq.com", "b.lnk0.com", "sf1-hscdn-tos.pstatp.com", "as.alipayobjects.com", "api-a.huoshan.com", "www.sdbao.com", "tos-ct-lf.douyin.com", "q.qlogo.cn", "v3-dy-x.ixigua.com", "kcart.alipay.com", "shark-tracer.netease.com", "stres.skynet.shangdejigou.cn", "tos-cm-lf.douyin.com", "img04.sogoucdn.com", "v3-dy-z.ixigua.com", "v9-hs.ixigua.com", "aweme.com", "ssl.ptlogin2.qq.com", "iu-lq.snssdk.com", "dataopenplatform.openxiaoniu.com", "ccc-x.jd.com", "snssdk.com", "srby.3mh0yvx.com", "p1-hs.bytecdn.cn", "v1-dy-ipv6.ixigua.com", "hyperlane.xiaojukeji.com", "exp-api.huitouche.com", "v3-dy-x.bytecdn.cn", "callback.ibreader.com", "prism.gamebean.net", "m.sogou.com", "v3-dy.ixiguavideo.com", "track.huishu.com.cn", "m.baidu.com", "gree.tmall.com", "v9-dy-z.ixigua.com", "ext.baidu.com", "mdap.alipay.com", "dm.bytedance.com", "v27-dy.ixigua.com", "at.pinduoduo.com", "api-a-lq.huoshan.com", "lf-hl.snssdk.com", "vas-lf-x.douyin.com", "v5-dy-2-x.ixigua.com", "99233205.tt.x.bsgslb.cn", "shop484027429.taobao.com", "rdstat.tanx.com", "kycount.smjyfx.com", "speech.bytedance.com", "v5-tt.ixigua.com", "lf-lq.snssdk.com", "p6-tt.bytecdn.cn", "www.chengzijianzhan.com", "v1-hs.ixigua.com", "a1.alicdn.com", "www.ulpay.com", "trace.zhiziyun.com", "gxb.mmstat.com", "passport.weibo.cn", "mon.toutiaocloud.com", "abtest-ch-hl.snssdk.com", "aweme-lab.bytedance.com", "cdn.jsdelivr.net", "p6-tt.byteimg.com", "hotsoon-a-hl.snssdk.com", "ken.jinritemai.com", "i.gridsumdissector.com", "count.hnguangyi.cn", "dig.bdurl.net", "www.dcdapp.com", "lf6-ttcdn-tos.pstatp.com", "ib.snssdk.com", "s3.ppkankan01.com", "m.ximalaya.com", "h5api.m.taobao.com", "is2-ssl.mzstatic.com", "gurd.snssdk.com", "api-eagle.amemv.com", "security.snssdk.com", "impression.aflink.com", "api.sdk.75757.com", "p1-tt.byteimg.com", "is3-ssl.mzstatic.com", "lf.snssdk.com", "p1.meituan.net", "davinci.snssdk.com", "gxbr.cnzz.com", "data.bytedance.net", "bytecdn.cn", "m.tb.cn", "s3.pstatp.com", "www.baidu.com", "public.sdk.guangkatf.com", "uri6.com", "p9-webcast-dycdn.byteimg.com", "ty.captcha.qq.com", "gtms03.alicdn.com", "weixin-api.vip.com", "open.music.qq.com", "ayw-game.oss-cn-hangzhou.aliyuncs.com", "p9-dy.bytecdn.cn", "p1-dy.byteimg.com", "toutiao.com", "l.tapdb.net", "h5api.m.tmall.com", "sjkz.tlvip.net", "ynuf.aliapp.org", "ydtg.nxrrvmy.com", "at.umtrack.com", "ut.gtags.net", "v9-dy.ixiguavideo.com", "v3-dy.ixigua.com", "ib.365yg.com", "h.sora.yoyi.com.cn", "v.douyin.com", "nk.pudatouzi.com", "p9-xg.byteimg.com", "tva2.sinaimg.cn", "api-hl.huoshan.com", "bombonera-dsp.taobao.com", "gio.ren", "webcast.amemv.com", "ss2.baidu.com", "p6-webcast-dycdn.byteimg.com", "clue.oceanengine.com", "p9-tt.byteimg.com", "ipstatp.com", "adsmis.duxiaoman.com", "b.ttt99999.cn", "img03.sogoucdn.com", "v3-dy-o.zjcdn.com", "poi.oceanengine.com", "v9-hs.ixiguavideo.com", "greatbearcst.sunlands.com", "sm.bdimg.com", "alogs.umengcloud.com", "smr.snssdk.com", "wvvvv.9377.cn", "stat.vipstatic.com", "report.url.cn", "dsp-bp.alicdn.com", "usaccount.mosoga.net", "v5-dy-4-x.ixigua.com", "v26-dy.ixigua.com", "t.cr-nielsen.com", "tajs.qq.com", "map.baidu.com", "140.143.49.190", "v6-dy-z.ixigua.com", "ss0.baidu.com", "log.snssdk.com", "v9-dy.ixigua.com", "cc.oceanengine.com", "v3-xg.ixigua.com", "v6-tt.ixigua.com", "www.bytedance.com", "webcast.huoshan.com", "p9-dy.byteimg.com", "xui.ptlogin2.qq.com", "v6-hs.ixiguavideo.com", "ggtf.shangdejigou.cn", "webcast-lq.huoshan.com", "gecko-hl.snssdk.com", "m.sunlands.com", "v9-tt.ixigua.com", "api.xy.360.cn", "v5-dy-5-x.ixigua.com", "a.alipayobjects.com", "api.getkwai.com", "imp.gentags.net", "dos-track.domob.cn", "login.taobao.com", "ipv6-v1.ixigua.com", "tva3.sinaimg.cn", "iu.snssdk.com", "p3-dy.bytecdn.cn", "vthumb.ykimg.com", "wap.sogou.com", "ss1.baidu.com", "a-cn.duoyi.com", "security-hl.snssdk.com", "bv.lnk0.com", "wt.ictr.cn", "api-a-hl.huoshan.com", "p1.pstatp.com", "hl.snssdk.com", "aweme-eagle.snssdk.com", "api-hl.amemv.com", "v3-dy-ipv6.ixigua.com", "datashence.danke.com:4106", "is5-ssl.mzstatic.com", "is4-ssl.mzstatic.com", "v1-xg.ixiguavideo.com", "pass.tmall.com", "www.smartisan.com", "sf1-webcast-dycdn.byteimg.com", "wl.jd.com", "ggpt.sunlands.com", "lf3-hscdn-tos.pstatp.com", "api.joyapi.com", "wxapi.appvipshop.com", "g.cn.miaozhen.com", "restapi.amap.com", "gss0.bdstatic.com", "trace.rtbasia.com", "imgcache.qq.com", "tracking.ad-survey.com", "iu-hl.snssdk.com", "v3-hs.ixigua.com", "c.jeten.cn", "g20.alicdn.com", "dlweb.sogoucdn.com", "app.aflink.com", "v27-tt.ixigua.com", "detail.tmall.com", "ui.ptlogin2.qq.com", "click.tanx.com", "login.imgcache.qq.com", "p3-hs.bytecdn.cn", "gsp0.baidu.com", "ad-pool.shiyuegame.com", "clickc.admaster.com.cn", "webcast.bytedance.net", "www.dianping.com", "config.cmpassport.com", "vt.ipinyou.com", "putin-api.kkk5.com", "v26-dy-ipv6.ixigua.com", "clickc.admaster.com.cn", "59.110.241.113", "onekey1.cmpassport.com", "api.getkwai.com", "item.taobao.com", "log1.cmpassport.com:9443", "kyyx.fall.calabashbrosgame.com", "mkt.4399sy.com", "tvax3.sinaimg.cn", "adgo.wangyuegame.com", "pjzyw.iuczy.com", ".*.mzstatic.com", "analytics.snssdk.com", "img.mindastore.com", "zwjp.zwjpai.com", "pj.cydialmg.cc", "haohuo.snssdk.com", "p3-xg.bytecdn.cn", "ken.snssdk.com", "p26-tt.byteimg.com", "t-benz.hypers.com.cn", "logtake.weidian.com", "v5-xg.ixigua.com", "fantasy3-activity-c.amemv.com", "t.mookie1.cn", "p1-fp.byteimg.com", "ptom.caohua.com", "p3-fp.byteimg.com", "mdap.alipaylog.com", "fantasy3-activity-c.amemv.com", "api3-normal-c-hl.amemv.com", "p9-fp.byteimg.com", "p9-fp.byteimg.com", "fantasy3-activity-c.amemv.com", "mtk.bnet.163.com", "47.90.123.140", "fantasy3-activity-c.amemv.com", "fantasy-static.amemv.com", "usersite-js.sxl.cn", "quming.mtain.cn", "adtracker.brandq.cn:8082", "tva4.sinaimg.cn", "open.chuangqish.com", "adashbc.ut.taobao.com", "user-assets.sxlcdn.com", "baichuan-sdk.taobao.com", "api3-normal-c-lf.amemv.com", "fantasy3-activity-c.amemv.com", "dw.jetmobo.com", "ai.voiceads.cn", "www.heishiapp.com", "tvax4.sinaimg.cn", "fantasy3-activity-c.amemv.com", "wisebuy.kejet.net", "tvax4.sinaimg.cn", "fantasy3-activity-c.amemv.com", "sf1-dycdn-tos.pstatp.com", "lh.snssdk.com", "it.snssdk.com", "qzapp.qlogo.cn", "miwifi.com", "ad.doubleclick.net", "aweme-hl.snssdk.com", "dig.bdurl.net", "effect.snssdk.com", "amfr.snssdk.com", "a755.phobos.apple.com", "a.net", "dm.pstatp.com", "s.com", "a442.phobos.apple.com", "a1220.phobos.apple.com", "a1242.phobos.apple.com", "service"});
    }

    /* renamed from: a */
    public static void m22212a() {
        if (f19984e == null) {
            f19984e = new OkHttpClient();
        }
        if (f19981b == null) {
            f19981b = new C6600e();
        }
    }

    /* renamed from: d */
    private static Executor m22219d() {
        if (f19983d == null) {
            synchronized (LocalApiChecker.class) {
                if (f19983d == null) {
                    f19983d = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("api_check").mo18996a());
                }
            }
        }
        return f19983d;
    }

    /* renamed from: d */
    private static boolean m22220d(String str) {
        int i;
        if (str.length() == 32) {
            i = 0;
            while (i < str.length()) {
                str.charAt(i);
                i++;
            }
        } else {
            i = 0;
        }
        if (i >= str.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m22221e(String str) {
        if (str.length() == 13) {
            long j = -1;
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
            if (j > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m22222f(String str) {
        if (str.length() == 8) {
            long j = -1;
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
            if (j > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m22218c(String str) {
        if (C6399b.m19944t() && "CN".equals(str)) {
            return true;
        }
        if (!C6399b.m19945u() || "CN".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m22215b(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf > 0 && lastIndexOf < str.length()) {
            String substring = str.substring(lastIndexOf + 1);
            if (m22221e(substring)) {
                str2 = str.substring(0, lastIndexOf);
            } else {
                str2 = str;
            }
            if (m22220d(substring)) {
                str = str.substring(0, lastIndexOf);
                int lastIndexOf2 = str.lastIndexOf("/");
                if (lastIndexOf2 > 0 && lastIndexOf2 < str.length() && m22222f(str.substring(lastIndexOf2 + 1))) {
                    str = str.substring(0, lastIndexOf2);
                }
            } else {
                str = str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m22210a(String str) {
        try {
            if (f19985f == null) {
                m22216b();
            }
            if (f19986g == null) {
                m22217c();
            }
            if (C6399b.m19944t()) {
                if (f19985f.contains(str)) {
                    return "NCN";
                }
            } else if (C6399b.m19945u() && f19986g.contains(str)) {
                return "CN";
            }
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (!(allByName == null || allByName.length <= 0 || allByName[0] == null)) {
                StringBuilder sb = new StringBuilder("/json/");
                sb.append(allByName[0].getHostAddress());
                String a = m22211a("ip-api.com", 80, sb.toString());
                if (a == null) {
                    StringBuilder sb2 = new StringBuilder("/");
                    sb2.append(allByName[0].getHostAddress());
                    a = m22211a("freeapi.ipip.net", 80, sb2.toString());
                }
                if (a != null) {
                    C7115a aVar = (C7115a) f19981b.mo15974a(a, C7115a.class);
                    if (!(aVar == null || aVar.f19993a == null)) {
                        return aVar.f19993a;
                    }
                }
            }
        } catch (IOException | Exception | UnknownHostException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m22214a(JSONObject jSONObject) {
        m22212a();
        try {
            f19984e.newCall(new Builder().url("https://cloudapi.bytedance.net/faas/services/ttsabxty4cv8jmxd86/invoke/upload").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString())).build()).execute();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    private static String m22211a(String str, int i, String str2) throws Exception {
        PrintWriter printWriter;
        Socket socket = new Socket(str, 80);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            printWriter = new PrintWriter(socket.getOutputStream());
            try {
                StringBuilder sb = new StringBuilder("GET ");
                sb.append(str2);
                sb.append(" HTTP/1.1");
                printWriter.println(sb.toString());
                printWriter.println("");
                printWriter.flush();
                InputStream inputStream2 = socket.getInputStream();
                try {
                    byte[] bArr = new byte[4096];
                    int i2 = 0;
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, i2, read);
                        i2 += read;
                    }
                    inputStream2.close();
                } catch (Exception unused) {
                    inputStream = inputStream2;
                    inputStream.close();
                    printWriter.close();
                    return byteArrayOutputStream.toString("utf-8");
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    inputStream.close();
                    printWriter.close();
                    throw th;
                }
            } catch (Exception unused2) {
                inputStream.close();
                printWriter.close();
                return byteArrayOutputStream.toString("utf-8");
            } catch (Throwable th2) {
                th = th2;
                inputStream.close();
                printWriter.close();
                throw th;
            }
        } catch (Exception unused3) {
            printWriter = null;
            inputStream.close();
            printWriter.close();
            return byteArrayOutputStream.toString("utf-8");
        } catch (Throwable th3) {
            th = th3;
            printWriter = null;
            inputStream.close();
            printWriter.close();
            throw th;
        }
        printWriter.close();
        return byteArrayOutputStream.toString("utf-8");
    }

    /* renamed from: a */
    public static void m22213a(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        Executor d = m22219d();
        f19983d = d;
        final String str5 = str;
        final String str6 = str2;
        final boolean z3 = z2;
        final boolean z4 = z;
        final String str7 = str4;
        final String str8 = str3;
        C71141 r1 = new Runnable() {
            public final void run() {
                String str;
                String str2;
                String str3;
                if (str5 != null) {
                    if (LocalApiChecker.f19982c == null) {
                        LocalApiChecker.f19982c = new HashMap();
                    }
                    if (LocalApiChecker.f19980a == null) {
                        LocalApiChecker.f19980a = new HashMap();
                    }
                    String b = LocalApiChecker.m22215b(str6);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(b);
                    String sb2 = sb.toString();
                    if (LocalApiChecker.f19980a.get(str5) == null) {
                        LocalApiChecker.m22212a();
                        str = LocalApiChecker.m22210a(str5);
                        if (str != null) {
                            LocalApiChecker.f19980a.put(str5, str);
                        }
                    } else {
                        str = (String) LocalApiChecker.f19980a.get(str5);
                    }
                    String str4 = "";
                    if (!z3) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str4);
                        sb3.append("1");
                        str4 = sb3.toString();
                    }
                    if (z4) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        if (TextUtils.isEmpty(str4)) {
                            str3 = "";
                        } else {
                            str3 = ",";
                        }
                        sb4.append(str3);
                        sb4.append("2");
                        str4 = sb4.toString();
                    }
                    boolean c = LocalApiChecker.m22218c(str);
                    if (c) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str4);
                        if (TextUtils.isEmpty(str4)) {
                            str2 = "";
                        } else {
                            str2 = ",";
                        }
                        sb5.append(str2);
                        sb5.append("3");
                        str4 = sb5.toString();
                    }
                    String str5 = str4;
                    if ((z3 && c) || !z3) {
                        Map<String, ApiCheckRecord> map = LocalApiChecker.f19982c;
                        ApiCheckRecord apiCheckRecord = new ApiCheckRecord("3", str7, str5, str5, b, str8);
                        map.put(sb2, apiCheckRecord);
                    }
                    if (LocalApiChecker.f19982c.size() >= 3) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("device_id", TeaAgent.getServerDeviceId());
                            jSONObject.put("filter_index", 2);
                            JSONArray jSONArray = new JSONArray();
                            for (ApiCheckRecord b2 : LocalApiChecker.f19982c.values()) {
                                jSONArray.put(new JSONObject(LocalApiChecker.f19981b.mo15979b((Object) b2)));
                            }
                            jSONObject.put("data", jSONArray);
                            LocalApiChecker.m22214a(jSONObject);
                            LocalApiChecker.f19982c.clear();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        };
        d.execute(r1);
    }
}
