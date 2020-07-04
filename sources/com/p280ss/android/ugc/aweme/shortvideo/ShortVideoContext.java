package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.google.gson.C6607f;
import com.google.gson.C6711m;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p280ss.android.ugc.aweme.filter.StrArray;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p280ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38559f;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38565k;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContext */
public class ShortVideoContext implements Parcelable {
    public static final Creator<ShortVideoContext> CREATOR = new Creator<ShortVideoContext>() {
        /* renamed from: a */
        private static ShortVideoContext[] m122707a(int i) {
            return new ShortVideoContext[i];
        }

        /* renamed from: a */
        private static ShortVideoContext m122706a(Parcel parcel) {
            return new ShortVideoContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122706a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122707a(i);
        }
    };

    /* renamed from: A */
    public AVETParameter f99696A;

    /* renamed from: B */
    public User f99697B;

    /* renamed from: C */
    public String f99698C;

    /* renamed from: D */
    public String f99699D;

    /* renamed from: E */
    public String f99700E;

    /* renamed from: F */
    public String f99701F;

    /* renamed from: G */
    public int f99702G;

    /* renamed from: H */
    public int f99703H;

    /* renamed from: I */
    public String f99704I;

    /* renamed from: J */
    public ReactionParams f99705J;

    /* renamed from: K */
    public boolean f99706K;

    /* renamed from: L */
    public List<EmbaddedWindowInfo> f99707L;

    /* renamed from: M */
    public boolean f99708M;

    /* renamed from: N */
    public String f99709N;

    /* renamed from: O */
    public List<AVTextExtraStruct> f99710O;

    /* renamed from: P */
    public int f99711P;

    /* renamed from: Q */
    public boolean f99712Q;

    /* renamed from: R */
    public String f99713R;

    /* renamed from: S */
    public boolean f99714S;

    /* renamed from: T */
    public String f99715T;

    /* renamed from: U */
    public ArrayList<String> f99716U;

    /* renamed from: V */
    public String f99717V;

    /* renamed from: W */
    public String f99718W;

    /* renamed from: X */
    public int f99719X;

    /* renamed from: Y */
    public StrArray f99720Y;

    /* renamed from: Z */
    public StrArray f99721Z;

    /* renamed from: a */
    public int f99722a;

    /* renamed from: aA */
    public String f99723aA;

    /* renamed from: aB */
    public StoryFestivalModel f99724aB;

    /* renamed from: aC */
    public ExtraMentionUserModel f99725aC;

    /* renamed from: aD */
    public UrlModel f99726aD;

    /* renamed from: aE */
    public ArrayList<String> f99727aE;

    /* renamed from: aF */
    public ArrayList<String> f99728aF;

    /* renamed from: aG */
    public AVUploadMiscInfoStruct f99729aG;

    /* renamed from: aH */
    public DraftEditTransferModel f99730aH;

    /* renamed from: aI */
    public ClientCherEffectParam f99731aI;

    /* renamed from: aJ */
    public AVMusicWaveBean f99732aJ;

    /* renamed from: aK */
    public ArrayList<Integer> f99733aK;

    /* renamed from: aL */
    public ArrayList<String> f99734aL;

    /* renamed from: aM */
    public int f99735aM;

    /* renamed from: aN */
    public float f99736aN;

    /* renamed from: aO */
    public int f99737aO;

    /* renamed from: aP */
    public ArrayList<String> f99738aP;

    /* renamed from: aQ */
    private ShortVideoSegments f99739aQ;

    /* renamed from: aa */
    public StrArray f99740aa;

    /* renamed from: ab */
    public StrArray f99741ab;

    /* renamed from: ac */
    public StrArray f99742ac;

    /* renamed from: ad */
    public StrArray f99743ad;

    /* renamed from: ae */
    public boolean f99744ae;

    /* renamed from: af */
    public boolean f99745af;

    /* renamed from: ag */
    public boolean f99746ag;

    /* renamed from: ah */
    public boolean f99747ah;

    /* renamed from: ai */
    public ExtractFramesModel f99748ai;

    /* renamed from: aj */
    public long f99749aj;

    /* renamed from: ak */
    public long f99750ak;

    /* renamed from: al */
    public int f99751al;

    /* renamed from: am */
    public int f99752am;

    /* renamed from: an */
    public GameDuetResource f99753an;

    /* renamed from: ao */
    public String f99754ao;

    /* renamed from: ap */
    public String f99755ap;

    /* renamed from: aq */
    public String f99756aq;

    /* renamed from: ar */
    public String f99757ar;

    /* renamed from: as */
    public String f99758as;

    /* renamed from: at */
    public String f99759at;

    /* renamed from: au */
    public String f99760au;

    /* renamed from: av */
    public String f99761av;

    /* renamed from: aw */
    public MicroAppModel f99762aw;

    /* renamed from: ax */
    public boolean f99763ax;

    /* renamed from: ay */
    public boolean f99764ay;

    /* renamed from: az */
    public boolean f99765az;

    /* renamed from: b */
    public final int f99766b;

    /* renamed from: c */
    public long f99767c;

    /* renamed from: d */
    public UrlModel f99768d;

    /* renamed from: e */
    public String f99769e;

    /* renamed from: f */
    public int f99770f;

    /* renamed from: g */
    public int f99771g;

    /* renamed from: h */
    public String f99772h;

    /* renamed from: i */
    public int f99773i;

    /* renamed from: j */
    public int f99774j;

    /* renamed from: k */
    public Workspace f99775k;

    /* renamed from: l */
    public ShortVideoSegments f99776l;

    /* renamed from: m */
    public long f99777m;

    /* renamed from: n */
    public long f99778n;

    /* renamed from: o */
    public boolean f99779o;

    /* renamed from: p */
    public long f99780p;

    /* renamed from: q */
    public RetakeVideoContext f99781q;

    /* renamed from: r */
    public BackgroundVideo f99782r;

    /* renamed from: s */
    public int f99783s;

    /* renamed from: t */
    public boolean f99784t;

    /* renamed from: u */
    public int f99785u;

    /* renamed from: v */
    public Map<String, Object> f99786v;

    /* renamed from: w */
    public String f99787w;

    /* renamed from: x */
    public String f99788x;

    /* renamed from: y */
    public String f99789y;

    /* renamed from: z */
    public int f99790z;

    /* renamed from: b */
    public final void mo96140b() {
        this.f99747ah = true;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final AVETParameter mo96148i() {
        if (this.f99696A == null) {
            this.f99696A = new AVETParameter();
        }
        return this.f99696A;
    }

    /* renamed from: k */
    public final long mo96150k() {
        if (this.f99779o) {
            return this.f99778n;
        }
        return this.f99777m;
    }

    /* renamed from: m */
    public final ShortVideoSegments mo96152m() {
        if (this.f99779o) {
            return this.f99739aQ;
        }
        return this.f99776l;
    }

    /* renamed from: p */
    public final long mo96155p() {
        if (this.f99779o) {
            return this.f99780p;
        }
        return this.f99767c;
    }

    /* renamed from: c */
    public final boolean mo96141c() {
        if (this.f99775k.mo96317e() == null || mo96142d() || mo96144e()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo96142d() {
        if (C6319n.m19593a(this.f99700E) || C6319n.m19593a(this.f99701F)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo96144e() {
        if (this.f99705J == null || C6319n.m19593a(this.f99705J.videoPath) || C6319n.m19593a(this.f99705J.wavPath)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo96145f() {
        if (this.f99707L.size() > 0) {
            this.f99707L.remove(this.f99707L.size() - 1);
        }
    }

    /* renamed from: h */
    public final void mo96147h() {
        if (this.f99733aK.size() > 0) {
            this.f99733aK.remove(this.f99733aK.size() - 1);
        }
    }

    /* renamed from: j */
    public final String mo96149j() {
        if (mo96141c()) {
            return this.f99775k.mo96317e().getPath();
        }
        return null;
    }

    /* renamed from: l */
    public final long mo96151l() {
        if (this.f99779o) {
            return this.f99781q.f99688b + ((long) this.f99770f);
        }
        return (long) this.f99770f;
    }

    /* renamed from: n */
    public final TimeSpeedModelExtension mo96153n() {
        ShortVideoSegments m = mo96152m();
        if (m.isEmpty()) {
            return null;
        }
        return (TimeSpeedModelExtension) m.get(m.size() - 1);
    }

    /* renamed from: q */
    public final String mo96156q() {
        String j = mo96149j();
        if (j != null) {
            return j;
        }
        if (this.f99701F != null) {
            return this.f99701F;
        }
        if (this.f99705J != null) {
            return this.f99705J.wavPath;
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo96157r() {
        Iterator it = this.f99776l.iterator();
        while (it.hasNext()) {
            if (((TimeSpeedModelExtension) it.next()).getBackgroundVideo() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo96146g() {
        String str;
        this.f99772h = null;
        if (mo96142d()) {
            str = this.f99701F;
        } else if (mo96144e()) {
            str = this.f99705J.wavPath;
        } else {
            str = null;
        }
        this.f99769e = str;
        if (!TextUtils.isEmpty(this.f99769e)) {
            this.f99775k.mo96312a(new File(this.f99769e));
        } else {
            this.f99775k.mo96318f();
        }
        m122683a(this);
        this.f99771g = (int) this.f99767c;
        this.f99768d = null;
    }

    /* renamed from: o */
    public final ShortVideoSegments mo96154o() {
        if (!this.f99779o || C6311g.m19573a(this.f99739aQ)) {
            return this.f99776l;
        }
        ShortVideoSegments shortVideoSegments = new ShortVideoSegments(this.f99776l);
        shortVideoSegments.remove(this.f99781q.f99689c);
        shortVideoSegments.addAll(this.f99781q.f99689c, this.f99739aQ);
        return shortVideoSegments;
    }

    /* renamed from: a */
    public final boolean mo96139a() {
        if (!this.f99746ag || this.f99747ah) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ArrayList<TimeSpeedModelExtension> m122682a(String str) {
        try {
            return m122684b(str);
        } catch (Exception unused) {
            return m122685c(str);
        }
    }

    /* renamed from: a */
    public final void mo96137a(int i) {
        this.f99733aK.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static String m122681a(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TimeSpeedModelExtension) it.next()).toJson());
        }
        return new C6607f().mo15988b().mo15992f().mo15979b((Object) arrayList2);
    }

    /* renamed from: b */
    private static ArrayList<TimeSpeedModelExtension> m122684b(String str) {
        ArrayList arrayList = (ArrayList) C35574k.m114859a().mo70085S().mo15975a(str, new C6597a<ArrayList<C6711m>>() {
        }.type);
        ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(TimeSpeedModelExtension.fromJson((C6711m) it.next()));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m122683a(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext.mo96142d()) {
            shortVideoContext.f99767c = new C38559f().mo96550a(shortVideoContext.f99701F, shortVideoContext.f99700E);
        } else if (shortVideoContext.mo96144e()) {
            shortVideoContext.f99767c = new C38559f().mo96550a(shortVideoContext.f99705J.wavPath, shortVideoContext.f99705J.videoPath);
        } else {
            new C38565k();
            if (shortVideoContext.mo96141c()) {
                str = shortVideoContext.f99775k.mo96317e().getPath();
            } else {
                str = null;
            }
            shortVideoContext.f99767c = C38565k.m123250a(str);
        }
        StringBuilder sb = new StringBuilder("maxduration is ");
        sb.append(shortVideoContext.f99767c);
        C41530am.m132285d(sb.toString());
    }

    /* renamed from: c */
    private static ArrayList<TimeSpeedModelExtension> m122685c(String str) {
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split("\\$");
        if (split.length > 0) {
            for (String split2 : split) {
                String[] split3 = split2.split(",");
                if (split3.length == 2) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), null, null, null);
                        arrayList.add(timeSpeedModelExtension);
                    } catch (Exception unused) {
                    }
                }
                if (split3.length == 3) {
                    try {
                        TimeSpeedModelExtension timeSpeedModelExtension2 = new TimeSpeedModelExtension(Integer.parseInt(split3[0]), (double) Float.parseFloat(split3[1]), split3[2], null, null);
                        arrayList.add(timeSpeedModelExtension2);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    ShortVideoContext(int i) {
        this.f99776l = new ShortVideoSegments();
        this.f99739aQ = new ShortVideoSegments();
        this.f99707L = new ArrayList();
        this.f99708M = false;
        this.f99716U = new ArrayList<>();
        this.f99720Y = new StrArray();
        this.f99721Z = new StrArray();
        this.f99740aa = new StrArray();
        this.f99741ab = new StrArray();
        this.f99742ac = new StrArray();
        this.f99743ad = new StrArray();
        this.f99744ae = true;
        this.f99745af = true;
        this.f99746ag = false;
        this.f99747ah = false;
        this.f99749aj = 0;
        this.f99750ak = 0;
        this.f99761av = "";
        this.f99727aE = new ArrayList<>();
        this.f99728aF = new ArrayList<>();
        this.f99729aG = new AVUploadMiscInfoStruct();
        this.f99732aJ = null;
        this.f99733aK = new ArrayList<>();
        this.f99734aL = new ArrayList<>();
        this.f99735aM = 0;
        this.f99736aN = -1.0f;
        this.f99737aO = 0;
        this.f99738aP = new ArrayList<>();
        this.f99766b = i;
    }

    /* renamed from: a */
    public final void mo96138a(long j) {
        if (this.f99779o) {
            this.f99778n = j;
        } else {
            this.f99777m = j;
        }
    }

    private ShortVideoContext(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.f99776l = new ShortVideoSegments();
        this.f99739aQ = new ShortVideoSegments();
        this.f99707L = new ArrayList();
        boolean z9 = false;
        this.f99708M = false;
        this.f99716U = new ArrayList<>();
        this.f99720Y = new StrArray();
        this.f99721Z = new StrArray();
        this.f99740aa = new StrArray();
        this.f99741ab = new StrArray();
        this.f99742ac = new StrArray();
        this.f99743ad = new StrArray();
        this.f99744ae = true;
        this.f99745af = true;
        this.f99746ag = false;
        this.f99747ah = false;
        this.f99749aj = 0;
        this.f99750ak = 0;
        this.f99761av = "";
        this.f99727aE = new ArrayList<>();
        this.f99728aF = new ArrayList<>();
        this.f99729aG = new AVUploadMiscInfoStruct();
        this.f99732aJ = null;
        this.f99733aK = new ArrayList<>();
        this.f99734aL = new ArrayList<>();
        this.f99735aM = 0;
        this.f99736aN = -1.0f;
        this.f99737aO = 0;
        this.f99738aP = new ArrayList<>();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f99746ag = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f99747ah = z2;
        this.f99766b = parcel.readInt();
        this.f99767c = parcel.readLong();
        this.f99768d = (UrlModel) parcel.readSerializable();
        this.f99769e = parcel.readString();
        this.f99770f = parcel.readInt();
        this.f99771g = parcel.readInt();
        this.f99772h = parcel.readString();
        this.f99773i = parcel.readInt();
        this.f99774j = parcel.readInt();
        this.f99775k = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.f99776l = new ShortVideoSegments(m122682a(parcel.readString()));
        this.f99777m = parcel.readLong();
        this.f99783s = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f99784t = z3;
        this.f99787w = parcel.readString();
        this.f99788x = parcel.readString();
        this.f99790z = parcel.readInt();
        this.f99697B = (User) parcel.readSerializable();
        this.f99698C = parcel.readString();
        this.f99699D = parcel.readString();
        this.f99700E = parcel.readString();
        this.f99701F = parcel.readString();
        this.f99702G = parcel.readInt();
        this.f99703H = parcel.readInt();
        this.f99713R = parcel.readString();
        this.f99715T = parcel.readString();
        this.f99716U = parcel.createStringArrayList();
        this.f99717V = parcel.readString();
        this.f99718W = parcel.readString();
        this.f99719X = parcel.readInt();
        this.f99720Y = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99721Z = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99740aa = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99741ab = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99705J = (ReactionParams) parcel.readParcelable(ReactionParams.class.getClassLoader());
        this.f99707L = parcel.createTypedArrayList(EmbaddedWindowInfo.CREATOR);
        this.f99709N = parcel.readString();
        this.f99710O = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.f99711P = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f99712Q = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f99744ae = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f99745af = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f99708M = z7;
        this.f99751al = parcel.readInt();
        this.f99752am = parcel.readInt();
        this.f99753an = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.f99704I = parcel.readString();
        this.f99742ac = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99743ad = (StrArray) parcel.readParcelable(StrArray.class.getClassLoader());
        this.f99754ao = parcel.readString();
        this.f99755ap = parcel.readString();
        this.f99756aq = parcel.readString();
        this.f99757ar = parcel.readString();
        this.f99758as = parcel.readString();
        this.f99759at = parcel.readString();
        this.f99760au = parcel.readString();
        this.f99748ai = (ExtractFramesModel) parcel.readSerializable();
        this.f99762aw = (MicroAppModel) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f99763ax = z8;
        this.f99696A = (AVETParameter) parcel.readSerializable();
        this.f99724aB = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        this.f99725aC = (ExtraMentionUserModel) parcel.readSerializable();
        this.f99727aE = parcel.createStringArrayList();
        this.f99728aF = parcel.createStringArrayList();
        this.f99729aG = (AVUploadMiscInfoStruct) parcel.readSerializable();
        this.f99730aH = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.f99731aI = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.f99726aD = (UrlModel) parcel.readSerializable();
        this.f99723aA = parcel.readString();
        this.f99789y = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        }
        this.f99706K = z9;
        this.f99735aM = parcel.readInt();
        this.f99736aN = parcel.readFloat();
        parcel.readList(this.f99733aK, Integer.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f99746ag ? 1 : 0);
        parcel.writeInt(this.f99747ah ? 1 : 0);
        parcel.writeInt(this.f99766b);
        parcel.writeLong(this.f99767c);
        parcel.writeSerializable(this.f99768d);
        parcel.writeString(this.f99769e);
        parcel.writeInt(this.f99770f);
        parcel.writeInt(this.f99771g);
        parcel.writeString(this.f99772h);
        parcel.writeInt(this.f99773i);
        parcel.writeInt(this.f99774j);
        parcel.writeParcelable(this.f99775k, i);
        parcel.writeString(m122681a((ArrayList<TimeSpeedModelExtension>) this.f99776l));
        parcel.writeLong(this.f99777m);
        parcel.writeInt(this.f99783s);
        parcel.writeInt(this.f99784t ? 1 : 0);
        parcel.writeString(this.f99787w);
        parcel.writeString(this.f99788x);
        parcel.writeInt(this.f99790z);
        parcel.writeSerializable(this.f99697B);
        parcel.writeString(this.f99698C);
        parcel.writeString(this.f99699D);
        parcel.writeString(this.f99700E);
        parcel.writeString(this.f99701F);
        parcel.writeInt(this.f99702G);
        parcel.writeInt(this.f99703H);
        parcel.writeString(this.f99713R);
        parcel.writeString(this.f99715T);
        parcel.writeStringList(this.f99716U);
        parcel.writeString(this.f99717V);
        parcel.writeString(this.f99718W);
        parcel.writeInt(this.f99719X);
        parcel.writeParcelable(this.f99720Y, i);
        parcel.writeParcelable(this.f99721Z, i);
        parcel.writeParcelable(this.f99740aa, i);
        parcel.writeParcelable(this.f99741ab, i);
        parcel.writeParcelable(this.f99705J, i);
        parcel.writeTypedList(this.f99707L);
        parcel.writeString(this.f99709N);
        parcel.writeTypedList(this.f99710O);
        parcel.writeInt(this.f99711P);
        parcel.writeByte(this.f99712Q ? (byte) 1 : 0);
        parcel.writeByte(this.f99744ae ? (byte) 1 : 0);
        parcel.writeByte(this.f99745af ? (byte) 1 : 0);
        parcel.writeByte(this.f99708M ? (byte) 1 : 0);
        parcel.writeInt(this.f99751al);
        parcel.writeInt(this.f99752am);
        parcel.writeParcelable(this.f99753an, i);
        parcel.writeString(this.f99704I);
        parcel.writeParcelable(this.f99742ac, i);
        parcel.writeParcelable(this.f99743ad, i);
        parcel.writeString(this.f99754ao);
        parcel.writeString(this.f99755ap);
        parcel.writeString(this.f99756aq);
        parcel.writeString(this.f99757ar);
        parcel.writeString(this.f99758as);
        parcel.writeString(this.f99759at);
        parcel.writeString(this.f99760au);
        parcel.writeSerializable(this.f99748ai);
        parcel.writeSerializable(this.f99762aw);
        parcel.writeInt(this.f99763ax ? 1 : 0);
        parcel.writeSerializable(this.f99696A);
        parcel.writeParcelable(this.f99724aB, i);
        parcel.writeSerializable(this.f99725aC);
        parcel.writeStringList(this.f99727aE);
        parcel.writeStringList(this.f99728aF);
        parcel.writeSerializable(this.f99729aG);
        parcel.writeParcelable(this.f99730aH, i);
        parcel.writeParcelable(this.f99731aI, i);
        parcel.writeSerializable(this.f99726aD);
        parcel.writeString(this.f99723aA);
        parcel.writeString(this.f99789y);
        parcel.writeByte(this.f99706K ? (byte) 1 : 0);
        parcel.writeInt(this.f99735aM);
        parcel.writeFloat(this.f99736aN);
        parcel.writeList(this.f99733aK);
    }
}
