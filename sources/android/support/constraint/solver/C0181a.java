package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import java.util.Arrays;

/* renamed from: android.support.constraint.solver.a */
public final class C0181a {

    /* renamed from: a */
    int f603a;

    /* renamed from: b */
    private final C0182b f604b;

    /* renamed from: c */
    private final C0183c f605c;

    /* renamed from: d */
    private int f606d = 8;

    /* renamed from: e */
    private SolverVariable f607e;

    /* renamed from: f */
    private int[] f608f = new int[this.f606d];

    /* renamed from: g */
    private int[] f609g = new int[this.f606d];

    /* renamed from: h */
    private float[] f610h = new float[this.f606d];

    /* renamed from: i */
    private int f611i = -1;

    /* renamed from: j */
    private int f612j = -1;

    /* renamed from: k */
    private boolean f613k;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo457a(SolverVariable solverVariable, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f611i == -1) {
                this.f611i = 0;
                this.f610h[this.f611i] = f;
                this.f608f[this.f611i] = solverVariable.f594b;
                this.f609g[this.f611i] = -1;
                solverVariable.f602j++;
                solverVariable.mo445a(this.f604b);
                this.f603a++;
                if (!this.f613k) {
                    this.f612j++;
                    if (this.f612j >= this.f608f.length) {
                        this.f613k = true;
                        this.f612j = this.f608f.length - 1;
                    }
                }
                return;
            }
            int i = this.f611i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f603a) {
                if (this.f608f[i] == solverVariable.f594b) {
                    float[] fArr = this.f610h;
                    fArr[i] = fArr[i] + f;
                    if (this.f610h[i] == 0.0f) {
                        if (i == this.f611i) {
                            this.f611i = this.f609g[i];
                        } else {
                            int[] iArr = this.f609g;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            solverVariable.mo447b(this.f604b);
                        }
                        if (this.f613k) {
                            this.f612j = i;
                        }
                        solverVariable.f602j--;
                        this.f603a--;
                    }
                    return;
                }
                if (this.f608f[i] < solverVariable.f594b) {
                    i3 = i;
                }
                i = this.f609g[i];
                i2++;
            }
            int i4 = this.f612j + 1;
            if (this.f613k) {
                if (this.f608f[this.f612j] == -1) {
                    i4 = this.f612j;
                } else {
                    i4 = this.f608f.length;
                }
            }
            if (i4 >= this.f608f.length && this.f603a < this.f608f.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f608f.length) {
                        break;
                    } else if (this.f608f[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f608f.length) {
                i4 = this.f608f.length;
                this.f606d *= 2;
                this.f613k = false;
                this.f612j = i4 - 1;
                this.f610h = Arrays.copyOf(this.f610h, this.f606d);
                this.f608f = Arrays.copyOf(this.f608f, this.f606d);
                this.f609g = Arrays.copyOf(this.f609g, this.f606d);
            }
            this.f608f[i4] = solverVariable.f594b;
            this.f610h[i4] = f;
            if (i3 != -1) {
                int[] iArr2 = this.f609g;
                iArr2[i4] = iArr2[i3];
                this.f609g[i3] = i4;
            } else {
                this.f609g[i4] = this.f611i;
                this.f611i = i4;
            }
            solverVariable.f602j++;
            solverVariable.mo445a(this.f604b);
            this.f603a++;
            if (!this.f613k) {
                this.f612j++;
            }
            if (this.f612j >= this.f608f.length) {
                this.f613k = true;
                this.f612j = this.f608f.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo460a(SolverVariable solverVariable) {
        if (this.f611i == -1) {
            return false;
        }
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            if (this.f608f[i] == solverVariable.f594b) {
                return true;
            }
            i = this.f609g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo458a(C0182b bVar, C0182b bVar2, boolean z) {
        int i = this.f611i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f603a) {
                if (this.f608f[i] == bVar2.f614a.f594b) {
                    float f = this.f610h[i];
                    mo450a(bVar2.f614a, false);
                    C0181a aVar = bVar2.f617d;
                    int i3 = aVar.f611i;
                    int i4 = 0;
                    while (i3 != -1 && i4 < aVar.f603a) {
                        mo457a(this.f605c.f621c[aVar.f608f[i3]], aVar.f610h[i3] * f, false);
                        i3 = aVar.f609g[i3];
                        i4++;
                    }
                    bVar.f615b += bVar2.f615b * f;
                    i = this.f611i;
                } else {
                    i = this.f609g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo459a(C0182b bVar, C0182b[] bVarArr) {
        int i = this.f611i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f603a) {
                SolverVariable solverVariable = this.f605c.f621c[this.f608f[i]];
                if (solverVariable.f595c != -1) {
                    float f = this.f610h[i];
                    mo450a(solverVariable, true);
                    C0182b bVar2 = bVarArr[solverVariable.f595c];
                    if (!bVar2.f618e) {
                        C0181a aVar = bVar2.f617d;
                        int i3 = aVar.f611i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f603a) {
                            mo457a(this.f605c.f621c[aVar.f608f[i3]], aVar.f610h[i3] * f, true);
                            i3 = aVar.f609g[i3];
                            i4++;
                        }
                    }
                    bVar.f615b += bVar2.f615b * f;
                    bVar2.f614a.mo447b(bVar);
                    i = this.f611i;
                } else {
                    i = this.f609g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo454a() {
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            SolverVariable solverVariable = this.f605c.f621c[this.f608f[i]];
            if (solverVariable != null) {
                solverVariable.mo447b(this.f604b);
            }
            i = this.f609g[i];
            i2++;
        }
        this.f611i = -1;
        this.f612j = -1;
        this.f613k = false;
        this.f603a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo463b() {
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            float[] fArr = this.f610h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f609g[i];
            i2++;
        }
    }

    public final String toString() {
        String str = "";
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f610h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f605c.f621c[this.f608f[i]]);
            str = sb5.toString();
            i = this.f609g[i];
            i2++;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SolverVariable mo451a(int i) {
        int i2 = this.f611i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f603a) {
            if (i3 == i) {
                return this.f605c.f621c[this.f608f[i2]];
            }
            i2 = this.f609g[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo461b(int i) {
        int i2 = this.f611i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f603a) {
            if (i3 == i) {
                return this.f610h[i2];
            }
            i2 = this.f609g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo462b(SolverVariable solverVariable) {
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            if (this.f608f[i] == solverVariable.f594b) {
                return this.f610h[i];
            }
            i = this.f609g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.constraint.solver.SolverVariable mo452a(android.support.constraint.solver.C0185e r15) {
        /*
            r14 = this;
            int r0 = r14.f611i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x009c
            int r9 = r14.f603a
            if (r2 >= r9) goto L_0x009c
            float[] r9 = r14.f610h
            r9 = r9[r0]
            android.support.constraint.solver.c r10 = r14.f605c
            android.support.constraint.solver.SolverVariable[] r10 = r10.f621c
            int[] r11 = r14.f608f
            r11 = r11[r0]
            r10 = r10[r11]
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0046
            float[] r9 = r14.f610h
            r9[r0] = r3
            android.support.constraint.solver.b r9 = r14.f604b
            r10.mo447b(r9)
        L_0x0033:
            r9 = 0
            goto L_0x0046
        L_0x0035:
            r11 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0046
            float[] r9 = r14.f610h
            r9[r0] = r3
            android.support.constraint.solver.b r9 = r14.f604b
            r10.mo447b(r9)
            goto L_0x0033
        L_0x0046:
            r11 = 1
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x0094
            android.support.constraint.solver.SolverVariable$Type r12 = r10.f599g
            android.support.constraint.solver.SolverVariable$Type r13 = android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED
            if (r12 != r13) goto L_0x0070
            if (r1 != 0) goto L_0x005b
            boolean r1 = m533a(r10, r15)
        L_0x0057:
            r6 = r1
            r5 = r9
            r1 = r10
            goto L_0x0094
        L_0x005b:
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0064
            boolean r1 = m533a(r10, r15)
            goto L_0x0057
        L_0x0064:
            if (r6 != 0) goto L_0x0094
            boolean r12 = m533a(r10, r15)
            if (r12 == 0) goto L_0x0094
            r5 = r9
            r1 = r10
            r6 = 1
            goto L_0x0094
        L_0x0070:
            if (r1 != 0) goto L_0x0094
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x0094
            if (r4 != 0) goto L_0x0080
            boolean r4 = m533a(r10, r15)
        L_0x007c:
            r8 = r4
            r7 = r9
            r4 = r10
            goto L_0x0094
        L_0x0080:
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0089
            boolean r4 = m533a(r10, r15)
            goto L_0x007c
        L_0x0089:
            if (r8 != 0) goto L_0x0094
            boolean r12 = m533a(r10, r15)
            if (r12 == 0) goto L_0x0094
            r7 = r9
            r4 = r10
            r8 = 1
        L_0x0094:
            int[] r9 = r14.f609g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x009c:
            if (r1 == 0) goto L_0x009f
            return r1
        L_0x009f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.C0181a.mo452a(android.support.constraint.solver.e):android.support.constraint.solver.SolverVariable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo455a(float f) {
        int i = this.f611i;
        int i2 = 0;
        while (i != -1 && i2 < this.f603a) {
            float[] fArr = this.f610h;
            fArr[i] = fArr[i] / f;
            i = this.f609g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private static boolean m533a(SolverVariable solverVariable, C0185e eVar) {
        if (solverVariable.f602j <= 1) {
            return true;
        }
        return false;
    }

    C0181a(C0182b bVar, C0183c cVar) {
        this.f604b = bVar;
        this.f605c = cVar;
    }

    /* renamed from: a */
    public final float mo450a(SolverVariable solverVariable, boolean z) {
        if (this.f607e == solverVariable) {
            this.f607e = null;
        }
        if (this.f611i == -1) {
            return 0.0f;
        }
        int i = this.f611i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f603a) {
            if (this.f608f[i] == solverVariable.f594b) {
                if (i == this.f611i) {
                    this.f611i = this.f609g[i];
                } else {
                    int[] iArr = this.f609g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo447b(this.f604b);
                }
                solverVariable.f602j--;
                this.f603a--;
                this.f608f[i] = -1;
                if (this.f613k) {
                    this.f612j = i;
                }
                return this.f610h[i];
            }
            i2++;
            i3 = i;
            i = this.f609g[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SolverVariable mo453a(boolean[] zArr, SolverVariable solverVariable) {
        int i = this.f611i;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f603a) {
            if (this.f610h[i] < 0.0f) {
                SolverVariable solverVariable3 = this.f605c.f621c[this.f608f[i]];
                if ((zArr == null || !zArr[solverVariable3.f594b]) && solverVariable3 != solverVariable && (solverVariable3.f599g == Type.SLACK || solverVariable3.f599g == Type.ERROR)) {
                    float f2 = this.f610h[i];
                    if (f2 < f) {
                        solverVariable2 = solverVariable3;
                        f = f2;
                    }
                }
            }
            i = this.f609g[i];
            i2++;
        }
        return solverVariable2;
    }

    /* renamed from: a */
    public final void mo456a(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            mo450a(solverVariable, true);
        } else if (this.f611i == -1) {
            this.f611i = 0;
            this.f610h[this.f611i] = f;
            this.f608f[this.f611i] = solverVariable.f594b;
            this.f609g[this.f611i] = -1;
            solverVariable.f602j++;
            solverVariable.mo445a(this.f604b);
            this.f603a++;
            if (!this.f613k) {
                this.f612j++;
                if (this.f612j >= this.f608f.length) {
                    this.f613k = true;
                    this.f612j = this.f608f.length - 1;
                }
            }
        } else {
            int i = this.f611i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f603a) {
                if (this.f608f[i] == solverVariable.f594b) {
                    this.f610h[i] = f;
                    return;
                }
                if (this.f608f[i] < solverVariable.f594b) {
                    i3 = i;
                }
                i = this.f609g[i];
                i2++;
            }
            int i4 = this.f612j + 1;
            if (this.f613k) {
                if (this.f608f[this.f612j] == -1) {
                    i4 = this.f612j;
                } else {
                    i4 = this.f608f.length;
                }
            }
            if (i4 >= this.f608f.length && this.f603a < this.f608f.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f608f.length) {
                        break;
                    } else if (this.f608f[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f608f.length) {
                i4 = this.f608f.length;
                this.f606d *= 2;
                this.f613k = false;
                this.f612j = i4 - 1;
                this.f610h = Arrays.copyOf(this.f610h, this.f606d);
                this.f608f = Arrays.copyOf(this.f608f, this.f606d);
                this.f609g = Arrays.copyOf(this.f609g, this.f606d);
            }
            this.f608f[i4] = solverVariable.f594b;
            this.f610h[i4] = f;
            if (i3 != -1) {
                int[] iArr = this.f609g;
                iArr[i4] = iArr[i3];
                this.f609g[i3] = i4;
            } else {
                this.f609g[i4] = this.f611i;
                this.f611i = i4;
            }
            solverVariable.f602j++;
            solverVariable.mo445a(this.f604b);
            this.f603a++;
            if (!this.f613k) {
                this.f612j++;
            }
            if (this.f603a >= this.f608f.length) {
                this.f613k = true;
            }
            if (this.f612j >= this.f608f.length) {
                this.f613k = true;
                this.f612j = this.f608f.length - 1;
            }
        }
    }
}
