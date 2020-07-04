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

/* renamed from: com.ss.ugc.aweme.proto.HitTaskInfoV2 */
final class HitTaskInfoV2 extends Message<HitTaskInfoV2, Builder> {
    public static final ProtoAdapter<HitTaskInfoV2> ADAPTER = new ProtoAdapter_HitTaskInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer compeleted_task_cnt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer total_task_cnt;

    /* renamed from: com.ss.ugc.aweme.proto.HitTaskInfoV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HitTaskInfoV2, Builder> {
        public Integer compeleted_task_cnt;
        public Integer total_task_cnt;

        public final HitTaskInfoV2 build() {
            return new HitTaskInfoV2(this.compeleted_task_cnt, this.total_task_cnt, super.buildUnknownFields());
        }

        public final Builder compeleted_task_cnt(Integer num) {
            this.compeleted_task_cnt = num;
            return this;
        }

        public final Builder total_task_cnt(Integer num) {
            this.total_task_cnt = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.HitTaskInfoV2$ProtoAdapter_HitTaskInfoV2 */
    static final class ProtoAdapter_HitTaskInfoV2 extends ProtoAdapter<HitTaskInfoV2> {
        public ProtoAdapter_HitTaskInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HitTaskInfoV2.class);
        }

        public final int encodedSize(HitTaskInfoV2 hitTaskInfoV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, hitTaskInfoV2.compeleted_task_cnt) + ProtoAdapter.INT32.encodedSizeWithTag(2, hitTaskInfoV2.total_task_cnt) + hitTaskInfoV2.unknownFields().size();
        }

        public final HitTaskInfoV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.compeleted_task_cnt((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.total_task_cnt((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, HitTaskInfoV2 hitTaskInfoV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hitTaskInfoV2.compeleted_task_cnt);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, hitTaskInfoV2.total_task_cnt);
            protoWriter.writeBytes(hitTaskInfoV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.compeleted_task_cnt = this.compeleted_task_cnt;
        builder.total_task_cnt = this.total_task_cnt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.compeleted_task_cnt != null) {
            i = this.compeleted_task_cnt.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.total_task_cnt != null) {
            i3 = this.total_task_cnt.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.compeleted_task_cnt != null) {
            sb.append(", compeleted_task_cnt=");
            sb.append(this.compeleted_task_cnt);
        }
        if (this.total_task_cnt != null) {
            sb.append(", total_task_cnt=");
            sb.append(this.total_task_cnt);
        }
        StringBuilder replace = sb.replace(0, 2, "HitTaskInfoV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HitTaskInfoV2)) {
            return false;
        }
        HitTaskInfoV2 hitTaskInfoV2 = (HitTaskInfoV2) obj;
        if (!unknownFields().equals(hitTaskInfoV2.unknownFields()) || !Internal.equals(this.compeleted_task_cnt, hitTaskInfoV2.compeleted_task_cnt) || !Internal.equals(this.total_task_cnt, hitTaskInfoV2.total_task_cnt)) {
            return false;
        }
        return true;
    }

    public HitTaskInfoV2(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public HitTaskInfoV2(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.compeleted_task_cnt = num;
        this.total_task_cnt = num2;
    }
}
