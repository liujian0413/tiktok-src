package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.ExtraStructV2 */
public final class ExtraStructV2 extends Message<ExtraStructV2, Builder> {
    public static final ProtoAdapter<ExtraStructV2> ADAPTER = new ProtoAdapter_ExtraStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 3)
    public List<String> fatal_item_ids;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String logid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long now;

    /* renamed from: com.ss.ugc.aweme.proto.ExtraStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ExtraStructV2, Builder> {
        public List<String> fatal_item_ids = Internal.newMutableList();
        public String logid;
        public Long now;

        public final ExtraStructV2 build() {
            return new ExtraStructV2(this.now, this.logid, this.fatal_item_ids, super.buildUnknownFields());
        }

        public final Builder logid(String str) {
            this.logid = str;
            return this;
        }

        public final Builder now(Long l) {
            this.now = l;
            return this;
        }

        public final Builder fatal_item_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.fatal_item_ids = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ExtraStructV2$ProtoAdapter_ExtraStructV2 */
    static final class ProtoAdapter_ExtraStructV2 extends ProtoAdapter<ExtraStructV2> {
        public ProtoAdapter_ExtraStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraStructV2.class);
        }

        public final int encodedSize(ExtraStructV2 extraStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, extraStructV2.now) + ProtoAdapter.STRING.encodedSizeWithTag(2, extraStructV2.logid) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, extraStructV2.fatal_item_ids) + extraStructV2.unknownFields().size();
        }

        public final ExtraStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.now((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.logid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ExtraStructV2 extraStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, extraStructV2.now);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraStructV2.logid);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, extraStructV2.fatal_item_ids);
            protoWriter.writeBytes(extraStructV2.unknownFields());
        }
    }

    public ExtraStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.now = this.now;
        builder.logid = this.logid;
        builder.fatal_item_ids = Internal.copyOf("fatal_item_ids", this.fatal_item_ids);
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
        if (this.now != null) {
            i = this.now.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.logid != null) {
            i3 = this.logid.hashCode();
        }
        int hashCode2 = ((i4 + i3) * 37) + this.fatal_item_ids.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.now != null) {
            sb.append(", now=");
            sb.append(this.now);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (!this.fatal_item_ids.isEmpty()) {
            sb.append(", fatal_item_ids=");
            sb.append(this.fatal_item_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtraStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraStructV2)) {
            return false;
        }
        ExtraStructV2 extraStructV2 = (ExtraStructV2) obj;
        if (!unknownFields().equals(extraStructV2.unknownFields()) || !Internal.equals(this.now, extraStructV2.now) || !Internal.equals(this.logid, extraStructV2.logid) || !this.fatal_item_ids.equals(extraStructV2.fatal_item_ids)) {
            return false;
        }
        return true;
    }

    public ExtraStructV2(Long l, String str, List<String> list) {
        this(l, str, list, ByteString.EMPTY);
    }

    public ExtraStructV2(Long l, String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.now = l;
        this.logid = str;
        this.fatal_item_ids = Internal.immutableCopyOf("fatal_item_ids", list);
    }
}
