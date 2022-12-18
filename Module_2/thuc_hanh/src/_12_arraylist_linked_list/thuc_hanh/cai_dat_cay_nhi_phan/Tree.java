package bai_12.thuc_hanh.cai_dat_cay_nhi_phan;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
