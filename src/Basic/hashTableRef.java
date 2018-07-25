package Basic;

/**
 * Created by tiejin on 7/25/2018.
 */

import java.util.*;
//Hashtable是否真的能存储对象
public class hashTableRef {
    private static void hashTable(){
        Hashtable ht = new Hashtable();
        StringBuffer sb = new StringBuffer();
        sb.append("abc,");
        ht.put("1", sb);
        sb.append("def,");
        ht.put("2", sb);
        sb.append("mno,");
        ht.put("3", sb);
        sb.append("xyz.");
        ht.put("4", sb);

        int numObj = 0;
        Enumeration it = ht.elements();
        while (it.hasMoreElements()) {
            System.out.print("get StringBufffer " + (++numObj) + " from Hashtable: ");
            System.out.println(it.nextElement());
        }
    }
    public static void main(String[] args) {
        hashTable();
    }
}


// 向Hashtable传递 StringBuffer对象也是只传递了这个StringBuffer对象的引用！
// 每一次向Hashtable表中put一次 StringBuffer，并没有生成新的StringBuffer对象，
// 只是在Hashtable表中又放入了一个指向同一StringBuffer对 象的引用而已。

// 类，对象与引用

// Java最基本的概念就是类，类包括函数和变量。如果想要应用类，就要把类生成对象，
// 这个过程被称作"类的实例化"。有几种方法把类实例化成对象，最常用 的就是用"new"操作符。
// 类实例化成对象后，就意味着要在内存中占据一块空间存放实例。想要对这块空间操作就要应用到对象的引用。
// 引用在Java语言中 的体现就是变量，而变量的类型就是这个引用的对象。虽然在语法上可以在生成一个对象后直接调用该对象的函数或变量，如：
// new String("Hello NDP")).substring(0,3)//RETURN RESULT: Hel
// 但由于没有相应的引用，对这个对象的使用也只能局限这条语句中了。

// 产生：引用总是在把对象作参数"传递"的过程中自动发生，不需要人为的产生，也不能人为的控制引用的产生。这个传递包括把对象作为函数的入口参数的情况，
// 也包括用"＝"进行对象赋值的时候。

// 范围：只有局部的引用，没有局部的对象。引用在Java语言的体现就是变量，而变量在Java语言中是有范围的，可以是局部的，也可以是全局的。
// 生存期：程序只能控制引用的生存周期。对象的生存期是由Java控制。用"new Object()"语句生成一个新的对象，是在计算机的内存中声明一块区域存储对象，
// 只有Java的垃圾收集器才能决定在适当的时候回收对象占用的内存。
// 没有办法阻止对引用的改动。