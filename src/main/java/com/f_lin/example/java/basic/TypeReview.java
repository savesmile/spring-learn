package com.f_lin.example.java.basic;

/**
 * 1）+：在编译器将右边的表达式结果计算出来后，和左边的变量类型比较精度，
 * 如果左边的变量精度低于右边的结果的精度，编译器会显式的报错，告诉程序员去强制转型。
 * （所以s1 = s1 + 1出错）最后将表达式的结果复制到变量所在的内存区。
 *
 * 2）+=：编译器自动隐式直接将+=运算符后面的操作数强制装换为前面变量的类型，
 * 然后在变量所在的内存区上直接根据右边的操作数修改左边变量内存存储的二进制数值
 * （所以 s += 1不报错）最后达到和赋值运算符相同的目的。
 * 与前者相比，由于后者是位操作，效率也较前者高。
 *
 * @author F_lin
 * @since 2019/6/21
 **/
public class TypeReview {

    public static void main(String[] args) {
        String tStr = "hello";
        Integer tInt = 1;

        byte tb = 1;
        int ti = 2;

        tb += ti;
        //
        //tb = tb + ti;

        ti = tb + ti;

        System.out.println(tStr + tInt + tInt);
    }
}
