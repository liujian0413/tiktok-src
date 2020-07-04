package com.bytedance.p263im.core.proto;

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

/* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody */
public final class BatchMarkConversationReadResponseBody extends Message<BatchMarkConversationReadResponseBody, Builder> {
    public static final ProtoAdapter<BatchMarkConversationReadResponseBody> ADAPTER = new ProtoAdapter_BatchMarkConversationReadResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.MarkConversationReadRequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<MarkConversationReadRequestBody> failed_requests;

    /* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BatchMarkConversationReadResponseBody, Builder> {
        public List<MarkConversationReadRequestBody> failed_requests = Internal.newMutableList();

        public final BatchMarkConversationReadResponseBody build() {
            return new BatchMarkConversationReadResponseBody(this.failed_requests, super.buildUnknownFields());
        }

        public final Builder failed_requests(List<MarkConversationReadRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.failed_requests = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody$ProtoAdapter_BatchMarkConversationReadResponseBody */
    static final class ProtoAdapter_BatchMarkConversationReadResponseBody extends ProtoAdapter<BatchMarkConversationReadResponseBody> {
        public ProtoAdapter_BatchMarkConversationReadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchMarkConversationReadResponseBody.class);
        }

        public final int encodedSize(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            return MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadResponseBody.failed_requests) + batchMarkConversationReadResponseBody.unknownFields().size();
        }

        public final BatchMarkConversationReadResponseBody redact(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            Builder newBuilder = batchMarkConversationReadResponseBody.newBuilder();
            Internal.redactElements(newBuilder.failed_requests, MarkConversationReadRequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BatchMarkConversationReadResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.failed_requests.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) throws IOException {
            MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadResponseBody.failed_requests);
            protoWriter.writeBytes(batchMarkConversationReadResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.failed_requests.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.failed_requests = Internal.copyOf("failed_requests", this.failed_requests);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.failed_requests.isEmpty()) {
            sb.append(", failed_requests=");
            sb.append(this.failed_requests);
        }
        StringBuilder replace = sb.replace(0, 2, "BatchMarkConversationReadResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchMarkConversationReadResponseBody)) {
            return false;
        }
        BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody = (BatchMarkConversationReadResponseBody) obj;
        if (!unknownFields().equals(batchMarkConversationReadResponseBody.unknownFields()) || !this.failed_requests.equals(batchMarkConversationReadResponseBody.failed_requests)) {
            return false;
        }
        return true;
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_requests = Internal.immutableCopyOf("failed_requests", list);
    }
}
