package kotlinx.coroutines.channels;

/* renamed from: kotlinx.coroutines.channels.d */
final /* synthetic */ class C48137d {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149326a(kotlinx.coroutines.channels.C48138e<? extends E> r8, kotlin.jvm.p357a.C7562b<? super E, kotlin.C7581n> r9, kotlin.coroutines.C47919b<? super kotlin.C7581n> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            if (r0 == 0) goto L_0x0014
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            r0.<init>(r10)
        L_0x0019:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0053;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002c:
            java.lang.Object r8 = r0.L$5
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r10 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x007b }
            if (r6 != 0) goto L_0x004e
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
            goto L_0x00be
        L_0x004e:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10     // Catch:{ Throwable -> 0x007b }
            java.lang.Throwable r8 = r10.exception     // Catch:{ Throwable -> 0x007b }
            throw r8     // Catch:{ Throwable -> 0x007b }
        L_0x0053:
            java.lang.Object r8 = r0.L$5
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r10 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x007b }
            if (r6 != 0) goto L_0x0074
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
            goto L_0x00a0
        L_0x0074:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10     // Catch:{ Throwable -> 0x007b }
            java.lang.Throwable r8 = r10.exception     // Catch:{ Throwable -> 0x007b }
            throw r8     // Catch:{ Throwable -> 0x007b }
        L_0x0079:
            r8 = move-exception
            goto L_0x00c6
        L_0x007b:
            r8 = move-exception
            goto L_0x00c5
        L_0x007d:
            boolean r2 = r10 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00c7
            r10 = 0
            kotlinx.coroutines.channels.b r2 = r8.mo120362a()     // Catch:{ Throwable -> 0x007b }
            r3 = r8
            r5 = r3
            r4 = r9
            r9 = r5
        L_0x008a:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x007b }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x007b }
            r0.L$2 = r3     // Catch:{ Throwable -> 0x007b }
            r0.L$3 = r10     // Catch:{ Throwable -> 0x007b }
            r0.L$4 = r9     // Catch:{ Throwable -> 0x007b }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x007b }
            r8 = 1
            r0.label = r8     // Catch:{ Throwable -> 0x007b }
            java.lang.Object r8 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x007b }
            if (r8 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Throwable -> 0x007b }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x007b }
            if (r8 == 0) goto L_0x00c2
            r0.L$0 = r5     // Catch:{ Throwable -> 0x007b }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x007b }
            r0.L$2 = r3     // Catch:{ Throwable -> 0x007b }
            r0.L$3 = r10     // Catch:{ Throwable -> 0x007b }
            r0.L$4 = r9     // Catch:{ Throwable -> 0x007b }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x007b }
            r8 = 2
            r0.label = r8     // Catch:{ Throwable -> 0x007b }
            java.lang.Object r8 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x007b }
            if (r8 != r1) goto L_0x00be
            return r1
        L_0x00be:
            r4.invoke(r8)     // Catch:{ Throwable -> 0x007b }
            goto L_0x008a
        L_0x00c2:
            kotlin.n r8 = kotlin.C7581n.f20898a     // Catch:{ Throwable -> 0x007b }
            return r8
        L_0x00c5:
            throw r8     // Catch:{ all -> 0x0079 }
        L_0x00c6:
            throw r8
        L_0x00c7:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10
            java.lang.Throwable r8 = r10.exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149326a(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149336b(kotlinx.coroutines.channels.C48138e<? extends E> r13, kotlin.jvm.p357a.C7562b<? super kotlin.collections.C47913z<? extends E>, kotlin.C7581n> r14, kotlin.coroutines.C47919b<? super kotlin.C7581n> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEachIndexed$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEachIndexed$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEachIndexed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEachIndexed$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEachIndexed$1
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x008a;
                case 1: goto L_0x005a;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002c:
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$6
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0087 }
            if (r8 != 0) goto L_0x0055
        L_0x0050:
            r11 = r3
            r3 = r13
            r13 = r11
            goto L_0x00e1
        L_0x0055:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0087 }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x0087 }
            throw r13     // Catch:{ Throwable -> 0x0087 }
        L_0x005a:
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$6
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0087 }
            if (r8 != 0) goto L_0x007f
            goto L_0x00bf
        L_0x007f:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0087 }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x0087 }
            throw r13     // Catch:{ Throwable -> 0x0087 }
        L_0x0084:
            r13 = move-exception
            goto L_0x00f5
        L_0x0087:
            r13 = move-exception
            goto L_0x00f4
        L_0x008a:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f6
            kotlin.jvm.internal.Ref$IntRef r15 = new kotlin.jvm.internal.Ref$IntRef
            r15.<init>()
            r2 = 0
            r15.element = r2
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r13.mo120362a()     // Catch:{ Throwable -> 0x0087 }
            r4 = r13
            r7 = r4
            r6 = r14
            r14 = r7
        L_0x009f:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0087 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0087 }
            r0.L$2 = r15     // Catch:{ Throwable -> 0x0087 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0087 }
            r0.L$4 = r13     // Catch:{ Throwable -> 0x0087 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0087 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x0087 }
            r0.L$7 = r3     // Catch:{ Throwable -> 0x0087 }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r5 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x0087 }
            if (r5 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r11 = r3
            r3 = r13
            r13 = r11
            r12 = r5
            r5 = r15
            r15 = r12
        L_0x00bf:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Throwable -> 0x0087 }
            boolean r15 = r15.booleanValue()     // Catch:{ Throwable -> 0x0087 }
            if (r15 == 0) goto L_0x00f1
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0087 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0087 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0087 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0087 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x0087 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0087 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x0087 }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x0087 }
            r15 = 2
            r0.label = r15     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r15 = r13.mo120361b(r0)     // Catch:{ Throwable -> 0x0087 }
            if (r15 != r1) goto L_0x0050
            return r1
        L_0x00e1:
            kotlin.collections.z r8 = new kotlin.collections.z     // Catch:{ Throwable -> 0x0087 }
            int r9 = r5.element     // Catch:{ Throwable -> 0x0087 }
            int r10 = r9 + 1
            r5.element = r10     // Catch:{ Throwable -> 0x0087 }
            r8.<init>(r9, r15)     // Catch:{ Throwable -> 0x0087 }
            r6.invoke(r8)     // Catch:{ Throwable -> 0x0087 }
            r15 = r5
            goto L_0x009f
        L_0x00f1:
            kotlin.n r13 = kotlin.C7581n.f20898a
            return r13
        L_0x00f4:
            throw r13     // Catch:{ all -> 0x0084 }
        L_0x00f5:
            throw r13
        L_0x00f6:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r13 = r15.exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149336b(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object m149323a(kotlinx.coroutines.channels.C48138e<? extends E> r18, C r19, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, java.lang.Boolean> r20, kotlin.coroutines.C47919b<? super C> r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0068;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00a2 }
            if (r13 != 0) goto L_0x0063
            r16 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r16
            goto L_0x0116
        L_0x0063:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00a2 }
            throw r0     // Catch:{ Throwable -> 0x00a2 }
        L_0x0068:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00a2 }
            if (r13 != 0) goto L_0x009a
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x00ea
        L_0x009a:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00a2 }
            throw r0     // Catch:{ Throwable -> 0x00a2 }
        L_0x009f:
            r0 = move-exception
            goto L_0x013c
        L_0x00a2:
            r0 = move-exception
            goto L_0x013b
        L_0x00a5:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x013d
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r18.mo120362a()     // Catch:{ Throwable -> 0x00a2 }
            r6 = r18
            r7 = r6
            r9 = r7
            r12 = r9
            r11 = r19
            r10 = r20
            r5 = r2
            r2 = r12
        L_0x00c1:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00a2 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00a2 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00a2 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00a2 }
            r1.L$4 = r0     // Catch:{ Throwable -> 0x00a2 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00a2 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00a2 }
            r1.L$7 = r3     // Catch:{ Throwable -> 0x00a2 }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x00a2 }
            r1.L$9 = r4     // Catch:{ Throwable -> 0x00a2 }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x00a2 }
            if (r8 != r5) goto L_0x00df
            return r5
        L_0x00df:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r5
            r5 = r3
            r3 = r4
            r4 = r17
        L_0x00ea:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x00a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x00a2 }
            if (r0 == 0) goto L_0x013a
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00a2 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00a2 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00a2 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00a2 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00a2 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00a2 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00a2 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00a2 }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x00a2 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00a2 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x00a2 }
            if (r0 != r4) goto L_0x0110
            return r4
        L_0x0110:
            r16 = r4
            r4 = r3
            r3 = r5
            r5 = r16
        L_0x0116:
            kotlin.collections.z r13 = new kotlin.collections.z     // Catch:{ Throwable -> 0x00a2 }
            int r14 = r8.element     // Catch:{ Throwable -> 0x00a2 }
            int r15 = r14 + 1
            r8.element = r15     // Catch:{ Throwable -> 0x00a2 }
            r13.<init>(r14, r0)     // Catch:{ Throwable -> 0x00a2 }
            int r0 = r13.f122770a     // Catch:{ Throwable -> 0x00a2 }
            T r13 = r13.f122771b     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r0)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r0 = r10.invoke(r0, r13)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x00a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x00a2 }
            if (r0 == 0) goto L_0x0138
            r11.add(r13)     // Catch:{ Throwable -> 0x00a2 }
        L_0x0138:
            r0 = r8
            goto L_0x00c1
        L_0x013a:
            return r11
        L_0x013b:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x013c:
            throw r0
        L_0x013d:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149323a(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.C48139f<? super E>> java.lang.Object m149331a(kotlinx.coroutines.channels.C48138e<? extends E> r21, C r22, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, java.lang.Boolean> r23, kotlin.coroutines.C47919b<? super C> r24) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$3
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$3 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$3 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexedTo$3
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00ae;
                case 2: goto L_0x0076;
                case 3: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e9 }
            if (r13 != 0) goto L_0x0071
            r0 = r12
            r17 = r11
            r11 = r2
            r2 = r17
            r18 = r10
            r10 = r4
            r4 = r18
            r19 = r9
            r9 = r5
            r5 = r19
            r20 = r7
            r7 = r6
            r6 = r20
            goto L_0x010b
        L_0x0071:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00e9 }
            throw r0     // Catch:{ Throwable -> 0x00e9 }
        L_0x0076:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e9 }
            if (r13 != 0) goto L_0x00a9
            r17 = r12
            r12 = r0
            r0 = r17
            goto L_0x0163
        L_0x00a9:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00e9 }
            throw r0     // Catch:{ Throwable -> 0x00e9 }
        L_0x00ae:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e9 }
            if (r13 != 0) goto L_0x00e1
            r17 = r12
            r12 = r0
            r0 = r17
            goto L_0x013d
        L_0x00e1:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00e9 }
            throw r0     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e6:
            r0 = move-exception
            goto L_0x01c5
        L_0x00e9:
            r0 = move-exception
            goto L_0x01c4
        L_0x00ec:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x01c6
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r21.mo120362a()     // Catch:{ Throwable -> 0x00e9 }
            r5 = r21
            r6 = r5
            r7 = r6
            r10 = r7
            r8 = r0
            r11 = r2
            r9 = r3
            r3 = r4
            r0 = r10
            r2 = r22
            r4 = r23
        L_0x010b:
            r1.L$0 = r0     // Catch:{ Throwable -> 0x00e9 }
            r1.L$1 = r2     // Catch:{ Throwable -> 0x00e9 }
            r1.L$2 = r4     // Catch:{ Throwable -> 0x00e9 }
            r1.L$3 = r5     // Catch:{ Throwable -> 0x00e9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00e9 }
            r1.L$5 = r6     // Catch:{ Throwable -> 0x00e9 }
            r1.L$6 = r7     // Catch:{ Throwable -> 0x00e9 }
            r1.L$7 = r9     // Catch:{ Throwable -> 0x00e9 }
            r1.L$8 = r10     // Catch:{ Throwable -> 0x00e9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00e9 }
            r12 = 1
            r1.label = r12     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Object r12 = r3.mo120360a(r1)     // Catch:{ Throwable -> 0x00e9 }
            if (r12 != r11) goto L_0x0129
            return r11
        L_0x0129:
            r17 = r11
            r11 = r2
            r2 = r17
            r18 = r10
            r10 = r4
            r4 = r18
            r19 = r9
            r9 = r5
            r5 = r19
            r20 = r7
            r7 = r6
            r6 = r20
        L_0x013d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x00e9 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x00e9 }
            if (r12 == 0) goto L_0x01c3
            r1.L$0 = r0     // Catch:{ Throwable -> 0x00e9 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00e9 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00e9 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00e9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00e9 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00e9 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00e9 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00e9 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x00e9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00e9 }
            r12 = 2
            r1.label = r12     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Object r12 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x00e9 }
            if (r12 != r2) goto L_0x0163
            return r2
        L_0x0163:
            kotlin.collections.z r13 = new kotlin.collections.z     // Catch:{ Throwable -> 0x00e9 }
            int r14 = r8.element     // Catch:{ Throwable -> 0x00e9 }
            int r15 = r14 + 1
            r8.element = r15     // Catch:{ Throwable -> 0x00e9 }
            r13.<init>(r14, r12)     // Catch:{ Throwable -> 0x00e9 }
            int r14 = r13.f122770a     // Catch:{ Throwable -> 0x00e9 }
            T r15 = r13.f122771b     // Catch:{ Throwable -> 0x00e9 }
            r16 = r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r14)     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Object r2 = r10.invoke(r2, r15)     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Throwable -> 0x00e9 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x00e9 }
            if (r2 == 0) goto L_0x01ae
            r1.L$0 = r0     // Catch:{ Throwable -> 0x00e9 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00e9 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00e9 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00e9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00e9 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00e9 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00e9 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00e9 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x00e9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00e9 }
            r1.L$10 = r12     // Catch:{ Throwable -> 0x00e9 }
            r1.L$11 = r12     // Catch:{ Throwable -> 0x00e9 }
            r1.L$12 = r13     // Catch:{ Throwable -> 0x00e9 }
            r1.I$0 = r14     // Catch:{ Throwable -> 0x00e9 }
            r1.L$13 = r15     // Catch:{ Throwable -> 0x00e9 }
            r2 = 3
            r1.label = r2     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Object r2 = r11.mo120363a(r15, r1)     // Catch:{ Throwable -> 0x00e9 }
            r12 = r16
            if (r2 != r12) goto L_0x01b0
            return r12
        L_0x01ae:
            r12 = r16
        L_0x01b0:
            r2 = r11
            r11 = r12
            r17 = r10
            r10 = r4
            r4 = r17
            r18 = r9
            r9 = r5
            r5 = r18
            r19 = r7
            r7 = r6
            r6 = r19
            goto L_0x010b
        L_0x01c3:
            return r11
        L_0x01c4:
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x01c5:
            throw r0
        L_0x01c6:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149331a(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object m149322a(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00e0
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00bb
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x008a:
            r10 = move-exception
            goto L_0x00f2
        L_0x008d:
            r10 = move-exception
            goto L_0x00f1
        L_0x0090:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f3
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008d }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009e:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008d }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00bb:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008d }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r12 == 0) goto L_0x00f0
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008d }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00e0:
            java.lang.Object r7 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Throwable -> 0x008d }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x009e
            r5.add(r12)     // Catch:{ Throwable -> 0x008d }
            goto L_0x009e
        L_0x00f0:
            return r5
        L_0x00f1:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00f2:
            throw r10
        L_0x00f3:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149322a(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r13 = r4;
        r4 = r11;
        r11 = r6;
        r8 = r3;
        r3 = r12;
        r12 = r5;
        r5 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r0.L$0 = r11;
        r0.L$1 = r12;
        r0.L$2 = r13;
        r0.L$3 = r1;
        r0.L$4 = r2;
        r0.L$5 = r3;
        r0.L$6 = r4;
        r0.L$7 = r10;
        r0.label = 1;
        r6 = r10.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r6 != r5) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r8 = r6;
        r6 = r11;
        r11 = r4;
        r4 = r13;
        r13 = r8;
        r9 = r5;
        r5 = r12;
        r12 = r3;
        r3 = r1;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.label = 2;
        r13 = r10.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r13 != r1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        if (((java.lang.Boolean) r4.invoke(r13)).booleanValue() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.L$8 = r13;
        r0.L$9 = r13;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        if (r5.mo120363a(r13, r0) != r1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.C48139f<? super E>> java.lang.Object m149330a(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNotTo$3
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x008a;
                case 2: goto L_0x005f;
                case 3: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x005a
        L_0x0050:
            r13 = r4
            r4 = r11
            r11 = r6
            r8 = r3
            r3 = r12
            r12 = r5
            r5 = r1
            r1 = r8
            goto L_0x00cc
        L_0x005a:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x005f:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x0085
            goto L_0x0112
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x008a:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x00af
            goto L_0x00f0
        L_0x00af:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x00b4:
            r10 = move-exception
            goto L_0x013e
        L_0x00b7:
            r10 = move-exception
            goto L_0x013d
        L_0x00ba:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x013f
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x00b7 }
            r4 = r10
            r3 = r13
            r5 = r1
            r1 = r4
            r13 = r12
            r10 = r2
            r2 = r1
            r12 = r11
            r11 = r2
        L_0x00cc:
            r0.L$0 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r1     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r6 = 1
            r0.label = r6     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r6 = r10.mo120360a(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r6 != r5) goto L_0x00e6
            return r5
        L_0x00e6:
            r8 = r6
            r6 = r11
            r11 = r4
            r4 = r13
            r13 = r8
            r9 = r5
            r5 = r12
            r12 = r3
            r3 = r1
            r1 = r9
        L_0x00f0:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x00b7 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x00b7 }
            if (r13 == 0) goto L_0x013c
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0112
            return r1
        L_0x0112:
            java.lang.Object r7 = r4.invoke(r13)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Throwable -> 0x00b7 }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x0050
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r0.L$8 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$9 = r13     // Catch:{ Throwable -> 0x00b7 }
            r7 = 3
            r0.label = r7     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r5.mo120363a(r13, r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0050
            return r1
        L_0x013c:
            return r5
        L_0x013d:
            throw r10     // Catch:{ all -> 0x00b4 }
        L_0x013e:
            throw r10
        L_0x013f:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149330a(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r13 = r4;
        r4 = r11;
        r11 = r6;
        r8 = r3;
        r3 = r12;
        r12 = r5;
        r5 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r0.L$0 = r11;
        r0.L$1 = r12;
        r0.L$2 = r13;
        r0.L$3 = r1;
        r0.L$4 = r2;
        r0.L$5 = r3;
        r0.L$6 = r4;
        r0.L$7 = r10;
        r0.label = 1;
        r6 = r10.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r6 != r5) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r8 = r6;
        r6 = r11;
        r11 = r4;
        r4 = r13;
        r13 = r8;
        r9 = r5;
        r5 = r12;
        r12 = r3;
        r3 = r1;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.label = 2;
        r13 = r10.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r13 != r1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        if (((java.lang.Boolean) r4.invoke(r13)).booleanValue() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.L$8 = r13;
        r0.L$9 = r13;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        if (r5.mo120363a(r13, r0) != r1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.C48139f<? super E>> java.lang.Object m149338b(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$3
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x008a;
                case 2: goto L_0x005f;
                case 3: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x005a
        L_0x0050:
            r13 = r4
            r4 = r11
            r11 = r6
            r8 = r3
            r3 = r12
            r12 = r5
            r5 = r1
            r1 = r8
            goto L_0x00cc
        L_0x005a:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x005f:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x0085
            goto L_0x0112
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x008a:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x00af
            goto L_0x00f0
        L_0x00af:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x00b4:
            r10 = move-exception
            goto L_0x013e
        L_0x00b7:
            r10 = move-exception
            goto L_0x013d
        L_0x00ba:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x013f
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x00b7 }
            r4 = r10
            r3 = r13
            r5 = r1
            r1 = r4
            r13 = r12
            r10 = r2
            r2 = r1
            r12 = r11
            r11 = r2
        L_0x00cc:
            r0.L$0 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r1     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r6 = 1
            r0.label = r6     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r6 = r10.mo120360a(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r6 != r5) goto L_0x00e6
            return r5
        L_0x00e6:
            r8 = r6
            r6 = r11
            r11 = r4
            r4 = r13
            r13 = r8
            r9 = r5
            r5 = r12
            r12 = r3
            r3 = r1
            r1 = r9
        L_0x00f0:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x00b7 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x00b7 }
            if (r13 == 0) goto L_0x013c
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0112
            return r1
        L_0x0112:
            java.lang.Object r7 = r4.invoke(r13)     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Throwable -> 0x00b7 }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x00b7 }
            if (r7 == 0) goto L_0x0050
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r0.L$8 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$9 = r13     // Catch:{ Throwable -> 0x00b7 }
            r7 = 3
            r0.label = r7     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r5.mo120363a(r13, r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0050
            return r1
        L_0x013c:
            return r5
        L_0x013d:
            throw r10     // Catch:{ all -> 0x00b4 }
        L_0x013e:
            throw r10
        L_0x013f:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149338b(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object m149327a(kotlinx.coroutines.channels.C48138e<? extends E> r16, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r17, kotlin.jvm.p357a.C7562b<? super E, ? extends V> r18, kotlin.coroutines.C47919b<? super java.util.Map<K, ? extends V>> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$2
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$2 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$2 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$2
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0066;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.b r10 = (kotlin.jvm.p357a.C7562b) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009e }
            if (r13 != 0) goto L_0x0061
            r14 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r14
            goto L_0x010b
        L_0x0061:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009e }
            throw r0     // Catch:{ Throwable -> 0x009e }
        L_0x0066:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.b r10 = (kotlin.jvm.p357a.C7562b) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009e }
            if (r13 != 0) goto L_0x0096
            r14 = r4
            r4 = r2
            r2 = r14
            goto L_0x00e1
        L_0x0096:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009e }
            throw r0     // Catch:{ Throwable -> 0x009e }
        L_0x009b:
            r0 = move-exception
            goto L_0x011a
        L_0x009e:
            r0 = move-exception
            goto L_0x0119
        L_0x00a1:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x011b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r16.mo120362a()     // Catch:{ Throwable -> 0x009e }
            r6 = r16
            r7 = r6
            r9 = r7
            r12 = r9
            r11 = r17
            r10 = r18
            r5 = r2
            r2 = r12
        L_0x00bc:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009e }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009e }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009e }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009e }
            r1.L$4 = r0     // Catch:{ Throwable -> 0x009e }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009e }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x009e }
            r1.L$7 = r3     // Catch:{ Throwable -> 0x009e }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x009e }
            r1.L$9 = r4     // Catch:{ Throwable -> 0x009e }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x009e }
            if (r8 != r5) goto L_0x00da
            return r5
        L_0x00da:
            r14 = r8
            r8 = r0
            r0 = r14
            r15 = r5
            r5 = r3
            r3 = r4
            r4 = r15
        L_0x00e1:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x009e }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x009e }
            if (r0 == 0) goto L_0x0118
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009e }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009e }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009e }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009e }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009e }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009e }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x009e }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x009e }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x009e }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x009e }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x009e }
            if (r0 != r4) goto L_0x0107
            return r4
        L_0x0107:
            r14 = r4
            r4 = r3
            r3 = r5
            r5 = r14
        L_0x010b:
            java.lang.Object r13 = r11.invoke(r0)     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r0 = r10.invoke(r0)     // Catch:{ Throwable -> 0x009e }
            r8.put(r13, r0)     // Catch:{ Throwable -> 0x009e }
            r0 = r8
            goto L_0x00bc
        L_0x0118:
            return r8
        L_0x0119:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x011a:
            throw r0
        L_0x011b:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149327a(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, M extends java.util.Map<? super K, ? super E>> java.lang.Object m149324a(kotlinx.coroutines.channels.C48138e<? extends E> r10, M r11, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r12, kotlin.coroutines.C47919b<? super M> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x008e;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008c }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00de
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008c }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008c }
            throw r10     // Catch:{ Throwable -> 0x008c }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008c }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00b9
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008c }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008c }
            throw r10     // Catch:{ Throwable -> 0x008c }
        L_0x008a:
            r10 = move-exception
            goto L_0x00e8
        L_0x008c:
            r10 = move-exception
            goto L_0x00e7
        L_0x008e:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e9
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008c }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009c:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008c }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008c }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008c }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008c }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008c }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008c }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008c }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008c }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008c }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008c }
            if (r12 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00b9:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008c }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008c }
            if (r12 == 0) goto L_0x00e6
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008c }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008c }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008c }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008c }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008c }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008c }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008c }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008c }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008c }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008c }
            if (r12 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00de:
            java.lang.Object r7 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008c }
            r5.put(r7, r12)     // Catch:{ Throwable -> 0x008c }
            goto L_0x009c
        L_0x00e6:
            return r5
        L_0x00e7:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00e8:
            throw r10
        L_0x00e9:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149324a(kotlinx.coroutines.channels.e, java.util.Map, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object m149325a(kotlinx.coroutines.channels.C48138e<? extends E> r10, M r11, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r12, kotlin.jvm.p357a.C7562b<? super E, ? extends V> r13, kotlin.coroutines.C47919b<? super M> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateByTo$3
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0061;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$8
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$6
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r13 = r0.L$5
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0095 }
            if (r7 != 0) goto L_0x005c
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r14
            r14 = r12
            r12 = r9
            goto L_0x00ed
        L_0x005c:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0095 }
            java.lang.Throwable r10 = r14.exception     // Catch:{ Throwable -> 0x0095 }
            throw r10     // Catch:{ Throwable -> 0x0095 }
        L_0x0061:
            java.lang.Object r10 = r0.L$8
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$6
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r13 = r0.L$5
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0095 }
            if (r7 != 0) goto L_0x008d
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x00c6
        L_0x008d:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0095 }
            java.lang.Throwable r10 = r14.exception     // Catch:{ Throwable -> 0x0095 }
            throw r10     // Catch:{ Throwable -> 0x0095 }
        L_0x0092:
            r10 = move-exception
            goto L_0x00fb
        L_0x0095:
            r10 = move-exception
            goto L_0x00fa
        L_0x0098:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00fc
            r14 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x0095 }
            r6 = r10
            r5 = r11
            r4 = r12
            r3 = r13
            r11 = r6
            r13 = r11
        L_0x00a7:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0095 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0095 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0095 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0095 }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x0095 }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x0095 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x0095 }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x0095 }
            r0.L$8 = r2     // Catch:{ Throwable -> 0x0095 }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0095 }
            if (r12 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00c6:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x0095 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x0095 }
            if (r12 == 0) goto L_0x00f9
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0095 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0095 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0095 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0095 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x0095 }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x0095 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x0095 }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x0095 }
            r0.L$8 = r10     // Catch:{ Throwable -> 0x0095 }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x0095 }
            if (r12 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00ed:
            java.lang.Object r7 = r4.invoke(r12)     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r12 = r3.invoke(r12)     // Catch:{ Throwable -> 0x0095 }
            r5.put(r7, r12)     // Catch:{ Throwable -> 0x0095 }
            goto L_0x00a7
        L_0x00f9:
            return r5
        L_0x00fa:
            throw r10     // Catch:{ all -> 0x0092 }
        L_0x00fb:
            throw r10
        L_0x00fc:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r10 = r14.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149325a(kotlinx.coroutines.channels.e, java.util.Map, kotlin.jvm.a.b, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object m149337b(kotlinx.coroutines.channels.C48138e<? extends E> r17, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r18, kotlin.jvm.p357a.C7562b<? super E, ? extends V> r19, kotlin.coroutines.C47919b<? super java.util.Map<K, ? extends java.util.List<? extends V>>> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$2
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$2 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$2 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$2
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0066;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.b r10 = (kotlin.jvm.p357a.C7562b) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009e }
            if (r13 != 0) goto L_0x0061
            r15 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r15
            goto L_0x010d
        L_0x0061:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009e }
            throw r0     // Catch:{ Throwable -> 0x009e }
        L_0x0066:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.b r10 = (kotlin.jvm.p357a.C7562b) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009e }
            if (r13 != 0) goto L_0x0096
            r15 = r4
            r4 = r2
            r2 = r15
            goto L_0x00e3
        L_0x0096:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009e }
            throw r0     // Catch:{ Throwable -> 0x009e }
        L_0x009b:
            r0 = move-exception
            goto L_0x012c
        L_0x009e:
            r0 = move-exception
            goto L_0x012b
        L_0x00a1:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x012d
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r17.mo120362a()     // Catch:{ Throwable -> 0x009e }
            r6 = r17
            r7 = r6
            r9 = r7
            r12 = r9
            r11 = r18
            r10 = r19
            r5 = r2
            r2 = r12
        L_0x00bc:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009e }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009e }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009e }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009e }
            r1.L$4 = r0     // Catch:{ Throwable -> 0x009e }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009e }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x009e }
            r1.L$7 = r3     // Catch:{ Throwable -> 0x009e }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x009e }
            r1.L$9 = r4     // Catch:{ Throwable -> 0x009e }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x009e }
            if (r8 != r5) goto L_0x00da
            return r5
        L_0x00da:
            r15 = r8
            r8 = r0
            r0 = r15
            r16 = r5
            r5 = r3
            r3 = r4
            r4 = r16
        L_0x00e3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x009e }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x009e }
            if (r0 == 0) goto L_0x012a
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009e }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009e }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009e }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009e }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009e }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009e }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x009e }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x009e }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x009e }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x009e }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x009e }
            if (r0 != r4) goto L_0x0109
            return r4
        L_0x0109:
            r15 = r4
            r4 = r3
            r3 = r5
            r5 = r15
        L_0x010d:
            java.lang.Object r13 = r11.invoke(r0)     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r14 = r8.get(r13)     // Catch:{ Throwable -> 0x009e }
            if (r14 != 0) goto L_0x011f
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Throwable -> 0x009e }
            r14.<init>()     // Catch:{ Throwable -> 0x009e }
            r8.put(r13, r14)     // Catch:{ Throwable -> 0x009e }
        L_0x011f:
            java.util.List r14 = (java.util.List) r14     // Catch:{ Throwable -> 0x009e }
            java.lang.Object r0 = r10.invoke(r0)     // Catch:{ Throwable -> 0x009e }
            r14.add(r0)     // Catch:{ Throwable -> 0x009e }
            r0 = r8
            goto L_0x00bc
        L_0x012a:
            return r8
        L_0x012b:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x012c:
            throw r0
        L_0x012d:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149337b(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, java.util.List<V>>> java.lang.Object m149335b(kotlinx.coroutines.channels.C48138e<? extends E> r11, M r12, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r13, kotlin.jvm.p357a.C7562b<? super E, ? extends V> r14, kotlin.coroutines.C47919b<? super M> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$3
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0061;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002c:
            java.lang.Object r11 = r0.L$8
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r14 = r0.L$5
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0095 }
            if (r7 != 0) goto L_0x005c
            r9 = r2
            r2 = r11
            r11 = r9
            r10 = r15
            r15 = r13
            r13 = r10
            goto L_0x00ed
        L_0x005c:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0095 }
            java.lang.Throwable r11 = r15.exception     // Catch:{ Throwable -> 0x0095 }
            throw r11     // Catch:{ Throwable -> 0x0095 }
        L_0x0061:
            java.lang.Object r11 = r0.L$8
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r14 = r0.L$5
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0095 }
            if (r7 != 0) goto L_0x008d
            r9 = r15
            r15 = r13
            r13 = r9
            goto L_0x00c6
        L_0x008d:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0095 }
            java.lang.Throwable r11 = r15.exception     // Catch:{ Throwable -> 0x0095 }
            throw r11     // Catch:{ Throwable -> 0x0095 }
        L_0x0092:
            r11 = move-exception
            goto L_0x010b
        L_0x0095:
            r11 = move-exception
            goto L_0x010a
        L_0x0098:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x010c
            r15 = 0
            kotlinx.coroutines.channels.b r2 = r11.mo120362a()     // Catch:{ Throwable -> 0x0095 }
            r6 = r11
            r5 = r12
            r4 = r13
            r3 = r14
            r12 = r6
            r14 = r12
        L_0x00a7:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0095 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0095 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0095 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0095 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x0095 }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x0095 }
            r0.L$6 = r15     // Catch:{ Throwable -> 0x0095 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x0095 }
            r0.L$8 = r2     // Catch:{ Throwable -> 0x0095 }
            r13 = 1
            r0.label = r13     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r13 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0095 }
            if (r13 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r9 = r2
            r2 = r11
            r11 = r9
        L_0x00c6:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x0095 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x0095 }
            if (r13 == 0) goto L_0x0109
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0095 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0095 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0095 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0095 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x0095 }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x0095 }
            r0.L$6 = r15     // Catch:{ Throwable -> 0x0095 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x0095 }
            r0.L$8 = r11     // Catch:{ Throwable -> 0x0095 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r13 = r11.mo120361b(r0)     // Catch:{ Throwable -> 0x0095 }
            if (r13 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            r9 = r2
            r2 = r11
            r11 = r9
        L_0x00ed:
            java.lang.Object r7 = r4.invoke(r13)     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r8 = r5.get(r7)     // Catch:{ Throwable -> 0x0095 }
            if (r8 != 0) goto L_0x00ff
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0095 }
            r8.<init>()     // Catch:{ Throwable -> 0x0095 }
            r5.put(r7, r8)     // Catch:{ Throwable -> 0x0095 }
        L_0x00ff:
            java.util.List r8 = (java.util.List) r8     // Catch:{ Throwable -> 0x0095 }
            java.lang.Object r13 = r3.invoke(r13)     // Catch:{ Throwable -> 0x0095 }
            r8.add(r13)     // Catch:{ Throwable -> 0x0095 }
            goto L_0x00a7
        L_0x0109:
            return r5
        L_0x010a:
            throw r11     // Catch:{ all -> 0x0092 }
        L_0x010b:
            throw r11
        L_0x010c:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r11 = r15.exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149335b(kotlinx.coroutines.channels.e, java.util.Map, kotlin.jvm.a.b, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.C48139f<? super R>> java.lang.Object m149339b(kotlinx.coroutines.channels.C48138e<? extends E> r17, C r18, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, ? extends R> r19, kotlin.coroutines.C47919b<? super C> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$3
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$3 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$3 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$3
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x0094;
                case 2: goto L_0x0061;
                case 3: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c9 }
            if (r13 != 0) goto L_0x005c
            goto L_0x00ea
        L_0x005c:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00c9 }
            throw r0     // Catch:{ Throwable -> 0x00c9 }
        L_0x0061:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c9 }
            if (r13 != 0) goto L_0x008f
            goto L_0x012e
        L_0x008f:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00c9 }
            throw r0     // Catch:{ Throwable -> 0x00c9 }
        L_0x0094:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.channels.f r11 = (kotlinx.coroutines.channels.C48139f) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c9 }
            if (r13 != 0) goto L_0x00c1
            goto L_0x0108
        L_0x00c1:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00c9 }
            throw r0     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c6:
            r0 = move-exception
            goto L_0x017b
        L_0x00c9:
            r0 = move-exception
            goto L_0x017a
        L_0x00cc:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x017c
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r17.mo120362a()     // Catch:{ Throwable -> 0x00c9 }
            r6 = r17
            r7 = r6
            r9 = r7
            r12 = r9
            r11 = r18
            r10 = r19
            r8 = r0
            r5 = r3
            r3 = r4
            r4 = r12
        L_0x00ea:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00c9 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00c9 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00c9 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00c9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00c9 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00c9 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00c9 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00c9 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x00c9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00c9 }
            r0 = 1
            r1.label = r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Object r0 = r3.mo120360a(r1)     // Catch:{ Throwable -> 0x00c9 }
            if (r0 != r2) goto L_0x0108
            return r2
        L_0x0108:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x00c9 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x00c9 }
            if (r0 == 0) goto L_0x0179
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00c9 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00c9 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00c9 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00c9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00c9 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00c9 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00c9 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00c9 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x00c9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00c9 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x00c9 }
            if (r0 != r2) goto L_0x012e
            return r2
        L_0x012e:
            kotlin.collections.z r13 = new kotlin.collections.z     // Catch:{ Throwable -> 0x00c9 }
            int r14 = r8.element     // Catch:{ Throwable -> 0x00c9 }
            int r15 = r14 + 1
            r8.element = r15     // Catch:{ Throwable -> 0x00c9 }
            r13.<init>(r14, r0)     // Catch:{ Throwable -> 0x00c9 }
            int r14 = r13.f122770a     // Catch:{ Throwable -> 0x00c9 }
            T r15 = r13.f122771b     // Catch:{ Throwable -> 0x00c9 }
            r16 = r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r14)     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Object r2 = r10.invoke(r2, r15)     // Catch:{ Throwable -> 0x00c9 }
            if (r2 == 0) goto L_0x0175
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00c9 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00c9 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00c9 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00c9 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00c9 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00c9 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00c9 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00c9 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x00c9 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00c9 }
            r1.L$10 = r0     // Catch:{ Throwable -> 0x00c9 }
            r1.L$11 = r0     // Catch:{ Throwable -> 0x00c9 }
            r1.L$12 = r13     // Catch:{ Throwable -> 0x00c9 }
            r1.I$0 = r14     // Catch:{ Throwable -> 0x00c9 }
            r1.L$13 = r15     // Catch:{ Throwable -> 0x00c9 }
            r1.L$14 = r2     // Catch:{ Throwable -> 0x00c9 }
            r0 = 3
            r1.label = r0     // Catch:{ Throwable -> 0x00c9 }
            java.lang.Object r0 = r11.mo120363a(r2, r1)     // Catch:{ Throwable -> 0x00c9 }
            r2 = r16
            if (r0 != r2) goto L_0x00ea
            return r2
        L_0x0175:
            r2 = r16
            goto L_0x00ea
        L_0x0179:
            return r11
        L_0x017a:
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x017b:
            throw r0
        L_0x017c:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149339b(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r15 = r5;
        r5 = r13;
        r13 = r7;
        r10 = r3;
        r3 = r14;
        r14 = r6;
        r6 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        r0.L$0 = r13;
        r0.L$1 = r14;
        r0.L$2 = r15;
        r0.L$3 = r4;
        r0.L$4 = r1;
        r0.L$5 = r2;
        r0.L$6 = r3;
        r0.L$7 = r5;
        r0.L$8 = r12;
        r0.label = 1;
        r7 = r12.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r7 != r6) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        r10 = r7;
        r7 = r13;
        r13 = r5;
        r5 = r15;
        r15 = r10;
        r11 = r6;
        r6 = r14;
        r14 = r3;
        r3 = r1;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010d, code lost:
        if (((java.lang.Boolean) r15).booleanValue() == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r4;
        r0.L$4 = r3;
        r0.L$5 = r2;
        r0.L$6 = r14;
        r0.L$7 = r13;
        r0.L$8 = r12;
        r0.label = 2;
        r15 = r12.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0128, code lost:
        if (r15 != r1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        r8 = r4.element;
        r4.element = r8 + 1;
        r8 = r5.invoke(kotlin.coroutines.jvm.internal.C47951a.m148884a(r8), r15);
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r4;
        r0.L$4 = r3;
        r0.L$5 = r2;
        r0.L$6 = r14;
        r0.L$7 = r13;
        r0.L$8 = r12;
        r0.L$9 = r15;
        r0.L$10 = r15;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0156, code lost:
        if (r6.mo120363a(r8, r0) != r1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0158, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0159, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.C48139f<? super R>> java.lang.Object m149345c(kotlinx.coroutines.channels.C48138e<? extends E> r12, C r13, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, ? extends R> r14, kotlin.coroutines.C47919b<? super C> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$3
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x0092;
                case 2: goto L_0x0063;
                case 3: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002c:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r14 = r0.L$6
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C48139f) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c3 }
            if (r8 != 0) goto L_0x005e
        L_0x0054:
            r15 = r5
            r5 = r13
            r13 = r7
            r10 = r3
            r3 = r14
            r14 = r6
            r6 = r1
            r1 = r10
            goto L_0x00e1
        L_0x005e:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Throwable r12 = r15.exception     // Catch:{ Throwable -> 0x00c3 }
            throw r12     // Catch:{ Throwable -> 0x00c3 }
        L_0x0063:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r14 = r0.L$6
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C48139f) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c3 }
            if (r8 != 0) goto L_0x008d
            goto L_0x012b
        L_0x008d:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Throwable r12 = r15.exception     // Catch:{ Throwable -> 0x00c3 }
            throw r12     // Catch:{ Throwable -> 0x00c3 }
        L_0x0092:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r14 = r0.L$6
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.f r6 = (kotlinx.coroutines.channels.C48139f) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00c3 }
            if (r8 != 0) goto L_0x00bb
            goto L_0x0107
        L_0x00bb:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Throwable r12 = r15.exception     // Catch:{ Throwable -> 0x00c3 }
            throw r12     // Catch:{ Throwable -> 0x00c3 }
        L_0x00c0:
            r12 = move-exception
            goto L_0x015b
        L_0x00c3:
            r12 = move-exception
            goto L_0x015a
        L_0x00c6:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x015c
            kotlin.jvm.internal.Ref$IntRef r15 = new kotlin.jvm.internal.Ref$IntRef
            r15.<init>()
            r2 = 0
            r15.element = r2
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r12.mo120362a()     // Catch:{ Throwable -> 0x00c3 }
            r5 = r12
            r4 = r15
            r6 = r1
            r1 = r5
            r15 = r14
            r12 = r3
            r14 = r13
            r3 = r2
            r13 = r1
            r2 = r13
        L_0x00e1:
            r0.L$0 = r13     // Catch:{ Throwable -> 0x00c3 }
            r0.L$1 = r14     // Catch:{ Throwable -> 0x00c3 }
            r0.L$2 = r15     // Catch:{ Throwable -> 0x00c3 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00c3 }
            r0.L$4 = r1     // Catch:{ Throwable -> 0x00c3 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00c3 }
            r0.L$6 = r3     // Catch:{ Throwable -> 0x00c3 }
            r0.L$7 = r5     // Catch:{ Throwable -> 0x00c3 }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x00c3 }
            r7 = 1
            r0.label = r7     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Object r7 = r12.mo120360a(r0)     // Catch:{ Throwable -> 0x00c3 }
            if (r7 != r6) goto L_0x00fd
            return r6
        L_0x00fd:
            r10 = r7
            r7 = r13
            r13 = r5
            r5 = r15
            r15 = r10
            r11 = r6
            r6 = r14
            r14 = r3
            r3 = r1
            r1 = r11
        L_0x0107:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Throwable -> 0x00c3 }
            boolean r15 = r15.booleanValue()     // Catch:{ Throwable -> 0x00c3 }
            if (r15 == 0) goto L_0x0159
            r0.L$0 = r7     // Catch:{ Throwable -> 0x00c3 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x00c3 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x00c3 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00c3 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x00c3 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00c3 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x00c3 }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x00c3 }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x00c3 }
            r15 = 2
            r0.label = r15     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Object r15 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x00c3 }
            if (r15 != r1) goto L_0x012b
            return r1
        L_0x012b:
            int r8 = r4.element     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r8 + 1
            r4.element = r9     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r8)     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Object r8 = r5.invoke(r8, r15)     // Catch:{ Throwable -> 0x00c3 }
            r0.L$0 = r7     // Catch:{ Throwable -> 0x00c3 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x00c3 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x00c3 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00c3 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x00c3 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00c3 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x00c3 }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x00c3 }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x00c3 }
            r0.L$9 = r15     // Catch:{ Throwable -> 0x00c3 }
            r0.L$10 = r15     // Catch:{ Throwable -> 0x00c3 }
            r15 = 3
            r0.label = r15     // Catch:{ Throwable -> 0x00c3 }
            java.lang.Object r15 = r6.mo120363a(r8, r0)     // Catch:{ Throwable -> 0x00c3 }
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x0159:
            return r6
        L_0x015a:
            throw r12     // Catch:{ all -> 0x00c0 }
        L_0x015b:
            throw r12
        L_0x015c:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r12 = r15.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149345c(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.C48139f<? super R>> java.lang.Object m149344c(kotlinx.coroutines.channels.C48138e<? extends E> r8, C r9, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r10, kotlin.coroutines.C47919b<? super C> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$3
            r0.<init>(r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x0082;
                case 2: goto L_0x0057;
                case 3: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002c:
            java.lang.Object r8 = r0.L$7
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$6
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r0.L$5
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r11 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00af }
            if (r7 != 0) goto L_0x0052
            goto L_0x00c3
        L_0x0052:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Throwable r8 = r11.exception     // Catch:{ Throwable -> 0x00af }
            throw r8     // Catch:{ Throwable -> 0x00af }
        L_0x0057:
            java.lang.Object r8 = r0.L$7
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$6
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r0.L$5
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r11 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00af }
            if (r7 != 0) goto L_0x007d
            goto L_0x00ff
        L_0x007d:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Throwable r8 = r11.exception     // Catch:{ Throwable -> 0x00af }
            throw r8     // Catch:{ Throwable -> 0x00af }
        L_0x0082:
            java.lang.Object r8 = r0.L$7
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$6
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r0.L$5
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r11 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00af }
            if (r7 != 0) goto L_0x00a7
            goto L_0x00dd
        L_0x00a7:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Throwable r8 = r11.exception     // Catch:{ Throwable -> 0x00af }
            throw r8     // Catch:{ Throwable -> 0x00af }
        L_0x00ac:
            r8 = move-exception
            goto L_0x0127
        L_0x00af:
            r8 = move-exception
            goto L_0x0126
        L_0x00b2:
            boolean r2 = r11 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0128
            r11 = 0
            kotlinx.coroutines.channels.b r2 = r8.mo120362a()     // Catch:{ Throwable -> 0x00af }
            r3 = r8
            r6 = r3
            r5 = r9
            r4 = r10
            r10 = r11
            r9 = r6
            r8 = r2
            r2 = r9
        L_0x00c3:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00af }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00af }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00af }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00af }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00af }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x00af }
            r0.L$6 = r9     // Catch:{ Throwable -> 0x00af }
            r0.L$7 = r8     // Catch:{ Throwable -> 0x00af }
            r11 = 1
            r0.label = r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Object r11 = r8.mo120360a(r0)     // Catch:{ Throwable -> 0x00af }
            if (r11 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Throwable -> 0x00af }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x00af }
            if (r11 == 0) goto L_0x0125
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00af }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00af }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00af }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00af }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00af }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x00af }
            r0.L$6 = r9     // Catch:{ Throwable -> 0x00af }
            r0.L$7 = r8     // Catch:{ Throwable -> 0x00af }
            r11 = 2
            r0.label = r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Object r11 = r8.mo120361b(r0)     // Catch:{ Throwable -> 0x00af }
            if (r11 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            java.lang.Object r7 = r4.invoke(r11)     // Catch:{ Throwable -> 0x00af }
            if (r7 == 0) goto L_0x00c3
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00af }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00af }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00af }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00af }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00af }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x00af }
            r0.L$6 = r9     // Catch:{ Throwable -> 0x00af }
            r0.L$7 = r8     // Catch:{ Throwable -> 0x00af }
            r0.L$8 = r11     // Catch:{ Throwable -> 0x00af }
            r0.L$9 = r11     // Catch:{ Throwable -> 0x00af }
            r0.L$10 = r7     // Catch:{ Throwable -> 0x00af }
            r11 = 3
            r0.label = r11     // Catch:{ Throwable -> 0x00af }
            java.lang.Object r11 = r5.mo120363a(r7, r0)     // Catch:{ Throwable -> 0x00af }
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x0125:
            return r5
        L_0x0126:
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x0127:
            throw r8
        L_0x0128:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11
            java.lang.Throwable r8 = r11.exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149344c(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r3;
        r0.L$3 = r2;
        r0.L$4 = r11;
        r0.L$5 = r10;
        r0.label = 2;
        r12 = r10.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        if (r12 != r1) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r3;
        r0.L$3 = r2;
        r0.L$4 = r11;
        r0.L$5 = r10;
        r0.L$6 = r12;
        r0.label = 3;
        r6 = r10.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        if (r6 != r1) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0133, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        r7 = r5;
        r5 = r3;
        r3 = r11;
        r11 = r12;
        r12 = r6;
        r9 = r2;
        r2 = r10;
        r10 = r4;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0143, code lost:
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        r0.L$0 = r7;
        r0.L$1 = r10;
        r0.L$2 = r5;
        r0.L$3 = r4;
        r0.L$4 = r3;
        r0.L$5 = r2;
        r0.L$6 = r11;
        r0.L$7 = r11;
        r0.L$8 = r10;
        r0.label = 4;
        r12 = r2.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015e, code lost:
        if (r12 != r1) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0160, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0161, code lost:
        r6 = r3;
        r3 = r5;
        r5 = r7;
        r7 = r1;
        r1 = r4;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0167, code lost:
        r12 = r10.invoke(r11, r12);
        r10 = r2;
        r11 = r6;
        r2 = r1;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0170, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017a, code lost:
        throw new java.lang.UnsupportedOperationException("Empty channel can't be reduced.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, E extends S> java.lang.Object m149328a(kotlinx.coroutines.channels.C48138e<? extends E> r10, kotlin.jvm.p357a.C7563m<? super S, ? super E, ? extends S> r11, kotlin.coroutines.C47919b<? super S> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduce$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduce$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduce$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduce$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduce$1
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00ad;
                case 2: goto L_0x008a;
                case 3: goto L_0x005d;
                case 4: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            java.lang.Object r10 = r0.L$8
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r0.L$7
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.b r2 = (kotlinx.coroutines.channels.C48135b) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.m r6 = (kotlin.jvm.p357a.C7563m) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r8 != 0) goto L_0x0058
            r9 = r7
            r7 = r1
            r1 = r4
            r4 = r6
            r6 = r3
            r3 = r5
            r5 = r9
            goto L_0x0167
        L_0x0058:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r10     // Catch:{ Throwable -> 0x00d6 }
        L_0x005d:
            java.lang.Object r10 = r0.L$6
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != 0) goto L_0x0085
            r7 = r6
            r9 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
            goto L_0x013d
        L_0x0085:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r10     // Catch:{ Throwable -> 0x00d6 }
        L_0x008a:
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$4
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.m r4 = (kotlin.jvm.p357a.C7563m) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r6 != 0) goto L_0x00a8
            goto L_0x011c
        L_0x00a8:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r10     // Catch:{ Throwable -> 0x00d6 }
        L_0x00ad:
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$4
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$3
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.m r4 = (kotlin.jvm.p357a.C7563m) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r6 != 0) goto L_0x00ce
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x00fe
        L_0x00ce:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r10     // Catch:{ Throwable -> 0x00d6 }
        L_0x00d3:
            r10 = move-exception
            goto L_0x017c
        L_0x00d6:
            r10 = move-exception
            goto L_0x017b
        L_0x00d9:
            boolean r2 = r12 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x017d
            kotlinx.coroutines.channels.b r12 = r10.mo120362a()     // Catch:{ Throwable -> 0x00d6 }
            r0.L$0 = r10     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r11     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r10     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00d6 }
            r2 = 1
            r0.label = r2     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r2 = r12.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r2 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r5 = r10
            r4 = r11
            r11 = r5
            r10 = r12
            r12 = r2
            r2 = r3
            r3 = r11
        L_0x00fe:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x00d6 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r12 == 0) goto L_0x0171
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x00d6 }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r12 != r1) goto L_0x011c
            return r1
        L_0x011c:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x00d6 }
            r6 = 3
            r0.label = r6     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r6 = r10.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r6 != r1) goto L_0x0134
            return r1
        L_0x0134:
            r7 = r5
            r5 = r3
            r3 = r11
            r11 = r12
            r12 = r6
            r9 = r2
            r2 = r10
            r10 = r4
            r4 = r9
        L_0x013d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x00d6 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r12 == 0) goto L_0x0170
            r0.L$0 = r7     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r10     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00d6 }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x00d6 }
            r0.L$8 = r10     // Catch:{ Throwable -> 0x00d6 }
            r12 = 4
            r0.label = r12     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r12 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r12 != r1) goto L_0x0161
            return r1
        L_0x0161:
            r6 = r3
            r3 = r5
            r5 = r7
            r7 = r1
            r1 = r4
            r4 = r10
        L_0x0167:
            java.lang.Object r12 = r10.invoke(r11, r12)     // Catch:{ Throwable -> 0x00d6 }
            r10 = r2
            r11 = r6
            r2 = r1
            r1 = r7
            goto L_0x011c
        L_0x0170:
            return r11
        L_0x0171:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r11 = "Empty channel can't be reduced."
            r10.<init>(r11)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ Throwable -> 0x00d6 }
            throw r10     // Catch:{ Throwable -> 0x00d6 }
        L_0x017b:
            throw r10     // Catch:{ all -> 0x00d3 }
        L_0x017c:
            throw r10
        L_0x017d:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12
            java.lang.Throwable r10 = r12.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149328a(kotlinx.coroutines.channels.e, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0112, code lost:
        r2.L$0 = r9;
        r2.L$1 = r8;
        r2.L$2 = r7;
        r2.L$3 = r5;
        r2.L$4 = r4;
        r2.L$5 = r0;
        r2.I$0 = 1;
        r2.label = 2;
        r1 = r0.mo120361b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        if (r1 != r3) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0129, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        r2.L$0 = r9;
        r2.L$1 = r8;
        r2.L$2 = r7;
        r2.L$3 = r5;
        r2.L$4 = r4;
        r2.L$5 = r0;
        r2.I$0 = r6;
        r2.L$6 = r1;
        r2.label = 3;
        r10 = r0.mo120360a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        if (r10 != r3) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0143, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        r12 = r9;
        r9 = r5;
        r5 = r1;
        r1 = r10;
        r10 = r7;
        r7 = r0;
        r0 = r8;
        r8 = r4;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
        r1 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r4);
        r6 = r4 + 1;
        r2.L$0 = r12;
        r2.L$1 = r0;
        r2.L$2 = r10;
        r2.L$3 = r9;
        r2.L$4 = r8;
        r2.L$5 = r7;
        r2.I$0 = r6;
        r2.L$6 = r5;
        r2.L$7 = r5;
        r2.L$8 = r1;
        r2.L$9 = r0;
        r2.label = 4;
        r4 = r7.mo120361b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0178, code lost:
        if (r4 != r3) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017b, code lost:
        r11 = r6;
        r6 = r8;
        r8 = r0;
        r14 = r4;
        r4 = r1;
        r1 = r14;
        r15 = r12;
        r12 = r3;
        r3 = r9;
        r9 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0185, code lost:
        r1 = r0.invoke(r4, r5, r1);
        r5 = r3;
        r4 = r6;
        r0 = r7;
        r7 = r10;
        r6 = r11;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0190, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019a, code lost:
        throw new java.lang.UnsupportedOperationException("Empty channel can't be reduced.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, E extends S> java.lang.Object m149329a(kotlinx.coroutines.channels.C48138e<? extends E> r16, kotlin.jvm.p357a.C48006q<? super java.lang.Integer, ? super S, ? super E, ? extends S> r17, kotlin.coroutines.C47919b<? super S> r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduceIndexed$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduceIndexed$1 r2 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduceIndexed$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L_0x001d
        L_0x0018:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduceIndexed$1 r2 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$reduceIndexed$1
            r2.<init>(r1)
        L_0x001d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00bd;
                case 2: goto L_0x0098;
                case 3: goto L_0x0069;
                case 4: goto L_0x0032;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.lang.Object r0 = r2.L$9
            kotlin.jvm.a.q r0 = (kotlin.jvm.p357a.C48006q) r0
            java.lang.Object r4 = r2.L$8
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r5 = r2.L$7
            int r6 = r2.I$0
            java.lang.Object r7 = r2.L$5
            kotlinx.coroutines.channels.b r7 = (kotlinx.coroutines.channels.C48135b) r7
            java.lang.Object r8 = r2.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r2.L$3
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r10 = r2.L$2
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            java.lang.Object r11 = r2.L$1
            kotlin.jvm.a.q r11 = (kotlin.jvm.p357a.C48006q) r11
            java.lang.Object r12 = r2.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r1 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e2 }
            if (r13 != 0) goto L_0x0064
            r14 = r12
            r12 = r3
            r3 = r9
            r9 = r14
            r15 = r11
            r11 = r6
            r6 = r8
            r8 = r15
            goto L_0x0185
        L_0x0064:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Throwable r0 = r1.exception     // Catch:{ Throwable -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00e2 }
        L_0x0069:
            java.lang.Object r0 = r2.L$6
            int r4 = r2.I$0
            java.lang.Object r5 = r2.L$5
            kotlinx.coroutines.channels.b r5 = (kotlinx.coroutines.channels.C48135b) r5
            java.lang.Object r6 = r2.L$4
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r2.L$3
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r2.L$2
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r2.L$1
            kotlin.jvm.a.q r9 = (kotlin.jvm.p357a.C48006q) r9
            java.lang.Object r10 = r2.L$0
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            boolean r11 = r1 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e2 }
            if (r11 != 0) goto L_0x0093
            r12 = r10
            r10 = r8
            r8 = r6
            r14 = r5
            r5 = r0
            r0 = r9
            r9 = r7
            r7 = r14
            goto L_0x014d
        L_0x0093:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Throwable r0 = r1.exception     // Catch:{ Throwable -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00e2 }
        L_0x0098:
            int r6 = r2.I$0
            java.lang.Object r0 = r2.L$5
            kotlinx.coroutines.channels.b r0 = (kotlinx.coroutines.channels.C48135b) r0
            java.lang.Object r4 = r2.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r2.L$3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r7 = r2.L$2
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r2.L$1
            kotlin.jvm.a.q r8 = (kotlin.jvm.p357a.C48006q) r8
            java.lang.Object r9 = r2.L$0
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            boolean r10 = r1 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e2 }
            if (r10 != 0) goto L_0x00b8
            goto L_0x012a
        L_0x00b8:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Throwable r0 = r1.exception     // Catch:{ Throwable -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00e2 }
        L_0x00bd:
            java.lang.Object r0 = r2.L$5
            kotlinx.coroutines.channels.b r0 = (kotlinx.coroutines.channels.C48135b) r0
            java.lang.Object r4 = r2.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r2.L$3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r7 = r2.L$2
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r2.L$1
            kotlin.jvm.a.q r8 = (kotlin.jvm.p357a.C48006q) r8
            java.lang.Object r9 = r2.L$0
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            boolean r10 = r1 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00e2 }
            if (r10 != 0) goto L_0x00da
            goto L_0x010a
        L_0x00da:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Throwable r0 = r1.exception     // Catch:{ Throwable -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00e2 }
        L_0x00df:
            r0 = move-exception
            goto L_0x019c
        L_0x00e2:
            r0 = move-exception
            goto L_0x019b
        L_0x00e5:
            boolean r4 = r1 instanceof kotlin.Result.Failure
            if (r4 != 0) goto L_0x019d
            kotlinx.coroutines.channels.b r1 = r16.mo120362a()     // Catch:{ Throwable -> 0x00e2 }
            r2.L$0 = r0     // Catch:{ Throwable -> 0x00e2 }
            r4 = r17
            r2.L$1 = r4     // Catch:{ Throwable -> 0x00e2 }
            r2.L$2 = r0     // Catch:{ Throwable -> 0x00e2 }
            r2.L$3 = r5     // Catch:{ Throwable -> 0x00e2 }
            r2.L$4 = r0     // Catch:{ Throwable -> 0x00e2 }
            r2.L$5 = r1     // Catch:{ Throwable -> 0x00e2 }
            r2.label = r6     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r7 = r1.mo120360a(r2)     // Catch:{ Throwable -> 0x00e2 }
            if (r7 != r3) goto L_0x0104
            return r3
        L_0x0104:
            r9 = r0
            r8 = r4
            r4 = r9
            r0 = r1
            r1 = r7
            r7 = r4
        L_0x010a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x00e2 }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x00e2 }
            if (r1 == 0) goto L_0x0191
            r2.L$0 = r9     // Catch:{ Throwable -> 0x00e2 }
            r2.L$1 = r8     // Catch:{ Throwable -> 0x00e2 }
            r2.L$2 = r7     // Catch:{ Throwable -> 0x00e2 }
            r2.L$3 = r5     // Catch:{ Throwable -> 0x00e2 }
            r2.L$4 = r4     // Catch:{ Throwable -> 0x00e2 }
            r2.L$5 = r0     // Catch:{ Throwable -> 0x00e2 }
            r2.I$0 = r6     // Catch:{ Throwable -> 0x00e2 }
            r1 = 2
            r2.label = r1     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r1 = r0.mo120361b(r2)     // Catch:{ Throwable -> 0x00e2 }
            if (r1 != r3) goto L_0x012a
            return r3
        L_0x012a:
            r2.L$0 = r9     // Catch:{ Throwable -> 0x00e2 }
            r2.L$1 = r8     // Catch:{ Throwable -> 0x00e2 }
            r2.L$2 = r7     // Catch:{ Throwable -> 0x00e2 }
            r2.L$3 = r5     // Catch:{ Throwable -> 0x00e2 }
            r2.L$4 = r4     // Catch:{ Throwable -> 0x00e2 }
            r2.L$5 = r0     // Catch:{ Throwable -> 0x00e2 }
            r2.I$0 = r6     // Catch:{ Throwable -> 0x00e2 }
            r2.L$6 = r1     // Catch:{ Throwable -> 0x00e2 }
            r10 = 3
            r2.label = r10     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r10 = r0.mo120360a(r2)     // Catch:{ Throwable -> 0x00e2 }
            if (r10 != r3) goto L_0x0144
            return r3
        L_0x0144:
            r12 = r9
            r9 = r5
            r5 = r1
            r1 = r10
            r10 = r7
            r7 = r0
            r0 = r8
            r8 = r4
            r4 = r6
        L_0x014d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x00e2 }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x00e2 }
            if (r1 == 0) goto L_0x0190
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r4)     // Catch:{ Throwable -> 0x00e2 }
            int r6 = r4 + 1
            r2.L$0 = r12     // Catch:{ Throwable -> 0x00e2 }
            r2.L$1 = r0     // Catch:{ Throwable -> 0x00e2 }
            r2.L$2 = r10     // Catch:{ Throwable -> 0x00e2 }
            r2.L$3 = r9     // Catch:{ Throwable -> 0x00e2 }
            r2.L$4 = r8     // Catch:{ Throwable -> 0x00e2 }
            r2.L$5 = r7     // Catch:{ Throwable -> 0x00e2 }
            r2.I$0 = r6     // Catch:{ Throwable -> 0x00e2 }
            r2.L$6 = r5     // Catch:{ Throwable -> 0x00e2 }
            r2.L$7 = r5     // Catch:{ Throwable -> 0x00e2 }
            r2.L$8 = r1     // Catch:{ Throwable -> 0x00e2 }
            r2.L$9 = r0     // Catch:{ Throwable -> 0x00e2 }
            r4 = 4
            r2.label = r4     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r4 = r7.mo120361b(r2)     // Catch:{ Throwable -> 0x00e2 }
            if (r4 != r3) goto L_0x017b
            return r3
        L_0x017b:
            r11 = r6
            r6 = r8
            r8 = r0
            r14 = r4
            r4 = r1
            r1 = r14
            r15 = r12
            r12 = r3
            r3 = r9
            r9 = r15
        L_0x0185:
            java.lang.Object r1 = r0.invoke(r4, r5, r1)     // Catch:{ Throwable -> 0x00e2 }
            r5 = r3
            r4 = r6
            r0 = r7
            r7 = r10
            r6 = r11
            r3 = r12
            goto L_0x012a
        L_0x0190:
            return r5
        L_0x0191:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r1 = "Empty channel can't be reduced."
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Throwable -> 0x00e2 }
            throw r0     // Catch:{ Throwable -> 0x00e2 }
        L_0x019b:
            throw r0     // Catch:{ all -> 0x00df }
        L_0x019c:
            throw r0
        L_0x019d:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1
            java.lang.Throwable r0 = r1.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149329a(kotlinx.coroutines.channels.e, kotlin.jvm.a.q, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149318a(kotlinx.coroutines.channels.C48134a<E> r8, kotlin.jvm.p357a.C7562b<? super E, kotlin.C7581n> r9, kotlin.coroutines.C47919b<? super kotlin.C7581n> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            if (r0 == 0) goto L_0x0014
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r10)
        L_0x0019:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0054;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002c:
            java.lang.Object r8 = r0.L$5
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.a r3 = (kotlinx.coroutines.channels.C48134a) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.a r5 = (kotlinx.coroutines.channels.C48134a) r5
            boolean r6 = r10 instanceof kotlin.Result.Failure     // Catch:{ all -> 0x0079 }
            if (r6 != 0) goto L_0x004f
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r10
        L_0x004c:
            r10 = r7
            goto L_0x00c7
        L_0x004f:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10     // Catch:{ all -> 0x0079 }
            java.lang.Throwable r8 = r10.exception     // Catch:{ all -> 0x0079 }
            throw r8     // Catch:{ all -> 0x0079 }
        L_0x0054:
            java.lang.Object r8 = r0.L$5
            kotlinx.coroutines.channels.b r8 = (kotlinx.coroutines.channels.C48135b) r8
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.a r3 = (kotlinx.coroutines.channels.C48134a) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.a r5 = (kotlinx.coroutines.channels.C48134a) r5
            boolean r6 = r10 instanceof kotlin.Result.Failure     // Catch:{ all -> 0x0079 }
            if (r6 != 0) goto L_0x0074
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00a5
        L_0x0074:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10     // Catch:{ all -> 0x0079 }
            java.lang.Throwable r8 = r10.exception     // Catch:{ all -> 0x0079 }
            throw r8     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r8 = move-exception
            goto L_0x00ce
        L_0x007b:
            boolean r2 = r10 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00cf
            kotlinx.coroutines.channels.e r10 = r8.mo120359a()
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ all -> 0x0079 }
            r3 = r8
            r5 = r3
            r4 = r9
            r8 = r10
        L_0x008b:
            r0.L$0 = r5     // Catch:{ all -> 0x0079 }
            r0.L$1 = r4     // Catch:{ all -> 0x0079 }
            r0.L$2 = r3     // Catch:{ all -> 0x0079 }
            r0.L$3 = r10     // Catch:{ all -> 0x0079 }
            r0.L$4 = r8     // Catch:{ all -> 0x0079 }
            r0.L$5 = r2     // Catch:{ all -> 0x0079 }
            r9 = 1
            r0.label = r9     // Catch:{ all -> 0x0079 }
            java.lang.Object r9 = r2.mo120360a(r0)     // Catch:{ all -> 0x0079 }
            if (r9 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r7 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x00a5:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0079 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0079 }
            if (r9 == 0) goto L_0x00cb
            r0.L$0 = r5     // Catch:{ all -> 0x0079 }
            r0.L$1 = r4     // Catch:{ all -> 0x0079 }
            r0.L$2 = r3     // Catch:{ all -> 0x0079 }
            r0.L$3 = r2     // Catch:{ all -> 0x0079 }
            r0.L$4 = r10     // Catch:{ all -> 0x0079 }
            r0.L$5 = r8     // Catch:{ all -> 0x0079 }
            r9 = 2
            r0.label = r9     // Catch:{ all -> 0x0079 }
            java.lang.Object r9 = r8.mo120361b(r0)     // Catch:{ all -> 0x0079 }
            if (r9 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r7 = r2
            r2 = r8
            r8 = r10
            goto L_0x004c
        L_0x00c7:
            r4.invoke(r9)     // Catch:{ all -> 0x0079 }
            goto L_0x008b
        L_0x00cb:
            kotlin.n r8 = kotlin.C7581n.f20898a     // Catch:{ all -> 0x0079 }
            return r8
        L_0x00ce:
            throw r8
        L_0x00cf:
            kotlin.Result$Failure r10 = (kotlin.Result.Failure) r10
            java.lang.Throwable r8 = r10.exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149318a(kotlinx.coroutines.channels.a, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149349e(kotlinx.coroutines.channels.C48138e<? extends E> r9, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r10, kotlin.coroutines.C47919b<? super E> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$first$3
            if (r0 == 0) goto L_0x0014
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$first$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$first$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$first$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$first$3
            r0.<init>(r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0057;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002c:
            java.lang.Object r9 = r0.L$6
            kotlinx.coroutines.channels.b r9 = (kotlinx.coroutines.channels.C48135b) r9
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.a.b r5 = (kotlin.jvm.p357a.C7562b) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r11 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0083 }
            if (r7 != 0) goto L_0x0052
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r8
            goto L_0x00cb
        L_0x0052:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11     // Catch:{ Throwable -> 0x0083 }
            java.lang.Throwable r9 = r11.exception     // Catch:{ Throwable -> 0x0083 }
            throw r9     // Catch:{ Throwable -> 0x0083 }
        L_0x0057:
            java.lang.Object r9 = r0.L$6
            kotlinx.coroutines.channels.b r9 = (kotlinx.coroutines.channels.C48135b) r9
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.a.b r5 = (kotlin.jvm.p357a.C7562b) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r11 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0083 }
            if (r7 != 0) goto L_0x007c
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r8
            goto L_0x00ab
        L_0x007c:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11     // Catch:{ Throwable -> 0x0083 }
            java.lang.Throwable r9 = r11.exception     // Catch:{ Throwable -> 0x0083 }
            throw r9     // Catch:{ Throwable -> 0x0083 }
        L_0x0081:
            r9 = move-exception
            goto L_0x00e3
        L_0x0083:
            r9 = move-exception
            goto L_0x00e2
        L_0x0085:
            boolean r2 = r11 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e4
            r11 = 0
            kotlinx.coroutines.channels.b r2 = r9.mo120362a()     // Catch:{ Throwable -> 0x0083 }
            r3 = r9
            r4 = r3
            r6 = r4
            r5 = r10
            r10 = r6
        L_0x0093:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0083 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0083 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0083 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0083 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x0083 }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x0083 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0083 }
            r9 = 1
            r0.label = r9     // Catch:{ Throwable -> 0x0083 }
            java.lang.Object r9 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0083 }
            if (r9 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Throwable -> 0x0083 }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x0083 }
            if (r9 == 0) goto L_0x00d8
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0083 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x0083 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x0083 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x0083 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x0083 }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x0083 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0083 }
            r9 = 2
            r0.label = r9     // Catch:{ Throwable -> 0x0083 }
            java.lang.Object r9 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x0083 }
            if (r9 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            java.lang.Object r7 = r5.invoke(r9)     // Catch:{ Throwable -> 0x0083 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Throwable -> 0x0083 }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x0083 }
            if (r7 == 0) goto L_0x0093
            return r9
        L_0x00d8:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r10 = "ReceiveChannel contains no element matching the predicate."
            r9.<init>(r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00e2:
            throw r9     // Catch:{ all -> 0x0081 }
        L_0x00e3:
            throw r9
        L_0x00e4:
            kotlin.Result$Failure r11 = (kotlin.Result.Failure) r11
            java.lang.Throwable r9 = r11.exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149349e(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149350f(kotlinx.coroutines.channels.C48138e<? extends E> r10, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r11, kotlin.coroutines.C47919b<? super E> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$firstOrNull$3
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$firstOrNull$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$firstOrNull$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$firstOrNull$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$firstOrNull$3
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0057;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0082 }
            if (r8 != 0) goto L_0x0052
            r9 = r12
            r12 = r10
            r10 = r9
            goto L_0x00ca
        L_0x0052:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0082 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0082 }
            throw r10     // Catch:{ Throwable -> 0x0082 }
        L_0x0057:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0082 }
            if (r8 != 0) goto L_0x007b
            r9 = r12
            r12 = r10
            r10 = r9
            goto L_0x00aa
        L_0x007b:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0082 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0082 }
            throw r10     // Catch:{ Throwable -> 0x0082 }
        L_0x0080:
            r10 = move-exception
            goto L_0x00d9
        L_0x0082:
            r10 = move-exception
            goto L_0x00d8
        L_0x0084:
            boolean r2 = r12 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00da
            kotlinx.coroutines.channels.b r12 = r10.mo120362a()     // Catch:{ Throwable -> 0x0082 }
            r4 = r10
            r5 = r4
            r7 = r5
            r6 = r11
            r2 = r3
            r11 = r7
        L_0x0092:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0082 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0082 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0082 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0082 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x0082 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0082 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0082 }
            r10 = 1
            r0.label = r10     // Catch:{ Throwable -> 0x0082 }
            java.lang.Object r10 = r12.mo120360a(r0)     // Catch:{ Throwable -> 0x0082 }
            if (r10 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0082 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0082 }
            if (r10 == 0) goto L_0x00d7
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0082 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0082 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0082 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0082 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x0082 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0082 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0082 }
            r10 = 2
            r0.label = r10     // Catch:{ Throwable -> 0x0082 }
            java.lang.Object r10 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x0082 }
            if (r10 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            java.lang.Object r8 = r6.invoke(r10)     // Catch:{ Throwable -> 0x0082 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Throwable -> 0x0082 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x0082 }
            if (r8 == 0) goto L_0x0092
            return r10
        L_0x00d7:
            return r3
        L_0x00d8:
            throw r10     // Catch:{ all -> 0x0080 }
        L_0x00d9:
            throw r10
        L_0x00da:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12
            java.lang.Throwable r10 = r12.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149350f(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149360p(kotlinx.coroutines.channels.C48138e<? extends E> r10, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r11, kotlin.coroutines.C47919b<? super java.lang.Boolean> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$all$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$all$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$all$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$all$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$all$1
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0058;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x0053
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00cb
        L_0x0053:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0058:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x007d
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00ab
        L_0x007d:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0082:
            r10 = move-exception
            goto L_0x00e3
        L_0x0084:
            r10 = move-exception
            goto L_0x00e2
        L_0x0086:
            boolean r2 = r12 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e4
            r12 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x0084 }
            r4 = r10
            r5 = r4
            r7 = r5
            r6 = r11
            r11 = r7
        L_0x0094:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r0.label = r3     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 == 0) goto L_0x00dd
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r10 = 2
            r0.label = r10     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            java.lang.Object r10 = r6.invoke(r10)     // Catch:{ Throwable -> 0x0084 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 != 0) goto L_0x0094
            r10 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r10)     // Catch:{ Throwable -> 0x0084 }
            return r10
        L_0x00dd:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r3)
            return r10
        L_0x00e2:
            throw r10     // Catch:{ all -> 0x0082 }
        L_0x00e3:
            throw r10
        L_0x00e4:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12
            java.lang.Throwable r10 = r12.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149360p(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149361q(kotlinx.coroutines.channels.C48138e<? extends E> r10, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r11, kotlin.coroutines.C47919b<? super java.lang.Boolean> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$any$3
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$any$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$any$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$any$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$any$3
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0058;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x0053
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00cb
        L_0x0053:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0058:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x007d
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00ab
        L_0x007d:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0082:
            r10 = move-exception
            goto L_0x00e3
        L_0x0084:
            r10 = move-exception
            goto L_0x00e2
        L_0x0086:
            boolean r2 = r12 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e4
            r12 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x0084 }
            r4 = r10
            r5 = r4
            r7 = r5
            r6 = r11
            r11 = r7
        L_0x0094:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r0.label = r3     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 == 0) goto L_0x00dc
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r10 = 2
            r0.label = r10     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            java.lang.Object r10 = r6.invoke(r10)     // Catch:{ Throwable -> 0x0084 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 == 0) goto L_0x0094
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r3)     // Catch:{ Throwable -> 0x0084 }
            return r10
        L_0x00dc:
            r10 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r10)
            return r10
        L_0x00e2:
            throw r10     // Catch:{ all -> 0x0082 }
        L_0x00e3:
            throw r10
        L_0x00e4:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12
            java.lang.Throwable r10 = r12.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149361q(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149365u(kotlinx.coroutines.channels.C48138e<? extends E> r10, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r11, kotlin.coroutines.C47919b<? super java.lang.Boolean> r12) {
        /*
            boolean r0 = r12 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$3
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$3
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0058;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x0053
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00cb
        L_0x0053:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0058:
            java.lang.Object r10 = r0.L$6
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$5
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r2 = r0.L$4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r12 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0084 }
            if (r8 != 0) goto L_0x007d
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
            goto L_0x00ab
        L_0x007d:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12     // Catch:{ Throwable -> 0x0084 }
            java.lang.Throwable r10 = r12.exception     // Catch:{ Throwable -> 0x0084 }
            throw r10     // Catch:{ Throwable -> 0x0084 }
        L_0x0082:
            r10 = move-exception
            goto L_0x00e3
        L_0x0084:
            r10 = move-exception
            goto L_0x00e2
        L_0x0086:
            boolean r2 = r12 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e4
            r12 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x0084 }
            r4 = r10
            r5 = r4
            r7 = r5
            r6 = r11
            r11 = r7
        L_0x0094:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r0.label = r3     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 == 0) goto L_0x00dd
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0084 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0084 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0084 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0084 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0084 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0084 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0084 }
            r10 = 2
            r0.label = r10     // Catch:{ Throwable -> 0x0084 }
            java.lang.Object r10 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x0084 }
            if (r10 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            java.lang.Object r10 = r6.invoke(r10)     // Catch:{ Throwable -> 0x0084 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Throwable -> 0x0084 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x0084 }
            if (r10 == 0) goto L_0x0094
            r10 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r10)     // Catch:{ Throwable -> 0x0084 }
            return r10
        L_0x00dd:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C47951a.m148882a(r3)
            return r10
        L_0x00e2:
            throw r10     // Catch:{ all -> 0x0082 }
        L_0x00e3:
            throw r10
        L_0x00e4:
            kotlin.Result$Failure r12 = (kotlin.Result.Failure) r12
            java.lang.Throwable r10 = r12.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149365u(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149347d(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r13, kotlin.coroutines.C47919b<? super E> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$findLast$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$findLast$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$findLast$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$findLast$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$findLast$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0093;
                case 1: goto L_0x005f;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0090 }
            if (r9 != 0) goto L_0x005a
        L_0x0055:
            r10 = r2
            r2 = r12
            r12 = r10
            goto L_0x00ef
        L_0x005a:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0090 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0090 }
            throw r12     // Catch:{ Throwable -> 0x0090 }
        L_0x005f:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0090 }
            if (r9 != 0) goto L_0x0088
            goto L_0x00cb
        L_0x0088:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0090 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0090 }
            throw r12     // Catch:{ Throwable -> 0x0090 }
        L_0x008d:
            r12 = move-exception
            goto L_0x0103
        L_0x0090:
            r12 = move-exception
            goto L_0x0102
        L_0x0093:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0104
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            r14.element = r3
            kotlinx.coroutines.channels.b r2 = r12.mo120362a()     // Catch:{ Throwable -> 0x0090 }
            r4 = r12
            r6 = r4
            r8 = r6
            r7 = r13
            r13 = r8
            r12 = r3
            r3 = r13
        L_0x00a9:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0090 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0090 }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x0090 }
            r0.L$3 = r14     // Catch:{ Throwable -> 0x0090 }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x0090 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x0090 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0090 }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x0090 }
            r0.L$8 = r2     // Catch:{ Throwable -> 0x0090 }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x0090 }
            java.lang.Object r5 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0090 }
            if (r5 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r10 = r2
            r2 = r12
            r12 = r10
            r11 = r5
            r5 = r14
            r14 = r11
        L_0x00cb:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0090 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0090 }
            if (r14 == 0) goto L_0x00ff
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0090 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0090 }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x0090 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0090 }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x0090 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x0090 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0090 }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x0090 }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x0090 }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x0090 }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x0090 }
            if (r14 != r1) goto L_0x0055
            return r1
        L_0x00ef:
            java.lang.Object r9 = r7.invoke(r14)     // Catch:{ Throwable -> 0x0090 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Throwable -> 0x0090 }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x0090 }
            if (r9 == 0) goto L_0x00fd
            r5.element = r14     // Catch:{ Throwable -> 0x0090 }
        L_0x00fd:
            r14 = r5
            goto L_0x00a9
        L_0x00ff:
            T r12 = r5.element
            return r12
        L_0x0102:
            throw r12     // Catch:{ all -> 0x008d }
        L_0x0103:
            throw r12
        L_0x0104:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149347d(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149351g(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r13, kotlin.coroutines.C47919b<? super java.lang.Integer> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfFirst$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfFirst$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfFirst$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfFirst$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfFirst$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x008b;
                case 1: goto L_0x005b;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$6
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r9 != 0) goto L_0x0056
        L_0x0051:
            r10 = r4
            r4 = r12
            r12 = r10
            goto L_0x00e1
        L_0x0056:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0088 }
            throw r12     // Catch:{ Throwable -> 0x0088 }
        L_0x005b:
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$6
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r9 != 0) goto L_0x0080
            goto L_0x00bf
        L_0x0080:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0088 }
            throw r12     // Catch:{ Throwable -> 0x0088 }
        L_0x0085:
            r12 = move-exception
            goto L_0x0102
        L_0x0088:
            r12 = move-exception
            goto L_0x0101
        L_0x008b:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0103
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            r2 = 0
            r14.element = r2
            r2 = 0
            kotlinx.coroutines.channels.b r4 = r12.mo120362a()     // Catch:{ Throwable -> 0x0088 }
            r5 = r12
            r8 = r5
            r7 = r13
            r13 = r8
        L_0x00a0:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r14     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.label = r3     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r6 = r4.mo120360a(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r6 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r10 = r4
            r4 = r12
            r12 = r10
            r11 = r6
            r6 = r14
            r14 = r11
        L_0x00bf:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0088 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r14 == 0) goto L_0x00fb
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x0088 }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x00e1:
            java.lang.Object r14 = r7.invoke(r14)     // Catch:{ Throwable -> 0x0088 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0088 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r14 == 0) goto L_0x00f4
            int r12 = r6.element     // Catch:{ Throwable -> 0x0088 }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r12)     // Catch:{ Throwable -> 0x0088 }
            return r12
        L_0x00f4:
            int r14 = r6.element     // Catch:{ Throwable -> 0x0088 }
            int r14 = r14 + r3
            r6.element = r14     // Catch:{ Throwable -> 0x0088 }
            r14 = r6
            goto L_0x00a0
        L_0x00fb:
            r12 = -1
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r12)
            return r12
        L_0x0101:
            throw r12     // Catch:{ all -> 0x0085 }
        L_0x0102:
            throw r12
        L_0x0103:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149351g(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149352h(kotlinx.coroutines.channels.C48138e<? extends E> r16, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r17, kotlin.coroutines.C47919b<? super java.lang.Integer> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfLast$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfLast$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfLast$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfLast$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$indexOfLast$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0064;
                case 2: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0098 }
            if (r13 != 0) goto L_0x005f
            r14 = r9
            r9 = r2
            r2 = r5
            r5 = r6
            r6 = r3
            r3 = r14
            goto L_0x0108
        L_0x005f:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0098 }
            throw r0     // Catch:{ Throwable -> 0x0098 }
        L_0x0064:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0098 }
            if (r13 != 0) goto L_0x0090
            r14 = r5
            r5 = r2
            r2 = r14
            goto L_0x00df
        L_0x0090:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0098 }
            throw r0     // Catch:{ Throwable -> 0x0098 }
        L_0x0095:
            r0 = move-exception
            goto L_0x0127
        L_0x0098:
            r0 = move-exception
            goto L_0x0126
        L_0x009b:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x0128
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = -1
            r0.element = r3
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
            r5 = 0
            r3.element = r5
            r5 = 0
            kotlinx.coroutines.channels.b r6 = r16.mo120362a()     // Catch:{ Throwable -> 0x0098 }
            r7 = r16
            r8 = r7
            r12 = r8
            r11 = r17
            r9 = r2
            r2 = r12
        L_0x00bc:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x0098 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x0098 }
            r1.L$2 = r0     // Catch:{ Throwable -> 0x0098 }
            r1.L$3 = r3     // Catch:{ Throwable -> 0x0098 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x0098 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x0098 }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x0098 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0098 }
            r1.L$8 = r6     // Catch:{ Throwable -> 0x0098 }
            r1.label = r4     // Catch:{ Throwable -> 0x0098 }
            java.lang.Object r10 = r6.mo120360a(r1)     // Catch:{ Throwable -> 0x0098 }
            if (r10 != r9) goto L_0x00d7
            return r9
        L_0x00d7:
            r14 = r10
            r10 = r0
            r0 = r14
            r15 = r9
            r9 = r3
            r3 = r6
            r6 = r5
            r5 = r15
        L_0x00df:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0098 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0098 }
            if (r0 == 0) goto L_0x011f
            r1.L$0 = r12     // Catch:{ Throwable -> 0x0098 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x0098 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x0098 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x0098 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x0098 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x0098 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x0098 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0098 }
            r1.L$8 = r3     // Catch:{ Throwable -> 0x0098 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x0098 }
            if (r0 != r5) goto L_0x0103
            return r5
        L_0x0103:
            r14 = r6
            r6 = r3
            r3 = r9
            r9 = r5
            r5 = r14
        L_0x0108:
            java.lang.Object r0 = r11.invoke(r0)     // Catch:{ Throwable -> 0x0098 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0098 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0098 }
            if (r0 == 0) goto L_0x0118
            int r0 = r3.element     // Catch:{ Throwable -> 0x0098 }
            r10.element = r0     // Catch:{ Throwable -> 0x0098 }
        L_0x0118:
            int r0 = r3.element     // Catch:{ Throwable -> 0x0098 }
            int r0 = r0 + r4
            r3.element = r0     // Catch:{ Throwable -> 0x0098 }
            r0 = r10
            goto L_0x00bc
        L_0x011f:
            int r0 = r10.element
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r0)
            return r0
        L_0x0126:
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0127:
            throw r0
        L_0x0128:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149352h(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149353i(kotlinx.coroutines.channels.C48138e<? extends E> r16, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r17, kotlin.coroutines.C47919b<? super E> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$last$3
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$last$3 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$last$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$last$3 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$last$3
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            switch(r3) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0065;
                case 2: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x0060
            r14 = r9
            r9 = r2
            r2 = r5
            r5 = r6
            r6 = r3
            r3 = r14
            goto L_0x0106
        L_0x0060:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0065:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x0092
            r14 = r6
            r6 = r2
            r2 = r5
            r5 = r14
            goto L_0x00de
        L_0x0092:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0097:
            r0 = move-exception
            goto L_0x012a
        L_0x009a:
            r0 = move-exception
            goto L_0x0129
        L_0x009d:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x012b
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r5
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            r6 = 0
            r3.element = r6
            kotlinx.coroutines.channels.b r6 = r16.mo120362a()     // Catch:{ Throwable -> 0x009a }
            r7 = r16
            r8 = r7
            r12 = r8
            r11 = r17
            r9 = r2
            r2 = r12
        L_0x00bc:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r0     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r3     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r6     // Catch:{ Throwable -> 0x009a }
            r1.label = r4     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r10 = r6.mo120360a(r1)     // Catch:{ Throwable -> 0x009a }
            if (r10 != r9) goto L_0x00d7
            return r9
        L_0x00d7:
            r14 = r10
            r10 = r0
            r0 = r14
            r15 = r9
            r9 = r3
            r3 = r6
            r6 = r15
        L_0x00de:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x009a }
            if (r0 == 0) goto L_0x0118
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r3     // Catch:{ Throwable -> 0x009a }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x009a }
            if (r0 != r6) goto L_0x0102
            return r6
        L_0x0102:
            r14 = r6
            r6 = r3
            r3 = r9
            r9 = r14
        L_0x0106:
            java.lang.Object r13 = r11.invoke(r0)     // Catch:{ Throwable -> 0x009a }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x009a }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x009a }
            if (r13 == 0) goto L_0x0116
            r10.element = r0     // Catch:{ Throwable -> 0x009a }
            r3.element = r4     // Catch:{ Throwable -> 0x009a }
        L_0x0116:
            r0 = r10
            goto L_0x00bc
        L_0x0118:
            boolean r0 = r9.element
            if (r0 == 0) goto L_0x011f
            T r0 = r10.element
            return r0
        L_0x011f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ReceiveChannel contains no element matching the predicate."
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0129:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x012a:
            throw r0
        L_0x012b:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149353i(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149354j(kotlinx.coroutines.channels.C48138e<? extends E> r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super E> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$lastOrNull$3
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$lastOrNull$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$lastOrNull$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$lastOrNull$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$lastOrNull$3
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x008b;
                case 1: goto L_0x005b;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002d:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r8 != 0) goto L_0x0056
        L_0x0051:
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x00e2
        L_0x0056:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x0088 }
            throw r11     // Catch:{ Throwable -> 0x0088 }
        L_0x005b:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r8 != 0) goto L_0x0080
            goto L_0x00c0
        L_0x0080:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x0088 }
            throw r11     // Catch:{ Throwable -> 0x0088 }
        L_0x0085:
            r11 = move-exception
            goto L_0x00f6
        L_0x0088:
            r11 = move-exception
            goto L_0x00f5
        L_0x008b:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f7
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r13.element = r3
            kotlinx.coroutines.channels.b r2 = r11.mo120362a()     // Catch:{ Throwable -> 0x0088 }
            r4 = r11
            r7 = r4
            r6 = r12
            r12 = r7
            r11 = r3
            r3 = r12
        L_0x00a0:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r11     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x0088 }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r5 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r5 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r9 = r2
            r2 = r11
            r11 = r9
            r10 = r5
            r5 = r13
            r13 = r10
        L_0x00c0:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x0088 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r13 == 0) goto L_0x00f2
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x0088 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r13 = r11.mo120361b(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r13 != r1) goto L_0x0051
            return r1
        L_0x00e2:
            java.lang.Object r8 = r6.invoke(r13)     // Catch:{ Throwable -> 0x0088 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Throwable -> 0x0088 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r8 == 0) goto L_0x00f0
            r5.element = r13     // Catch:{ Throwable -> 0x0088 }
        L_0x00f0:
            r13 = r5
            goto L_0x00a0
        L_0x00f2:
            T r11 = r5.element
            return r11
        L_0x00f5:
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x00f6:
            throw r11
        L_0x00f7:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r11 = r13.exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149354j(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149355k(kotlinx.coroutines.channels.C48138e<? extends E> r16, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r17, kotlin.coroutines.C47919b<? super E> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$single$3
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$single$3 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$single$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$single$3 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$single$3
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            switch(r3) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0065;
                case 2: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x0060
            r14 = r9
            r9 = r2
            r2 = r5
            r5 = r6
            r6 = r3
            r3 = r14
            goto L_0x0106
        L_0x0060:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0065:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r5 = r1.L$7
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r1.L$6
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlin.jvm.a.b r11 = (kotlin.jvm.p357a.C7562b) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x0092
            r14 = r6
            r6 = r2
            r2 = r5
            r5 = r14
            goto L_0x00de
        L_0x0092:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0097:
            r0 = move-exception
            goto L_0x0139
        L_0x009a:
            r0 = move-exception
            goto L_0x0138
        L_0x009d:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x013a
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r5
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            r6 = 0
            r3.element = r6
            kotlinx.coroutines.channels.b r6 = r16.mo120362a()     // Catch:{ Throwable -> 0x009a }
            r7 = r16
            r8 = r7
            r12 = r8
            r11 = r17
            r9 = r2
            r2 = r12
        L_0x00bc:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r0     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r3     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r6     // Catch:{ Throwable -> 0x009a }
            r1.label = r4     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r10 = r6.mo120360a(r1)     // Catch:{ Throwable -> 0x009a }
            if (r10 != r9) goto L_0x00d7
            return r9
        L_0x00d7:
            r14 = r10
            r10 = r0
            r0 = r14
            r15 = r9
            r9 = r3
            r3 = r6
            r6 = r15
        L_0x00de:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x009a }
            if (r0 == 0) goto L_0x0127
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r3     // Catch:{ Throwable -> 0x009a }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x009a }
            if (r0 != r6) goto L_0x0102
            return r6
        L_0x0102:
            r14 = r6
            r6 = r3
            r3 = r9
            r9 = r14
        L_0x0106:
            java.lang.Object r13 = r11.invoke(r0)     // Catch:{ Throwable -> 0x009a }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x009a }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x009a }
            if (r13 == 0) goto L_0x0125
            boolean r13 = r3.element     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x011b
            r10.element = r0     // Catch:{ Throwable -> 0x009a }
            r3.element = r4     // Catch:{ Throwable -> 0x009a }
            goto L_0x0125
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x009a }
            java.lang.String r1 = "ReceiveChannel contains more than one matching element."
            r0.<init>(r1)     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0125:
            r0 = r10
            goto L_0x00bc
        L_0x0127:
            boolean r0 = r9.element
            if (r0 == 0) goto L_0x012e
            T r0 = r10.element
            return r0
        L_0x012e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ReceiveChannel contains no element matching the predicate."
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0138:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0139:
            throw r0
        L_0x013a:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149355k(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149356l(kotlinx.coroutines.channels.C48138e<? extends E> r17, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r18, kotlin.coroutines.C47919b<? super E> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$singleOrNull$3
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$singleOrNull$3 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$singleOrNull$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$singleOrNull$3 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$singleOrNull$3
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            switch(r3) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0064;
                case 2: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r6 = r1.L$7
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r1.L$5
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r10 = (kotlin.jvm.internal.Ref.BooleanRef) r10
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.a.b r12 = (kotlin.jvm.p357a.C7562b) r12
            java.lang.Object r13 = r1.L$0
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            boolean r14 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0098 }
            if (r14 != 0) goto L_0x005f
            r15 = r10
            r10 = r2
            r2 = r6
            r6 = r3
            r3 = r15
            goto L_0x0107
        L_0x005f:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0098 }
            throw r0     // Catch:{ Throwable -> 0x0098 }
        L_0x0064:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r6 = r1.L$7
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r1.L$5
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            java.lang.Object r9 = r1.L$4
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$3
            kotlin.jvm.internal.Ref$BooleanRef r10 = (kotlin.jvm.internal.Ref.BooleanRef) r10
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.a.b r12 = (kotlin.jvm.p357a.C7562b) r12
            java.lang.Object r13 = r1.L$0
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            boolean r14 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0098 }
            if (r14 != 0) goto L_0x0090
            r15 = r6
            r6 = r2
            r2 = r15
            goto L_0x00df
        L_0x0090:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0098 }
            throw r0     // Catch:{ Throwable -> 0x0098 }
        L_0x0095:
            r0 = move-exception
            goto L_0x0127
        L_0x0098:
            r0 = move-exception
            goto L_0x0126
        L_0x009b:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x0128
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r5
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            r6 = 0
            r3.element = r6
            kotlinx.coroutines.channels.b r6 = r17.mo120362a()     // Catch:{ Throwable -> 0x0098 }
            r8 = r17
            r9 = r8
            r13 = r9
            r12 = r18
            r10 = r2
            r7 = r5
            r2 = r13
        L_0x00bb:
            r1.L$0 = r13     // Catch:{ Throwable -> 0x0098 }
            r1.L$1 = r12     // Catch:{ Throwable -> 0x0098 }
            r1.L$2 = r0     // Catch:{ Throwable -> 0x0098 }
            r1.L$3 = r3     // Catch:{ Throwable -> 0x0098 }
            r1.L$4 = r9     // Catch:{ Throwable -> 0x0098 }
            r1.L$5 = r8     // Catch:{ Throwable -> 0x0098 }
            r1.L$6 = r7     // Catch:{ Throwable -> 0x0098 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0098 }
            r1.L$8 = r6     // Catch:{ Throwable -> 0x0098 }
            r1.label = r4     // Catch:{ Throwable -> 0x0098 }
            java.lang.Object r11 = r6.mo120360a(r1)     // Catch:{ Throwable -> 0x0098 }
            if (r11 != r10) goto L_0x00d6
            return r10
        L_0x00d6:
            r15 = r11
            r11 = r0
            r0 = r15
            r16 = r10
            r10 = r3
            r3 = r6
            r6 = r16
        L_0x00df:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0098 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0098 }
            if (r0 == 0) goto L_0x011e
            r1.L$0 = r13     // Catch:{ Throwable -> 0x0098 }
            r1.L$1 = r12     // Catch:{ Throwable -> 0x0098 }
            r1.L$2 = r11     // Catch:{ Throwable -> 0x0098 }
            r1.L$3 = r10     // Catch:{ Throwable -> 0x0098 }
            r1.L$4 = r9     // Catch:{ Throwable -> 0x0098 }
            r1.L$5 = r8     // Catch:{ Throwable -> 0x0098 }
            r1.L$6 = r7     // Catch:{ Throwable -> 0x0098 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0098 }
            r1.L$8 = r3     // Catch:{ Throwable -> 0x0098 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x0098 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x0098 }
            if (r0 != r6) goto L_0x0103
            return r6
        L_0x0103:
            r15 = r6
            r6 = r3
            r3 = r10
            r10 = r15
        L_0x0107:
            java.lang.Object r14 = r12.invoke(r0)     // Catch:{ Throwable -> 0x0098 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0098 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0098 }
            if (r14 == 0) goto L_0x011c
            boolean r14 = r3.element     // Catch:{ Throwable -> 0x0098 }
            if (r14 == 0) goto L_0x0118
            return r5
        L_0x0118:
            r11.element = r0     // Catch:{ Throwable -> 0x0098 }
            r3.element = r4     // Catch:{ Throwable -> 0x0098 }
        L_0x011c:
            r0 = r11
            goto L_0x00bb
        L_0x011e:
            boolean r0 = r10.element
            if (r0 != 0) goto L_0x0123
            return r5
        L_0x0123:
            T r0 = r11.element
            return r0
        L_0x0126:
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0127:
            throw r0
        L_0x0128:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149356l(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V> java.lang.Object m149357m(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> r13, kotlin.coroutines.C47919b<? super java.util.Map<K, ? extends V>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associate$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associate$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associate$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associate$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0092;
                case 1: goto L_0x005e;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002c:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0059
        L_0x0054:
            r10 = r3
            r3 = r12
            r12 = r10
            goto L_0x00ed
        L_0x0059:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x008f }
            throw r12     // Catch:{ Throwable -> 0x008f }
        L_0x005e:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0087
            goto L_0x00c9
        L_0x0087:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x008f }
            throw r12     // Catch:{ Throwable -> 0x008f }
        L_0x008c:
            r12 = move-exception
            goto L_0x0102
        L_0x008f:
            r12 = move-exception
            goto L_0x0101
        L_0x0092:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0103
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Map r14 = (java.util.Map) r14
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r12.mo120362a()     // Catch:{ Throwable -> 0x008f }
            r4 = r12
            r6 = r4
            r8 = r6
            r7 = r13
            r13 = r8
        L_0x00a7:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r14     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r3     // Catch:{ Throwable -> 0x008f }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r5 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x008f }
            if (r5 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r10 = r3
            r3 = r12
            r12 = r10
            r11 = r5
            r5 = r14
            r14 = r11
        L_0x00c9:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x008f }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x008f }
            if (r14 == 0) goto L_0x0100
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x008f }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x008f }
            if (r14 != r1) goto L_0x0054
            return r1
        L_0x00ed:
            java.lang.Object r14 = r7.invoke(r14)     // Catch:{ Throwable -> 0x008f }
            kotlin.Pair r14 = (kotlin.Pair) r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r9 = r14.getFirst()     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r14 = r14.getSecond()     // Catch:{ Throwable -> 0x008f }
            r5.put(r9, r14)     // Catch:{ Throwable -> 0x008f }
            r14 = r5
            goto L_0x00a7
        L_0x0100:
            return r5
        L_0x0101:
            throw r12     // Catch:{ all -> 0x008c }
        L_0x0102:
            throw r12
        L_0x0103:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149357m(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K> java.lang.Object m149358n(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r13, kotlin.coroutines.C47919b<? super java.util.Map<K, ? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateBy$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0092;
                case 1: goto L_0x005e;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002c:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0059
        L_0x0054:
            r10 = r3
            r3 = r12
            r12 = r10
            goto L_0x00ed
        L_0x0059:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x008f }
            throw r12     // Catch:{ Throwable -> 0x008f }
        L_0x005e:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0087
            goto L_0x00c9
        L_0x0087:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x008f }
            throw r12     // Catch:{ Throwable -> 0x008f }
        L_0x008c:
            r12 = move-exception
            goto L_0x00f8
        L_0x008f:
            r12 = move-exception
            goto L_0x00f7
        L_0x0092:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f9
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Map r14 = (java.util.Map) r14
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r12.mo120362a()     // Catch:{ Throwable -> 0x008f }
            r4 = r12
            r6 = r4
            r8 = r6
            r7 = r13
            r13 = r8
        L_0x00a7:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r14     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r3     // Catch:{ Throwable -> 0x008f }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r5 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x008f }
            if (r5 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r10 = r3
            r3 = r12
            r12 = r10
            r11 = r5
            r5 = r14
            r14 = r11
        L_0x00c9:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x008f }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x008f }
            if (r14 == 0) goto L_0x00f6
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x008f }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x008f }
            if (r14 != r1) goto L_0x0054
            return r1
        L_0x00ed:
            java.lang.Object r9 = r7.invoke(r14)     // Catch:{ Throwable -> 0x008f }
            r5.put(r9, r14)     // Catch:{ Throwable -> 0x008f }
            r14 = r5
            goto L_0x00a7
        L_0x00f6:
            return r5
        L_0x00f7:
            throw r12     // Catch:{ all -> 0x008c }
        L_0x00f8:
            throw r12
        L_0x00f9:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149358n(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K> java.lang.Object m149359o(kotlinx.coroutines.channels.C48138e<? extends E> r13, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r14, kotlin.coroutines.C47919b<? super java.util.Map<K, ? extends java.util.List<? extends E>>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupBy$1
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0092;
                case 1: goto L_0x005e;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002c:
            java.lang.Object r13 = r0.L$8
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$7
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0059
        L_0x0054:
            r11 = r3
            r3 = r13
            r13 = r11
            goto L_0x00ed
        L_0x0059:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x008f }
            throw r13     // Catch:{ Throwable -> 0x008f }
        L_0x005e:
            java.lang.Object r13 = r0.L$8
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$7
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008f }
            if (r9 != 0) goto L_0x0087
            goto L_0x00c9
        L_0x0087:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x008f }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x008f }
            throw r13     // Catch:{ Throwable -> 0x008f }
        L_0x008c:
            r13 = move-exception
            goto L_0x0108
        L_0x008f:
            r13 = move-exception
            goto L_0x0107
        L_0x0092:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0109
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.util.Map r15 = (java.util.Map) r15
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r13.mo120362a()     // Catch:{ Throwable -> 0x008f }
            r4 = r13
            r6 = r4
            r8 = r6
            r7 = r14
            r14 = r8
        L_0x00a7:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r15     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r14     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r3     // Catch:{ Throwable -> 0x008f }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r5 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x008f }
            if (r5 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r11 = r3
            r3 = r13
            r13 = r11
            r12 = r5
            r5 = r15
            r15 = r12
        L_0x00c9:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Throwable -> 0x008f }
            boolean r15 = r15.booleanValue()     // Catch:{ Throwable -> 0x008f }
            if (r15 == 0) goto L_0x0106
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008f }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008f }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008f }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x008f }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008f }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x008f }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x008f }
            r0.L$7 = r14     // Catch:{ Throwable -> 0x008f }
            r0.L$8 = r13     // Catch:{ Throwable -> 0x008f }
            r15 = 2
            r0.label = r15     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r15 = r13.mo120361b(r0)     // Catch:{ Throwable -> 0x008f }
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x00ed:
            java.lang.Object r9 = r7.invoke(r15)     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r10 = r5.get(r9)     // Catch:{ Throwable -> 0x008f }
            if (r10 != 0) goto L_0x00ff
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Throwable -> 0x008f }
            r10.<init>()     // Catch:{ Throwable -> 0x008f }
            r5.put(r9, r10)     // Catch:{ Throwable -> 0x008f }
        L_0x00ff:
            java.util.List r10 = (java.util.List) r10     // Catch:{ Throwable -> 0x008f }
            r10.add(r15)     // Catch:{ Throwable -> 0x008f }
            r15 = r5
            goto L_0x00a7
        L_0x0106:
            return r5
        L_0x0107:
            throw r13     // Catch:{ all -> 0x008c }
        L_0x0108:
            throw r13
        L_0x0109:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r13 = r15.exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149359o(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149362r(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r13, kotlin.coroutines.C47919b<? super java.lang.Integer> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$count$3
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$count$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$count$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$count$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$count$3
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x008b;
                case 1: goto L_0x005b;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$6
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r9 != 0) goto L_0x0056
        L_0x0051:
            r10 = r4
            r4 = r12
            r12 = r10
            goto L_0x00e1
        L_0x0056:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0088 }
            throw r12     // Catch:{ Throwable -> 0x0088 }
        L_0x005b:
            java.lang.Object r12 = r0.L$7
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$6
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0088 }
            if (r9 != 0) goto L_0x0080
            goto L_0x00bf
        L_0x0080:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x0088 }
            throw r12     // Catch:{ Throwable -> 0x0088 }
        L_0x0085:
            r12 = move-exception
            goto L_0x00fc
        L_0x0088:
            r12 = move-exception
            goto L_0x00fb
        L_0x008b:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00fd
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            r2 = 0
            r14.element = r2
            r2 = 0
            kotlinx.coroutines.channels.b r4 = r12.mo120362a()     // Catch:{ Throwable -> 0x0088 }
            r5 = r12
            r8 = r5
            r7 = r13
            r13 = r8
        L_0x00a0:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r14     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.label = r3     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r6 = r4.mo120360a(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r6 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r10 = r4
            r4 = r12
            r12 = r10
            r11 = r6
            r6 = r14
            r14 = r11
        L_0x00bf:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0088 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r14 == 0) goto L_0x00f4
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0088 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0088 }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x0088 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0088 }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x0088 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0088 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x0088 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x0088 }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x0088 }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x0088 }
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x00e1:
            java.lang.Object r14 = r7.invoke(r14)     // Catch:{ Throwable -> 0x0088 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x0088 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x0088 }
            if (r14 == 0) goto L_0x00f2
            int r14 = r6.element     // Catch:{ Throwable -> 0x0088 }
            int r14 = r14 + r3
            r6.element = r14     // Catch:{ Throwable -> 0x0088 }
        L_0x00f2:
            r14 = r6
            goto L_0x00a0
        L_0x00f4:
            int r12 = r6.element
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r12)
            return r12
        L_0x00fb:
            throw r12     // Catch:{ all -> 0x0085 }
        L_0x00fc:
            throw r12
        L_0x00fd:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149362r(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r10 = r3;
        r3 = r13;
        r13 = r5;
        r5 = r7;
        r7 = r1;
        r1 = r4;
        r4 = r6;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r13;
        r0.L$3 = r2;
        r0.L$4 = r6;
        r0.L$5 = r12;
        r0.label = 2;
        r14 = r12.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r14 != r1) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        r3 = (java.lang.Comparable) r4.invoke(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r13;
        r0.L$3 = r2;
        r0.L$4 = r6;
        r0.L$5 = r12;
        r0.L$6 = r14;
        r0.L$7 = r3;
        r0.label = 3;
        r7 = r12.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        if (r7 != r1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r10 = r2;
        r2 = r12;
        r12 = r3;
        r3 = r6;
        r6 = r4;
        r4 = r10;
        r11 = r5;
        r5 = r13;
        r13 = r14;
        r14 = r7;
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r4;
        r0.L$4 = r3;
        r0.L$5 = r2;
        r0.L$6 = r13;
        r0.L$7 = r12;
        r0.label = 4;
        r14 = r2.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        if (r14 != r1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r8 = (java.lang.Comparable) r4.invoke(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        if (r12.compareTo(r8) >= 0) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0178, code lost:
        r14 = r3;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
        r12 = r2;
        r2 = r1;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017e, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object m149363s(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r13, kotlin.coroutines.C47919b<? super E> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$maxBy$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$maxBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$maxBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$maxBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$maxBy$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0087;
                case 3: goto L_0x005e;
                case 4: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$7
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.b r2 = (kotlinx.coroutines.channels.C48135b) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r8 != 0) goto L_0x0059
        L_0x004f:
            r10 = r3
            r3 = r13
            r13 = r5
            r5 = r7
            r7 = r1
            r1 = r4
            r4 = r6
            r6 = r10
            goto L_0x016a
        L_0x0059:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x005e:
            java.lang.Object r12 = r0.L$7
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.b r2 = (kotlinx.coroutines.channels.C48135b) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r8 != 0) goto L_0x0082
            goto L_0x0148
        L_0x0082:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x0087:
            java.lang.Object r12 = r0.L$5
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$4
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r6 != 0) goto L_0x00a7
            r6 = r13
            r13 = r3
            goto L_0x011d
        L_0x00a7:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x00ac:
            java.lang.Object r12 = r0.L$5
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$4
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.a.b r5 = (kotlin.jvm.p357a.C7562b) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != 0) goto L_0x00ce
            r10 = r6
            r6 = r13
            r13 = r4
            r4 = r5
            r5 = r10
            goto L_0x00fe
        L_0x00ce:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x00d3:
            r12 = move-exception
            goto L_0x0180
        L_0x00d6:
            r12 = move-exception
            goto L_0x017f
        L_0x00d9:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0181
            kotlinx.coroutines.channels.b r14 = r12.mo120362a()     // Catch:{ Throwable -> 0x00d6 }
            r0.L$0 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x00d6 }
            r2 = 1
            r0.label = r2     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r2 = r14.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r2 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r5 = r12
            r6 = r5
            r4 = r13
            r13 = r6
            r12 = r14
            r14 = r2
            r2 = r3
        L_0x00fe:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x00d6 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != 0) goto L_0x0107
            return r3
        L_0x0107:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00d6 }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != r1) goto L_0x011d
            return r1
        L_0x011d:
            java.lang.Object r3 = r4.invoke(r14)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Comparable r3 = (java.lang.Comparable) r3     // Catch:{ Throwable -> 0x00d6 }
        L_0x0123:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x00d6 }
            r0.L$7 = r3     // Catch:{ Throwable -> 0x00d6 }
            r7 = 3
            r0.label = r7     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r7 = r12.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != r1) goto L_0x013d
            return r1
        L_0x013d:
            r10 = r2
            r2 = r12
            r12 = r3
            r3 = r6
            r6 = r4
            r4 = r10
            r11 = r5
            r5 = r13
            r13 = r14
            r14 = r7
            r7 = r11
        L_0x0148:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x00d6 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r14 == 0) goto L_0x017e
            r0.L$0 = r7     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x00d6 }
            r14 = 4
            r0.label = r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r14 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x016a:
            java.lang.Object r8 = r4.invoke(r14)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Comparable r8 = (java.lang.Comparable) r8     // Catch:{ Throwable -> 0x00d6 }
            int r9 = r12.compareTo(r8)     // Catch:{ Throwable -> 0x00d6 }
            if (r9 >= 0) goto L_0x0178
            r3 = r8
            goto L_0x017a
        L_0x0178:
            r14 = r3
            r3 = r12
        L_0x017a:
            r12 = r2
            r2 = r1
            r1 = r7
            goto L_0x0123
        L_0x017e:
            return r13
        L_0x017f:
            throw r12     // Catch:{ all -> 0x00d3 }
        L_0x0180:
            throw r12
        L_0x0181:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149363s(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r10 = r3;
        r3 = r13;
        r13 = r5;
        r5 = r7;
        r7 = r1;
        r1 = r4;
        r4 = r6;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r13;
        r0.L$3 = r2;
        r0.L$4 = r6;
        r0.L$5 = r12;
        r0.label = 2;
        r14 = r12.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r14 != r1) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        r3 = (java.lang.Comparable) r4.invoke(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = r13;
        r0.L$3 = r2;
        r0.L$4 = r6;
        r0.L$5 = r12;
        r0.L$6 = r14;
        r0.L$7 = r3;
        r0.label = 3;
        r7 = r12.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        if (r7 != r1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r10 = r2;
        r2 = r12;
        r12 = r3;
        r3 = r6;
        r6 = r4;
        r4 = r10;
        r11 = r5;
        r5 = r13;
        r13 = r14;
        r14 = r7;
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        r0.L$0 = r7;
        r0.L$1 = r6;
        r0.L$2 = r5;
        r0.L$3 = r4;
        r0.L$4 = r3;
        r0.L$5 = r2;
        r0.L$6 = r13;
        r0.L$7 = r12;
        r0.label = 4;
        r14 = r2.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        if (r14 != r1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r8 = (java.lang.Comparable) r4.invoke(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        if (r12.compareTo(r8) <= 0) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0178, code lost:
        r14 = r3;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
        r12 = r2;
        r2 = r1;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017e, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object m149364t(kotlinx.coroutines.channels.C48138e<? extends E> r12, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r13, kotlin.coroutines.C47919b<? super E> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$minBy$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$minBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$minBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$minBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$minBy$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0087;
                case 3: goto L_0x005e;
                case 4: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$7
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.b r2 = (kotlinx.coroutines.channels.C48135b) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r8 != 0) goto L_0x0059
        L_0x004f:
            r10 = r3
            r3 = r13
            r13 = r5
            r5 = r7
            r7 = r1
            r1 = r4
            r4 = r6
            r6 = r10
            goto L_0x016a
        L_0x0059:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x005e:
            java.lang.Object r12 = r0.L$7
            java.lang.Comparable r12 = (java.lang.Comparable) r12
            java.lang.Object r13 = r0.L$6
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.b r2 = (kotlinx.coroutines.channels.C48135b) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r8 != 0) goto L_0x0082
            goto L_0x0148
        L_0x0082:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x0087:
            java.lang.Object r12 = r0.L$5
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$4
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            boolean r6 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r6 != 0) goto L_0x00a7
            r6 = r13
            r13 = r3
            goto L_0x011d
        L_0x00a7:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x00ac:
            java.lang.Object r12 = r0.L$5
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$4
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.a.b r5 = (kotlin.jvm.p357a.C7562b) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != 0) goto L_0x00ce
            r10 = r6
            r6 = r13
            r13 = r4
            r4 = r5
            r5 = r10
            goto L_0x00fe
        L_0x00ce:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Throwable r12 = r14.exception     // Catch:{ Throwable -> 0x00d6 }
            throw r12     // Catch:{ Throwable -> 0x00d6 }
        L_0x00d3:
            r12 = move-exception
            goto L_0x0180
        L_0x00d6:
            r12 = move-exception
            goto L_0x017f
        L_0x00d9:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0181
            kotlinx.coroutines.channels.b r14 = r12.mo120362a()     // Catch:{ Throwable -> 0x00d6 }
            r0.L$0 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x00d6 }
            r2 = 1
            r0.label = r2     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r2 = r14.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r2 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r5 = r12
            r6 = r5
            r4 = r13
            r13 = r6
            r12 = r14
            r14 = r2
            r2 = r3
        L_0x00fe:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x00d6 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != 0) goto L_0x0107
            return r3
        L_0x0107:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00d6 }
            r14 = 2
            r0.label = r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r14 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != r1) goto L_0x011d
            return r1
        L_0x011d:
            java.lang.Object r3 = r4.invoke(r14)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Comparable r3 = (java.lang.Comparable) r3     // Catch:{ Throwable -> 0x00d6 }
        L_0x0123:
            r0.L$0 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x00d6 }
            r0.L$7 = r3     // Catch:{ Throwable -> 0x00d6 }
            r7 = 3
            r0.label = r7     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r7 = r12.mo120360a(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != r1) goto L_0x013d
            return r1
        L_0x013d:
            r10 = r2
            r2 = r12
            r12 = r3
            r3 = r6
            r6 = r4
            r4 = r10
            r11 = r5
            r5 = r13
            r13 = r14
            r14 = r7
            r7 = r11
        L_0x0148:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Throwable -> 0x00d6 }
            boolean r14 = r14.booleanValue()     // Catch:{ Throwable -> 0x00d6 }
            if (r14 == 0) goto L_0x017e
            r0.L$0 = r7     // Catch:{ Throwable -> 0x00d6 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x00d6 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x00d6 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x00d6 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x00d6 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x00d6 }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x00d6 }
            r0.L$7 = r12     // Catch:{ Throwable -> 0x00d6 }
            r14 = 4
            r0.label = r14     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r14 = r2.mo120361b(r0)     // Catch:{ Throwable -> 0x00d6 }
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x016a:
            java.lang.Object r8 = r4.invoke(r14)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Comparable r8 = (java.lang.Comparable) r8     // Catch:{ Throwable -> 0x00d6 }
            int r9 = r12.compareTo(r8)     // Catch:{ Throwable -> 0x00d6 }
            if (r9 <= 0) goto L_0x0178
            r3 = r8
            goto L_0x017a
        L_0x0178:
            r14 = r3
            r3 = r12
        L_0x017a:
            r12 = r2
            r2 = r1
            r1 = r7
            goto L_0x0123
        L_0x017e:
            return r13
        L_0x017f:
            throw r12     // Catch:{ all -> 0x00d3 }
        L_0x0180:
            throw r12
        L_0x0181:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r12 = r14.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149364t(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149366v(kotlinx.coroutines.channels.C48138e<? extends E> r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Integer> r12, kotlin.coroutines.C47919b<? super java.lang.Integer> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumBy$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumBy$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumBy$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumBy$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x008a;
                case 1: goto L_0x005a;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002c:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0087 }
            if (r8 != 0) goto L_0x0055
        L_0x0050:
            r9 = r3
            r3 = r11
            r11 = r9
            goto L_0x00e1
        L_0x0055:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0087 }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x0087 }
            throw r11     // Catch:{ Throwable -> 0x0087 }
        L_0x005a:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.a.b r6 = (kotlin.jvm.p357a.C7562b) r6
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0087 }
            if (r8 != 0) goto L_0x007f
            goto L_0x00bf
        L_0x007f:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0087 }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x0087 }
            throw r11     // Catch:{ Throwable -> 0x0087 }
        L_0x0084:
            r11 = move-exception
            goto L_0x00fa
        L_0x0087:
            r11 = move-exception
            goto L_0x00f9
        L_0x008a:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00fb
            kotlin.jvm.internal.Ref$IntRef r13 = new kotlin.jvm.internal.Ref$IntRef
            r13.<init>()
            r2 = 0
            r13.element = r2
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r11.mo120362a()     // Catch:{ Throwable -> 0x0087 }
            r4 = r11
            r7 = r4
            r6 = r12
            r12 = r7
        L_0x009f:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0087 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0087 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x0087 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0087 }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x0087 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0087 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0087 }
            r0.L$7 = r3     // Catch:{ Throwable -> 0x0087 }
            r5 = 1
            r0.label = r5     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r5 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x0087 }
            if (r5 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r9 = r3
            r3 = r11
            r11 = r9
            r10 = r5
            r5 = r13
            r13 = r10
        L_0x00bf:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x0087 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x0087 }
            if (r13 == 0) goto L_0x00f2
            r0.L$0 = r7     // Catch:{ Throwable -> 0x0087 }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x0087 }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x0087 }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x0087 }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x0087 }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x0087 }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x0087 }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x0087 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r13 = r11.mo120361b(r0)     // Catch:{ Throwable -> 0x0087 }
            if (r13 != r1) goto L_0x0050
            return r1
        L_0x00e1:
            int r8 = r5.element     // Catch:{ Throwable -> 0x0087 }
            java.lang.Object r13 = r6.invoke(r13)     // Catch:{ Throwable -> 0x0087 }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ Throwable -> 0x0087 }
            int r13 = r13.intValue()     // Catch:{ Throwable -> 0x0087 }
            int r8 = r8 + r13
            r5.element = r8     // Catch:{ Throwable -> 0x0087 }
            r13 = r5
            goto L_0x009f
        L_0x00f2:
            int r11 = r5.element
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r11)
            return r11
        L_0x00f9:
            throw r11     // Catch:{ all -> 0x0084 }
        L_0x00fa:
            throw r11
        L_0x00fb:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r11 = r13.exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149366v(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149367w(kotlinx.coroutines.channels.C48138e<? extends E> r17, kotlin.jvm.p357a.C7562b<? super E, java.lang.Double> r18, kotlin.coroutines.C47919b<? super java.lang.Double> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumByDouble$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumByDouble$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumByDouble$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumByDouble$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$sumByDouble$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x0091;
                case 1: goto L_0x005e;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$7
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$6
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$5
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$4
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$2
            kotlin.jvm.internal.Ref$DoubleRef r8 = (kotlin.jvm.internal.Ref.DoubleRef) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.a.b r9 = (kotlin.jvm.p357a.C7562b) r9
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            boolean r11 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008e }
            if (r11 != 0) goto L_0x0059
            r15 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r15
            goto L_0x00f4
        L_0x0059:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x008e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x008e }
            throw r0     // Catch:{ Throwable -> 0x008e }
        L_0x005e:
            java.lang.Object r3 = r1.L$7
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$6
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$5
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$4
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$3
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$2
            kotlin.jvm.internal.Ref$DoubleRef r8 = (kotlin.jvm.internal.Ref.DoubleRef) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.a.b r9 = (kotlin.jvm.p357a.C7562b) r9
            java.lang.Object r10 = r1.L$0
            kotlinx.coroutines.channels.e r10 = (kotlinx.coroutines.channels.C48138e) r10
            boolean r11 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008e }
            if (r11 != 0) goto L_0x0086
            r15 = r4
            r4 = r2
            r2 = r15
            goto L_0x00ce
        L_0x0086:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x008e }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x008e }
            throw r0     // Catch:{ Throwable -> 0x008e }
        L_0x008b:
            r0 = move-exception
            goto L_0x010e
        L_0x008e:
            r0 = move-exception
            goto L_0x010d
        L_0x0091:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x010f
            kotlin.jvm.internal.Ref$DoubleRef r0 = new kotlin.jvm.internal.Ref$DoubleRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r17.mo120362a()     // Catch:{ Throwable -> 0x008e }
            r6 = r17
            r7 = r6
            r10 = r7
            r9 = r18
            r5 = r2
            r2 = r10
        L_0x00ab:
            r1.L$0 = r10     // Catch:{ Throwable -> 0x008e }
            r1.L$1 = r9     // Catch:{ Throwable -> 0x008e }
            r1.L$2 = r0     // Catch:{ Throwable -> 0x008e }
            r1.L$3 = r7     // Catch:{ Throwable -> 0x008e }
            r1.L$4 = r6     // Catch:{ Throwable -> 0x008e }
            r1.L$5 = r3     // Catch:{ Throwable -> 0x008e }
            r1.L$6 = r2     // Catch:{ Throwable -> 0x008e }
            r1.L$7 = r4     // Catch:{ Throwable -> 0x008e }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x008e }
            if (r8 != r5) goto L_0x00c5
            return r5
        L_0x00c5:
            r15 = r8
            r8 = r0
            r0 = r15
            r16 = r5
            r5 = r3
            r3 = r4
            r4 = r16
        L_0x00ce:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x008e }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x008e }
            if (r0 == 0) goto L_0x0106
            r1.L$0 = r10     // Catch:{ Throwable -> 0x008e }
            r1.L$1 = r9     // Catch:{ Throwable -> 0x008e }
            r1.L$2 = r8     // Catch:{ Throwable -> 0x008e }
            r1.L$3 = r7     // Catch:{ Throwable -> 0x008e }
            r1.L$4 = r6     // Catch:{ Throwable -> 0x008e }
            r1.L$5 = r5     // Catch:{ Throwable -> 0x008e }
            r1.L$6 = r2     // Catch:{ Throwable -> 0x008e }
            r1.L$7 = r3     // Catch:{ Throwable -> 0x008e }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x008e }
            if (r0 != r4) goto L_0x00f0
            return r4
        L_0x00f0:
            r15 = r4
            r4 = r3
            r3 = r5
            r5 = r15
        L_0x00f4:
            double r11 = r8.element     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r0 = r9.invoke(r0)     // Catch:{ Throwable -> 0x008e }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Throwable -> 0x008e }
            double r13 = r0.doubleValue()     // Catch:{ Throwable -> 0x008e }
            r0 = 0
            double r11 = r11 + r13
            r8.element = r11     // Catch:{ Throwable -> 0x008e }
            r0 = r8
            goto L_0x00ab
        L_0x0106:
            double r0 = r8.element
            java.lang.Double r0 = kotlin.coroutines.jvm.internal.C47951a.m148883a(r0)
            return r0
        L_0x010d:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x010e:
            throw r0
        L_0x010f:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149367w(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149368x(kotlinx.coroutines.channels.C48138e<? extends E> r13, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r14, kotlin.coroutines.C47919b<? super kotlin.Pair<? extends java.util.List<? extends E>, ? extends java.util.List<? extends E>>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$partition$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$partition$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$partition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$partition$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$partition$1
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0097;
                case 1: goto L_0x0063;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002c:
            java.lang.Object r13 = r0.L$8
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$7
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.L$2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0094 }
            if (r9 != 0) goto L_0x005e
        L_0x0054:
            r10 = r4
            r4 = r13
            r13 = r10
            r11 = r1
            r1 = r14
            r14 = r2
            r2 = r5
            r5 = r11
            goto L_0x00fb
        L_0x005e:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0094 }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x0094 }
            throw r13     // Catch:{ Throwable -> 0x0094 }
        L_0x0063:
            java.lang.Object r13 = r0.L$8
            kotlinx.coroutines.channels.b r13 = (kotlinx.coroutines.channels.C48135b) r13
            java.lang.Object r14 = r0.L$7
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.C48138e) r14
            java.lang.Object r2 = r0.L$6
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$5
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.L$2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0094 }
            if (r9 != 0) goto L_0x008c
            goto L_0x00d7
        L_0x008c:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x0094 }
            java.lang.Throwable r13 = r15.exception     // Catch:{ Throwable -> 0x0094 }
            throw r13     // Catch:{ Throwable -> 0x0094 }
        L_0x0091:
            r13 = move-exception
            goto L_0x0117
        L_0x0094:
            r13 = move-exception
            goto L_0x0116
        L_0x0097:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0118
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r13.mo120362a()     // Catch:{ Throwable -> 0x0094 }
            r8 = r13
            r7 = r14
            r5 = r1
            r14 = r3
            r1 = r8
            r3 = r1
        L_0x00b0:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0094 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0094 }
            r0.L$2 = r15     // Catch:{ Throwable -> 0x0094 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x0094 }
            r0.L$4 = r13     // Catch:{ Throwable -> 0x0094 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x0094 }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x0094 }
            r0.L$7 = r1     // Catch:{ Throwable -> 0x0094 }
            r0.L$8 = r4     // Catch:{ Throwable -> 0x0094 }
            r6 = 1
            r0.label = r6     // Catch:{ Throwable -> 0x0094 }
            java.lang.Object r6 = r4.mo120360a(r0)     // Catch:{ Throwable -> 0x0094 }
            if (r6 != r5) goto L_0x00cc
            return r5
        L_0x00cc:
            r10 = r4
            r4 = r13
            r13 = r10
            r11 = r2
            r2 = r14
            r14 = r1
            r1 = r5
            r5 = r11
            r12 = r6
            r6 = r15
            r15 = r12
        L_0x00d7:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Throwable -> 0x0094 }
            boolean r15 = r15.booleanValue()     // Catch:{ Throwable -> 0x0094 }
            if (r15 == 0) goto L_0x0110
            r0.L$0 = r8     // Catch:{ Throwable -> 0x0094 }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x0094 }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x0094 }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x0094 }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x0094 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x0094 }
            r0.L$6 = r2     // Catch:{ Throwable -> 0x0094 }
            r0.L$7 = r14     // Catch:{ Throwable -> 0x0094 }
            r0.L$8 = r13     // Catch:{ Throwable -> 0x0094 }
            r15 = 2
            r0.label = r15     // Catch:{ Throwable -> 0x0094 }
            java.lang.Object r15 = r13.mo120361b(r0)     // Catch:{ Throwable -> 0x0094 }
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x00fb:
            java.lang.Object r9 = r7.invoke(r15)     // Catch:{ Throwable -> 0x0094 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Throwable -> 0x0094 }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x0094 }
            if (r9 == 0) goto L_0x010b
            r6.add(r15)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x010e
        L_0x010b:
            r2.add(r15)     // Catch:{ Throwable -> 0x0094 }
        L_0x010e:
            r15 = r6
            goto L_0x00b0
        L_0x0110:
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r6, r5)
            return r13
        L_0x0116:
            throw r13     // Catch:{ all -> 0x0091 }
        L_0x0117:
            throw r13
        L_0x0118:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r13 = r15.exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149368x(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149343c(kotlinx.coroutines.channels.C48138e<? extends E> r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super E> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$find$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$find$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$find$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$find$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$find$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x008c;
                case 1: goto L_0x005b;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002d:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008a }
            if (r9 != 0) goto L_0x0056
            r10 = r13
            r13 = r11
            r11 = r10
            goto L_0x00d7
        L_0x0056:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008a }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x008a }
            throw r11     // Catch:{ Throwable -> 0x008a }
        L_0x005b:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r4 = r0.L$4
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r0.L$3
            kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.C48138e) r5
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.a.b r7 = (kotlin.jvm.p357a.C7562b) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.e r8 = (kotlinx.coroutines.channels.C48138e) r8
            boolean r9 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008a }
            if (r9 != 0) goto L_0x0083
            r10 = r13
            r13 = r11
            r11 = r10
            goto L_0x00b5
        L_0x0083:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008a }
            java.lang.Throwable r11 = r13.exception     // Catch:{ Throwable -> 0x008a }
            throw r11     // Catch:{ Throwable -> 0x008a }
        L_0x0088:
            r11 = move-exception
            goto L_0x00e6
        L_0x008a:
            r11 = move-exception
            goto L_0x00e5
        L_0x008c:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e7
            kotlinx.coroutines.channels.b r13 = r11.mo120362a()     // Catch:{ Throwable -> 0x008a }
            r4 = r11
            r5 = r4
            r6 = r5
            r8 = r6
            r7 = r12
            r2 = r3
            r12 = r8
        L_0x009b:
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008a }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008a }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008a }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x008a }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008a }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x008a }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x008a }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008a }
            r11 = 1
            r0.label = r11     // Catch:{ Throwable -> 0x008a }
            java.lang.Object r11 = r13.mo120360a(r0)     // Catch:{ Throwable -> 0x008a }
            if (r11 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Throwable -> 0x008a }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x008a }
            if (r11 == 0) goto L_0x00e4
            r0.L$0 = r8     // Catch:{ Throwable -> 0x008a }
            r0.L$1 = r7     // Catch:{ Throwable -> 0x008a }
            r0.L$2 = r6     // Catch:{ Throwable -> 0x008a }
            r0.L$3 = r5     // Catch:{ Throwable -> 0x008a }
            r0.L$4 = r4     // Catch:{ Throwable -> 0x008a }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x008a }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x008a }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008a }
            r11 = 2
            r0.label = r11     // Catch:{ Throwable -> 0x008a }
            java.lang.Object r11 = r13.mo120361b(r0)     // Catch:{ Throwable -> 0x008a }
            if (r11 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            java.lang.Object r9 = r7.invoke(r11)     // Catch:{ Throwable -> 0x008a }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Throwable -> 0x008a }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x008a }
            if (r9 == 0) goto L_0x009b
            return r11
        L_0x00e4:
            return r3
        L_0x00e5:
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x00e6:
            throw r11
        L_0x00e7:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r11 = r13.exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149343c(kotlinx.coroutines.channels.e, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object m149340c(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapNotNullTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x008f;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00df
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00ba
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x008a:
            r10 = move-exception
            goto L_0x00ef
        L_0x008d:
            r10 = move-exception
            goto L_0x00ee
        L_0x008f:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f0
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008d }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009d:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008d }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00ba:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008d }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r12 == 0) goto L_0x00ed
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008d }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00df:
            java.lang.Object r12 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008d }
            if (r12 == 0) goto L_0x009d
            boolean r12 = r5.add(r12)     // Catch:{ Throwable -> 0x008d }
            kotlin.coroutines.jvm.internal.C47951a.m148882a(r12)     // Catch:{ Throwable -> 0x008d }
            goto L_0x009d
        L_0x00ed:
            return r5
        L_0x00ee:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00ef:
            throw r10
        L_0x00f0:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149340c(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object m149346d(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x008e;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008c }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00de
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008c }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008c }
            throw r10     // Catch:{ Throwable -> 0x008c }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008c }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00b9
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008c }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008c }
            throw r10     // Catch:{ Throwable -> 0x008c }
        L_0x008a:
            r10 = move-exception
            goto L_0x00e8
        L_0x008c:
            r10 = move-exception
            goto L_0x00e7
        L_0x008e:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00e9
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008c }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009c:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008c }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008c }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008c }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008c }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008c }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008c }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008c }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008c }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008c }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008c }
            if (r12 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00b9:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008c }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008c }
            if (r12 == 0) goto L_0x00e6
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008c }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008c }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008c }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008c }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008c }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008c }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008c }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008c }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008c }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008c }
            if (r12 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00de:
            java.lang.Object r12 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008c }
            r5.add(r12)     // Catch:{ Throwable -> 0x008c }
            goto L_0x009c
        L_0x00e6:
            return r5
        L_0x00e7:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00e8:
            throw r10
        L_0x00e9:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149346d(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m149319a(kotlinx.coroutines.channels.C48138e<? extends E> r10, int r11, kotlin.jvm.p357a.C7562b<? super java.lang.Integer, ? extends E> r12, kotlin.coroutines.C47919b<? super E> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$elementAtOrElse$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$elementAtOrElse$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$elementAtOrElse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$elementAtOrElse$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$elementAtOrElse$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0059;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            int r11 = r0.I$1
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0085 }
            if (r7 != 0) goto L_0x0054
            r8 = r3
            r3 = r10
            r10 = r8
            r9 = r13
            r13 = r11
            r11 = r9
            goto L_0x00e6
        L_0x0054:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0085 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x0085 }
            throw r10     // Catch:{ Throwable -> 0x0085 }
        L_0x0059:
            java.lang.Object r10 = r0.L$5
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            int r11 = r0.I$1
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r2 = r0.L$3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0085 }
            if (r7 != 0) goto L_0x007d
            r8 = r13
            r13 = r11
            r11 = r8
            goto L_0x00c1
        L_0x007d:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x0085 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x0085 }
            throw r10     // Catch:{ Throwable -> 0x0085 }
        L_0x0082:
            r10 = move-exception
            goto L_0x00f8
        L_0x0085:
            r10 = move-exception
            goto L_0x00f7
        L_0x0088:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f9
            r13 = 0
            if (r11 >= 0) goto L_0x0098
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r11)     // Catch:{ Throwable -> 0x0085 }
            java.lang.Object r10 = r12.invoke(r10)     // Catch:{ Throwable -> 0x0085 }
            return r10
        L_0x0098:
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r10.mo120362a()     // Catch:{ Throwable -> 0x0085 }
            r6 = r10
            r5 = r11
            r4 = r12
            r12 = r6
        L_0x00a1:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0085 }
            r0.I$0 = r5     // Catch:{ Throwable -> 0x0085 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x0085 }
            r0.L$2 = r10     // Catch:{ Throwable -> 0x0085 }
            r0.L$3 = r13     // Catch:{ Throwable -> 0x0085 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0085 }
            r0.I$1 = r2     // Catch:{ Throwable -> 0x0085 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x0085 }
            r11 = 1
            r0.label = r11     // Catch:{ Throwable -> 0x0085 }
            java.lang.Object r11 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x0085 }
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            r8 = r3
            r3 = r10
            r10 = r8
            r9 = r2
            r2 = r13
            r13 = r9
        L_0x00c1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Throwable -> 0x0085 }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x0085 }
            if (r11 == 0) goto L_0x00ee
            r0.L$0 = r6     // Catch:{ Throwable -> 0x0085 }
            r0.I$0 = r5     // Catch:{ Throwable -> 0x0085 }
            r0.L$1 = r4     // Catch:{ Throwable -> 0x0085 }
            r0.L$2 = r3     // Catch:{ Throwable -> 0x0085 }
            r0.L$3 = r2     // Catch:{ Throwable -> 0x0085 }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x0085 }
            r0.I$1 = r13     // Catch:{ Throwable -> 0x0085 }
            r0.L$5 = r10     // Catch:{ Throwable -> 0x0085 }
            r11 = 2
            r0.label = r11     // Catch:{ Throwable -> 0x0085 }
            java.lang.Object r11 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x0085 }
            if (r11 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r8 = r3
            r3 = r10
            r10 = r8
        L_0x00e6:
            int r7 = r13 + 1
            if (r5 != r13) goto L_0x00eb
            return r11
        L_0x00eb:
            r13 = r2
            r2 = r7
            goto L_0x00a1
        L_0x00ee:
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r5)     // Catch:{ Throwable -> 0x0085 }
            java.lang.Object r10 = r4.invoke(r10)     // Catch:{ Throwable -> 0x0085 }
            return r10
        L_0x00f7:
            throw r10     // Catch:{ all -> 0x0082 }
        L_0x00f8:
            throw r10
        L_0x00f9:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149319a(kotlinx.coroutines.channels.e, int, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object m149332b(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, java.lang.Boolean> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00e0
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00bb
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x008a:
            r10 = move-exception
            goto L_0x00f2
        L_0x008d:
            r10 = move-exception
            goto L_0x00f1
        L_0x0090:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f3
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008d }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009e:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008d }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00bb:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008d }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r12 == 0) goto L_0x00f0
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008d }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00e0:
            java.lang.Object r7 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008d }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Throwable -> 0x008d }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r7 == 0) goto L_0x009e
            r5.add(r12)     // Catch:{ Throwable -> 0x008d }
            goto L_0x009e
        L_0x00f0:
            return r5
        L_0x00f1:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00f2:
            throw r10
        L_0x00f3:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149332b(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object m149341c(kotlinx.coroutines.channels.C48138e<? extends E> r16, C r17, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, ? extends R> r18, kotlin.coroutines.C47919b<? super C> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedTo$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0062;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$7
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$6
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$5
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$4
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.a.m r9 = (kotlin.jvm.p357a.C7563m) r9
            java.lang.Object r10 = r1.L$1
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            boolean r12 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0096 }
            if (r12 != 0) goto L_0x005d
            r14 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r14
            goto L_0x00ff
        L_0x005d:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0096 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0096 }
            throw r0     // Catch:{ Throwable -> 0x0096 }
        L_0x0062:
            java.lang.Object r3 = r1.L$8
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$7
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$6
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$5
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$4
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.a.m r9 = (kotlin.jvm.p357a.C7563m) r9
            java.lang.Object r10 = r1.L$1
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            boolean r12 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x0096 }
            if (r12 != 0) goto L_0x008e
            r14 = r4
            r4 = r2
            r2 = r14
            goto L_0x00d7
        L_0x008e:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x0096 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x0096 }
            throw r0     // Catch:{ Throwable -> 0x0096 }
        L_0x0093:
            r0 = move-exception
            goto L_0x0114
        L_0x0096:
            r0 = move-exception
            goto L_0x0113
        L_0x0099:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x0115
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r16.mo120362a()     // Catch:{ Throwable -> 0x0096 }
            r6 = r16
            r7 = r6
            r11 = r7
            r10 = r17
            r9 = r18
            r5 = r2
            r2 = r11
        L_0x00b4:
            r1.L$0 = r11     // Catch:{ Throwable -> 0x0096 }
            r1.L$1 = r10     // Catch:{ Throwable -> 0x0096 }
            r1.L$2 = r9     // Catch:{ Throwable -> 0x0096 }
            r1.L$3 = r0     // Catch:{ Throwable -> 0x0096 }
            r1.L$4 = r7     // Catch:{ Throwable -> 0x0096 }
            r1.L$5 = r6     // Catch:{ Throwable -> 0x0096 }
            r1.L$6 = r3     // Catch:{ Throwable -> 0x0096 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0096 }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x0096 }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x0096 }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x0096 }
            if (r8 != r5) goto L_0x00d0
            return r5
        L_0x00d0:
            r14 = r8
            r8 = r0
            r0 = r14
            r15 = r5
            r5 = r3
            r3 = r4
            r4 = r15
        L_0x00d7:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0096 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0096 }
            if (r0 == 0) goto L_0x0112
            r1.L$0 = r11     // Catch:{ Throwable -> 0x0096 }
            r1.L$1 = r10     // Catch:{ Throwable -> 0x0096 }
            r1.L$2 = r9     // Catch:{ Throwable -> 0x0096 }
            r1.L$3 = r8     // Catch:{ Throwable -> 0x0096 }
            r1.L$4 = r7     // Catch:{ Throwable -> 0x0096 }
            r1.L$5 = r6     // Catch:{ Throwable -> 0x0096 }
            r1.L$6 = r5     // Catch:{ Throwable -> 0x0096 }
            r1.L$7 = r2     // Catch:{ Throwable -> 0x0096 }
            r1.L$8 = r3     // Catch:{ Throwable -> 0x0096 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x0096 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x0096 }
            if (r0 != r4) goto L_0x00fb
            return r4
        L_0x00fb:
            r14 = r4
            r4 = r3
            r3 = r5
            r5 = r14
        L_0x00ff:
            int r12 = r8.element     // Catch:{ Throwable -> 0x0096 }
            int r13 = r12 + 1
            r8.element = r13     // Catch:{ Throwable -> 0x0096 }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r12)     // Catch:{ Throwable -> 0x0096 }
            java.lang.Object r0 = r9.invoke(r12, r0)     // Catch:{ Throwable -> 0x0096 }
            r10.add(r0)     // Catch:{ Throwable -> 0x0096 }
            r0 = r8
            goto L_0x00b4
        L_0x0112:
            return r10
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0114:
            throw r0
        L_0x0115:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149341c(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=R, code=java.lang.Object, for r13v0, types: [R, T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> java.lang.Object m149320a(kotlinx.coroutines.channels.C48138e<? extends E> r12, java.lang.Object r13, kotlin.jvm.p357a.C7563m<? super R, ? super E, ? extends R> r14, kotlin.coroutines.C47919b<? super R> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$fold$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$fold$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$fold$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$fold$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$fold$1
            r0.<init>(r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0091;
                case 1: goto L_0x005f;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002c:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r14 = r0.L$6
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$1
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008e }
            if (r8 != 0) goto L_0x005a
        L_0x0052:
            r9 = r3
            r3 = r12
            r12 = r9
            r10 = r14
            r14 = r13
            r13 = r10
            goto L_0x00f0
        L_0x005a:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x008e }
            java.lang.Throwable r12 = r15.exception     // Catch:{ Throwable -> 0x008e }
            throw r12     // Catch:{ Throwable -> 0x008e }
        L_0x005f:
            java.lang.Object r12 = r0.L$8
            kotlinx.coroutines.channels.b r12 = (kotlinx.coroutines.channels.C48135b) r12
            java.lang.Object r13 = r0.L$7
            kotlinx.coroutines.channels.e r13 = (kotlinx.coroutines.channels.C48138e) r13
            java.lang.Object r14 = r0.L$6
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r2 = r0.L$5
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$4
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
            java.lang.Object r6 = r0.L$1
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            boolean r8 = r15 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008e }
            if (r8 != 0) goto L_0x0086
            goto L_0x00cc
        L_0x0086:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15     // Catch:{ Throwable -> 0x008e }
            java.lang.Throwable r12 = r15.exception     // Catch:{ Throwable -> 0x008e }
            throw r12     // Catch:{ Throwable -> 0x008e }
        L_0x008b:
            r12 = move-exception
            goto L_0x00fe
        L_0x008e:
            r12 = move-exception
            goto L_0x00fd
        L_0x0091:
            boolean r2 = r15 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00ff
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            r15.element = r13
            r2 = 0
            kotlinx.coroutines.channels.b r3 = r12.mo120362a()     // Catch:{ Throwable -> 0x008e }
            r7 = r12
            r6 = r13
            r5 = r14
            r13 = r2
            r14 = r7
            r2 = r14
        L_0x00a7:
            r0.L$0 = r7     // Catch:{ Throwable -> 0x008e }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x008e }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x008e }
            r0.L$3 = r15     // Catch:{ Throwable -> 0x008e }
            r0.L$4 = r12     // Catch:{ Throwable -> 0x008e }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x008e }
            r0.L$6 = r13     // Catch:{ Throwable -> 0x008e }
            r0.L$7 = r14     // Catch:{ Throwable -> 0x008e }
            r0.L$8 = r3     // Catch:{ Throwable -> 0x008e }
            r4 = 1
            r0.label = r4     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r4 = r3.mo120360a(r0)     // Catch:{ Throwable -> 0x008e }
            if (r4 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r9 = r3
            r3 = r12
            r12 = r9
            r10 = r14
            r14 = r13
            r13 = r10
            r11 = r4
            r4 = r15
            r15 = r11
        L_0x00cc:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ Throwable -> 0x008e }
            boolean r15 = r15.booleanValue()     // Catch:{ Throwable -> 0x008e }
            if (r15 == 0) goto L_0x00fa
            r0.L$0 = r7     // Catch:{ Throwable -> 0x008e }
            r0.L$1 = r6     // Catch:{ Throwable -> 0x008e }
            r0.L$2 = r5     // Catch:{ Throwable -> 0x008e }
            r0.L$3 = r4     // Catch:{ Throwable -> 0x008e }
            r0.L$4 = r3     // Catch:{ Throwable -> 0x008e }
            r0.L$5 = r2     // Catch:{ Throwable -> 0x008e }
            r0.L$6 = r14     // Catch:{ Throwable -> 0x008e }
            r0.L$7 = r13     // Catch:{ Throwable -> 0x008e }
            r0.L$8 = r12     // Catch:{ Throwable -> 0x008e }
            r15 = 2
            r0.label = r15     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r15 = r12.mo120361b(r0)     // Catch:{ Throwable -> 0x008e }
            if (r15 != r1) goto L_0x0052
            return r1
        L_0x00f0:
            T r8 = r4.element     // Catch:{ Throwable -> 0x008e }
            java.lang.Object r15 = r5.invoke(r8, r15)     // Catch:{ Throwable -> 0x008e }
            r4.element = r15     // Catch:{ Throwable -> 0x008e }
            r15 = r4
            goto L_0x00a7
        L_0x00fa:
            T r12 = r4.element
            return r12
        L_0x00fd:
            throw r12     // Catch:{ all -> 0x008b }
        L_0x00fe:
            throw r12
        L_0x00ff:
            kotlin.Result$Failure r15 = (kotlin.Result.Failure) r15
            java.lang.Throwable r12 = r15.exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149320a(kotlinx.coroutines.channels.e, java.lang.Object, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object m149333b(kotlinx.coroutines.channels.C48138e<? extends E> r18, C r19, kotlin.jvm.p357a.C7563m<? super java.lang.Integer, ? super E, ? extends R> r20, kotlin.coroutines.C47919b<? super C> r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexedNotNullTo$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0068;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00a2 }
            if (r13 != 0) goto L_0x0063
            r16 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r16
            goto L_0x0116
        L_0x0063:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00a2 }
            throw r0     // Catch:{ Throwable -> 0x00a2 }
        L_0x0068:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref.IntRef) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.e r9 = (kotlinx.coroutines.channels.C48138e) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.m r10 = (kotlin.jvm.p357a.C7563m) r10
            java.lang.Object r11 = r1.L$1
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00a2 }
            if (r13 != 0) goto L_0x009a
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x00ea
        L_0x009a:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x00a2 }
            throw r0     // Catch:{ Throwable -> 0x00a2 }
        L_0x009f:
            r0 = move-exception
            goto L_0x013a
        L_0x00a2:
            r0 = move-exception
            goto L_0x0139
        L_0x00a5:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x013b
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            r3 = 0
            kotlinx.coroutines.channels.b r4 = r18.mo120362a()     // Catch:{ Throwable -> 0x00a2 }
            r6 = r18
            r7 = r6
            r9 = r7
            r12 = r9
            r11 = r19
            r10 = r20
            r5 = r2
            r2 = r12
        L_0x00c1:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00a2 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00a2 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00a2 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00a2 }
            r1.L$4 = r0     // Catch:{ Throwable -> 0x00a2 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00a2 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00a2 }
            r1.L$7 = r3     // Catch:{ Throwable -> 0x00a2 }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x00a2 }
            r1.L$9 = r4     // Catch:{ Throwable -> 0x00a2 }
            r8 = 1
            r1.label = r8     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r8 = r4.mo120360a(r1)     // Catch:{ Throwable -> 0x00a2 }
            if (r8 != r5) goto L_0x00df
            return r5
        L_0x00df:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r5
            r5 = r3
            r3 = r4
            r4 = r17
        L_0x00ea:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x00a2 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x00a2 }
            if (r0 == 0) goto L_0x0138
            r1.L$0 = r12     // Catch:{ Throwable -> 0x00a2 }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x00a2 }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x00a2 }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x00a2 }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x00a2 }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x00a2 }
            r1.L$6 = r6     // Catch:{ Throwable -> 0x00a2 }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x00a2 }
            r1.L$8 = r2     // Catch:{ Throwable -> 0x00a2 }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x00a2 }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x00a2 }
            if (r0 != r4) goto L_0x0110
            return r4
        L_0x0110:
            r16 = r4
            r4 = r3
            r3 = r5
            r5 = r16
        L_0x0116:
            kotlin.collections.z r13 = new kotlin.collections.z     // Catch:{ Throwable -> 0x00a2 }
            int r14 = r8.element     // Catch:{ Throwable -> 0x00a2 }
            int r15 = r14 + 1
            r8.element = r15     // Catch:{ Throwable -> 0x00a2 }
            r13.<init>(r14, r0)     // Catch:{ Throwable -> 0x00a2 }
            int r0 = r13.f122770a     // Catch:{ Throwable -> 0x00a2 }
            T r13 = r13.f122771b     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r0)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.Object r0 = r10.invoke(r0, r13)     // Catch:{ Throwable -> 0x00a2 }
            if (r0 == 0) goto L_0x0136
            boolean r0 = r11.add(r0)     // Catch:{ Throwable -> 0x00a2 }
            kotlin.coroutines.jvm.internal.C47951a.m148882a(r0)     // Catch:{ Throwable -> 0x00a2 }
        L_0x0136:
            r0 = r8
            goto L_0x00c1
        L_0x0138:
            return r11
        L_0x0139:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x013a:
            throw r0
        L_0x013b:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149333b(kotlinx.coroutines.channels.e, java.util.Collection, kotlin.jvm.a.m, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, M extends java.util.Map<? super K, java.util.List<E>>> java.lang.Object m149342c(kotlinx.coroutines.channels.C48138e<? extends E> r11, M r12, kotlin.jvm.p357a.C7562b<? super E, ? extends K> r13, kotlin.coroutines.C47919b<? super M> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$groupByTo$1
            r0.<init>(r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002c:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r13 = r0.L$5
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0058
            r9 = r2
            r2 = r11
            r11 = r9
            r10 = r14
            r14 = r13
            r13 = r10
            goto L_0x00e0
        L_0x0058:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r11 = r14.exception     // Catch:{ Throwable -> 0x008d }
            throw r11     // Catch:{ Throwable -> 0x008d }
        L_0x005d:
            java.lang.Object r11 = r0.L$7
            kotlinx.coroutines.channels.b r11 = (kotlinx.coroutines.channels.C48135b) r11
            java.lang.Object r12 = r0.L$6
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            java.lang.Object r13 = r0.L$5
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r14 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0085
            r9 = r14
            r14 = r13
            r13 = r9
            goto L_0x00bb
        L_0x0085:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r11 = r14.exception     // Catch:{ Throwable -> 0x008d }
            throw r11     // Catch:{ Throwable -> 0x008d }
        L_0x008a:
            r11 = move-exception
            goto L_0x00fa
        L_0x008d:
            r11 = move-exception
            goto L_0x00f9
        L_0x0090:
            boolean r2 = r14 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00fb
            r14 = 0
            kotlinx.coroutines.channels.b r2 = r11.mo120362a()     // Catch:{ Throwable -> 0x008d }
            r3 = r11
            r6 = r3
            r5 = r12
            r4 = r13
            r12 = r6
        L_0x009e:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008d }
            r13 = 1
            r0.label = r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r13 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008d }
            if (r13 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r9 = r2
            r2 = r11
            r11 = r9
        L_0x00bb:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x008d }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r13 == 0) goto L_0x00f8
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r14     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r12     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r11     // Catch:{ Throwable -> 0x008d }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r13 = r11.mo120361b(r0)     // Catch:{ Throwable -> 0x008d }
            if (r13 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            r9 = r2
            r2 = r11
            r11 = r9
        L_0x00e0:
            java.lang.Object r7 = r4.invoke(r13)     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r8 = r5.get(r7)     // Catch:{ Throwable -> 0x008d }
            if (r8 != 0) goto L_0x00f2
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Throwable -> 0x008d }
            r8.<init>()     // Catch:{ Throwable -> 0x008d }
            r5.put(r7, r8)     // Catch:{ Throwable -> 0x008d }
        L_0x00f2:
            java.util.List r8 = (java.util.List) r8     // Catch:{ Throwable -> 0x008d }
            r8.add(r13)     // Catch:{ Throwable -> 0x008d }
            goto L_0x009e
        L_0x00f8:
            return r5
        L_0x00f9:
            throw r11     // Catch:{ all -> 0x008a }
        L_0x00fa:
            throw r11
        L_0x00fb:
            kotlin.Result$Failure r14 = (kotlin.Result.Failure) r14
            java.lang.Throwable r11 = r14.exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149342c(kotlinx.coroutines.channels.e, java.util.Map, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r13 = r4;
        r4 = r11;
        r11 = r6;
        r8 = r3;
        r3 = r12;
        r12 = r5;
        r5 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r0.L$0 = r11;
        r0.L$1 = r12;
        r0.L$2 = r13;
        r0.L$3 = r1;
        r0.L$4 = r2;
        r0.L$5 = r3;
        r0.L$6 = r4;
        r0.L$7 = r10;
        r0.label = 1;
        r6 = r10.mo120360a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r6 != r5) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r8 = r6;
        r6 = r11;
        r11 = r4;
        r4 = r13;
        r13 = r8;
        r9 = r5;
        r5 = r12;
        r12 = r3;
        r3 = r1;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.label = 2;
        r13 = r10.mo120361b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r13 != r1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r7 = r4.invoke(r13);
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.L$6 = r11;
        r0.L$7 = r10;
        r0.L$8 = r13;
        r0.L$9 = r13;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        if (r5.mo120363a(r7, r0) != r1) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R, C extends kotlinx.coroutines.channels.C48139f<? super R>> java.lang.Object m149348d(kotlinx.coroutines.channels.C48138e<? extends E> r10, C r11, kotlin.jvm.p357a.C7562b<? super E, ? extends R> r12, kotlin.coroutines.C47919b<? super C> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$3
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapTo$3
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x008a;
                case 2: goto L_0x005f;
                case 3: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x005a
        L_0x0050:
            r13 = r4
            r4 = r11
            r11 = r6
            r8 = r3
            r3 = r12
            r12 = r5
            r5 = r1
            r1 = r8
            goto L_0x00cc
        L_0x005a:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x005f:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x0085
            goto L_0x0112
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x008a:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.f r5 = (kotlinx.coroutines.channels.C48139f) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x00b7 }
            if (r7 != 0) goto L_0x00af
            goto L_0x00f0
        L_0x00af:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x00b7 }
            throw r10     // Catch:{ Throwable -> 0x00b7 }
        L_0x00b4:
            r10 = move-exception
            goto L_0x0136
        L_0x00b7:
            r10 = move-exception
            goto L_0x0135
        L_0x00ba:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0137
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x00b7 }
            r4 = r10
            r3 = r13
            r5 = r1
            r1 = r4
            r13 = r12
            r10 = r2
            r2 = r1
            r12 = r11
            r11 = r2
        L_0x00cc:
            r0.L$0 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r1     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r6 = 1
            r0.label = r6     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r6 = r10.mo120360a(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r6 != r5) goto L_0x00e6
            return r5
        L_0x00e6:
            r8 = r6
            r6 = r11
            r11 = r4
            r4 = r13
            r13 = r8
            r9 = r5
            r5 = r12
            r12 = r3
            r3 = r1
            r1 = r9
        L_0x00f0:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Throwable -> 0x00b7 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x00b7 }
            if (r13 == 0) goto L_0x0134
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r13 = 2
            r0.label = r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0112
            return r1
        L_0x0112:
            java.lang.Object r7 = r4.invoke(r13)     // Catch:{ Throwable -> 0x00b7 }
            r0.L$0 = r6     // Catch:{ Throwable -> 0x00b7 }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x00b7 }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x00b7 }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x00b7 }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x00b7 }
            r0.L$5 = r12     // Catch:{ Throwable -> 0x00b7 }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x00b7 }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x00b7 }
            r0.L$8 = r13     // Catch:{ Throwable -> 0x00b7 }
            r0.L$9 = r13     // Catch:{ Throwable -> 0x00b7 }
            r13 = 3
            r0.label = r13     // Catch:{ Throwable -> 0x00b7 }
            java.lang.Object r13 = r5.mo120363a(r7, r0)     // Catch:{ Throwable -> 0x00b7 }
            if (r13 != r1) goto L_0x0050
            return r1
        L_0x0134:
            return r5
        L_0x0135:
            throw r10     // Catch:{ all -> 0x00b4 }
        L_0x0136:
            throw r10
        L_0x0137:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149348d(kotlinx.coroutines.channels.e, kotlinx.coroutines.channels.f, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=R, code=java.lang.Object, for r18v0, types: [R, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> java.lang.Object m149321a(kotlinx.coroutines.channels.C48138e<? extends E> r17, java.lang.Object r18, kotlin.jvm.p357a.C48006q<? super java.lang.Integer, ? super R, ? super E, ? extends R> r19, kotlin.coroutines.C47919b<? super R> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$foldIndexed$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$foldIndexed$1 r1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$foldIndexed$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$foldIndexed$1 r1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$foldIndexed$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r3 = r1.label
            switch(r3) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0064;
                case 2: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.q r10 = (kotlin.jvm.p357a.C48006q) r10
            java.lang.Object r11 = r1.L$1
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x005f
            r15 = r8
            r8 = r2
            r2 = r6
            r6 = r3
            r3 = r15
            goto L_0x0111
        L_0x005f:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0064:
            java.lang.Object r3 = r1.L$9
            kotlinx.coroutines.channels.b r3 = (kotlinx.coroutines.channels.C48135b) r3
            java.lang.Object r4 = r1.L$8
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.C48138e) r4
            java.lang.Object r5 = r1.L$7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$6
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            java.lang.Object r7 = r1.L$5
            kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.C48138e) r7
            java.lang.Object r8 = r1.L$4
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref.IntRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.a.q r10 = (kotlin.jvm.p357a.C48006q) r10
            java.lang.Object r11 = r1.L$1
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.channels.e r12 = (kotlinx.coroutines.channels.C48138e) r12
            boolean r13 = r0 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x009a }
            if (r13 != 0) goto L_0x0092
            r15 = r6
            r6 = r2
            r2 = r15
            goto L_0x00e7
        L_0x0092:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Throwable r0 = r0.exception     // Catch:{ Throwable -> 0x009a }
            throw r0     // Catch:{ Throwable -> 0x009a }
        L_0x0097:
            r0 = move-exception
            goto L_0x0129
        L_0x009a:
            r0 = move-exception
            goto L_0x0128
        L_0x009d:
            boolean r3 = r0 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x012a
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r3 = 0
            r0.element = r3
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r4 = r18
            r3.element = r4
            r5 = 0
            kotlinx.coroutines.channels.b r6 = r17.mo120362a()     // Catch:{ Throwable -> 0x009a }
            r7 = r17
            r12 = r7
            r10 = r19
            r8 = r2
            r11 = r4
            r2 = r12
            r4 = r2
        L_0x00c0:
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r0     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r3     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x009a }
            r1.L$9 = r6     // Catch:{ Throwable -> 0x009a }
            r9 = 1
            r1.label = r9     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r9 = r6.mo120360a(r1)     // Catch:{ Throwable -> 0x009a }
            if (r9 != r8) goto L_0x00de
            return r8
        L_0x00de:
            r15 = r9
            r9 = r0
            r0 = r15
            r16 = r8
            r8 = r3
            r3 = r6
            r6 = r16
        L_0x00e7:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x009a }
            if (r0 == 0) goto L_0x0125
            r1.L$0 = r12     // Catch:{ Throwable -> 0x009a }
            r1.L$1 = r11     // Catch:{ Throwable -> 0x009a }
            r1.L$2 = r10     // Catch:{ Throwable -> 0x009a }
            r1.L$3 = r9     // Catch:{ Throwable -> 0x009a }
            r1.L$4 = r8     // Catch:{ Throwable -> 0x009a }
            r1.L$5 = r7     // Catch:{ Throwable -> 0x009a }
            r1.L$6 = r2     // Catch:{ Throwable -> 0x009a }
            r1.L$7 = r5     // Catch:{ Throwable -> 0x009a }
            r1.L$8 = r4     // Catch:{ Throwable -> 0x009a }
            r1.L$9 = r3     // Catch:{ Throwable -> 0x009a }
            r0 = 2
            r1.label = r0     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r0 = r3.mo120361b(r1)     // Catch:{ Throwable -> 0x009a }
            if (r0 != r6) goto L_0x010d
            return r6
        L_0x010d:
            r15 = r6
            r6 = r3
            r3 = r8
            r8 = r15
        L_0x0111:
            int r13 = r9.element     // Catch:{ Throwable -> 0x009a }
            int r14 = r13 + 1
            r9.element = r14     // Catch:{ Throwable -> 0x009a }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.C47951a.m148884a(r13)     // Catch:{ Throwable -> 0x009a }
            T r14 = r3.element     // Catch:{ Throwable -> 0x009a }
            java.lang.Object r0 = r10.invoke(r13, r14, r0)     // Catch:{ Throwable -> 0x009a }
            r3.element = r0     // Catch:{ Throwable -> 0x009a }
            r0 = r9
            goto L_0x00c0
        L_0x0125:
            T r0 = r8.element
            return r0
        L_0x0128:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0129:
            throw r0
        L_0x012a:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149321a(kotlinx.coroutines.channels.e, java.lang.Object, kotlin.jvm.a.q, kotlin.coroutines.b):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object m149334b(kotlinx.coroutines.channels.C48138e<? extends E> r10, M r11, kotlin.jvm.p357a.C7562b<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> r12, kotlin.coroutines.C47919b<? super M> r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateTo$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$associateTo$1
            r0.<init>(r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x005d;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0058
            r8 = r2
            r2 = r10
            r10 = r8
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x00e0
        L_0x0058:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x005d:
            java.lang.Object r10 = r0.L$7
            kotlinx.coroutines.channels.b r10 = (kotlinx.coroutines.channels.C48135b) r10
            java.lang.Object r11 = r0.L$6
            kotlinx.coroutines.channels.e r11 = (kotlinx.coroutines.channels.C48138e) r11
            java.lang.Object r12 = r0.L$5
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.C48138e) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.channels.e r3 = (kotlinx.coroutines.channels.C48138e) r3
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            java.lang.Object r5 = r0.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.e r6 = (kotlinx.coroutines.channels.C48138e) r6
            boolean r7 = r13 instanceof kotlin.Result.Failure     // Catch:{ Throwable -> 0x008d }
            if (r7 != 0) goto L_0x0085
            r8 = r13
            r13 = r12
            r12 = r8
            goto L_0x00bb
        L_0x0085:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13     // Catch:{ Throwable -> 0x008d }
            java.lang.Throwable r10 = r13.exception     // Catch:{ Throwable -> 0x008d }
            throw r10     // Catch:{ Throwable -> 0x008d }
        L_0x008a:
            r10 = move-exception
            goto L_0x00f4
        L_0x008d:
            r10 = move-exception
            goto L_0x00f3
        L_0x0090:
            boolean r2 = r13 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x00f5
            r13 = 0
            kotlinx.coroutines.channels.b r2 = r10.mo120362a()     // Catch:{ Throwable -> 0x008d }
            r3 = r10
            r6 = r3
            r5 = r11
            r4 = r12
            r11 = r6
        L_0x009e:
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r10     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r2     // Catch:{ Throwable -> 0x008d }
            r12 = 1
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r2.mo120360a(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00bb:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Throwable -> 0x008d }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x008d }
            if (r12 == 0) goto L_0x00f2
            r0.L$0 = r6     // Catch:{ Throwable -> 0x008d }
            r0.L$1 = r5     // Catch:{ Throwable -> 0x008d }
            r0.L$2 = r4     // Catch:{ Throwable -> 0x008d }
            r0.L$3 = r3     // Catch:{ Throwable -> 0x008d }
            r0.L$4 = r2     // Catch:{ Throwable -> 0x008d }
            r0.L$5 = r13     // Catch:{ Throwable -> 0x008d }
            r0.L$6 = r11     // Catch:{ Throwable -> 0x008d }
            r0.L$7 = r10     // Catch:{ Throwable -> 0x008d }
            r12 = 2
            r0.label = r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r10.mo120361b(r0)     // Catch:{ Throwable -> 0x008d }
            if (r12 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x00e0:
            java.lang.Object r12 = r4.invoke(r12)     // Catch:{ Throwable -> 0x008d }
            kotlin.Pair r12 = (kotlin.Pair) r12     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r7 = r12.getFirst()     // Catch:{ Throwable -> 0x008d }
            java.lang.Object r12 = r12.getSecond()     // Catch:{ Throwable -> 0x008d }
            r5.put(r7, r12)     // Catch:{ Throwable -> 0x008d }
            goto L_0x009e
        L_0x00f2:
            return r5
        L_0x00f3:
            throw r10     // Catch:{ all -> 0x008a }
        L_0x00f4:
            throw r10
        L_0x00f5:
            kotlin.Result$Failure r13 = (kotlin.Result.Failure) r13
            java.lang.Throwable r10 = r13.exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C48137d.m149334b(kotlinx.coroutines.channels.e, java.util.Map, kotlin.jvm.a.b, kotlin.coroutines.b):java.lang.Object");
    }
}
