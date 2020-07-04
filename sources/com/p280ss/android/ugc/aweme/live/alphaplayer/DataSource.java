package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.DataSource */
public final class DataSource {

    /* renamed from: a */
    public static String f84623a = "";

    /* renamed from: b */
    public boolean f84624b;

    /* renamed from: c */
    public String f84625c;

    /* renamed from: d */
    public long f84626d;

    /* renamed from: e */
    private String f84627e;

    /* renamed from: f */
    private JSONObject f84628f;

    /* renamed from: g */
    private String f84629g;

    /* renamed from: h */
    private String f84630h;

    /* renamed from: i */
    private ScaleType f84631i;

    /* renamed from: j */
    private ScaleType f84632j;

    /* renamed from: k */
    private String f84633k;

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType */
    public enum ScaleType {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);
        
        int index;

        public static ScaleType convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case 5:
                    return LeftFill;
                case 6:
                    return RightFill;
                case 7:
                    return TopFit;
                case 8:
                    return BottomFit;
                case 9:
                    return LeftFit;
                case 10:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        private ScaleType(int i) {
            this.index = i;
        }
    }

    /* renamed from: a */
    public final DataSource mo83673a(long j) {
        this.f84626d = j;
        return this;
    }

    /* renamed from: b */
    private void m105083b(String str) {
        this.f84627e = str;
        try {
            this.f84628f = new JSONObject(str);
            this.f84624b = true;
        } catch (JSONException e) {
            this.f84625c = Log.getStackTraceString(e);
            this.f84624b = false;
        }
    }

    /* renamed from: b */
    public final ScaleType mo83676b(int i) {
        if (this.f84631i == null || this.f84632j == null) {
            String str = "landscape";
            if (1 == i) {
                str = "portrait";
            }
            try {
                return ScaleType.convertFrom(this.f84628f.getJSONObject(str).getInt("align"));
            } catch (JSONException e) {
                this.f84625c = Log.getStackTraceString(e);
                return ScaleType.ScaleAspectFill;
            }
        } else if (1 == i) {
            return this.f84631i;
        } else {
            return this.f84632j;
        }
    }

    /* renamed from: a */
    public final String mo83675a(int i) {
        if (TextUtils.isEmpty(this.f84629g) || TextUtils.isEmpty(this.f84630h)) {
            String str = "landscape";
            if (1 == i) {
                str = "portrait";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f84633k);
                sb.append(File.separator);
                sb.append(this.f84628f.getJSONObject(str).getString("path"));
                return sb.toString();
            } catch (JSONException e) {
                this.f84625c = Log.getStackTraceString(e);
                return "";
            }
        } else if (1 == i) {
            return this.f84629g;
        } else {
            return this.f84630h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r3 = r0;
        r0 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r3 = r0;
        r0 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        r4.f84625c = android.util.Log.getStackTraceString(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[ExcHandler: all (r0v16 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:14:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096 A[Catch:{ IOException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac A[SYNTHETIC, Splitter:B:46:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4 A[Catch:{ IOException -> 0x00b0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource mo83674a(java.lang.String r5) {
        /*
            r4 = this;
            r4.f84633k = r5
            java.lang.String r5 = r4.f84633k
            java.lang.String r0 = java.io.File.separator
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L_0x0020
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r4.f84633k
        L_0x0013:
            r5.append(r0)
            java.lang.String r0 = "config.json"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x002d
        L_0x0020:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r4.f84633k
            r5.append(r0)
            java.lang.String r0 = java.io.File.separator
            goto L_0x0013
        L_0x002d:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.f84633k
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00bf
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0080 }
            java.lang.String r2 = "UTF-8"
            r5.<init>(r1, r2)     // Catch:{ IOException -> 0x0080 }
            int r2 = r1.available()     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            char[] r2 = new char[r2]     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            r5.read(r2)     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r5.close()     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r1.close()     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r5.close()     // Catch:{ IOException -> 0x0068 }
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0099
        L_0x0068:
            r5 = move-exception
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            r4.f84625c = r5
            goto L_0x0099
        L_0x0070:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x0089
        L_0x0075:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x00aa
        L_0x007a:
            r2 = move-exception
            r3 = r0
            r0 = r5
            r5 = r2
            r2 = r3
            goto L_0x0089
        L_0x0080:
            r5 = move-exception
            r2 = r0
            goto L_0x0089
        L_0x0083:
            r5 = move-exception
            r1 = r0
            goto L_0x00aa
        L_0x0086:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x0089:
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x00a9 }
            r4.f84625c = r5     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0099:
            if (r2 == 0) goto L_0x00a4
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
            r4.m105083b(r5)
            goto L_0x00d9
        L_0x00a4:
            java.lang.String r5 = "read file by FileInputStream failure."
            r4.f84625c = r5
            goto L_0x00d9
        L_0x00a9:
            r5 = move-exception
        L_0x00aa:
            if (r0 == 0) goto L_0x00b2
            r0.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b2
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b2:
            if (r1 == 0) goto L_0x00be
            r1.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00be
        L_0x00b8:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r4.f84625c = r0
        L_0x00be:
            throw r5
        L_0x00bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "resourceDir or resPath is not exist. resourceDir: "
            r0.<init>(r1)
            java.lang.String r1 = r4.f84633k
            r0.append(r1)
            java.lang.String r1 = ", resPath: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.f84625c = r5
        L_0x00d9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.mo83674a(java.lang.String):com.ss.android.ugc.aweme.live.alphaplayer.DataSource");
    }
}
