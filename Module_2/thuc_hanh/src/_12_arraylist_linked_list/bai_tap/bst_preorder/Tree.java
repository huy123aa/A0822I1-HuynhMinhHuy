package bai_12.bai_tap.bst_preorder;

import bai_12.bai_tap.thao_tac_xoa_trong_bst.TreeNode;

public interface Tree<E> {
    boolean insert(E e);
    void preorder();
    int getSize();
}
