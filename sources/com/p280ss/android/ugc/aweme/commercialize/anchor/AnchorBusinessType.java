package com.p280ss.android.ugc.aweme.commercialize.anchor;

import com.p280ss.android.ugc.aweme.anchor.p1007a.C22520a;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22522b;
import com.p280ss.android.ugc.aweme.anchor.p1007a.C22523c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType */
public enum AnchorBusinessType {
    NO_TYPE(-1),
    WIKIPEDIA(0),
    WIKIHOW(1),
    POI(2),
    SHOP(3),
    ARTICLE(5),
    ANCHOR_SHOP_LINK(6),
    SEEDING(7),
    YELP(8),
    TRIP_ADVISOR(9),
    MEDIUM(11),
    UG(12),
    COUPON(13),
    MICRO_GAME(14);
    
    private final int TYPE;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType$a */
    static final class C24513a extends AnchorBusinessType {
        public final int searchHint() {
            return R.string.a9s;
        }

        public final int title() {
            return R.string.a_8;
        }

        public final C22523c adapterFactory() {
            return new C22520a();
        }

        C24513a(String str, int i) {
            super(str, 11, 10, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType$b */
    static final class C24514b extends AnchorBusinessType {
        public final int searchHint() {
            return R.string.a9s;
        }

        public final int title() {
            return R.string.a_8;
        }

        public final C22523c adapterFactory() {
            return new C22522b();
        }

        C24514b(String str, int i) {
            super(str, 5, 4, null);
        }
    }

    public C22523c adapterFactory() {
        return null;
    }

    public final int getTYPE() {
        return this.TYPE;
    }

    public int searchHint() {
        return R.string.a_0;
    }

    public int title() {
        return R.string.a_7;
    }

    private AnchorBusinessType(int i) {
        this.TYPE = i;
    }
}
