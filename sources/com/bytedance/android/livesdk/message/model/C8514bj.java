package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.http.legacy.p877d.C19576d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Comparator;

/* renamed from: com.bytedance.android.livesdk.message.model.bj */
public class C8514bj extends C8538c implements Comparator {
    @C6593c(mo15949a = "member_count")

    /* renamed from: a */
    public int f23389a;
    @C6593c(mo15949a = "user")

    /* renamed from: b */
    public User f23390b;
    @C6593c(mo15949a = "is_top_user")

    /* renamed from: c */
    boolean f23391c;
    @C6593c(mo15949a = "action")

    /* renamed from: d */
    public int f23392d;
    @C6593c(mo15949a = "top_user_no")

    /* renamed from: e */
    public int f23393e;
    @C6593c(mo15949a = "operator")

    /* renamed from: f */
    public User f23394f;
    @C6593c(mo15949a = "is_set_to_admin")

    /* renamed from: g */
    public boolean f23395g;
    @C6593c(mo15949a = "rank_score")

    /* renamed from: h */
    public int f23396h;
    @C6593c(mo15949a = "enter_type")

    /* renamed from: i */
    public int f23397i;
    @C6593c(mo15949a = "action_description")

    /* renamed from: j */
    public String f23398j;
    @C6593c(mo15949a = "enter_effect_config")

    /* renamed from: k */
    public C8515a f23399k;
    @C6593c(mo15949a = "user_id")

    /* renamed from: l */
    public long f23400l;
    @C6593c(mo15949a = "pop_str")

    /* renamed from: m */
    public String f23401m;
    @C6593c(mo15949a = "background_image_v2")

    /* renamed from: n */
    public ImageModel f23402n;

    /* renamed from: com.bytedance.android.livesdk.message.model.bj$a */
    public static class C8515a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public int f23403a;
        @C6593c(mo15949a = "icon")

        /* renamed from: b */
        public ImageModel f23404b;
        @C6593c(mo15949a = "text")

        /* renamed from: c */
        public C9505f f23405c;
        @C6593c(mo15949a = "avatar_pos")

        /* renamed from: d */
        public int f23406d;
        @C6593c(mo15949a = "text_icon")

        /* renamed from: e */
        public ImageModel f23407e;
        @C6593c(mo15949a = "stay_time")

        /* renamed from: f */
        public int f23408f;
        @C6593c(mo15949a = "anim_asset_id")

        /* renamed from: g */
        public long f23409g;
        @C6593c(mo15949a = "badge")

        /* renamed from: h */
        public ImageModel f23410h;
    }

    /* renamed from: a */
    public final long mo21658a() {
        return (long) this.f23392d;
    }

    /* renamed from: b */
    public final long mo21659b() {
        return (long) this.f23393e;
    }

    public C8514bj() {
        this.type = MessageType.MEMBER;
    }

    public int hashCode() {
        return C19576d.m64494a(17, (Object) Long.valueOf(this.baseMessage.f25994d));
    }

    /* renamed from: e */
    private String m25758e() {
        if (this.f23398j == null) {
            if (this.f23392d != 1) {
                this.f23398j = "";
            } else {
                this.f23398j = m25757a(R.string.f5c, new Object[0]);
            }
        }
        return this.f23398j;
    }

    /* renamed from: f */
    private boolean m25759f() {
        if (this.f23394f == null || this.f23394f.getUserAttr() == null || !this.f23394f.getUserAttr().f7831c) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        if (this.f23390b == null || C6319n.m19593a(mo21662d())) {
            return false;
        }
        return true;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null || this.f23391c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo21660c() {
        String str = "";
        int i = this.f23397i;
        if (i == 15) {
            return m25757a(R.string.f60, new Object[0]);
        }
        if (i == 1000) {
            return m25757a(R.string.eq8, new Object[0]);
        }
        if (i == 2000) {
            return m25757a(R.string.eq_, new Object[0]);
        }
        if (i == 3000) {
            return m25757a(R.string.eqa, new Object[0]);
        }
        if (i != 4000) {
            return str;
        }
        return m25757a(R.string.eq9, new Object[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MemberMessage{action=");
        sb.append(this.f23392d);
        sb.append(", enterType=");
        sb.append(this.f23397i);
        sb.append(", actionDescription='");
        sb.append(this.f23398j);
        sb.append('\'');
        sb.append(", enterEffectConfig=");
        sb.append(this.f23399k);
        sb.append(", userId=");
        sb.append(this.f23400l);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo21662d() {
        String str;
        int i;
        Object[] objArr;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f23394f == null) {
            str = "";
        } else {
            str = C8471f.m25743a(this.f23394f);
        }
        switch (this.f23392d) {
            case 1:
                if (!this.f23391c) {
                    return m25758e();
                }
                return m25757a(R.string.f51, Integer.valueOf(this.f23393e), m25758e());
            case 2:
                if (this.f23391c) {
                    i = R.string.f52;
                    objArr = new Object[]{Integer.valueOf(this.f23393e)};
                } else {
                    i = R.string.f5h;
                    objArr = new Object[0];
                }
                return m25757a(i, objArr);
            case 3:
                if (m25759f()) {
                    if (this.f23390b == null) {
                        return "";
                    }
                    return m25757a(R.string.f5q, C8471f.m25743a(this.f23390b), str);
                } else if (this.f23390b == null) {
                    return "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C8471f.m25743a(this.f23390b));
                    sb.append(m25757a(R.string.f5p, new Object[0]));
                    return sb.toString();
                }
            case 4:
                if (m25759f()) {
                    if (this.f23390b == null) {
                        return "";
                    }
                    return m25757a(R.string.f5s, C8471f.m25743a(this.f23390b), str);
                } else if (this.f23390b == null) {
                    return "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C8471f.m25743a(this.f23390b));
                    sb2.append(m25757a(R.string.f5r, new Object[0]));
                    return sb2.toString();
                }
            case 5:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C8471f.m25743a(this.f23390b));
                sb3.append(" ");
                sb3.append(m25757a(R.string.f5n, new Object[0]));
                return sb3.toString();
            case 6:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C8471f.m25743a(this.f23390b));
                sb4.append(" ");
                sb4.append(m25757a(R.string.f5a, new Object[0]));
                return sb4.toString();
            case 8:
                if (this.f23393e > 0) {
                    if (this.f23395g) {
                        str2 = m25757a(R.string.f5_, C8471f.m25743a(this.f23390b), Integer.valueOf(this.f23393e));
                    } else {
                        str2 = m25757a(R.string.f59, C8471f.m25743a(this.f23390b), Integer.valueOf(this.f23393e));
                    }
                    return str2;
                }
                break;
            case 9:
                Object[] objArr2 = new Object[2];
                if (this.f23390b == null) {
                    str3 = "";
                } else {
                    str3 = C8471f.m25743a(this.f23390b);
                }
                objArr2[0] = str3;
                if (this.f23394f == null) {
                    str4 = "";
                } else {
                    str4 = C8471f.m25743a(this.f23394f);
                }
                objArr2[1] = str4;
                return m25757a(R.string.f5q, objArr2);
            case 10:
                Object[] objArr3 = new Object[2];
                if (this.f23390b == null) {
                    str5 = "";
                } else {
                    str5 = C8471f.m25743a(this.f23390b);
                }
                objArr3[0] = str5;
                if (this.f23394f == null) {
                    str6 = "";
                } else {
                    str6 = C8471f.m25743a(this.f23394f);
                }
                objArr3[1] = str6;
                return m25757a(R.string.f5s, objArr3);
            case 11:
                if (m25759f()) {
                    if (this.f23390b == null) {
                        return "";
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(C8471f.m25743a(this.f23390b));
                    sb5.append(m25757a(R.string.f5f, new Object[0]));
                    return sb5.toString();
                } else if (this.f23390b == null) {
                    return "";
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(C8471f.m25743a(this.f23390b));
                    sb6.append(m25757a(R.string.f5e, new Object[0]));
                    return sb6.toString();
                }
        }
        return "";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8514bj) || this.baseMessage.f25994d != ((C8514bj) obj).baseMessage.f25994d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m25757a(int i, Object... objArr) {
        Context e = C3358ac.m12528e();
        if (objArr.length > 0) {
            return e.getResources().getString(i, objArr);
        }
        return e.getResources().getString(i);
    }

    public int compare(Object obj, Object obj2) {
        C8514bj bjVar = (C8514bj) obj;
        C8514bj bjVar2 = (C8514bj) obj2;
        if (bjVar.f23396h == bjVar2.f23396h) {
            return -1;
        }
        return bjVar.f23396h - bjVar2.f23396h;
    }
}
