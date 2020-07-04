package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.views.FpsRecyclerView */
public class FpsRecyclerView extends RecyclerView {

    /* renamed from: M */
    private JSONObject f112251M;

    /* renamed from: N */
    private long f112252N = -1;

    /* renamed from: O */
    public boolean f112253O;

    /* renamed from: P */
    private long f112254P;

    /* renamed from: Q */
    private long f112255Q;

    /* renamed from: R */
    private int f112256R;

    /* renamed from: S */
    private int f112257S;

    /* renamed from: T */
    private int f112258T;

    /* renamed from: U */
    private long f112259U = Long.MIN_VALUE;

    /* renamed from: V */
    private String f112260V = "unKnown";

    /* renamed from: o */
    private void m137583o() {
        if (C6399b.m19928c()) {
            this.f112251M = new JSONObject();
            mo5528a((C1281m) new C1281m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        FpsRecyclerView.this.f112253O = false;
                        FpsRecyclerView.this.mo61102n();
                        return;
                    }
                    FpsRecyclerView.this.f112253O = true;
                }

                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                }
            });
        }
    }

    /* renamed from: p */
    private void m137584p() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f112252N == -1) {
            this.f112252N = currentTimeMillis;
            return;
        }
        long j = currentTimeMillis - this.f112252N;
        if (j > this.f112259U) {
            this.f112259U = j;
        }
        if (j > 64) {
            this.f112258T++;
        } else if (j > 32) {
            this.f112257S++;
        } else if (j > 16) {
            this.f112256R++;
        }
        this.f112254P += currentTimeMillis - this.f112252N;
        this.f112255Q++;
        this.f112252N = currentTimeMillis;
    }

    /* renamed from: n */
    public final void mo61102n() {
        String str;
        if (this.f112254P != 0 && this.f112255Q != 0 && this.f112251M != null) {
            long j = (this.f112255Q * 1000) / this.f112254P;
            try {
                this.f112251M.put("average", j);
                this.f112251M.put("Max", this.f112259U);
                this.f112251M.put("GT16", ((long) (this.f112256R * 100)) / this.f112255Q);
                this.f112251M.put("GT32", ((long) (this.f112257S * 100)) / this.f112255Q);
                this.f112251M.put("GT64", ((long) (this.f112258T * 100)) / this.f112255Q);
                m137582a("aweme_fps_data", this.f112260V, this.f112251M);
            } catch (JSONException unused) {
            }
            StringBuilder sb = new StringBuilder("tab:");
            if (this.f112260V != null) {
                str = this.f112260V;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("; totalNum:");
            sb.append(this.f112255Q);
            sb.append("; average:");
            sb.append(j);
            sb.append("; Max:");
            sb.append(this.f112259U);
            sb.append("; GT16:");
            sb.append(((long) (this.f112256R * 100)) / this.f112255Q);
            sb.append("; GT32:");
            sb.append(((long) (this.f112257S * 100)) / this.f112255Q);
            sb.append("; GT64:");
            sb.append(((long) (this.f112258T * 100)) / this.f112255Q);
            this.f112254P = 0;
            this.f112255Q = 0;
            this.f112252N = -1;
            this.f112256R = 0;
            this.f112257S = 0;
            this.f112258T = 0;
            this.f112259U = Long.MIN_VALUE;
        }
    }

    public void setLabel(String str) {
        this.f112260V = str;
    }

    public FpsRecyclerView(Context context) {
        super(context);
        m137583o();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (C6399b.m19928c() && this.f112253O) {
            m137584p();
        }
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m137583o();
    }

    /* renamed from: a */
    private static void m137582a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m137583o();
    }
}
