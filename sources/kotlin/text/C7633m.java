package kotlin.text;

/* renamed from: kotlin.text.m */
final class C7633m {

    /* renamed from: a */
    public static final Regex f20926a;

    /* renamed from: b */
    public static final C7633m f20927b = new C7633m();

    private C7633m() {
    }

    static {
        String str = "(\\p{Digit}+)";
        String str2 = "(\\p{XDigit}+)";
        StringBuilder sb = new StringBuilder("[eE][+-]?");
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("(0[xX]");
        sb3.append(str2);
        sb3.append("(\\.)?)|(0[xX]");
        sb3.append(str2);
        sb3.append("?(\\.)");
        sb3.append(str2);
        sb3.append(')');
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("(");
        sb5.append(str);
        sb5.append("(\\.)?(");
        sb5.append(str);
        sb5.append("?)(");
        sb5.append(sb2);
        sb5.append(")?)|(\\.(");
        sb5.append(str);
        sb5.append(")(");
        sb5.append(sb2);
        sb5.append(")?)|((");
        sb5.append(sb4);
        sb5.append(")[pP][+-]?");
        sb5.append(str);
        sb5.append(')');
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb7.append(sb6);
        sb7.append(")[fFdD]?))[\\x00-\\x20]*");
        f20926a = new Regex(sb7.toString());
    }
}
