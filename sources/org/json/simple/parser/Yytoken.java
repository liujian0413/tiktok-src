package org.json.simple.parser;

public class Yytoken {
    public int type;
    public Object value;

    public Yytoken(int i, Object obj) {
        this.type = i;
        this.value = obj;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.type) {
            case -1:
                str = "END OF FILE";
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.value);
                str = ")";
                break;
            case 1:
                str = "LEFT BRACE({)";
                break;
            case 2:
                str = "RIGHT BRACE(})";
                break;
            case 3:
                str = "LEFT SQUARE([)";
                break;
            case 4:
                str = "RIGHT SQUARE(])";
                break;
            case 5:
                str = "COMMA(,)";
                break;
            case 6:
                str = "COLON(:)";
                break;
            default:
                return stringBuffer.toString();
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
