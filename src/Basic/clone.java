package Basic;

/**
 * Created by tiejin on 7/25/2018.
 */

// java中的clone
// 在实际编程过程中，我们常常要遇到这种情况：有一个对象A，在某一时刻A中已经包含了一些有效值，此时可能会需要一个和A完全相同新对象B，
// 并且此后对B 任何改动都不会影响到A中的值，也就是说，A与B是两个独立的对象，但B的初始值是由A对象确定的。
// 在Java语言中，用简单的赋值语句是不能满足这种需 求的。要满足这种需求虽然有很多途径，但实现clone（）方法是其中最简单，也是最高效的手段。

// Java的所有类都默认继承java.lang.Object类，在java.lang.Object类中有一个方法clone()。
// JDK API的说明文档解释这个方法将返回Object对象的一个拷贝。
// 要说明的有两点：
// 一是拷贝对象返回的是一个新对象，而不是一个引用。
// 二是拷贝对象与用 new操作符返回的新对象的区别就是这个拷贝已经包含了一些原来对象的信息，而不是对象的初始信息。
// 举例：

//public class clone implements Cloneable{
//    public int aInt;
//    public Object clone(){
//        clone o = null;
//        try{
//            o = (clone)super.clone();
//        }catch(CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return o;
//    }
//
//}

// 有三个值得注意的地方，
// 一是希望能实现clone功能的CloneClass类实现了Cloneable接口，这个接口属于java.lang包，
// java.lang包已经被缺省的导入类中，所以不需要写成java.lang.Cloneable。

// 另一个值得请注意的是重载了clone()方法。最 后在clone()方法中调用了super.clone()，这也意味着无论clone类的继承结构是什么样的，
// super.clone()直接或间接调 用了java.lang.Object类的clone()方法。下面再详细的解释一下这几点。
// 应该说第三点是最重要的，仔细观察一下Object类的clone()一个native方法，native方法的效率一般来说都是远高于java中的非 native方法。
// 这也解释了为什么要用Object中clone()方法而不是先new一个类，然后把原始对象中的信息赋到新对象中，虽然这也实现了 clone功能。
// 对于第二点，也要观察Object类中的clone()还是一个protected属性的方法。这也意味着如果要应用clone()方 法，必须继承Object类，
// 在Java中所有的类是缺省继承Object类的，也就不用关心这点了。然后重载clone()方法。还有一点要考虑的是为 了让其它类能调用这个clone类的clone()方法，
// 重载之后要把clone()方法的属性设置为public。
// 那么clone类为什么还要实现Cloneable接口呢？稍微注意一下，Cloneable接口是不包含任何方法的！其实这个接口仅仅是一个标志，
// 而且 这个标志也仅仅是针对Object类中clone()方法的，如果clone类没有实现Cloneable接口，并调用了Object的clone()方法（也就是调用了super.Clone()方法），
// 那么Object的clone()方法就会抛出 CloneNotSupportedException异常。
// 以上是clone的最基本的步骤，想要完成一个成功的clone，还要了解什么是"影子clone"和"深度clone"。
