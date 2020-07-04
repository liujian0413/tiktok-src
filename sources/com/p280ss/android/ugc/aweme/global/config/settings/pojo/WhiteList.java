package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhiteList */
public final class WhiteList extends Message<WhiteList, Builder> {
    public static final DefaultValueProtoAdapter<WhiteList> ADAPTER = new ProtoAdapter_WhiteList();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> long_whitelist;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> short_whitelist;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhiteList$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WhiteList, Builder> {
        public List<String> long_whitelist = Internal.newMutableList();
        public List<String> short_whitelist = Internal.newMutableList();

        public final WhiteList build() {
            return new WhiteList(this.short_whitelist, this.long_whitelist, super.buildUnknownFields());
        }

        public final Builder long_whitelist(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.long_whitelist = list;
            return this;
        }

        public final Builder short_whitelist(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.short_whitelist = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhiteList$ProtoAdapter_WhiteList */
    static final class ProtoAdapter_WhiteList extends DefaultValueProtoAdapter<WhiteList> {
        public final WhiteList redact(WhiteList whiteList) {
            return whiteList;
        }

        public ProtoAdapter_WhiteList() {
            super(FieldEncoding.LENGTH_DELIMITED, WhiteList.class);
        }

        public final WhiteList decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (WhiteList) null);
        }

        public final int encodedSize(WhiteList whiteList) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, whiteList.short_whitelist) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, whiteList.long_whitelist) + whiteList.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WhiteList whiteList) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, whiteList.short_whitelist);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, whiteList.long_whitelist);
            protoWriter.writeBytes(whiteList.unknownFields());
        }

        public final WhiteList decode(ProtoReader protoReader, WhiteList whiteList) throws IOException {
            Builder builder;
            WhiteList whiteList2 = (WhiteList) C10938a.m32097a().mo26425a(WhiteList.class, whiteList);
            if (whiteList2 != null) {
                builder = whiteList2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (whiteList2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.short_whitelist = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.long_whitelist = newMutableList2;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getLongWhitelist() {
        return this.long_whitelist;
    }

    public final List<String> getShortWhitelist() {
        return this.short_whitelist;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.short_whitelist.hashCode()) * 37) + this.long_whitelist.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.short_whitelist = Internal.copyOf("short_whitelist", this.short_whitelist);
        builder.long_whitelist = Internal.copyOf("long_whitelist", this.long_whitelist);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.short_whitelist.isEmpty()) {
            sb.append(", short_whitelist=");
            sb.append(this.short_whitelist);
        }
        if (!this.long_whitelist.isEmpty()) {
            sb.append(", long_whitelist=");
            sb.append(this.long_whitelist);
        }
        StringBuilder replace = sb.replace(0, 2, "WhiteList{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WhiteList)) {
            return false;
        }
        WhiteList whiteList = (WhiteList) obj;
        if (!unknownFields().equals(whiteList.unknownFields()) || !this.short_whitelist.equals(whiteList.short_whitelist) || !this.long_whitelist.equals(whiteList.long_whitelist)) {
            return false;
        }
        return true;
    }

    public WhiteList(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public WhiteList(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.short_whitelist = Internal.immutableCopyOf("short_whitelist", list);
        this.long_whitelist = Internal.immutableCopyOf("long_whitelist", list2);
    }
}
