package com.p280ss.android.downloadlib.addownload;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.network.NetworkQuality;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.e */
public final class C19475e {

    /* renamed from: a */
    private static C19478b f52726a;

    /* renamed from: b */
    private static C19479c f52727b;

    /* renamed from: com.ss.android.downloadlib.addownload.e$a */
    static class C19477a implements C20281h {

        /* renamed from: a */
        private final String f52729a;

        /* renamed from: b */
        private C19478b f52730b;

        /* renamed from: a */
        public final int mo51487a(long j) {
            if (!C19523h.m64332c(this.f52729a) || this.f52730b == null) {
                return 1;
            }
            return this.f52730b.mo51487a(j);
        }

        public C19477a(C19478b bVar, String str) {
            this.f52730b = bVar;
            this.f52729a = str;
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.e$b */
    static class C19478b implements C20281h {

        /* renamed from: a */
        private int f52731a;

        /* renamed from: b */
        private ArrayList<int[]> f52732b = new ArrayList<>();

        /* renamed from: a */
        private boolean m64079a() {
            if (this.f52731a == 1 || this.f52731a == 3) {
                return true;
            }
            return false;
        }

        public C19478b(C19495l lVar) {
            m64078a(lVar);
        }

        /* renamed from: a */
        private void m64078a(C19495l lVar) {
            this.f52731a = lVar.mo51596a("is_open_exp", 0);
            m64080b(lVar);
        }

        /* renamed from: a */
        private int m64077a(int i) {
            for (int i2 = 0; i2 < this.f52732b.size(); i2++) {
                int[] iArr = (int[]) this.f52732b.get(i2);
                if (i >= iArr[1] && i < iArr[2]) {
                    return iArr[0];
                }
            }
            return 1;
        }

        /* renamed from: a */
        public final int mo51487a(long j) {
            if (m64079a()) {
                return m64077a((int) (j / 1048576));
            }
            return 1;
        }

        /* renamed from: b */
        private void m64080b(C19495l lVar) {
            if (lVar != null && lVar.mo51601c("download_chunk_config")) {
                String obj = lVar.mo51600b("download_chunk_config").toString();
                if (!TextUtils.isEmpty(obj)) {
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(obj);
                    } catch (Exception unused) {
                    }
                    if (jSONObject != null) {
                        String[] strArr = new String[5];
                        String[][] strArr2 = new String[5][];
                        strArr[1] = jSONObject.optString("download_chunk_1");
                        strArr[2] = jSONObject.optString("download_chunk_2");
                        strArr[3] = jSONObject.optString("download_chunk_3");
                        strArr[4] = jSONObject.optString("download_chunk_4");
                        for (int i = 1; i < 5; i++) {
                            if (!TextUtils.isEmpty(strArr[i])) {
                                strArr2[i] = strArr[i].split(",");
                                for (int i2 = 0; i2 < strArr2[i].length - 1; i2 += 2) {
                                    this.f52732b.add(new int[]{i, Integer.parseInt(strArr2[i][i2]), Integer.parseInt(strArr2[i][i2 + 1])});
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.e$c */
    static class C19479c implements C20280g {

        /* renamed from: a */
        private int f52733a;

        /* renamed from: b */
        private ArrayList<int[]> f52734b = new ArrayList<>();

        /* renamed from: a */
        private boolean m64083a() {
            if (this.f52733a == 2 || this.f52733a == 3) {
                return true;
            }
            return false;
        }

        public C19479c(C19495l lVar) {
            m64082a(lVar);
        }

        /* renamed from: a */
        private void m64082a(C19495l lVar) {
            this.f52733a = lVar.mo51596a("is_open_exp", 0);
            m64085b(lVar);
        }

        /* renamed from: b */
        private void m64085b(C19495l lVar) {
            if (lVar != null && lVar.mo51601c("download_chunk_config")) {
                String obj = lVar.mo51600b("download_chunk_config").toString();
                if (!TextUtils.isEmpty(obj)) {
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(obj);
                    } catch (Exception unused) {
                    }
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("network_quality_operation");
                        String optString2 = jSONObject.optString("network_quality_operand");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            String[] split = optString.split(",");
                            String[] split2 = optString2.split(",");
                            if (split.length >= 5 && split2.length >= 5) {
                                for (int i = 0; i < 5; i++) {
                                    this.f52734b.add(new int[]{Integer.parseInt(split[i]), Integer.parseInt(split2[i])});
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final int mo51549a(int i, NetworkQuality networkQuality) {
            if (m64083a()) {
                return m64084b(i, networkQuality);
            }
            return i;
        }

        /* renamed from: b */
        private int m64084b(int i, NetworkQuality networkQuality) {
            if (this.f52734b.size() < 5) {
                return i;
            }
            int[] iArr = null;
            switch (networkQuality) {
                case POOR:
                    iArr = (int[]) this.f52734b.get(0);
                    break;
                case MODERATE:
                    iArr = (int[]) this.f52734b.get(1);
                    break;
                case GOOD:
                    iArr = (int[]) this.f52734b.get(2);
                    break;
                case EXCELLENT:
                    iArr = (int[]) this.f52734b.get(3);
                    break;
                case UNKNOWN:
                    iArr = (int[]) this.f52734b.get(4);
                    break;
            }
            if (iArr == null || iArr.length < 2) {
                return i;
            }
            switch (iArr[0]) {
                case 1:
                    i += iArr[1];
                    break;
                case 2:
                    i -= iArr[1];
                    break;
                case 3:
                    i = iArr[1];
                    break;
            }
            if (i > 1) {
                return i;
            }
            return 1;
        }
    }

    /* renamed from: b */
    public static C20281h m64074b(C19495l lVar) {
        return new C19478b(lVar);
    }

    /* renamed from: c */
    public static C20280g m64075c(C19495l lVar) {
        return new C19479c(lVar);
    }

    /* renamed from: a */
    public static C20280g m64072a(C19495l lVar) {
        if (f52727b == null) {
            f52727b = new C19479c(lVar);
        }
        return f52727b;
    }

    /* renamed from: a */
    public static C20281h m64073a(String str) {
        if (f52726a == null) {
            f52726a = new C19478b(C19495l.m64242a());
        }
        return new C19477a(f52726a, str);
    }
}
