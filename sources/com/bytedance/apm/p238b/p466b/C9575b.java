package com.bytedance.apm.p238b.p466b;

import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.b.b */
public final class C9575b {

    /* renamed from: A */
    private int f26156A;

    /* renamed from: B */
    private int f26157B;

    /* renamed from: C */
    private long f26158C;

    /* renamed from: a */
    public long f26159a;

    /* renamed from: b */
    public long f26160b;

    /* renamed from: c */
    public int f26161c;

    /* renamed from: d */
    public int f26162d;

    /* renamed from: e */
    public long f26163e;

    /* renamed from: f */
    public long f26164f;

    /* renamed from: g */
    public long f26165g;

    /* renamed from: h */
    public long f26166h;

    /* renamed from: i */
    public long f26167i;

    /* renamed from: j */
    public long f26168j;

    /* renamed from: k */
    public long f26169k;

    /* renamed from: l */
    public long f26170l;

    /* renamed from: m */
    public long f26171m;

    /* renamed from: n */
    public long f26172n;

    /* renamed from: o */
    public boolean f26173o = true;

    /* renamed from: p */
    public String f26174p;

    /* renamed from: q */
    public String f26175q;

    /* renamed from: r */
    private long f26176r;

    /* renamed from: s */
    private long f26177s;

    /* renamed from: t */
    private int f26178t;

    /* renamed from: u */
    private int f26179u;

    /* renamed from: v */
    private int f26180v;

    /* renamed from: w */
    private int f26181w;

    /* renamed from: x */
    private long f26182x;

    /* renamed from: y */
    private int f26183y;

    /* renamed from: z */
    private int f26184z;

    /* renamed from: c */
    public final boolean mo23894c() {
        if (this.f26159a > 60000) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo23895d() {
        if (this.f26160b > 60000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23891a() {
        this.f26159a = 0;
        this.f26160b = 0;
        this.f26161c = 0;
        this.f26162d = 0;
        this.f26163e = 0;
        this.f26164f = 0;
        this.f26165g = 0;
        this.f26166h = 0;
        this.f26167i = 0;
        this.f26168j = 0;
        this.f26169k = 0;
        this.f26170l = 0;
        this.f26171m = 0;
        this.f26172n = 0;
        this.f26173o = true;
        this.f26174p = "";
        this.f26175q = "";
    }

    /* renamed from: b */
    public final void mo23893b() {
        this.f26166h = (long) this.f26178t;
        this.f26163e = (long) this.f26181w;
        this.f26164f = (long) this.f26179u;
        this.f26167i = this.f26182x;
        this.f26165g = (long) this.f26180v;
        this.f26159a = this.f26176r;
        this.f26171m = (long) this.f26183y;
        this.f26168j = (long) this.f26157B;
        this.f26169k = (long) this.f26184z;
        this.f26172n = this.f26158C;
        this.f26170l = (long) this.f26156A;
        this.f26160b = this.f26177s;
        this.f26173o = false;
        this.f26174p = "all_process";
        try {
            mo23892a(false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo23892a(boolean z) throws Exception {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        if (mo23894c()) {
            jSONObject.put("front_alarm", this.f26166h);
            jSONObject.put("front_location_p_time", this.f26164f / 1000);
            jSONObject.put("front_power_p_time", this.f26165g / 1000);
            if (this.f26163e >= 0) {
                jSONObject.put("front_cpu_active_time_p_time", this.f26163e / 1000);
                if (this.f26167i >= 0) {
                    if (!z) {
                        jSONObject.put("front_traffic_p_capacity", this.f26167i / 1024);
                    }
                    double d = (double) this.f26166h;
                    Double.isNaN(d);
                    double d2 = d * 0.002083333383779973d;
                    double d3 = (double) this.f26163e;
                    Double.isNaN(d3);
                    double d4 = d2 + (d3 * 6.944444612599909E-5d);
                    double d5 = (double) this.f26164f;
                    Double.isNaN(d5);
                    double d6 = d4 + (d5 * 7.499999810534064E-6d);
                    double d7 = (double) this.f26165g;
                    Double.isNaN(d7);
                    double d8 = d6 + (d7 * 6.944444521650439E-6d);
                    if (!z) {
                        double d9 = (double) this.f26167i;
                        Double.isNaN(d9);
                        d8 += d9 * 5.464481073431671E-4d;
                    }
                    if (d8 >= 0.0d) {
                        jSONObject.put("front_score", d8);
                        jSONObject.put("front_p_time", this.f26159a / 1000);
                        float f = 60000.0f / ((float) this.f26159a);
                        jSONObject.put("front_alarm_per_min", (double) (((float) this.f26166h) * f));
                        jSONObject.put("front_location_per_min_p_time", (double) (((float) (this.f26164f / 1000)) * f));
                        jSONObject.put("front_power_per_min_p_time", (double) (((float) (this.f26165g / 1000)) * f));
                        jSONObject.put("front_cpu_active_time_per_min_p_time", (double) (((float) (this.f26163e / 1000)) * f));
                        if (!z) {
                            jSONObject.put("front_traffic_per_min_p_capacity", (double) (((float) (this.f26167i / 1024)) * f));
                        }
                        double d10 = (double) f;
                        Double.isNaN(d10);
                        jSONObject.put("front_score_per_min", d8 * d10);
                        if (z) {
                            this.f26178t = (int) (((long) this.f26178t) + this.f26166h);
                            this.f26181w = (int) (((long) this.f26181w) + this.f26163e);
                            this.f26179u = (int) (((long) this.f26179u) + this.f26164f);
                            this.f26180v = (int) (((long) this.f26180v) + this.f26165g);
                            if (this.f26173o) {
                                this.f26182x = this.f26167i;
                            }
                            if (this.f26173o) {
                                this.f26176r = this.f26159a;
                            }
                        }
                    } else if (C6174c.m19149g()) {
                        StringBuilder sb = new StringBuilder(" report data invalid, frontScore < 0 : ");
                        sb.append(d8);
                        String[] strArr = {sb.toString()};
                    }
                } else if (C6174c.m19149g()) {
                    StringBuilder sb2 = new StringBuilder(" report data invalid, mFrontTrafficBytes < 0 : ");
                    sb2.append(this.f26167i);
                    String[] strArr2 = {sb2.toString()};
                }
            } else if (C6174c.m19149g()) {
                StringBuilder sb3 = new StringBuilder(" report data invalid, frontCpuMs < 0 : ");
                sb3.append(this.f26163e);
                String[] strArr3 = {sb3.toString()};
            }
            z2 = false;
            if (!z2 && C6174c.m19149g()) {
                StringBuilder sb4 = new StringBuilder("stats report failed, processName: ");
                sb4.append(this.f26174p);
                String[] strArr4 = {sb4.toString()};
            }
            mo23891a();
            return z2;
        }
        if (mo23895d()) {
            jSONObject.put("back_alarm", this.f26171m);
            jSONObject.put("back_location_p_time", this.f26169k / 1000);
            jSONObject.put("back_power_p_time", this.f26170l / 1000);
            if (this.f26168j >= 0) {
                jSONObject.put("back_cpu_active_time_p_time", this.f26168j / 1000);
                if (this.f26172n >= 0) {
                    if (!z) {
                        jSONObject.put("back_traffic_p_capacity", this.f26172n / 1024);
                    }
                    double d11 = (double) this.f26171m;
                    Double.isNaN(d11);
                    double d12 = d11 * 0.002083333383779973d;
                    double d13 = (double) this.f26168j;
                    Double.isNaN(d13);
                    double d14 = d12 + (d13 * 6.944444612599909E-5d);
                    double d15 = (double) this.f26169k;
                    Double.isNaN(d15);
                    double d16 = d14 + (d15 * 7.499999810534064E-6d);
                    double d17 = (double) this.f26170l;
                    Double.isNaN(d17);
                    double d18 = d16 + (d17 * 6.944444521650439E-6d);
                    if (!z) {
                        double d19 = (double) this.f26172n;
                        Double.isNaN(d19);
                        d18 += d19 * 5.464481073431671E-4d;
                    }
                    jSONObject.put("back_score", d18);
                    jSONObject.put("back_p_time", this.f26160b / 1000);
                    float f2 = 60000.0f / ((float) this.f26160b);
                    jSONObject.put("back_alarm_per_min", (double) (((float) this.f26171m) * f2));
                    jSONObject.put("back_location_per_min_p_time", (double) (((float) (this.f26169k / 1000)) * f2));
                    jSONObject.put("back_power_per_min_p_time", (double) (((float) (this.f26170l / 1000)) * f2));
                    jSONObject.put("back_cpu_active_time_per_min_p_time", (double) (((float) (this.f26168j / 1000)) * f2));
                    if (!z) {
                        jSONObject.put("back_traffic_per_min_p_capacity", (double) (((float) (this.f26172n / 1024)) * f2));
                    }
                    double d20 = (double) f2;
                    Double.isNaN(d20);
                    jSONObject.put("back_score_per_min", d18 * d20);
                    if (z) {
                        this.f26183y = (int) (((long) this.f26183y) + this.f26171m);
                        this.f26157B = (int) (((long) this.f26157B) + this.f26168j);
                        this.f26184z = (int) (((long) this.f26184z) + this.f26169k);
                        this.f26156A = (int) (((long) this.f26156A) + this.f26170l);
                        if (this.f26173o) {
                            this.f26158C = this.f26172n;
                        }
                        if (this.f26160b > this.f26177s) {
                            this.f26177s = this.f26160b;
                        }
                    }
                } else if (C6174c.m19149g()) {
                    StringBuilder sb5 = new StringBuilder(" report data invalid, mBackTrafficBytes < 0 : ");
                    sb5.append(this.f26172n);
                    String[] strArr5 = {sb5.toString()};
                }
            } else if (C6174c.m19149g()) {
                StringBuilder sb6 = new StringBuilder(" report data invalid, mBackCpuMs < 0 : ");
                sb6.append(this.f26168j);
                String[] strArr6 = {sb6.toString()};
            }
            z2 = false;
            StringBuilder sb42 = new StringBuilder("stats report failed, processName: ");
            sb42.append(this.f26174p);
            String[] strArr42 = {sb42.toString()};
            mo23891a();
            return z2;
        }
        if (jSONObject.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.f26173o);
            jSONObject2.put("process_name", this.f26174p);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sid", this.f26175q);
            C6159b.m19118b("battery", jSONObject, jSONObject2, jSONObject3);
            if (C6174c.m19149g()) {
                StringBuilder sb7 = new StringBuilder("stats report, processName: ");
                sb7.append(this.f26174p);
                String[] strArr7 = {sb7.toString()};
            }
            z2 = true;
            StringBuilder sb422 = new StringBuilder("stats report failed, processName: ");
            sb422.append(this.f26174p);
            String[] strArr422 = {sb422.toString()};
            mo23891a();
            return z2;
        }
        z2 = false;
        StringBuilder sb4222 = new StringBuilder("stats report failed, processName: ");
        sb4222.append(this.f26174p);
        String[] strArr4222 = {sb4222.toString()};
        mo23891a();
        return z2;
    }
}
