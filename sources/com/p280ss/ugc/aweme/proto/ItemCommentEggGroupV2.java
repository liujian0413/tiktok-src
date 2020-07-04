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

/* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggGroupV2 */
final class ItemCommentEggGroupV2 extends Message<ItemCommentEggGroupV2, Builder> {
    public static final ProtoAdapter<ItemCommentEggGroupV2> ADAPTER = new ProtoAdapter_ItemCommentEggGroupV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.EditHintV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public List<EditHintV2> edit_hint_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ItemCommentEggMaterialDataV2#ADAPTER", label = Label.REPEATED, tag = 2)
    public List<ItemCommentEggMaterialDataV2> item_comment_eggs;

    /* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggGroupV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ItemCommentEggGroupV2, Builder> {
        public List<EditHintV2> edit_hint_list = Internal.newMutableList();
        public List<ItemCommentEggMaterialDataV2> item_comment_eggs = Internal.newMutableList();

        public final ItemCommentEggGroupV2 build() {
            return new ItemCommentEggGroupV2(this.edit_hint_list, this.item_comment_eggs, super.buildUnknownFields());
        }

        public final Builder edit_hint_list(List<EditHintV2> list) {
            Internal.checkElementsNotNull(list);
            this.edit_hint_list = list;
            return this;
        }

        public final Builder item_comment_eggs(List<ItemCommentEggMaterialDataV2> list) {
            Internal.checkElementsNotNull(list);
            this.item_comment_eggs = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggGroupV2$ProtoAdapter_ItemCommentEggGroupV2 */
    static final class ProtoAdapter_ItemCommentEggGroupV2 extends ProtoAdapter<ItemCommentEggGroupV2> {
        public ProtoAdapter_ItemCommentEggGroupV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ItemCommentEggGroupV2.class);
        }

        public final int encodedSize(ItemCommentEggGroupV2 itemCommentEggGroupV2) {
            return EditHintV2.ADAPTER.asRepeated().encodedSizeWithTag(1, itemCommentEggGroupV2.edit_hint_list) + ItemCommentEggMaterialDataV2.ADAPTER.asRepeated().encodedSizeWithTag(2, itemCommentEggGroupV2.item_comment_eggs) + itemCommentEggGroupV2.unknownFields().size();
        }

        public final ItemCommentEggGroupV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.edit_hint_list.add(EditHintV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.item_comment_eggs.add(ItemCommentEggMaterialDataV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ItemCommentEggGroupV2 itemCommentEggGroupV2) throws IOException {
            EditHintV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, itemCommentEggGroupV2.edit_hint_list);
            ItemCommentEggMaterialDataV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, itemCommentEggGroupV2.item_comment_eggs);
            protoWriter.writeBytes(itemCommentEggGroupV2.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.edit_hint_list.hashCode()) * 37) + this.item_comment_eggs.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.edit_hint_list = Internal.copyOf("edit_hint_list", this.edit_hint_list);
        builder.item_comment_eggs = Internal.copyOf("item_comment_eggs", this.item_comment_eggs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.edit_hint_list.isEmpty()) {
            sb.append(", edit_hint_list=");
            sb.append(this.edit_hint_list);
        }
        if (!this.item_comment_eggs.isEmpty()) {
            sb.append(", item_comment_eggs=");
            sb.append(this.item_comment_eggs);
        }
        StringBuilder replace = sb.replace(0, 2, "ItemCommentEggGroupV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemCommentEggGroupV2)) {
            return false;
        }
        ItemCommentEggGroupV2 itemCommentEggGroupV2 = (ItemCommentEggGroupV2) obj;
        if (!unknownFields().equals(itemCommentEggGroupV2.unknownFields()) || !this.edit_hint_list.equals(itemCommentEggGroupV2.edit_hint_list) || !this.item_comment_eggs.equals(itemCommentEggGroupV2.item_comment_eggs)) {
            return false;
        }
        return true;
    }

    public ItemCommentEggGroupV2(List<EditHintV2> list, List<ItemCommentEggMaterialDataV2> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public ItemCommentEggGroupV2(List<EditHintV2> list, List<ItemCommentEggMaterialDataV2> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.edit_hint_list = Internal.immutableCopyOf("edit_hint_list", list);
        this.item_comment_eggs = Internal.immutableCopyOf("item_comment_eggs", list2);
    }
}
