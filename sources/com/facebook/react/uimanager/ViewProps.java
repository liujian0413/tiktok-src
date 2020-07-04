package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;

public class ViewProps {
    public static final int[] BORDER_SPACING_TYPES = {8, 4, 5, 1, 3, 0, 2};
    private static final HashSet<String> LAYOUT_ONLY_PROPS = new HashSet<>(Arrays.asList(new String[]{"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"}));
    public static final int[] PADDING_MARGIN_SPACING_TYPES = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final int[] POSITION_SPACING_TYPES = {4, 5, 1, 3};
    public static boolean sIsOptimizationsEnabled;

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isLayoutOnly(com.facebook.react.bridge.ReadableMap r5, java.lang.String r6) {
        /*
            java.util.HashSet<java.lang.String> r0 = LAYOUT_ONLY_PROPS
            boolean r0 = r0.contains(r6)
            r1 = 1
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "pointerEvents"
            boolean r0 = r0.equals(r6)
            r2 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "auto"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0029
            java.lang.String r6 = "box-none"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            return r1
        L_0x002a:
            boolean r0 = sIsOptimizationsEnabled
            if (r0 == 0) goto L_0x01a0
            r0 = -1
            int r3 = r6.hashCode()
            switch(r3) {
                case -1989576717: goto L_0x00b8;
                case -1971292586: goto L_0x00ad;
                case -1470826662: goto L_0x00a3;
                case -1452542531: goto L_0x0098;
                case -1308858324: goto L_0x008e;
                case -1290574193: goto L_0x0083;
                case -1267206133: goto L_0x0079;
                case -242276144: goto L_0x006f;
                case -223992013: goto L_0x0065;
                case 529642498: goto L_0x005a;
                case 741115130: goto L_0x004f;
                case 1288688105: goto L_0x0043;
                case 1349188574: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x00c2
        L_0x0038:
            java.lang.String r3 = "borderRadius"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 1
            goto L_0x00c3
        L_0x0043:
            java.lang.String r3 = "onLayout"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 11
            goto L_0x00c3
        L_0x004f:
            java.lang.String r3 = "borderWidth"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 6
            goto L_0x00c3
        L_0x005a:
            java.lang.String r3 = "overflow"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 12
            goto L_0x00c3
        L_0x0065:
            java.lang.String r3 = "borderLeftWidth"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 7
            goto L_0x00c3
        L_0x006f:
            java.lang.String r3 = "borderLeftColor"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 2
            goto L_0x00c3
        L_0x0079:
            java.lang.String r3 = "opacity"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 0
            goto L_0x00c3
        L_0x0083:
            java.lang.String r3 = "borderBottomWidth"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 10
            goto L_0x00c3
        L_0x008e:
            java.lang.String r3 = "borderBottomColor"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 5
            goto L_0x00c3
        L_0x0098:
            java.lang.String r3 = "borderTopWidth"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 8
            goto L_0x00c3
        L_0x00a3:
            java.lang.String r3 = "borderTopColor"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 4
            goto L_0x00c3
        L_0x00ad:
            java.lang.String r3 = "borderRightWidth"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 9
            goto L_0x00c3
        L_0x00b8:
            java.lang.String r3 = "borderRightColor"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x00c2
            r6 = 3
            goto L_0x00c3
        L_0x00c2:
            r6 = -1
        L_0x00c3:
            r3 = 0
            switch(r6) {
                case 0: goto L_0x0189;
                case 1: goto L_0x015c;
                case 2: goto L_0x0152;
                case 3: goto L_0x0148;
                case 4: goto L_0x013e;
                case 5: goto L_0x0134;
                case 6: goto L_0x011f;
                case 7: goto L_0x010a;
                case 8: goto L_0x00f5;
                case 9: goto L_0x00e0;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00ca;
                case 12: goto L_0x00c9;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            return r2
        L_0x00c9:
            return r1
        L_0x00ca:
            return r1
        L_0x00cb:
            java.lang.String r6 = "borderBottomWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x00df
            java.lang.String r6 = "borderBottomWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            return r2
        L_0x00df:
            return r1
        L_0x00e0:
            java.lang.String r6 = "borderRightWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x00f4
            java.lang.String r6 = "borderRightWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            return r2
        L_0x00f4:
            return r1
        L_0x00f5:
            java.lang.String r6 = "borderTopWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x0109
            java.lang.String r6 = "borderTopWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            return r2
        L_0x0109:
            return r1
        L_0x010a:
            java.lang.String r6 = "borderLeftWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x011e
            java.lang.String r6 = "borderLeftWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            return r2
        L_0x011e:
            return r1
        L_0x011f:
            java.lang.String r6 = "borderWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x0133
            java.lang.String r6 = "borderWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            return r2
        L_0x0133:
            return r1
        L_0x0134:
            java.lang.String r6 = "borderBottomColor"
            int r5 = r5.getInt(r6)
            if (r5 != 0) goto L_0x013d
            return r1
        L_0x013d:
            return r2
        L_0x013e:
            java.lang.String r6 = "borderTopColor"
            int r5 = r5.getInt(r6)
            if (r5 != 0) goto L_0x0147
            return r1
        L_0x0147:
            return r2
        L_0x0148:
            java.lang.String r6 = "borderRightColor"
            int r5 = r5.getInt(r6)
            if (r5 != 0) goto L_0x0151
            return r1
        L_0x0151:
            return r2
        L_0x0152:
            java.lang.String r6 = "borderLeftColor"
            int r5 = r5.getInt(r6)
            if (r5 != 0) goto L_0x015b
            return r1
        L_0x015b:
            return r2
        L_0x015c:
            java.lang.String r6 = "backgroundColor"
            boolean r6 = r5.hasKey(r6)
            if (r6 == 0) goto L_0x016d
            java.lang.String r6 = "backgroundColor"
            int r6 = r5.getInt(r6)
            if (r6 == 0) goto L_0x016d
            return r2
        L_0x016d:
            java.lang.String r6 = "borderWidth"
            boolean r6 = r5.hasKey(r6)
            if (r6 == 0) goto L_0x0188
            java.lang.String r6 = "borderWidth"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x0188
            java.lang.String r6 = "borderWidth"
            double r5 = r5.getDouble(r6)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0188
            return r2
        L_0x0188:
            return r1
        L_0x0189:
            java.lang.String r6 = "opacity"
            boolean r6 = r5.isNull(r6)
            if (r6 != 0) goto L_0x019f
            java.lang.String r6 = "opacity"
            double r5 = r5.getDouble(r6)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            return r2
        L_0x019f:
            return r1
        L_0x01a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ViewProps.isLayoutOnly(com.facebook.react.bridge.ReadableMap, java.lang.String):boolean");
    }
}
