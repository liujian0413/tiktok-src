package com.p280ss.android.ugc.aweme.share;

import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.VideoControl;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct */
public final class AwemeACLStruct {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98800a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AwemeACLStruct.class), "aclCommonStruct", "getAclCommonStruct()Lcom/ss/android/ugc/aweme/share/AwemeACLStruct$ACLCommonStruct;"))};

    /* renamed from: b */
    public static final AwemeACLStruct f98801b = new AwemeACLStruct();

    /* renamed from: c */
    private static final C7541d f98802c = C7546e.m23569a(C37945a.f98807a);

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct */
    public static final class ACLCommonStruct implements Serializable {
        private int code;
        private String extra = "";
        private int showType = 2;
        private String toastMsg = "";

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("code = ");
            sb.append(this.code);
            sb.append(", showType = ");
            sb.append(this.showType);
            sb.append(", toastMsg = ");
            sb.append(this.toastMsg);
            sb.append(" extra = ");
            sb.append(this.extra);
            return sb.toString();
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        public final void setExtra(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.extra = str;
        }

        public final void setToastMsg(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.toastMsg = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ServerExtra */
    public static final class ServerExtra implements Serializable {

        /* renamed from: aa */
        private Integer f98803aa = Integer.valueOf(0);
        private Boolean aac = Boolean.valueOf(true);
        private Integer aad = Integer.valueOf(0);
        private Boolean aas = Boolean.valueOf(false);

        /* renamed from: ap */
        private Boolean f98804ap = Boolean.valueOf(false);
        private Boolean arv = Boolean.valueOf(false);
        private Boolean arw = Boolean.valueOf(false);
        private Boolean asa = Boolean.valueOf(false);
        private Integer asd = Integer.valueOf(0);
        private Boolean asr = Boolean.valueOf(false);
        private Integer avp = Integer.valueOf(0);

        /* renamed from: sd */
        private Integer f98805sd = Integer.valueOf(0);

        /* renamed from: ss */
        private Boolean f98806ss = Boolean.valueOf(false);

        public final Integer getAa() {
            return this.f98803aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAp() {
            return this.f98804ap;
        }

        public final Boolean getArv() {
            return this.arv;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.f98805sd;
        }

        public final Boolean getSs() {
            return this.f98806ss;
        }

        public final void setAa(Integer num) {
            this.f98803aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAp(Boolean bool) {
            this.f98804ap = bool;
        }

        public final void setArv(Boolean bool) {
            this.arv = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.f98805sd = num;
        }

        public final void setSs(Boolean bool) {
            this.f98806ss = bool;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean bool;
            Integer num;
            Integer num2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Integer num3;
            Boolean bool6;
            C7573i.m23587b(aweme, "aweme");
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Integer num4 = null;
            if (author != null) {
                bool = Boolean.valueOf(author.isSecret());
            } else {
                bool = null;
            }
            serverExtra.aas = bool;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                num = Integer.valueOf(author2.getDownloadSetting());
            } else {
                num = null;
            }
            serverExtra.aad = num;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num2 = null;
            }
            serverExtra.avp = num2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                bool2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                bool2 = null;
            }
            serverExtra.arw = bool2;
            AwemeRiskModel awemeRiskModel2 = aweme.getAwemeRiskModel();
            if (awemeRiskModel2 != null) {
                bool3 = Boolean.valueOf(awemeRiskModel2.isVote());
            } else {
                bool3 = null;
            }
            serverExtra.arv = bool3;
            serverExtra.f98803aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                bool4 = Boolean.valueOf(awemeControl.canShare());
            } else {
                bool4 = null;
            }
            serverExtra.aac = bool4;
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                bool5 = Boolean.valueOf(status.isReviewed());
            } else {
                bool5 = null;
            }
            serverExtra.asr = bool5;
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl R = a.mo60048R();
            if (R != null) {
                num3 = (Integer) R.mo59877d();
            } else {
                num3 = null;
            }
            serverExtra.f98805sd = num3;
            serverExtra.f98804ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null) {
                bool6 = Boolean.valueOf(status2.isAllowShare());
            } else {
                bool6 = null;
            }
            serverExtra.asa = bool6;
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null) {
                num4 = Integer.valueOf(status3.getDownloadStatus());
            }
            serverExtra.asd = num4;
            serverExtra.f98806ss = C30199h.m98861a().getShareDownloadDisabled();
            return serverExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$a */
    static final class C37945a extends Lambda implements C7561a<ACLCommonStruct> {

        /* renamed from: a */
        public static final C37945a f98807a = new C37945a();

        C37945a() {
            super(0);
        }

        /* renamed from: a */
        private static ACLCommonStruct m121221a() {
            return new ACLCommonStruct();
        }

        public final /* synthetic */ Object invoke() {
            return m121221a();
        }
    }

    private AwemeACLStruct() {
    }

    /* renamed from: a */
    public static final ACLCommonStruct m121220a() {
        return (ACLCommonStruct) f98802c.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ACLCommonStruct = [");
        sb.append(m121220a());
        sb.append(']');
        return sb.toString();
    }
}
