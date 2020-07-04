package com.p280ss.android.ugc.aweme.account.login.model;

import com.google.common.collect.ImmutableList;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.a */
public final class C21566a {

    /* renamed from: e */
    public static final C21566a f57894e = new C21566a(R.string.fjk, "U", "US", "+1");

    /* renamed from: f */
    public static final C21566a f57895f = new C21566a(R.string.a3f, "C", "CN", "+86");

    /* renamed from: g */
    public static final C7541d f57896g = C7546e.m23569a(C21568b.f57903a);

    /* renamed from: h */
    public static final C21567a f57897h = new C21567a(null);

    /* renamed from: a */
    public final int f57898a;

    /* renamed from: b */
    public String f57899b;

    /* renamed from: c */
    public final String f57900c;

    /* renamed from: d */
    public final String f57901d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$a */
    public static final class C21567a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f57902a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21567a.class), "countries", "getCountries()Lcom/google/common/collect/ImmutableList;"))};

        private C21567a() {
        }

        /* renamed from: a */
        public static C21566a m72291a() {
            return C21566a.f57894e;
        }

        /* renamed from: b */
        public static C21566a m72292b() {
            return C21566a.f57895f;
        }

        /* renamed from: c */
        public static ImmutableList<C21566a> m72293c() {
            return (ImmutableList) C21566a.f57896g.getValue();
        }

        public /* synthetic */ C21567a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C21566a mo57756a(PhoneNumber phoneNumber) {
            boolean z;
            C7573i.m23587b(phoneNumber, "phoneNumber");
            Iterable c = m72293c();
            Collection arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C21566a aVar = (C21566a) next;
                if (aVar.mo57751a() == phoneNumber.getCountryCode()) {
                    CharSequence countryIso = phoneNumber.getCountryIso();
                    if (countryIso == null || countryIso.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || C7573i.m23585a((Object) aVar.f57900c, (Object) phoneNumber.getCountryIso())) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (list.isEmpty()) {
                return null;
            }
            return (C21566a) list.get(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$b */
    static final class C21568b extends Lambda implements C7561a<ImmutableList<C21566a>> {

        /* renamed from: a */
        public static final C21568b f57903a = new C21568b();

        C21568b() {
            super(0);
        }

        /* renamed from: a */
        private static ImmutableList<C21566a> m72295a() {
            C21566a aVar = new C21566a(R.string.c2, "A", "AB", "+7 840");
            C21566a aVar2 = new C21566a(R.string.c2, "A", "AB", "+7 940");
            C21566a aVar3 = new C21566a(R.string.c2, "A", "AB", "+995 44");
            C21566a aVar4 = new C21566a(R.string.fs, "A", "AF", "+93");
            C21566a aVar5 = new C21566a(R.string.ftl, "A", "AX", "+358 18");
            C21566a aVar6 = new C21566a(R.string.g1, "A", "AL", "+355");
            C21566a aVar7 = new C21566a(R.string.hr, "A", "DZ", "+213");
            C21566a aVar8 = new C21566a(R.string.iv, "A", C6855a.f19497a, "+1 684");
            C21566a aVar9 = new C21566a(R.string.iz, "A", "AD", "+376");
            C21566a aVar10 = new C21566a(R.string.j2, "A", "AO", "+244");
            C21566a aVar11 = new C21566a(R.string.j3, "A", "AI", "+1 264");
            return ImmutableList.m58548of(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, new C21566a(R.string.ja, "A", "AG", "+1 268"), new C21566a(R.string.le, "A", "AR", "+54"), new C21566a(R.string.lf, "A", "AM", "+374"), new C21566a(R.string.lj, "A", "AW", "+297"), new C21566a(R.string.lk, "A", "SH", "+247"), new C21566a(R.string.m2, "A", "AU", "+61"), new C21566a(R.string.m3, "A", "AU", "+672"), new C21566a(R.string.m4, "A", "AT", "+43"), new C21566a(R.string.po, "A", "AZ", "+994"), new C21566a(R.string.q7, "B", "BS", "+1 242"), new C21566a(R.string.q8, "B", "BH", "+973"), new C21566a(R.string.qa, "B", "BD", "+880"), new C21566a(R.string.qg, "B", "BB", "+1 246"), new C21566a(R.string.qh, "B", "AG", "+1 268"), new C21566a(R.string.re, "B", "BY", "+375"), new C21566a(R.string.rf, "B", "BE", "+32"), new C21566a(R.string.rg, "B", "BZ", "+501"), new C21566a(R.string.rh, "B", "BJ", "+229"), new C21566a(R.string.ri, "B", "BM", "+1 441"), new C21566a(R.string.rv, "B", "BT", "+975"), new C21566a(R.string.u3, "B", "BO", "+591"), new C21566a(R.string.u5, "B", "BA", "+387"), new C21566a(R.string.u6, "B", "BW", "+267"), new C21566a(R.string.ud, "B", "BR", "+55"), new C21566a(R.string.ug, "B", "IO", "+246"), new C21566a(R.string.uh, "B", "VG", "+1 284"), new C21566a(R.string.ul, "B", "BN", "+673"), new C21566a(R.string.uy, "B", "BG", "+359"), new C21566a(R.string.v7, "B", "BF", "+226"), new C21566a(R.string.v8, "B", "BI", "+257"), new C21566a(R.string.vt, "C", "KH", "+855"), new C21566a(R.string.vy, "C", "CM", "+237"), new C21566a(R.string.w9, "C", "CA", "+1"), new C21566a(R.string.ww, "C", "CV", "+238"), new C21566a(R.string.x4, "C", "BQ", "+599 7"), new C21566a(R.string.yg, "C", "KY", "+1 345"), new C21566a(R.string.yi, "C", "CF", "+236"), new C21566a(R.string.yj, "C", "TD", "+235"), new C21566a(R.string.a3e, "C", "CL", "+56"), new C21566a(R.string.a3f, "C", "CN", "+86"), new C21566a(R.string.a40, "C", "CX", "+61"), new C21566a(R.string.a5s, "C", "CC", "+61"), new C21566a(R.string.a6_, "C", "CO", "+57"), new C21566a(R.string.aex, "C", "KM", "+269"), new C21566a(R.string.ag5, "C", "CG", "+242"), new C21566a(R.string.ag6, "C", "CD", "+243"), new C21566a(R.string.ah_, "C", "CK", "+682"), new C21566a(R.string.ahk, "C", "CR", "+506"), new C21566a(R.string.alt, "C", "HR", "+385"), new C21566a(R.string.alz, "C", "CU", "+53"), new C21566a(R.string.am1, "C", "CW", "+599 9"), new C21566a(R.string.amo, "C", "CY", "+357"), new C21566a(R.string.amp, "C", "CZ", "+420"), new C21566a(R.string.amr, "C", "CI", "+225"), new C21566a(R.string.ao7, "D", "DK", "+45"), new C21566a(R.string.apb, "D", "DG", "+246"), new C21566a(R.string.at6, "D", "DJ", "+253"), new C21566a(R.string.ate, "D", "DM", "+1 767"), new C21566a(R.string.atf, "D", "DO", "+1 809"), new C21566a(R.string.atf, "D", "DO", "+1 829"), new C21566a(R.string.atf, "D", "DO", "+1 849"), new C21566a(R.string.ax5, "E", "EC", "+593"), new C21566a(R.string.azj, "E", "EG", "+20"), new C21566a(R.string.azk, "E", "SV", "+503"), new C21566a(R.string.b1i, "E", "GQ", "+240"), new C21566a(R.string.b1j, "E", "ER", "+291"), new C21566a(R.string.b2c, "E", "EE", "+372"), new C21566a(R.string.b2d, "E", "ET", "+251"), new C21566a(R.string.b36, "F", "FK", "+500"), new C21566a(R.string.b4c, "F", "FO", "+298"), new C21566a(R.string.b6k, "F", "FJ", "+679"), new C21566a(R.string.b7d, "F", "FI", "+358"), new C21566a(R.string.b_7, "F", "FR", "+33"), new C21566a(R.string.b_b, "F", "GF", "+594"), new C21566a(R.string.b_c, "F", "PF", "+689"), new C21566a(R.string.bak, "G", "GA", "+241"), new C21566a(R.string.bal, "G", "GM", "+220"), new C21566a(R.string.bb1, "G", "GE", "+995"), new C21566a(R.string.bb2, "G", "DE", "+49"), new C21566a(R.string.bb8, "G", "GH", "+233"), new C21566a(R.string.bb9, "G", "GI", "+350"), new C21566a(R.string.bcg, "G", "GR", "+30"), new C21566a(R.string.bci, "G", "GL", "+299"), new C21566a(R.string.bcj, "G", "GD", "+1 473"), new C21566a(R.string.bck, "G", "GP", "+590"), new C21566a(R.string.bcl, "G", "GU", "+1 671"), new C21566a(R.string.bcq, "G", "GT", "+502"), new C21566a(R.string.bcr, "G", "GG", "+44"), new C21566a(R.string.bd4, "G", "GN", "+224"), new C21566a(R.string.bd5, "G", "GW", "+245"), new C21566a(R.string.bd6, "G", "GY", "+592"), new C21566a(R.string.bd9, "H", "HT", "+509"), new C21566a(R.string.bek, "H", "HN", "+504"), new C21566a(R.string.bem, "H", "HK", "+852"), new C21566a(R.string.bf6, "H", "HU", "+36"), new C21566a(R.string.bfn, "I", "IS", "+354"), new C21566a(R.string.btj, "I", "IN", "+91"), new C21566a(R.string.btk, "I", "ID", "+62"), new C21566a(R.string.bvg, "I", "IR", "+98"), new C21566a(R.string.bvh, "I", "IQ", "+964"), new C21566a(R.string.bvi, "I", "IE", "+353"), new C21566a(R.string.bvt, "I", "IL", "+972"), new C21566a(R.string.bvu, "I", "IT", "+39"), new C21566a(R.string.bvy, "J", "JM", "+1 876"), new C21566a(R.string.bvz, "J", "JP", "+81"), new C21566a(R.string.bw0, "J", "JE", "+44"), new C21566a(R.string.bx1, "J", "JO", "+962"), new C21566a(R.string.bx9, "K", "KZ", "+7 6"), new C21566a(R.string.bx9, "K", "KZ", "+7 7"), new C21566a(R.string.bx_, "K", "KE", "+254"), new C21566a(R.string.bxh, "K", "KI", "+686"), new C21566a(R.string.bxk, "K", "KW", "+965"), new C21566a(R.string.bxl, "K", "KG", "+996"), new C21566a(R.string.byb, "L", "LA", "+856"), new C21566a(R.string.bym, "L", "LV", "+371"), new C21566a(R.string.bys, "L", "LB", "+961"), new C21566a(R.string.byu, "L", "LS", "+266"), new C21566a(R.string.byy, "L", "LR", "+231"), new C21566a(R.string.bz0, "L", "LY", "+218"), new C21566a(R.string.bz1, "L", "LI", "+423"), new C21566a(R.string.bzy, "L", "LT", "+370"), new C21566a(R.string.c76, "L", "LU", "+352"), new C21566a(R.string.c79, "M", "MO", "+853"), new C21566a(R.string.c7_, "M", "MK", "+389"), new C21566a(R.string.c7a, "M", "MG", "+261"), new C21566a(R.string.c7l, "M", "MW", "+265"), new C21566a(R.string.c7m, "M", "MY", "+60"), new C21566a(R.string.c7n, "M", "MV", "+960"), new C21566a(R.string.c7p, "M", "ML", "+223"), new C21566a(R.string.c7q, "M", "MT", "+356"), new C21566a(R.string.c7w, "M", "MH", "+692"), new C21566a(R.string.c7x, "M", "MQ", "+596"), new C21566a(R.string.c8l, "M", "MR", "+222"), new C21566a(R.string.c8m, "M", "MU", "+230"), new C21566a(R.string.c8s, "M", "YT", "+262"), new C21566a(R.string.c9l, "M", "MX", "+52"), new C21566a(R.string.c9t, "M", "FM", "+691"), new C21566a(R.string.c_t, "M", "MD", "+373"), new C21566a(R.string.c_u, "M", "MC", "+377"), new C21566a(R.string.c_w, "M", "MN", "+976"), new C21566a(R.string.c_x, "M", "ME", "+382"), new C21566a(R.string.c_y, "M", "MS", "+1 664"), new C21566a(R.string.ca8, "M", "MA", "+212"), new C21566a(R.string.caf, "M", "MZ", "+258"), new C21566a(R.string.cj9, "M", "MM", "+95"), new C21566a(R.string.cja, "N", "NA", "+264"), new C21566a(R.string.cjd, "N", "NR", "+674"), new C21566a(R.string.cjk, "N", "NP", "+977"), new C21566a(R.string.cjl, "N", "NL", "+31"), new C21566a(R.string.cju, "N", "NC", "+687"), new C21566a(R.string.clk, "N", "NZ", "+64"), new C21566a(R.string.clo, "N", "NI", "+505"), new C21566a(R.string.clt, "N", "NE", "+227"), new C21566a(R.string.clu, "N", "NG", "+234"), new C21566a(R.string.clw, "N", "NU", "+683"), new C21566a(R.string.cne, "N", "NF", "+672"), new C21566a(R.string.cnf, "N", "KP", "+850"), new C21566a(R.string.cng, "N", "MP", "+1 670"), new C21566a(R.string.cnh, "N", "NO", "+47"), new C21566a(R.string.cqm, "O", "OM", "+968"), new C21566a(R.string.cs0, "P", "PK", "+92"), new C21566a(R.string.cs1, "P", "PW", "+680"), new C21566a(R.string.cs3, "P", "PS", "+970"), new C21566a(R.string.cs4, "P", "PA", "+507"), new C21566a(R.string.cs5, "P", "PG", "+675"), new C21566a(R.string.cs6, "P", "PY", "+595"), new C21566a(R.string.ctb, "P", "PE", "+51"), new C21566a(R.string.ctg, "P", "PH", "+63"), new C21566a(R.string.cu_, "P", "PN", "+64"), new C21566a(R.string.d1b, "P", "PL", "+48"), new C21566a(R.string.d3h, "P", "PT", "+351"), new C21566a(R.string.d9l, "P", "PR", "+1 787"), new C21566a(R.string.d9l, "P", "PR", "+1 939"), new C21566a(R.string.d_u, "Q", "QA", "+974"), new C21566a(R.string.dhh, "R", "RO", "+40"), new C21566a(R.string.dhm, "R", "RU", "+7"), new C21566a(R.string.dho, "R", "RW", "+250"), new C21566a(R.string.dhp, "R", "SURVEY", "+262"), new C21566a(R.string.di7, "S", "WS", "+685"), new C21566a(R.string.di8, "S", "SM", "+378"), new C21566a(R.string.di9, "S", "SA", "+966"), new C21566a(R.string.dm4, "S", "SN", "+221"), new C21566a(R.string.dm5, "S", "RS", "+381"), new C21566a(R.string.drw, "S", "SC", "+248"), new C21566a(R.string.duf, "S", "SL", "+232"), new C21566a(R.string.duu, "S", "SG", "+65"), new C21566a(R.string.duv, "S", "BQ", "+599 3"), new C21566a(R.string.duw, "S", "SX", "+1 721"), new C21566a(R.string.dv2, "S", "SK", "+421"), new C21566a(R.string.dv3, "S", "SI", "+386"), new C21566a(R.string.dvd, "S", "SB", "+677"), new C21566a(R.string.dve, "S", "SO", "+252"), new C21566a(R.string.dvl, "S", "ZA", "+27"), new C21566a(R.string.dvm, "S", "GS", "+500"), new C21566a(R.string.dvn, "S", "KR", "+82"), new C21566a(R.string.dvo, "S", "!1", "+995 34"), new C21566a(R.string.dvp, "S", "SS", "+211"), new C21566a(R.string.dvs, "S", "ES", "+34"), new C21566a(R.string.dwo, "S", "LK", "+94"), new C21566a(R.string.dzv, "S", "BL", "+590"), new C21566a(R.string.dzw, "S", "SH", "+290"), new C21566a(R.string.dzx, "S", "KN", "+1 869"), new C21566a(R.string.dzy, "S", "LC", "+1 758"), new C21566a(R.string.dzz, "S", "MF", "+590"), new C21566a(R.string.e00, "S", "PM", "+508"), new C21566a(R.string.e01, "S", "VC", "+1 784"), new C21566a(R.string.e3l, "S", "SD", "+249"), new C21566a(R.string.e48, "S", "SR", "+597"), new C21566a(R.string.e49, "S", "SJ", "+47 79"), new C21566a(R.string.e4_, "S", "SJ", "+47 79"), new C21566a(R.string.e4a, "S", "SZ", "+268"), new C21566a(R.string.e4b, "S", "SE", "+46"), new C21566a(R.string.e4p, "S", "CH", "+41"), new C21566a(R.string.e4y, "S", "SY", "+963"), new C21566a(R.string.e4z, "S", "ST", "+239"), new C21566a(R.string.e5b, "T", "TW", "+886"), new C21566a(R.string.e5c, "T", "TJ", "+992"), new C21566a(R.string.e5f, "T", "TZ", "+255"), new C21566a(R.string.e6x, "T", "TH", "+66"), new C21566a(R.string.e9j, "T", "TL", "+670"), new C21566a(R.string.e_t, "T", "TG", "+228"), new C21566a(R.string.e_u, "T", "TK", "+690"), new C21566a(R.string.e_v, "T", "TO", "+676"), new C21566a(R.string.eax, "T", "TT", "+1 868"), new C21566a(R.string.fga, "T", "TN", "+216"), new C21566a(R.string.fgb, "T", "TR", "+90"), new C21566a(R.string.fgc, "T", "TM", "+993"), new C21566a(R.string.fgd, "T", "TC", "+1 649"), new C21566a(R.string.fgk, "T", "TV", "+688"), new C21566a(R.string.fh7, "U", "VI", "+1 340"), new C21566a(R.string.fhc, "U", "UG", "+256"), new C21566a(R.string.fio, "U", "UA", "+380"), new C21566a(R.string.fji, "U", "AE", "+971"), new C21566a(R.string.fjj, "U", "GB", "+44"), new C21566a(R.string.fjk, "U", "US", "+1"), new C21566a(R.string.fl4, "U", "UY", "+598"), new C21566a(R.string.fmz, "U", "UZ", "+998"), new C21566a(R.string.fn2, "V", "VU", "+678"), new C21566a(R.string.fn3, "V", "VA", "+39 06 698"), new C21566a(R.string.fn3, "V", "VA", "+379"), new C21566a(R.string.fn_, "V", "VE", "+58"), new C21566a(R.string.fpi, "V", "VN", "+84"), new C21566a(R.string.fqo, "W", "WF", "+681"), new C21566a(R.string.ft_, "Y", "YE", "+967"), new C21566a(R.string.ftf, "Z", "ZM", "+260"), new C21566a(R.string.fth, "Z", "!1", "+255"), new C21566a(R.string.fti, "Z", "ZW", "+263"));
        }

        public final /* synthetic */ Object invoke() {
            return m72295a();
        }
    }

    /* renamed from: a */
    public static C21566a m72286a(int i, String str, String str2, String str3) {
        C7573i.m23587b(str, "nameIndex");
        C7573i.m23587b(str2, "alpha2");
        C7573i.m23587b(str3, "code");
        return new C21566a(i, str, str2, str3);
    }

    /* renamed from: a */
    public static final C21566a m72287a(PhoneNumber phoneNumber) {
        return f57897h.mo57756a(phoneNumber);
    }

    /* renamed from: b */
    public static final ImmutableList<C21566a> m72288b() {
        return C21567a.m72293c();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21566a) {
                C21566a aVar = (C21566a) obj;
                if (!(this.f57898a == aVar.f57898a) || !C7573i.m23585a((Object) this.f57899b, (Object) aVar.f57899b) || !C7573i.m23585a((Object) this.f57900c, (Object) aVar.f57900c) || !C7573i.m23585a((Object) this.f57901d, (Object) aVar.f57901d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f57898a * 31;
        String str = this.f57899b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f57900c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f57901d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryCode(nameRes=");
        sb.append(this.f57898a);
        sb.append(", nameIndex=");
        sb.append(this.f57899b);
        sb.append(", alpha2=");
        sb.append(this.f57900c);
        sb.append(", code=");
        sb.append(this.f57901d);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo57751a() {
        try {
            return Integer.parseInt(C7634n.m23711a(C7634n.m23711a(this.f57901d, "+", "", false), " ", "", false));
        } catch (NumberFormatException unused) {
            return 86;
        }
    }

    /* renamed from: a */
    public final void mo57752a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f57899b = str;
    }

    public C21566a(int i, String str, String str2, String str3) {
        C7573i.m23587b(str, "nameIndex");
        C7573i.m23587b(str2, "alpha2");
        C7573i.m23587b(str3, "code");
        this.f57898a = i;
        this.f57899b = str;
        this.f57900c = str2;
        this.f57901d = str3;
    }
}
