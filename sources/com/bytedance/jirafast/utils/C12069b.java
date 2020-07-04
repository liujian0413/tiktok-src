package com.bytedance.jirafast.utils;

import com.bytedance.jirafast.models.C12010b;
import com.bytedance.jirafast.models.JIRAEpicLink;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.bytedance.jirafast.utils.b */
public final class C12069b {

    /* renamed from: a */
    private static String f32152a = "JIRA_COMPONENT_LIST";

    /* renamed from: b */
    private static String f32153b = "JIRA_VERSION_LIST";

    /* renamed from: d */
    private static String f32154d = "AME";

    /* renamed from: c */
    private String f32155c;

    /* renamed from: e */
    private String f32156e;

    /* renamed from: f */
    private String f32157f;

    /* renamed from: com.bytedance.jirafast.utils.b$a */
    static class C12071a {

        /* renamed from: a */
        public static C12069b f32158a = new C12069b();
    }

    /* renamed from: a */
    public static C12069b m35206a() {
        return C12071a.f32158a;
    }

    /* renamed from: d */
    public final ArrayList<JIRAEpicLink> mo29753d() {
        ArrayList<JIRAEpicLink> arrayList = new ArrayList<>();
        arrayList.addAll(m35209b("Android--"));
        arrayList.addAll(m35209b("server--"));
        return arrayList;
    }

    private C12069b() {
        this.f32155c = C12068a.m35194a().mo29742a(C12068a.f32134i);
        this.f32156e = C12068a.m35194a().mo29742a(C12068a.f32136k);
        this.f32157f = C12068a.m35194a().mo29742a(C12068a.f32137l);
        String a = C12068a.m35194a().mo29742a(C12068a.f32135j);
        f32154d = a;
        C12010b.m35079a(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (r0 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        if (r0 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        r0.mo29731e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        if (r2.size() <= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        com.bytedance.jirafast.utils.C12074e.m35223a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return com.bytedance.jirafast.utils.C12074e.m35224b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.jirafast.models.JIRAVersion> mo29752c() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r14.f32155c
            r0.append(r1)
            java.lang.String r1 = "/project/"
            r0.append(r1)
            java.lang.String r1 = f32154d
            r0.append(r1)
            java.lang.String r1 = "/versions"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = f32153b
            r1.append(r2)
            java.lang.String r2 = f32154d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            r6 = 1
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35131a(r0, r6, r5)     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29733g()     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            java.lang.String r5 = r14.f32156e     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            java.lang.String r6 = r14.f32157f     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29725b(r5, r6)     // Catch:{ HttpRequestException -> 0x00ca, all -> 0x00c2 }
            java.lang.String r4 = r0.mo29732f()     // Catch:{ HttpRequestException -> 0x00cb, all -> 0x00c0 }
            boolean r5 = r0.mo29726b()     // Catch:{ HttpRequestException -> 0x00cb, all -> 0x00c0 }
            if (r5 == 0) goto L_0x00bd
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bc }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x00bc }
            com.bytedance.jirafast.utils.a r4 = com.bytedance.jirafast.utils.C12068a.m35194a()     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r6 = com.bytedance.jirafast.utils.C12068a.f32144s     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r4 = r4.mo29742a(r6)     // Catch:{ JSONException -> 0x00bc }
        L_0x0063:
            int r6 = r5.length()     // Catch:{ JSONException -> 0x00bc }
            if (r3 >= r6) goto L_0x00bd
            org.json.JSONObject r6 = r5.optJSONObject(r3)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r7 = "id"
            java.lang.String r7 = r6.optString(r7)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r8 = "name"
            java.lang.String r8 = r6.optString(r8)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r9 = "archived"
            boolean r9 = r6.getBoolean(r9)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r10 = "released"
            boolean r10 = r6.getBoolean(r10)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r11 = "projectId"
            long r11 = r6.getLong(r11)     // Catch:{ JSONException -> 0x00bc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00bc }
            r6.<init>()     // Catch:{ JSONException -> 0x00bc }
            r6.append(r4)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r13 = " "
            r6.append(r13)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00bc }
            boolean r6 = r8.startsWith(r6)     // Catch:{ JSONException -> 0x00bc }
            if (r6 == 0) goto L_0x00b9
            com.bytedance.jirafast.models.JIRAVersion r6 = new com.bytedance.jirafast.models.JIRAVersion     // Catch:{ JSONException -> 0x00bc }
            r6.<init>()     // Catch:{ JSONException -> 0x00bc }
            r6.setId(r7)     // Catch:{ JSONException -> 0x00bc }
            r6.setName(r8)     // Catch:{ JSONException -> 0x00bc }
            r6.setArchived(r9)     // Catch:{ JSONException -> 0x00bc }
            r6.setReleased(r10)     // Catch:{ JSONException -> 0x00bc }
            r6.setProjectId(r11)     // Catch:{ JSONException -> 0x00bc }
            r2.add(r6)     // Catch:{ JSONException -> 0x00bc }
        L_0x00b9:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x00bc:
        L_0x00bd:
            if (r0 == 0) goto L_0x00d0
            goto L_0x00cd
        L_0x00c0:
            r1 = move-exception
            goto L_0x00c4
        L_0x00c2:
            r1 = move-exception
            r0 = r4
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.mo29731e()
        L_0x00c9:
            throw r1
        L_0x00ca:
            r0 = r4
        L_0x00cb:
            if (r0 == 0) goto L_0x00d0
        L_0x00cd:
            r0.mo29731e()
        L_0x00d0:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00da
            com.bytedance.jirafast.utils.C12074e.m35223a(r1, r2)
            goto L_0x00de
        L_0x00da:
            java.util.List r2 = com.bytedance.jirafast.utils.C12074e.m35224b(r1)
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.mo29752c():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r1.mo29731e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r2.size() <= 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        com.bytedance.jirafast.utils.C12074e.m35225b(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return com.bytedance.jirafast.utils.C12074e.m35222a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo29751b() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f32152a
            r0.append(r1)
            java.lang.String r1 = f32154d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.f32155c
            r1.append(r2)
            java.lang.String r2 = "/project/"
            r1.append(r2)
            java.lang.String r2 = f32154d
            r1.append(r2)
            java.lang.String r2 = "/components"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            com.bytedance.jirafast.utils.JIRAHttpRequest r1 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35130a(r1)     // Catch:{ HttpRequestException -> 0x0082, all -> 0x007a }
            com.bytedance.jirafast.utils.JIRAHttpRequest r1 = r1.mo29733g()     // Catch:{ HttpRequestException -> 0x0082, all -> 0x007a }
            java.lang.String r4 = r7.f32156e     // Catch:{ HttpRequestException -> 0x0082, all -> 0x007a }
            java.lang.String r5 = r7.f32157f     // Catch:{ HttpRequestException -> 0x0082, all -> 0x007a }
            com.bytedance.jirafast.utils.JIRAHttpRequest r1 = r1.mo29725b(r4, r5)     // Catch:{ HttpRequestException -> 0x0082, all -> 0x007a }
            java.lang.String r3 = r1.mo29732f()     // Catch:{ HttpRequestException -> 0x0083, all -> 0x0078 }
            boolean r4 = r1.mo29726b()     // Catch:{ HttpRequestException -> 0x0083, all -> 0x0078 }
            if (r4 == 0) goto L_0x0075
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0074 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0074 }
            r3 = 0
        L_0x0056:
            int r5 = r4.length()     // Catch:{ JSONException -> 0x0074 }
            if (r3 >= r5) goto L_0x0075
            org.json.JSONObject r5 = r4.optJSONObject(r3)     // Catch:{ JSONException -> 0x0074 }
            if (r5 == 0) goto L_0x0071
            java.lang.String r6 = "name"
            java.lang.String r5 = r5.optString(r6)     // Catch:{ JSONException -> 0x0074 }
            boolean r6 = r5.isEmpty()     // Catch:{ JSONException -> 0x0074 }
            if (r6 != 0) goto L_0x0071
            r2.add(r5)     // Catch:{ JSONException -> 0x0074 }
        L_0x0071:
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0074:
        L_0x0075:
            if (r1 == 0) goto L_0x0088
            goto L_0x0085
        L_0x0078:
            r0 = move-exception
            goto L_0x007c
        L_0x007a:
            r0 = move-exception
            r1 = r3
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.mo29731e()
        L_0x0081:
            throw r0
        L_0x0082:
            r1 = r3
        L_0x0083:
            if (r1 == 0) goto L_0x0088
        L_0x0085:
            r1.mo29731e()
        L_0x0088:
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x0092
            com.bytedance.jirafast.utils.C12074e.m35225b(r0, r2)
            goto L_0x0096
        L_0x0092:
            java.util.List r2 = com.bytedance.jirafast.utils.C12074e.m35222a(r0)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.mo29751b():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m35208b(com.bytedance.jirafast.models.C12010b r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.f32155c
            r0.append(r1)
            java.lang.String r1 = "/issue/"
            r0.append(r1)
            java.lang.String r1 = r5.f31942k
            r0.append(r1)
            java.lang.String r1 = "/attachments"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35139b(r0)     // Catch:{ HttpRequestException -> 0x006b, all -> 0x0063 }
            java.lang.String r2 = "X-Atlassian-Token"
            java.lang.String r3 = "no-check"
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29723a(r2, r3)     // Catch:{ HttpRequestException -> 0x006b, all -> 0x0063 }
            java.lang.String r2 = r4.f32156e     // Catch:{ HttpRequestException -> 0x006b, all -> 0x0063 }
            java.lang.String r3 = r4.f32157f     // Catch:{ HttpRequestException -> 0x006b, all -> 0x0063 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29725b(r2, r3)     // Catch:{ HttpRequestException -> 0x006b, all -> 0x0063 }
            java.util.List<java.lang.String> r5 = r5.f31943l     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            if (r5 == 0) goto L_0x0049
            r1 = 0
        L_0x0037:
            int r2 = r5.size()     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            if (r1 >= r2) goto L_0x0049
            java.lang.Object r2 = r5.get(r1)     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            m35207a(r2, r0)     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0049:
            boolean r5 = r0.mo29726b()     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            if (r5 == 0) goto L_0x0057
            if (r0 == 0) goto L_0x0054
            r0.mo29731e()
        L_0x0054:
            r5 = 200(0xc8, float:2.8E-43)
            return r5
        L_0x0057:
            int r5 = r0.mo29721a()     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0061 }
            if (r0 == 0) goto L_0x0060
            r0.mo29731e()
        L_0x0060:
            return r5
        L_0x0061:
            r5 = move-exception
            goto L_0x0065
        L_0x0063:
            r5 = move-exception
            r0 = r1
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.mo29731e()
        L_0x006a:
            throw r5
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.mo29731e()
        L_0x0071:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.m35208b(com.bytedance.jirafast.models.b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (r11 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r11 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r11.mo29731e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList<com.bytedance.jirafast.models.JIRAEpicLink> m35209b(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://jira.bytedance.com/rest/greenhopper/1.0/epics?searchQuery="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = "&projectKey="
            r0.append(r11)
            java.lang.String r11 = f32154d
            r0.append(r11)
            java.lang.String r11 = "&maxResults=100&hideDone=true&_="
            r0.append(r11)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            r4 = 1
            com.bytedance.jirafast.utils.JIRAHttpRequest r11 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35131a(r11, r4, r3)     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r11 = r11.mo29733g()     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            java.lang.String r3 = r10.f32156e     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            java.lang.String r4 = r10.f32157f     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r11 = r11.mo29725b(r3, r4)     // Catch:{ HttpRequestException -> 0x00a8, all -> 0x00a0 }
            java.lang.String r2 = r11.mo29732f()     // Catch:{ HttpRequestException -> 0x00a9, all -> 0x009e }
            boolean r3 = r11.mo29726b()     // Catch:{ HttpRequestException -> 0x00a9, all -> 0x009e }
            if (r3 == 0) goto L_0x009b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r2 = "epicLists"
            org.json.JSONArray r2 = r3.getJSONArray(r2)     // Catch:{ JSONException -> 0x009a }
            r3 = 0
        L_0x0054:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x009a }
            if (r3 >= r4) goto L_0x009b
            org.json.JSONObject r4 = r2.optJSONObject(r3)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r5 = "epicNames"
            org.json.JSONArray r4 = r4.getJSONArray(r5)     // Catch:{ JSONException -> 0x009a }
            r5 = 0
        L_0x0065:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x009a }
            if (r5 >= r6) goto L_0x0097
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x009a }
            if (r6 == 0) goto L_0x0094
            java.lang.String r7 = "name"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r8 = "key"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r9 = "isDone"
            boolean r6 = r6.getBoolean(r9)     // Catch:{ JSONException -> 0x009a }
            com.bytedance.jirafast.models.JIRAEpicLink r9 = new com.bytedance.jirafast.models.JIRAEpicLink     // Catch:{ JSONException -> 0x009a }
            r9.<init>()     // Catch:{ JSONException -> 0x009a }
            r9.setName(r7)     // Catch:{ JSONException -> 0x009a }
            r9.setKey(r8)     // Catch:{ JSONException -> 0x009a }
            r9.setDone(r6)     // Catch:{ JSONException -> 0x009a }
            r0.add(r9)     // Catch:{ JSONException -> 0x009a }
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x0065
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x009a:
        L_0x009b:
            if (r11 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x009e:
            r0 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r0 = move-exception
            r11 = r2
        L_0x00a2:
            if (r11 == 0) goto L_0x00a7
            r11.mo29731e()
        L_0x00a7:
            throw r0
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
        L_0x00ab:
            r11.mo29731e()
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.m35209b(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r8 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r8 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r8.mo29731e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.bytedance.jirafast.models.JIRAUser> mo29750a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f32155c
            r0.append(r1)
            java.lang.String r1 = "/user/assignable/multiProjectSearch"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 4
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            java.lang.String r4 = "username"
            r5 = 0
            r2[r5] = r4     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            r4 = 1
            r2[r4] = r8     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            r8 = 2
            java.lang.String r6 = "projectKeys"
            r2[r8] = r6     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            r8 = 3
            java.lang.String r6 = f32154d     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            r2[r8] = r6     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r8 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35131a(r0, r4, r2)     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r8 = r8.mo29733g()     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            java.lang.String r0 = r7.f32156e     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            java.lang.String r2 = r7.f32157f     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r8 = r8.mo29725b(r0, r2)     // Catch:{ HttpRequestException -> 0x008a, all -> 0x0082 }
            java.lang.String r0 = r8.mo29732f()     // Catch:{ HttpRequestException -> 0x008b, all -> 0x0080 }
            boolean r2 = r8.mo29726b()     // Catch:{ HttpRequestException -> 0x008b, all -> 0x0080 }
            if (r2 == 0) goto L_0x007d
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007c }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x007c }
        L_0x004d:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x007c }
            if (r5 >= r0) goto L_0x007d
            org.json.JSONObject r0 = r2.optJSONObject(r5)     // Catch:{ JSONException -> 0x007c }
            if (r0 == 0) goto L_0x0079
            java.lang.String r3 = "name"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r4 = "emailAddress"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r6 = "displayName"
            java.lang.String r0 = r0.optString(r6)     // Catch:{ JSONException -> 0x007c }
            boolean r6 = r3.isEmpty()     // Catch:{ JSONException -> 0x007c }
            if (r6 != 0) goto L_0x0079
            com.bytedance.jirafast.models.JIRAUser r6 = new com.bytedance.jirafast.models.JIRAUser     // Catch:{ JSONException -> 0x007c }
            r6.<init>(r3, r4, r0)     // Catch:{ JSONException -> 0x007c }
            r1.add(r6)     // Catch:{ JSONException -> 0x007c }
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x007c:
        L_0x007d:
            if (r8 == 0) goto L_0x0090
            goto L_0x008d
        L_0x0080:
            r0 = move-exception
            goto L_0x0084
        L_0x0082:
            r0 = move-exception
            r8 = r3
        L_0x0084:
            if (r8 == 0) goto L_0x0089
            r8.mo29731e()
        L_0x0089:
            throw r0
        L_0x008a:
            r8 = r3
        L_0x008b:
            if (r8 == 0) goto L_0x0090
        L_0x008d:
            r8.mo29731e()
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.mo29750a(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|8|9|(7:11|12|13|(2:15|(4:19|(2:21|(1:23)(1:27))(1:28)|(1:32)|33))|29|(0)|33)(3:34|35|(6:37|38|39|(3:41|(3:44|45|42)|64)|(1:48)|49)(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
        if (r0 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012f, code lost:
        if (r0 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r0.mo29731e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        return "问题创建失败";
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A[Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd A[SYNTHETIC, Splitter:B:34:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo29749a(com.bytedance.jirafast.models.C12010b r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.f32155c
            r0.append(r1)
            java.lang.String r1 = "/issue"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = com.bytedance.jirafast.utils.JIRAHttpRequest.m35139b(r0)     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29733g()     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            java.lang.String r2 = "application/json"
            java.lang.String r3 = "UTF-8"
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29728c(r2, r3)     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            java.lang.String r2 = r8.f32156e     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            java.lang.String r3 = r8.f32157f     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            com.bytedance.jirafast.utils.JIRAHttpRequest r0 = r0.mo29725b(r2, r3)     // Catch:{ HttpRequestException -> 0x012e, all -> 0x0126 }
            org.json.JSONObject r1 = r9.mo29660a()     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            java.lang.String r1 = r1.toString()     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r1.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x003e }
            int r2 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x003e }
            r0.mo29722a(r2)     // Catch:{ UnsupportedEncodingException -> 0x003e }
        L_0x003e:
            r0.mo29727c(r1)     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            java.lang.String r1 = r0.mo29732f()     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            boolean r2 = r0.mo29729c()     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            if (r2 == 0) goto L_0x00dd
            java.lang.String r2 = "问题创建成功"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d6 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "key"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x00d6 }
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x00d6 }
            if (r3 != 0) goto L_0x00d6
            r9.f31942k = r1     // Catch:{ JSONException -> 0x00d6 }
            java.util.List<java.lang.String> r1 = r9.f31943l     // Catch:{ JSONException -> 0x00d6 }
            if (r1 == 0) goto L_0x00d6
            java.util.List<java.lang.String> r1 = r9.f31943l     // Catch:{ JSONException -> 0x00d6 }
            int r1 = r1.size()     // Catch:{ JSONException -> 0x00d6 }
            if (r1 <= 0) goto L_0x00d6
            int r9 = r8.m35208b(r9)     // Catch:{ JSONException -> 0x00d6 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L_0x00c4
            r1 = 413(0x19d, float:5.79E-43)
            if (r9 == r1) goto L_0x00b2
            switch(r9) {
                case 403: goto L_0x00a0;
                case 404: goto L_0x008e;
                default: goto L_0x007b;
            }     // Catch:{ JSONException -> 0x00d6 }
        L_0x007b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d6 }
            r9.append(r2)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "\n图片或文件上传失败"
            r9.append(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x00d6 }
            r2 = r9
            goto L_0x00d6
        L_0x008e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d6 }
            r9.append(r2)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "\n图片或文件关联失败"
            r9.append(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x00d7
        L_0x00a0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d6 }
            r9.append(r2)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "\n上传权限问题"
            r9.append(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x00d7
        L_0x00b2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d6 }
            r9.append(r2)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "\n图片或文件大小超限"
            r9.append(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x00d7
        L_0x00c4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00d6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d6 }
            r9.append(r2)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r1 = "\n图片或文件上传成功"
            r9.append(r1)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x00d7
        L_0x00d6:
            r9 = r2
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.mo29731e()
        L_0x00dc:
            return r9
        L_0x00dd:
            boolean r9 = r0.mo29730d()     // Catch:{ HttpRequestException -> 0x012f, all -> 0x0124 }
            if (r9 == 0) goto L_0x0121
            java.lang.String r9 = ""
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011b }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x011b }
            java.lang.String r1 = "errors"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch:{ JSONException -> 0x011b }
            if (r1 == 0) goto L_0x011b
            java.util.Iterator r2 = r1.keys()     // Catch:{ JSONException -> 0x011b }
        L_0x00f6:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x011b }
            if (r3 == 0) goto L_0x011b
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x011b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x011b }
            java.lang.String r4 = r1.getString(r3)     // Catch:{ JSONException -> 0x011b }
            java.lang.String r5 = "\"%s\": %s\n"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x011b }
            r7 = 0
            r6[r7] = r3     // Catch:{ JSONException -> 0x011b }
            r3 = 1
            r6[r3] = r4     // Catch:{ JSONException -> 0x011b }
            java.lang.String r3 = com.C1642a.m8034a(r5, r6)     // Catch:{ JSONException -> 0x011b }
            java.lang.String r3 = r9.concat(r3)     // Catch:{ JSONException -> 0x011b }
            r9 = r3
            goto L_0x00f6
        L_0x011b:
            if (r0 == 0) goto L_0x0120
            r0.mo29731e()
        L_0x0120:
            return r9
        L_0x0121:
            if (r0 == 0) goto L_0x0134
            goto L_0x0131
        L_0x0124:
            r9 = move-exception
            goto L_0x0128
        L_0x0126:
            r9 = move-exception
            r0 = r1
        L_0x0128:
            if (r0 == 0) goto L_0x012d
            r0.mo29731e()
        L_0x012d:
            throw r9
        L_0x012e:
            r0 = r1
        L_0x012f:
            if (r0 == 0) goto L_0x0134
        L_0x0131:
            r0.mo29731e()
        L_0x0134:
            java.lang.String r9 = "问题创建失败"
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12069b.mo29749a(com.bytedance.jirafast.models.b):java.lang.String");
    }

    /* renamed from: a */
    private static void m35207a(String str, JIRAHttpRequest jIRAHttpRequest) {
        File file = new File(str);
        String name = file.getName();
        String[] split = name.split("\\.");
        String str2 = split[split.length - 1];
        String str3 = "";
        if (str2.equals("png")) {
            str3 = "image/png";
        } else if (str2.equals("jpg") || str2.equals("jpeg")) {
            str3 = "image/jpeg";
        } else if (str2.equals("gif")) {
            str3 = "image/gif";
        } else if (str2.equals("txt")) {
            str3 = "text/xml";
        }
        if (!str3.isEmpty()) {
            jIRAHttpRequest.mo29724a("file", name, str3, file);
        }
    }
}
