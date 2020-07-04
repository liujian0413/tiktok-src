package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2 */
public final class BranchBillboardWeeklyStructV2 extends Message<BranchBillboardWeeklyStructV2, Builder> {
    public static final ProtoAdapter<BranchBillboardWeeklyStructV2> ADAPTER = new ProtoAdapter_BranchBillboardWeeklyStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer edition_no;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;

    /* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BranchBillboardWeeklyStructV2, Builder> {
        public Integer edition_no;
        public Long end_time;
        public Long start_time;
        public String uid;

        public final BranchBillboardWeeklyStructV2 build() {
            BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2 = new BranchBillboardWeeklyStructV2(this.uid, this.edition_no, this.start_time, this.end_time, super.buildUnknownFields());
            return branchBillboardWeeklyStructV2;
        }

        public final Builder edition_no(Integer num) {
            this.edition_no = num;
            return this;
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2$ProtoAdapter_BranchBillboardWeeklyStructV2 */
    static final class ProtoAdapter_BranchBillboardWeeklyStructV2 extends ProtoAdapter<BranchBillboardWeeklyStructV2> {
        public ProtoAdapter_BranchBillboardWeeklyStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BranchBillboardWeeklyStructV2.class);
        }

        public final int encodedSize(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, branchBillboardWeeklyStructV2.uid) + ProtoAdapter.INT32.encodedSizeWithTag(2, branchBillboardWeeklyStructV2.edition_no) + ProtoAdapter.INT64.encodedSizeWithTag(3, branchBillboardWeeklyStructV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, branchBillboardWeeklyStructV2.end_time) + branchBillboardWeeklyStructV2.unknownFields().size();
        }

        public final BranchBillboardWeeklyStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.edition_no((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.end_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, branchBillboardWeeklyStructV2.uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, branchBillboardWeeklyStructV2.edition_no);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, branchBillboardWeeklyStructV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, branchBillboardWeeklyStructV2.end_time);
            protoWriter.writeBytes(branchBillboardWeeklyStructV2.unknownFields());
        }
    }

    public BranchBillboardWeeklyStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.edition_no = this.edition_no;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.uid != null) {
            i = this.uid.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.edition_no != null) {
            i2 = this.edition_no.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.start_time != null) {
            i3 = this.start_time.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.end_time != null) {
            i5 = this.end_time.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.edition_no != null) {
            sb.append(", edition_no=");
            sb.append(this.edition_no);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "BranchBillboardWeeklyStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BranchBillboardWeeklyStructV2)) {
            return false;
        }
        BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2 = (BranchBillboardWeeklyStructV2) obj;
        if (!unknownFields().equals(branchBillboardWeeklyStructV2.unknownFields()) || !Internal.equals(this.uid, branchBillboardWeeklyStructV2.uid) || !Internal.equals(this.edition_no, branchBillboardWeeklyStructV2.edition_no) || !Internal.equals(this.start_time, branchBillboardWeeklyStructV2.start_time) || !Internal.equals(this.end_time, branchBillboardWeeklyStructV2.end_time)) {
            return false;
        }
        return true;
    }

    public BranchBillboardWeeklyStructV2(String str, Integer num, Long l, Long l2) {
        this(str, num, l, l2, ByteString.EMPTY);
    }

    public BranchBillboardWeeklyStructV2(String str, Integer num, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = str;
        this.edition_no = num;
        this.start_time = l;
        this.end_time = l2;
    }
}
