package com.p280ss.android.ugc.aweme.search.model;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.model.SearchEnterParam */
public final class SearchEnterParam implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 42;
    private String enterSearchFrom;
    private int enterSearchFromBusiness;
    private String gidRequest;
    private String groupId;
    private String previousPage;

    /* renamed from: com.ss.android.ugc.aweme.search.model.SearchEnterParam$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public final C37386a newBuilder() {
            return new C37386a();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.SearchEnterParam$a */
    public static final class C37386a {

        /* renamed from: a */
        private String f97619a;

        /* renamed from: b */
        private String f97620b;

        /* renamed from: c */
        private String f97621c;

        /* renamed from: d */
        private int f97622d;

        /* renamed from: a */
        public final SearchEnterParam mo94095a() {
            SearchEnterParam searchEnterParam = new SearchEnterParam();
            searchEnterParam.setEnterSearchFrom(this.f97619a);
            searchEnterParam.setPreviousPage(this.f97620b);
            searchEnterParam.setGroupId(this.f97621c);
            searchEnterParam.setEnterSearchFromBusiness(this.f97622d);
            return searchEnterParam;
        }

        /* renamed from: a */
        public final C37386a mo94093a(int i) {
            this.f97622d = 2;
            return this;
        }

        /* renamed from: a */
        public final C37386a mo94094a(String str) {
            C7573i.m23587b(str, "enterSearchFrom");
            this.f97619a = str;
            return this;
        }

        /* renamed from: b */
        public final C37386a mo94096b(String str) {
            C7573i.m23587b(str, "previousPage");
            this.f97620b = str;
            return this;
        }

        /* renamed from: c */
        public final C37386a mo94097c(String str) {
            C7573i.m23587b(str, "groupId");
            this.f97621c = str;
            return this;
        }
    }

    public static final C37386a newBuilder() {
        return Companion.newBuilder();
    }

    public final String getEnterSearchFrom() {
        return this.enterSearchFrom;
    }

    public final int getEnterSearchFromBusiness() {
        return this.enterSearchFromBusiness;
    }

    public final String getGidRequest() {
        return this.gidRequest;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String consumeGid() {
        String str = this.gidRequest;
        this.gidRequest = null;
        return str;
    }

    public final void setEnterSearchFrom(String str) {
        this.enterSearchFrom = str;
    }

    public final void setEnterSearchFromBusiness(int i) {
        this.enterSearchFromBusiness = i;
    }

    public final void setGidRequest(String str) {
        this.gidRequest = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
        this.gidRequest = this.groupId;
    }
}
