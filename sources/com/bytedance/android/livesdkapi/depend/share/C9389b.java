package com.bytedance.android.livesdkapi.depend.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.depend.share.b */
public final class C9389b {

    /* renamed from: A */
    public long f25814A;

    /* renamed from: B */
    public List<ReportReason> f25815B;

    /* renamed from: C */
    public Room f25816C;

    /* renamed from: D */
    private DouPlusEntry f25817D;

    /* renamed from: a */
    public String f25818a;

    /* renamed from: b */
    public long f25819b;

    /* renamed from: c */
    public long f25820c;

    /* renamed from: d */
    public long f25821d;

    /* renamed from: e */
    public String f25822e;

    /* renamed from: f */
    public String f25823f;

    /* renamed from: g */
    public long f25824g;

    /* renamed from: h */
    public String f25825h;

    /* renamed from: i */
    public ImageModel f25826i;

    /* renamed from: j */
    public ImageModel f25827j;

    /* renamed from: k */
    public ImageModel f25828k;

    /* renamed from: l */
    public ImageModel f25829l;

    /* renamed from: m */
    public String f25830m;

    /* renamed from: n */
    public String f25831n;

    /* renamed from: o */
    public String f25832o;

    /* renamed from: p */
    public String f25833p;

    /* renamed from: q */
    public String f25834q;

    /* renamed from: r */
    public String f25835r;

    /* renamed from: s */
    public boolean f25836s;

    /* renamed from: t */
    public String f25837t;

    /* renamed from: u */
    public String f25838u;

    /* renamed from: v */
    public String f25839v;

    /* renamed from: w */
    public String f25840w;

    /* renamed from: x */
    public boolean f25841x;

    /* renamed from: y */
    public Map<String, String> f25842y;

    /* renamed from: z */
    public long f25843z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.share.b$a */
    public static final class C9391a {

        /* renamed from: A */
        public Room f25844A;

        /* renamed from: B */
        public Map<String, String> f25845B;

        /* renamed from: C */
        public String f25846C;

        /* renamed from: D */
        public boolean f25847D;

        /* renamed from: a */
        public String f25848a;

        /* renamed from: b */
        public long f25849b;

        /* renamed from: c */
        public long f25850c;

        /* renamed from: d */
        public String f25851d;

        /* renamed from: e */
        public long f25852e;

        /* renamed from: f */
        public long f25853f;

        /* renamed from: g */
        public String f25854g;

        /* renamed from: h */
        public String f25855h;

        /* renamed from: i */
        public ImageModel f25856i;

        /* renamed from: j */
        public ImageModel f25857j;

        /* renamed from: k */
        public ImageModel f25858k;

        /* renamed from: l */
        public ImageModel f25859l;

        /* renamed from: m */
        public String f25860m;

        /* renamed from: n */
        public String f25861n;

        /* renamed from: o */
        public String f25862o;

        /* renamed from: p */
        public String f25863p;

        /* renamed from: q */
        public String f25864q;

        /* renamed from: r */
        public String f25865r;

        /* renamed from: s */
        public boolean f25866s;

        /* renamed from: t */
        public String f25867t;

        /* renamed from: u */
        public String f25868u;

        /* renamed from: v */
        public long f25869v;

        /* renamed from: w */
        public long f25870w;

        /* renamed from: x */
        public DouPlusEntry f25871x;

        /* renamed from: y */
        public String f25872y;

        /* renamed from: z */
        public List<ReportReason> f25873z;

        /* renamed from: b */
        public final C9391a mo23103b() {
            this.f25847D = true;
            return this;
        }

        private C9391a() {
            this.f25861n = "";
            this.f25862o = "";
            this.f25863p = "";
            this.f25864q = "";
            this.f25865r = "";
        }

        /* renamed from: a */
        public final C9389b mo23102a() {
            return new C9389b(this);
        }

        /* renamed from: a */
        public final C9391a mo23097a(long j) {
            this.f25852e = j;
            return this;
        }

        /* renamed from: c */
        public final C9391a mo23105c(String str) {
            this.f25864q = str;
            return this;
        }

        /* renamed from: d */
        public final C9391a mo23106d(String str) {
            this.f25861n = str;
            return this;
        }

        /* renamed from: e */
        public final C9391a mo23107e(String str) {
            this.f25868u = str;
            return this;
        }

        /* renamed from: f */
        public final C9391a mo23108f(String str) {
            this.f25848a = str;
            return this;
        }

        /* renamed from: a */
        public final C9391a mo23098a(DouPlusEntry douPlusEntry) {
            this.f25871x = douPlusEntry;
            return this;
        }

        /* renamed from: b */
        public final C9391a mo23104b(String str) {
            this.f25863p = str;
            return this;
        }

        /* renamed from: a */
        public final C9391a mo23099a(String str) {
            this.f25862o = str;
            return this;
        }

        /* renamed from: a */
        public final C9391a mo23100a(Map<String, String> map) {
            this.f25845B = map;
            return this;
        }

        /* renamed from: a */
        public final C9391a mo23101a(boolean z) {
            this.f25866s = z;
            return this;
        }

        private C9391a(Room room) {
            this.f25861n = "";
            this.f25862o = "";
            this.f25863p = "";
            this.f25864q = "";
            this.f25865r = "";
            this.f25849b = room.getId();
            this.f25859l = room.getCover();
            this.f25867t = room.getRequestId();
            this.f25861n = room.getShareUrl();
            this.f25862o = room.getTitle();
            this.f25844A = room;
            User owner = room.getOwner();
            if (owner != null) {
                this.f25850c = owner.getId();
                this.f25855h = owner.getIdStr();
                this.f25851d = owner.getEncryptedId();
                this.f25853f = owner.getShortId();
                this.f25856i = owner.getAvatarThumb();
                this.f25857j = owner.getAvatarMedium();
                this.f25858k = owner.getAvatarLarge();
                this.f25860m = owner.getNickName();
                this.f25854g = owner.displayId;
                this.f25872y = owner.getSecUid();
            }
        }

        private C9391a(long j, long j2) {
            this.f25861n = "";
            this.f25862o = "";
            this.f25863p = "";
            this.f25864q = "";
            this.f25865r = "";
            this.f25869v = j;
            this.f25870w = j2;
        }
    }

    /* renamed from: a */
    public static C9391a m27846a() {
        return new C9391a();
    }

    /* renamed from: a */
    public static C9391a m27848a(Room room) {
        return new C9391a(room);
    }

    private C9389b(C9391a aVar) {
        this.f25818a = aVar.f25848a;
        this.f25832o = aVar.f25862o;
        this.f25833p = aVar.f25863p;
        this.f25834q = aVar.f25864q;
        this.f25831n = aVar.f25861n;
        this.f25835r = aVar.f25865r;
        this.f25820c = aVar.f25849b;
        this.f25821d = aVar.f25850c;
        this.f25819b = aVar.f25852e;
        this.f25822e = aVar.f25855h;
        this.f25824g = aVar.f25853f;
        this.f25826i = aVar.f25856i;
        this.f25827j = aVar.f25857j;
        this.f25828k = aVar.f25858k;
        this.f25829l = aVar.f25859l;
        this.f25830m = aVar.f25860m;
        this.f25836s = aVar.f25866s;
        this.f25837t = aVar.f25867t;
        this.f25838u = aVar.f25868u;
        this.f25815B = aVar.f25873z;
        this.f25816C = aVar.f25844A;
        this.f25842y = aVar.f25845B;
        this.f25825h = aVar.f25854g;
        this.f25839v = aVar.f25846C;
        this.f25843z = aVar.f25869v;
        this.f25814A = aVar.f25870w;
        this.f25823f = aVar.f25851d;
        this.f25817D = aVar.f25871x;
        this.f25840w = aVar.f25872y;
        this.f25841x = aVar.f25847D;
    }

    /* renamed from: a */
    public static C9391a m27847a(long j, long j2) {
        C9391a aVar = new C9391a(j, j2);
        return aVar;
    }
}
