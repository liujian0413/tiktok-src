package com.p280ss.android.ugc.aweme.discover.mob;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.t */
public interface C26799t {

    /* renamed from: a */
    public static final C26800a f70726a = C26800a.f70727a;

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.t$a */
    public static final class C26800a {

        /* renamed from: a */
        static final /* synthetic */ C26800a f70727a = new C26800a();

        private C26800a() {
        }

        /* renamed from: a */
        public static int m87997a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 111178:
                        if (str.equals("poi")) {
                            return 5;
                        }
                        break;
                    case 114586:
                        if (str.equals("tag")) {
                            return 2;
                        }
                        break;
                    case 3599307:
                        if (str.equals("user")) {
                            return 0;
                        }
                        break;
                    case 104263205:
                        if (str.equals("music")) {
                            return 1;
                        }
                        break;
                    case 112202875:
                        if (str.equals("video")) {
                            return 4;
                        }
                        break;
                    case 998835423:
                        if (str.equals("general_search")) {
                            return 3;
                        }
                        break;
                    case 1528280640:
                        if (str.equals("ecommerce")) {
                            return 7;
                        }
                        break;
                }
            }
            return -1;
        }
    }
}
