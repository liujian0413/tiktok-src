package org.json.simple.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class Yylex {
    private static final int[] ZZ_ACTION = zzUnpackAction();
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
    private static final char[] ZZ_CMAP = zzUnpackCMap("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");
    private static final String[] ZZ_ERROR_MSG = {"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] ZZ_LEXSTATE = {0, 0, 1, 1};
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
    private static final int[] ZZ_TRANS = {2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: sb */
    private StringBuffer f123466sb;
    private int yychar;
    private int yycolumn;
    private int yyline;
    private boolean zzAtBOL;
    private boolean zzAtEOF;
    private char[] zzBuffer;
    private int zzCurrentPos;
    private int zzEndRead;
    private int zzLexicalState;
    private int zzMarkedPos;
    private Reader zzReader;
    private int zzStartRead;
    private int zzState;

    Yylex(InputStream inputStream) {
        this((Reader) new InputStreamReader(inputStream));
    }

    Yylex(Reader reader) {
        this.zzBuffer = new char[16384];
        this.zzAtBOL = true;
        this.f123466sb = new StringBuffer();
        this.zzReader = reader;
    }

    private boolean zzRefill() throws IOException {
        if (this.zzStartRead > 0) {
            System.arraycopy(this.zzBuffer, this.zzStartRead, this.zzBuffer, 0, this.zzEndRead - this.zzStartRead);
            this.zzEndRead -= this.zzStartRead;
            this.zzCurrentPos -= this.zzStartRead;
            this.zzMarkedPos -= this.zzStartRead;
            this.zzStartRead = 0;
        }
        if (this.zzCurrentPos >= this.zzBuffer.length) {
            char[] cArr = new char[(this.zzCurrentPos * 2)];
            System.arraycopy(this.zzBuffer, 0, cArr, 0, this.zzBuffer.length);
            this.zzBuffer = cArr;
        }
        int read = this.zzReader.read(this.zzBuffer, this.zzEndRead, this.zzBuffer.length - this.zzEndRead);
        if (read > 0) {
            this.zzEndRead += read;
            return false;
        } else if (read != 0) {
            return true;
        } else {
            int read2 = this.zzReader.read();
            if (read2 == -1) {
                return true;
            }
            char[] cArr2 = this.zzBuffer;
            int i = this.zzEndRead;
            this.zzEndRead = i + 1;
            cArr2[i] = (char) read2;
            return false;
        }
    }

    private void zzScanError(int i) {
        String str;
        try {
            str = ZZ_ERROR_MSG[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            str = ZZ_ERROR_MSG[0];
        }
        throw new Error(str);
    }

    private static int zzUnpackAction(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    private static int[] zzUnpackAction() {
        int[] iArr = new int[45];
        zzUnpackAction("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    private static int zzUnpackAttribute(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    private static int[] zzUnpackAttribute() {
        int[] iArr = new int[45];
        zzUnpackAttribute("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    private static char[] zzUnpackCMap(String str) {
        int i;
        char[] cArr = new char[65536];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 90) {
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            while (true) {
                i = i3 + 1;
                cArr[i3] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i3 = i;
            }
            i2 = i5;
            i3 = i;
        }
        return cArr;
    }

    private static int zzUnpackRowMap(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = i + 1;
            int i5 = i3 + 1;
            iArr[i] = (str.charAt(i2) << 16) | str.charAt(i3);
            i = i4;
            i2 = i5;
        }
        return i;
    }

    private static int[] zzUnpackRowMap() {
        int[] iArr = new int[45];
        zzUnpackRowMap("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public int getPosition() {
        return this.yychar;
    }

    public final void yybegin(int i) {
        this.zzLexicalState = i;
    }

    public final char yycharat(int i) {
        return this.zzBuffer[this.zzStartRead + i];
    }

    public final void yyclose() throws IOException {
        this.zzAtEOF = true;
        this.zzEndRead = this.zzStartRead;
        if (this.zzReader != null) {
            this.zzReader.close();
        }
    }

    public final int yylength() {
        return this.zzMarkedPos - this.zzStartRead;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        r6 = 65535;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.simple.parser.Yytoken yylex() throws java.io.IOException, org.json.simple.parser.ParseException {
        /*
            r15 = this;
            int r0 = r15.zzEndRead
            char[] r1 = r15.zzBuffer
            char[] r2 = ZZ_CMAP
            int[] r3 = ZZ_TRANS
            int[] r4 = ZZ_ROWMAP
            int[] r5 = ZZ_ATTRIBUTE
        L_0x000c:
            int r6 = r15.zzMarkedPos
            int r7 = r15.yychar
            int r8 = r15.zzStartRead
            int r8 = r6 - r8
            int r7 = r7 + r8
            r15.yychar = r7
            r15.zzStartRead = r6
            r15.zzCurrentPos = r6
            int[] r7 = ZZ_LEXSTATE
            int r8 = r15.zzLexicalState
            r7 = r7[r8]
            r15.zzState = r7
            r7 = -1
            r8 = r1
            r1 = r6
            r9 = -1
        L_0x0027:
            r10 = 8
            r11 = 1
            if (r6 < r0) goto L_0x0047
            boolean r12 = r15.zzAtEOF
            if (r12 == 0) goto L_0x0032
        L_0x0030:
            r6 = -1
            goto L_0x006c
        L_0x0032:
            r15.zzCurrentPos = r6
            r15.zzMarkedPos = r1
            boolean r0 = r15.zzRefill()
            int r6 = r15.zzCurrentPos
            int r1 = r15.zzMarkedPos
            char[] r8 = r15.zzBuffer
            int r12 = r15.zzEndRead
            if (r0 == 0) goto L_0x0046
            r0 = r12
            goto L_0x0030
        L_0x0046:
            r0 = r12
        L_0x0047:
            int r12 = r6 + 1
            char r6 = r8[r6]
            int r13 = r15.zzState
            r13 = r4[r13]
            char r14 = r2[r6]
            int r13 = r13 + r14
            r13 = r3[r13]
            if (r13 == r7) goto L_0x006c
            r15.zzState = r13
            int r13 = r15.zzState
            r13 = r5[r13]
            r14 = r13 & 1
            if (r14 != r11) goto L_0x006a
            int r9 = r15.zzState
            r1 = r13 & 8
            if (r1 == r10) goto L_0x0068
            r1 = r12
            goto L_0x006a
        L_0x0068:
            r1 = r12
            goto L_0x006c
        L_0x006a:
            r6 = r12
            goto L_0x0027
        L_0x006c:
            r15.zzMarkedPos = r1
            if (r9 >= 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            int[] r1 = ZZ_ACTION
            r9 = r1[r9]
        L_0x0075:
            r1 = 2
            r12 = 0
            r13 = 0
            switch(r9) {
                case 1: goto L_0x0153;
                case 2: goto L_0x0145;
                case 3: goto L_0x0167;
                case 4: goto L_0x0136;
                case 5: goto L_0x0130;
                case 6: goto L_0x012a;
                case 7: goto L_0x0123;
                case 8: goto L_0x011c;
                case 9: goto L_0x0115;
                case 10: goto L_0x010e;
                case 11: goto L_0x0104;
                case 12: goto L_0x00ff;
                case 13: goto L_0x00f0;
                case 14: goto L_0x00eb;
                case 15: goto L_0x00e6;
                case 16: goto L_0x00df;
                case 17: goto L_0x00da;
                case 18: goto L_0x00d5;
                case 19: goto L_0x00d0;
                case 20: goto L_0x00c7;
                case 21: goto L_0x00b9;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00a5;
                case 24: goto L_0x0086;
                case 25: goto L_0x0167;
                case 26: goto L_0x0167;
                case 27: goto L_0x0167;
                case 28: goto L_0x0167;
                case 29: goto L_0x0167;
                case 30: goto L_0x0167;
                case 31: goto L_0x0167;
                case 32: goto L_0x0167;
                case 33: goto L_0x0167;
                case 34: goto L_0x0167;
                case 35: goto L_0x0167;
                case 36: goto L_0x0167;
                case 37: goto L_0x0167;
                case 38: goto L_0x0167;
                case 39: goto L_0x0167;
                case 40: goto L_0x0167;
                case 41: goto L_0x0167;
                case 42: goto L_0x0167;
                case 43: goto L_0x0167;
                case 44: goto L_0x0167;
                case 45: goto L_0x0167;
                case 46: goto L_0x0167;
                case 47: goto L_0x0167;
                case 48: goto L_0x0167;
                default: goto L_0x007b;
            }
        L_0x007b:
            if (r6 != r7) goto L_0x0164
            int r1 = r15.zzStartRead
            int r6 = r15.zzCurrentPos
            if (r1 != r6) goto L_0x0164
            r15.zzAtEOF = r11
            return r12
        L_0x0086:
            java.lang.String r6 = r15.yytext()     // Catch:{ Exception -> 0x009c }
            java.lang.String r6 = r6.substring(r1)     // Catch:{ Exception -> 0x009c }
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r6, r7)     // Catch:{ Exception -> 0x009c }
            java.lang.StringBuffer r7 = r15.f123466sb     // Catch:{ Exception -> 0x009c }
            char r6 = (char) r6     // Catch:{ Exception -> 0x009c }
            r7.append(r6)     // Catch:{ Exception -> 0x009c }
            goto L_0x0167
        L_0x009c:
            r0 = move-exception
            org.json.simple.parser.ParseException r2 = new org.json.simple.parser.ParseException
            int r3 = r15.yychar
            r2.<init>(r3, r1, r0)
            throw r2
        L_0x00a5:
            java.lang.String r0 = r15.yytext()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            org.json.simple.parser.Yytoken r1 = new org.json.simple.parser.Yytoken
            r1.<init>(r13, r0)
            return r1
        L_0x00b3:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r0.<init>(r13, r12)
            return r0
        L_0x00b9:
            java.lang.String r0 = r15.yytext()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.json.simple.parser.Yytoken r1 = new org.json.simple.parser.Yytoken
            r1.<init>(r13, r0)
            return r1
        L_0x00c7:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 9
        L_0x00cb:
            r1.append(r6)
            goto L_0x0167
        L_0x00d0:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 13
            goto L_0x00cb
        L_0x00d5:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 10
            goto L_0x00cb
        L_0x00da:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 12
            goto L_0x00cb
        L_0x00df:
            java.lang.StringBuffer r1 = r15.f123466sb
            r1.append(r10)
            goto L_0x0167
        L_0x00e6:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 47
            goto L_0x00cb
        L_0x00eb:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 34
            goto L_0x00cb
        L_0x00f0:
            r15.yybegin(r13)
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            java.lang.StringBuffer r1 = r15.f123466sb
            java.lang.String r1 = r1.toString()
            r0.<init>(r13, r1)
            return r0
        L_0x00ff:
            java.lang.StringBuffer r1 = r15.f123466sb
            r6 = 92
            goto L_0x00cb
        L_0x0104:
            java.lang.StringBuffer r1 = r15.f123466sb
            java.lang.String r6 = r15.yytext()
            r1.append(r6)
            goto L_0x0167
        L_0x010e:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r1 = 6
            r0.<init>(r1, r12)
            return r0
        L_0x0115:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r1 = 5
            r0.<init>(r1, r12)
            return r0
        L_0x011c:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r1 = 4
            r0.<init>(r1, r12)
            return r0
        L_0x0123:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r1 = 3
            r0.<init>(r1, r12)
            return r0
        L_0x012a:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r0.<init>(r1, r12)
            return r0
        L_0x0130:
            org.json.simple.parser.Yytoken r0 = new org.json.simple.parser.Yytoken
            r0.<init>(r11, r12)
            return r0
        L_0x0136:
            java.lang.StringBuffer r6 = r15.f123466sb
            java.lang.StringBuffer r7 = r15.f123466sb
            int r7 = r7.length()
            r6.delete(r13, r7)
            r15.yybegin(r1)
            goto L_0x0167
        L_0x0145:
            java.lang.String r0 = r15.yytext()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.json.simple.parser.Yytoken r1 = new org.json.simple.parser.Yytoken
            r1.<init>(r13, r0)
            return r1
        L_0x0153:
            org.json.simple.parser.ParseException r0 = new org.json.simple.parser.ParseException
            int r1 = r15.yychar
            java.lang.Character r2 = new java.lang.Character
            char r3 = r15.yycharat(r13)
            r2.<init>(r3)
            r0.<init>(r1, r13, r2)
            throw r0
        L_0x0164:
            r15.zzScanError(r11)
        L_0x0167:
            r1 = r8
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.simple.parser.Yylex.yylex():org.json.simple.parser.Yytoken");
    }

    public void yypushback(int i) {
        if (i > yylength()) {
            zzScanError(2);
        }
        this.zzMarkedPos -= i;
    }

    public final void yyreset(Reader reader) {
        this.zzReader = reader;
        this.zzAtBOL = true;
        this.zzAtEOF = false;
        this.zzStartRead = 0;
        this.zzEndRead = 0;
        this.zzMarkedPos = 0;
        this.zzCurrentPos = 0;
        this.yycolumn = 0;
        this.yychar = 0;
        this.yyline = 0;
        this.zzLexicalState = 0;
    }

    public final int yystate() {
        return this.zzLexicalState;
    }

    public final String yytext() {
        return new String(this.zzBuffer, this.zzStartRead, this.zzMarkedPos - this.zzStartRead);
    }
}
