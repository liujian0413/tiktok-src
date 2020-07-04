package org.json.simple.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONParser {
    private LinkedList handlerStatusStack;
    private Yylex lexer = new Yylex((Reader) null);
    private int status = 0;
    private Yytoken token = null;

    private List createArrayContainer(ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new JSONArray();
        }
        List creatArrayContainer = containerFactory.creatArrayContainer();
        if (creatArrayContainer == null) {
            creatArrayContainer = new JSONArray();
        }
        return creatArrayContainer;
    }

    private Map createObjectContainer(ContainerFactory containerFactory) {
        if (containerFactory == null) {
            return new JSONObject();
        }
        Map createObjectContainer = containerFactory.createObjectContainer();
        if (createObjectContainer == null) {
            createObjectContainer = new JSONObject();
        }
        return createObjectContainer;
    }

    private void nextToken() throws ParseException, IOException {
        this.token = this.lexer.yylex();
        if (this.token == null) {
            this.token = new Yytoken(-1, null);
        }
    }

    private int peekStatus(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    public int getPosition() {
        return this.lexer.getPosition();
    }

    public Object parse(Reader reader) throws IOException, ParseException {
        return parse(reader, (ContainerFactory) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        r7.status = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        r7.status = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        if (r7.status == -1) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c0, code lost:
        throw new org.json.simple.parser.ParseException(getPosition(), 1, r7.token);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object parse(java.io.Reader r8, org.json.simple.parser.ContainerFactory r9) throws java.io.IOException, org.json.simple.parser.ParseException {
        /*
            r7 = this;
            r7.reset(r8)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x000d:
            r7.nextToken()     // Catch:{ IOException -> 0x01c1 }
            int r1 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r2 = 2
            r3 = 3
            r4 = -1
            r5 = 1
            switch(r1) {
                case -1: goto L_0x0191;
                case 0: goto L_0x0150;
                case 1: goto L_0x0139;
                case 2: goto L_0x00fb;
                case 3: goto L_0x0093;
                case 4: goto L_0x001b;
                default: goto L_0x0019;
            }     // Catch:{ IOException -> 0x01c1 }
        L_0x0019:
            goto L_0x019d
        L_0x001b:
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r1 = r1.type     // Catch:{ IOException -> 0x01c1 }
            if (r1 == r3) goto L_0x0070
            r3 = 6
            if (r1 == r3) goto L_0x019d
            switch(r1) {
                case 0: goto L_0x0052;
                case 1: goto L_0x002b;
                default: goto L_0x0027;
            }     // Catch:{ IOException -> 0x01c1 }
        L_0x0027:
            r7.status = r4     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x002b:
            r8.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r3 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r6 = r7.createObjectContainer(r9)     // Catch:{ IOException -> 0x01c1 }
            r3.put(r1, r6)     // Catch:{ IOException -> 0x01c1 }
            r7.status = r2     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
        L_0x004d:
            r0.addFirst(r6)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x0052:
            r8.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r2 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r3 = r7.token     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r3 = r3.value     // Catch:{ IOException -> 0x01c1 }
            r2.put(r1, r3)     // Catch:{ IOException -> 0x01c1 }
            int r1 = r7.peekStatus(r8)     // Catch:{ IOException -> 0x01c1 }
        L_0x006c:
            r7.status = r1     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x0070:
            r8.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r2 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IOException -> 0x01c1 }
            java.util.List r6 = r7.createArrayContainer(r9)     // Catch:{ IOException -> 0x01c1 }
            r2.put(r1, r6)     // Catch:{ IOException -> 0x01c1 }
            r7.status = r3     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x004d
        L_0x0093:
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r1 = r1.type     // Catch:{ IOException -> 0x01c1 }
            switch(r1) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00ce;
                case 2: goto L_0x009a;
                case 3: goto L_0x00b0;
                case 4: goto L_0x009b;
                case 5: goto L_0x019d;
                default: goto L_0x009a;
            }     // Catch:{ IOException -> 0x01c1 }
        L_0x009a:
            goto L_0x0027
        L_0x009b:
            int r1 = r0.size()     // Catch:{ IOException -> 0x01c1 }
            if (r1 <= r5) goto L_0x00ac
            r8.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            int r1 = r7.peekStatus(r8)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x006c
        L_0x00ac:
            r7.status = r5     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x00b0:
            java.lang.Object r1 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IOException -> 0x01c1 }
            java.util.List r2 = r7.createArrayContainer(r9)     // Catch:{ IOException -> 0x01c1 }
            r1.add(r2)     // Catch:{ IOException -> 0x01c1 }
            r7.status = r3     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r3 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            r0.addFirst(r2)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x00ce:
            java.lang.Object r1 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r3 = r7.createObjectContainer(r9)     // Catch:{ IOException -> 0x01c1 }
            r1.add(r3)     // Catch:{ IOException -> 0x01c1 }
            r7.status = r2     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            r0.addFirst(r3)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x00ec:
            java.lang.Object r1 = r0.getFirst()     // Catch:{ IOException -> 0x01c1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r2 = r7.token     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r2 = r2.value     // Catch:{ IOException -> 0x01c1 }
            r1.add(r2)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x00fb:
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r1 = r1.type     // Catch:{ IOException -> 0x01c1 }
            if (r1 == 0) goto L_0x011a
            if (r1 == r2) goto L_0x0108
            r2 = 5
            if (r1 == r2) goto L_0x019d
            goto L_0x0027
        L_0x0108:
            int r1 = r0.size()     // Catch:{ IOException -> 0x01c1 }
            if (r1 <= r5) goto L_0x00ac
            r8.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            int r1 = r7.peekStatus(r8)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x006c
        L_0x011a:
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r1.value     // Catch:{ IOException -> 0x01c1 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ IOException -> 0x01c1 }
            if (r1 == 0) goto L_0x0027
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r1.value     // Catch:{ IOException -> 0x01c1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01c1 }
            r0.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            r1 = 4
            r7.status = r1     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x0139:
            org.json.simple.parser.Yytoken r8 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r8 = r8.type     // Catch:{ IOException -> 0x01c1 }
            if (r8 != r4) goto L_0x0144
            java.lang.Object r8 = r0.removeFirst()     // Catch:{ IOException -> 0x01c1 }
            return r8
        L_0x0144:
            org.json.simple.parser.ParseException r8 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01c1 }
            int r9 = r7.getPosition()     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r0 = r7.token     // Catch:{ IOException -> 0x01c1 }
            r8.<init>(r9, r5, r0)     // Catch:{ IOException -> 0x01c1 }
            throw r8     // Catch:{ IOException -> 0x01c1 }
        L_0x0150:
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r1 = r1.type     // Catch:{ IOException -> 0x01c1 }
            if (r1 == r3) goto L_0x0180
            switch(r1) {
                case 0: goto L_0x016f;
                case 1: goto L_0x015b;
                default: goto L_0x0159;
            }     // Catch:{ IOException -> 0x01c1 }
        L_0x0159:
            goto L_0x0027
        L_0x015b:
            r7.status = r2     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            java.util.Map r1 = r7.createObjectContainer(r9)     // Catch:{ IOException -> 0x01c1 }
        L_0x016b:
            r0.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x019d
        L_0x016f:
            r7.status = r5     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            java.lang.Object r1 = r1.value     // Catch:{ IOException -> 0x01c1 }
            goto L_0x016b
        L_0x0180:
            r7.status = r3     // Catch:{ IOException -> 0x01c1 }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01c1 }
            int r2 = r7.status     // Catch:{ IOException -> 0x01c1 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c1 }
            r8.addFirst(r1)     // Catch:{ IOException -> 0x01c1 }
            java.util.List r1 = r7.createArrayContainer(r9)     // Catch:{ IOException -> 0x01c1 }
            goto L_0x016b
        L_0x0191:
            org.json.simple.parser.ParseException r8 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01c1 }
            int r9 = r7.getPosition()     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r0 = r7.token     // Catch:{ IOException -> 0x01c1 }
            r8.<init>(r9, r5, r0)     // Catch:{ IOException -> 0x01c1 }
            throw r8     // Catch:{ IOException -> 0x01c1 }
        L_0x019d:
            int r1 = r7.status     // Catch:{ IOException -> 0x01c1 }
            if (r1 == r4) goto L_0x01b5
            org.json.simple.parser.Yytoken r1 = r7.token     // Catch:{ IOException -> 0x01c1 }
            int r1 = r1.type     // Catch:{ IOException -> 0x01c1 }
            if (r1 == r4) goto L_0x01a9
            goto L_0x000d
        L_0x01a9:
            org.json.simple.parser.ParseException r8 = new org.json.simple.parser.ParseException
            int r9 = r7.getPosition()
            org.json.simple.parser.Yytoken r0 = r7.token
            r8.<init>(r9, r5, r0)
            throw r8
        L_0x01b5:
            org.json.simple.parser.ParseException r8 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01c1 }
            int r9 = r7.getPosition()     // Catch:{ IOException -> 0x01c1 }
            org.json.simple.parser.Yytoken r0 = r7.token     // Catch:{ IOException -> 0x01c1 }
            r8.<init>(r9, r5, r0)     // Catch:{ IOException -> 0x01c1 }
            throw r8     // Catch:{ IOException -> 0x01c1 }
        L_0x01c1:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.simple.parser.JSONParser.parse(java.io.Reader, org.json.simple.parser.ContainerFactory):java.lang.Object");
    }

    public Object parse(String str) throws ParseException {
        return parse(str, (ContainerFactory) null);
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        try {
            return parse((Reader) new StringReader(str), containerFactory);
        } catch (IOException e) {
            throw new ParseException(-1, 2, e);
        }
    }

    public void parse(Reader reader, ContentHandler contentHandler) throws IOException, ParseException {
        parse(reader, contentHandler, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r6.status = -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0029 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0142 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8 A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01bd A[Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d3 A[SYNTHETIC, Splitter:B:96:0x01d3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parse(java.io.Reader r7, org.json.simple.parser.ContentHandler r8, boolean r9) throws java.io.IOException, org.json.simple.parser.ParseException {
        /*
            r6 = this;
            if (r9 != 0) goto L_0x000d
            r6.reset(r7)
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
        L_0x000a:
            r6.handlerStatusStack = r7
            goto L_0x001a
        L_0x000d:
            java.util.LinkedList r9 = r6.handlerStatusStack
            if (r9 != 0) goto L_0x001a
            r6.reset(r7)
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            goto L_0x000a
        L_0x001a:
            java.util.LinkedList r7 = r6.handlerStatusStack
        L_0x001c:
            r9 = -1
            int r0 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r1 = 6
            r2 = 5
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1: goto L_0x01ad;
                case 0: goto L_0x015f;
                case 1: goto L_0x0142;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00a3;
                case 4: goto L_0x003a;
                case 5: goto L_0x002a;
                case 6: goto L_0x0029;
                default: goto L_0x0027;
            }     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x0027:
            goto L_0x01b9
        L_0x0029:
            return
        L_0x002a:
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r6.peekStatus(r7)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r0     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.endObjectEntry()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x003a:
            r6.nextToken()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r0.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == r4) goto L_0x0085
            if (r0 == r1) goto L_0x01b9
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x004c;
                default: goto L_0x0048;
            }     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x0048:
            r6.status = r9     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            goto L_0x01b9
        L_0x004c:
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r3     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startObject()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x006a:
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r6.peekStatus(r7)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r0     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Object r0 = r0.value     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.primitive(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x007e
            return
        L_0x007e:
            boolean r0 = r8.endObjectEntry()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x0085:
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r4     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startArray()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x00a3:
            r6.nextToken()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r0.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00da;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00ae;
                case 5: goto L_0x01b9;
                default: goto L_0x00ad;
            }     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x00ad:
            goto L_0x0048
        L_0x00ae:
            int r0 = r7.size()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 <= r5) goto L_0x00be
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r6.peekStatus(r7)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r0     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            goto L_0x00c0
        L_0x00be:
            r6.status = r5     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x00c0:
            boolean r0 = r8.endArray()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x00c7:
            r6.status = r4     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startArray()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x00da:
            r6.status = r3     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startObject()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x00ed:
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Object r0 = r0.value     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.primitive(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x00f8:
            r6.nextToken()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r0.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == 0) goto L_0x0120
            if (r0 == r3) goto L_0x0107
            if (r0 == r2) goto L_0x01b9
            goto L_0x0048
        L_0x0107:
            int r0 = r7.size()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 <= r5) goto L_0x0117
            r7.removeFirst()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r6.peekStatus(r7)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r0     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            goto L_0x0119
        L_0x0117:
            r6.status = r5     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x0119:
            boolean r0 = r8.endObject()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x0120:
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Object r0 = r0.value     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == 0) goto L_0x0048
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Object r0 = r0.value     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r1 = 4
            r6.status = r1     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r2 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startObjectEntry(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x0142:
            r6.nextToken()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r7 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r7 = r7.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r7 != r9) goto L_0x0151
            r8.endJSON()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.status = r1     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            return
        L_0x0151:
            r6.status = r9     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.ParseException r7 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r8 = r6.getPosition()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.<init>(r8, r5, r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            throw r7     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x015f:
            r8.startJSON()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r6.nextToken()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r0.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == r4) goto L_0x019a
            switch(r0) {
                case 0: goto L_0x0183;
                case 1: goto L_0x0170;
                default: goto L_0x016e;
            }     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x016e:
            goto L_0x0048
        L_0x0170:
            r6.status = r3     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startObject()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x0183:
            r6.status = r5     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Object r0 = r0.value     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.primitive(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x019a:
            r6.status = r4     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r1 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.addFirst(r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            boolean r0 = r8.startArray()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 != 0) goto L_0x01b9
            return
        L_0x01ad:
            org.json.simple.parser.ParseException r7 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r8 = r6.getPosition()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.<init>(r8, r5, r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            throw r7     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x01b9:
            int r0 = r6.status     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == r9) goto L_0x01d3
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r0 = r0.type     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            if (r0 == r9) goto L_0x01c5
            goto L_0x001c
        L_0x01c5:
            r6.status = r9
            org.json.simple.parser.ParseException r7 = new org.json.simple.parser.ParseException
            int r8 = r6.getPosition()
            org.json.simple.parser.Yytoken r9 = r6.token
            r7.<init>(r8, r5, r9)
            throw r7
        L_0x01d3:
            org.json.simple.parser.ParseException r7 = new org.json.simple.parser.ParseException     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            int r8 = r6.getPosition()     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            org.json.simple.parser.Yytoken r0 = r6.token     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            r7.<init>(r8, r5, r0)     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
            throw r7     // Catch:{ IOException -> 0x01eb, ParseException -> 0x01e7, RuntimeException -> 0x01e3, Error -> 0x01df }
        L_0x01df:
            r7 = move-exception
            r6.status = r9
            throw r7
        L_0x01e3:
            r7 = move-exception
            r6.status = r9
            throw r7
        L_0x01e7:
            r7 = move-exception
            r6.status = r9
            throw r7
        L_0x01eb:
            r7 = move-exception
            r6.status = r9
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.simple.parser.JSONParser.parse(java.io.Reader, org.json.simple.parser.ContentHandler, boolean):void");
    }

    public void parse(String str, ContentHandler contentHandler) throws ParseException {
        parse(str, contentHandler, false);
    }

    public void parse(String str, ContentHandler contentHandler, boolean z) throws ParseException {
        try {
            parse((Reader) new StringReader(str), contentHandler, z);
        } catch (IOException e) {
            throw new ParseException(-1, 2, e);
        }
    }

    public void reset() {
        this.token = null;
        this.status = 0;
        this.handlerStatusStack = null;
    }

    public void reset(Reader reader) {
        this.lexer.yyreset(reader);
        reset();
    }
}
