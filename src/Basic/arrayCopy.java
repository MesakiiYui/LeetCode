package Basic;

/**
 * Created by tiejin on 7/25/2018.
 */

//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//        代码解释:
//        　　Object src : 原数组
//        int srcPos : 从元数据的起始位置开始
//        　　Object dest : 目标数组
//        　　int destPos : 目标数组的开始起始位置
//        　　int length  : 要copy的数组的长度
//        比如 ：我们有一个数组数据 byte[]  srcBytes = new byte[]{2,4,0,0,0,0,0,10,15,50};  // 源数组
//
//        byte[] destBytes = new byte[5]; // 目标数组
//
//        我们使用System.arraycopy进行转换(copy)
//
//        System.arrayCopy(srcBytes,0,destBytes ,0,5)
//        上面这段代码就是 : 创建一个一维空数组,数组的总长度为 12位,然后将srcBytes源数组中 从0位 到 第5位之间的数值 copy 到 destBytes目标数组中,在目标数组的第0位开始放置.
//        那么这行代码的运行效果应该是 2,4,0,0,0,


//2、clone 的用法:
//java.lang.Object类的clone()方法为protected类型，不可直接调用，需要先对要克隆的类进行下列操作：
//首先被克隆的类实现Cloneable接口；然后在该类中覆盖clone()方法，并且在该clone()方法中调用super.clone()；
// 这样，super.clone()便可以调用java.lang.Object类的clone()方法。
class Obj {
    String str = "init value";
    public String toString() {
        return str;
    }
}

public class arrayCopy implements Cloneable{
    private static void copy(int[] arr1, int[] arr2){
        System.arraycopy(arr1, 2, arr2, 0, 2);
    }
    //2.clone
    Obj aObj = new Obj();
    int aInt = 11;

    //修改引用类型
    public void changeObj(Obj inObj) {
        inObj.str = "changed value";
    }

    //修改基本类型
    public void changePri(int inInt) {
        inInt = 22;
    }
    public static void main(String[] args)throws Exception{
        int[] arr1= new int[]{1,2,3,4,5};
        int[] arr2= new int[]{11,12,13,14,15};
        copy(arr1, arr2);
        for(int i : arr2){
            System.out.print(i+""+",");
        }

        arrayCopy oRef = new arrayCopy();
        System.out.println("==================value transmit==========================");
        System.out.println("Before call changeObj() method: " + oRef.aObj);
        oRef.changeObj(oRef.aObj);//把对象作为输入参数, changeObj()方法真正的把输入的参数改变了
        System.out.println("After call changeObj() method: " + oRef.aObj);
        System.out.println("==================object transmit===========================");
        System.out.println("Before call changePri() method: " + oRef.aInt);
        oRef.changePri(oRef.aInt);//把 Java中的基本类型int作为输入参数,changePri()方法对输入的参数没有任何的改变。
        System.out.println("After call changePri() method: " + oRef.aInt);
        System.out.println("==================object.clone() transmit==========================");
        System.out.println("Before call changeObj() method: " + oRef.aObj);
        oRef.changeObj(((arrayCopy) oRef.clone()).aObj);
        System.out.println("After call changeObj() method: " + oRef.aObj);
// 从这个例子知道Java对对象和基本的数据类型的处理是不一样的。和C语言一样，当把Java的基本数据类型（如int，char，double等）
// 作为 入口参数传给函数体的时候，传入的参数在函数体内部变成了局部变量，这个局部变量是输入参数的一个拷贝，
// 所有的函数体内部的操作都是针对这个拷贝的操作， 函数执行结束后，这个局部变量也就完成了它的使命，它影响不到作为输入参数的变量。
// 这种方式的参数传递被称为"值传递"。而在Java中用对象的作为入口 参数的传递则缺省为"引用传递"，也就是说仅仅传递了对象的一个"引用"，
// 这个"引用"的概念同C语言中的指针引用是一样的。当函数体内部对输入变量改变 时，实质上就是在对这个对象的直接操作。
// 除了在函数传值的时候是"引用传递"，在任何用"＝"向对象变量赋值的时候都是"引用传递"。
    }
    

}
