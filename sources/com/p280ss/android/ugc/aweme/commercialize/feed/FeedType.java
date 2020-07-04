package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24411a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24935ah;
import com.p280ss.android.ugc.aweme.commercialize.log.C24937ai;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.FeedType */
public enum FeedType implements C24711ae {
    RAW_AD {
        /* renamed from: a */
        public final boolean mo64636a() {
            return true;
        }

        /* renamed from: b */
        public final void mo64638b(Context context, Aweme aweme) {
            C24976t.m82018X(context, aweme);
        }

        /* renamed from: f */
        public final void mo64644f(Context context, Aweme aweme) {
            C24708ac.m81053a();
        }

        /* renamed from: c */
        public final void mo64640c(Context context, Aweme aweme) {
            if (C6399b.m19944t()) {
                C24702a.m81035a().mo64649a(aweme.getAid());
            }
            C24976t.m82109aV(context, aweme);
            C24976t.m82044a(context, aweme);
        }

        /* renamed from: a */
        public final void mo64630a(Context context, Aweme aweme) {
            if (RAW_AD.isRealAuthor) {
                C24976t.m82231h(context, aweme, "name");
                if (C25352e.m83225h(aweme)) {
                    C24976t.m82240j(context, aweme);
                }
                if (aweme.isAd() && aweme.getAwemeRawAd().getProfileWithWebview() == 1) {
                    C24976t.m82204e(context, aweme, "name");
                }
                C24976t.m82214f(context, aweme, "name");
            } else if (RAW_AD.hasLandPage) {
                C24976t.m82231h(context, aweme, "name");
                C24976t.m82204e(context, aweme, "name");
            } else {
                C24976t.m82214f(context, aweme, "name");
            }
        }

        /* renamed from: d */
        public final void mo64642d(Context context, Aweme aweme) {
            if (!C25352e.m83207I(aweme).booleanValue() || !aweme.withFakeUser()) {
                if (C6399b.m19944t()) {
                    if (RAW_AD.isDownloadMode && !RAW_AD.isRealAuthor) {
                        C24976t.m82269q(context, aweme);
                        if (RAW_AD.allowJumpToGooglePlay) {
                            C24976t.m82204e(context, aweme, "slide");
                            if (C25371n.m83446a(context, aweme)) {
                                return;
                            }
                        }
                    }
                    if (isVast(aweme)) {
                        C24976t.m82269q(context, aweme);
                        C24976t.m82204e(context, aweme, "slide");
                        if (C25371n.m83450a(context, aweme, (String) null, (String) null)) {
                            return;
                        }
                    }
                }
                if (C25371n.m83484e(context, aweme)) {
                    C24976t.m82269q(context, aweme);
                    C24976t.m82204e(context, aweme, "slide");
                    return;
                }
                C10761a.m31399c(context, (int) R.string.e3).mo25750a();
            } else if (C25352e.m83341am(aweme)) {
                C25371n.m83433a(context, aweme, "slide");
            } else {
                C25371n.m83468b(context, aweme);
                C24976t.m82269q(context, aweme);
                C24976t.m82204e(context, aweme, "slide");
            }
        }

        /* renamed from: e */
        public final void mo64643e(Context context, Aweme aweme) {
            String str;
            C24937ai a = C24976t.m82022a();
            if (a != null) {
                a.f65768a = false;
            }
            if (RAW_AD.isRealAuthor) {
                if (C25352e.m83224g(aweme)) {
                    str = "video";
                } else {
                    str = "";
                }
                C24976t.m82251l(context, aweme, str);
                C24976t.m82214f(context, aweme, "slide");
                if (aweme.isAd() && aweme.getAwemeRawAd().getProfileWithWebview() == 1) {
                    C24976t.m82204e(context, aweme, "slide");
                }
            } else if (!C6399b.m19944t() || !RAW_AD.isDownloadMode) {
                if (RAW_AD.hasLandPage) {
                    C24976t.m82269q(context, aweme);
                    C24708ac.m81054a(context, aweme, "slide");
                } else {
                    C24976t.m82214f(context, aweme, "slide");
                }
            } else if (RAW_AD.allowJumpToGooglePlay) {
                C24976t.m82269q(context, aweme);
                C24976t.m82204e(context, aweme, "slide");
            } else {
                C24976t.m82269q(context, aweme);
            }
            if (a != null) {
                a.f65768a = true;
            }
        }

        /* renamed from: a */
        public final void mo64635a(Context context, Aweme aweme, boolean z) {
            if (z) {
                C24976t.m82271r(context, aweme);
            } else {
                C24976t.m82275s(context, aweme);
            }
        }

        /* renamed from: b */
        public final void mo64639b(Context context, Aweme aweme, int i) {
            C24976t.m82147b(context, aweme, i);
            C24411a.m80259a();
            C24411a.m80261a(context, aweme);
        }

        /* renamed from: c */
        public final void mo64641c(Context context, Aweme aweme, int i) {
            C24976t.m82147b(context, aweme, i);
            C24411a.m80259a();
            C24411a.m80261a(context, aweme);
        }

        /* renamed from: a */
        public final void mo64633a(Context context, Aweme aweme, String str) {
            if (TextUtils.isEmpty(str)) {
                str = "photo";
            }
            if (C25300bx.m83125a(aweme, 3)) {
                C25301by.m83137a(C25300bx.m83131d(aweme));
            }
            if (RAW_AD.isRealAuthor) {
                if (!C25352e.m83224g(aweme) || !FeedType.showLive(aweme.getAuthor())) {
                    C24976t.m82231h(context, aweme, str);
                }
                if (C25352e.m83225h(aweme) || C25329c.m83209K(aweme)) {
                    C24976t.m82204e(context, aweme, str);
                }
                if (aweme.isAd() && aweme.getAwemeRawAd().getProfileWithWebview() == 1) {
                    C24976t.m82204e(context, aweme, "photo");
                }
                C24976t.m82214f(context, aweme, str);
            } else if (RAW_AD.hasLandPage) {
                if (!C25352e.m83224g(aweme) || !FeedType.showLive(aweme.getAuthor())) {
                    HashMap hashMap = null;
                    if (C25329c.m83222e(aweme)) {
                        hashMap = new HashMap();
                        hashMap.put("photo_link", Integer.valueOf(1));
                    }
                    C24976t.m82154b(context, aweme, str, (Map<String, Object>) hashMap);
                }
                C24976t.m82204e(context, aweme, str);
            } else {
                C24976t.m82214f(context, aweme, str);
            }
        }

        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo64637a(android.content.Context r17, com.p280ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r18.getAwemeRawAd()
                java.lang.String r3 = r3.getType()
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                r5 = 0
                if (r4 == 0) goto L_0x0016
                return r5
            L_0x0016:
                if (r1 != 0) goto L_0x0019
                return r5
            L_0x0019:
                boolean r4 = r18.isAd()
                if (r4 != 0) goto L_0x0020
                return r5
            L_0x0020:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r18.getAwemeRawAd()
                java.lang.String r4 = r4.getOpenUrl()
                r6 = 1
                if (r2 == r6) goto L_0x002f
                r7 = 34
                if (r2 != r7) goto L_0x0054
            L_0x002f:
                com.ss.android.ugc.aweme.commercialize.feed.FeedType r7 = RAW_AD
                boolean r7 = r7.hasLandPage
                if (r7 != 0) goto L_0x0042
                com.ss.android.ugc.aweme.commercialize.feed.FeedType r7 = RAW_AD
                boolean r7 = r7.hasOpenUrl
                if (r7 == 0) goto L_0x003c
                goto L_0x0042
            L_0x003c:
                java.lang.String r7 = "title"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82214f(r0, r1, r7)
                goto L_0x0054
            L_0x0042:
                boolean r7 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r4)
                if (r7 == 0) goto L_0x004c
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82014T(r17, r18)
                goto L_0x004f
            L_0x004c:
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82229h(r17, r18)
            L_0x004f:
                java.lang.String r7 = "title"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r7)
            L_0x0054:
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                r8 = -1
                int r9 = r3.hashCode()
                r10 = 3
                r11 = 2
                switch(r9) {
                    case -1354573786: goto L_0x00a0;
                    case 96801: goto L_0x0096;
                    case 117588: goto L_0x008c;
                    case 3083120: goto L_0x0082;
                    case 3148996: goto L_0x0078;
                    case 957829685: goto L_0x006e;
                    case 1893962841: goto L_0x0064;
                    default: goto L_0x0063;
                }
            L_0x0063:
                goto L_0x00aa
            L_0x0064:
                java.lang.String r9 = "redpacket"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 6
                goto L_0x00ab
            L_0x006e:
                java.lang.String r9 = "counsel"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 0
                goto L_0x00ab
            L_0x0078:
                java.lang.String r9 = "form"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 5
                goto L_0x00ab
            L_0x0082:
                java.lang.String r9 = "dial"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 4
                goto L_0x00ab
            L_0x008c:
                java.lang.String r9 = "web"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 1
                goto L_0x00ab
            L_0x0096:
                java.lang.String r9 = "app"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 3
                goto L_0x00ab
            L_0x00a0:
                java.lang.String r9 = "coupon"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x00aa
                r3 = 2
                goto L_0x00ab
            L_0x00aa:
                r3 = -1
            L_0x00ab:
                r13 = 28
                r14 = 20
                r15 = 30
                r5 = 19
                r6 = 27
                r8 = 12
                r9 = 14
                r12 = 11
                switch(r3) {
                    case 0: goto L_0x0258;
                    case 1: goto L_0x0258;
                    case 2: goto L_0x0211;
                    case 3: goto L_0x0125;
                    case 4: goto L_0x0108;
                    case 5: goto L_0x00eb;
                    case 6: goto L_0x00c0;
                    default: goto L_0x00be;
                }
            L_0x00be:
                goto L_0x0359
            L_0x00c0:
                if (r2 != r11) goto L_0x00cc
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82019Y(r17, r18)
                java.lang.String r2 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x00cc:
                if (r2 != r10) goto L_0x00dd
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82125al(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x00dd:
                r3 = 9
                if (r2 != r3) goto L_0x0359
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82019Y(r17, r18)
                java.lang.String r2 = "redpacket"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x00eb:
                if (r2 != r11) goto L_0x00f7
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82001G(r17, r18)
                java.lang.String r2 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x00f7:
                if (r2 != r10) goto L_0x0359
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82293z(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0108:
                if (r2 != r11) goto L_0x0114
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82000F(r17, r18)
                java.lang.String r2 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x0114:
                if (r2 != r10) goto L_0x0359
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m81996B(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0125:
                boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r3 == 0) goto L_0x0152
                if (r2 != r11) goto L_0x0138
                java.lang.String r3 = "click_start"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82152b(r0, r1, r3)
                java.lang.String r3 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r3)
                goto L_0x0152
            L_0x0138:
                if (r2 != r10) goto L_0x0148
                java.lang.String r3 = "refer"
                java.lang.String r4 = "button"
                r7.put(r3, r4)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82291y(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0152
            L_0x0148:
                r3 = 8
                if (r2 != r3) goto L_0x0152
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82116ac(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82118ae(r17, r18)
            L_0x0152:
                if (r2 != r12) goto L_0x0160
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0160:
                if (r2 != r6) goto L_0x0179
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_photo"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x0179:
                if (r2 != r5) goto L_0x0187
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0187:
                if (r2 != r9) goto L_0x0195
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0195:
                if (r2 != r15) goto L_0x01ae
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_name"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x01ae:
                if (r2 == r8) goto L_0x0205
                if (r2 != r14) goto L_0x01b3
                goto L_0x0205
            L_0x01b3:
                if (r2 == r13) goto L_0x01ee
                r3 = 32
                if (r2 != r3) goto L_0x01ba
                goto L_0x01ee
            L_0x01ba:
                r3 = 13
                if (r2 == r3) goto L_0x01e2
                r3 = 15
                if (r2 != r3) goto L_0x01c3
                goto L_0x01e2
            L_0x01c3:
                r3 = 29
                if (r2 == r3) goto L_0x01cb
                r3 = 31
                if (r2 != r3) goto L_0x0359
            L_0x01cb:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_hot_region"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x01e2:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x01ee:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_title"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x0205:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0211:
                if (r2 != r11) goto L_0x021d
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m81999E(r17, r18)
                java.lang.String r2 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x021d:
                if (r2 != r10) goto L_0x022e
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m81995A(r17, r18)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x022e:
                if (r2 != r12) goto L_0x023c
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x023c:
                if (r2 != r9) goto L_0x024a
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x024a:
                if (r2 != r8) goto L_0x0359
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0258:
                if (r2 != r11) goto L_0x026e
                boolean r2 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r4)
                if (r2 == 0) goto L_0x0264
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82007M(r17, r18)
                goto L_0x0267
            L_0x0264:
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m81998D(r17, r18)
            L_0x0267:
                java.lang.String r2 = "button"
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
                goto L_0x0359
            L_0x026e:
                if (r2 != r10) goto L_0x0289
                boolean r2 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r4)
                if (r2 == 0) goto L_0x027a
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82008N(r17, r18)
                goto L_0x027d
            L_0x027a:
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82293z(r17, r18)
            L_0x027d:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "button"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0289:
                r3 = 26
                if (r2 != r3) goto L_0x02a4
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_more_button"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x02a4:
                if (r2 != r12) goto L_0x02b2
                java.lang.String r2 = "refer"
                java.lang.String r3 = "photo"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x02b2:
                if (r2 != r6) goto L_0x02cb
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_photo"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x02cb:
                if (r2 != r5) goto L_0x02d9
                java.lang.String r2 = "refer"
                java.lang.String r3 = "image"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x02d9:
                if (r2 != r9) goto L_0x02e7
                java.lang.String r2 = "refer"
                java.lang.String r3 = "name"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x02e7:
                if (r2 != r15) goto L_0x02ff
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_name"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x02ff:
                if (r2 == r8) goto L_0x034f
                if (r2 != r14) goto L_0x0304
                goto L_0x034f
            L_0x0304:
                if (r2 == r13) goto L_0x0339
                r3 = 32
                if (r2 != r3) goto L_0x030b
                goto L_0x0339
            L_0x030b:
                r3 = 13
                if (r2 == r3) goto L_0x032e
                r3 = 21
                if (r2 != r3) goto L_0x0314
                goto L_0x032e
            L_0x0314:
                r3 = 29
                if (r2 != r3) goto L_0x0359
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_hot_region"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x032e:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "hot_region"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
                goto L_0x0359
            L_0x0339:
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
                java.lang.String r2 = r2.getCreativeIdStr()
                java.lang.String r3 = "bg_title"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r18.getAwemeRawAd()
                java.lang.String r1 = r1.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82244j(r0, r2, r3, r1)
                goto L_0x0359
            L_0x034f:
                java.lang.String r2 = "refer"
                java.lang.String r3 = "title"
                r7.put(r2, r3)
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82155b(r0, r1, r7)
            L_0x0359:
                com.ss.android.ugc.aweme.commercialize.feed.FeedType r0 = RAW_AD
                boolean r0 = r0.isRealAuthor
                if (r0 != 0) goto L_0x0367
                com.ss.android.ugc.aweme.commercialize.feed.FeedType r0 = RAW_AD
                boolean r0 = r0.hasLandPage
                if (r0 == 0) goto L_0x0367
                r0 = 1
                return r0
            L_0x0367:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.feed.FeedType.C247001.mo64637a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
        }

        /* renamed from: a */
        public final void mo64631a(Context context, Aweme aweme, long j, int i) {
            int i2;
            if (C24935ah.m81791a(aweme)) {
                Video a = C32752l.f85394b.mo84248a(aweme);
                if (a != null) {
                    i2 = a.getDuration();
                } else {
                    i2 = 0;
                }
                C24976t.m82193d(context, aweme, j + C24935ah.m81792c(), i2);
                C24935ah.m81794e();
                return;
            }
            C24976t.m82048a(context, aweme, j, i);
        }

        /* renamed from: a */
        public final void mo64634a(Context context, Aweme aweme, String str, long j, int i) {
            logBreak(context, aweme, str, j, i);
        }

        /* renamed from: a */
        public final void mo64632a(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    },
    NONE {
        /* renamed from: a */
        public final void mo64630a(Context context, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo64631a(Context context, Aweme aweme, long j, int i) {
        }

        /* renamed from: a */
        public final void mo64633a(Context context, Aweme aweme, String str) {
        }

        /* renamed from: a */
        public final void mo64634a(Context context, Aweme aweme, String str, long j, int i) {
        }

        /* renamed from: a */
        public final void mo64635a(Context context, Aweme aweme, boolean z) {
        }

        /* renamed from: a */
        public final boolean mo64636a() {
            return false;
        }

        /* renamed from: a */
        public final boolean mo64637a(Context context, Aweme aweme, int i) {
            return false;
        }

        /* renamed from: b */
        public final void mo64638b(Context context, Aweme aweme) {
        }

        /* renamed from: b */
        public final void mo64639b(Context context, Aweme aweme, int i) {
        }

        /* renamed from: c */
        public final void mo64640c(Context context, Aweme aweme) {
        }

        /* renamed from: c */
        public final void mo64641c(Context context, Aweme aweme, int i) {
        }

        /* renamed from: d */
        public final void mo64642d(Context context, Aweme aweme) {
        }

        /* renamed from: e */
        public final void mo64643e(Context context, Aweme aweme) {
        }

        /* renamed from: f */
        public final void mo64644f(Context context, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo64632a(Context context, Aweme aweme, Aweme aweme2, String str, long j, int i) {
            if (str != null && aweme2 != null) {
                if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    logBreak(context, aweme2, str, j, i);
                }
            }
        }
    };
    
    public boolean allowJumpToGooglePlay;
    private boolean enableComment;
    public boolean hasLandPage;
    private boolean hasMpUrl;
    public boolean hasOpenUrl;
    public boolean isDownloadMode;
    public boolean isRealAuthor;
    private boolean isWebMode;

    public void clickAvatar(Context context, Aweme aweme) {
        C24727i.m81205a(this, context, aweme);
    }

    public boolean enableComment() {
        return this.enableComment;
    }

    public boolean isDownloadMode() {
        return this.isDownloadMode;
    }

    public boolean isRealAuthor() {
        return this.isRealAuthor;
    }

    public boolean hasLandPage() {
        if (!mo64636a() || !this.hasLandPage) {
            return false;
        }
        return true;
    }

    public boolean hasMpUrl() {
        if (!mo64636a() || !this.hasMpUrl) {
            return false;
        }
        return true;
    }

    public boolean hasOpenUrl() {
        if (!mo64636a() || !this.hasOpenUrl) {
            return false;
        }
        return true;
    }

    public static boolean showLive(User user) {
        if (user == null || !user.isLive() || !C41983b.m133444a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public boolean isVast(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !RAW_AD.isWebMode || RAW_AD.isRealAuthor) {
            return false;
        }
        if ((C25301by.m83156e(aweme) || C25301by.m83157f(aweme)) && !TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl())) {
            return true;
        }
        return false;
    }

    public static FeedType valueOf(Aweme aweme) {
        boolean z;
        boolean z2 = false;
        if (!aweme.isAd() || aweme.getAwemeRawAd() == null) {
            NONE.hasLandPage = false;
            FeedType feedType = NONE;
            if (aweme.getAuthor() == null || aweme.getAuthor().isAdFake()) {
                z = false;
            } else {
                z = true;
            }
            feedType.isRealAuthor = z;
            NONE.enableComment = !aweme.isCmtSwt();
            NONE.hasOpenUrl = false;
            NONE.hasMpUrl = false;
            NONE.isDownloadMode = false;
            NONE.isWebMode = false;
            NONE.allowJumpToGooglePlay = false;
            return NONE;
        }
        RAW_AD.hasLandPage = !TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl());
        FeedType feedType2 = RAW_AD;
        if (aweme.getAuthor() != null && !aweme.getAuthor().isAdFake()) {
            z2 = true;
        }
        feedType2.isRealAuthor = z2;
        RAW_AD.enableComment = !aweme.isCmtSwt();
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        RAW_AD.hasOpenUrl = C25371n.m83473b(openUrl);
        RAW_AD.hasMpUrl = true ^ TextUtils.isEmpty(microAppUrl);
        RAW_AD.isDownloadMode = TextUtils.equals(aweme.getAwemeRawAd().getType(), "app");
        RAW_AD.isWebMode = TextUtils.equals(aweme.getAwemeRawAd().getType(), "web");
        RAW_AD.allowJumpToGooglePlay = aweme.getAwemeRawAd().allowJumpToPlayStore();
        return RAW_AD;
    }

    private void logLongVideoBreakOrOver(Context context, Aweme aweme, long j) {
        int i;
        Video a = C32752l.f85394b.mo84248a(aweme);
        if (a != null) {
            i = a.getDuration();
        } else {
            i = 0;
        }
        if (C24935ah.m81793d()) {
            C24976t.m82193d(context, aweme, j + C24935ah.m81792c(), i);
        } else {
            C24976t.m82179c(context, aweme, j + C24935ah.m81792c(), i);
        }
        C24935ah.m81794e();
    }

    public void logBreak(Context context, Aweme aweme, String str, long j, int i) {
        if (aweme != null && TextUtils.equals(str, aweme.getAid()) && aweme.isAd()) {
            if (C24935ah.m81791a(aweme)) {
                logLongVideoBreakOrOver(context, aweme, j);
                return;
            }
            C24976t.m82149b(context, aweme, j, i);
        }
    }
}
