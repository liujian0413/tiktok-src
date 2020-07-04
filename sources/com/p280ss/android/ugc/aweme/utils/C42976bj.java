package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.UserHeaderData;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.bj */
public final class C42976bj {

    /* renamed from: a */
    public static final C42977a f111534a = new C42977a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.bj$a */
    public static final class C42977a {
        private C42977a() {
        }

        public /* synthetic */ C42977a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final int mo104685a(UserHeaderData userHeaderData) {
            C7573i.m23587b(userHeaderData, "userHeaderData");
            if (TextUtils.equals(userHeaderData.getmPreviousPagePosition(), "card_head") || TextUtils.equals(userHeaderData.getmPreviousPagePosition(), "recommend_card")) {
                return 12;
            }
            if (TextUtils.equals(userHeaderData.getmPreviousPagePosition(), "face_to_face")) {
                return 201901;
            }
            if (!userHeaderData.isFromFeed() || !TextUtils.equals(userHeaderData.getmEventType(), "homepage_follow")) {
                return m136443a(userHeaderData.getmEventType());
            }
            return 13;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if (r1.equals("search_result") != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
            if (r1.equals("discovery_recommend") != false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
            if (r1.equals("general_search") != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
            if (r1.equals("message") != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
            if (r1.equals("poi_page") != false) goto L_0x00e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
            if (r1.equals("categorized_city_poi") != false) goto L_0x00e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
            if (r1.equals("chat") != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x009d, code lost:
            return 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
            if (r1.equals("discovery") != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
            if (r1.equals("find_friends") != false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
            if (r1.equals("search_sug") != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c6, code lost:
            return 14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e3, code lost:
            if (r1.equals("homepage_fresh") != false) goto L_0x00e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e7, code lost:
            return 15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
            if (r1.equals("follow_rec") != false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f2, code lost:
            return 12;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m136443a(java.lang.String r1) {
            /*
                if (r1 != 0) goto L_0x0004
                goto L_0x00f3
            L_0x0004:
                int r0 = r1.hashCode()
                switch(r0) {
                    case -2026708222: goto L_0x00e8;
                    case -1842036323: goto L_0x00dd;
                    case -1286505224: goto L_0x00d3;
                    case -1165154881: goto L_0x00c7;
                    case -710131922: goto L_0x00bc;
                    case -612351174: goto L_0x00b2;
                    case -182649969: goto L_0x00a7;
                    case -121207376: goto L_0x009e;
                    case 3052376: goto L_0x0093;
                    case 3135424: goto L_0x0088;
                    case 3322092: goto L_0x007d;
                    case 3524221: goto L_0x0072;
                    case 110541305: goto L_0x0068;
                    case 215764042: goto L_0x005e;
                    case 452151140: goto L_0x0054;
                    case 954925063: goto L_0x004b;
                    case 998835423: goto L_0x0041;
                    case 1234580717: goto L_0x0037;
                    case 1425879700: goto L_0x002d;
                    case 1605556258: goto L_0x0022;
                    case 1691937916: goto L_0x0017;
                    case 1839865103: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                goto L_0x00f3
            L_0x000d:
                java.lang.String r0 = "find_friends"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00f0
            L_0x0017:
                java.lang.String r0 = "homepage_hot"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 13
                return r1
            L_0x0022:
                java.lang.String r0 = "other_following"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 10
                return r1
            L_0x002d:
                java.lang.String r0 = "search_result"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00c4
            L_0x0037:
                java.lang.String r0 = "discovery_recommend"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00f0
            L_0x0041:
                java.lang.String r0 = "general_search"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00c4
            L_0x004b:
                java.lang.String r0 = "message"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x009b
            L_0x0054:
                java.lang.String r0 = "poi_page"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00e5
            L_0x005e:
                java.lang.String r0 = "categorized_city_poi"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00e5
            L_0x0068:
                java.lang.String r0 = "token"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 6
                return r1
            L_0x0072:
                java.lang.String r0 = "scan"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 17
                return r1
            L_0x007d:
                java.lang.String r0 = "live"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 16
                return r1
            L_0x0088:
                java.lang.String r0 = "fans"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 9
                return r1
            L_0x0093:
                java.lang.String r0 = "chat"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
            L_0x009b:
                r1 = 8
                return r1
            L_0x009e:
                java.lang.String r0 = "discovery"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                goto L_0x00c4
            L_0x00a7:
                java.lang.String r0 = "other_fans"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 11
                return r1
            L_0x00b2:
                java.lang.String r0 = "phone_number"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 4
                return r1
            L_0x00bc:
                java.lang.String r0 = "search_sug"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
            L_0x00c4:
                r1 = 14
                return r1
            L_0x00c7:
                java.lang.String r0 = "face_to_face"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 201901(0x314ad, float:2.82924E-40)
                return r1
            L_0x00d3:
                java.lang.String r0 = "message_fans"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
                r1 = 7
                return r1
            L_0x00dd:
                java.lang.String r0 = "homepage_fresh"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
            L_0x00e5:
                r1 = 15
                return r1
            L_0x00e8:
                java.lang.String r0 = "follow_rec"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x00f3
            L_0x00f0:
                r1 = 12
                return r1
            L_0x00f3:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42976bj.C42977a.m136443a(java.lang.String):int");
        }

        /* renamed from: a */
        public static int m136444a(String str, RelationDynamicLabel relationDynamicLabel) {
            if (TextUtils.equals(str, "homepage_hot")) {
                if (relationDynamicLabel == null || relationDynamicLabel.getType() != 5) {
                    return 13;
                }
                return 20;
            } else if (relationDynamicLabel == null || relationDynamicLabel.getType() != 5) {
                return 18;
            } else {
                return 20;
            }
        }
    }

    /* renamed from: a */
    public static final int m136440a(UserHeaderData userHeaderData) {
        return f111534a.mo104685a(userHeaderData);
    }

    /* renamed from: a */
    public static final int m136441a(String str) {
        return C42977a.m136443a(str);
    }

    /* renamed from: a */
    public static final int m136442a(String str, RelationDynamicLabel relationDynamicLabel) {
        return C42977a.m136444a(str, relationDynamicLabel);
    }
}
